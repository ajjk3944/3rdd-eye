package R9;

import O9.d;
import Q9.C1556t0;
import Q9.M;
import Q9.P0;
import Q9.u0;
import java.util.Iterator;
import w9.InterfaceC5748c;
import y9.C5828j;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes3.dex */
public final class v implements M9.b<u> {

    /* renamed from: a, reason: collision with root package name */
    public static final v f11819a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final C1556t0 f11820b;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    static {
        d.i kind = d.i.f10501a;
        kotlin.jvm.internal.l.f(kind, "kind");
        if (y9.q.i0("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Iterator it = u0.f11534a.keySet().iterator();
        while (it.hasNext()) {
            String strD = ((InterfaceC5748c) it.next()).d();
            kotlin.jvm.internal.l.c(strD);
            String strA = u0.a(strD);
            if ("kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase("kotlin." + strA) || "kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase(strA)) {
                throw new IllegalArgumentException(C5828j.L("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + u0.a(strA) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f11820b = new C1556t0("kotlinx.serialization.json.JsonLiteral", kind);
    }

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        i iVarJ = B7.d.c(dVar).j();
        if (iVarJ instanceof u) {
            return (u) iVarJ;
        }
        throw E.u.i(-1, "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.x.a(iVarJ.getClass()), iVarJ.toString());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11820b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        u value = (u) obj;
        kotlin.jvm.internal.l.f(value, "value");
        B7.d.d(eVar);
        boolean z10 = value.f11816b;
        String str = value.f11818d;
        if (z10) {
            eVar.G(str);
            return;
        }
        O9.e eVar2 = value.f11817c;
        if (eVar2 != null) {
            eVar.z(eVar2).G(str);
            return;
        }
        M m10 = j.f11806a;
        Long lR = y9.m.R(str);
        if (lR != null) {
            eVar.D(lR.longValue());
            return;
        }
        b9.v vVarD = T1.B.D(str);
        if (vVarD != null) {
            eVar.z(P0.f11447b).D(vVarD.f18104b);
            return;
        }
        Double dO = y9.m.O(str);
        if (dO != null) {
            eVar.g(dO.doubleValue());
            return;
        }
        Boolean boolD = j.d(value);
        if (boolD != null) {
            eVar.l(boolD.booleanValue());
        } else {
            eVar.G(str);
        }
    }
}
