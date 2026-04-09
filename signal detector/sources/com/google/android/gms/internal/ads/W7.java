package com.google.android.gms.internal.ads;

import R.C0187n;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import q2.C2841s;

/* loaded from: classes.dex */
public final class W7 extends Thread {

    /* renamed from: C, reason: collision with root package name */
    public final boolean f12165C;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12166a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12167b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12168c;

    /* renamed from: d, reason: collision with root package name */
    public final J4 f12169d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12170e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12171f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12172g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12173h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12174j;

    /* renamed from: k, reason: collision with root package name */
    public final int f12175k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12176l;

    /* renamed from: m, reason: collision with root package name */
    public final String f12177m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f12178n;

    public W7() {
        J4 j42 = new J4(5, (byte) 0);
        this.f12166a = false;
        this.f12167b = false;
        this.f12169d = j42;
        this.f12168c = new Object();
        this.f12171f = ((Long) AbstractC0940ba.f13385d.v()).intValue();
        this.f12172g = ((Long) AbstractC0940ba.f13382a.v()).intValue();
        this.f12173h = ((Long) AbstractC0940ba.f13386e.v()).intValue();
        this.i = ((Long) AbstractC0940ba.f13384c.v()).intValue();
        E9 e9 = H9.f8829t0;
        C2841s c2841s = C2841s.f23267e;
        this.f12174j = ((Integer) c2841s.f23270c.a(e9)).intValue();
        E9 e92 = H9.f8836u0;
        G9 g9 = c2841s.f23270c;
        this.f12175k = ((Integer) g9.a(e92)).intValue();
        this.f12176l = ((Integer) g9.a(H9.v0)).intValue();
        this.f12170e = ((Long) AbstractC0940ba.f13387f.v()).intValue();
        this.f12177m = (String) g9.a(H9.f8855x0);
        this.f12178n = ((Boolean) g9.a(H9.f8861y0)).booleanValue();
        this.f12165C = ((Boolean) g9.a(H9.f8866z0)).booleanValue();
        ((Boolean) g9.a(H9.f8558A0)).getClass();
        setName("ContentFetchTask");
    }

    public final void a() {
        synchronized (this.f12168c) {
            try {
                if (this.f12166a) {
                    u2.k.c("Content hash thread already started, quitting...");
                } else {
                    this.f12166a = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0187n b(View view, R7 r7) {
        if (view == null) {
            return new C0187n(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C0187n(this, 0, 0);
            }
            r7.e(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new C0187n(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof InterfaceC0828Yg)) {
            WebView webView = (WebView) view;
            synchronized (r7.f10851g) {
                r7.f10856m++;
            }
            webView.post(new RunnableC0912b0(this, r7, webView, globalVisibleRect));
            return new C0187n(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new C0187n(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i3 = 0;
        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
            C0187n c0187nB = b(viewGroup.getChildAt(i6), r7);
            i += c0187nB.f3349a;
            i3 += c0187nB.f3350b;
        }
        return new C0187n(this, i, i3);
    }

    public final void c() {
        synchronized (this.f12168c) {
            this.f12167b = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            u2.k.c(sb.toString());
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
    
        r0 = p2.j.f22785C.f22794g.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        u2.k.c("ContentFetchThread: no activity. Sleeping.");
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
    
        p2.j.f22785C.f22795h.f("ContentFetchTask.extractContent", r0);
        u2.k.c("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        u2.k.f("Error in ContentFetchTask", r0);
        p2.j.f22785C.f22795h.f("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
    
        u2.k.f("Error in ContentFetchTask", r0);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.W7.run():void");
    }
}
