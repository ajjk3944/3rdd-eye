package N7;

import A7.b;
import D7.a;
import N7.F6;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivInputValidatorRegex.kt */
/* loaded from: classes.dex */
public final class E6 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Boolean> f5141a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<String> f5142b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<String> f5143c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5144d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f5145e;

    static {
        new b.C0000b(Boolean.FALSE);
    }

    public E6(A7.b<Boolean> allowEmpty, A7.b<String> bVar, A7.b<String> bVar2, String str) {
        kotlin.jvm.internal.l.f(allowEmpty, "allowEmpty");
        this.f5141a = allowEmpty;
        this.f5142b = bVar;
        this.f5143c = bVar2;
        this.f5144d = str;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        F6.a aVar = (F6.a) D7.a.f1071b.f6941x4.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        aVar.getClass();
        return F6.a.e(c0011a, this);
    }
}
