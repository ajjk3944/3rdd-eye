package Y;

import C0.k;
import K4.q;
import S4.r;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import com.apm.insight.R;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public abstract class h extends a implements O0.a {

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f4205j = true;

    /* renamed from: k, reason: collision with root package name */
    public static final r f4206k = new r(10);

    /* renamed from: l, reason: collision with root package name */
    public static final ReferenceQueue f4207l = new ReferenceQueue();

    /* renamed from: m, reason: collision with root package name */
    public static final e f4208m = new e(0);

    /* renamed from: b, reason: collision with root package name */
    public final k f4209b = new k(12, this);

    /* renamed from: c, reason: collision with root package name */
    public boolean f4210c = false;

    /* renamed from: d, reason: collision with root package name */
    public final i[] f4211d = new i[1];

    /* renamed from: e, reason: collision with root package name */
    public final View f4212e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4213f;

    /* renamed from: g, reason: collision with root package name */
    public final Choreographer f4214g;

    /* renamed from: h, reason: collision with root package name */
    public final f f4215h;
    public final Handler i;

    public h(View view) {
        this.f4212e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f4205j) {
            this.f4214g = Choreographer.getInstance();
            this.f4215h = new f(this);
        } else {
            this.f4215h = null;
            this.i = new Handler(Looper.myLooper());
        }
    }

    public static h d(View view) {
        if (view != null) {
            return (h) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.view.View r5, java.lang.Object[] r6, android.util.SparseIntArray r7, boolean r8) {
        /*
            Y.h r0 = d(r5)
            if (r0 == 0) goto L8
            goto Laf
        L8:
            java.lang.Object r0 = r5.getTag()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L13
            java.lang.String r0 = (java.lang.String) r0
            goto L14
        L13:
            r0 = 0
        L14:
            r1 = 0
            if (r8 == 0) goto L5d
            if (r0 == 0) goto L5d
            java.lang.String r8 = "layout"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L5d
            r8 = 95
            int r8 = r0.lastIndexOf(r8)
            if (r8 <= 0) goto L83
            int r8 = r8 + 1
            int r2 = r0.length()
            if (r2 != r8) goto L32
            goto L83
        L32:
            r3 = r8
        L33:
            if (r3 >= r2) goto L43
            char r4 = r0.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L40
            goto L83
        L40:
            int r3 = r3 + 1
            goto L33
        L43:
            int r2 = r0.length()
            r3 = r1
        L48:
            if (r8 >= r2) goto L56
            int r3 = r3 * 10
            char r4 = r0.charAt(r8)
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r8 = r8 + 1
            goto L48
        L56:
            r8 = r6[r3]
            if (r8 != 0) goto L98
            r6[r3] = r5
            goto L98
        L5d:
            if (r0 == 0) goto L83
            java.lang.String r8 = "binding_"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L83
            int r8 = r0.length()
            r2 = 8
            r3 = r1
        L6e:
            if (r2 >= r8) goto L7c
            int r3 = r3 * 10
            char r4 = r0.charAt(r2)
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L6e
        L7c:
            r8 = r6[r3]
            if (r8 != 0) goto L98
            r6[r3] = r5
            goto L98
        L83:
            int r8 = r5.getId()
            if (r8 <= 0) goto L98
            if (r7 == 0) goto L98
            r0 = -1
            int r8 = r7.get(r8, r0)
            if (r8 < 0) goto L98
            r0 = r6[r8]
            if (r0 != 0) goto L98
            r6[r8] = r5
        L98:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto Laf
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r8 = r5.getChildCount()
            r0 = r1
        La3:
            if (r0 >= r8) goto Laf
            android.view.View r2 = r5.getChildAt(r0)
            e(r2, r6, r7, r1)
            int r0 = r0 + 1
            goto La3
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.h.e(android.view.View, java.lang.Object[], android.util.SparseIntArray, boolean):void");
    }

    public abstract void b();

    public final void c() {
        if (this.f4213f) {
            f();
            return;
        }
        q qVar = (q) this;
        synchronized (qVar) {
            if (qVar.f2396E != 0) {
                this.f4213f = true;
                b();
                this.f4213f = false;
            }
        }
    }

    public final void f() {
        synchronized (this) {
            try {
                if (this.f4210c) {
                    return;
                }
                this.f4210c = true;
                if (f4205j) {
                    this.f4214g.postFrameCallback(this.f4215h);
                } else {
                    this.i.post(this.f4209b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O0.a
    public final View getRoot() {
        return this.f4212e;
    }
}
