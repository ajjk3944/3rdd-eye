package li;

import Bh.g0;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* renamed from: li.M, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6610M implements InterfaceC6632j {

    /* renamed from: a, reason: collision with root package name */
    private final Wh.c f52648a;

    /* renamed from: b, reason: collision with root package name */
    private final Wh.a f52649b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6835l f52650c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f52651d;

    public C6610M(Uh.m proto, Wh.c nameResolver, Wh.a metadataVersion, InterfaceC6835l classSource) {
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(metadataVersion, "metadataVersion");
        AbstractC6492s.i(classSource, "classSource");
        this.f52648a = nameResolver;
        this.f52649b = metadataVersion;
        this.f52650c = classSource;
        List listT0 = proto.T0();
        AbstractC6492s.h(listT0, "getClass_List(...)");
        List list = listT0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(Zg.U.d(AbstractC3689v.w(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(AbstractC6609L.a(this.f52648a, ((Uh.c) obj).O1()), obj);
        }
        this.f52651d = linkedHashMap;
    }

    @Override // li.InterfaceC6632j
    public C6631i a(Zh.b classId) {
        AbstractC6492s.i(classId, "classId");
        Uh.c cVar = (Uh.c) this.f52651d.get(classId);
        if (cVar == null) {
            return null;
        }
        return new C6631i(this.f52648a, cVar, this.f52649b, (g0) this.f52650c.invoke(classId));
    }

    public final Collection b() {
        return this.f52651d.keySet();
    }
}
