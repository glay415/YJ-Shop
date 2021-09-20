package com.project.yjshop.service.board;

import com.project.yjshop.domain.board.Board;
import com.project.yjshop.security.auth.PrincipalDetails;
import com.project.yjshop.web.payload.request.board.BoardProductRequest;
import com.project.yjshop.web.payload.response.board.BoardProductResponse;
import org.springframework.validation.BindingResult;

import java.io.IOException;
import java.util.List;

public interface BoardService {
    BoardProductResponse posting(BoardProductRequest boardProductRequest,
                                 BindingResult bindingResult,
                                 PrincipalDetails principalDetails) throws IOException;
    BoardProductResponse deleting(Long boardId, PrincipalDetails principalDetails);
    List<Board> findAll();
}
