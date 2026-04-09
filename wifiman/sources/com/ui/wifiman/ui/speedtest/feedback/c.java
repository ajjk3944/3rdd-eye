package com.ui.wifiman.ui.speedtest.feedback;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f44902a;

    public c(long j10) {
        this.f44902a = j10;
    }

    public final long a() {
        return this.f44902a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f44902a == ((c) obj).f44902a;
    }

    public int hashCode() {
        return Long.hashCode(this.f44902a);
    }

    public String toString() {
        return "Params(speedtestId=" + this.f44902a + ")";
    }
}
