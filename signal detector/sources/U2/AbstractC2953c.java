package u2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2953c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f23791a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC2952b("ClientDefault"));

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f23792b = Executors.newSingleThreadExecutor(new ThreadFactoryC2952b("ClientSingle"));
}
