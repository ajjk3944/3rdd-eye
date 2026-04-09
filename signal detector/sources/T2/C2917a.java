package t2;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H9;
import q2.C2841s;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2917a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile float f23588c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public static volatile long f23589d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f23590e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f23591a;

    /* renamed from: b, reason: collision with root package name */
    public float f23592b;

    public static float e(Context context) {
        E9 e9 = H9.sf;
        C2841s c2841s = C2841s.f23267e;
        float f2 = 0.0f;
        if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
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
        p2.j jVar = p2.j.f22785C;
        jVar.f22797k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jIntValue = ((Integer) c2841s.f23270c.a(H9.tf)).intValue();
        if (f23588c != -1.0f && jCurrentTimeMillis - f23589d < jIntValue) {
            return f23588c;
        }
        synchronized (f23590e) {
            try {
                jVar.f22797k.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (f23588c != -1.0f && jCurrentTimeMillis2 - f23589d < jIntValue) {
                    return f23588c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    f23588c = 0.0f;
                    f23589d = jCurrentTimeMillis2;
                    return 0.0f;
                }
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                int streamVolume2 = audioManager2.getStreamVolume(3);
                if (streamMaxVolume2 != 0) {
                    f2 = streamVolume2 / streamMaxVolume2;
                }
                f23588c = f2;
                f23589d = jCurrentTimeMillis2;
                return f23588c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void a(float f2) {
        this.f23592b = f2;
    }

    public final synchronized float b() {
        if (!f()) {
            return 1.0f;
        }
        return this.f23592b;
    }

    public final synchronized void c(boolean z6) {
        this.f23591a = z6;
    }

    public final synchronized boolean d() {
        return this.f23591a;
    }

    public final synchronized boolean f() {
        return this.f23592b >= 0.0f;
    }
}
