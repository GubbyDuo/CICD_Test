package io.nology.mexicospringcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
	
	@GetMapping("/rectangle/area/{height}/{width}")
	public int rectangleArea(@PathVariable int height, @PathVariable int width) {
		return height * width;		
	}
	@GetMapping("/rectangle/perimeter/{height}/{width}")
	public int rectanglePerimeter(@PathVariable int height, @PathVariable int width) {
		return height * 2 + width * 2;		
	}
	@GetMapping("/circle/perimeter/{radius}")
	public double circlePerimeter(@PathVariable int radius) {
		return 2 * Math.PI * radius;		
	}
}
