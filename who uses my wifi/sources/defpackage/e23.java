package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e23 {
    public final s62 a;
    public final fr b;
    public final j51 c;
    public final cx2 d;
    public fd1 e;
    public t2 f;
    public d3[] g;
    public b8 h;
    public ba2 i;
    public l51 j;
    public String k;
    public final r9 l;
    public boolean m;
    public final AtomicLong n;

    public e23(r9 r9Var) {
        fr frVar = fr.s;
        this.a = new s62();
        this.c = new j51();
        this.d = new cx2(this);
        this.n = new AtomicLong();
        this.l = r9Var;
        this.b = frVar;
        this.i = null;
        new AtomicBoolean(false);
    }

    public static xe4 a(Context context, d3[] d3VarArr) {
        for (d3 d3Var : d3VarArr) {
            if (d3Var.equals(d3.k)) {
                return new xe4("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        xe4 xe4Var = new xe4(context, d3VarArr);
        xe4Var.o = false;
        return xe4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2 A[Catch: RemoteException -> 0x00d0, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d0, blocks: (B:28:0x009e, B:30:0x00a4, B:32:0x00b2, B:34:0x00c4, B:37:0x00d2), top: B:54:0x009e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.e13 r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e23.b(e13):void");
    }

    public final void c(fd1 fd1Var) {
        try {
            this.e = fd1Var;
            ba2 ba2Var = this.i;
            if (ba2Var != null) {
                ba2Var.H2(fd1Var != null ? new tu1(fd1Var) : null);
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    public final void d(d3... d3VarArr) {
        r9 r9Var = this.l;
        this.g = d3VarArr;
        try {
            ba2 ba2Var = this.i;
            if (ba2Var != null) {
                ba2Var.N0(a(r9Var.getContext(), this.g));
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
        r9Var.requestLayout();
    }

    public final void e(b8 b8Var) {
        try {
            this.h = b8Var;
            ba2 ba2Var = this.i;
            if (ba2Var != null) {
                ba2Var.I0(b8Var != null ? new tv1(b8Var) : null);
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }
}
