package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sn0 implements ec {
    public final ac f = new ac();
    public final gx0 g;
    public boolean h;

    public sn0(gx0 gx0Var) {
        this.g = gx0Var;
    }

    public final long a(jc jcVar) {
        long j;
        long j2;
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            long j3 = 0;
            ac acVar = this.f;
            if (jMax < 0) {
                acVar.getClass();
                throw new IllegalArgumentException("fromIndex < 0");
            }
            xt0 xt0Var = acVar.f;
            if (xt0Var == null) {
                j = -1;
            } else {
                long j4 = acVar.g;
                if (j4 - jMax < jMax) {
                    while (j4 > jMax) {
                        xt0Var = xt0Var.g;
                        j4 -= xt0Var.c - xt0Var.b;
                    }
                } else {
                    while (true) {
                        long j5 = (xt0Var.c - xt0Var.b) + j3;
                        if (j5 >= jMax) {
                            break;
                        }
                        xt0Var = xt0Var.f;
                        j3 = j5;
                    }
                    j4 = j3;
                }
                int i = 0;
                if (jcVar.g() == 2) {
                    byte b = jcVar.b(0);
                    byte b2 = jcVar.b(1);
                    long j6 = jMax;
                    while (j4 < acVar.g) {
                        byte[] bArr = xt0Var.a;
                        int i2 = xt0Var.c;
                        for (int i3 = (int) ((xt0Var.b + j6) - j4); i3 < i2; i3++) {
                            byte b3 = bArr[i3];
                            if (b3 == b || b3 == b2) {
                                j2 = i3 - xt0Var.b;
                                j = j2 + j4;
                                break;
                            }
                        }
                        j6 = (xt0Var.c - xt0Var.b) + j4;
                        xt0Var = xt0Var.f;
                        j4 = j6;
                    }
                    j = -1;
                } else {
                    byte[] bArrD = jcVar.d();
                    long j7 = jMax;
                    while (j4 < acVar.g) {
                        byte[] bArr2 = xt0Var.a;
                        int i4 = (int) ((xt0Var.b + j7) - j4);
                        int i5 = xt0Var.c;
                        while (i4 < i5) {
                            byte b4 = bArr2[i4];
                            int length = bArrD.length;
                            for (int i6 = i; i6 < length; i6++) {
                                if (b4 == bArrD[i6]) {
                                    j2 = i4 - xt0Var.b;
                                    j = j2 + j4;
                                    break;
                                }
                            }
                            i4++;
                            i = 0;
                        }
                        j7 = j4 + (xt0Var.c - xt0Var.b);
                        xt0Var = xt0Var.f;
                        j4 = j7;
                        i = 0;
                    }
                    j = -1;
                }
            }
            if (j != -1) {
                return j;
            }
            long j8 = acVar.g;
            if (this.g.e(acVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j8);
        }
    }

    @Override // defpackage.ec
    public final ac b() {
        return this.f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.h) {
            return;
        }
        this.h = true;
        this.g.close();
        ac acVar = this.f;
        try {
            acVar.h(acVar.g);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.ec
    public final boolean d(long j) {
        ac acVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        do {
            acVar = this.f;
            if (acVar.g >= j) {
                return true;
            }
        } while (this.g.e(acVar, 8192L) != -1);
        return false;
    }

    @Override // defpackage.gx0
    public final long e(ac acVar, long j) {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        ac acVar2 = this.f;
        if (acVar2.g == 0 && this.g.e(acVar2, 8192L) == -1) {
            return -1L;
        }
        return acVar2.e(acVar, Math.min(8192L, acVar2.g));
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        ac acVar = this.f;
        if (acVar.g == 0 && this.g.e(acVar, 8192L) == -1) {
            return -1;
        }
        return acVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.g + ")";
    }
}
