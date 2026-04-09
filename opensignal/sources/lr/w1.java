package lr;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ss.j f15712a = ss.j.f22243c;

    public static void a(StringBuilder sb2, rr.d dVar) {
        ur.v vVarG = z1.g(dVar);
        ur.v vVarJ0 = dVar.j0();
        if (vVarG != null) {
            sb2.append(d(vVarG.getType()));
            sb2.append(".");
        }
        boolean z10 = (vVarG == null || vVarJ0 == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        if (vVarJ0 != null) {
            sb2.append(d(vVarJ0.getType()));
            sb2.append(".");
        }
        if (z10) {
            sb2.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(rr.u uVar) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        a(sb2, uVar);
        qs.g name = ((ur.n) uVar).getName();
        br.l.d(name, "descriptor.name");
        sb2.append(f15712a.O(name, true));
        List listY = uVar.Y();
        br.l.d(listY, "descriptor.valueParameters");
        mq.o.w0(listY, sb2, ", ", "(", ")", b.E, 48);
        sb2.append(": ");
        ht.x xVarI = uVar.i();
        br.l.b(xVarI);
        sb2.append(d(xVarI));
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static String c(rr.m0 m0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m0Var.i0() ? "var " : "val ");
        a(sb2, m0Var);
        qs.g name = m0Var.getName();
        br.l.d(name, "descriptor.name");
        sb2.append(f15712a.O(name, true));
        sb2.append(": ");
        ht.x type = m0Var.getType();
        br.l.d(type, "descriptor.type");
        sb2.append(d(type));
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static String d(ht.x xVar) {
        br.l.e(xVar, "type");
        return f15712a.Y(xVar);
    }
}
