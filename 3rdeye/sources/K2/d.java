package K2;

import android.util.Log;
import androidx.work.s;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: GifHeaderParser.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f3088b;

    /* renamed from: c, reason: collision with root package name */
    public c f3089c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3087a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f3090d = 0;

    public final boolean a() {
        return this.f3089c.f3078b != 0;
    }

    public final c b() {
        byte[] bArr;
        if (this.f3088b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f3089c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f3089c.f3082f = this.f3088b.getShort();
            this.f3089c.f3083g = this.f3088b.getShort();
            int iC = c();
            c cVar = this.f3089c;
            cVar.f3084h = (iC & 128) != 0;
            cVar.i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f3089c.f3085j = c();
            c cVar2 = this.f3089c;
            c();
            cVar2.getClass();
            if (this.f3089c.f3084h && !a()) {
                c cVar3 = this.f3089c;
                cVar3.f3077a = e(cVar3.i);
                c cVar4 = this.f3089c;
                cVar4.f3086k = cVar4.f3077a[cVar4.f3085j];
            }
        } else {
            this.f3089c.f3078b = 1;
        }
        if (!a()) {
            boolean z10 = false;
            while (!z10 && !a() && this.f3089c.f3079c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.f3089c.f3080d = new b();
                        c();
                        int iC4 = c();
                        b bVar = this.f3089c.f3080d;
                        int i10 = (iC4 & 28) >> 2;
                        bVar.f3073g = i10;
                        if (i10 == 0) {
                            bVar.f3073g = 1;
                        }
                        bVar.f3072f = (iC4 & 1) != 0;
                        short s10 = this.f3088b.getShort();
                        if (s10 < 2) {
                            s10 = 10;
                        }
                        b bVar2 = this.f3089c.f3080d;
                        bVar2.i = s10 * 10;
                        bVar2.f3074h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i11 = 0;
                        while (true) {
                            bArr = this.f3087a;
                            if (i11 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i11]);
                            i11++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b10 = bArr[1];
                                    byte b11 = bArr[2];
                                    this.f3089c.getClass();
                                }
                                if (this.f3090d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    c cVar5 = this.f3089c;
                    if (cVar5.f3080d == null) {
                        cVar5.f3080d = new b();
                    }
                    this.f3089c.f3080d.f3067a = this.f3088b.getShort();
                    this.f3089c.f3080d.f3068b = this.f3088b.getShort();
                    this.f3089c.f3080d.f3069c = this.f3088b.getShort();
                    this.f3089c.f3080d.f3070d = this.f3088b.getShort();
                    int iC5 = c();
                    boolean z11 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    b bVar3 = this.f3089c.f3080d;
                    bVar3.f3071e = (iC5 & 64) != 0;
                    if (z11) {
                        bVar3.f3076k = e(iPow);
                    } else {
                        bVar3.f3076k = null;
                    }
                    this.f3089c.f3080d.f3075j = this.f3088b.position();
                    c();
                    f();
                    if (!a()) {
                        c cVar6 = this.f3089c;
                        cVar6.f3079c++;
                        cVar6.f3081e.add(cVar6.f3080d);
                    }
                } else if (iC2 != 59) {
                    this.f3089c.f3078b = 1;
                } else {
                    z10 = true;
                }
            }
            c cVar7 = this.f3089c;
            if (cVar7.f3079c < 0) {
                cVar7.f3078b = 1;
            }
        }
        return this.f3089c;
    }

    public final int c() {
        try {
            return this.f3088b.get() & 255;
        } catch (Exception unused) {
            this.f3089c.f3078b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f3090d = iC;
        if (iC <= 0) {
            return;
        }
        int i = 0;
        int i10 = 0;
        while (true) {
            try {
                i10 = this.f3090d;
                if (i >= i10) {
                    return;
                }
                i10 -= i;
                this.f3088b.get(this.f3087a, i, i10);
                i += i10;
            } catch (Exception e4) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbI = s.i("Error Reading Block n: ", i, " count: ", i10, " blockSize: ");
                    sbI.append(this.f3090d);
                    Log.d("GifHeaderParser", sbI.toString(), e4);
                }
                this.f3089c.f3078b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f3088b.get(bArr);
            iArr = new int[256];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i) {
                int i12 = bArr[i11] & 255;
                int i13 = i11 + 2;
                int i14 = bArr[i11 + 1] & 255;
                i11 += 3;
                int i15 = i10 + 1;
                iArr[i10] = (i14 << 8) | (i12 << 16) | (-16777216) | (bArr[i13] & 255);
                i10 = i15;
            }
            return iArr;
        } catch (BufferUnderflowException e4) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e4);
            }
            this.f3089c.f3078b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f3088b.position(Math.min(this.f3088b.position() + iC, this.f3088b.limit()));
        } while (iC > 0);
    }
}
