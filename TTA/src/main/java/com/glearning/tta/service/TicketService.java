package com.glearning.tta.service;

import java.util.List;

import com.glearning.tta.entity.Ticket;

public interface TicketService {

	List<Ticket> listOfTickets();

	Ticket saveTicket(Ticket ticket);

	//for search bar

		List<Ticket> getByKeyword(String keyword);
		

	// Edit - Start
	Ticket editTicket(Ticket ticket);

	Ticket getTicketById(Long id);
	//Edit- End
	
	
	
	void deleteTicketById(Long id);
}
