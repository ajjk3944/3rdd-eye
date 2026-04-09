package jn;

import android.app.Application;
import android.content.Context;
import br.l;
import ch.n;
import cj.t;
import com.google.android.gms.internal.measurement.b4;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kc.f;
import lq.q;
import xq.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13780a;

    /* renamed from: b, reason: collision with root package name */
    public final q f13781b;

    /* renamed from: c, reason: collision with root package name */
    public final q f13782c;

    public b(Application application, cm.a aVar) {
        l.e(application, "context");
        l.e(aVar, "sdkConfigRepository");
        this.f13780a = application;
        final int i10 = 0;
        this.f13781b = f.F(new ar.a(this) { // from class: jn.a

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f13779d;

            {
                this.f13779d = this;
            }

            @Override // ar.a
            public final Object c() throws NoSuchAlgorithmException {
                switch (i10) {
                    case 0:
                        return ah.f.a(this.f13779d.f13780a);
                    default:
                        String str = ((String) this.f13779d.f13781b.getValue()) + "OSAND1763";
                        l.e(str, "<this>");
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        byte[] bytes = str.getBytes(tt.a.f22975a);
                        l.d(bytes, "getBytes(...)");
                        byte[] bArrDigest = messageDigest.digest(bytes);
                        xq.a aVar2 = xq.c.f25472f;
                        l.b(bArrDigest);
                        int length = bArrDigest.length;
                        aVar2.getClass();
                        xq.b bVar = aVar2.f25477d;
                        b4.e(0, length, bArrDigest.length);
                        int iA = aVar2.a(length);
                        byte[] bArr = new byte[iA];
                        b4.e(0, length, bArrDigest.length);
                        int iA2 = aVar2.a(length);
                        if (iA < 0) {
                            throw new IndexOutOfBoundsException(h0.b.h(iA, "destination offset: 0, destination size: "));
                        }
                        if (iA2 < 0 || iA2 > iA) {
                            throw new IndexOutOfBoundsException(h0.b.l("The destination array does not have enough capacity, destination offset: 0, destination size: ", iA, iA2, ", capacity needed: "));
                        }
                        byte[] bArr2 = aVar2.f25474a ? d.f25480b : d.f25479a;
                        int i11 = aVar2.f25475b ? aVar2.f25478e : Integer.MAX_VALUE;
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            int i14 = i12 + 2;
                            if (i14 >= length) {
                                int i15 = length - i12;
                                if (i15 == 1) {
                                    int i16 = i12 + 1;
                                    int i17 = (bArrDigest[i12] & 255) << 4;
                                    bArr[i13] = bArr2[i17 >>> 6];
                                    int i18 = i13 + 2;
                                    bArr[i13 + 1] = bArr2[i17 & 63];
                                    if (bVar == xq.b.PRESENT || bVar == xq.b.PRESENT_OPTIONAL) {
                                        bArr[i18] = 61;
                                        bArr[i13 + 3] = 61;
                                    }
                                    i12 = i16;
                                } else if (i15 == 2) {
                                    int i19 = ((bArrDigest[i12 + 1] & 255) << 2) | ((bArrDigest[i12] & 255) << 10);
                                    bArr[i13] = bArr2[i19 >>> 12];
                                    int i20 = i13 + 2;
                                    bArr[i13 + 1] = bArr2[(i19 >>> 6) & 63];
                                    int i21 = i13 + 3;
                                    bArr[i20] = bArr2[i19 & 63];
                                    if (bVar == xq.b.PRESENT || bVar == xq.b.PRESENT_OPTIONAL) {
                                        bArr[i21] = 61;
                                    }
                                    i12 = i14;
                                }
                                if (i12 == length) {
                                    return new String(bArr, tt.a.f22976b);
                                }
                                throw new IllegalStateException("Check failed.");
                            }
                            int iMin = Math.min((length - i12) / 3, i11);
                            for (int i22 = 0; i22 < iMin; i22++) {
                                int i23 = bArrDigest[i12] & 255;
                                int i24 = i12 + 2;
                                int i25 = bArrDigest[i12 + 1] & 255;
                                i12 += 3;
                                int i26 = (i25 << 8) | (i23 << 16) | (bArrDigest[i24] & 255);
                                bArr[i13] = bArr2[i26 >>> 18];
                                bArr[i13 + 1] = bArr2[(i26 >>> 12) & 63];
                                int i27 = i13 + 3;
                                bArr[i13 + 2] = bArr2[(i26 >>> 6) & 63];
                                i13 += 4;
                                bArr[i27] = bArr2[i26 & 63];
                            }
                            if (iMin == i11 && i12 != length) {
                                int i28 = i13 + 1;
                                byte[] bArr3 = xq.c.f25473g;
                                bArr[i13] = bArr3[0];
                                i13 += 2;
                                bArr[i28] = bArr3[1];
                            }
                        }
                        break;
                }
            }
        });
        final int i11 = 1;
        this.f13782c = f.F(new ar.a(this) { // from class: jn.a

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f13779d;

            {
                this.f13779d = this;
            }

            @Override // ar.a
            public final Object c() throws NoSuchAlgorithmException {
                switch (i11) {
                    case 0:
                        return ah.f.a(this.f13779d.f13780a);
                    default:
                        String str = ((String) this.f13779d.f13781b.getValue()) + "OSAND1763";
                        l.e(str, "<this>");
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        byte[] bytes = str.getBytes(tt.a.f22975a);
                        l.d(bytes, "getBytes(...)");
                        byte[] bArrDigest = messageDigest.digest(bytes);
                        xq.a aVar2 = xq.c.f25472f;
                        l.b(bArrDigest);
                        int length = bArrDigest.length;
                        aVar2.getClass();
                        xq.b bVar = aVar2.f25477d;
                        b4.e(0, length, bArrDigest.length);
                        int iA = aVar2.a(length);
                        byte[] bArr = new byte[iA];
                        b4.e(0, length, bArrDigest.length);
                        int iA2 = aVar2.a(length);
                        if (iA < 0) {
                            throw new IndexOutOfBoundsException(h0.b.h(iA, "destination offset: 0, destination size: "));
                        }
                        if (iA2 < 0 || iA2 > iA) {
                            throw new IndexOutOfBoundsException(h0.b.l("The destination array does not have enough capacity, destination offset: 0, destination size: ", iA, iA2, ", capacity needed: "));
                        }
                        byte[] bArr2 = aVar2.f25474a ? d.f25480b : d.f25479a;
                        int i112 = aVar2.f25475b ? aVar2.f25478e : Integer.MAX_VALUE;
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            int i14 = i12 + 2;
                            if (i14 >= length) {
                                int i15 = length - i12;
                                if (i15 == 1) {
                                    int i16 = i12 + 1;
                                    int i17 = (bArrDigest[i12] & 255) << 4;
                                    bArr[i13] = bArr2[i17 >>> 6];
                                    int i18 = i13 + 2;
                                    bArr[i13 + 1] = bArr2[i17 & 63];
                                    if (bVar == xq.b.PRESENT || bVar == xq.b.PRESENT_OPTIONAL) {
                                        bArr[i18] = 61;
                                        bArr[i13 + 3] = 61;
                                    }
                                    i12 = i16;
                                } else if (i15 == 2) {
                                    int i19 = ((bArrDigest[i12 + 1] & 255) << 2) | ((bArrDigest[i12] & 255) << 10);
                                    bArr[i13] = bArr2[i19 >>> 12];
                                    int i20 = i13 + 2;
                                    bArr[i13 + 1] = bArr2[(i19 >>> 6) & 63];
                                    int i21 = i13 + 3;
                                    bArr[i20] = bArr2[i19 & 63];
                                    if (bVar == xq.b.PRESENT || bVar == xq.b.PRESENT_OPTIONAL) {
                                        bArr[i21] = 61;
                                    }
                                    i12 = i14;
                                }
                                if (i12 == length) {
                                    return new String(bArr, tt.a.f22976b);
                                }
                                throw new IllegalStateException("Check failed.");
                            }
                            int iMin = Math.min((length - i12) / 3, i112);
                            for (int i22 = 0; i22 < iMin; i22++) {
                                int i23 = bArrDigest[i12] & 255;
                                int i24 = i12 + 2;
                                int i25 = bArrDigest[i12 + 1] & 255;
                                i12 += 3;
                                int i26 = (i25 << 8) | (i23 << 16) | (bArrDigest[i24] & 255);
                                bArr[i13] = bArr2[i26 >>> 18];
                                bArr[i13 + 1] = bArr2[(i26 >>> 12) & 63];
                                int i27 = i13 + 3;
                                bArr[i13 + 2] = bArr2[(i26 >>> 6) & 63];
                                i13 += 4;
                                bArr[i27] = bArr2[i26 & 63];
                            }
                            if (iMin == i112 && i12 != length) {
                                int i28 = i13 + 1;
                                byte[] bArr3 = xq.c.f25473g;
                                bArr[i13] = bArr3[0];
                                i13 += 2;
                                bArr[i28] = bArr3[1];
                            }
                        }
                        break;
                }
            }
        });
        aVar.a();
    }

    public final void a(boolean z10) {
        Context context = this.f13780a;
        if (z10) {
            boolean z11 = ah.f.f371a;
            l.e(context, "context");
            if (!ah.f.f371a) {
                n.b("OpensignalSdk", "Not starting data collection. This Android API is too low to run SDK.");
                return;
            }
            n.b("OpensignalSdk", "Starting data collection...");
            ch.l lVar = ch.l.f3962t5;
            Context applicationContext = context.getApplicationContext();
            l.d(applicationContext, "getApplicationContext(...)");
            if (lVar.f3775a == null) {
                lVar.f3775a = applicationContext;
            }
            n.b("OpensignalSdk", "Data Consent hasn't been given. Give consent.");
            t.e(context, true);
            return;
        }
        boolean z12 = ah.f.f371a;
        l.e(context, "context");
        if (!ah.f.f371a) {
            n.b("OpensignalSdk", "Not stopping data collection. This Android API is too low to run SDK.");
            return;
        }
        n.b("OpensignalSdk", "Stopping data collection...");
        ch.l lVar2 = ch.l.f3962t5;
        Context applicationContext2 = context.getApplicationContext();
        l.d(applicationContext2, "getApplicationContext(...)");
        if (lVar2.f3775a == null) {
            lVar2.f3775a = applicationContext2;
        }
        n.b("OpensignalSdk", "Data Consent has been given. Withdraw consent.");
        t.e(context, false);
    }
}
