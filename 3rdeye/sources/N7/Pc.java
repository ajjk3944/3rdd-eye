package N7;

import D7.a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: IntegerVariable.kt */
/* loaded from: classes.dex */
public final class Pc implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6030a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6031b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f6032c;

    public Pc(String name, long j4) {
        kotlin.jvm.internal.l.f(name, "name");
        this.f6030a = name;
        this.f6031b = j4;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        Qc qc = (Qc) D7.a.f1071b.f6500I9.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        qc.getClass();
        return Qc.e(c0011a, this);
    }
}
