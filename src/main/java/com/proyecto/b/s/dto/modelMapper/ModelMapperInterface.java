package com.proyecto.b.s.dto.modelMapper;

import com.proyecto.b.s.dto.request.*;
import com.proyecto.b.s.dto.request.eventRequestDTO.EventOptionForEventRequestDTO;
import com.proyecto.b.s.dto.request.eventRequestDTO.EventRequestDTO;
import com.proyecto.b.s.dto.response.*;
import com.proyecto.b.s.dto.response.eventResponseDTO.EventOptionForEventResponseDTO;
import com.proyecto.b.s.entity.*;

public interface ModelMapperInterface {
    Person personReqDtoToPerson(PersonRequestDTO personRequestDto);


    Person personUpdateReqDtoToPerson(PersonUpdateRequestDTO personRequestDto);

    PersonResponseDTO personToPersonResponseDTO(Person person);

    Search searchReqDtoToSearch(SearchRequestDTO searchRequestDto);
    SearchResponseDTO searchToSearchResponseDTO(Search search);

    Interview interviewSaveRequestDtoToInterview(InterviewRequestDTO interviewRequestDTO);

    InterviewResponseDTO interviewToInterviewResponseDto(Interview interview);

    Event eventSaveRequestDtoToEvent(EventRequestDTO eventRequestDTO);

    EventResponseDTO eventToEventResponseDto(Event event);

    EventOption eventOptionRequestDtoToEventOption(EventOptionForEventRequestDTO eventRequestDTO);

   EventOptionForEventResponseDTO eventOptionToEvenOptionResponseDto(EventOption event);

}
