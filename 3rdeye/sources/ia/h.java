package ia;

import A9.I;
import N7.H7;
import b9.C1992A;
import c9.C2088i;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import y9.C5819a;

/* compiled from: ByteString.kt */
/* loaded from: classes3.dex */
public class h implements Serializable, Comparable<h> {

    /* renamed from: e, reason: collision with root package name */
    public static final h f38646e = new h(new byte[0]);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f38647b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f38648c;

    /* renamed from: d, reason: collision with root package name */
    public transient String f38649d;

    /* compiled from: ByteString.kt */
    public static final class a {
        public static h a(String str) {
            char c10;
            int i;
            char cCharAt;
            char c11 = 'A';
            kotlin.jvm.internal.l.f(str, "<this>");
            byte[] bArr = C4465a.f38637a;
            int length = str.length();
            while (true) {
                c10 = '\t';
                if (length <= 0 || !((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                    break;
                }
                length--;
            }
            int i10 = (int) ((length * 6) / 8);
            byte[] bArrCopyOf = new byte[i10];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i11 < length) {
                    char cCharAt2 = str.charAt(i11);
                    char c12 = c11;
                    if (c11 <= cCharAt2 && cCharAt2 < '[') {
                        i = cCharAt2 - 'A';
                    } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                        i = cCharAt2 - 'G';
                    } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                        i = cCharAt2 + 4;
                    } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                        if (cCharAt2 != '/' && cCharAt2 != '_') {
                            if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != c10) {
                                break;
                            }
                            i11++;
                            c11 = c12;
                            c10 = '\t';
                        } else {
                            i = 63;
                        }
                    } else {
                        i = 62;
                    }
                    int i15 = i | (i13 << 6);
                    i12++;
                    if (i12 % 4 == 0) {
                        bArrCopyOf[i14] = (byte) (i15 >> 16);
                        int i16 = i14 + 2;
                        bArrCopyOf[i14 + 1] = (byte) (i15 >> 8);
                        i14 += 3;
                        bArrCopyOf[i16] = (byte) i15;
                    }
                    i13 = i15;
                    i11++;
                    c11 = c12;
                    c10 = '\t';
                } else {
                    int i17 = i12 % 4;
                    if (i17 != 1) {
                        if (i17 == 2) {
                            bArrCopyOf[i14] = (byte) ((i13 << 12) >> 16);
                            i14 = 1 + i14;
                        } else if (i17 == 3) {
                            int i18 = i13 << 6;
                            int i19 = 1 + i14;
                            bArrCopyOf[i14] = (byte) (i18 >> 16);
                            i14 += 2;
                            bArrCopyOf[i19] = (byte) (i18 >> 8);
                        }
                        if (i14 != i10) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                            kotlin.jvm.internal.l.e(bArrCopyOf, "copyOf(...)");
                        }
                    }
                }
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new h(bArrCopyOf);
            }
            return null;
        }

        public static h b(String str) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i10 = i * 2;
                bArr[i] = (byte) (ja.b.a(str.charAt(i10 + 1)) + (ja.b.a(str.charAt(i10)) << 4));
            }
            return new h(bArr);
        }

        public static h c(String str) {
            kotlin.jvm.internal.l.f(str, "<this>");
            byte[] bytes = str.getBytes(C5819a.f48359b);
            kotlin.jvm.internal.l.e(bytes, "getBytes(...)");
            h hVar = new h(bytes);
            hVar.f38649d = str;
            return hVar;
        }

        public static h d(byte[] bArr) {
            h hVar = h.f38646e;
            int length = bArr.length;
            I.m(bArr.length, 0, length);
            C2088i.h(length, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length);
            kotlin.jvm.internal.l.e(bArrCopyOfRange, "copyOfRange(...)");
            return new h(bArrCopyOfRange);
        }
    }

    public h(byte[] data) {
        kotlin.jvm.internal.l.f(data, "data");
        this.f38647b = data;
    }

    public String a() {
        byte[] map = C4465a.f38637a;
        byte[] bArr = this.f38647b;
        kotlin.jvm.internal.l.f(bArr, "<this>");
        kotlin.jvm.internal.l.f(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i10 = 0;
        while (i < length) {
            byte b10 = bArr[i];
            int i11 = i + 2;
            byte b11 = bArr[i + 1];
            i += 3;
            byte b12 = bArr[i11];
            bArr2[i10] = map[(b10 & 255) >> 2];
            bArr2[i10 + 1] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i10 += 4;
            bArr2[i12] = map[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i];
            bArr2[i10] = map[(b13 & 255) >> 2];
            bArr2[i10 + 1] = map[(b13 & 3) << 4];
            bArr2[i10 + 2] = 61;
            bArr2[i10 + 3] = 61;
        } else if (length2 == 2) {
            int i13 = i + 1;
            byte b14 = bArr[i];
            byte b15 = bArr[i13];
            bArr2[i10] = map[(b14 & 255) >> 2];
            bArr2[i10 + 1] = map[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr2[i10 + 2] = map[(b15 & 15) << 2];
            bArr2[i10 + 3] = 61;
        }
        return new String(bArr2, C5819a.f48359b);
    }

    public h b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f38647b, 0, c());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.l.c(bArrDigest);
        return new h(bArrDigest);
    }

    public int c() {
        return this.f38647b.length;
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        h other = hVar;
        kotlin.jvm.internal.l.f(other, "other");
        int iC = c();
        int iC2 = other.c();
        int iMin = Math.min(iC, iC2);
        for (int i = 0; i < iMin; i++) {
            int iF = f(i) & 255;
            int iF2 = other.f(i) & 255;
            if (iF != iF2) {
                return iF < iF2 ? -1 : 1;
            }
        }
        if (iC == iC2) {
            return 0;
        }
        return iC < iC2 ? -1 : 1;
    }

    public String d() {
        byte[] bArr = this.f38647b;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b10 : bArr) {
            int i10 = i + 1;
            char[] cArr2 = ja.b.f43144a;
            cArr[i] = cArr2[(b10 >> 4) & 15];
            i += 2;
            cArr[i10] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.f38647b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int iC = hVar.c();
            byte[] bArr = this.f38647b;
            if (iC == bArr.length && hVar.g(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i) {
        return this.f38647b[i];
    }

    public boolean g(int i, byte[] other, int i10, int i11) {
        kotlin.jvm.internal.l.f(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.f38647b;
        return i <= bArr.length - i11 && i10 >= 0 && i10 <= other.length - i11 && I.g(bArr, i, other, i10, i11);
    }

    public boolean h(h other, int i) {
        kotlin.jvm.internal.l.f(other, "other");
        return other.g(0, this.f38647b, 0, i);
    }

    public int hashCode() {
        int i = this.f38648c;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f38647b);
        this.f38648c = iHashCode;
        return iHashCode;
    }

    public h i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f38647b;
            if (i >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.l.e(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b10 + 32);
                for (int i10 = i + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b11 = bArrCopyOf[i10];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i10] = (byte) (b11 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
            i++;
        }
    }

    public final String j() {
        String str = this.f38649d;
        if (str != null) {
            return str;
        }
        byte[] bArrE = e();
        kotlin.jvm.internal.l.f(bArrE, "<this>");
        String str2 = new String(bArrE, C5819a.f48359b);
        this.f38649d = str2;
        return str2;
    }

    public void k(C4468d buffer, int i) {
        kotlin.jvm.internal.l.f(buffer, "buffer");
        buffer.B0(this.f38647b, 0, i);
    }

    public String toString() {
        h hVar;
        byte b10;
        int i;
        byte[] bArr = this.f38647b;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            if (i10 >= length) {
                break;
            }
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                int i13 = i12 + 1;
                if (i12 == 64) {
                    break;
                }
                if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (127 <= b11 && b11 < 160))) || b11 == 65533) {
                    break;
                }
                i11 += b11 < 65536 ? 1 : 2;
                i10++;
                while (true) {
                    i12 = i13;
                    if (i10 < length && (b10 = bArr[i10]) >= 0) {
                        i10++;
                        i13 = i12 + 1;
                        if (i12 == 64) {
                            break loop0;
                        }
                        if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                            break loop0;
                        }
                        i11 += b10 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b11 >> 5) == -2) {
                int i14 = i10 + 1;
                if (length > i14) {
                    byte b12 = bArr[i14];
                    if ((b12 & 192) == 128) {
                        int i15 = (b12 ^ 3968) ^ (b11 << 6);
                        if (i15 >= 128) {
                            i = i12 + 1;
                            if (i12 == 64) {
                                break;
                            }
                            if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                break;
                            }
                            i11 += i15 < 65536 ? 1 : 2;
                            C1992A c1992a = C1992A.f18074a;
                            i10 += 2;
                            i12 = i;
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if ((b11 >> 4) == -2) {
                int i16 = i10 + 2;
                if (length > i16) {
                    byte b13 = bArr[i10 + 1];
                    if ((b13 & 192) == 128) {
                        byte b14 = bArr[i16];
                        if ((b14 & 192) == 128) {
                            int i17 = ((b14 ^ (-123008)) ^ (b13 << 6)) ^ (b11 << 12);
                            if (i17 < 2048) {
                                if (i12 != 64) {
                                    break;
                                }
                            } else if (55296 > i17 || i17 >= 57344) {
                                i = i12 + 1;
                                if (i12 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    break;
                                }
                                i11 += i17 < 65536 ? 1 : 2;
                                C1992A c1992a2 = C1992A.f18074a;
                                i10 += 3;
                                i12 = i;
                            } else if (i12 != 64) {
                                break;
                            }
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if ((b11 >> 3) == -2) {
                int i18 = i10 + 3;
                if (length > i18) {
                    byte b15 = bArr[i10 + 1];
                    if ((b15 & 192) == 128) {
                        byte b16 = bArr[i10 + 2];
                        if ((b16 & 192) == 128) {
                            byte b17 = bArr[i18];
                            if ((b17 & 192) == 128) {
                                int i19 = (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12)) ^ (b11 << 18);
                                if (i19 > 1114111) {
                                    if (i12 != 64) {
                                        break;
                                    }
                                } else if (55296 > i19 || i19 >= 57344) {
                                    if (i19 >= 65536) {
                                        int i20 = i12 + 1;
                                        if (i12 == 64) {
                                            break;
                                        }
                                        if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                            break;
                                        }
                                        i11 += i19 < 65536 ? 1 : 2;
                                        C1992A c1992a3 = C1992A.f18074a;
                                        i10 += 4;
                                        i12 = i20;
                                    } else if (i12 != 64) {
                                        break;
                                    }
                                } else if (i12 != 64) {
                                    break;
                                }
                            } else if (i12 != 64) {
                                break;
                            }
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if (i12 != 64) {
                break;
            }
        }
        i11 = -1;
        if (i11 != -1) {
            String strJ = j();
            String strSubstring = strJ.substring(0, i11);
            kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
            String strX = y9.n.X(y9.n.X(y9.n.X(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i11 >= strJ.length()) {
                return androidx.work.s.e("[text=", strX, ']');
            }
            return "[size=" + bArr.length + " text=" + strX + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + d() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(H7.p(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (64 == bArr.length) {
            hVar = this;
        } else {
            C2088i.h(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            kotlin.jvm.internal.l.e(bArrCopyOfRange, "copyOfRange(...)");
            hVar = new h(bArrCopyOfRange);
        }
        sb.append(hVar.d());
        sb.append("…]");
        return sb.toString();
    }
}
