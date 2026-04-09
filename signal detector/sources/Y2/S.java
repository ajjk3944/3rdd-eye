package Y2;

import b4.C0344i;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final C0204f f4279a;

    /* renamed from: b, reason: collision with root package name */
    public final C0200b f4280b;

    /* renamed from: c, reason: collision with root package name */
    public final C0209k f4281c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4282d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final Object f4283e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f4284f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4285g = false;

    /* renamed from: h, reason: collision with root package name */
    public C0344i f4286h = new C0344i(8);

    public S(C0204f c0204f, C0200b c0200b, C0209k c0209k) {
        this.f4279a = c0204f;
        this.f4280b = c0200b;
        this.f4281c = c0209k;
    }

    public final boolean a() {
        C0204f c0204f = this.f4279a;
        if (!c0204f.f4323b.getBoolean("is_pub_misconfigured", false)) {
            int i = !d() ? 0 : c0204f.f4323b.getInt("consent_status", 0);
            if (i != 1 && i != 3) {
                return false;
            }
        }
        return true;
    }

    public final int b() {
        if (!d()) {
            return 1;
        }
        String string = this.f4279a.f4323b.getString("privacy_options_requirement_status", "UNKNOWN");
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

    public final void c(boolean z6) {
        synchronized (this.f4283e) {
            this.f4285g = z6;
        }
    }

    public final boolean d() {
        boolean z6;
        synchronized (this.f4282d) {
            z6 = this.f4284f;
        }
        return z6;
    }

    public final boolean e() {
        boolean z6;
        synchronized (this.f4283e) {
            z6 = this.f4285g;
        }
        return z6;
    }
}
