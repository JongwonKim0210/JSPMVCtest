package board.command;

//필요 클래스 임포트
import javax.servlet.http.*;

//인터페이스
public interface BoardCmd {
	
	//각 커맨드 클래스 기능에 맞게 execute() 메서드 구현
	public void execute(HttpServletRequest request,
						HttpServletResponse response);
	
}