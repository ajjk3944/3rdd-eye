package u8;

import android.graphics.PointF;
import ee.u;
import r8.h0;

/* loaded from: classes.dex */
public final class o extends bm.e {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f23478r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ bm.e f23479x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x8.c f23480y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u uVar, bm.e eVar, x8.c cVar) {
        super(19);
        this.f23478r = uVar;
        this.f23479x = eVar;
        this.f23480y = cVar;
    }

    @Override // bm.e
    public final Object A(u uVar) {
        float f10 = uVar.f8153a;
        float f11 = uVar.f8154b;
        String str = ((x8.c) uVar.f8158f).f25071a;
        String str2 = ((x8.c) uVar.f8159g).f25071a;
        float f12 = uVar.f8155c;
        float f13 = uVar.f8156d;
        float f14 = uVar.f8157e;
        u uVar2 = this.f23478r;
        uVar2.f8153a = f10;
        uVar2.f8154b = f11;
        uVar2.f8158f = str;
        uVar2.f8159g = str2;
        uVar2.f8155c = f12;
        uVar2.f8156d = f13;
        uVar2.f8157e = f14;
        String str3 = (String) ((h0) this.f23479x.f2831g);
        x8.c cVar = (x8.c) (uVar.f8156d == 1.0f ? uVar.f8159g : uVar.f8158f);
        String str4 = cVar.f25072b;
        float f15 = cVar.f25073c;
        x8.b bVar = cVar.f25074d;
        int i10 = cVar.f25075e;
        float f16 = cVar.f25076f;
        float f17 = cVar.f25077g;
        int i11 = cVar.f25078h;
        int i12 = cVar.f25079i;
        float f18 = cVar.j;
        boolean z10 = cVar.k;
        PointF pointF = cVar.f25080l;
        PointF pointF2 = cVar.f25081m;
        x8.c cVar2 = this.f23480y;
        cVar2.f25071a = str3;
        cVar2.f25072b = str4;
        cVar2.f25073c = f15;
        cVar2.f25074d = bVar;
        cVar2.f25075e = i10;
        cVar2.f25076f = f16;
        cVar2.f25077g = f17;
        cVar2.f25078h = i11;
        cVar2.f25079i = i12;
        cVar2.j = f18;
        cVar2.k = z10;
        cVar2.f25080l = pointF;
        cVar2.f25081m = pointF2;
        return cVar2;
    }
}
