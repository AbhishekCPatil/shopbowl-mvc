package in.ps.sb.service;

import java.util.List;

import in.ps.sb.entity.Product;

public interface ProductService {
	
	void addProduct(Product product);
	List<Product> getALlProducts();
	void deleteProduct(int productId);
	Product getProductById(int productId);

}
