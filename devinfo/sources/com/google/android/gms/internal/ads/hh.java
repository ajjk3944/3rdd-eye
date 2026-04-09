package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hh extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11864a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11865b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11866c;

    /* renamed from: d, reason: collision with root package name */
    public final oa f11867d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11868e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11869f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11870h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11871i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11872k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11873l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11874m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f11875n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11876o;

    public hh() {
        oa oaVar = new oa((byte) 0, 5);
        this.f11864a = false;
        this.f11865b = false;
        this.f11867d = oaVar;
        this.f11866c = new Object();
        this.f11869f = ((Long) ml.f13933d.u()).intValue();
        this.g = ((Long) ml.f13930a.u()).intValue();
        this.f11870h = ((Long) ml.f13934e.u()).intValue();
        this.f11871i = ((Long) ml.f13932c.u()).intValue();
        pk pkVar = sk.f16331t0;
        va.s sVar = va.s.f36163e;
        this.j = ((Integer) sVar.f36166c.a(pkVar)).intValue();
        pk pkVar2 = sk.f16346u0;
        rk rkVar = sVar.f36166c;
        this.f11872k = ((Integer) rkVar.a(pkVar2)).intValue();
        this.f11873l = ((Integer) rkVar.a(sk.f16361v0)).intValue();
        this.f11868e = ((Long) ml.f13935f.u()).intValue();
        this.f11874m = (String) rkVar.a(sk.f16394x0);
        this.f11875n = ((Boolean) rkVar.a(sk.f16411y0)).booleanValue();
        this.f11876o = ((Boolean) rkVar.a(sk.f16428z0)).booleanValue();
        ((Boolean) rkVar.a(sk.A0)).getClass();
        setName("ContentFetchTask");
    }

    public final void a() {
        synchronized (this.f11866c) {
            try {
                if (this.f11864a) {
                    za.i.c("Content hash thread already started, quitting...");
                } else {
                    this.f11864a = true;
                    start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final androidx.recyclerview.widget.z0 b(View view, ch chVar) {
        if (view == null) {
            return new androidx.recyclerview.widget.z0(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new androidx.recyclerview.widget.z0(this, 0, 0);
            }
            chVar.e(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new androidx.recyclerview.widget.z0(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof qz)) {
            WebView webView = (WebView) view;
            synchronized (chVar.g) {
                chVar.f10128m++;
            }
            webView.post(new d1(this, chVar, webView, globalVisibleRect));
            return new androidx.recyclerview.widget.z0(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new androidx.recyclerview.widget.z0(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i4 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            androidx.recyclerview.widget.z0 z0VarB = b(viewGroup.getChildAt(i11), chVar);
            i4 += z0VarB.f1563a;
            i10 += z0VarB.f1564b;
        }
        return new androidx.recyclerview.widget.z0(this, i4, i10);
    }

    public final void c() {
        synchronized (this.f11866c) {
            this.f11865b = true;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("ContentFetchThread: paused, pause = true");
            za.i.c(sb2.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = ua.j.C.g.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        za.i.c("ContentFetchThread: no activity. Sleeping.");
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        ua.j.C.f35265h.f("ContentFetchTask.extractContent", r0);
        za.i.c("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        za.i.f("Error in ContentFetchTask", r0);
        ua.j.C.f35265h.f("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
    
        za.i.f("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e0->B:73:0x00e0, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hh.run():void");
    }
}
