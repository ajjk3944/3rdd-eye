package com.ui.wifiman.ui.component.network;

import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* renamed from: com.ui.wifiman.ui.component.network.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5211i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7929a f44498a;

    public C5211i(InterfaceC7929a icon) {
        AbstractC6492s.i(icon, "icon");
        this.f44498a = icon;
    }

    public final InterfaceC7929a a() {
        return this.f44498a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5211i) && AbstractC6492s.d(this.f44498a, ((C5211i) obj).f44498a);
    }

    public int hashCode() {
        return this.f44498a.hashCode();
    }

    public String toString() {
        return "Endpoint(icon=" + this.f44498a + ")";
    }
}
