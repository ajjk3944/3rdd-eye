package b7;

import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1976x extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1667d f18031a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a7.j> f18032b;

    public AbstractC1976x(EnumC1667d resultType) {
        kotlin.jvm.internal.l.f(resultType, "resultType");
        this.f18031a = resultType;
        this.f18032b = C2092m.W(new a7.j(EnumC1667d.ARRAY, false), new a7.j(EnumC1667d.INTEGER, false), new a7.j(resultType, false));
    }

    @Override // a7.g
    public List<a7.j> b() {
        return this.f18032b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f18031a;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
