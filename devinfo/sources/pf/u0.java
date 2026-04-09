package pf;

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f31904a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f31905b;

    public u0(g1 g1Var, h1 h1Var) {
        nk.k.e(g1Var, "timeProvider");
        nk.k.e(h1Var, "uuidGenerator");
        this.f31904a = g1Var;
        this.f31905b = h1Var;
    }

    public final n0 a(n0 n0Var) {
        String str;
        this.f31905b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        nk.k.d(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        nk.k.d(string, "toString(...)");
        String lowerCase = vk.p.u0(string, "-", "").toLowerCase(Locale.ROOT);
        nk.k.d(lowerCase, "toLowerCase(...)");
        return new n0(lowerCase, (n0Var == null || (str = n0Var.f31872b) == null) ? lowerCase : str, n0Var != null ? n0Var.f31873c + 1 : 0, this.f31904a.a().f31819b);
    }
}
