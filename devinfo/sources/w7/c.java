package w7;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f36517b;

    /* renamed from: c, reason: collision with root package name */
    public b f36518c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f36516a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f36519d = 0;

    public final boolean a() {
        return this.f36518c.f36508b != 0;
    }

    public final b b() {
        byte[] bArr;
        if (this.f36517b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f36518c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < 6; i4++) {
            sb2.append((char) c());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f36518c.f36512f = this.f36517b.getShort();
            this.f36518c.g = this.f36517b.getShort();
            int iC = c();
            b bVar = this.f36518c;
            bVar.f36513h = (iC & 128) != 0;
            bVar.f36514i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f36518c.j = c();
            b bVar2 = this.f36518c;
            c();
            bVar2.getClass();
            if (this.f36518c.f36513h && !a()) {
                b bVar3 = this.f36518c;
                bVar3.f36507a = e(bVar3.f36514i);
                b bVar4 = this.f36518c;
                bVar4.f36515k = bVar4.f36507a[bVar4.j];
            }
        } else {
            this.f36518c.f36508b = 1;
        }
        if (!a()) {
            boolean z3 = false;
            while (!z3 && !a() && this.f36518c.f36509c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.f36518c.f36510d = new a();
                        c();
                        int iC4 = c();
                        a aVar = this.f36518c.f36510d;
                        int i10 = (iC4 & 28) >> 2;
                        aVar.g = i10;
                        if (i10 == 0) {
                            aVar.g = 1;
                        }
                        aVar.f36503f = (iC4 & 1) != 0;
                        short s10 = this.f36517b.getShort();
                        if (s10 < 2) {
                            s10 = 10;
                        }
                        a aVar2 = this.f36518c.f36510d;
                        aVar2.f36505i = s10 * 10;
                        aVar2.f36504h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb3 = new StringBuilder();
                        int i11 = 0;
                        while (true) {
                            bArr = this.f36516a;
                            if (i11 >= 11) {
                                break;
                            }
                            sb3.append((char) bArr[i11]);
                            i11++;
                        }
                        if (sb3.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b10 = bArr[1];
                                    byte b11 = bArr[2];
                                    this.f36518c.getClass();
                                }
                                if (this.f36519d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    b bVar5 = this.f36518c;
                    if (bVar5.f36510d == null) {
                        bVar5.f36510d = new a();
                    }
                    bVar5.f36510d.f36498a = this.f36517b.getShort();
                    this.f36518c.f36510d.f36499b = this.f36517b.getShort();
                    this.f36518c.f36510d.f36500c = this.f36517b.getShort();
                    this.f36518c.f36510d.f36501d = this.f36517b.getShort();
                    int iC5 = c();
                    boolean z10 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    a aVar3 = this.f36518c.f36510d;
                    aVar3.f36502e = (iC5 & 64) != 0;
                    if (z10) {
                        aVar3.f36506k = e(iPow);
                    } else {
                        aVar3.f36506k = null;
                    }
                    this.f36518c.f36510d.j = this.f36517b.position();
                    c();
                    f();
                    if (!a()) {
                        b bVar6 = this.f36518c;
                        bVar6.f36509c++;
                        bVar6.f36511e.add(bVar6.f36510d);
                    }
                } else if (iC2 != 59) {
                    this.f36518c.f36508b = 1;
                } else {
                    z3 = true;
                }
            }
            b bVar7 = this.f36518c;
            if (bVar7.f36509c < 0) {
                bVar7.f36508b = 1;
            }
        }
        return this.f36518c;
    }

    public final int c() {
        try {
            return this.f36517b.get() & 255;
        } catch (Exception unused) {
            this.f36518c.f36508b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f36519d = iC;
        if (iC <= 0) {
            return;
        }
        int i4 = 0;
        int i10 = 0;
        while (true) {
            try {
                i10 = this.f36519d;
                if (i4 >= i10) {
                    return;
                }
                i10 -= i4;
                this.f36517b.get(this.f36516a, i4, i10);
                i4 += i10;
            } catch (Exception e2) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbN = r5.c.n(i4, "Error Reading Block n: ", " count: ", i10, " blockSize: ");
                    sbN.append(this.f36519d);
                    Log.d("GifHeaderParser", sbN.toString(), e2);
                }
                this.f36518c.f36508b = 1;
                return;
            }
        }
    }

    public final int[] e(int i4) {
        byte[] bArr = new byte[i4 * 3];
        int[] iArr = null;
        try {
            this.f36517b.get(bArr);
            iArr = new int[256];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i4) {
                int i12 = bArr[i11] & 255;
                int i13 = i11 + 2;
                int i14 = bArr[i11 + 1] & 255;
                i11 += 3;
                int i15 = i10 + 1;
                iArr[i10] = (i14 << 8) | (i12 << 16) | (-16777216) | (bArr[i13] & 255);
                i10 = i15;
            }
            return iArr;
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f36518c.f36508b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f36517b.position(Math.min(this.f36517b.position() + iC, this.f36517b.limit()));
        } while (iC > 0);
    }
}
