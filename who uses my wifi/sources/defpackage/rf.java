package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rf extends cr {
    public int g;
    public int h;
    public int i;
    public InetAddress j;

    @Override // defpackage.cr
    public final void a(cm cmVar) throws t91, UnknownHostException {
        int iF = cmVar.f();
        this.g = iF;
        if (iF != 1 && iF != 2) {
            throw new t91("unknown address family");
        }
        int i = cmVar.i();
        this.h = i;
        if (i > a30.a(this.g) * 8) {
            throw new t91("invalid source netmask");
        }
        int i2 = cmVar.i();
        this.i = i2;
        if (i2 > a30.a(this.g) * 8) {
            throw new t91("invalid scope netmask");
        }
        byte[] bArrB = cmVar.b();
        if (bArrB.length != (this.h + 7) / 8) {
            throw new t91("invalid address");
        }
        byte[] bArr = new byte[a30.a(this.g)];
        System.arraycopy(bArrB, 0, bArr, 0, bArrB.length);
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            this.j = byAddress;
            int i3 = this.h;
            int iA = a30.a(a30.d(byAddress)) * 8;
            if (i3 < 0 || i3 > iA) {
                throw new IllegalArgumentException("invalid mask length");
            }
            if (i3 != iA) {
                byte[] address = byAddress.getAddress();
                int i4 = i3 / 8;
                for (int i5 = i4 + 1; i5 < address.length; i5++) {
                    address[i5] = 0;
                }
                int i6 = 0;
                for (int i7 = 0; i7 < i3 % 8; i7++) {
                    i6 |= 1 << (7 - i7);
                }
                address[i4] = (byte) (address[i4] & ((byte) i6));
                try {
                    byAddress = InetAddress.getByAddress(address);
                } catch (UnknownHostException unused) {
                    throw new IllegalArgumentException("invalid address");
                }
            }
            if (!byAddress.equals(this.j)) {
                throw new t91("invalid padding");
            }
        } catch (UnknownHostException e) {
            throw new t91("invalid address", e);
        }
    }

    @Override // defpackage.cr
    public final String b() {
        return this.j.getHostAddress() + "/" + this.h + ", scope netmask " + this.i;
    }

    @Override // defpackage.cr
    public final void c(t3 t3Var) {
        t3Var.m(this.g);
        t3Var.q(this.h);
        t3Var.q(this.i);
        t3Var.k(this.j.getAddress(), 0, (this.h + 7) / 8);
    }
}
