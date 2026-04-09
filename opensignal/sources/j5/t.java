package j5;

import a5.b0;
import a5.v;
import android.text.TextUtils;
import androidx.media3.common.k0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u5.a0;

/* loaded from: classes.dex */
public final class t implements u5.k {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f13342g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f13343h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f13344a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f13345b;

    /* renamed from: d, reason: collision with root package name */
    public u5.m f13347d;

    /* renamed from: f, reason: collision with root package name */
    public int f13349f;

    /* renamed from: c, reason: collision with root package name */
    public final v f13346c = new v();

    /* renamed from: e, reason: collision with root package name */
    public byte[] f13348e = new byte[1024];

    public t(String str, b0 b0Var) {
        this.f13344a = str;
        this.f13345b = b0Var;
    }

    public final a0 a(long j) {
        a0 a0VarMo36n = this.f13347d.mo36n(0, 3);
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.k = "text/vtt";
        qVar.f1736c = this.f13344a;
        qVar.f1746o = j;
        a0VarMo36n.c(new androidx.media3.common.r(qVar));
        this.f13347d.j();
        return a0VarMo36n;
    }

    @Override // u5.k
    public final void c(long j, long j7) {
        throw new IllegalStateException();
    }

    @Override // u5.k
    public final void f(u5.m mVar) {
        this.f13347d = mVar;
        mVar.u(new u5.n(-9223372036854775807L));
    }

    @Override // u5.k
    public final int g(u5.l lVar, ca.n nVar) throws k0, EOFException, InterruptedIOException {
        String strH;
        this.f13347d.getClass();
        int i10 = (int) ((u5.h) lVar).f23287g;
        int i11 = this.f13349f;
        byte[] bArr = this.f13348e;
        int i12 = -1;
        if (i11 == bArr.length) {
            this.f13348e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f13348e;
        int i13 = this.f13349f;
        int i14 = ((u5.h) lVar).read(bArr2, i13, bArr2.length - i13);
        if (i14 != -1) {
            int i15 = this.f13349f + i14;
            this.f13349f = i15;
            if (i10 == -1 || i15 != i10) {
                return 0;
            }
        }
        v vVar = new v(this.f13348e);
        v6.i.d(vVar);
        String strH2 = vVar.h(ne.g.f17524c);
        long j = 0;
        long jC = 0;
        while (true) {
            int i16 = i12;
            Matcher matcher = null;
            if (TextUtils.isEmpty(strH2)) {
                while (true) {
                    String strH3 = vVar.h(ne.g.f17524c);
                    if (strH3 == null) {
                        break;
                    }
                    if (v6.i.f23897a.matcher(strH3).matches()) {
                        do {
                            strH = vVar.h(ne.g.f17524c);
                            if (strH != null) {
                            }
                        } while (!strH.isEmpty());
                    } else {
                        Matcher matcher2 = v6.g.f23891a.matcher(strH3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return i16;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = v6.i.c(strGroup);
                long jB = this.f13345b.b(((((j + jC2) - jC) * 90000) / 1000000) % 8589934592L);
                a0 a0VarA = a(jB - jC2);
                byte[] bArr3 = this.f13348e;
                int i17 = this.f13349f;
                v vVar2 = this.f13346c;
                vVar2.C(i17, bArr3);
                a0VarA.d(this.f13349f, vVar2);
                a0VarA.a(jB, 1, this.f13349f, 0, null);
                return i16;
            }
            if (strH2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f13342g.matcher(strH2);
                if (!matcher3.find()) {
                    throw k0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strH2));
                }
                Matcher matcher4 = f13343h.matcher(strH2);
                if (!matcher4.find()) {
                    throw k0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strH2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = v6.i.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strH2 = vVar.h(ne.g.f17524c);
            i12 = i16;
        }
    }

    @Override // u5.k
    public final boolean h(u5.l lVar) {
        lVar.c(this.f13348e, 0, 6, false);
        byte[] bArr = this.f13348e;
        v vVar = this.f13346c;
        vVar.C(6, bArr);
        if (v6.i.a(vVar)) {
            return true;
        }
        lVar.c(this.f13348e, 6, 3, false);
        vVar.C(9, this.f13348e);
        return v6.i.a(vVar);
    }

    @Override // u5.k
    public final void release() {
    }
}
