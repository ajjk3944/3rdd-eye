package B2;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f1117b;

    /* renamed from: c, reason: collision with root package name */
    private c f1118c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f1116a = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: d, reason: collision with root package name */
    private int f1119d = 0;

    private boolean b() {
        return this.f1118c.f1104b != 0;
    }

    private int d() {
        try {
            return this.f1117b.get() & 255;
        } catch (Exception unused) {
            this.f1118c.f1104b = 1;
            return 0;
        }
    }

    private void e() {
        this.f1118c.f1106d.f1092a = n();
        this.f1118c.f1106d.f1093b = n();
        this.f1118c.f1106d.f1094c = n();
        this.f1118c.f1106d.f1095d = n();
        int iD = d();
        boolean z10 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f1118c.f1106d;
        bVar.f1096e = (iD & 64) != 0;
        if (z10) {
            bVar.f1102k = g(iPow);
        } else {
            bVar.f1102k = null;
        }
        this.f1118c.f1106d.f1101j = this.f1117b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f1118c;
        cVar.f1105c++;
        cVar.f1107e.add(cVar.f1106d);
    }

    private void f() {
        int iD = d();
        this.f1119d = iD;
        if (iD <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f1119d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f1117b.get(this.f1116a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f1119d, e10);
                }
                this.f1118c.f1104b = 1;
                return;
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f1117b.get(bArr);
            iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f1118c.f1104b = 1;
        }
        return iArr;
    }

    private void h() {
        i(MPv3.MAX_MESSAGE_ID);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f1118c.f1105c <= i10) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f1118c.f1106d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f1116a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f1118c;
                if (cVar.f1106d == null) {
                    cVar.f1106d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f1118c.f1104b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f1118c.f1106d;
        int i10 = (iD & 28) >> 2;
        bVar.f1098g = i10;
        if (i10 == 0) {
            bVar.f1098g = 1;
        }
        bVar.f1097f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f1118c.f1106d;
        bVar2.f1100i = iN * 10;
        bVar2.f1099h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f1118c.f1104b = 1;
            return;
        }
        l();
        if (!this.f1118c.f1110h || b()) {
            return;
        }
        c cVar = this.f1118c;
        cVar.f1103a = g(cVar.f1111i);
        c cVar2 = this.f1118c;
        cVar2.f1114l = cVar2.f1103a[cVar2.f1112j];
    }

    private void l() {
        this.f1118c.f1108f = n();
        this.f1118c.f1109g = n();
        int iD = d();
        c cVar = this.f1118c;
        cVar.f1110h = (iD & 128) != 0;
        cVar.f1111i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f1118c.f1112j = d();
        this.f1118c.f1113k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f1116a;
            if (bArr[0] == 1) {
                this.f1118c.f1115m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f1119d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f1117b.getShort();
    }

    private void o() {
        this.f1117b = null;
        Arrays.fill(this.f1116a, (byte) 0);
        this.f1118c = new c();
        this.f1119d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f1117b.position(Math.min(this.f1117b.position() + iD, this.f1117b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f1117b = null;
        this.f1118c = null;
    }

    public c c() {
        if (this.f1117b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f1118c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f1118c;
            if (cVar.f1105c < 0) {
                cVar.f1104b = 1;
            }
        }
        return this.f1118c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f1117b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f1117b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
