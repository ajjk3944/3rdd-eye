package ya;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.sk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile float f37389c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public static volatile long f37390d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f37391e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f37392a;

    /* renamed from: b, reason: collision with root package name */
    public float f37393b;

    public static float e(Context context) {
        pk pkVar = sk.f16359uf;
        va.s sVar = va.s.f36163e;
        float f10 = 0.0f;
        if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return 0.0f;
            }
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume == 0) {
                return 0.0f;
            }
            return streamVolume / streamMaxVolume;
        }
        ua.j jVar = ua.j.C;
        jVar.f35267k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jIntValue = ((Integer) sVar.f36166c.a(sk.f16375vf)).intValue();
        if (f37389c != -1.0f && jCurrentTimeMillis - f37390d < jIntValue) {
            return f37389c;
        }
        synchronized (f37391e) {
            try {
                jVar.f35267k.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (f37389c != -1.0f && jCurrentTimeMillis2 - f37390d < jIntValue) {
                    return f37389c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    f37389c = 0.0f;
                    f37390d = jCurrentTimeMillis2;
                    return 0.0f;
                }
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                int streamVolume2 = audioManager2.getStreamVolume(3);
                if (streamMaxVolume2 != 0) {
                    f10 = streamVolume2 / streamMaxVolume2;
                }
                f37389c = f10;
                f37390d = jCurrentTimeMillis2;
                return f37389c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void a(float f10) {
        this.f37393b = f10;
    }

    public final synchronized float b() {
        if (!f()) {
            return 1.0f;
        }
        return this.f37393b;
    }

    public final synchronized void c(boolean z3) {
        this.f37392a = z3;
    }

    public final synchronized boolean d() {
        return this.f37392a;
    }

    public final synchronized boolean f() {
        return this.f37393b >= 0.0f;
    }
}
