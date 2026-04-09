package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yz {

    /* renamed from: a, reason: collision with root package name */
    public final x41 f18934a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18935b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f18936c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f18937d;

    public yz(x41 x41Var) {
        this.f18934a = x41Var;
        j00 j00Var = j00.f12557e;
        this.f18937d = false;
    }

    public final j00 a(j00 j00Var) {
        if (j00Var.equals(j00.f12557e)) {
            throw new f10("Unhandled input format:", j00Var);
        }
        int i4 = 0;
        while (true) {
            x41 x41Var = this.f18934a;
            if (i4 >= x41Var.size()) {
                return j00Var;
            }
            q10 q10Var = (q10) x41Var.get(i4);
            j00 j00VarB = q10Var.b(j00Var);
            if (q10Var.zzc()) {
                mq0.c0(!j00VarB.equals(r0));
                j00Var = j00VarB;
            }
            i4++;
        }
    }

    public final void b(v00 v00Var) {
        ArrayList arrayList = this.f18935b;
        arrayList.clear();
        this.f18937d = false;
        long jG = v00Var.f17410a;
        int i4 = 0;
        while (true) {
            x41 x41Var = this.f18934a;
            if (i4 >= x41Var.size()) {
                break;
            }
            q10 q10Var = (q10) x41Var.get(i4);
            new v00(jG);
            q10Var.C1();
            if (q10Var.zzc()) {
                jG = q10Var.g(jG);
                mq0.c0(jG >= 0);
                arrayList.add(q10Var);
            }
            i4++;
        }
        this.f18936c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= f(); i10++) {
            this.f18936c[i10] = ((q10) arrayList.get(i10)).d();
        }
    }

    public final boolean c() {
        return !this.f18935b.isEmpty();
    }

    public final boolean d() {
        return this.f18937d && ((q10) this.f18935b.get(f())).e() && !this.f18936c[f()].hasRemaining();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z3;
        do {
            int i4 = 0;
            z3 = false;
            while (i4 <= f()) {
                if (!this.f18936c[i4].hasRemaining()) {
                    ArrayList arrayList = this.f18935b;
                    q10 q10Var = (q10) arrayList.get(i4);
                    if (!q10Var.e()) {
                        ByteBuffer byteBuffer2 = i4 > 0 ? this.f18936c[i4 - 1] : byteBuffer.hasRemaining() ? byteBuffer : q10.f15188a;
                        long jRemaining = byteBuffer2.remaining();
                        q10Var.a(byteBuffer2);
                        this.f18936c[i4] = q10Var.d();
                        boolean z10 = true;
                        if (jRemaining - byteBuffer2.remaining() <= 0 && !this.f18936c[i4].hasRemaining()) {
                            z10 = false;
                        }
                        z3 |= z10;
                    } else if (!this.f18936c[i4].hasRemaining() && i4 < f()) {
                        ((q10) arrayList.get(i4 + 1)).c();
                    }
                }
                i4++;
            }
        } while (z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz)) {
            return false;
        }
        x41 x41Var = this.f18934a;
        int size = x41Var.size();
        x41 x41Var2 = ((yz) obj).f18934a;
        if (size != x41Var2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < x41Var.size(); i4++) {
            if (x41Var.get(i4) != x41Var2.get(i4)) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.f18936c.length - 1;
    }

    public final int hashCode() {
        return this.f18934a.hashCode();
    }
}
