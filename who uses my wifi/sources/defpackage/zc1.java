package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zc1 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;
    public final Object c;

    public zc1() {
        this.a = 2;
        this.c = Executors.defaultThreadFactory();
        this.b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                int andIncrement = this.b.getAndIncrement();
                int length = String.valueOf(andIncrement).length();
                String str = (String) this.c;
                StringBuilder sb = new StringBuilder(ga1.i(str, 12, length));
                sb.append("AdWorker(");
                sb.append(str);
                sb.append(") #");
                sb.append(andIncrement);
                return new Thread(runnable, sb.toString());
            case 1:
                int andIncrement2 = this.b.getAndIncrement();
                int length2 = String.valueOf(andIncrement2).length();
                String str2 = (String) this.c;
                StringBuilder sb2 = new StringBuilder(ga1.i(str2, 12, length2));
                sb2.append("AdWorker(");
                sb2.append(str2);
                sb2.append(") #");
                sb2.append(andIncrement2);
                return new Thread(runnable, sb2.toString());
            default:
                Thread threadNewThread = ((ThreadFactory) this.c).newThread(runnable);
                int andIncrement3 = this.b.getAndIncrement();
                StringBuilder sb3 = new StringBuilder(String.valueOf(andIncrement3).length() + 5);
                sb3.append("gads-");
                sb3.append(andIncrement3);
                threadNewThread.setName(sb3.toString());
                return threadNewThread;
        }
    }

    public zc1(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = str;
                this.b = new AtomicInteger(1);
                break;
            default:
                this.c = str;
                this.b = new AtomicInteger(1);
                break;
        }
    }
}
