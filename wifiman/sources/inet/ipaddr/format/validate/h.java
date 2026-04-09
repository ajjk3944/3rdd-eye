package inet.ipaddr.format.validate;

import inet.ipaddr.AddressStringException;
import inet.ipaddr.IncompatibleAddressException;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class h implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final a f49381i = new a();

    /* renamed from: j, reason: collision with root package name */
    static final i f49382j = new i();

    /* renamed from: a, reason: collision with root package name */
    private String[] f49383a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f49384b;

    /* renamed from: c, reason: collision with root package name */
    private boolean[] f49385c;

    /* renamed from: d, reason: collision with root package name */
    private final i f49386d;

    /* renamed from: e, reason: collision with root package name */
    private String f49387e;

    /* renamed from: f, reason: collision with root package name */
    private a f49388f;

    /* renamed from: g, reason: collision with root package name */
    String f49389g;

    /* renamed from: h, reason: collision with root package name */
    private final String f49390h;

    static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        boolean f49391a;

        /* renamed from: b, reason: collision with root package name */
        boolean f49392b;

        /* renamed from: c, reason: collision with root package name */
        AddressStringException f49393c;

        /* renamed from: d, reason: collision with root package name */
        d f49394d;

        a() {
        }
    }

    public h(String str, d dVar) {
        this(str, null, null, f49382j, new a());
        this.f49388f.f49394d = dVar;
    }

    private boolean o() {
        return this.f49388f.f49394d != null;
    }

    private String r(d dVar) {
        return dVar.U() ? inet.ipaddr.a.f49279e : dVar.i0() ? inet.ipaddr.i.v(dVar.g0().intValue()) : dVar.y0() ? "" : this.f49390h;
    }

    public inet.ipaddr.g a() {
        if (o()) {
            return d().M();
        }
        return null;
    }

    public inet.ipaddr.n c() {
        if (!o()) {
            return null;
        }
        d dVarD = d();
        if (dVarD.U()) {
            return new inet.ipaddr.n(inet.ipaddr.a.f49279e, dVarD.getParameters());
        }
        if (dVarD.i0()) {
            return new inet.ipaddr.n(inet.ipaddr.i.v(dVarD.g0().intValue()), dVarD.getParameters());
        }
        if (dVarD.y0()) {
            return new inet.ipaddr.n("", dVarD.getParameters());
        }
        try {
            return dVarD.M().k1();
        } catch (IncompatibleAddressException unused) {
            return new inet.ipaddr.n(this.f49390h, dVarD.getParameters());
        }
    }

    public d d() {
        return this.f49388f.f49394d;
    }

    public Integer g() {
        return this.f49386d.h();
    }

    public String h() {
        String str = this.f49389g;
        if (str != null) {
            return str;
        }
        if (this.f49390h.length() <= 0) {
            String str2 = this.f49390h;
            this.f49389g = str2;
            return str2;
        }
        synchronized (this) {
            try {
                String str3 = this.f49389g;
                if (str3 != null) {
                    return str3;
                }
                if (o()) {
                    d dVarD = d();
                    try {
                        inet.ipaddr.g gVarM = dVarD.M();
                        if (gVarM != null) {
                            String strX = gVarM.v().X();
                            this.f49389g = strX;
                            return strX;
                        }
                    } catch (IncompatibleAddressException unused) {
                    }
                    String strR = r(dVarD);
                    this.f49389g = strR;
                    return strR;
                }
                StringBuilder sb2 = new StringBuilder(this.f49390h.length());
                String[] strArrL = l();
                sb2.append(strArrL[0]);
                for (int i10 = 1; i10 < strArrL.length; i10++) {
                    sb2.append('.');
                    sb2.append(strArrL[i10]);
                }
                String string = sb2.toString();
                this.f49389g = string;
                return string;
            } finally {
            }
        }
    }

    public inet.ipaddr.g j() {
        return this.f49386d.l();
    }

    public String[] l() {
        String[] strArr = this.f49383a;
        if (strArr == null) {
            synchronized (this) {
                try {
                    strArr = this.f49383a;
                    if (strArr == null) {
                        int i10 = 0;
                        if (o()) {
                            d dVarD = d();
                            try {
                                inet.ipaddr.g gVarM = dVarD.M();
                                if (gVarM != null) {
                                    String[] strArrC2 = gVarM.v().c2();
                                    this.f49383a = strArrC2;
                                    return strArrC2;
                                }
                            } catch (IncompatibleAddressException unused) {
                            }
                            strArr = dVarD.y0() ? new String[0] : new String[]{r(dVarD)};
                        } else {
                            int length = this.f49384b.length;
                            String[] strArr2 = new String[length];
                            int i11 = -1;
                            while (i10 < length) {
                                int i12 = this.f49384b[i10];
                                boolean[] zArr = this.f49385c;
                                if (zArr == null || zArr[i10]) {
                                    strArr2[i10] = this.f49390h.substring(i11 + 1, i12);
                                } else {
                                    StringBuilder sb2 = new StringBuilder((i12 - i11) - 1);
                                    while (true) {
                                        i11++;
                                        if (i11 >= i12) {
                                            break;
                                        }
                                        char cCharAt = this.f49390h.charAt(i11);
                                        if (cCharAt >= 'A' && cCharAt <= 'Z') {
                                            cCharAt = (char) (cCharAt + ' ');
                                        }
                                        sb2.append(cCharAt);
                                    }
                                    strArr2[i10] = sb2.toString();
                                }
                                i10++;
                                i11 = i12;
                            }
                            this.f49384b = null;
                            this.f49385c = null;
                            strArr = strArr2;
                        }
                        this.f49383a = strArr;
                    }
                } finally {
                }
            }
        }
        return strArr;
    }

    public Integer m() {
        return this.f49386d.m();
    }

    public String n() {
        CharSequence charSequenceN;
        String str = this.f49387e;
        if (str != null || (charSequenceN = this.f49386d.n()) == null) {
            return str;
        }
        String string = charSequenceN.toString();
        this.f49387e = string;
        return string;
    }

    public boolean p() {
        return d() != null;
    }

    public h(String str, d dVar, i iVar) {
        this(str, null, null, iVar, new a());
        this.f49388f.f49394d = dVar;
    }

    h(String str, int[] iArr, boolean[] zArr, i iVar) {
        this(str, iArr, zArr, iVar, null);
    }

    h(String str, int[] iArr, boolean[] zArr, i iVar, a aVar) {
        this.f49386d = iVar;
        this.f49385c = zArr;
        this.f49384b = iArr;
        this.f49390h = str;
        this.f49388f = aVar == null ? f49381i : aVar;
    }
}
