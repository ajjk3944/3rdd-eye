package rs;

import java.io.IOException;

/* loaded from: classes.dex */
public final class t extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public b f21776a;

    public t(String str) {
        super(str);
        this.f21776a = null;
    }

    public static t a() {
        return new t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
