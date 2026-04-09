package wg;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.liuzh.deviceinfo.monitor.MonitorManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public float f36708a;

    /* renamed from: b, reason: collision with root package name */
    public float f36709b;

    /* renamed from: c, reason: collision with root package name */
    public int f36710c;

    /* renamed from: d, reason: collision with root package name */
    public int f36711d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36712e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36713f;
    public final /* synthetic */ boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ WindowManager.LayoutParams f36714h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f36715i;
    public final /* synthetic */ View j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f36716k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Runnable f36717l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MonitorManager f36718m;

    public u(MonitorManager monitorManager, boolean z3, WindowManager.LayoutParams layoutParams, Runnable runnable, View view, String str, String str2, Runnable runnable2) {
        this.f36718m = monitorManager;
        this.g = z3;
        this.f36714h = layoutParams;
        this.f36715i = runnable;
        this.j = view;
        this.f36716k = str;
        this.f36717l = runnable2;
        this.f36712e = ViewConfiguration.get(monitorManager.f21224a).getScaledTouchSlop();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            com.liuzh.deviceinfo.monitor.MonitorManager r9 = r8.f36718m
            android.view.WindowManager r0 = r9.f21225b
            android.graphics.Point r9 = r9.f21226c
            boolean r1 = r8.g
            r2 = 0
            if (r1 == 0) goto L18
            com.liuzh.deviceinfo.utilities.f r1 = com.liuzh.deviceinfo.utilities.f.f21256b
            java.lang.String r1 = "monitor_fixed_position"
            android.content.SharedPreferences r3 = com.liuzh.deviceinfo.utilities.f.f21257c
            boolean r1 = r3.getBoolean(r1, r2)
            if (r1 == 0) goto L18
            goto L69
        L18:
            int r1 = r10.getAction()
            r3 = 1
            android.view.WindowManager$LayoutParams r4 = r8.f36714h
            if (r1 != 0) goto L3d
            float r9 = r10.getRawX()
            r8.f36708a = r9
            float r9 = r10.getRawY()
            r8.f36709b = r9
            int r9 = r4.x
            r8.f36710c = r9
            int r9 = r4.y
            r8.f36711d = r9
            r8.f36713f = r2
            java.lang.Runnable r9 = r8.f36715i
            r9.run()
            return r3
        L3d:
            int r1 = r10.getAction()
            r5 = 2
            if (r1 != r5) goto Lab
            float r1 = r10.getRawX()
            float r10 = r10.getRawY()
            float r5 = r8.f36708a
            float r1 = r1 - r5
            float r5 = r8.f36709b
            float r10 = r10 - r5
            boolean r5 = r8.f36713f
            if (r5 != 0) goto L6c
            float r5 = java.lang.Math.abs(r1)
            int r6 = r8.f36712e
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L6a
            float r5 = java.lang.Math.abs(r10)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L6a
        L69:
            return r2
        L6a:
            r8.f36713f = r3
        L6c:
            int r5 = r8.f36710c
            float r5 = (float) r5
            float r5 = r5 + r1
            int r1 = java.lang.Math.round(r5)
            int r5 = r8.f36711d
            float r5 = (float) r5
            float r5 = r5 + r10
            int r10 = java.lang.Math.round(r5)
            android.view.Display r5 = r0.getDefaultDisplay()
            r5.getRealSize(r9)
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r9.x
            android.view.View r6 = r8.j
            int r7 = r6.getWidth()
            int r5 = r5 - r7
            int r1 = java.lang.Math.min(r1, r5)
            int r10 = java.lang.Math.max(r10, r2)
            int r9 = r9.y
            int r2 = r6.getHeight()
            int r9 = r9 - r2
            int r9 = java.lang.Math.min(r10, r9)
            r4.x = r1
            r4.y = r9
            r0.updateViewLayout(r6, r4)     // Catch: java.lang.Throwable -> Lc5
            goto Lc5
        Lab:
            int r9 = r10.getAction()
            if (r9 != r3) goto Lc5
            java.lang.String r9 = r8.f36716k
            if (r9 == 0) goto Lbe
            com.liuzh.deviceinfo.utilities.f r10 = com.liuzh.deviceinfo.utilities.f.f21256b
            int r10 = r4.x
            int r0 = r4.y
            com.liuzh.deviceinfo.utilities.f.p(r10, r0, r9)
        Lbe:
            java.lang.Runnable r9 = r8.f36717l
            r9.run()
            r8.f36713f = r2
        Lc5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.u.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
