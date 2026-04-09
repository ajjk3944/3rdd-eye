package S9;

import R9.AbstractC1564a;
import b9.C1992A;
import java.util.LinkedHashMap;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes3.dex */
public class F extends AbstractC1571c {

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f12020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(AbstractC1564a json, p9.l<? super R9.i, C1992A> nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.l.f(json, "json");
        kotlin.jvm.internal.l.f(nodeConsumer, "nodeConsumer");
        this.f12020f = new LinkedHashMap();
    }

    @Override // S9.AbstractC1571c
    public R9.i W() {
        return new R9.z(this.f12020f);
    }

    @Override // S9.AbstractC1571c
    public void X(R9.i element, String key) {
        kotlin.jvm.internal.l.f(key, "key");
        kotlin.jvm.internal.l.f(element, "element");
        this.f12020f.put(key, element);
    }

    @Override // Q9.E0, P9.c
    public final <T> void w(O9.e descriptor, int i, M9.b serializer, T t10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        kotlin.jvm.internal.l.f(serializer, "serializer");
        if (t10 != null || this.f12074d.f11802d) {
            super.w(descriptor, i, serializer, t10);
        }
    }
}
