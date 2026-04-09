package Fi;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
final class b extends Ei.b implements Map.Entry, InterfaceC6944a {

    /* renamed from: c, reason: collision with root package name */
    private final Map f6688c;

    /* renamed from: d, reason: collision with root package name */
    private a f6689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Map mutableMap, Object obj, a links) {
        super(obj, links.e());
        AbstractC6492s.i(mutableMap, "mutableMap");
        AbstractC6492s.i(links, "links");
        this.f6688c = mutableMap;
        this.f6689d = links;
    }

    @Override // Ei.b, java.util.Map.Entry
    public Object getValue() {
        return this.f6689d.e();
    }

    @Override // Ei.b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object objE = this.f6689d.e();
        this.f6689d = this.f6689d.h(obj);
        this.f6688c.put(getKey(), this.f6689d);
        return objE;
    }
}
