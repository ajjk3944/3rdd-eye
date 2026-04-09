package I2;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f1890c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f1891d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f1892a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f1893b;

    public a(Context context) {
        this.f1893b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f1892a;
        reentrantLock.lock();
        try {
            return this.f1893b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
