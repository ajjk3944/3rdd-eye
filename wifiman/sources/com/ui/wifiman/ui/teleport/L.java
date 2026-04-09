package com.ui.wifiman.ui.teleport;

/* loaded from: classes4.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44978a;

    public L(boolean z10) {
        this.f44978a = z10;
    }

    public final boolean a() {
        return this.f44978a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L) && this.f44978a == ((L) obj).f44978a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f44978a);
    }

    public String toString() {
        return "Params(connectCurrentTunnelWhenAgreed=" + this.f44978a + ")";
    }
}
