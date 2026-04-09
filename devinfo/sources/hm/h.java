package hm;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class h implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final h f25175d = new h(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f25176a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f25177b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f25178c;

    public h(byte[] bArr) {
        nk.k.e(bArr, "data");
        this.f25176a = bArr;
    }

    public int a() {
        return this.f25176a.length;
    }

    public String b() {
        byte[] bArr = this.f25176a;
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b10 : bArr) {
            int i10 = i4 + 1;
            char[] cArr2 = im.b.f26018a;
            cArr[i4] = cArr2[(b10 >> 4) & 15];
            i4 += 2;
            cArr[i10] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f25176a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        nk.k.e(hVar, "other");
        int iA = a();
        int iA2 = hVar.a();
        int iMin = Math.min(iA, iA2);
        for (int i4 = 0; i4 < iMin; i4++) {
            int iD = d(i4) & 255;
            int iD2 = hVar.d(i4) & 255;
            if (iD != iD2) {
                return iD < iD2 ? -1 : 1;
            }
        }
        if (iA == iA2) {
            return 0;
        }
        return iA < iA2 ? -1 : 1;
    }

    public byte d(int i4) {
        return this.f25176a[i4];
    }

    public boolean e(int i4, byte[] bArr, int i10, int i11) {
        nk.k.e(bArr, "other");
        if (i4 < 0) {
            return false;
        }
        byte[] bArr2 = this.f25176a;
        return i4 <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && i0.b(bArr2, i4, bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int iA = hVar.a();
            byte[] bArr = this.f25176a;
            if (iA == bArr.length && hVar.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(h hVar, int i4) {
        nk.k.e(hVar, "other");
        return hVar.e(0, this.f25176a, 0, i4);
    }

    public String g(Charset charset) {
        nk.k.e(charset, "charset");
        return new String(this.f25176a, charset);
    }

    public h h(int i4, int i10) {
        if (i10 == -1234567890) {
            i10 = a();
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f25176a;
        if (i10 > bArr.length) {
            throw new IllegalArgumentException(d.h.u(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i10 - i4 >= 0) {
            return (i4 == 0 && i10 == bArr.length) ? this : new h(zj.m.S(i4, i10, bArr));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public int hashCode() {
        int i4 = this.f25177b;
        if (i4 != 0) {
            return i4;
        }
        int iHashCode = Arrays.hashCode(this.f25176a);
        this.f25177b = iHashCode;
        return iHashCode;
    }

    public h i() {
        int i4 = 0;
        while (true) {
            byte[] bArr = this.f25176a;
            if (i4 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i4];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                nk.k.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i4] = (byte) (b10 + 32);
                for (int i10 = i4 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b11 = bArrCopyOf[i10];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i10] = (byte) (b11 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
            i4++;
        }
    }

    public final String j() {
        String str = this.f25178c;
        if (str != null) {
            return str;
        }
        byte[] bArrC = c();
        nk.k.e(bArrC, "<this>");
        String str2 = new String(bArrC, vk.a.f36267a);
        this.f25178c = str2;
        return str2;
    }

    public void k(e eVar, int i4) {
        eVar.write(this.f25176a, 0, i4);
    }

    public String toString() {
        byte b10;
        int i4;
        byte[] bArr = this.f25176a;
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
                            i4 = i12 + 1;
                            if (i12 == 64) {
                                break;
                            }
                            if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                break;
                            }
                            i11 += i15 < 65536 ? 1 : 2;
                            i10 += 2;
                            i12 = i4;
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
                                i4 = i12 + 1;
                                if (i12 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    break;
                                }
                                i11 += i17 < 65536 ? 1 : 2;
                                i10 += 3;
                                i12 = i4;
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
                                        i4 = i12 + 1;
                                        if (i12 == 64) {
                                            break;
                                        }
                                        if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                            break;
                                        }
                                        i11 += i19 < 65536 ? 1 : 2;
                                        i10 += 4;
                                        i12 = i4;
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
            nk.k.d(strSubstring, "substring(...)");
            String strU0 = vk.p.u0(vk.p.u0(vk.p.u0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i11 >= strJ.length()) {
                return d.h.p(']', "[text=", strU0);
            }
            return "[size=" + bArr.length + " text=" + strU0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(d.h.u(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb2.append((64 == bArr.length ? this : new h(zj.m.S(0, 64, bArr))).b());
        sb2.append("…]");
        return sb2.toString();
    }
}
