package A9;

import N7.B8;
import f9.AbstractC4343a;
import f9.InterfaceC4350h;

/* compiled from: CoroutineName.kt */
/* loaded from: classes3.dex */
public final class D extends AbstractC4343a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f185c = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f186b;

    /* compiled from: CoroutineName.kt */
    public static final class a implements InterfaceC4350h.b<D> {
    }

    public D() {
        super(f185c);
        this.f186b = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && kotlin.jvm.internal.l.b(this.f186b, ((D) obj).f186b);
    }

    public final int hashCode() {
        return this.f186b.hashCode();
    }

    public final String toString() {
        return B8.j(new StringBuilder("CoroutineName("), this.f186b, ')');
    }
}
