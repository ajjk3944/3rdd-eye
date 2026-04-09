package Sh;

import Bh.h0;
import gi.C5922d;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import li.C6647y;
import ni.EnumC6986r;
import ni.InterfaceC6987s;

/* loaded from: classes4.dex */
public final class r implements InterfaceC6987s {

    /* renamed from: b, reason: collision with root package name */
    private final C5922d f20787b;

    /* renamed from: c, reason: collision with root package name */
    private final C5922d f20788c;

    /* renamed from: d, reason: collision with root package name */
    private final C6647y f20789d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20790e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC6986r f20791f;

    /* renamed from: g, reason: collision with root package name */
    private final x f20792g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20793h;

    public r(C5922d className, C5922d c5922d, Uh.l packageProto, Wh.c nameResolver, C6647y c6647y, boolean z10, EnumC6986r abiStability, x xVar) {
        String string;
        AbstractC6492s.i(className, "className");
        AbstractC6492s.i(packageProto, "packageProto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(abiStability, "abiStability");
        this.f20787b = className;
        this.f20788c = c5922d;
        this.f20789d = c6647y;
        this.f20790e = z10;
        this.f20791f = abiStability;
        this.f20792g = xVar;
        h.f packageModuleName = Xh.a.f24354m;
        AbstractC6492s.h(packageModuleName, "packageModuleName");
        Integer num = (Integer) Wh.e.a(packageProto, packageModuleName);
        this.f20793h = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // Bh.g0
    public h0 a() {
        h0 NO_SOURCE_FILE = h0.f1785a;
        AbstractC6492s.h(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Override // ni.InterfaceC6987s
    public String c() {
        return "Class '" + d().a().b() + '\'';
    }

    public final Zh.b d() {
        Zh.c cVarG = e().g();
        AbstractC6492s.h(cVarG, "getPackageFqName(...)");
        return new Zh.b(cVarG, h());
    }

    public C5922d e() {
        return this.f20787b;
    }

    public C5922d f() {
        return this.f20788c;
    }

    public final x g() {
        return this.f20792g;
    }

    public final Zh.f h() {
        String strF = e().f();
        AbstractC6492s.h(strF, "getInternalName(...)");
        Zh.f fVarH = Zh.f.h(kotlin.text.t.g1(strF, '/', null, 2, null));
        AbstractC6492s.h(fVarH, "identifier(...)");
        return fVarH;
    }

    public String toString() {
        return r.class.getSimpleName() + ": " + e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(x kotlinClass, Uh.l packageProto, Wh.c nameResolver, C6647y c6647y, boolean z10, EnumC6986r abiStability) {
        AbstractC6492s.i(kotlinClass, "kotlinClass");
        AbstractC6492s.i(packageProto, "packageProto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(abiStability, "abiStability");
        C5922d c5922dB = C5922d.b(kotlinClass.b());
        AbstractC6492s.h(c5922dB, "byClassId(...)");
        String strE = kotlinClass.a().e();
        C5922d c5922dD = null;
        if (strE != null && strE.length() > 0) {
            c5922dD = C5922d.d(strE);
        }
        this(c5922dB, c5922dD, packageProto, nameResolver, c6647y, z10, abiStability, kotlinClass);
    }
}
