package Yh;

import Uh.l;
import Uh.n;
import Uh.q;
import Uh.u;
import Wh.b;
import Xh.a;
import Yg.s;
import Yh.d;
import Zg.AbstractC3689v;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f25057a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.protobuf.f f25058b;

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.f fVarD = kotlin.reflect.jvm.internal.impl.protobuf.f.d();
        Xh.a.a(fVarD);
        AbstractC6492s.h(fVarD, "apply(...)");
        f25058b = fVarD;
    }

    private i() {
    }

    public static /* synthetic */ d.a d(i iVar, n nVar, Wh.c cVar, Wh.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return iVar.c(nVar, cVar, gVar, z10);
    }

    public static final boolean f(n proto) {
        AbstractC6492s.i(proto, "proto");
        b.C0908b c0908bA = c.f25035a.a();
        Object objJ = proto.J(Xh.a.f24346e);
        AbstractC6492s.h(objJ, "getExtension(...)");
        Boolean boolD = c0908bA.d(((Number) objJ).intValue());
        AbstractC6492s.h(boolD, "get(...)");
        return boolD.booleanValue();
    }

    private final String g(q qVar, Wh.c cVar) {
        if (qVar.v1()) {
            return b.b(cVar.a(qVar.g1()));
        }
        return null;
    }

    public static final s h(byte[] bytes, String[] strings) {
        AbstractC6492s.i(bytes, "bytes");
        AbstractC6492s.i(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new s(f25057a.k(byteArrayInputStream, strings), Uh.c.G2(byteArrayInputStream, f25058b));
    }

    public static final s i(String[] data, String[] strings) {
        AbstractC6492s.i(data, "data");
        AbstractC6492s.i(strings, "strings");
        byte[] bArrE = a.e(data);
        AbstractC6492s.h(bArrE, "decodeBytes(...)");
        return h(bArrE, strings);
    }

    public static final s j(String[] data, String[] strings) {
        AbstractC6492s.i(data, "data");
        AbstractC6492s.i(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.e(data));
        return new s(f25057a.k(byteArrayInputStream, strings), Uh.i.O1(byteArrayInputStream, f25058b));
    }

    private final f k(InputStream inputStream, String[] strArr) {
        a.e eVarE0 = a.e.E0(inputStream, f25058b);
        AbstractC6492s.h(eVarE0, "parseDelimitedFrom(...)");
        return new f(eVarE0, strArr);
    }

    public static final s l(byte[] bytes, String[] strings) {
        AbstractC6492s.i(bytes, "bytes");
        AbstractC6492s.i(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new s(f25057a.k(byteArrayInputStream, strings), l.n1(byteArrayInputStream, f25058b));
    }

    public static final s m(String[] data, String[] strings) {
        AbstractC6492s.i(data, "data");
        AbstractC6492s.i(strings, "strings");
        byte[] bArrE = a.e(data);
        AbstractC6492s.h(bArrE, "decodeBytes(...)");
        return l(bArrE, strings);
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.f a() {
        return f25058b;
    }

    public final d.b b(Uh.d proto, Wh.c nameResolver, Wh.g typeTable) {
        String strZ0;
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        h.f constructorSignature = Xh.a.f24342a;
        AbstractC6492s.h(constructorSignature, "constructorSignature");
        a.c cVar = (a.c) Wh.e.a(proto, constructorSignature);
        String string = (cVar == null || !cVar.d0()) ? "<init>" : nameResolver.getString(cVar.S());
        if (cVar == null || !cVar.T()) {
            List listW0 = proto.W0();
            AbstractC6492s.h(listW0, "getValueParameterList(...)");
            List<u> list = listW0;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (u uVar : list) {
                i iVar = f25057a;
                AbstractC6492s.f(uVar);
                String strG = iVar.g(Wh.f.q(uVar, typeTable), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList.add(strG);
            }
            strZ0 = AbstractC3689v.z0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strZ0 = nameResolver.getString(cVar.P());
        }
        return new d.b(string, strZ0);
    }

    public final d.a c(n proto, Wh.c nameResolver, Wh.g typeTable, boolean z10) {
        String strG;
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        h.f propertySignature = Xh.a.f24345d;
        AbstractC6492s.h(propertySignature, "propertySignature");
        a.d dVar = (a.d) Wh.e.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        a.b bVarF0 = dVar.K0() ? dVar.f0() : null;
        if (bVarF0 == null && z10) {
            return null;
        }
        int iM1 = (bVarF0 == null || !bVarF0.d0()) ? proto.m1() : bVarF0.S();
        if (bVarF0 == null || !bVarF0.T()) {
            strG = g(Wh.f.n(proto, typeTable), nameResolver);
            if (strG == null) {
                return null;
            }
        } else {
            strG = nameResolver.getString(bVarF0.P());
        }
        return new d.a(nameResolver.getString(iM1), strG);
    }

    public final d.b e(Uh.i proto, Wh.c nameResolver, Wh.g typeTable) {
        String string;
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        h.f methodSignature = Xh.a.f24343b;
        AbstractC6492s.h(methodSignature, "methodSignature");
        a.c cVar = (a.c) Wh.e.a(proto, methodSignature);
        int iN1 = (cVar == null || !cVar.d0()) ? proto.n1() : cVar.S();
        if (cVar == null || !cVar.T()) {
            List listP = AbstractC3689v.p(Wh.f.k(proto, typeTable));
            List listZ1 = proto.z1();
            AbstractC6492s.h(listZ1, "getValueParameterList(...)");
            List<u> list = listZ1;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (u uVar : list) {
                AbstractC6492s.f(uVar);
                arrayList.add(Wh.f.q(uVar, typeTable));
            }
            List listM0 = AbstractC3689v.M0(listP, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(listM0, 10));
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                String strG = f25057a.g((q) it.next(), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList2.add(strG);
            }
            String strG2 = g(Wh.f.m(proto, typeTable), nameResolver);
            if (strG2 == null) {
                return null;
            }
            string = AbstractC3689v.z0(arrayList2, "", "(", ")", 0, null, null, 56, null) + strG2;
        } else {
            string = nameResolver.getString(cVar.P());
        }
        return new d.b(nameResolver.getString(iN1), string);
    }
}
