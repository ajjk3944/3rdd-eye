package N7;

import D7.a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DictVariable.kt */
/* loaded from: classes.dex */
public final class U implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6354a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f6355b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f6356c;

    public U(String name, JSONObject value) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        this.f6354a = name;
        this.f6355b = value;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        V v10 = (V) D7.a.f1071b.f6416B.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        v10.getClass();
        return V.e(c0011a, this);
    }
}
