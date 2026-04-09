package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f269a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.a f270b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f271c;

    /* renamed from: d, reason: collision with root package name */
    public int f272d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f273e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f274f;

    /* renamed from: g, reason: collision with root package name */
    public final List f275g;

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f276h;

    public l(Executor executor, l9.a reportFullyDrawn) {
        kotlin.jvm.internal.p.e(executor, "executor");
        kotlin.jvm.internal.p.e(reportFullyDrawn, "reportFullyDrawn");
        this.f269a = executor;
        this.f270b = reportFullyDrawn;
        this.f271c = new Object();
        this.f275g = new ArrayList();
        this.f276h = new Runnable() { // from class: androidx.activity.k
            @Override // java.lang.Runnable
            public final void run() {
                l.d(this.f268a);
            }
        };
    }

    public static final void d(l this$0) {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        synchronized (this$0.f271c) {
            try {
                this$0.f273e = false;
                if (this$0.f272d == 0 && !this$0.f274f) {
                    this$0.f270b.invoke();
                    this$0.b();
                }
                y8.s sVar = y8.s.f25199a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f271c) {
            try {
                this.f274f = true;
                Iterator it = this.f275g.iterator();
                while (it.hasNext()) {
                    ((l9.a) it.next()).invoke();
                }
                this.f275g.clear();
                y8.s sVar = y8.s.f25199a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f271c) {
            z10 = this.f274f;
        }
        return z10;
    }
}
