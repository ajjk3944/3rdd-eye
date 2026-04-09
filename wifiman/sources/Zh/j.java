package Zh;

import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public abstract class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final b k(String str) {
        c cVarB = i.f25477a.b();
        f fVarH = f.h(str);
        AbstractC6492s.h(fVarH, "identifier(...)");
        return new b(cVarB, fVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b l(String str) {
        c cVarF = i.f25477a.f();
        f fVarH = f.h(str);
        AbstractC6492s.h(fVarH, "identifier(...)");
        return new b(cVarF, fVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b m(String str) {
        c cVarC = i.f25477a.c();
        f fVarH = f.h(str);
        AbstractC6492s.h(fVarH, "identifier(...)");
        return new b(cVarC, fVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b n(String str) {
        c cVarD = i.f25477a.d();
        f fVarH = f.h(str);
        AbstractC6492s.h(fVarH, "identifier(...)");
        return new b(cVarD, fVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(String str) {
        c cVarE = i.f25477a.e();
        f fVarH = f.h(str);
        AbstractC6492s.h(fVarH, "identifier(...)");
        return new b(cVarE, fVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map p(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            s sVarA = z.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(sVarA.h(), sVarA.j());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b q(f fVar) {
        i iVar = i.f25477a;
        c cVarF = iVar.a().f();
        f fVarH = f.h(fVar.d() + iVar.a().h().d());
        AbstractC6492s.h(fVarH, "identifier(...)");
        return new b(cVarF, fVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b r(String str) {
        c cVarG = i.f25477a.g();
        f fVarH = f.h(str);
        AbstractC6492s.h(fVarH, "identifier(...)");
        return new b(cVarG, fVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s(String str) {
        c cVarH = i.f25477a.h();
        f fVarH = f.h(str);
        AbstractC6492s.h(fVarH, "identifier(...)");
        return new b(cVarH, fVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b t(b bVar) {
        c cVarF = i.f25477a.f();
        f fVarH = f.h('U' + bVar.h().d());
        AbstractC6492s.h(fVarH, "identifier(...)");
        return new b(cVarF, fVarH);
    }
}
