package b7;

import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1892g extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1667d f17781a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a7.j> f17782b;

    public AbstractC1892g(EnumC1667d resultType) {
        kotlin.jvm.internal.l.f(resultType, "resultType");
        this.f17781a = resultType;
        this.f17782b = C2092m.W(new a7.j(EnumC1667d.ARRAY, false), new a7.j(EnumC1667d.INTEGER, false));
    }

    @Override // a7.g
    public List<a7.j> b() {
        return this.f17782b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17781a;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}
