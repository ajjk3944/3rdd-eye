package li;

import Bh.g0;
import Zg.AbstractC3689v;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import ni.C6962M;
import ni.InterfaceC6987s;

/* renamed from: li.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6643u extends AbstractC6640r {

    /* renamed from: h, reason: collision with root package name */
    private final Wh.a f52752h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC6987s f52753i;

    /* renamed from: j, reason: collision with root package name */
    private final Wh.d f52754j;

    /* renamed from: k, reason: collision with root package name */
    private final C6610M f52755k;

    /* renamed from: l, reason: collision with root package name */
    private Uh.m f52756l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC6164k f52757m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6643u(Zh.c fqName, oi.n storageManager, Bh.G module, Uh.m proto, Wh.a metadataVersion, InterfaceC6987s interfaceC6987s) {
        super(fqName, storageManager, module);
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(metadataVersion, "metadataVersion");
        this.f52752h = metadataVersion;
        this.f52753i = interfaceC6987s;
        Uh.p pVarY0 = proto.Y0();
        AbstractC6492s.h(pVarY0, "getStrings(...)");
        Uh.o oVarX0 = proto.X0();
        AbstractC6492s.h(oVarX0, "getQualifiedNames(...)");
        Wh.d dVar = new Wh.d(pVarY0, oVarX0);
        this.f52754j = dVar;
        this.f52755k = new C6610M(proto, dVar, metadataVersion, new C6641s(this));
        this.f52756l = proto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 O0(AbstractC6643u abstractC6643u, Zh.b it) {
        AbstractC6492s.i(it, "it");
        InterfaceC6987s interfaceC6987s = abstractC6643u.f52753i;
        if (interfaceC6987s != null) {
            return interfaceC6987s;
        }
        g0 NO_SOURCE = g0.f1784a;
        AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection Q0(AbstractC6643u abstractC6643u) {
        Collection collectionB = abstractC6643u.G0().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            Zh.b bVar = (Zh.b) obj;
            if (!bVar.j() && !C6634l.f52708c.a().contains(bVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Zh.b) it.next()).h());
        }
        return arrayList2;
    }

    @Override // li.AbstractC6640r
    public void L0(C6636n components) {
        AbstractC6492s.i(components, "components");
        Uh.m mVar = this.f52756l;
        if (mVar == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f52756l = null;
        Uh.l lVarW0 = mVar.W0();
        AbstractC6492s.h(lVarW0, "getPackage(...)");
        this.f52757m = new C6962M(this, lVarW0, this.f52754j, this.f52752h, this.f52753i, components, "scope of " + this, new C6642t(this));
    }

    @Override // li.AbstractC6640r
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public C6610M G0() {
        return this.f52755k;
    }

    @Override // Bh.M
    public InterfaceC6164k r() {
        InterfaceC6164k interfaceC6164k = this.f52757m;
        if (interfaceC6164k != null) {
            return interfaceC6164k;
        }
        AbstractC6492s.v("_memberScope");
        return null;
    }
}
