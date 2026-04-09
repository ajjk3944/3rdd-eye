package com.ui.wifiman.ui.signal;

/* renamed from: com.ui.wifiman.ui.signal.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5233f {

    /* renamed from: a, reason: collision with root package name */
    private final int f44812a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44813b;

    public C5233f(int i10, int i11) {
        this.f44812a = i10;
        this.f44813b = i11;
    }

    public final int a() {
        return this.f44813b;
    }

    public final int b() {
        return this.f44812a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5233f)) {
            return false;
        }
        C5233f c5233f = (C5233f) obj;
        return this.f44812a == c5233f.f44812a && this.f44813b == c5233f.f44813b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f44812a) * 31) + Integer.hashCode(this.f44813b);
    }

    public String toString() {
        return "SelectionState(selected=" + this.f44812a + ", max=" + this.f44813b + ")";
    }
}
