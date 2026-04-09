package N7;

import A7.b;
import D7.a;
import N7.C1448z6;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivInputValidatorExpression.kt */
/* renamed from: N7.y6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1434y6 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Boolean> f9932a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Boolean> f9933b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<String> f9934c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9935d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f9936e;

    static {
        new b.C0000b(Boolean.FALSE);
    }

    public C1434y6(A7.b<Boolean> allowEmpty, A7.b<Boolean> bVar, A7.b<String> bVar2, String str) {
        kotlin.jvm.internal.l.f(allowEmpty, "allowEmpty");
        this.f9932a = allowEmpty;
        this.f9933b = bVar;
        this.f9934c = bVar2;
        this.f9935d = str;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1448z6.a aVar = (C1448z6.a) D7.a.f1071b.f6909u4.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        aVar.getClass();
        return C1448z6.a.e(c0011a, this);
    }
}
