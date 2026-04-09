package n5;

import N7.C1154e9;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* compiled from: TopicOperation.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f44390d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f44391a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44392b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44393c;

    public y(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f44390d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(C1154e9.i("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f44391a = strSubstring;
        this.f44392b = str;
        this.f44393c = B4.g.o(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f44391a.equals(yVar.f44391a) && this.f44392b.equals(yVar.f44392b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f44392b, this.f44391a);
    }
}
