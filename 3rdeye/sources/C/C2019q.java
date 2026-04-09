package c;

import b9.C1992A;
import c.ActivityC2008f;
import java.util.ArrayList;
import java.util.Iterator;
import p9.InterfaceC5480a;

/* compiled from: FullyDrawnReporter.kt */
/* renamed from: c.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2019q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18294a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18295b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18296c;

    public C2019q(ActivityC2008f.e executor, C2010h c2010h) {
        kotlin.jvm.internal.l.f(executor, "executor");
        this.f18294a = new Object();
        this.f18296c = new ArrayList();
    }

    public final void a() {
        synchronized (this.f18294a) {
            try {
                this.f18295b = true;
                Iterator it = this.f18296c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5480a) it.next()).invoke();
                }
                this.f18296c.clear();
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
