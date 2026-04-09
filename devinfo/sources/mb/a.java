package mb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f29020c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f29021d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f29022a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f29023b;

    public a(Context context) {
        this.f29023b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f29022a;
        reentrantLock.lock();
        try {
            return this.f29023b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
