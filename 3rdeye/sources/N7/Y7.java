package N7;

import D7.a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPhoneInputMask.kt */
/* loaded from: classes.dex */
public final class Y7 implements InterfaceC5868a, InterfaceC1253l6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7773a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f7774b;

    public Y7(String str) {
        this.f7773a = str;
    }

    @Override // N7.InterfaceC1253l6
    public final String a() {
        return this.f7773a;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        Z7 z72 = (Z7) D7.a.f1071b.f6485H5.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        z72.getClass();
        return Z7.e(c0011a, this);
    }
}
