package k1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2621c {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f21758b;

    /* renamed from: c, reason: collision with root package name */
    public C2620b f21759c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f21757a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f21760d = 0;

    public final boolean a() {
        return this.f21759c.f21748b != 0;
    }

    public final C2620b b() {
        byte[] bArr;
        if (this.f21758b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f21759c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f21759c.f21752f = this.f21758b.getShort();
            this.f21759c.f21753g = this.f21758b.getShort();
            int iC = c();
            C2620b c2620b = this.f21759c;
            c2620b.f21754h = (iC & 128) != 0;
            c2620b.i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f21759c.f21755j = c();
            C2620b c2620b2 = this.f21759c;
            c();
            c2620b2.getClass();
            if (this.f21759c.f21754h && !a()) {
                C2620b c2620b3 = this.f21759c;
                c2620b3.f21747a = e(c2620b3.i);
                C2620b c2620b4 = this.f21759c;
                c2620b4.f21756k = c2620b4.f21747a[c2620b4.f21755j];
            }
        } else {
            this.f21759c.f21748b = 1;
        }
        if (!a()) {
            boolean z6 = false;
            while (!z6 && !a() && this.f21759c.f21749c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.f21759c.f21750d = new C2619a();
                        c();
                        int iC4 = c();
                        C2619a c2619a = this.f21759c.f21750d;
                        int i3 = (iC4 & 28) >> 2;
                        c2619a.f21743g = i3;
                        if (i3 == 0) {
                            c2619a.f21743g = 1;
                        }
                        c2619a.f21742f = (iC4 & 1) != 0;
                        short s5 = this.f21758b.getShort();
                        if (s5 < 2) {
                            s5 = 10;
                        }
                        C2619a c2619a2 = this.f21759c.f21750d;
                        c2619a2.i = s5 * 10;
                        c2619a2.f21744h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i6 = 0;
                        while (true) {
                            bArr = this.f21757a;
                            if (i6 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i6]);
                            i6++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b5 = bArr[1];
                                    byte b6 = bArr[2];
                                    this.f21759c.getClass();
                                }
                                if (this.f21760d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    C2620b c2620b5 = this.f21759c;
                    if (c2620b5.f21750d == null) {
                        c2620b5.f21750d = new C2619a();
                    }
                    c2620b5.f21750d.f21737a = this.f21758b.getShort();
                    this.f21759c.f21750d.f21738b = this.f21758b.getShort();
                    this.f21759c.f21750d.f21739c = this.f21758b.getShort();
                    this.f21759c.f21750d.f21740d = this.f21758b.getShort();
                    int iC5 = c();
                    boolean z7 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    C2619a c2619a3 = this.f21759c.f21750d;
                    c2619a3.f21741e = (iC5 & 64) != 0;
                    if (z7) {
                        c2619a3.f21746k = e(iPow);
                    } else {
                        c2619a3.f21746k = null;
                    }
                    this.f21759c.f21750d.f21745j = this.f21758b.position();
                    c();
                    f();
                    if (!a()) {
                        C2620b c2620b6 = this.f21759c;
                        c2620b6.f21749c++;
                        c2620b6.f21751e.add(c2620b6.f21750d);
                    }
                } else if (iC2 != 59) {
                    this.f21759c.f21748b = 1;
                } else {
                    z6 = true;
                }
            }
            C2620b c2620b7 = this.f21759c;
            if (c2620b7.f21749c < 0) {
                c2620b7.f21748b = 1;
            }
        }
        return this.f21759c;
    }

    public final int c() {
        try {
            return this.f21758b.get() & 255;
        } catch (Exception unused) {
            this.f21759c.f21748b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f21760d = iC;
        if (iC <= 0) {
            return;
        }
        int i = 0;
        int i3 = 0;
        while (true) {
            try {
                i3 = this.f21760d;
                if (i >= i3) {
                    return;
                }
                i3 -= i;
                this.f21758b.get(this.f21757a, i, i3);
                i += i3;
            } catch (Exception e6) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i3 + " blockSize: " + this.f21760d, e6);
                }
                this.f21759c.f21748b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f21758b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i6 = 0;
            while (i3 < i) {
                int i7 = bArr[i6] & 255;
                int i8 = i6 + 2;
                int i9 = bArr[i6 + 1] & 255;
                i6 += 3;
                int i10 = i3 + 1;
                iArr[i3] = (i9 << 8) | (i7 << 16) | (-16777216) | (bArr[i8] & 255);
                i3 = i10;
            }
            return iArr;
        } catch (BufferUnderflowException e6) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e6);
            }
            this.f21759c.f21748b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f21758b.position(Math.min(this.f21758b.position() + iC, this.f21758b.limit()));
        } while (iC > 0);
    }
}
