package g5;

import a5.d0;
import a5.v;
import android.os.Handler;
import androidx.media3.common.Metadata;
import androidx.media3.common.k0;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import bb.r;
import o5.t0;
import o5.w0;
import u5.a0;
import u5.z;

/* loaded from: classes.dex */
public final class n implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f9369a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f9370b = new io.sentry.internal.debugmeta.c(13, false);

    /* renamed from: c, reason: collision with root package name */
    public final a6.a f9371c = new a6.a(1);

    /* renamed from: d, reason: collision with root package name */
    public long f9372d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f9373e;

    public n(r rVar, r5.b bVar) {
        this.f9373e = rVar;
        this.f9369a = new w0(bVar, null, null);
    }

    @Override // u5.a0
    public final void a(long j, int i10, int i11, int i12, z zVar) {
        long jE;
        long J;
        this.f9369a.a(j, i10, i11, i12, zVar);
        while (this.f9369a.q(false)) {
            a6.a aVar = this.f9371c;
            aVar.p();
            if (this.f9369a.v(this.f9370b, aVar, 0, false) == -4) {
                aVar.s();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j7 = aVar.f3308y;
                Metadata metadataW = ((c6.a) this.f9373e.E).w(aVar);
                if (metadataW != null) {
                    EventMessage eventMessage = (EventMessage) metadataW.f1549a[0];
                    String str = eventMessage.f1948a;
                    String str2 = eventMessage.f1949d;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            J = d0.J(d0.l(eventMessage.f1952x));
                        } catch (k0 unused) {
                            J = -9223372036854775807L;
                        }
                        if (J != -9223372036854775807L) {
                            l lVar = new l(j7, J);
                            Handler handler = this.f9373e.f2566d;
                            handler.sendMessage(handler.obtainMessage(1, lVar));
                        }
                    }
                }
            }
        }
        w0 w0Var = this.f9369a;
        t0 t0Var = w0Var.f19078a;
        synchronized (w0Var) {
            int i13 = w0Var.f19094s;
            jE = i13 == 0 ? -1L : w0Var.e(i13);
        }
        t0Var.c(jE);
    }

    @Override // u5.a0
    public final int b(androidx.media3.common.l lVar, int i10, boolean z10) {
        return this.f9369a.b(lVar, i10, z10);
    }

    @Override // u5.a0
    public final void c(androidx.media3.common.r rVar) {
        this.f9369a.c(rVar);
    }

    @Override // u5.a0
    public final void d(int i10, v vVar) {
        this.f9369a.d(i10, vVar);
    }
}
