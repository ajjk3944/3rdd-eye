package D1;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    static final l f2776d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f2777e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f2778f;

    /* renamed from: g, reason: collision with root package name */
    static final a f2779g;

    /* renamed from: h, reason: collision with root package name */
    static final a f2780h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2781a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2782b;

    /* renamed from: c, reason: collision with root package name */
    private final l f2783c;

    /* renamed from: D1.a$a, reason: collision with other inner class name */
    public static final class C0139a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2784a;

        /* renamed from: b, reason: collision with root package name */
        private int f2785b;

        /* renamed from: c, reason: collision with root package name */
        private l f2786c;

        public C0139a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f2780h : a.f2779g;
        }

        private void c(boolean z10) {
            this.f2784a = z10;
            this.f2786c = a.f2776d;
            this.f2785b = 2;
        }

        public a a() {
            return (this.f2785b == 2 && this.f2786c == a.f2776d) ? b(this.f2784a) : new a(this.f2784a, this.f2785b, this.f2786c);
        }
    }

    private static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f2787f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f2788a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2789b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2790c;

        /* renamed from: d, reason: collision with root package name */
        private int f2791d;

        /* renamed from: e, reason: collision with root package name */
        private char f2792e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f2787f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f2788a = charSequence;
            this.f2789b = z10;
            this.f2790c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f2787f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f2791d;
            do {
                int i11 = this.f2791d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2788a;
                int i12 = i11 - 1;
                this.f2791d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f2792e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f2791d = i10;
            this.f2792e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f2791d;
                if (i10 >= this.f2790c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f2788a;
                this.f2791d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f2792e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f2791d;
            while (true) {
                int i11 = this.f2791d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2788a;
                int i12 = i11 - 1;
                this.f2791d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f2792e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f2791d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f2788a;
                            int i14 = i13 - 1;
                            this.f2791d = i14;
                            cCharAt = charSequence2.charAt(i14);
                            this.f2792e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f2791d = i10;
            this.f2792e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f2791d;
            while (true) {
                int i11 = this.f2791d;
                if (i11 >= this.f2790c) {
                    this.f2791d = i10;
                    this.f2792e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f2788a;
                this.f2791d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f2792e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f2791d;
                        if (i12 < this.f2790c) {
                            CharSequence charSequence2 = this.f2788a;
                            this.f2791d = i12 + 1;
                            cCharAt = charSequence2.charAt(i12);
                            this.f2792e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f2788a.charAt(this.f2791d - 1);
            this.f2792e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f2788a, this.f2791d);
                this.f2791d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f2791d--;
            byte bC = c(this.f2792e);
            if (!this.f2789b) {
                return bC;
            }
            char c10 = this.f2792e;
            return c10 == '>' ? h() : c10 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f2788a.charAt(this.f2791d);
            this.f2792e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f2788a, this.f2791d);
                this.f2791d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f2791d++;
            byte bC = c(this.f2792e);
            if (!this.f2789b) {
                return bC;
            }
            char c10 = this.f2792e;
            return c10 == '<' ? i() : c10 == '&' ? g() : bC;
        }

        int d() {
            this.f2791d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f2791d < this.f2790c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f2791d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f2791d = this.f2790c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f2791d > 0) {
                    byte bA = a();
                    if (bA != 0) {
                        if (bA == 1 || bA == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (bA != 9) {
                            switch (bA) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        l lVar = m.f2804c;
        f2776d = lVar;
        f2777e = Character.toString((char) 8206);
        f2778f = Character.toString((char) 8207);
        f2779g = new a(false, 2, lVar);
        f2780h = new a(true, 2, lVar);
    }

    a(boolean z10, int i10, l lVar) {
        this.f2781a = z10;
        this.f2782b = i10;
        this.f2783c = lVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0139a().a();
    }

    static boolean e(Locale locale) {
        return n.a(locale) == 1;
    }

    private String f(CharSequence charSequence, l lVar) {
        boolean zA = lVar.a(charSequence, 0, charSequence.length());
        return (this.f2781a || !(zA || b(charSequence) == 1)) ? this.f2781a ? (!zA || b(charSequence) == -1) ? f2778f : "" : "" : f2777e;
    }

    private String g(CharSequence charSequence, l lVar) {
        boolean zA = lVar.a(charSequence, 0, charSequence.length());
        return (this.f2781a || !(zA || a(charSequence) == 1)) ? this.f2781a ? (!zA || a(charSequence) == -1) ? f2778f : "" : "" : f2777e;
    }

    public boolean d() {
        return (this.f2782b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f2783c, true);
    }

    public CharSequence i(CharSequence charSequence, l lVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = lVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? m.f2803b : m.f2802a));
        }
        if (zA != this.f2781a) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? m.f2803b : m.f2802a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f2783c, true);
    }

    public String k(String str, l lVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, lVar, z10).toString();
    }
}
