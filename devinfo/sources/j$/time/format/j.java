package j$.time.format;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class j implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f26140d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e, reason: collision with root package name */
    public static final j f26141e = new j("+HH:MM:ss", "Z");

    /* renamed from: a, reason: collision with root package name */
    public final String f26142a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26143b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26144c;

    static {
        new j("+HH:MM:ss", "0");
    }

    public j(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        for (int i4 = 0; i4 < 22; i4++) {
            if (f26140d[i4].equals(str)) {
                this.f26143b = i4;
                this.f26144c = i4 % 11;
                this.f26142a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb2) {
        Long lA = pVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z3 = false;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int i4 = (int) jLongValue;
        if (jLongValue != i4) {
            throw new ArithmeticException();
        }
        String str = this.f26142a;
        if (i4 == 0) {
            sb2.append(str);
            return true;
        }
        int iAbs = Math.abs((i4 / 3600) % 100);
        int iAbs2 = Math.abs((i4 / 60) % 60);
        int iAbs3 = Math.abs(i4 % 60);
        int length = sb2.length();
        sb2.append(i4 < 0 ? "-" : "+");
        if (this.f26143b >= 11 && iAbs < 10) {
            sb2.append((char) (iAbs + 48));
        } else {
            a(false, iAbs, sb2);
        }
        int i10 = this.f26144c;
        if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && iAbs3 > 0) || (i10 >= 1 && iAbs2 > 0))) {
            a(i10 > 0 && i10 % 2 == 0, iAbs2, sb2);
            iAbs += iAbs2;
            if (i10 == 7 || i10 == 8 || (i10 >= 5 && iAbs3 > 0)) {
                if (i10 > 0 && i10 % 2 == 0) {
                    z3 = true;
                }
                a(z3, iAbs3, sb2);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    public static void a(boolean z3, int i4, StringBuilder sb2) {
        sb2.append(z3 ? ":" : "");
        sb2.append((char) ((i4 / 10) + 48));
        sb2.append((char) ((i4 % 10) + 48));
    }

    public final String toString() {
        String strReplace = this.f26142a.replace("'", "''");
        return "Offset(" + f26140d[this.f26143b] + ",'" + strReplace + "')";
    }
}
