package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1360jF implements XD {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14919a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14920b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CG f14921c;

    /* renamed from: d, reason: collision with root package name */
    public C0874aH f14922d;

    /* renamed from: e, reason: collision with root package name */
    public C1032dB f14923e;

    /* renamed from: f, reason: collision with root package name */
    public MC f14924f;

    /* renamed from: g, reason: collision with root package name */
    public XD f14925g;

    /* renamed from: h, reason: collision with root package name */
    public WK f14926h;
    public C1897tD i;

    /* renamed from: j, reason: collision with root package name */
    public MC f14927j;

    /* renamed from: k, reason: collision with root package name */
    public XD f14928k;

    public C1360jF(Context context, CG cg) {
        this.f14919a = context.getApplicationContext();
        this.f14921c = cg;
    }

    public static final void e(XD xd, InterfaceC1958uK interfaceC1958uK) {
        if (xd != null) {
            xd.c(interfaceC1958uK);
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) {
        AbstractC0582Jp.h0(this.f14928k == null);
        Uri uri = te.f11361a;
        String scheme = uri.getScheme();
        String str = Vt.f12096a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f14919a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f14922d == null) {
                    C0874aH c0874aH = new C0874aH(false);
                    this.f14922d = c0874aH;
                    b(c0874aH);
                }
                this.f14928k = this.f14922d;
            } else {
                if (this.f14923e == null) {
                    C1032dB c1032dB = new C1032dB(context);
                    this.f14923e = c1032dB;
                    b(c1032dB);
                }
                this.f14928k = this.f14923e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f14923e == null) {
                C1032dB c1032dB2 = new C1032dB(context);
                this.f14923e = c1032dB2;
                b(c1032dB2);
            }
            this.f14928k = this.f14923e;
        } else if ("content".equals(scheme)) {
            if (this.f14924f == null) {
                MC mc = new MC(context, 0);
                this.f14924f = mc;
                b(mc);
            }
            this.f14928k = this.f14924f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            CG cg = this.f14921c;
            if (zEquals) {
                if (this.f14925g == null) {
                    try {
                        XD xd = (XD) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f14925g = xd;
                        b(xd);
                    } catch (ClassNotFoundException unused) {
                        AbstractC2022vd.v("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e6) {
                        throw new RuntimeException("Error instantiating RTMP extension", e6);
                    }
                    if (this.f14925g == null) {
                        this.f14925g = cg;
                    }
                }
                this.f14928k = this.f14925g;
            } else if ("udp".equals(scheme)) {
                if (this.f14926h == null) {
                    WK wk = new WK();
                    this.f14926h = wk;
                    b(wk);
                }
                this.f14928k = this.f14926h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    C1897tD c1897tD = new C1897tD(false);
                    this.i = c1897tD;
                    b(c1897tD);
                }
                this.f14928k = this.i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f14927j == null) {
                    MC mc2 = new MC(context, 1);
                    this.f14927j = mc2;
                    b(mc2);
                }
                this.f14928k = this.f14927j;
            } else {
                this.f14928k = cg;
            }
        }
        return this.f14928k.a(te);
    }

    public final void b(XD xd) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f14920b;
            if (i >= arrayList.size()) {
                return;
            }
            xd.c((InterfaceC1958uK) arrayList.get(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void c(InterfaceC1958uK interfaceC1958uK) {
        interfaceC1958uK.getClass();
        this.f14921c.c(interfaceC1958uK);
        this.f14920b.add(interfaceC1958uK);
        e(this.f14922d, interfaceC1958uK);
        e(this.f14923e, interfaceC1958uK);
        e(this.f14924f, interfaceC1958uK);
        e(this.f14925g, interfaceC1958uK);
        e(this.f14926h, interfaceC1958uK);
        e(this.i, interfaceC1958uK);
        e(this.f14927j, interfaceC1958uK);
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) {
        XD xd = this.f14928k;
        xd.getClass();
        return xd.d(i, i3, bArr);
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        XD xd = this.f14928k;
        if (xd == null) {
            return null;
        }
        return xd.f();
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Map h() {
        XD xd = this.f14928k;
        return xd == null ? Collections.EMPTY_MAP : xd.h();
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        XD xd = this.f14928k;
        if (xd != null) {
            try {
                xd.m();
            } finally {
                this.f14928k = null;
            }
        }
    }
}
