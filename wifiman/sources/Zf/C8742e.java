package zf;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: zf.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8742e {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC8738a f67262a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67263b;

    public C8742e(EnumC8738a filter, int i10) {
        AbstractC6492s.i(filter, "filter");
        this.f67262a = filter;
        this.f67263b = i10;
    }

    public final int a() {
        return this.f67263b;
    }

    public final EnumC8738a b() {
        return this.f67262a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8742e)) {
            return false;
        }
        C8742e c8742e = (C8742e) obj;
        return this.f67262a == c8742e.f67262a && this.f67263b == c8742e.f67263b;
    }

    public int hashCode() {
        return (this.f67262a.hashCode() * 31) + Integer.hashCode(this.f67263b);
    }

    public String toString() {
        return "Item(filter=" + this.f67262a + ", count=" + this.f67263b + ")";
    }
}
