package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionSetStoredValue.kt */
/* loaded from: classes.dex */
public final class F1 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f5157a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<String> f5158b;

    /* renamed from: c, reason: collision with root package name */
    public final Yb f5159c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f5160d;

    public F1(A7.b<Long> bVar, A7.b<String> bVar2, Yb yb) {
        this.f5157a = bVar;
        this.f5158b = bVar2;
        this.f5159c = yb;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((G1) D7.a.f1071b.f6471G0.getValue()).b(D7.a.f1070a, this);
    }
}
