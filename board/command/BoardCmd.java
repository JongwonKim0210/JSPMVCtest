package board.command;

//�ʿ� Ŭ���� ����Ʈ
import javax.servlet.http.*;

//�������̽�
public interface BoardCmd {
	
	//�� Ŀ�ǵ� Ŭ���� ��ɿ� �°� execute() �޼��� ����
	public void execute(HttpServletRequest request,
						HttpServletResponse response);
	
}