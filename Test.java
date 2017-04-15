
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		/*LoadingCache<Long, AtomicLong> counter =
		        CacheBuilder.newBuilder()
		                .expireAfterWrite(2, TimeUnit.SECONDS)
		                .build(new CacheLoader<Long, AtomicLong>() {
		                    @Override
		                    public AtomicLong load(Long seconds) throws Exception {
		                        return new AtomicLong(0);
		                    }
		                });
		long limit = 1000;
		while(true) {
		    //得到当前秒
		    long currentSeconds = System.currentTimeMillis() / 1000;
		    if(counter.get(currentSeconds).incrementAndGet() > limit) {
		        System.out.println("限流了:" + currentSeconds);
		        continue;
		    }
		    //业务处理
		}*/
		
		
	}

}
