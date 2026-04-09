package l2;

import android.graphics.PointF;
import i2.C4440M;
import n2.C5348b;
import v2.C5674b;

/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class n extends B0.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C5674b f43731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B0.f f43732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C5348b f43733g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C5674b c5674b, B0.f fVar, C5348b c5348b) {
        super(7);
        this.f43731e = c5674b;
        this.f43732f = fVar;
        this.f43733g = c5348b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    @Override // B0.f
    public final Object d(C5674b c5674b) {
        float f10 = c5674b.f47026a;
        float f11 = c5674b.f47027b;
        ?? r22 = ((C5348b) c5674b.f47028c).f44248a;
        ?? r32 = ((C5348b) c5674b.f47029d).f44248a;
        float f12 = c5674b.f47030e;
        float f13 = c5674b.f47031f;
        float f14 = c5674b.f47032g;
        C5674b c5674b2 = this.f43731e;
        c5674b2.f47026a = f10;
        c5674b2.f47027b = f11;
        c5674b2.f47028c = r22;
        c5674b2.f47029d = r32;
        c5674b2.f47030e = f12;
        c5674b2.f47031f = f13;
        c5674b2.f47032g = f14;
        String str = (String) ((C4440M) this.f43732f.f358d);
        C5348b c5348b = (C5348b) (c5674b.f47031f == 1.0f ? c5674b.f47029d : c5674b.f47028c);
        String str2 = c5348b.f44249b;
        float f15 = c5348b.f44250c;
        C5348b.a aVar = c5348b.f44251d;
        int i = c5348b.f44252e;
        float f16 = c5348b.f44253f;
        float f17 = c5348b.f44254g;
        int i10 = c5348b.f44255h;
        int i11 = c5348b.i;
        float f18 = c5348b.f44256j;
        boolean z10 = c5348b.f44257k;
        PointF pointF = c5348b.f44258l;
        PointF pointF2 = c5348b.f44259m;
        C5348b c5348b2 = this.f43733g;
        c5348b2.f44248a = str;
        c5348b2.f44249b = str2;
        c5348b2.f44250c = f15;
        c5348b2.f44251d = aVar;
        c5348b2.f44252e = i;
        c5348b2.f44253f = f16;
        c5348b2.f44254g = f17;
        c5348b2.f44255h = i10;
        c5348b2.i = i11;
        c5348b2.f44256j = f18;
        c5348b2.f44257k = z10;
        c5348b2.f44258l = pointF;
        c5348b2.f44259m = pointF2;
        return c5348b2;
    }
}
