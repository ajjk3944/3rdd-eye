package Lg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f extends e {

    /* renamed from: o, reason: collision with root package name */
    public static boolean f11680o = true;

    /* renamed from: h, reason: collision with root package name */
    Map f11681h;

    /* renamed from: i, reason: collision with root package name */
    private int f11682i;

    /* renamed from: j, reason: collision with root package name */
    private final a f11683j;

    /* renamed from: k, reason: collision with root package name */
    private final a f11684k;

    /* renamed from: l, reason: collision with root package name */
    private final a f11685l;

    /* renamed from: m, reason: collision with root package name */
    private final a f11686m;

    /* renamed from: n, reason: collision with root package name */
    private InetSocketAddress f11687n;

    public static class a extends ByteArrayOutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final f f11688a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11689b;

        a(int i10, f fVar) {
            this(i10, fVar, 0);
        }

        private static int a(String str) {
            int iIndexOf;
            int i10 = 0;
            while (true) {
                iIndexOf = str.indexOf(46, i10);
                if (iIndexOf < 0) {
                    return -1;
                }
                if (iIndexOf == 0 || str.charAt(iIndexOf - 1) != '\\') {
                    break;
                }
                i10 = iIndexOf + 1;
            }
            return iIndexOf;
        }

        void C(int i10) {
            g(i10 >> 8);
            g(i10);
        }

        void J(String str, int i10, int i11) {
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                char cCharAt = str.charAt(i10 + i13);
                i12 = (cCharAt < 1 || cCharAt > 127) ? cCharAt > 2047 ? i12 + 3 : i12 + 2 : i12 + 1;
            }
            g(i12);
            for (int i14 = 0; i14 < i11; i14++) {
                char cCharAt2 = str.charAt(i10 + i14);
                if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                    g(cCharAt2);
                } else if (cCharAt2 > 2047) {
                    g(((cCharAt2 >> '\f') & 15) | 224);
                    g(((cCharAt2 >> 6) & 63) | 128);
                    g((cCharAt2 & '?') | 128);
                } else {
                    g(((cCharAt2 >> 6) & 31) | 192);
                    g((cCharAt2 & '?') | 128);
                }
            }
        }

        void g(int i10) {
            write(i10 & 255);
        }

        void h(byte[] bArr, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                g(bArr[i10 + i12]);
            }
        }

        void j(int i10) {
            C(i10 >> 16);
            C(i10);
        }

        void p(String str) {
            s(str, true);
        }

        void s(String str, boolean z10) {
            while (true) {
                int iA = a(str);
                if (iA < 0) {
                    iA = str.length();
                }
                if (iA <= 0) {
                    g(0);
                    return;
                }
                String strReplace = str.substring(0, iA).replace("\\.", ".");
                if (z10 && f.f11680o) {
                    Integer num = (Integer) this.f11688a.f11681h.get(str);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        g((iIntValue >> 8) | 192);
                        g(iIntValue & 255);
                        return;
                    }
                    this.f11688a.f11681h.put(str, Integer.valueOf(size() + this.f11689b));
                    J(strReplace, 0, strReplace.length());
                } else {
                    J(strReplace, 0, strReplace.length());
                }
                str = str.substring(iA);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }

        void v(g gVar) {
            p(gVar.d());
            C(gVar.g().indexValue());
            C(gVar.f().indexValue());
        }

        @Override // java.io.ByteArrayOutputStream
        public void writeBytes(byte[] bArr) {
            if (bArr != null) {
                h(bArr, 0, bArr.length);
            }
        }

        void y(h hVar, long j10) throws IOException {
            p(hVar.d());
            C(hVar.g().indexValue());
            C(hVar.f().indexValue() | ((hVar.q() && this.f11688a.o()) ? 32768 : 0));
            j(j10 == 0 ? hVar.H() : hVar.D(j10));
            a aVar = new a(512, this.f11688a, this.f11689b + size() + 2);
            hVar.V(aVar);
            byte[] byteArray = aVar.toByteArray();
            C(byteArray.length);
            write(byteArray, 0, byteArray.length);
        }

        a(int i10, f fVar, int i11) {
            super(i10);
            this.f11688a = fVar;
            this.f11689b = i11;
        }
    }

    public f(int i10) {
        this(i10, true, 1460);
    }

    public void A(g gVar) throws IOException {
        a aVar = new a(512, this);
        aVar.v(gVar);
        byte[] byteArray = aVar.toByteArray();
        aVar.close();
        if (byteArray.length >= B()) {
            throw new IOException("message full");
        }
        this.f11676d.add(gVar);
        this.f11683j.write(byteArray, 0, byteArray.length);
    }

    public int B() {
        return ((((this.f11682i - 12) - this.f11683j.size()) - this.f11684k.size()) - this.f11685l.size()) - this.f11686m.size();
    }

    public byte[] C() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f11681h.clear();
        a aVar = new a(this.f11682i, this);
        aVar.C(this.f11674b ? 0 : f());
        aVar.C(e());
        aVar.C(j());
        aVar.C(h());
        aVar.C(i());
        aVar.C(g());
        Iterator it = this.f11676d.iterator();
        while (it.hasNext()) {
            aVar.v((g) it.next());
        }
        Iterator it2 = this.f11677e.iterator();
        while (it2.hasNext()) {
            aVar.y((h) it2.next(), jCurrentTimeMillis);
        }
        Iterator it3 = this.f11678f.iterator();
        while (it3.hasNext()) {
            aVar.y((h) it3.next(), jCurrentTimeMillis);
        }
        Iterator it4 = this.f11679g.iterator();
        while (it4.hasNext()) {
            aVar.y((h) it4.next(), jCurrentTimeMillis);
        }
        byte[] byteArray = aVar.toByteArray();
        try {
            aVar.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public InetSocketAddress D() {
        return this.f11687n;
    }

    public int E() {
        return this.f11682i;
    }

    public void F(InetSocketAddress inetSocketAddress) {
        this.f11687n = inetSocketAddress;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p() ? "dns[query:" : "dns[response:");
        sb2.append(" id=0x");
        sb2.append(Integer.toHexString(f()));
        if (e() != 0) {
            sb2.append(", flags=0x");
            sb2.append(Integer.toHexString(e()));
            if (q()) {
                sb2.append(":r");
            }
            if (m()) {
                sb2.append(":aa");
            }
            if (r()) {
                sb2.append(":tc");
            }
        }
        if (j() > 0) {
            sb2.append(", questions=");
            sb2.append(j());
        }
        if (h() > 0) {
            sb2.append(", answers=");
            sb2.append(h());
        }
        if (i() > 0) {
            sb2.append(", authorities=");
            sb2.append(i());
        }
        if (g() > 0) {
            sb2.append(", additionals=");
            sb2.append(g());
        }
        if (j() > 0) {
            sb2.append("\nquestions:");
            for (g gVar : this.f11676d) {
                sb2.append("\n\t");
                sb2.append(gVar);
            }
        }
        if (h() > 0) {
            sb2.append("\nanswers:");
            for (h hVar : this.f11677e) {
                sb2.append("\n\t");
                sb2.append(hVar);
            }
        }
        if (i() > 0) {
            sb2.append("\nauthorities:");
            for (h hVar2 : this.f11678f) {
                sb2.append("\n\t");
                sb2.append(hVar2);
            }
        }
        if (g() > 0) {
            sb2.append("\nadditionals:");
            for (h hVar3 : this.f11679g) {
                sb2.append("\n\t");
                sb2.append(hVar3);
            }
        }
        sb2.append("\nnames=");
        sb2.append(this.f11681h);
        sb2.append("]");
        return sb2.toString();
    }

    public void x(c cVar, h hVar) throws IOException {
        if (cVar == null || !hVar.T(cVar)) {
            y(hVar, 0L);
        }
    }

    public void y(h hVar, long j10) throws IOException {
        if (hVar != null) {
            if (j10 == 0 || !hVar.k(j10)) {
                a aVar = new a(512, this);
                aVar.y(hVar, j10);
                byte[] byteArray = aVar.toByteArray();
                aVar.close();
                if (byteArray.length >= B()) {
                    throw new IOException("message full");
                }
                this.f11677e.add(hVar);
                this.f11684k.write(byteArray, 0, byteArray.length);
            }
        }
    }

    public void z(h hVar) throws IOException {
        a aVar = new a(512, this);
        aVar.y(hVar, 0L);
        byte[] byteArray = aVar.toByteArray();
        aVar.close();
        if (byteArray.length >= B()) {
            throw new IOException("message full");
        }
        this.f11678f.add(hVar);
        this.f11685l.write(byteArray, 0, byteArray.length);
    }

    public f(int i10, boolean z10, int i11) {
        super(i10, 0, z10);
        this.f11681h = new HashMap();
        this.f11682i = i11 > 0 ? i11 : 1460;
        this.f11683j = new a(i11, this);
        this.f11684k = new a(i11, this);
        this.f11685l = new a(i11, this);
        this.f11686m = new a(i11, this);
    }
}
