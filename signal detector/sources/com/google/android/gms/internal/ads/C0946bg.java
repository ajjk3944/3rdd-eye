package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.apm.insight.R;
import java.util.HashMap;
import o4.AbstractC2763b;
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2911G;
import t2.HandlerC2908D;

/* renamed from: com.google.android.gms.internal.ads.bg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0946bg extends FrameLayout implements InterfaceC0810Xf {

    /* renamed from: C, reason: collision with root package name */
    public String[] f13408C;

    /* renamed from: D, reason: collision with root package name */
    public Bitmap f13409D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f13410E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f13411F;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0828Yg f13412a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f13413b;

    /* renamed from: c, reason: collision with root package name */
    public final View f13414c;

    /* renamed from: d, reason: collision with root package name */
    public final L9 f13415d;

    /* renamed from: e, reason: collision with root package name */
    public final RunnableC0891ag f13416e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13417f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0827Yf f13418g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13419h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13420j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13421k;

    /* renamed from: l, reason: collision with root package name */
    public long f13422l;

    /* renamed from: m, reason: collision with root package name */
    public long f13423m;

    /* renamed from: n, reason: collision with root package name */
    public String f13424n;

    public C0946bg(Context context, InterfaceC0828Yg interfaceC0828Yg, int i, boolean z6, L9 l9, C1272hg c1272hg, C0784Vn c0784Vn) {
        AbstractC0827Yf textureViewSurfaceTextureListenerC0793Wf;
        AbstractC0827Yf c0726Sg;
        super(context);
        this.f13412a = interfaceC0828Yg;
        this.f13415d = l9;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13413b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        M2.u.e(interfaceC0828Yg.k());
        Object obj = interfaceC0828Yg.k().f3875b;
        C1325ig c1325ig = new C1325ig(context, interfaceC0828Yg.r(), interfaceC0828Yg.n(), l9, interfaceC0828Yg.j());
        if (i == 3) {
            c0726Sg = new C0726Sg(context, c1325ig);
        } else {
            if (i == 2) {
                interfaceC0828Yg.d0().getClass();
                textureViewSurfaceTextureListenerC0793Wf = new TextureViewSurfaceTextureListenerC1648og(context, c1325ig, interfaceC0828Yg, z6, c1272hg, c0784Vn);
            } else {
                textureViewSurfaceTextureListenerC0793Wf = new TextureViewSurfaceTextureListenerC0793Wf(context, interfaceC0828Yg, z6, interfaceC0828Yg.d0().b(), new C1325ig(context, interfaceC0828Yg.r(), interfaceC0828Yg.n(), l9, interfaceC0828Yg.j()), c0784Vn);
            }
            c0726Sg = textureViewSurfaceTextureListenerC0793Wf;
        }
        this.f13418g = c0726Sg;
        View view = new View(context);
        this.f13414c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(c0726Sg, new FrameLayout.LayoutParams(-1, -1, 17));
        E9 e9 = H9.f8746g0;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) c2841s.f23270c.a(H9.f8727d0)).booleanValue()) {
            a();
        }
        this.f13410E = new ImageView(context);
        this.f13417f = ((Long) c2841s.f23270c.a(H9.f8758i0)).longValue();
        boolean zBooleanValue = ((Boolean) c2841s.f23270c.a(H9.f8741f0)).booleanValue();
        this.f13421k = zBooleanValue;
        l9.c("spinner_used", true != zBooleanValue ? "0" : "1");
        this.f13416e = new RunnableC0891ag(this);
        c0726Sg.e(this);
    }

    public final void a() {
        AbstractC0827Yf abstractC0827Yf = this.f13418g;
        if (abstractC0827Yf == null) {
            return;
        }
        TextView textView = new TextView(abstractC0827Yf.getContext());
        Resources resourcesE = p2.j.f22785C.f22795h.e();
        textView.setText(String.valueOf(resourcesE == null ? "AdMob - " : resourcesE.getString(R.string.watermark_label_prefix)).concat(abstractC0827Yf.d()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f13413b;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        AbstractC0827Yf abstractC0827Yf = this.f13418g;
        if (abstractC0827Yf == null) {
            return;
        }
        long jK = abstractC0827Yf.k();
        if (this.f13422l == jK || jK <= 0) {
            return;
        }
        float f2 = jK / 1000.0f;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8792n2)).booleanValue()) {
            String strValueOf = String.valueOf(f2);
            String strValueOf2 = String.valueOf(abstractC0827Yf.s());
            String strValueOf3 = String.valueOf(abstractC0827Yf.r());
            String strValueOf4 = String.valueOf(abstractC0827Yf.q());
            String strValueOf5 = String.valueOf(abstractC0827Yf.y());
            p2.j.f22785C.f22797k.getClass();
            c("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f2));
        }
        this.f13422l = jK;
    }

    public final void c(String str, String... strArr) {
        HashMap map = new HashMap();
        AbstractC0827Yf abstractC0827Yf = this.f13418g;
        Integer numZ = abstractC0827Yf != null ? abstractC0827Yf.z() : null;
        if (numZ != null) {
            map.put("playerId", numZ.toString());
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
        this.f13412a.a("onVideoEvent", map);
    }

    public final void d() {
        InterfaceC0828Yg interfaceC0828Yg = this.f13412a;
        if (interfaceC0828Yg.h() == null || !this.i || this.f13420j) {
            return;
        }
        interfaceC0828Yg.h().getWindow().clearFlags(128);
        this.i = false;
    }

    public final void e() {
        AbstractC0827Yf abstractC0827Yf = this.f13418g;
        if (abstractC0827Yf != null && this.f13423m == 0) {
            c("canplaythrough", "duration", String.valueOf(abstractC0827Yf.j() / 1000.0f), "videoWidth", String.valueOf(abstractC0827Yf.o()), "videoHeight", String.valueOf(abstractC0827Yf.p()));
        }
    }

    public final void f() {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8805p2)).booleanValue()) {
            RunnableC0891ag runnableC0891ag = this.f13416e;
            runnableC0891ag.f13158c = false;
            HandlerC2908D handlerC2908D = C2911G.f23576l;
            handlerC2908D.removeCallbacks(runnableC0891ag);
            handlerC2908D.postDelayed(runnableC0891ag, 250L);
        }
        InterfaceC0828Yg interfaceC0828Yg = this.f13412a;
        if (interfaceC0828Yg.h() != null && !this.i) {
            boolean z6 = (interfaceC0828Yg.h().getWindow().getAttributes().flags & 128) != 0;
            this.f13420j = z6;
            if (!z6) {
                interfaceC0828Yg.h().getWindow().addFlags(128);
                this.i = true;
            }
        }
        this.f13419h = true;
    }

    public final void finalize() throws Throwable {
        try {
            this.f13416e.a();
            AbstractC0827Yf abstractC0827Yf = this.f13418g;
            if (abstractC0827Yf != null) {
                AbstractC0640Nf.f10010f.execute(new RunnableC1883t(19, abstractC0827Yf));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        c("pause", new String[0]);
        d();
        this.f13419h = false;
    }

    public final void h() {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8805p2)).booleanValue()) {
            this.f13416e.a();
        }
        c("ended", new String[0]);
        d();
    }

    public final void i() {
        if (this.f13411F && this.f13409D != null) {
            ImageView imageView = this.f13410E;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.f13409D);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.f13413b;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f13416e.a();
        this.f13423m = this.f13422l;
        C2911G.f23576l.post(new RunnableC0844Zf(this, 1));
    }

    public final void j(int i, int i3) {
        if (this.f13421k) {
            E9 e9 = H9.f8752h0;
            C2841s c2841s = C2841s.f23267e;
            int iMax = Math.max(i / ((Integer) c2841s.f23270c.a(e9)).intValue(), 1);
            int iMax2 = Math.max(i3 / ((Integer) c2841s.f23270c.a(e9)).intValue(), 1);
            Bitmap bitmap = this.f13409D;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f13409D.getHeight() == iMax2) {
                return;
            }
            this.f13409D = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f13411F = false;
        }
    }

    public final void k() {
        this.f13414c.setVisibility(4);
        C2911G.f23576l.post(new RunnableC0844Zf(this, 2));
    }

    public final void l(int i, int i3, int i6, int i7) {
        if (AbstractC2907C.o()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i3).length() + 3 + String.valueOf(i6).length() + 3 + String.valueOf(i7).length());
            AbstractC2763b.h(sb, "Set video bounds to x:", i, ";y:", i3);
            sb.append(";w:");
            sb.append(i6);
            sb.append(";h:");
            sb.append(i7);
            AbstractC2907C.m(sb.toString());
        }
        if (i6 == 0 || i7 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        layoutParams.setMargins(i, i3, 0, 0);
        this.f13413b.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        RunnableC0891ag runnableC0891ag = this.f13416e;
        if (z6) {
            runnableC0891ag.f13158c = false;
            HandlerC2908D handlerC2908D = C2911G.f23576l;
            handlerC2908D.removeCallbacks(runnableC0891ag);
            handlerC2908D.postDelayed(runnableC0891ag, 250L);
        } else {
            runnableC0891ag.a();
            this.f13423m = this.f13422l;
        }
        C2911G.f23576l.post(new RunnableC0891ag(this, z6, 1));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z6 = false;
        RunnableC0891ag runnableC0891ag = this.f13416e;
        if (i == 0) {
            runnableC0891ag.f13158c = false;
            HandlerC2908D handlerC2908D = C2911G.f23576l;
            handlerC2908D.removeCallbacks(runnableC0891ag);
            handlerC2908D.postDelayed(runnableC0891ag, 250L);
            z6 = true;
        } else {
            runnableC0891ag.a();
            this.f13423m = this.f13422l;
        }
        C2911G.f23576l.post(new RunnableC0891ag(this, z6, 0));
    }
}
