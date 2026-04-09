package defpackage;

import android.graphics.PointF;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c11 extends vq2 {
    public final /* synthetic */ k90 i;
    public final /* synthetic */ vq2 j;
    public final /* synthetic */ pp k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(k90 k90Var, vq2 vq2Var, pp ppVar) {
        super(10);
        this.i = k90Var;
        this.j = vq2Var;
        this.k = ppVar;
    }

    @Override // defpackage.vq2
    public final Object i(k90 k90Var) {
        float f = k90Var.a;
        float f2 = k90Var.b;
        String str = ((pp) k90Var.f).a;
        String str2 = ((pp) k90Var.g).a;
        float f3 = k90Var.c;
        float f4 = k90Var.d;
        float f5 = k90Var.e;
        k90 k90Var2 = this.i;
        k90Var2.a = f;
        k90Var2.b = f2;
        k90Var2.f = str;
        k90Var2.g = str2;
        k90Var2.c = f3;
        k90Var2.d = f4;
        k90Var2.e = f5;
        String str3 = (String) ((cw0) this.j.h);
        pp ppVar = (pp) (k90Var.d == 1.0f ? k90Var.g : k90Var.f);
        String str4 = ppVar.b;
        float f6 = ppVar.c;
        int i = ppVar.d;
        int i2 = ppVar.e;
        float f7 = ppVar.f;
        float f8 = ppVar.g;
        int i3 = ppVar.h;
        int i4 = ppVar.i;
        float f9 = ppVar.j;
        boolean z = ppVar.k;
        PointF pointF = ppVar.l;
        PointF pointF2 = ppVar.m;
        pp ppVar2 = this.k;
        ppVar2.a = str3;
        ppVar2.b = str4;
        ppVar2.c = f6;
        ppVar2.d = i;
        ppVar2.e = i2;
        ppVar2.f = f7;
        ppVar2.g = f8;
        ppVar2.h = i3;
        ppVar2.i = i4;
        ppVar2.j = f9;
        ppVar2.k = z;
        ppVar2.l = pointF;
        ppVar2.m = pointF2;
        return ppVar2;
    }
}
