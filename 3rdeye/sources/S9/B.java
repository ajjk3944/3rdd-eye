package S9;

import R9.AbstractC1564a;
import R9.C1565b;
import java.util.ArrayList;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes3.dex */
public final class B extends AbstractC1571c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12010f;

    /* renamed from: g, reason: collision with root package name */
    public Object f12011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(AbstractC1564a json, p9.l nodeConsumer, int i) {
        super(json, nodeConsumer);
        this.f12010f = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.l.f(json, "json");
                kotlin.jvm.internal.l.f(nodeConsumer, "nodeConsumer");
                super(json, nodeConsumer);
                this.f12011g = new ArrayList();
                break;
            default:
                kotlin.jvm.internal.l.f(json, "json");
                kotlin.jvm.internal.l.f(nodeConsumer, "nodeConsumer");
                this.f11414a.add("primitive");
                break;
        }
    }

    @Override // S9.AbstractC1571c, Q9.AbstractC1527e0
    public String V(O9.e descriptor, int i) {
        switch (this.f12010f) {
            case 1:
                kotlin.jvm.internal.l.f(descriptor, "descriptor");
                return String.valueOf(i);
            default:
                return super.V(descriptor, i);
        }
    }

    @Override // S9.AbstractC1571c
    public final R9.i W() {
        switch (this.f12010f) {
            case 0:
                R9.i iVar = (R9.i) this.f12011g;
                if (iVar != null) {
                    return iVar;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
            default:
                return new C1565b((ArrayList) this.f12011g);
        }
    }

    @Override // S9.AbstractC1571c
    public final void X(R9.i element, String key) throws NumberFormatException {
        switch (this.f12010f) {
            case 0:
                kotlin.jvm.internal.l.f(key, "key");
                kotlin.jvm.internal.l.f(element, "element");
                if (key != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
                }
                if (((R9.i) this.f12011g) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                }
                this.f12011g = element;
                this.f12073c.invoke(element);
                return;
            default:
                kotlin.jvm.internal.l.f(key, "key");
                kotlin.jvm.internal.l.f(element, "element");
                ((ArrayList) this.f12011g).add(Integer.parseInt(key), element);
                return;
        }
    }
}
