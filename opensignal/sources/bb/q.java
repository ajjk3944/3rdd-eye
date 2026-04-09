package bb;

import android.os.Handler;
import ca.w;
import ca.x;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.y0;
import o5.t0;
import qb.v;
import ya.r0;

/* loaded from: classes.dex */
public final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f2560a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f2561b = new io.sentry.internal.debugmeta.c(11, false);

    /* renamed from: c, reason: collision with root package name */
    public final pa.c f2562c = new pa.c(1);

    /* renamed from: d, reason: collision with root package name */
    public long f2563d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f2564e;

    public q(r rVar, pb.b bVar) {
        this.f2564e = rVar;
        this.f2560a = new r0(bVar, null, null, null);
    }

    @Override // ca.x
    public final void a(int i10, fb.f fVar) {
        this.f2560a.a(i10, fVar);
    }

    @Override // ca.x
    public final int c(pb.k kVar, int i10, boolean z10) {
        return this.f2560a.b(kVar, i10, z10);
    }

    @Override // ca.x
    public final void d(long j, int i10, int i11, int i12, w wVar) {
        long jF;
        long jE;
        this.f2560a.d(j, i10, i11, i12, wVar);
        while (this.f2560a.r(false)) {
            pa.c cVar = this.f2562c;
            cVar.p();
            if (this.f2560a.w(this.f2561b, cVar, 0, false) == -4) {
                cVar.s();
            } else {
                cVar = null;
            }
            if (cVar != null) {
                long j7 = cVar.f26793y;
                Metadata metadataL = ((ra.a) this.f2564e.E).l(cVar);
                if (metadataL != null) {
                    EventMessage eventMessage = (EventMessage) metadataL.f4241a[0];
                    String str = eventMessage.f4244a;
                    String str2 = eventMessage.f4245d;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jE = v.E(v.m(eventMessage.f4248x));
                        } catch (y0 unused) {
                            jE = -9223372036854775807L;
                        }
                        if (jE != -9223372036854775807L) {
                            o oVar = new o(j7, jE);
                            Handler handler = this.f2564e.f2566d;
                            handler.sendMessage(handler.obtainMessage(1, oVar));
                        }
                    }
                }
            }
        }
        r0 r0Var = this.f2560a;
        t0 t0Var = r0Var.f26153a;
        synchronized (r0Var) {
            int i13 = r0Var.f26170t;
            jF = i13 == 0 ? -1L : r0Var.f(i13);
        }
        t0Var.c(jF);
    }

    @Override // ca.x
    public final void e(Format format) {
        this.f2560a.e(format);
    }
}
