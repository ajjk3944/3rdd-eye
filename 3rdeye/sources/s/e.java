package S;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Version.java */
/* loaded from: classes.dex */
public abstract class e implements Comparable<e> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f11838b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f11839c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f11840d;

    static {
        new a(1, 0, 0, "");
        new a(1, 1, 0, "");
        new a(1, 2, 0, "");
        f11838b = new a(1, 3, 0, "");
        f11839c = new a(1, 4, 0, "");
        f11840d = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");
    }

    public static BigInteger a(e eVar) {
        return BigInteger.valueOf(eVar.c()).shiftLeft(32).or(BigInteger.valueOf(eVar.d())).shiftLeft(32).or(BigInteger.valueOf(eVar.e()));
    }

    public static a f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f11840d.matcher(str);
        if (matcher.matches()) {
            return new a(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    public abstract String b();

    public abstract int c();

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        return a(this).compareTo(a(eVar));
    }

    public abstract int d();

    public abstract int e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Integer.valueOf(c()).equals(Integer.valueOf(eVar.c())) && Integer.valueOf(d()).equals(Integer.valueOf(eVar.d())) && Integer.valueOf(e()).equals(Integer.valueOf(eVar.e()));
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(c()), Integer.valueOf(d()), Integer.valueOf(e()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(c() + "." + d() + "." + e());
        if (!TextUtils.isEmpty(b())) {
            sb.append("-" + b());
        }
        return sb.toString();
    }
}
