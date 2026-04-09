package ri;

import j$.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f32979d = new i(0, 0, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f32980e = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    /* renamed from: a, reason: collision with root package name */
    public final int f32981a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32982b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32983c;

    public i(int i4, int i10, int i11) {
        this.f32981a = i4;
        this.f32982b = i10;
        this.f32983c = i11;
    }

    public static i a(String str) {
        Objects.requireNonNull(str, "text");
        Matcher matcher = f32980e.matcher(str);
        if (matcher.matches()) {
            int i4 = "-".equals(matcher.group(1)) ? -1 : 1;
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(3);
            String strGroup3 = matcher.group(4);
            String strGroup4 = matcher.group(5);
            if (strGroup != null || strGroup2 != null || strGroup4 != null || strGroup3 != null) {
                try {
                    int iB = b(str, strGroup, i4);
                    int iB2 = b(str, strGroup2, i4);
                    int iB3 = b(str, strGroup3, i4);
                    int iB4 = b(str, strGroup4, i4);
                    long j = iB3 * 7;
                    int i10 = (int) j;
                    if (i10 != j) {
                        throw new ArithmeticException("integer overflow");
                    }
                    int i11 = iB4 + i10;
                    if (((iB4 ^ i11) & (i10 ^ i11)) >= 0) {
                        return ((iB | iB2) | i11) == 0 ? f32979d : new i(iB, iB2, i11);
                    }
                    throw new ArithmeticException("integer overflow");
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException("Text cannot be parsed to a Period,[" + ((Object) str) + "][0]", e2);
                }
            }
        }
        throw new IllegalArgumentException("Text cannot be parsed to a Period,[" + ((Object) str) + "][0]");
    }

    public static int b(CharSequence charSequence, String str, int i4) {
        if (str == null) {
            return 0;
        }
        long j = Integer.parseInt(str) * i4;
        int i10 = (int) j;
        if (i10 == j) {
            return i10;
        }
        try {
            throw new ArithmeticException("integer overflow");
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException("Text cannot be parsed to a Period,[" + ((Object) charSequence) + "][0]", e2);
        }
    }
}
