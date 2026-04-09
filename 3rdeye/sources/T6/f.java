package T6;

import N7.Z;
import kotlin.jvm.internal.l;

/* compiled from: Token.kt */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final i7.b f12319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12320b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12321c;

    /* renamed from: d, reason: collision with root package name */
    public final Z f12322d;

    public f(i7.b item, int i) {
        l.f(item, "item");
        this.f12319a = item;
        this.f12320b = i;
        Z z10 = item.f38460a;
        this.f12321c = z10.c();
        this.f12322d = z10;
    }

    public final boolean a(f other) {
        l.f(other, "other");
        return this.f12321c == other.f12321c && C6.e.d(this.f12322d).equals(C6.e.d(other.f12322d));
    }
}
