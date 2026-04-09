package eb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
import qb.m;
import qb.v;

/* loaded from: classes.dex */
public final class l extends com.google.android.exoplayer2.g implements Handler.Callback {
    public final Handler H;
    public final k I;
    public final h J;
    public final io.sentry.internal.debugmeta.c K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public Format P;
    public f Q;
    public i R;
    public j S;
    public j T;
    public int U;
    public long V;

    public l(k kVar, Looper looper) {
        Handler handler;
        super(3);
        this.I = kVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = v.f20828a;
            handler = new Handler(looper, this);
        }
        this.H = handler;
        this.J = h.f8083a;
        this.K = new io.sentry.internal.debugmeta.c(11, false);
        this.V = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.l1
    public final int f(Format format) {
        this.J.getClass();
        String str = format.H;
        return ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) ? format.f4021a0 == null ? 4 : 2 : m.i(format.H) ? 1 : 0;
    }

    @Override // com.google.android.exoplayer2.g, com.google.android.exoplayer2.l1
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.I.onCues((List) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.g
    public final boolean i() {
        return this.M;
    }

    @Override // com.google.android.exoplayer2.g
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.exoplayer2.g
    public final void k() {
        this.P = null;
        this.V = -9223372036854775807L;
        List list = Collections.EMPTY_LIST;
        Handler handler = this.H;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.I.onCues(list);
        }
        z();
        f fVar = this.Q;
        fVar.getClass();
        fVar.release();
        this.Q = null;
        this.O = 0;
    }

    @Override // com.google.android.exoplayer2.g
    public final void m(long j, boolean z10) {
        List list = Collections.EMPTY_LIST;
        Handler handler = this.H;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.I.onCues(list);
        }
        this.L = false;
        this.M = false;
        this.V = -9223372036854775807L;
        if (this.O == 0) {
            z();
            f fVar = this.Q;
            fVar.getClass();
            fVar.flush();
            return;
        }
        z();
        f fVar2 = this.Q;
        fVar2.getClass();
        fVar2.release();
        this.Q = null;
        this.O = 0;
        y();
    }

    @Override // com.google.android.exoplayer2.g
    public final void q(Format[] formatArr, long j, long j7) {
        this.P = formatArr[0];
        if (this.Q != null) {
            this.O = 1;
        } else {
            y();
        }
    }

    @Override // com.google.android.exoplayer2.g
    public final void s(long j, long j7) {
        boolean z10;
        io.sentry.internal.debugmeta.c cVar = this.K;
        if (this.F) {
            long j10 = this.V;
            if (j10 != -9223372036854775807L && j >= j10) {
                z();
                this.M = true;
            }
        }
        if (this.M) {
            return;
        }
        if (this.T == null) {
            f fVar = this.Q;
            fVar.getClass();
            fVar.a(j);
            try {
                f fVar2 = this.Q;
                fVar2.getClass();
                this.T = (j) fVar2.b();
            } catch (g e4) {
                x(e4);
                return;
            }
        }
        if (this.f4140x != 2) {
            return;
        }
        if (this.S != null) {
            long jW = w();
            z10 = false;
            while (jW <= j) {
                this.U++;
                jW = w();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        j jVar = this.T;
        if (jVar != null) {
            if (jVar.g(4)) {
                if (!z10 && w() == Long.MAX_VALUE) {
                    if (this.O == 2) {
                        z();
                        f fVar3 = this.Q;
                        fVar3.getClass();
                        fVar3.release();
                        this.Q = null;
                        this.O = 0;
                        y();
                    } else {
                        z();
                        this.M = true;
                    }
                }
            } else if (jVar.f26799g <= j) {
                j jVar2 = this.S;
                if (jVar2 != null) {
                    jVar2.p();
                }
                this.U = jVar.a(j);
                this.S = jVar;
                this.T = null;
                z10 = true;
            }
        }
        if (z10) {
            this.S.getClass();
            List listF = this.S.f(j);
            Handler handler = this.H;
            if (handler != null) {
                handler.obtainMessage(0, listF).sendToTarget();
            } else {
                this.I.onCues(listF);
            }
        }
        if (this.O == 2) {
            return;
        }
        while (!this.L) {
            try {
                i iVar = this.R;
                if (iVar == null) {
                    f fVar4 = this.Q;
                    fVar4.getClass();
                    iVar = (i) fVar4.c();
                    if (iVar == null) {
                        return;
                    } else {
                        this.R = iVar;
                    }
                }
                if (this.O == 1) {
                    iVar.f3295d = 4;
                    f fVar5 = this.Q;
                    fVar5.getClass();
                    fVar5.d(iVar);
                    this.R = null;
                    this.O = 2;
                    return;
                }
                int iR = r(cVar, iVar, 0);
                if (iR == -4) {
                    if (iVar.g(4)) {
                        this.L = true;
                        this.N = false;
                    } else {
                        Format format = (Format) cVar.f12354g;
                        if (format == null) {
                            return;
                        }
                        iVar.E = format.L;
                        iVar.s();
                        this.N &= !iVar.g(1);
                    }
                    if (!this.N) {
                        f fVar6 = this.Q;
                        fVar6.getClass();
                        fVar6.d(iVar);
                        this.R = null;
                    }
                } else if (iR == -3) {
                    return;
                }
            } catch (g e10) {
                x(e10);
                return;
            }
        }
    }

    public final long w() {
        if (this.U == -1) {
            return Long.MAX_VALUE;
        }
        this.S.getClass();
        if (this.U >= this.S.h()) {
            return Long.MAX_VALUE;
        }
        return this.S.e(this.U);
    }

    public final void x(g gVar) {
        String strValueOf = String.valueOf(this.P);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39);
        sb2.append("Subtitle decoding failed. streamFormat=");
        sb2.append(strValueOf);
        qb.b.q("TextRenderer", sb2.toString(), gVar);
        List list = Collections.EMPTY_LIST;
        Handler handler = this.H;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.I.onCues(list);
        }
        z();
        f fVar = this.Q;
        fVar.getClass();
        fVar.release();
        this.Q = null;
        this.O = 0;
        y();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.l.y():void");
    }

    public final void z() {
        this.R = null;
        this.U = -1;
        j jVar = this.S;
        if (jVar != null) {
            jVar.p();
            this.S = null;
        }
        j jVar2 = this.T;
        if (jVar2 != null) {
            jVar2.p();
            this.T = null;
        }
    }
}
