package io.sentry.transport;

import io.sentry.b5;
import io.sentry.h0;
import io.sentry.k4;
import io.sentry.m4;
import io.sentry.x5;
import ir.f0;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final i4.b f12748a;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f12749d;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.cache.c f12750g;

    /* renamed from: r, reason: collision with root package name */
    public final r f12751r = new r(-1);

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f12752x;

    public b(c cVar, i4.b bVar, h0 h0Var, io.sentry.cache.c cVar2) {
        this.f12752x = cVar;
        f0.T(bVar, "Envelope is required.");
        this.f12748a = bVar;
        this.f12749d = h0Var;
        f0.T(cVar2, "EnvelopeCache is required.");
        this.f12750g = cVar2;
    }

    public static /* synthetic */ void a(b bVar, ba.m mVar, io.sentry.hints.j jVar) {
        bVar.f12752x.f12755g.getLogger().m(b5.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(mVar.C()));
        jVar.b(mVar.C());
    }

    public final ba.m b() {
        i4.b bVar = this.f12748a;
        ((m4) bVar.f11196a).f12438r = null;
        io.sentry.cache.c cVar = this.f12750g;
        h0 h0Var = this.f12749d;
        boolean zR = cVar.R(bVar, h0Var);
        Object objY = dr.a.y(h0Var);
        boolean zIsInstance = io.sentry.hints.c.class.isInstance(dr.a.y(h0Var));
        c cVar2 = this.f12752x;
        if (zIsInstance && objY != null) {
            io.sentry.hints.c cVar3 = (io.sentry.hints.c) objY;
            x5 x5Var = cVar2.f12755g;
            if (cVar3.f(((m4) bVar.f11196a).f12435a)) {
                cVar3.f12313a.countDown();
                x5Var.getLogger().m(b5.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                x5Var.getLogger().m(b5.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        x5 x5Var2 = cVar2.f12755g;
        if (!cVar2.f12757x.a()) {
            Object objY2 = dr.a.y(h0Var);
            boolean zIsInstance2 = io.sentry.hints.g.class.isInstance(dr.a.y(h0Var));
            r rVar = this.f12751r;
            if (zIsInstance2 && objY2 != null) {
                ((io.sentry.hints.g) objY2).c(true);
                return rVar;
            }
            if (!zR) {
                io.sentry.config.a.c0(io.sentry.hints.g.class, objY2, x5Var2.getLogger());
                x5Var2.getClientReportRecorder().q(io.sentry.clientreport.d.NETWORK_ERROR, bVar);
            }
            return rVar;
        }
        i4.b bVarM = x5Var2.getClientReportRecorder().m(bVar);
        try {
            k4 k4VarA = x5Var2.getDateProvider().a();
            ((m4) bVarM.f11196a).f12438r = dr.a.r(Double.valueOf(k4VarA.d() / 1000000.0d).longValue());
            ba.m mVarD = cVar2.f12758y.d(bVarM);
            if (mVarD.C()) {
                cVar.q(bVar);
                return mVarD;
            }
            String str = "The transport failed to send the envelope with response code " + mVarD.z();
            x5Var2.getLogger().m(b5.ERROR, str, new Object[0]);
            if (mVarD.z() >= 400 && mVarD.z() != 429 && !zR) {
                Object objY3 = dr.a.y(h0Var);
                if (!io.sentry.hints.g.class.isInstance(dr.a.y(h0Var)) || objY3 == null) {
                    x5Var2.getClientReportRecorder().q(io.sentry.clientreport.d.NETWORK_ERROR, bVarM);
                }
            }
            throw new IllegalStateException(str);
        } catch (IOException e4) {
            Object objY4 = dr.a.y(h0Var);
            if (io.sentry.hints.g.class.isInstance(dr.a.y(h0Var)) && objY4 != null) {
                ((io.sentry.hints.g) objY4).c(true);
            } else if (!zR) {
                io.sentry.config.a.c0(io.sentry.hints.g.class, objY4, x5Var2.getLogger());
                x5Var2.getClientReportRecorder().q(io.sentry.clientreport.d.NETWORK_ERROR, bVarM);
            }
            throw new IllegalStateException("Sending the event failed.", e4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12752x.B = this;
        ba.m mVarB = this.f12751r;
        try {
            mVarB = b();
            this.f12752x.f12755g.getLogger().m(b5.DEBUG, "Envelope flushed", new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f12752x.f12755g.getLogger().f(b5.ERROR, th2, "Envelope submission failed", new Object[0]);
                throw th2;
            } finally {
                h0 h0Var = this.f12749d;
                Object objY = dr.a.y(h0Var);
                if (io.sentry.hints.j.class.isInstance(dr.a.y(h0Var)) && objY != null) {
                    a(this, mVarB, (io.sentry.hints.j) objY);
                }
                this.f12752x.B = null;
            }
        }
    }
}
