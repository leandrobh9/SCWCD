package cap13;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class WrapperRequest extends HttpServletRequestWrapper {

	public WrapperRequest(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getRequestURI() {
		return "/opweb/.." + super.getRequestURI();
	}
}
