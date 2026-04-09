package j6;

import a0.x0;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends o {
    public ArrayList C;
    public boolean D;
    public int E;
    public boolean F;
    public int G;
    public o[] H;

    @Override // j6.o
    public final void A(View view) {
        super.A(view);
        o[] oVarArr = this.H;
        this.H = null;
        if (oVarArr == null) {
            oVarArr = new o[this.C.size()];
        }
        o[] oVarArr2 = (o[]) this.C.toArray(oVarArr);
        int size = this.C.size();
        for (int i4 = 0; i4 < size; i4++) {
            oVarArr2[i4].A(view);
        }
        Arrays.fill(oVarArr2, (Object) null);
        this.H = oVarArr2;
    }

    @Override // j6.o
    public final void B() {
        if (this.C.isEmpty()) {
            J();
            m();
            return;
        }
        t tVar = new t();
        tVar.f27455b = this;
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        int i4 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o) obj).a(tVar);
        }
        this.E = this.C.size();
        if (this.D) {
            ArrayList arrayList2 = this.C;
            int size2 = arrayList2.size();
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                ((o) obj2).B();
            }
            return;
        }
        for (int i11 = 1; i11 < this.C.size(); i11++) {
            ((o) this.C.get(i11 - 1)).a(new t((o) this.C.get(i11), 2));
        }
        o oVar = (o) this.C.get(0);
        if (oVar != null) {
            oVar.B();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // j6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.a.C(long, long):void");
    }

    @Override // j6.o
    public final void D(long j) {
        ArrayList arrayList;
        this.f27427c = j;
        if (j < 0 || (arrayList = this.C) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.C.get(i4)).D(j);
        }
    }

    @Override // j6.o
    public final void E(i0 i0Var) {
        this.G |= 8;
        int size = this.C.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.C.get(i4)).E(i0Var);
        }
    }

    @Override // j6.o
    public final void F(TimeInterpolator timeInterpolator) {
        this.G |= 1;
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((o) this.C.get(i4)).F(timeInterpolator);
            }
        }
        this.f27428d = timeInterpolator;
    }

    @Override // j6.o
    public final void G(i iVar) {
        super.G(iVar);
        this.G |= 4;
        if (this.C != null) {
            for (int i4 = 0; i4 < this.C.size(); i4++) {
                ((o) this.C.get(i4)).G(iVar);
            }
        }
    }

    @Override // j6.o
    public final void H() {
        this.G |= 2;
        int size = this.C.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.C.get(i4)).H();
        }
    }

    @Override // j6.o
    public final void I(long j) {
        this.f27426b = j;
    }

    @Override // j6.o
    public final String K(String str) {
        String strK = super.K(str);
        for (int i4 = 0; i4 < this.C.size(); i4++) {
            StringBuilder sbB = i3.e.b(strK, "\n");
            sbB.append(((o) this.C.get(i4)).K(str + "  "));
            strK = sbB.toString();
        }
        return strK;
    }

    public final void L(o oVar) {
        this.C.add(oVar);
        oVar.f27432i = this;
        long j = this.f27427c;
        if (j >= 0) {
            oVar.D(j);
        }
        if ((this.G & 1) != 0) {
            oVar.F(this.f27428d);
        }
        if ((this.G & 2) != 0) {
            oVar.H();
        }
        if ((this.G & 4) != 0) {
            oVar.G(this.f27444v);
        }
        if ((this.G & 8) != 0) {
            oVar.E(null);
        }
    }

    @Override // j6.o
    public final void cancel() {
        super.cancel();
        o[] oVarArr = this.H;
        this.H = null;
        if (oVarArr == null) {
            oVarArr = new o[this.C.size()];
        }
        o[] oVarArr2 = (o[]) this.C.toArray(oVarArr);
        int size = this.C.size();
        for (int i4 = 0; i4 < size; i4++) {
            oVarArr2[i4].cancel();
        }
        Arrays.fill(oVarArr2, (Object) null);
        this.H = oVarArr2;
    }

    @Override // j6.o
    public final void d(v vVar) {
        View view = vVar.f27458b;
        if (u(view)) {
            ArrayList arrayList = this.C;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                o oVar = (o) obj;
                if (oVar.u(view)) {
                    oVar.d(vVar);
                    vVar.f27459c.add(oVar);
                }
            }
        }
    }

    @Override // j6.o
    public final void f(v vVar) {
        int size = this.C.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.C.get(i4)).f(vVar);
        }
    }

    @Override // j6.o
    public final void g(v vVar) {
        View view = vVar.f27458b;
        if (u(view)) {
            ArrayList arrayList = this.C;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                o oVar = (o) obj;
                if (oVar.u(view)) {
                    oVar.g(vVar);
                    vVar.f27459c.add(oVar);
                }
            }
        }
    }

    @Override // j6.o
    /* renamed from: j */
    public final o clone() {
        a aVar = (a) super.clone();
        aVar.C = new ArrayList();
        int size = this.C.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVarClone = ((o) this.C.get(i4)).clone();
            aVar.C.add(oVarClone);
            oVarClone.f27432i = aVar;
        }
        return aVar;
    }

    @Override // j6.o
    public final void l(ViewGroup viewGroup, x0 x0Var, x0 x0Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f27426b;
        int size = this.C.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) this.C.get(i4);
            if (j > 0 && (this.D || i4 == 0)) {
                long j8 = oVar.f27426b;
                if (j8 > 0) {
                    oVar.I(j8 + j);
                } else {
                    oVar.I(j);
                }
            }
            oVar.l(viewGroup, x0Var, x0Var2, arrayList, arrayList2);
        }
    }

    @Override // j6.o
    public final boolean s() {
        for (int i4 = 0; i4 < this.C.size(); i4++) {
            if (((o) this.C.get(i4)).s()) {
                return true;
            }
        }
        return false;
    }

    @Override // j6.o
    public final void x(View view) {
        super.x(view);
        int size = this.C.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.C.get(i4)).x(view);
        }
    }

    @Override // j6.o
    public final void y() {
        this.f27445w = 0L;
        int i4 = 0;
        t tVar = new t(this, i4);
        while (i4 < this.C.size()) {
            o oVar = (o) this.C.get(i4);
            oVar.a(tVar);
            oVar.y();
            long j = oVar.f27445w;
            if (this.D) {
                this.f27445w = Math.max(this.f27445w, j);
            } else {
                long j8 = this.f27445w;
                oVar.f27446x = j8;
                this.f27445w = j8 + j;
            }
            i4++;
        }
    }

    @Override // j6.o
    public final o z(m mVar) {
        super.z(mVar);
        return this;
    }
}
