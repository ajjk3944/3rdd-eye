package wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f24404c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f24405d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f24406a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f24407b;

    public a(Context context) {
        this.f24407b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f24406a;
        reentrantLock.lock();
        try {
            return this.f24407b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
