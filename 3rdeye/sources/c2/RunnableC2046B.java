package c2;

import a2.C1645b;
import android.content.Context;
import b2.C1842w;
import d2.AbstractC4266a;
import d2.C4268c;
import java.util.UUID;

/* compiled from: WorkForegroundUpdater.java */
/* renamed from: c2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2046B implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4268c f18385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f18386c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.work.h f18387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f18388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2047C f18389f;

    public RunnableC2046B(C2047C c2047c, C4268c c4268c, UUID uuid, androidx.work.h hVar, Context context) {
        this.f18389f = c2047c;
        this.f18385b = c4268c;
        this.f18386c = uuid;
        this.f18387d = hVar;
        this.f18388e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f18385b.f37349b instanceof AbstractC4266a.b)) {
                String string = this.f18386c.toString();
                C1842w c1842wU = this.f18389f.f18392c.u(string);
                if (c1842wU == null || c1842wU.f17139b.isFinished()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((T1.l) this.f18389f.f18391b).i(string, this.f18387d);
                this.f18388e.startService(C1645b.b(this.f18388e, B7.d.l(c1842wU), this.f18387d));
            }
            this.f18385b.i(null);
        } catch (Throwable th) {
            this.f18385b.j(th);
        }
    }
}
