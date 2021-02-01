package com.alibaba.ttl.spi;

import com.alibaba.ttl.TtlUnwrap;
import edu.umd.cs.findbugs.annotations.NonNull;

/**
 * The TTL Wrapper interface for ttl enhanced classes by wrapper.
 * <p>
 * for example:
 * <ul>
 *     <li>{@link com.alibaba.ttl.TtlRunnable}</li>
 *     <li>{@link com.alibaba.ttl.TtlCallable}</li>
 *     <li>the executor wrappers from {@link com.alibaba.ttl.threadpool.TtlExecutors}</li>
 *     <li>{@link com.alibaba.ttl.threadpool.DisableInheritableThreadFactory}</li>
 * </ul>
 *
 * @author Jerry Lee (oldratlee at gmail dot com)
 * @see TtlEnhanced
 * @see TtlUnwrap#unwrap
 * @see com.alibaba.ttl.TtlCallable
 * @see com.alibaba.ttl.TtlRunnable
 * @see com.alibaba.ttl.threadpool.TtlExecutors
 * @see com.alibaba.ttl.threadpool.DisableInheritableThreadFactory
 * @see com.alibaba.ttl.threadpool.DisableInheritableForkJoinWorkerThreadFactory
 * @since 2.11.4
 */
public interface TtlWrapper<T> extends TtlEnhanced {
    /**
     * unwrap {@link TtlWrapper} to the original/underneath one.
     *
     * @see TtlUnwrap#unwrap(Object)
     */
    @NonNull
    T unwrap();
}
