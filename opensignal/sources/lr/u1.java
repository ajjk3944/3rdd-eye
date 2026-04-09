package lr;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* loaded from: classes.dex */
public class u1 extends br.y {
    public static d0 j(br.d dVar) {
        ir.f fVarZ = dVar.z();
        return fVarZ instanceof d0 ? (d0) fVarZ : d.f15605d;
    }

    @Override // br.y
    public final ir.g a(br.j jVar) {
        d0 d0VarJ = j(jVar);
        String name = jVar.getName();
        String strB = jVar.B();
        Object obj = jVar.f2904d;
        br.l.e(name, "name");
        br.l.e(strB, "signature");
        return new f0(d0VarJ, name, strB, null, obj);
    }

    @Override // br.y
    public final ir.d b(Class cls) {
        return c.a(cls);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [ar.k, br.n] */
    @Override // br.y
    public final ir.f c(Class cls, String str) {
        Object objPutIfAbsent;
        i4.b bVar = c.f15603a;
        br.l.e(cls, "jClass");
        i4.b bVar2 = c.f15604b;
        bVar2.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) bVar2.f11197d;
        Object objA = concurrentHashMap.get(cls);
        if (objA == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (objA = ((br.n) bVar2.f11196a).a(cls)))) != null) {
            objA = objPutIfAbsent;
        }
        return (ir.f) objA;
    }

    @Override // br.y
    public final ir.j d(br.o oVar) {
        return new j0(j(oVar), oVar.f2906r, oVar.f2907x, oVar.f2904d);
    }

    @Override // br.y
    public final ir.q e(bu.i iVar) {
        return new w0(j(iVar), iVar.f2906r, iVar.f2907x, iVar.f2904d);
    }

    @Override // br.y
    public final ir.s f(br.q qVar) {
        return new z0(j(qVar), qVar.f2906r, qVar.f2907x, qVar.f2904d);
    }

    @Override // br.y
    public final ir.u g(br.r rVar) {
        return new c1(j(rVar), rVar.f2906r, rVar.f2907x);
    }

    @Override // br.y
    public final String h(br.i iVar) throws IOException {
        f0 f0VarB;
        Metadata metadata = (Metadata) iVar.getClass().getAnnotation(Metadata.class);
        f0 f0Var = null;
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strArrD2 = metadata.d2();
                rs.g gVar = ps.i.f20642a;
                br.l.e(strArrD2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ps.a.a(strArrD1));
                rs.g gVar2 = ps.i.f20642a;
                ps.g gVarG = ps.i.g(byteArrayInputStream, strArrD2);
                rs.g gVar3 = ps.i.f20642a;
                ls.a aVar = ls.y.R;
                aVar.getClass();
                f5.u uVar = new f5.u(byteArrayInputStream);
                rs.b bVar = (rs.b) aVar.a(uVar, gVar3);
                try {
                    uVar.c(0);
                    if (!bVar.b()) {
                        rs.t tVar = new rs.t(new bf.n().getMessage());
                        tVar.f21776a = bVar;
                        throw tVar;
                    }
                    ls.y yVar = (ls.y) bVar;
                    ps.f fVar = new ps.f(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = iVar.getClass();
                    ls.w0 w0Var = yVar.L;
                    br.l.d(w0Var, "proto.typeTable");
                    f0Var = new f0(d.f15605d, (ur.k0) z1.f(cls, yVar, gVarG, new h7.h0(w0Var), fVar, kr.a.E));
                } catch (rs.t e4) {
                    e4.f21776a = bVar;
                    throw e4;
                }
            }
        }
        if (f0Var == null || (f0VarB = z1.b(f0Var)) == null) {
            return super.h(iVar);
        }
        ss.j jVar = w1.f15712a;
        rr.u uVarG = f0VarB.C();
        StringBuilder sb2 = new StringBuilder();
        w1.a(sb2, uVarG);
        List listY = uVarG.Y();
        br.l.d(listY, "invoke.valueParameters");
        mq.o.w0(listY, sb2, ", ", "(", ")", b.F, 48);
        sb2.append(" -> ");
        ht.x xVarI = uVarG.i();
        br.l.b(xVarI);
        sb2.append(w1.d(xVarI));
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // br.y
    public final String i(br.n nVar) {
        return h(nVar);
    }
}
