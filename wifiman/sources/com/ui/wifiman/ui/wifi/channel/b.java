package com.ui.wifiman.ui.wifi.channel;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final S8.e f45176a;

    public b(S8.e channel) {
        AbstractC6492s.i(channel, "channel");
        this.f45176a = channel;
    }

    public final S8.e a() {
        return this.f45176a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && AbstractC6492s.d(this.f45176a, ((b) obj).f45176a);
    }

    public int hashCode() {
        return this.f45176a.hashCode();
    }

    public String toString() {
        return "Params(channel=" + this.f45176a + ")";
    }
}
