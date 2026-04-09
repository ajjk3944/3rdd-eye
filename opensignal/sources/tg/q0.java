package tg;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f22836a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f22837b;

    public q0(e1 e1Var, f1 f1Var) {
        br.l.e(e1Var, "timeProvider");
        br.l.e(f1Var, "uuidGenerator");
        this.f22836a = e1Var;
        this.f22837b = f1Var;
    }

    public final j0 a(j0 j0Var) {
        String str;
        this.f22837b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        br.l.d(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        br.l.d(string, "toString(...)");
        String lowerCase = tt.s.l0(string, "-", "").toLowerCase(Locale.ROOT);
        br.l.d(lowerCase, "toLowerCase(...)");
        return new j0(j0Var != null ? j0Var.f22808c + 1 : 0, this.f22836a.a().f22761b, lowerCase, (j0Var == null || (str = j0Var.f22807b) == null) ? lowerCase : str);
    }
}
