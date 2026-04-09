package kg;

import io.sentry.android.core.e0;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14408d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f14409a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14410b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14411c;

    public u(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            e0.p("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f14408d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(h0.b.o("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f14409a = strSubstring;
        this.f14410b = str;
        this.f14411c = w.g.g(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f14409a.equals(uVar.f14409a) && this.f14410b.equals(uVar.f14410b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14410b, this.f14409a});
    }
}
