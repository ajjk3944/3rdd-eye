package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sx extends FrameLayout implements ox {

    /* renamed from: a, reason: collision with root package name */
    public final qz f16567a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f16568b;

    /* renamed from: c, reason: collision with root package name */
    public final View f16569c;

    /* renamed from: d, reason: collision with root package name */
    public final vk f16570d;

    /* renamed from: e, reason: collision with root package name */
    public final rx f16571e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16572f;
    public final px g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16573h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16574i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16575k;

    /* renamed from: l, reason: collision with root package name */
    public long f16576l;

    /* renamed from: m, reason: collision with root package name */
    public long f16577m;

    /* renamed from: n, reason: collision with root package name */
    public String f16578n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f16579o;

    /* renamed from: p, reason: collision with root package name */
    public Bitmap f16580p;

    /* renamed from: q, reason: collision with root package name */
    public final ImageView f16581q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16582r;

    public sx(Context context, qz qzVar, int i4, boolean z3, vk vkVar, yx yxVar, qd0 qd0Var) {
        px nxVar;
        px kzVar;
        super(context);
        this.f16567a = qzVar;
        this.f16570d = vkVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16568b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        pb.y.h(qzVar.D1());
        Object obj = qzVar.D1().f28442b;
        zx zxVar = new zx(context, qzVar.J1(), qzVar.F1(), vkVar, qzVar.C1());
        if (i4 == 3) {
            kzVar = new kz(context, zxVar);
        } else {
            if (i4 == 2) {
                qzVar.R().getClass();
                nxVar = new gy(context, zxVar, qzVar, z3, yxVar, qd0Var);
            } else {
                nxVar = new nx(context, qzVar, z3, qzVar.R().b(), new zx(context, qzVar.J1(), qzVar.F1(), vkVar, qzVar.C1()), qd0Var);
            }
            kzVar = nxVar;
        }
        this.g = kzVar;
        View view = new View(context);
        this.f16569c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(kzVar, new FrameLayout.LayoutParams(-1, -1, 17));
        pk pkVar = sk.f16132g0;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) sVar.f36166c.a(sk.f16084d0)).booleanValue()) {
            a();
        }
        this.f16581q = new ImageView(context);
        this.f16572f = ((Long) sVar.f36166c.a(sk.f16162i0)).longValue();
        boolean zBooleanValue = ((Boolean) sVar.f36166c.a(sk.f16116f0)).booleanValue();
        this.f16575k = zBooleanValue;
        vkVar.c("spinner_used", true != zBooleanValue ? "0" : "1");
        this.f16571e = new rx(this);
        kzVar.e(this);
    }

    public final void a() {
        px pxVar = this.g;
        if (pxVar == null) {
            return;
        }
        TextView textView = new TextView(pxVar.getContext());
        Resources resourcesE = ua.j.C.f35265h.e();
        textView.setText(String.valueOf(resourcesE == null ? "AdMob - " : resourcesE.getString(R.string.watermark_label_prefix)).concat(pxVar.d()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f16568b;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        px pxVar = this.g;
        if (pxVar == null) {
            return;
        }
        long jP = pxVar.p();
        if (this.f16576l == jP || jP <= 0) {
            return;
        }
        float f10 = jP / 1000.0f;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16237n2)).booleanValue()) {
            String strValueOf = String.valueOf(f10);
            String strValueOf2 = String.valueOf(pxVar.w());
            String strValueOf3 = String.valueOf(pxVar.v());
            String strValueOf4 = String.valueOf(pxVar.u());
            String strValueOf5 = String.valueOf(pxVar.x());
            ua.j.C.f35267k.getClass();
            c("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f10));
        }
        this.f16576l = jP;
    }

    public final void c(String str, String... strArr) {
        HashMap map = new HashMap();
        px pxVar = this.g;
        Integer numY = pxVar != null ? pxVar.y() : null;
        if (numY != null) {
            map.put("playerId", numY.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f16567a.a("onVideoEvent", map);
    }

    public final void d() {
        qz qzVar = this.f16567a;
        if (qzVar.A1() == null || !this.f16574i || this.j) {
            return;
        }
        qzVar.A1().getWindow().clearFlags(128);
        this.f16574i = false;
    }

    public final void e() {
        px pxVar = this.g;
        if (pxVar != null && this.f16577m == 0) {
            c("canplaythrough", "duration", String.valueOf(pxVar.o() / 1000.0f), "videoWidth", String.valueOf(pxVar.s()), "videoHeight", String.valueOf(pxVar.t()));
        }
    }

    public final void f() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16268p2)).booleanValue()) {
            rx rxVar = this.f16571e;
            rxVar.f15781c = false;
            ya.b0 b0Var = ya.f0.f37440l;
            b0Var.removeCallbacks(rxVar);
            b0Var.postDelayed(rxVar, 250L);
        }
        qz qzVar = this.f16567a;
        if (qzVar.A1() != null && !this.f16574i) {
            boolean z3 = (qzVar.A1().getWindow().getAttributes().flags & 128) != 0;
            this.j = z3;
            if (!z3) {
                qzVar.A1().getWindow().addFlags(128);
                this.f16574i = true;
            }
        }
        this.f16573h = true;
    }

    public final void finalize() throws Throwable {
        try {
            this.f16571e.a();
            px pxVar = this.g;
            if (pxVar != null) {
                fx.f11279f.execute(new s(18, pxVar));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        c("pause", new String[0]);
        d();
        this.f16573h = false;
    }

    public final void h() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16268p2)).booleanValue()) {
            this.f16571e.a();
        }
        c("ended", new String[0]);
        d();
    }

    public final void i() {
        if (this.f16582r && this.f16580p != null) {
            ImageView imageView = this.f16581q;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.f16580p);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.f16568b;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f16571e.a();
        this.f16577m = this.f16576l;
        ya.f0.f37440l.post(new qx(this, 1));
    }

    public final void j(int i4, int i10) {
        if (this.f16575k) {
            pk pkVar = sk.f16147h0;
            va.s sVar = va.s.f36163e;
            int iMax = Math.max(i4 / ((Integer) sVar.f36166c.a(pkVar)).intValue(), 1);
            int iMax2 = Math.max(i10 / ((Integer) sVar.f36166c.a(pkVar)).intValue(), 1);
            Bitmap bitmap = this.f16580p;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f16580p.getHeight() == iMax2) {
                return;
            }
            this.f16580p = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f16582r = false;
        }
    }

    public final void k() {
        this.f16569c.setVisibility(4);
        ya.f0.f37440l.post(new qx(this, 2));
    }

    public final void l(int i4, int i10, int i11, int i12) {
        if (ya.a0.o()) {
            int length = String.valueOf(i4).length();
            StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(i10).length() + 3 + String.valueOf(i11).length() + 3 + String.valueOf(i12).length());
            r5.c.q(i4, i10, "Set video bounds to x:", ";y:", sb2);
            sb2.append(";w:");
            sb2.append(i11);
            sb2.append(";h:");
            sb2.append(i12);
            ya.a0.m(sb2.toString());
        }
        if (i11 == 0 || i12 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12);
        layoutParams.setMargins(i4, i10, 0, 0);
        this.f16568b.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        rx rxVar = this.f16571e;
        if (z3) {
            rxVar.f15781c = false;
            ya.b0 b0Var = ya.f0.f37440l;
            b0Var.removeCallbacks(rxVar);
            b0Var.postDelayed(rxVar, 250L);
        } else {
            rxVar.a();
            this.f16577m = this.f16576l;
        }
        ya.f0.f37440l.post(new rx(this, z3, 1));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        boolean z3 = false;
        rx rxVar = this.f16571e;
        if (i4 == 0) {
            rxVar.f15781c = false;
            ya.b0 b0Var = ya.f0.f37440l;
            b0Var.removeCallbacks(rxVar);
            b0Var.postDelayed(rxVar, 250L);
            z3 = true;
        } else {
            rxVar.a();
            this.f16577m = this.f16576l;
        }
        ya.f0.f37440l.post(new rx(this, z3, 0));
    }
}
