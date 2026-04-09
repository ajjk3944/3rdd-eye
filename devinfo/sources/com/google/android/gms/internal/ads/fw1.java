package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fw1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11272a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f11273b;

    public fw1(Context context) {
        this.f11272a = context == null ? null : context.getApplicationContext();
    }

    public final hv1 a(p50 p50Var, mx1 mx1Var) {
        int i4;
        boolean zBooleanValue;
        mx1Var.getClass();
        p50Var.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || (i4 = mx1Var.F) == -1) {
            return hv1.f11989d;
        }
        Boolean bool = this.f11273b;
        boolean z3 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = this.f11272a;
            if (context != null) {
                String parameters = jz.d(context).getParameters("offloadVariableRateSupported");
                this.f11273b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f11273b = Boolean.FALSE;
            }
            zBooleanValue = this.f11273b.booleanValue();
        }
        String str = mx1Var.f14052m;
        str.getClass();
        int iG = ia.g(str, mx1Var.j);
        if (iG == 0 || i10 < bq0.c(iG)) {
            return hv1.f11989d;
        }
        int iB = bq0.b(mx1Var.E);
        if (iB == 0) {
            return hv1.f11989d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i4).setChannelMask(iB).setEncoding(iG).build();
            if (i10 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, p50Var.a())) {
                    return hv1.f11989d;
                }
                j5 j5Var = new j5();
                j5Var.f12633a = true;
                j5Var.f12635c = zBooleanValue;
                return j5Var.b();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, p50Var.a());
            if (playbackOffloadSupport == 0) {
                return hv1.f11989d;
            }
            j5 j5Var2 = new j5();
            if (i10 > 32 && playbackOffloadSupport == 2) {
                z3 = true;
            }
            j5Var2.f12633a = true;
            j5Var2.f12634b = z3;
            j5Var2.f12635c = zBooleanValue;
            return j5Var2.b();
        } catch (IllegalArgumentException unused) {
            return hv1.f11989d;
        }
    }
}
