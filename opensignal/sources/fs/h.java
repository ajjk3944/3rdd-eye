package fs;

import at.n;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import ht.b0;
import ht.c1;
import ht.i0;
import ht.p0;
import ht.r;
import ht.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.o;
import mq.p;
import rr.i;
import ss.j;

/* loaded from: classes.dex */
public final class h extends r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b0 b0Var, b0 b0Var2) {
        super(b0Var, b0Var2);
        l.e(b0Var, "lowerBound");
        l.e(b0Var2, "upperBound");
        jt.d.f13840a.b(b0Var, b0Var2);
    }

    public static final ArrayList C0(j jVar, x xVar) throws IOException {
        List<p0> listL = xVar.L();
        ArrayList arrayList = new ArrayList(p.a0(listL, 10));
        for (p0 p0Var : listL) {
            l.e(p0Var, "typeProjection");
            StringBuilder sb2 = new StringBuilder();
            o.w0(e5.H(p0Var), sb2, ", ", null, null, new ss.h(jVar, 0), 60);
            String string = sb2.toString();
            l.d(string, "StringBuilder().apply(builderAction).toString()");
            arrayList.add(string);
        }
        return arrayList;
    }

    public static final String E0(String str, String str2) {
        if (!tt.l.r0(str, '<')) {
            return str;
        }
        return tt.l.U0(str, '<') + '<' + str2 + '>' + tt.l.T0('>', str, str);
    }

    @Override // ht.r, ht.x
    public final n W() {
        i iVarP = Z().p();
        rr.f fVar = iVarP instanceof rr.f ? (rr.f) iVarP : null;
        if (fVar != null) {
            n nVarE0 = fVar.e0(new f());
            l.d(nVarE0, "classDescriptor.getMemberScope(RawSubstitution())");
            return nVarE0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + Z().p()).toString());
    }

    @Override // ht.x
    /* renamed from: h0 */
    public final x q0(jt.f fVar) {
        l.e(fVar, "kotlinTypeRefiner");
        b0 b0Var = this.f10938d;
        l.e(b0Var, "type");
        b0 b0Var2 = this.f10939g;
        l.e(b0Var2, "type");
        return new h(b0Var, b0Var2);
    }

    @Override // ht.c1
    public final c1 p0(boolean z10) {
        return new h(this.f10938d.p0(z10), this.f10939g.p0(z10));
    }

    @Override // ht.c1
    public final c1 q0(jt.f fVar) {
        l.e(fVar, "kotlinTypeRefiner");
        b0 b0Var = this.f10938d;
        l.e(b0Var, "type");
        b0 b0Var2 = this.f10939g;
        l.e(b0Var2, "type");
        return new h(b0Var, b0Var2);
    }

    @Override // ht.c1
    public final c1 r0(i0 i0Var) {
        l.e(i0Var, "newAttributes");
        return new h(this.f10938d.r0(i0Var), this.f10939g.r0(i0Var));
    }

    @Override // ht.r
    public final b0 u0() {
        return this.f10938d;
    }

    @Override // ht.r
    public final String v0(j jVar, j jVar2) throws IOException {
        b0 b0Var = this.f10938d;
        String strY = jVar.Y(b0Var);
        b0 b0Var2 = this.f10939g;
        String strY2 = jVar.Y(b0Var2);
        if (jVar2.f22246a.n()) {
            return "raw (" + strY + ".." + strY2 + ')';
        }
        if (b0Var2.L().isEmpty()) {
            return jVar.F(strY, strY2, se.b.A(this));
        }
        ArrayList arrayListC0 = C0(jVar, b0Var);
        ArrayList arrayListC02 = C0(jVar, b0Var2);
        String strX0 = o.x0(arrayListC0, ", ", null, null, g.f9067d, 30);
        ArrayList arrayListW0 = o.W0(arrayListC0, arrayListC02);
        if (arrayListW0.isEmpty()) {
            strY2 = E0(strY2, strX0);
        } else {
            Iterator it = arrayListW0.iterator();
            while (it.hasNext()) {
                lq.l lVar = (lq.l) it.next();
                String str = (String) lVar.f15571a;
                String str2 = (String) lVar.f15572d;
                if (!l.a(str, tt.l.J0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
            strY2 = E0(strY2, strX0);
        }
        String strE0 = E0(strY, strX0);
        return l.a(strE0, strY2) ? strE0 : jVar.F(strE0, strY2, se.b.A(this));
    }
}
