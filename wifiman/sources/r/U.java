package r;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC7023n;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    private int f59540a;

    /* renamed from: b, reason: collision with root package name */
    private int f59541b;

    /* renamed from: c, reason: collision with root package name */
    private final o.z f59542c;

    public /* synthetic */ U(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int a() {
        return this.f59541b;
    }

    public final int b() {
        return this.f59540a;
    }

    public final o.z c() {
        return this.f59542c;
    }

    public final void d(int i10) {
        this.f59540a = i10;
    }

    public final S e(S s10, E e10) {
        s10.c(e10);
        return s10;
    }

    private U() {
        this.f59540a = 300;
        this.f59542c = AbstractC7023n.b();
    }
}
