package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Bh.G;
import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import di.C5392a;
import di.C5393b;
import di.C5402k;
import di.x;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import pi.AbstractC7346d0;
import pi.N0;
import pi.S;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Zh.f f51909a;

    /* renamed from: b, reason: collision with root package name */
    private static final Zh.f f51910b;

    /* renamed from: c, reason: collision with root package name */
    private static final Zh.f f51911c;

    /* renamed from: d, reason: collision with root package name */
    private static final Zh.f f51912d;

    /* renamed from: e, reason: collision with root package name */
    private static final Zh.f f51913e;

    static {
        Zh.f fVarH = Zh.f.h("message");
        AbstractC6492s.h(fVarH, "identifier(...)");
        f51909a = fVarH;
        Zh.f fVarH2 = Zh.f.h("replaceWith");
        AbstractC6492s.h(fVarH2, "identifier(...)");
        f51910b = fVarH2;
        Zh.f fVarH3 = Zh.f.h("level");
        AbstractC6492s.h(fVarH3, "identifier(...)");
        f51911c = fVarH3;
        Zh.f fVarH4 = Zh.f.h("expression");
        AbstractC6492s.h(fVarH4, "identifier(...)");
        f51912d = fVarH4;
        Zh.f fVarH5 = Zh.f.h("imports");
        AbstractC6492s.h(fVarH5, "identifier(...)");
        f51913e = fVarH5;
    }

    public static final c b(kotlin.reflect.jvm.internal.impl.builtins.i iVar, String message, String replaceWith, String level, boolean z10) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(message, "message");
        AbstractC6492s.i(replaceWith, "replaceWith");
        AbstractC6492s.i(level, "level");
        l lVar = new l(iVar, o.a.f51805B, U.k(z.a(f51912d, new x(replaceWith)), z.a(f51913e, new C5393b(AbstractC3689v.l(), new f(iVar)))), false, 8, null);
        Zh.c cVar = o.a.f51892y;
        s sVarA = z.a(f51909a, new x(message));
        s sVarA2 = z.a(f51910b, new C5392a(lVar));
        Zh.f fVar = f51911c;
        Zh.b bVarC = Zh.b.f25401d.c(o.a.f51803A);
        Zh.f fVarH = Zh.f.h(level);
        AbstractC6492s.h(fVarH, "identifier(...)");
        return new l(iVar, cVar, U.k(sVarA, sVarA2, z.a(fVar, new C5402k(bVarC, fVarH))), z10);
    }

    public static /* synthetic */ c c(kotlin.reflect.jvm.internal.impl.builtins.i iVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return b(iVar, str, str2, str3, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S d(kotlin.reflect.jvm.internal.impl.builtins.i iVar, G module) {
        AbstractC6492s.i(module, "module");
        AbstractC7346d0 abstractC7346d0L = module.q().l(N0.INVARIANT, iVar.W());
        AbstractC6492s.h(abstractC7346d0L, "getArrayType(...)");
        return abstractC7346d0L;
    }
}
