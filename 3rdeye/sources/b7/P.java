package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import d7.C4278a;
import java.util.List;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes.dex */
public abstract class P extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f17461a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a7.j> f17462b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1667d f17463c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17464d;

    /* JADX WARN: Multi-variable type inference failed */
    public P(p9.l<? super C4278a, Integer> componentGetter) {
        kotlin.jvm.internal.l.f(componentGetter, "componentGetter");
        this.f17461a = (kotlin.jvm.internal.m) componentGetter;
        this.f17462b = E.u.G(new a7.j(EnumC1667d.COLOR, false));
        this.f17463c = EnumC1667d.NUMBER;
        this.f17464d = true;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.m, p9.l] */
    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        int iIntValue = ((Number) this.f17461a.invoke((C4278a) objP0)).intValue();
        if (iIntValue < 0 || iIntValue >= 256) {
            throw new IllegalArgumentException("Value out of channel range 0..255");
        }
        return Double.valueOf(iIntValue / 255.0f);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17462b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17463c;
    }

    @Override // a7.g
    public final boolean f() {
        return this.f17464d;
    }
}
