package w5;

import java.util.Locale;
import java.util.UUID;
import p9.InterfaceC5480a;

/* compiled from: SessionGenerator.kt */
/* renamed from: w5.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5723C {

    /* renamed from: a, reason: collision with root package name */
    public final K f47349a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5480a<UUID> f47350b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47351c;

    /* renamed from: d, reason: collision with root package name */
    public int f47352d;

    /* renamed from: e, reason: collision with root package name */
    public v f47353e;

    public C5723C() {
        throw null;
    }

    public C5723C(int i) {
        K k10 = K.f47376a;
        C5722B uuidGenerator = C5722B.f47348b;
        kotlin.jvm.internal.l.f(uuidGenerator, "uuidGenerator");
        this.f47349a = k10;
        this.f47350b = uuidGenerator;
        this.f47351c = a();
        this.f47352d = -1;
    }

    public final String a() {
        String string = this.f47350b.invoke().toString();
        kotlin.jvm.internal.l.e(string, "uuidGenerator().toString()");
        String lowerCase = y9.n.X(string, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final v b() {
        v vVar = this.f47353e;
        if (vVar != null) {
            return vVar;
        }
        kotlin.jvm.internal.l.l("currentSession");
        throw null;
    }
}
