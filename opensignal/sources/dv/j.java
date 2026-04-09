package dv;

import br.n;
import br.t;
import br.v;
import br.w;
import cv.z;
import java.io.IOException;
import lq.b0;

/* loaded from: classes.dex */
public final class j extends n implements ar.n {
    public final /* synthetic */ v B;
    public final /* synthetic */ w D;
    public final /* synthetic */ w E;
    public final /* synthetic */ w F;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f7627d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7628g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f7629r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f7630x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f7631y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t tVar, long j, v vVar, z zVar, v vVar2, v vVar3, w wVar, w wVar2, w wVar3) {
        super(2);
        this.f7627d = tVar;
        this.f7628g = j;
        this.f7629r = vVar;
        this.f7630x = zVar;
        this.f7631y = vVar2;
        this.B = vVar3;
        this.D = wVar;
        this.E = wVar2;
        this.F = wVar3;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        z zVar = this.f7630x;
        if (iIntValue == 1) {
            t tVar = this.f7627d;
            if (tVar.f2914a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            tVar.f2914a = true;
            if (jLongValue < this.f7628g) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            v vVar = this.f7629r;
            long jI = vVar.f2916a;
            if (jI == 4294967295L) {
                jI = zVar.i();
            }
            vVar.f2916a = jI;
            v vVar2 = this.f7631y;
            vVar2.f2916a = vVar2.f2916a == 4294967295L ? zVar.i() : 0L;
            v vVar3 = this.B;
            vVar3.f2916a = vVar3.f2916a == 4294967295L ? zVar.i() : 0L;
        } else if (iIntValue == 10) {
            if (jLongValue < 4) {
                throw new IOException("bad zip: NTFS extra too short");
            }
            zVar.skip(4L);
            b.e(zVar, (int) (jLongValue - 4), new i(this.D, zVar, this.E, this.F));
        }
        return b0.f15562a;
    }
}
