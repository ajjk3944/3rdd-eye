package uj;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Object f63227a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f63228b;

    public p(Object current, InterfaceC6824a next) {
        AbstractC6492s.i(current, "current");
        AbstractC6492s.i(next, "next");
        this.f63227a = current;
        this.f63228b = next;
    }

    public final Object a() {
        return this.f63227a;
    }

    public final InterfaceC6824a b() {
        return this.f63228b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC6492s.d(this.f63227a, pVar.f63227a) && AbstractC6492s.d(this.f63228b, pVar.f63228b);
    }

    public int hashCode() {
        return (this.f63227a.hashCode() * 31) + this.f63228b.hashCode();
    }

    public String toString() {
        return "Reference(current=" + this.f63227a + ", next=" + this.f63228b + ')';
    }
}
