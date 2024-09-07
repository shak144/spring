package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        예제는 이미 수동으로 등록을 하고 있으므로 필터로 예외 처리
//        , 기존 예제 코드를 최대한 남기고 유지하기 위해서 이 방법을 선택했다
        basePackages = "hello.core", //지정안할시 package ComponentScan 위치 루트 위치에 두는게 좋다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
