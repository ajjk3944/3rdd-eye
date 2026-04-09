package dv;

import br.n;
import br.w;
import cv.z;
import java.io.IOException;
import lq.b0;

/* loaded from: classes.dex */
public final class i extends n implements ar.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7622d = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f7623g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f7624r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f7625x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w f7626y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(w wVar, z zVar, w wVar2, w wVar3) {
        super(2);
        this.f7624r = wVar;
        this.f7623g = zVar;
        this.f7625x = wVar2;
        this.f7626y = wVar3;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) throws IOException {
        switch (this.f7622d) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue();
                if (iIntValue == 1) {
                    w wVar = this.f7624r;
                    if (wVar.f2917a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    z zVar = this.f7623g;
                    wVar.f2917a = Long.valueOf(zVar.i());
                    this.f7625x.f2917a = Long.valueOf(zVar.i());
                    this.f7626y.f2917a = Long.valueOf(zVar.i());
                }
                return b0.f15562a;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                long jLongValue2 = ((Number) obj2).longValue();
                if (iIntValue2 == 21589) {
                    if (jLongValue2 < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    z zVar2 = this.f7623g;
                    byte b2 = zVar2.readByte();
                    boolean z10 = (b2 & 1) == 1;
                    boolean z11 = (b2 & 2) == 2;
                    boolean z12 = (b2 & 4) == 4;
                    long j = z10 ? 5L : 1L;
                    if (z11) {
                        j += 4;
                    }
                    if (z12) {
                        j += 4;
                    }
                    if (jLongValue2 < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z10) {
                        this.f7624r.f2917a = Integer.valueOf(zVar2.h());
                    }
                    if (z11) {
                        this.f7625x.f2917a = Integer.valueOf(zVar2.h());
                    }
                    if (z12) {
                        this.f7626y.f2917a = Integer.valueOf(zVar2.h());
                    }
                }
                return b0.f15562a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar, w wVar, w wVar2, w wVar3) {
        super(2);
        this.f7623g = zVar;
        this.f7624r = wVar;
        this.f7625x = wVar2;
        this.f7626y = wVar3;
    }
}
