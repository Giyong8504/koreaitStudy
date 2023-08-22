# AOP 프로그래밍
(Aspect Oriented Programming)
spring-aop API
aspectjweaver

## 1. 프록시(proxy)

팩토리얼 연산
factorial
    !5 -> 5 * 4 * 3 * 2 * 1

### 참고) BufferedInputStream

```
class BufferedInputStream extends InputStream {

	private InputStream in;
	
	public BufferedInputStream(InputStream in) {
		this.in = in;
	}
	
	public int read() {
		
		// 버퍼 기능 관련 코드...  - 추가 공통 기능 
		
		int ch = in.read(); // 핵심 기능 
		
		// 버퍼 기능 관련 코드... - 추가 공통 기능 
		
		return ch;
	}
}
```

<br>

## 2. AOP
1) @Aspect
2) @Pointcut
    - execution 명시자

3) @Around

3. @Order

4. 프록시 생성방식
5. @Around의 Pointcut 설정과 @Pointcut 재사용