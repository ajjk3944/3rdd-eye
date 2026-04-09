package N7;

import D7.a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: StrVariable.kt */
/* loaded from: classes.dex */
public final class td implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9350a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9351b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f9352c;

    public td(String name, String value) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        this.f9350a = name;
        this.f9351b = value;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        ud udVar = (ud) D7.a.f1071b.f6692aa.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        udVar.getClass();
        return ud.e(c0011a, this);
    }
}
