package ja;

import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f13517a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static m b(byte[] bArr) {
        fb.f fVar = new fb.f(bArr);
        if (fVar.f8802c >= 32) {
            fVar.y(0);
            if (fVar.d() == fVar.a() + 4 && fVar.d() == 1886614376) {
                int iN = c5.a.n(fVar.d());
                if (iN > 1) {
                    c7.a.y("Unsupported pssh version: ", 37, iN, "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(fVar.j(), fVar.j());
                if (iN == 1) {
                    fVar.z(fVar.r() * 16);
                }
                int iR = fVar.r();
                if (iR == fVar.a()) {
                    byte[] bArr2 = new byte[iR];
                    fVar.c(bArr2, 0, iR);
                    return new m(uuid, iN, bArr2);
                }
            }
        }
        return null;
    }

    public static boolean c(ca.l lVar, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        long length = lVar.getLength();
        long j = -1;
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j7 = 4096;
        if (i12 != 0 && length <= 4096) {
            j7 = length;
        }
        int i13 = (int) j7;
        fb.f fVar = new fb.f(64);
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (i15 < i13) {
            fVar.v(8);
            if (!lVar.c(fVar.f8800a, i14, 8, true)) {
                break;
            }
            long jP = fVar.p();
            int iD = fVar.d();
            if (jP == 1) {
                lVar.p(fVar.f8800a, 8, 8);
                fVar.x(16);
                i10 = i15;
                i11 = 16;
                jP = fVar.j();
            } else {
                if (jP == 0) {
                    long length2 = lVar.getLength();
                    if (length2 != j) {
                        jP = (length2 - lVar.d()) + 8;
                    }
                }
                i10 = i15;
                i11 = 8;
            }
            long j10 = i11;
            if (jP < j10) {
                return false;
            }
            int i16 = i10 + i11;
            if (iD == 1836019574) {
                i13 += (int) jP;
                if (i12 != 0 && i13 > length) {
                    i13 = (int) length;
                }
                i15 = i16;
            } else {
                if (iD == 1836019558 || iD == 1836475768) {
                    z12 = true;
                    break;
                }
                int i17 = i12;
                if ((i16 + jP) - j10 >= i13) {
                    break;
                }
                int i18 = (int) (jP - j10);
                i15 = i16 + i18;
                if (iD == 1718909296) {
                    if (i18 < 8) {
                        return false;
                    }
                    fVar.v(i18);
                    lVar.p(fVar.f8800a, 0, i18);
                    int i19 = i18 / 4;
                    for (int i20 = 0; i20 < i19; i20++) {
                        if (i20 != 1) {
                            int iD2 = fVar.d();
                            if ((iD2 >>> 8) != 3368816 && (iD2 != 1751476579 || !z11)) {
                                for (int i21 = 0; i21 < 29; i21++) {
                                    if (f13517a[i21] != iD2) {
                                    }
                                }
                            }
                            z13 = true;
                            break;
                        }
                        fVar.z(4);
                    }
                    if (!z13) {
                        return false;
                    }
                } else if (i18 != 0) {
                    lVar.g(i18);
                }
                i12 = i17;
            }
            j = -1;
            i14 = 0;
        }
        z12 = false;
        return z13 && z10 == z12;
    }
}
