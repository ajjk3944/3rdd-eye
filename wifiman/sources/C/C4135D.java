package c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* renamed from: c.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4135D {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f33476a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f33477b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f33478c;

    /* renamed from: d, reason: collision with root package name */
    private int f33479d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33480e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33481f;

    /* renamed from: g, reason: collision with root package name */
    private final List f33482g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f33483h;

    public C4135D(Executor executor, InterfaceC6824a reportFullyDrawn) {
        AbstractC6492s.i(executor, "executor");
        AbstractC6492s.i(reportFullyDrawn, "reportFullyDrawn");
        this.f33476a = executor;
        this.f33477b = reportFullyDrawn;
        this.f33478c = new Object();
        this.f33482g = new ArrayList();
        this.f33483h = new Runnable() { // from class: c.C
            @Override // java.lang.Runnable
            public final void run() {
                C4135D.d(this.f33475a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4135D c4135d) {
        synchronized (c4135d.f33478c) {
            try {
                c4135d.f33480e = false;
                if (c4135d.f33479d == 0 && !c4135d.f33481f) {
                    c4135d.f33477b.invoke();
                    c4135d.b();
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f33478c) {
            try {
                this.f33481f = true;
                Iterator it = this.f33482g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6824a) it.next()).invoke();
                }
                this.f33482g.clear();
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f33478c) {
            z10 = this.f33481f;
        }
        return z10;
    }
}
