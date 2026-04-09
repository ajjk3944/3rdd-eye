package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import io.sentry.android.core.e0;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s implements ca.x {

    /* renamed from: f, reason: collision with root package name */
    public static final Format f4509f;

    /* renamed from: g, reason: collision with root package name */
    public static final Format f4510g;

    /* renamed from: a, reason: collision with root package name */
    public final ca.x f4511a;

    /* renamed from: b, reason: collision with root package name */
    public final Format f4512b;

    /* renamed from: c, reason: collision with root package name */
    public Format f4513c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4514d;

    /* renamed from: e, reason: collision with root package name */
    public int f4515e;

    static {
        g0 g0Var = new g0();
        g0Var.k = "application/id3";
        f4509f = new Format(g0Var);
        g0 g0Var2 = new g0();
        g0Var2.k = "application/x-emsg";
        f4510g = new Format(g0Var2);
    }

    public s(ca.x xVar, int i10) {
        this.f4511a = xVar;
        if (i10 == 1) {
            this.f4512b = f4509f;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(w.g.e("Unknown metadataType: ", 33, i10));
            }
            this.f4512b = f4510g;
        }
        this.f4514d = new byte[0];
        this.f4515e = 0;
    }

    @Override // ca.x
    public final void a(int i10, fb.f fVar) {
        int i11 = this.f4515e + i10;
        byte[] bArr = this.f4514d;
        if (bArr.length < i11) {
            this.f4514d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        fVar.c(this.f4514d, this.f4515e, i10);
        this.f4515e += i10;
    }

    @Override // ca.x
    public final int c(pb.k kVar, int i10, boolean z10) throws EOFException {
        int i11 = this.f4515e + i10;
        byte[] bArr = this.f4514d;
        if (bArr.length < i11) {
            this.f4514d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int i12 = kVar.read(this.f4514d, this.f4515e, i10);
        if (i12 != -1) {
            this.f4515e += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // ca.x
    public final void d(long j, int i10, int i11, int i12, ca.w wVar) {
        this.f4513c.getClass();
        int i13 = this.f4515e - i12;
        fb.f fVar = new fb.f(Arrays.copyOfRange(this.f4514d, i13 - i11, i13));
        byte[] bArr = this.f4514d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.f4515e = i12;
        String str = this.f4513c.H;
        Format format = this.f4512b;
        String str2 = format.H;
        String str3 = format.H;
        if (!qb.v.a(str, str2)) {
            if (!"application/x-emsg".equals(this.f4513c.H)) {
                String strValueOf = String.valueOf(this.f4513c.H);
                e0.p("EmsgUnwrappingTrackOutput", strValueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(strValueOf) : new String("Ignoring sample for unsupported format: "));
                return;
            }
            EventMessage eventMessageS = ra.a.S(fVar);
            Format formatA = eventMessageS.a();
            if (formatA == null || !qb.v.a(str3, formatA.H)) {
                e0.p("EmsgUnwrappingTrackOutput", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + eventMessageS.a());
                return;
            }
            byte[] bArrB = eventMessageS.b();
            bArrB.getClass();
            fVar = new fb.f(bArrB);
        }
        int iA = fVar.a();
        ca.x xVar = this.f4511a;
        xVar.a(iA, fVar);
        xVar.d(j, i10, iA, i12, wVar);
    }

    @Override // ca.x
    public final void e(Format format) {
        this.f4513c = format;
        this.f4511a.e(this.f4512b);
    }
}
