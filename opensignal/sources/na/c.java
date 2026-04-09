package na;

import a5.d0;
import android.net.Uri;
import androidx.media3.common.k0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import ca.m;
import ca.x;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.y0;
import com.google.android.material.datepicker.n;
import com.survicate.surveys.infrastructure.network.URLRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qb.v;
import u5.a0;
import u5.l;

/* loaded from: classes.dex */
public final class c implements b, x6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17417a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f17418b;

    /* renamed from: c, reason: collision with root package name */
    public long f17419c;

    /* renamed from: d, reason: collision with root package name */
    public long f17420d;

    /* renamed from: e, reason: collision with root package name */
    public int f17421e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f17422f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f17423g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f17424h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f17425i;

    public c(m mVar, x xVar, e eVar, String str, int i10) throws y0 {
        this.f17422f = mVar;
        this.f17423g = xVar;
        this.f17424h = eVar;
        int i11 = eVar.f17432b;
        int i12 = eVar.f17433c;
        int i13 = (eVar.f17435e * i11) / 8;
        int i14 = eVar.f17434d;
        if (i14 != i13) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Expected block size: ");
            sb2.append(i13);
            sb2.append("; got: ");
            sb2.append(i14);
            throw y0.a(null, sb2.toString());
        }
        int i15 = i12 * i13;
        int i16 = i15 * 8;
        int iMax = Math.max(i13, i15 / 10);
        this.f17418b = iMax;
        g0 g0Var = new g0();
        g0Var.k = str;
        g0Var.f4147f = i16;
        g0Var.f4148g = i16;
        g0Var.f4151l = iMax;
        g0Var.f4163x = i11;
        g0Var.f4164y = i12;
        g0Var.f4165z = i10;
        this.f17425i = new Format(g0Var);
    }

    @Override // na.b
    public void a(long j) {
        switch (this.f17417a) {
            case 0:
                this.f17419c = j;
                this.f17421e = 0;
                this.f17420d = 0L;
                break;
            default:
                this.f17419c = j;
                this.f17421e = 0;
                this.f17420d = 0L;
                break;
        }
    }

    @Override // na.b
    public void b(int i10, long j) {
        switch (this.f17417a) {
            case 0:
                ((m) this.f17422f).r(new f((e) this.f17424h, 1, i10, j));
                ((x) this.f17423g).e((Format) this.f17425i);
                break;
            default:
                ((u5.m) this.f17422f).u(new x6.d((n) this.f17424h, 1, i10, j));
                ((a0) this.f17423g).c((r) this.f17425i);
                break;
        }
    }

    @Override // x6.b
    public boolean c(l lVar, long j) {
        int i10;
        int i11;
        long j7 = j;
        while (j7 > 0 && (i10 = this.f17421e) < (i11 = this.f17418b)) {
            int iB = ((a0) this.f17423g).b(lVar, (int) Math.min(i11 - i10, j7), true);
            if (iB == -1) {
                j7 = 0;
            } else {
                this.f17421e += iB;
                j7 -= iB;
            }
        }
        int i12 = ((n) this.f17424h).f5610r;
        int i13 = this.f17421e / i12;
        if (i13 > 0) {
            long jM = this.f17419c + d0.M(this.f17420d, 1000000L, r1.f5609g);
            int i14 = i13 * i12;
            int i15 = this.f17421e - i14;
            ((a0) this.f17423g).a(jM, 1, i14, i15, null);
            this.f17420d += i13;
            this.f17421e = i15;
        }
        return j7 <= 0;
    }

    @Override // na.b
    public boolean d(ca.l lVar, long j) {
        int i10;
        int i11;
        long j7 = j;
        while (j7 > 0 && (i10 = this.f17421e) < (i11 = this.f17418b)) {
            int iC = ((x) this.f17423g).c(lVar, (int) Math.min(i11 - i10, j7), true);
            if (iC == -1) {
                j7 = 0;
            } else {
                this.f17421e += iC;
                j7 -= iC;
            }
        }
        int i12 = ((e) this.f17424h).f17434d;
        int i13 = this.f17421e / i12;
        if (i13 > 0) {
            long jH = this.f17419c + v.H(this.f17420d, 1000000L, r1.f17433c);
            int i14 = i13 * i12;
            int i15 = this.f17421e - i14;
            ((x) this.f17423g).d(jH, 1, i14, i15, null);
            this.f17420d += i13;
            this.f17421e = i15;
        }
        return j7 <= 0;
    }

    public c e(long j) {
        long j7 = this.f17420d;
        long j10 = j7 != -1 ? j7 - j : -1L;
        if (j == 0 && j7 == j10) {
            return this;
        }
        return new c((Uri) this.f17422f, this.f17418b, (byte[]) this.f17423g, (Map) this.f17424h, this.f17419c + j, j10, (String) this.f17425i, this.f17421e);
    }

    public String toString() {
        String str;
        switch (this.f17417a) {
            case 1:
                int i10 = this.f17418b;
                if (i10 == 1) {
                    str = URLRequest.METHOD_GET;
                } else if (i10 == 2) {
                    str = URLRequest.METHOD_POST;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    str = "HEAD";
                }
                String strValueOf = String.valueOf((Uri) this.f17422f);
                long j = this.f17419c;
                long j7 = this.f17420d;
                String str2 = (String) this.f17425i;
                int i11 = this.f17421e;
                StringBuilder sbS = c7.a.s(c7.a.d(strValueOf.length() + str.length() + 70, str2), "DataSpec[", str, " ", strValueOf);
                sbS.append(", ");
                sbS.append(j);
                sbS.append(", ");
                sbS.append(j7);
                sbS.append(", ");
                sbS.append(str2);
                sbS.append(", ");
                sbS.append(i11);
                sbS.append("]");
                return sbS.toString();
            default:
                return super.toString();
        }
    }

    public c(u5.m mVar, a0 a0Var, n nVar, String str, int i10) throws k0 {
        this.f17422f = mVar;
        this.f17423g = a0Var;
        this.f17424h = nVar;
        int i11 = nVar.f5608d;
        int i12 = nVar.f5609g;
        int i13 = (nVar.f5611x * i11) / 8;
        int i14 = nVar.f5610r;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int iMax = Math.max(i13, i15 / 10);
            this.f17418b = iMax;
            q qVar = new q();
            qVar.k = str;
            qVar.f1739f = i16;
            qVar.f1740g = i16;
            qVar.f1743l = iMax;
            qVar.f1755x = i11;
            qVar.f1756y = i12;
            qVar.f1757z = i10;
            this.f17425i = new r(qVar);
            return;
        }
        throw k0.a(null, "Expected block size: " + i13 + "; got: " + i14);
    }

    public c(Uri uri, int i10, byte[] bArr, Map map, long j, long j7, String str, int i11) {
        qb.b.g(j >= 0);
        qb.b.g(j >= 0);
        qb.b.g(j7 > 0 || j7 == -1);
        this.f17422f = uri;
        this.f17418b = i10;
        this.f17423g = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f17424h = Collections.unmodifiableMap(new HashMap(map));
        this.f17419c = j;
        this.f17420d = j7;
        this.f17425i = str;
        this.f17421e = i11;
    }
}
