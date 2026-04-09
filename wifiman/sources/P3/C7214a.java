package p3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import s3.AbstractC7901p;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7214a {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f57537c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static C7214a f57538d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f57539a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f57540b;

    C7214a(Context context) {
        this.f57540b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C7214a a(Context context) {
        AbstractC7901p.l(context);
        Lock lock = f57537c;
        lock.lock();
        try {
            if (f57538d == null) {
                f57538d = new C7214a(context.getApplicationContext());
            }
            C7214a c7214a = f57538d;
            lock.unlock();
            return c7214a;
        } catch (Throwable th2) {
            f57537c.unlock();
            throw th2;
        }
    }

    private static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strC2) || (strC = c(d("googleSignInAccount", strC2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.u(strC);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected final String c(String str) {
        this.f57539a.lock();
        try {
            return this.f57540b.getString(str, null);
        } finally {
            this.f57539a.unlock();
        }
    }
}
