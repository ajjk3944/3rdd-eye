package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jd1 {
    public static volatile float c = -1.0f;
    public static volatile long d;
    public static final Object e = new Object();
    public boolean a;
    public float b;

    public static float b(Context context) {
        iz1 iz1Var = mz1.Ie;
        tw1 tw1Var = tw1.e;
        float f = 0.0f;
        if (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
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
        hg4 hg4Var = hg4.C;
        hg4Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jIntValue = ((Integer) tw1Var.c.a(mz1.Je)).intValue();
        if (c != -1.0f && jCurrentTimeMillis - d < jIntValue) {
            return c;
        }
        synchronized (e) {
            try {
                hg4Var.k.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (c != -1.0f && jCurrentTimeMillis2 - d < jIntValue) {
                    return c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    c = 0.0f;
                    d = jCurrentTimeMillis2;
                    return 0.0f;
                }
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                int streamVolume2 = audioManager2.getStreamVolume(3);
                if (streamMaxVolume2 != 0) {
                    f = streamVolume2 / streamMaxVolume2;
                }
                c = f;
                d = jCurrentTimeMillis2;
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized float a() {
        synchronized (this) {
            float f = this.b;
            if (f >= 0.0f) {
                return f;
            }
            return 1.0f;
        }
    }
}
