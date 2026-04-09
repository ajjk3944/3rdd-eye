package li;

import Bh.InterfaceC2503m;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import ni.InterfaceC6987s;

/* renamed from: li.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6638p {

    /* renamed from: a, reason: collision with root package name */
    private final C6636n f52739a;

    /* renamed from: b, reason: collision with root package name */
    private final Wh.c f52740b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2503m f52741c;

    /* renamed from: d, reason: collision with root package name */
    private final Wh.g f52742d;

    /* renamed from: e, reason: collision with root package name */
    private final Wh.h f52743e;

    /* renamed from: f, reason: collision with root package name */
    private final Wh.a f52744f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6987s f52745g;

    /* renamed from: h, reason: collision with root package name */
    private final C6620X f52746h;

    /* renamed from: i, reason: collision with root package name */
    private final C6608K f52747i;

    public C6638p(C6636n components, Wh.c nameResolver, InterfaceC2503m containingDeclaration, Wh.g typeTable, Wh.h versionRequirementTable, Wh.a metadataVersion, InterfaceC6987s interfaceC6987s, C6620X c6620x, List typeParameters) {
        String strC;
        AbstractC6492s.i(components, "components");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        AbstractC6492s.i(typeTable, "typeTable");
        AbstractC6492s.i(versionRequirementTable, "versionRequirementTable");
        AbstractC6492s.i(metadataVersion, "metadataVersion");
        AbstractC6492s.i(typeParameters, "typeParameters");
        this.f52739a = components;
        this.f52740b = nameResolver;
        this.f52741c = containingDeclaration;
        this.f52742d = typeTable;
        this.f52743e = versionRequirementTable;
        this.f52744f = metadataVersion;
        this.f52745g = interfaceC6987s;
        this.f52746h = new C6620X(this, c6620x, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (interfaceC6987s == null || (strC = interfaceC6987s.c()) == null) ? "[container not found]" : strC);
        this.f52747i = new C6608K(this);
    }

    public static /* synthetic */ C6638p b(C6638p c6638p, InterfaceC2503m interfaceC2503m, List list, Wh.c cVar, Wh.g gVar, Wh.h hVar, Wh.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = c6638p.f52740b;
        }
        Wh.c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            gVar = c6638p.f52742d;
        }
        Wh.g gVar2 = gVar;
        if ((i10 & 16) != 0) {
            hVar = c6638p.f52743e;
        }
        Wh.h hVar2 = hVar;
        if ((i10 & 32) != 0) {
            aVar = c6638p.f52744f;
        }
        return c6638p.a(interfaceC2503m, list, cVar2, gVar2, hVar2, aVar);
    }

    public final C6638p a(InterfaceC2503m descriptor, List typeParameterProtos, Wh.c nameResolver, Wh.g typeTable, Wh.h hVar, Wh.a metadataVersion) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(typeParameterProtos, "typeParameterProtos");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        Wh.h versionRequirementTable = hVar;
        AbstractC6492s.i(versionRequirementTable, "versionRequirementTable");
        AbstractC6492s.i(metadataVersion, "metadataVersion");
        C6636n c6636n = this.f52739a;
        if (!Wh.i.b(metadataVersion)) {
            versionRequirementTable = this.f52743e;
        }
        return new C6638p(c6636n, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, this.f52745g, this.f52746h, typeParameterProtos);
    }

    public final C6636n c() {
        return this.f52739a;
    }

    public final InterfaceC6987s d() {
        return this.f52745g;
    }

    public final InterfaceC2503m e() {
        return this.f52741c;
    }

    public final C6608K f() {
        return this.f52747i;
    }

    public final Wh.c g() {
        return this.f52740b;
    }

    public final oi.n h() {
        return this.f52739a.u();
    }

    public final C6620X i() {
        return this.f52746h;
    }

    public final Wh.g j() {
        return this.f52742d;
    }

    public final Wh.h k() {
        return this.f52743e;
    }
}
