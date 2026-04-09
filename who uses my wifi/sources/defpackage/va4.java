package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class va4 {
    public final mo1 a;
    public final gi1 b;
    public final z42 c;
    public final Object d = new Object();
    public final Object e = new Object();
    public boolean f = false;
    public boolean g = false;
    public fr h = new fr(16);

    public va4(mo1 mo1Var, gi1 gi1Var, z42 z42Var) {
        this.a = mo1Var;
        this.b = gi1Var;
        this.c = z42Var;
    }

    public final boolean a() {
        mo1 mo1Var = this.a;
        if (!mo1Var.b.getBoolean("is_pub_misconfigured", false)) {
            int i = !c() ? 0 : mo1Var.b.getInt("consent_status", 0);
            if (i != 1 && i != 3) {
                return false;
            }
        }
        return true;
    }

    public final int b() {
        if (!c()) {
            return 1;
        }
        String string = this.a.b.getString("privacy_options_requirement_status", "UNKNOWN");
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("UNKNOWN")) {
            return 1;
        }
        if (string.equals("NOT_REQUIRED")) {
            return 2;
        }
        if (string.equals("REQUIRED")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.".concat(string));
    }

    public final boolean c() {
        boolean z;
        synchronized (this.d) {
            z = this.f;
        }
        return z;
    }
}
