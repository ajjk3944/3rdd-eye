package i7;

import android.graphics.PointF;
import f7.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends km.o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s7.b f25904c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km.o f25905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k7.b f25906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s7.b bVar, km.o oVar, k7.b bVar2) {
        super(16);
        this.f25904c = bVar;
        this.f25905d = oVar;
        this.f25906e = bVar2;
    }

    @Override // km.o
    public final Object k(s7.b bVar) {
        float f10 = bVar.f33497a;
        float f11 = bVar.f33498b;
        String str = ((k7.b) bVar.f33499c).f28041a;
        String str2 = ((k7.b) bVar.f33500d).f28041a;
        float f12 = bVar.f33501e;
        float f13 = bVar.f33502f;
        float f14 = bVar.g;
        s7.b bVar2 = this.f25904c;
        bVar2.f33497a = f10;
        bVar2.f33498b = f11;
        bVar2.f33499c = str;
        bVar2.f33500d = str2;
        bVar2.f33501e = f12;
        bVar2.f33502f = f13;
        bVar2.g = f14;
        String str3 = (String) ((i0) this.f25905d.f28446b);
        k7.b bVar3 = (k7.b) (bVar.f33502f == 1.0f ? bVar.f33500d : bVar.f33499c);
        String str4 = bVar3.f28042b;
        float f15 = bVar3.f28043c;
        int i4 = bVar3.f28044d;
        int i10 = bVar3.f28045e;
        float f16 = bVar3.f28046f;
        float f17 = bVar3.g;
        int i11 = bVar3.f28047h;
        int i12 = bVar3.f28048i;
        float f18 = bVar3.j;
        boolean z3 = bVar3.f28049k;
        PointF pointF = bVar3.f28050l;
        PointF pointF2 = bVar3.f28051m;
        k7.b bVar4 = this.f25906e;
        bVar4.f28041a = str3;
        bVar4.f28042b = str4;
        bVar4.f28043c = f15;
        bVar4.f28044d = i4;
        bVar4.f28045e = i10;
        bVar4.f28046f = f16;
        bVar4.g = f17;
        bVar4.f28047h = i11;
        bVar4.f28048i = i12;
        bVar4.j = f18;
        bVar4.f28049k = z3;
        bVar4.f28050l = pointF;
        bVar4.f28051m = pointF2;
        return bVar4;
    }
}
