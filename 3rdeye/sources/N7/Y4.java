package N7;

import A7.b;
import D7.a;
import N7.X4;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivFixedSizeTemplate.kt */
/* loaded from: classes.dex */
public final class Y4 implements InterfaceC5868a, z7.b<W4> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<H9>> f7769a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Long>> f7770b;

    static {
        H9 value = H9.DP;
        kotlin.jvm.internal.l.f(value, "value");
        new b.C0000b(value);
    }

    public Y4(AbstractC5371a<A7.b<H9>> abstractC5371a, AbstractC5371a<A7.b<Long>> abstractC5371a2) {
        this.f7769a = abstractC5371a;
        this.f7770b = abstractC5371a2;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        X4.c cVar = (X4.c) D7.a.f1071b.f6908u3.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        cVar.getClass();
        return X4.c.e(c0011a, this);
    }
}
