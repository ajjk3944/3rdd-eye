package q0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final o f23941d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f23942e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f23943f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f23944g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f23945h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23947b;

    /* renamed from: c, reason: collision with root package name */
    public final o f23948c;

    /* renamed from: q0.a$a, reason: collision with other inner class name */
    public static final class C0456a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f23949a;

        /* renamed from: b, reason: collision with root package name */
        public int f23950b;

        /* renamed from: c, reason: collision with root package name */
        public o f23951c;

        public C0456a() {
            c(a.e(Locale.getDefault()));
        }

        public static a b(boolean z10) {
            return z10 ? a.f23945h : a.f23944g;
        }

        public a a() {
            return (this.f23950b == 2 && this.f23951c == a.f23941d) ? b(this.f23949a) : new a(this.f23949a, this.f23950b, this.f23951c);
        }

        public final void c(boolean z10) {
            this.f23949a = z10;
            this.f23951c = a.f23941d;
            this.f23950b = 2;
        }
    }

    public static class b {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f23952f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f23953a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f23954b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23955c;

        /* renamed from: d, reason: collision with root package name */
        public int f23956d;

        /* renamed from: e, reason: collision with root package name */
        public char f23957e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f23952f[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f23953a = charSequence;
            this.f23954b = z10;
            this.f23955c = charSequence.length();
        }

        public static byte c(char c10) {
            return c10 < 1792 ? f23952f[c10] : Character.getDirectionality(c10);
        }

        public byte a() {
            char cCharAt = this.f23953a.charAt(this.f23956d - 1);
            this.f23957e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f23953a, this.f23956d);
                this.f23956d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f23956d--;
            byte bC = c(this.f23957e);
            if (!this.f23954b) {
                return bC;
            }
            char c10 = this.f23957e;
            return c10 == '>' ? h() : c10 == ';' ? f() : bC;
        }

        public byte b() {
            char cCharAt = this.f23953a.charAt(this.f23956d);
            this.f23957e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f23953a, this.f23956d);
                this.f23956d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f23956d++;
            byte bC = c(this.f23957e);
            if (!this.f23954b) {
                return bC;
            }
            char c10 = this.f23957e;
            return c10 == '<' ? i() : c10 == '&' ? g() : bC;
        }

        public int d() {
            this.f23956d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f23956d < this.f23955c && i10 == 0) {
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
            while (this.f23956d > 0) {
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

        public int e() {
            this.f23956d = this.f23955c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f23956d > 0) {
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

        public final byte f() {
            char cCharAt;
            int i10 = this.f23956d;
            do {
                int i11 = this.f23956d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f23953a;
                int i12 = i11 - 1;
                this.f23956d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f23957e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f23956d = i10;
            this.f23957e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char cCharAt;
            do {
                int i10 = this.f23956d;
                if (i10 >= this.f23955c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f23953a;
                this.f23956d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f23957e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char cCharAt;
            int i10 = this.f23956d;
            while (true) {
                int i11 = this.f23956d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f23953a;
                int i12 = i11 - 1;
                this.f23956d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f23957e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f23956d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f23953a;
                            int i14 = i13 - 1;
                            this.f23956d = i14;
                            cCharAt = charSequence2.charAt(i14);
                            this.f23957e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f23956d = i10;
            this.f23957e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char cCharAt;
            int i10 = this.f23956d;
            while (true) {
                int i11 = this.f23956d;
                if (i11 >= this.f23955c) {
                    this.f23956d = i10;
                    this.f23957e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f23953a;
                this.f23956d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f23957e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f23956d;
                        if (i12 < this.f23955c) {
                            CharSequence charSequence2 = this.f23953a;
                            this.f23956d = i12 + 1;
                            cCharAt = charSequence2.charAt(i12);
                            this.f23957e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        o oVar = p.f23970c;
        f23941d = oVar;
        f23942e = Character.toString((char) 8206);
        f23943f = Character.toString((char) 8207);
        f23944g = new a(false, 2, oVar);
        f23945h = new a(true, 2, oVar);
    }

    public a(boolean z10, int i10, o oVar) {
        this.f23946a = z10;
        this.f23947b = i10;
        this.f23948c = oVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0456a().a();
    }

    public static boolean e(Locale locale) {
        return q.a(locale) == 1;
    }

    public boolean d() {
        return (this.f23947b & 2) != 0;
    }

    public final String f(CharSequence charSequence, o oVar) {
        boolean zIsRtl = oVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f23946a || !(zIsRtl || b(charSequence) == 1)) ? this.f23946a ? (!zIsRtl || b(charSequence) == -1) ? f23943f : "" : "" : f23942e;
    }

    public final String g(CharSequence charSequence, o oVar) {
        boolean zIsRtl = oVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f23946a || !(zIsRtl || a(charSequence) == 1)) ? this.f23946a ? (!zIsRtl || a(charSequence) == -1) ? f23943f : "" : "" : f23942e;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f23948c, true);
    }

    public CharSequence i(CharSequence charSequence, o oVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = oVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? p.f23969b : p.f23968a));
        }
        if (zIsRtl != this.f23946a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? p.f23969b : p.f23968a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f23948c, true);
    }

    public String k(String str, o oVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, oVar, z10).toString();
    }
}
