package board.command;

import javax.servlet.http.*;

import board.model.*;

public class BoardUpdateCmd implements BoardCmd {
	
	public void execute(HttpServletRequest request, HttpServletResponse response){
		
		String inputNum = request.getParameter("num");
		String inputName = request.getParameter("name");
		String inputSubject = request.getParameter("subject");
		String inputContent = request.getParameter("content");
		String inputPassword = request.getParameter("password");
		
		BoardDAO dao = new BoardDAO();
		dao.boardUpdate(inputNum, inputSubject, inputContent, inputName, inputPassword);
	}
}
