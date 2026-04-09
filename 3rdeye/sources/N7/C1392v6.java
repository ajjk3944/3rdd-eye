package N7;

import A7.b;
import D7.a;
import N7.C1406w6;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivInputValidatorBase.kt */
/* renamed from: N7.v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1392v6 implements InterfaceC5868a {

    /* renamed from: d, reason: collision with root package name */
    public static final b.C0000b f9620d = new b.C0000b(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Boolean> f9621a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<String> f9622b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9623c;

    public C1392v6() {
        this(f9620d, null, null);
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1406w6.a aVar = (C1406w6.a) D7.a.f1071b.f6887s4.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        aVar.getClass();
        return C1406w6.a.d(c0011a, this);
    }

    public C1392v6(A7.b<Boolean> allowEmpty, A7.b<String> bVar, String str) {
        kotlin.jvm.internal.l.f(allowEmpty, "allowEmpty");
        this.f9621a = allowEmpty;
        this.f9622b = bVar;
        this.f9623c = str;
    }
}
