package N7;

import D7.a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivCurrencyInputMask.kt */
/* loaded from: classes.dex */
public final class M3 implements InterfaceC5868a, InterfaceC1253l6 {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<String> f5830a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5831b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f5832c;

    public M3(A7.b<String> bVar, String str) {
        this.f5830a = bVar;
        this.f5831b = str;
    }

    @Override // N7.InterfaceC1253l6
    public final String a() {
        return this.f5831b;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        N3 n32 = (N3) D7.a.f1071b.f6917v2.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        n32.getClass();
        return N3.e(c0011a, this);
    }
}
