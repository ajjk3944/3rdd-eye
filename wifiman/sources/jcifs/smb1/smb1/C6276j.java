package jcifs.smb1.smb1;

import java.io.UnsupportedEncodingException;

/* renamed from: jcifs.smb1.smb1.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6276j {

    /* renamed from: a, reason: collision with root package name */
    C6277k f50561a;

    /* renamed from: b, reason: collision with root package name */
    int f50562b;

    /* renamed from: c, reason: collision with root package name */
    String f50563c;

    /* renamed from: d, reason: collision with root package name */
    boolean f50564d = false;

    /* renamed from: e, reason: collision with root package name */
    byte[] f50565e = null;

    /* renamed from: f, reason: collision with root package name */
    byte[] f50566f = null;

    /* renamed from: g, reason: collision with root package name */
    String f50567g = null;

    /* renamed from: h, reason: collision with root package name */
    int f50568h = 1;

    /* renamed from: i, reason: collision with root package name */
    Ug.e f50569i;

    public C6276j(C6277k c6277k, boolean z10) {
        this.f50561a = c6277k;
        int i10 = this.f50562b;
        this.f50562b = 537395204 | i10;
        if (z10) {
            this.f50562b = i10 | 1611169812;
        }
        this.f50563c = Tg.b.k();
        this.f50569i = Ug.e.a();
    }

    public String a() {
        return this.f50567g;
    }

    public byte[] b() {
        return this.f50566f;
    }

    public byte[] c(byte[] bArr, int i10, int i11) throws SmbException, UnsupportedEncodingException {
        byte[] bArrP;
        int i12 = this.f50568h;
        if (i12 == 1) {
            Tg.b bVar = new Tg.b(this.f50562b, this.f50561a.g(), this.f50563c);
            bArrP = bVar.p();
            Ug.e eVar = this.f50569i;
            if (Ug.e.f22464b >= 4) {
                eVar.println(bVar);
                Ug.e eVar2 = this.f50569i;
                if (Ug.e.f22464b >= 6) {
                    Ug.d.a(eVar2, bArrP, 0, bArrP.length);
                }
            }
            this.f50568h++;
        } else {
            if (i12 != 2) {
                throw new SmbException("Invalid state");
            }
            try {
                Tg.c cVar = new Tg.c(bArr);
                Ug.e eVar3 = this.f50569i;
                if (Ug.e.f22464b >= 4) {
                    eVar3.println(cVar);
                    Ug.e eVar4 = this.f50569i;
                    if (Ug.e.f22464b >= 6) {
                        Ug.d.a(eVar4, bArr, 0, bArr.length);
                    }
                }
                this.f50565e = cVar.j();
                this.f50562b &= cVar.a();
                Tg.d dVar = new Tg.d(cVar, this.f50561a.n(), this.f50561a.g(), this.f50561a.t(), this.f50563c, this.f50562b);
                bArrP = dVar.C();
                Ug.e eVar5 = this.f50569i;
                if (Ug.e.f22464b >= 4) {
                    eVar5.println(dVar);
                    Ug.e eVar6 = this.f50569i;
                    if (Ug.e.f22464b >= 6) {
                        Ug.d.a(eVar6, bArrP, 0, bArrP.length);
                    }
                }
                if ((this.f50562b & 16) != 0) {
                    this.f50566f = dVar.p();
                }
                this.f50564d = true;
                this.f50568h++;
            } catch (Exception e10) {
                throw new SmbException(e10.getMessage(), e10);
            }
        }
        return bArrP;
    }

    public boolean d() {
        return this.f50564d;
    }

    public String toString() {
        String string;
        String string2;
        String str = "NtlmContext[auth=" + this.f50561a + ",ntlmsspFlags=0x" + Ug.d.c(this.f50562b, 8) + ",workstation=" + this.f50563c + ",isEstablished=" + this.f50564d + ",state=" + this.f50568h + ",serverChallenge=";
        if (this.f50565e == null) {
            string = str + "null";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            byte[] bArr = this.f50565e;
            sb2.append(Ug.d.d(bArr, 0, bArr.length * 2));
            string = sb2.toString();
        }
        String str2 = string + ",signingKey=";
        if (this.f50566f == null) {
            string2 = str2 + "null";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            byte[] bArr2 = this.f50566f;
            sb3.append(Ug.d.d(bArr2, 0, bArr2.length * 2));
            string2 = sb3.toString();
        }
        return string2 + "]";
    }
}
