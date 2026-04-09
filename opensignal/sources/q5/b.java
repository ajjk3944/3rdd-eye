package q5;

import a5.d0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.j0;
import androidx.media3.common.r;
import d5.v0;
import d5.w;
import d5.z;
import io.sentry.internal.debugmeta.c;
import n6.e;
import oe.h0;
import oe.u0;

/* loaded from: classes.dex */
public final class b extends d5.b implements Handler.Callback {
    public final Handler I;
    public final w J;
    public final a K;
    public final c L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public r Q;
    public n6.c R;
    public e S;
    public n6.a T;
    public n6.a U;
    public int V;
    public long W;
    public long X;
    public long Y;

    public b(w wVar, Looper looper) {
        Handler handler;
        super(3);
        this.J = wVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = d0.f105a;
            handler = new Handler(looper, this);
        }
        this.I = handler;
        this.K = a.f20715a;
        this.L = new c(13, false);
        this.W = -9223372036854775807L;
        this.X = -9223372036854775807L;
        this.Y = -9223372036854775807L;
    }

    @Override // d5.u0
    public final boolean b() {
        return true;
    }

    @Override // d5.b, d5.u0
    public final boolean c() {
        return this.N;
    }

    @Override // d5.u0, d5.v0
    public final String getName() {
        return "TextRenderer";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021e A[PHI: r26
  0x021e: PHI (r26v20 java.lang.String) = 
  (r26v7 java.lang.String)
  (r26v8 java.lang.String)
  (r26v9 java.lang.String)
  (r26v10 java.lang.String)
  (r26v11 java.lang.String)
  (r26v12 java.lang.String)
  (r26v13 java.lang.String)
  (r26v14 java.lang.String)
  (r26v15 java.lang.String)
  (r26v16 java.lang.String)
  (r26v17 java.lang.String)
  (r26v18 java.lang.String)
  (r26v21 java.lang.String)
 binds: [B:163:0x02af, B:159:0x02a4, B:155:0x0299, B:151:0x028d, B:147:0x0282, B:143:0x0277, B:139:0x026c, B:135:0x0261, B:131:0x0253, B:127:0x0245, B:123:0x0237, B:119:0x0229, B:116:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    @Override // d5.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r30, long r32) {
        /*
            Method dump skipped, instructions count: 1616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b.h(long, long):void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        y((z4.c) message.obj);
        return true;
    }

    @Override // d5.v0
    public final int j(r rVar) {
        this.K.getClass();
        String str = rVar.H;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return v0.f(rVar.f1783c0 == 0 ? 4 : 2, 0, 0);
        }
        return j0.i(rVar.H) ? v0.f(1, 0, 0) : v0.f(0, 0, 0);
    }

    @Override // d5.b
    public final void m() {
        this.Q = null;
        this.W = -9223372036854775807L;
        z4.c cVar = new z4.c(x(this.Y), u0.f19383x);
        Handler handler = this.I;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            y(cVar);
        }
        this.X = -9223372036854775807L;
        this.Y = -9223372036854775807L;
        z();
        n6.c cVar2 = this.R;
        cVar2.getClass();
        cVar2.release();
        this.R = null;
        this.P = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    @Override // d5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(long r6, boolean r8) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b.o(long, boolean):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    @Override // d5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(androidx.media3.common.r[] r4, long r5, long r7) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b.s(androidx.media3.common.r[], long, long):void");
    }

    public final long w() {
        if (this.V == -1) {
            return Long.MAX_VALUE;
        }
        this.T.getClass();
        if (this.V >= this.T.h()) {
            return Long.MAX_VALUE;
        }
        return this.T.e(this.V);
    }

    public final long x(long j) {
        a5.a.i(j != -9223372036854775807L);
        a5.a.i(this.X != -9223372036854775807L);
        return j - this.X;
    }

    public final void y(z4.c cVar) {
        h0 h0Var = cVar.f26653a;
        w wVar = this.J;
        wVar.f7095a.I.f(27, new bf.a(9, h0Var));
        z zVar = wVar.f7095a;
        zVar.G0 = cVar;
        zVar.I.f(27, new bf.a(6, cVar));
    }

    public final void z() {
        this.S = null;
        this.V = -1;
        n6.a aVar = this.T;
        if (aVar != null) {
            aVar.p();
            this.T = null;
        }
        n6.a aVar2 = this.U;
        if (aVar2 != null) {
            aVar2.p();
            this.U = null;
        }
    }
}
