package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import f4.InterfaceFutureC2326a;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import q2.C2841s;
import t2.C2909E;
import w0.C2968d;

/* renamed from: com.google.android.gms.internal.ads.yi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2189yi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17741a;

    /* renamed from: b, reason: collision with root package name */
    public final C2909E f17742b;

    /* renamed from: c, reason: collision with root package name */
    public final C0854Zp f17743c;

    /* renamed from: d, reason: collision with root package name */
    public final C0478Dn f17744d;

    /* renamed from: e, reason: collision with root package name */
    public final ID f17745e;

    /* renamed from: f, reason: collision with root package name */
    public final ID f17746f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f17747g;

    public C2189yi(Context context, C2909E c2909e, C0854Zp c0854Zp, C0478Dn c0478Dn, ID id, ID id2, ScheduledExecutorService scheduledExecutorService) {
        this.f17741a = context;
        this.f17742b = c2909e;
        this.f17743c = c0854Zp;
        this.f17744d = c0478Dn;
        this.f17745e = id;
        this.f17746f = id2;
        this.f17747g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) C2841s.f23267e.f23270c.a(H9.tb));
    }

    public final InterfaceFutureC2326a a(String str, Random random) {
        return TextUtils.isEmpty(str) ? AbstractC1984ut.e(str) : AbstractC1984ut.D(c(str, this.f17744d.f7838a, random), Throwable.class, new C0432Bb(this, str, 1), this.f17745e);
    }

    public final InterfaceFutureC2326a c(String str, MotionEvent motionEvent, Random random) {
        Exception exc;
        E9 e9;
        G9 g9;
        G9 g92;
        InterfaceFutureC2326a interfaceFutureC2326aW;
        try {
            e9 = H9.tb;
            C2841s c2841s = C2841s.f23267e;
            g9 = c2841s.f23270c;
            g92 = c2841s.f23270c;
        } catch (Exception e6) {
            e = e6;
        }
        try {
            if (!str.contains((CharSequence) g9.a(e9)) || this.f17742b.E()) {
                return AbstractC1984ut.e(str);
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) g92.a(H9.ub), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent == null) {
                try {
                    builderBuildUpon.appendQueryParameter((String) g92.a(H9.vb), "11");
                    return AbstractC1984ut.e(builderBuildUpon.toString());
                } catch (Exception e7) {
                    exc = e7;
                    return AbstractC1984ut.w(exc);
                }
            }
            C0854Zp c0854Zp = this.f17743c;
            c0854Zp.getClass();
            try {
                C2968d c2968dB = C2968d.b(c0854Zp.f12970b);
                c0854Zp.f12969a = c2968dB;
                interfaceFutureC2326aW = c2968dB == null ? AbstractC1984ut.w(new IllegalStateException("MeasurementManagerFutures is null")) : c2968dB.c();
            } catch (Exception e8) {
                interfaceFutureC2326aW = AbstractC1984ut.w(e8);
            }
            return AbstractC1984ut.D(AbstractC1984ut.F(AbstractC2221zD.r(interfaceFutureC2326aW), new C0450Cc((Object) this, (Object) builderBuildUpon, str, (Object) motionEvent, 1), this.f17746f), Throwable.class, new C0467Dc(this, 2, builderBuildUpon), this.f17745e);
        } catch (Exception e10) {
            e = e10;
            exc = e;
            return AbstractC1984ut.w(exc);
        }
    }
}
