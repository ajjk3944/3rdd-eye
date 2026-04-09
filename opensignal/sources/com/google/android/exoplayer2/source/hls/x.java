package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.y0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x implements ca.k {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f4543g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f4544h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f4545a;

    /* renamed from: b, reason: collision with root package name */
    public final qb.u f4546b;

    /* renamed from: d, reason: collision with root package name */
    public ca.m f4548d;

    /* renamed from: f, reason: collision with root package name */
    public int f4550f;

    /* renamed from: c, reason: collision with root package name */
    public final fb.f f4547c = new fb.f();

    /* renamed from: e, reason: collision with root package name */
    public byte[] f4549e = new byte[1024];

    public x(String str, qb.u uVar) {
        this.f4545a = str;
        this.f4546b = uVar;
    }

    public final ca.x a(long j) {
        ca.x xVarN = this.f4548d.n(0, 3);
        g0 g0Var = new g0();
        g0Var.k = "text/vtt";
        g0Var.f4144c = this.f4545a;
        g0Var.f4154o = j;
        xVarN.e(new Format(g0Var));
        this.f4548d.j();
        return xVarN;
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        throw new IllegalStateException();
    }

    @Override // ca.k
    public final int f(ca.l lVar, ca.n nVar) throws y0, EOFException, InterruptedIOException {
        String strE;
        this.f4548d.getClass();
        int i10 = (int) ((ca.h) lVar).f3477g;
        int i11 = this.f4550f;
        byte[] bArr = this.f4549e;
        int i12 = -1;
        if (i11 == bArr.length) {
            this.f4549e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f4549e;
        int i13 = this.f4550f;
        int i14 = ((ca.h) lVar).read(bArr2, i13, bArr2.length - i13);
        if (i14 != -1) {
            int i15 = this.f4550f + i14;
            this.f4550f = i15;
            if (i10 == -1 || i15 != i10) {
                return 0;
            }
        }
        fb.f fVar = new fb.f(this.f4549e);
        nb.j.c(fVar);
        String strE2 = fVar.e();
        long j = 0;
        long jB = 0;
        while (true) {
            int i16 = i12;
            Matcher matcher = null;
            if (TextUtils.isEmpty(strE2)) {
                while (true) {
                    String strE3 = fVar.e();
                    if (strE3 == null) {
                        break;
                    }
                    if (nb.j.f17488a.matcher(strE3).matches()) {
                        do {
                            strE = fVar.e();
                            if (strE != null) {
                            }
                        } while (!strE.isEmpty());
                    } else {
                        Matcher matcher2 = nb.h.f17482a.matcher(strE3);
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
                long jB2 = nb.j.b(strGroup);
                long jB3 = this.f4546b.b(((((j + jB2) - jB) * 90000) / 1000000) % 8589934592L);
                ca.x xVarA = a(jB3 - jB2);
                byte[] bArr3 = this.f4549e;
                int i17 = this.f4550f;
                fb.f fVar2 = this.f4547c;
                fVar2.w(i17, bArr3);
                xVarA.a(this.f4550f, fVar2);
                xVarA.d(jB3, 1, this.f4550f, 0, null);
                return i16;
            }
            if (strE2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f4543g.matcher(strE2);
                if (!matcher3.find()) {
                    throw y0.a(null, strE2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strE2) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                }
                Matcher matcher4 = f4544h.matcher(strE2);
                if (!matcher4.find()) {
                    throw y0.a(null, strE2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strE2) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jB = nb.j.b(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strE2 = fVar.e();
            i12 = i16;
        }
    }

    @Override // ca.k
    public final boolean g(ca.l lVar) {
        lVar.c(this.f4549e, 0, 6, false);
        byte[] bArr = this.f4549e;
        fb.f fVar = this.f4547c;
        fVar.w(6, bArr);
        Pattern pattern = nb.j.f17488a;
        String strE = fVar.e();
        if (strE != null && strE.startsWith("WEBVTT")) {
            return true;
        }
        lVar.c(this.f4549e, 6, 3, false);
        fVar.w(9, this.f4549e);
        String strE2 = fVar.e();
        return strE2 != null && strE2.startsWith("WEBVTT");
    }

    @Override // ca.k
    public final void h(ca.m mVar) {
        this.f4548d = mVar;
        mVar.r(new ca.o(-9223372036854775807L));
    }

    @Override // ca.k
    public final void release() {
    }
}
