package cv;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j implements Serializable, Comparable {

    /* renamed from: r, reason: collision with root package name */
    public static final j f6715r = new j(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6716a;

    /* renamed from: d, reason: collision with root package name */
    public transient int f6717d;

    /* renamed from: g, reason: collision with root package name */
    public transient String f6718g;

    public j(byte[] bArr) {
        br.l.e(bArr, "data");
        this.f6716a = bArr;
    }

    public static int g(j jVar, j jVar2) {
        jVar.getClass();
        br.l.e(jVar2, "other");
        return jVar.f(0, jVar2.h());
    }

    public static int k(j jVar, j jVar2) {
        jVar.getClass();
        br.l.e(jVar2, "other");
        return jVar.j(jVar2.h());
    }

    public static /* synthetic */ j o(j jVar, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = -1234567890;
        }
        return jVar.n(i10, i11);
    }

    public String a() {
        byte[] bArr = a.f6677a;
        byte[] bArr2 = this.f6716a;
        br.l.e(bArr2, "<this>");
        br.l.e(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b2 = bArr2[i10];
            int i12 = i10 + 2;
            byte b10 = bArr2[i10 + 1];
            i10 += 3;
            byte b11 = bArr2[i12];
            bArr3[i11] = bArr[(b2 & 255) >> 2];
            bArr3[i11 + 1] = bArr[((b2 & 3) << 4) | ((b10 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr3[i11 + 2] = bArr[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i11 += 4;
            bArr3[i13] = bArr[b11 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b12 = bArr2[i10];
            bArr3[i11] = bArr[(b12 & 255) >> 2];
            bArr3[i11 + 1] = bArr[(b12 & 3) << 4];
            bArr3[i11 + 2] = 61;
            bArr3[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b13 = bArr2[i10];
            byte b14 = bArr2[i14];
            bArr3[i11] = bArr[(b13 & 255) >> 2];
            bArr3[i11 + 1] = bArr[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr3[i11 + 2] = bArr[(b14 & 15) << 2];
            bArr3[i11 + 3] = 61;
        }
        return new String(bArr3, tt.a.f22975a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        br.l.e(jVar, "other");
        int iD = d();
        int iD2 = jVar.d();
        int iMin = Math.min(iD, iD2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = i(i10) & 255;
            int i12 = jVar.i(i10) & 255;
            if (i11 != i12) {
                return i11 < i12 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public j c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f6716a, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        br.l.b(bArrDigest);
        return new j(bArrDigest);
    }

    public int d() {
        return this.f6716a.length;
    }

    public String e() {
        byte[] bArr = this.f6716a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b2 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = dv.b.f7591a;
            cArr[i10] = cArr2[(b2 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int iD = jVar.d();
            byte[] bArr = this.f6716a;
            if (iD == bArr.length && jVar.l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i10, byte[] bArr) {
        br.l.e(bArr, "other");
        byte[] bArr2 = this.f6716a;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!xu.l.c(iMax, 0, bArr.length, bArr2, bArr)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] h() {
        return this.f6716a;
    }

    public int hashCode() {
        int i10 = this.f6717d;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f6716a);
        this.f6717d = iHashCode;
        return iHashCode;
    }

    public byte i(int i10) {
        return this.f6716a[i10];
    }

    public int j(byte[] bArr) {
        br.l.e(bArr, "other");
        int iD = d();
        byte[] bArr2 = this.f6716a;
        for (int iMin = Math.min(iD, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (xu.l.c(iMin, 0, bArr.length, bArr2, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean l(int i10, int i11, int i12, byte[] bArr) {
        br.l.e(bArr, "other");
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f6716a;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && xu.l.c(i10, i11, i12, bArr2, bArr);
    }

    public boolean m(int i10, j jVar, int i11) {
        br.l.e(jVar, "other");
        return jVar.l(0, i10, i11, this.f6716a);
    }

    public j n(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = d();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f6716a;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException(c7.a.q(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i11 - i10 >= 0) {
            return (i10 == 0 && i11 == bArr.length) ? this : new j(mq.l.g0(bArr, i10, i11));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public j p() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f6716a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i10];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                br.l.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b2 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b10 = bArrCopyOf[i11];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i11] = (byte) (b10 + 32);
                    }
                }
                return new j(bArrCopyOf);
            }
            i10++;
        }
    }

    public final String q() {
        String str = this.f6718g;
        if (str != null) {
            return str;
        }
        byte[] bArrH = h();
        br.l.e(bArrH, "<this>");
        String str2 = new String(bArrH, tt.a.f22975a);
        this.f6718g = str2;
        return str2;
    }

    public void r(g gVar, int i10) {
        gVar.i0(i10, this.f6716a);
    }

    public String toString() {
        byte b2;
        int i10;
        byte[] bArr = this.f6716a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            if (i11 >= length) {
                break;
            }
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                int i14 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                    break;
                }
                i12 += b10 < 65536 ? 1 : 2;
                i11++;
                while (true) {
                    i13 = i14;
                    if (i11 < length && (b2 = bArr[i11]) >= 0) {
                        i11++;
                        i14 = i13 + 1;
                        if (i13 == 64) {
                            break loop0;
                        }
                        if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                            break loop0;
                        }
                        i12 += b2 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b10 >> 5) == -2) {
                int i15 = i11 + 1;
                if (length > i15) {
                    byte b11 = bArr[i15];
                    if ((b11 & 192) == 128) {
                        int i16 = (b11 ^ 3968) ^ (b10 << 6);
                        if (i16 >= 128) {
                            i10 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                break;
                            }
                            i12 += i16 < 65536 ? 1 : 2;
                            i11 += 2;
                            i13 = i10;
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if ((b10 >> 4) == -2) {
                int i17 = i11 + 2;
                if (length > i17) {
                    byte b12 = bArr[i11 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i17];
                        if ((b13 & 192) == 128) {
                            int i18 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b10 << 12);
                            if (i18 < 2048) {
                                if (i13 != 64) {
                                    break;
                                }
                            } else if (55296 > i18 || i18 >= 57344) {
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                    break;
                                }
                                i12 += i18 < 65536 ? 1 : 2;
                                i11 += 3;
                                i13 = i10;
                            } else if (i13 != 64) {
                                break;
                            }
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if ((b10 >> 3) == -2) {
                int i19 = i11 + 3;
                if (length > i19) {
                    byte b14 = bArr[i11 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i11 + 2];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i19];
                            if ((b16 & 192) == 128) {
                                int i20 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b10 << 18);
                                if (i20 > 1114111) {
                                    if (i13 != 64) {
                                        break;
                                    }
                                } else if (55296 > i20 || i20 >= 57344) {
                                    if (i20 >= 65536) {
                                        i10 = i13 + 1;
                                        if (i13 == 64) {
                                            break;
                                        }
                                        if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                                            break;
                                        }
                                        i12 += i20 < 65536 ? 1 : 2;
                                        i11 += 4;
                                        i13 = i10;
                                    } else if (i13 != 64) {
                                        break;
                                    }
                                } else if (i13 != 64) {
                                    break;
                                }
                            } else if (i13 != 64) {
                                break;
                            }
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if (i13 != 64) {
                break;
            }
        }
        i12 = -1;
        if (i12 != -1) {
            String strQ = q();
            String strSubstring = strQ.substring(0, i12);
            br.l.d(strSubstring, "substring(...)");
            String strL0 = tt.s.l0(tt.s.l0(tt.s.l0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i12 >= strQ.length()) {
                return h0.b.g(']', "[text=", strL0);
            }
            return "[size=" + bArr.length + " text=" + strL0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(c7.a.q(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb2.append((64 == bArr.length ? this : new j(mq.l.g0(bArr, 0, 64))).e());
        sb2.append("…]");
        return sb2.toString();
    }
}
