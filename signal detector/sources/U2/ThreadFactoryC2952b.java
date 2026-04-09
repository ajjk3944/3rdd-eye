package u2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o4.AbstractC2763b;

/* renamed from: u2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC2952b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f23789a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23790b;

    public ThreadFactoryC2952b(String str) {
        this.f23790b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f23789a.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f23790b;
        StringBuilder sb = new StringBuilder(AbstractC2763b.b(12, length, str));
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
