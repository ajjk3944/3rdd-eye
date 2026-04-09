package Kh;

import Bh.G;
import Bh.s0;
import Qh.InterfaceC3445b;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import di.AbstractC5398g;
import di.C5393b;
import di.C5402k;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.q;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.r;
import pi.S;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f10798a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f10799b = U.k(z.a("PACKAGE", EnumSet.noneOf(r.class)), z.a("TYPE", EnumSet.of(r.CLASS, r.FILE)), z.a("ANNOTATION_TYPE", EnumSet.of(r.ANNOTATION_CLASS)), z.a("TYPE_PARAMETER", EnumSet.of(r.TYPE_PARAMETER)), z.a("FIELD", EnumSet.of(r.FIELD)), z.a("LOCAL_VARIABLE", EnumSet.of(r.LOCAL_VARIABLE)), z.a("PARAMETER", EnumSet.of(r.VALUE_PARAMETER)), z.a("CONSTRUCTOR", EnumSet.of(r.CONSTRUCTOR)), z.a("METHOD", EnumSet.of(r.FUNCTION, r.PROPERTY_GETTER, r.PROPERTY_SETTER)), z.a("TYPE_USE", EnumSet.of(r.TYPE)));

    /* renamed from: c, reason: collision with root package name */
    private static final Map f10800c = U.k(z.a("RUNTIME", q.RUNTIME), z.a("CLASS", q.BINARY), z.a("SOURCE", q.SOURCE));

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S e(G module) {
        S type;
        AbstractC6492s.i(module, "module");
        s0 s0VarB = a.b(d.f10792a.d(), module.q().o(o.a.f51817H));
        return (s0VarB == null || (type = s0VarB.getType()) == null) ? kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }

    public final AbstractC5398g b(InterfaceC3445b interfaceC3445b) {
        Qh.m mVar = interfaceC3445b instanceof Qh.m ? (Qh.m) interfaceC3445b : null;
        if (mVar == null) {
            return null;
        }
        Map map = f10800c;
        Zh.f fVarD = mVar.d();
        q qVar = (q) map.get(fVarD != null ? fVarD.b() : null);
        if (qVar == null) {
            return null;
        }
        Zh.b bVarC = Zh.b.f25401d.c(o.a.f51823K);
        Zh.f fVarH = Zh.f.h(qVar.name());
        AbstractC6492s.h(fVarH, "identifier(...)");
        return new C5402k(bVarC, fVarH);
    }

    public final Set c(String str) {
        EnumSet enumSet = (EnumSet) f10799b.get(str);
        return enumSet != null ? enumSet : d0.e();
    }

    public final AbstractC5398g d(List arguments) {
        AbstractC6492s.i(arguments, "arguments");
        ArrayList<Qh.m> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof Qh.m) {
                arrayList.add(obj);
            }
        }
        ArrayList<r> arrayList2 = new ArrayList();
        for (Qh.m mVar : arrayList) {
            f fVar = f10798a;
            Zh.f fVarD = mVar.d();
            AbstractC3689v.C(arrayList2, fVar.c(fVarD != null ? fVarD.b() : null));
        }
        ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(arrayList2, 10));
        for (r rVar : arrayList2) {
            Zh.b bVarC = Zh.b.f25401d.c(o.a.f51821J);
            Zh.f fVarH = Zh.f.h(rVar.name());
            AbstractC6492s.h(fVarH, "identifier(...)");
            arrayList3.add(new C5402k(bVarC, fVarH));
        }
        return new C5393b(arrayList3, e.f10797a);
    }
}
