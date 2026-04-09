package N7;

import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionSetStoredValueTemplate.kt */
/* loaded from: classes.dex */
public final class J1 implements InterfaceC5868a, z7.b<F1> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Long>> f5561a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<String>> f5562b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<AbstractC1127cc> f5563c;

    public J1(AbstractC5371a<A7.b<Long>> abstractC5371a, AbstractC5371a<A7.b<String>> abstractC5371a2, AbstractC5371a<AbstractC1127cc> abstractC5371a3) {
        this.f5561a = abstractC5371a;
        this.f5562b = abstractC5371a2;
        this.f5563c = abstractC5371a3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((H1) D7.a.f1071b.f6480H0.getValue()).b(D7.a.f1070a, this);
    }
}
