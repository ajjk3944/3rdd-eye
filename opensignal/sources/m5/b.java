package m5;

import a5.d0;
import a5.m;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Metadata;
import androidx.media3.common.f0;
import androidx.media3.common.g0;
import androidx.media3.common.r;
import com.google.android.gms.internal.measurement.b4;
import d5.v0;
import d5.w;
import d5.z;
import io.sentry.internal.debugmeta.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends d5.b implements Handler.Callback {
    public final a I;
    public final w J;
    public final Handler K;
    public final a6.a L;
    public b4 M;
    public boolean N;
    public boolean O;
    public long P;
    public Metadata Q;
    public long R;

    public b(w wVar, Looper looper) {
        Handler handler;
        super(5);
        this.J = wVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = d0.f105a;
            handler = new Handler(looper, this);
        }
        this.K = handler;
        this.I = a.f16304a;
        this.L = new a6.a(1);
        this.R = -9223372036854775807L;
    }

    @Override // d5.u0
    public final boolean b() {
        return true;
    }

    @Override // d5.b, d5.u0
    public final boolean c() {
        return this.O;
    }

    @Override // d5.u0, d5.v0
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // d5.u0
    public final void h(long j, long j7) {
        boolean z10 = true;
        while (z10) {
            if (!this.N && this.Q == null) {
                a6.a aVar = this.L;
                aVar.p();
                c cVar = this.f6926d;
                cVar.c();
                int iT = t(cVar, aVar, 0);
                if (iT == -4) {
                    if (aVar.g(4)) {
                        this.N = true;
                    } else {
                        aVar.E = this.P;
                        aVar.s();
                        b4 b4Var = this.M;
                        int i10 = d0.f105a;
                        Metadata metadataW = b4Var.w(aVar);
                        if (metadataW != null) {
                            ArrayList arrayList = new ArrayList(metadataW.f1549a.length);
                            w(metadataW, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.Q = new Metadata(x(aVar.f3308y), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (iT == -5) {
                    r rVar = (r) cVar.f12354g;
                    rVar.getClass();
                    this.P = rVar.L;
                }
            }
            Metadata metadata = this.Q;
            if (metadata == null || metadata.f1550d > x(j)) {
                z10 = false;
            } else {
                Metadata metadata2 = this.Q;
                Handler handler = this.K;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    y(metadata2);
                }
                this.Q = null;
                z10 = true;
            }
            if (this.N && this.Q == null) {
                this.O = true;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        y((Metadata) message.obj);
        return true;
    }

    @Override // d5.v0
    public final int j(r rVar) {
        if (this.I.b(rVar)) {
            return v0.f(rVar.f1783c0 == 0 ? 4 : 2, 0, 0);
        }
        return v0.f(0, 0, 0);
    }

    @Override // d5.b
    public final void m() {
        this.Q = null;
        this.M = null;
        this.R = -9223372036854775807L;
    }

    @Override // d5.b
    public final void o(long j, boolean z10) {
        this.Q = null;
        this.N = false;
        this.O = false;
    }

    @Override // d5.b
    public final void s(r[] rVarArr, long j, long j7) {
        this.M = this.I.a(rVarArr[0]);
        Metadata metadata = this.Q;
        if (metadata != null) {
            long j10 = metadata.f1550d;
            long j11 = (this.R + j10) - j7;
            if (j10 != j11) {
                metadata = new Metadata(j11, metadata.f1549a);
            }
            this.Q = metadata;
        }
        this.R = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(androidx.media3.common.Metadata r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            androidx.media3.common.Metadata$Entry[] r1 = r6.f1549a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            androidx.media3.common.r r2 = r2.a()
            if (r2 == 0) goto L3e
            m5.a r3 = r5.I
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L3e
            com.google.android.gms.internal.measurement.b4 r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.b()
            r1.getClass()
            a6.a r3 = r5.L
            r3.p()
            int r4 = r1.length
            r3.r(r4)
            java.nio.ByteBuffer r4 = r3.f3306r
            r4.put(r1)
            r3.s()
            androidx.media3.common.Metadata r1 = r2.w(r3)
            if (r1 == 0) goto L43
            r5.w(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.b.w(androidx.media3.common.Metadata, java.util.ArrayList):void");
    }

    public final long x(long j) {
        a5.a.i(j != -9223372036854775807L);
        a5.a.i(this.R != -9223372036854775807L);
        return j - this.R;
    }

    public final void y(Metadata metadata) {
        w wVar = this.J;
        z zVar = wVar.f7095a;
        g0 g0Var = zVar.O0;
        m mVar = zVar.I;
        f0 f0VarA = g0Var.a();
        int i10 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f1549a;
            if (i10 >= entryArr.length) {
                break;
            }
            entryArr[i10].k(f0VarA);
            i10++;
        }
        zVar.O0 = new g0(f0VarA);
        g0 g0VarU1 = zVar.u1();
        if (!g0VarU1.equals(zVar.f7125n0)) {
            zVar.f7125n0 = g0VarU1;
            mVar.c(14, new bf.a(7, wVar));
        }
        mVar.c(28, new bf.a(8, metadata));
        mVar.b();
    }
}
