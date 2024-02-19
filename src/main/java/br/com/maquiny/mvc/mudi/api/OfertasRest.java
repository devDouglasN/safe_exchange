package br.com.maquiny.mvc.mudi.api;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maquiny.mvc.mudi.dto.RequisicaoNovaOferta;
import br.com.maquiny.mvc.mudi.model.Oferta;
import br.com.maquiny.mvc.mudi.model.Pedido;
import br.com.maquiny.mvc.mudi.repository.OfertaRepository;
import br.com.maquiny.mvc.mudi.repository.PedidoRepository;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/api/ofertas")
public class OfertasRest {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private OfertaRepository  ofertaRepository;
	
	@PostMapping
	@Transactional
	public Oferta criaOferta(@Valid @RequestBody RequisicaoNovaOferta requisicao) {
		
		Optional<Pedido> pedidoBuscado =  pedidoRepository.findById(requisicao.getPedidoId());
	    if(!pedidoBuscado.isPresent()) {
	        throw new RuntimeException("Pedido não encontrado");
	    }
	    
	    Pedido pedido = pedidoBuscado.get();
	    pedido.getOfertas().size();
	    
	    Oferta nova = requisicao.toOferta();
	    nova.setPedido(pedido);
	    pedido.getOfertas().add(nova);
	    ofertaRepository.save(nova);
	    
	    return nova;
	}
}
