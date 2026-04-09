package N7;

import D7.a;
import org.json.JSONArray;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: ArrayVariable.kt */
/* renamed from: N7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1159f implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8178a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONArray f8179b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f8180c;

    public C1159f(String name, JSONArray value) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        this.f8178a = name;
        this.f8179b = value;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1174g c1174g = (C1174g) D7.a.f1071b.f6717d.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        c1174g.getClass();
        return C1174g.e(c0011a, this);
    }
}
