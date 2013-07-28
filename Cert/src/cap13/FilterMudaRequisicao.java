package cap13;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(servletNames="requisicao")
public class FilterMudaRequisicao implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain fc) throws IOException, ServletException {
		
		System.out.println("filtrou");
		
		HttpServletRequest httpReq = (HttpServletRequest)req;
		
		WrapperRequest mudaRequisicaoWrapper = new WrapperRequest(httpReq);
		
		fc.doFilter(mudaRequisicaoWrapper, resp);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
