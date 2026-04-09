package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xb1 implements l91 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18346a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18347b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final pe1 f18348c;

    /* renamed from: d, reason: collision with root package name */
    public of1 f18349d;

    /* renamed from: e, reason: collision with root package name */
    public p31 f18350e;

    /* renamed from: f, reason: collision with root package name */
    public a71 f18351f;
    public l91 g;

    /* renamed from: h, reason: collision with root package name */
    public in1 f18352h;

    /* renamed from: i, reason: collision with root package name */
    public h81 f18353i;
    public a71 j;

    /* renamed from: k, reason: collision with root package name */
    public l91 f18354k;

    public xb1(Context context, pe1 pe1Var) {
        this.f18346a = context.getApplicationContext();
        this.f18348c = pe1Var;
    }

    public static final void e(l91 l91Var, hm1 hm1Var) {
        if (l91Var != null) {
            l91Var.b(hm1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Map A1() {
        l91 l91Var = this.f18354k;
        return l91Var == null ? Collections.EMPTY_MAP : l91Var.A1();
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) {
        mq0.c0(this.f18354k == null);
        Uri uri = gb1Var.f11479a;
        String scheme = uri.getScheme();
        String str = bq0.f9768a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f18346a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f18349d == null) {
                    of1 of1Var = new of1(false);
                    this.f18349d = of1Var;
                    c(of1Var);
                }
                this.f18354k = this.f18349d;
            } else {
                if (this.f18350e == null) {
                    p31 p31Var = new p31(context);
                    this.f18350e = p31Var;
                    c(p31Var);
                }
                this.f18354k = this.f18350e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f18350e == null) {
                p31 p31Var2 = new p31(context);
                this.f18350e = p31Var2;
                c(p31Var2);
            }
            this.f18354k = this.f18350e;
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            if (this.f18351f == null) {
                a71 a71Var = new a71(context, 0);
                this.f18351f = a71Var;
                c(a71Var);
            }
            this.f18354k = this.f18351f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            pe1 pe1Var = this.f18348c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        l91 l91Var = (l91) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = l91Var;
                        c(l91Var);
                    } catch (ClassNotFoundException unused) {
                        ls.t("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating RTMP extension", e2);
                    }
                    if (this.g == null) {
                        this.g = pe1Var;
                    }
                }
                this.f18354k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.f18352h == null) {
                    in1 in1Var = new in1();
                    this.f18352h = in1Var;
                    c(in1Var);
                }
                this.f18354k = this.f18352h;
            } else if ("data".equals(scheme)) {
                if (this.f18353i == null) {
                    h81 h81Var = new h81(false);
                    this.f18353i = h81Var;
                    c(h81Var);
                }
                this.f18354k = this.f18353i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    a71 a71Var2 = new a71(context, 1);
                    this.j = a71Var2;
                    c(a71Var2);
                }
                this.f18354k = this.j;
            } else {
                this.f18354k = pe1Var;
            }
        }
        return this.f18354k.a(gb1Var);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void b(hm1 hm1Var) {
        hm1Var.getClass();
        this.f18348c.b(hm1Var);
        this.f18347b.add(hm1Var);
        e(this.f18349d, hm1Var);
        e(this.f18350e, hm1Var);
        e(this.f18351f, hm1Var);
        e(this.g, hm1Var);
        e(this.f18352h, hm1Var);
        e(this.f18353i, hm1Var);
        e(this.j, hm1Var);
    }

    public final void c(l91 l91Var) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f18347b;
            if (i4 >= arrayList.size()) {
                return;
            }
            l91Var.b((hm1) arrayList.get(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) {
        l91 l91Var = this.f18354k;
        l91Var.getClass();
        return l91Var.d(i4, i10, bArr);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() {
        l91 l91Var = this.f18354k;
        if (l91Var != null) {
            try {
                l91Var.f();
            } finally {
                this.f18354k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        l91 l91Var = this.f18354k;
        if (l91Var == null) {
            return null;
        }
        return l91Var.zzc();
    }
}
