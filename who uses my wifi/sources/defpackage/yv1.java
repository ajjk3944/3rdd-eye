package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yv1 extends Thread {
    public boolean f;
    public boolean g;
    public final Object h;
    public final so1 i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final String r;
    public final boolean s;
    public final boolean t;

    public yv1() {
        so1 so1Var = new so1(9, false);
        this.f = false;
        this.g = false;
        this.i = so1Var;
        this.h = new Object();
        this.k = ((Long) l02.d.w()).intValue();
        this.l = ((Long) l02.a.w()).intValue();
        this.m = ((Long) l02.e.w()).intValue();
        this.n = ((Long) l02.c.w()).intValue();
        iz1 iz1Var = mz1.e0;
        tw1 tw1Var = tw1.e;
        this.o = ((Integer) tw1Var.c.a(iz1Var)).intValue();
        iz1 iz1Var2 = mz1.f0;
        kz1 kz1Var = tw1Var.c;
        this.p = ((Integer) kz1Var.a(iz1Var2)).intValue();
        this.q = ((Integer) kz1Var.a(mz1.g0)).intValue();
        this.j = ((Long) l02.f.w()).intValue();
        this.r = (String) kz1Var.a(mz1.i0);
        this.s = ((Boolean) kz1Var.a(mz1.j0)).booleanValue();
        this.t = ((Boolean) kz1Var.a(mz1.k0)).booleanValue();
        ((Boolean) kz1Var.a(mz1.l0)).getClass();
        setName("ContentFetchTask");
    }

    public final tg0 a(View view, uv1 uv1Var) {
        if (view == null) {
            return new tg0(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new tg0(this, 0, 0);
            }
            uv1Var.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new tg0(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof ag2)) {
            WebView webView = (WebView) view;
            synchronized (uv1Var.g) {
                uv1Var.m++;
            }
            webView.post(new gi(this, uv1Var, webView, globalVisibleRect));
            return new tg0(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new tg0(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            tg0 tg0VarA = a(viewGroup.getChildAt(i3), uv1Var);
            i += tg0VarA.a;
            i2 += tg0VarA.b;
        }
        return new tg0(this, i, i2);
    }

    public final void b() {
        synchronized (this.h) {
            this.g = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            gi2.U(sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r4.importance != 100) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r3.inKeyguardRestrictedInputMode() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r0.isScreenOn() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        r0 = defpackage.hg4.C.g.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (r0 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        defpackage.gi2.U("ContentFetchThread: no activity. Sleeping.");
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r0.getWindow() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        r2 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        defpackage.hg4.C.h.d("ContentFetchTask.extractContent", r0);
        defpackage.gi2.U("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        defpackage.gi2.c0("Error in ContentFetchTask", r0);
        defpackage.hg4.C.h.d("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ea, code lost:
    
        defpackage.gi2.c0("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca A[Catch: Exception -> 0x007c, InterruptedException -> 0x007e, TryCatch #7 {InterruptedException -> 0x007e, Exception -> 0x007c, blocks: (B:33:0x0069, B:35:0x0073, B:58:0x00d2, B:50:0x00b1, B:48:0x00a1, B:57:0x00ca, B:56:0x00c1, B:41:0x0080, B:43:0x0086, B:45:0x0090, B:2:0x0000, B:3:0x0006, B:15:0x001b, B:18:0x002f, B:20:0x0035, B:21:0x0039, B:23:0x003f, B:25:0x004d, B:27:0x0053, B:29:0x0059, B:31:0x0063, B:55:0x00c0, B:4:0x0007, B:6:0x000e, B:7:0x0010, B:11:0x0015), top: B:85:0x0069, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2 A[EXC_TOP_SPLITTER, LOOP:2: B:83:0x00f2->B:92:0x00f2, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.run():void");
    }
}
