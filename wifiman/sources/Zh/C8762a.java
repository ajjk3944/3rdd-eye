package zh;

import Bh.G;
import Bh.InterfaceC2495e;
import Zg.AbstractC3689v;
import Zg.d0;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import oi.n;
import zh.C8768g;

/* renamed from: zh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8762a implements Ch.b {

    /* renamed from: a, reason: collision with root package name */
    private final n f67291a;

    /* renamed from: b, reason: collision with root package name */
    private final G f67292b;

    public C8762a(n storageManager, G module) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(module, "module");
        this.f67291a = storageManager;
        this.f67292b = module;
    }

    @Override // Ch.b
    public boolean a(Zh.c packageFqName, Zh.f name) {
        AbstractC6492s.i(packageFqName, "packageFqName");
        AbstractC6492s.i(name, "name");
        String strB = name.b();
        AbstractC6492s.h(strB, "asString(...)");
        return (t.P(strB, "Function", false, 2, null) || t.P(strB, "KFunction", false, 2, null) || t.P(strB, "SuspendFunction", false, 2, null) || t.P(strB, "KSuspendFunction", false, 2, null)) && C8768g.f67314c.a().c(packageFqName, strB) != null;
    }

    @Override // Ch.b
    public InterfaceC2495e b(Zh.b classId) {
        Zh.c cVarF;
        C8768g.b bVarC;
        AbstractC6492s.i(classId, "classId");
        if (classId.i() || classId.j()) {
            return null;
        }
        String strB = classId.g().b();
        AbstractC6492s.h(strB, "asString(...)");
        if (!t.W(strB, "Function", false, 2, null) || (bVarC = C8768g.f67314c.a().c((cVarF = classId.f()), strB)) == null) {
            return null;
        }
        AbstractC8767f abstractC8767fA = bVarC.a();
        int iB = bVarC.b();
        List listJ = this.f67292b.y(cVarF).J();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        AbstractC5487d.a(AbstractC3689v.s0(arrayList2));
        return new C8763b(this.f67291a, (kotlin.reflect.jvm.internal.impl.builtins.c) AbstractC3689v.q0(arrayList), abstractC8767fA, iB);
    }

    @Override // Ch.b
    public Collection c(Zh.c packageFqName) {
        AbstractC6492s.i(packageFqName, "packageFqName");
        return d0.e();
    }
}
