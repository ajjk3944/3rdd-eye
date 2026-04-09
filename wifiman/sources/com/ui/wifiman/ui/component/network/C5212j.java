package com.ui.wifiman.ui.component.network;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: com.ui.wifiman.ui.component.network.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5212j {

    /* renamed from: a, reason: collision with root package name */
    private final C5211i f44499a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5210h f44500b;

    public C5212j(C5211i endpoint, AbstractC5210h connection) {
        AbstractC6492s.i(endpoint, "endpoint");
        AbstractC6492s.i(connection, "connection");
        this.f44499a = endpoint;
        this.f44500b = connection;
    }

    public final AbstractC5210h a() {
        return this.f44500b;
    }

    public final C5211i b() {
        return this.f44499a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5212j)) {
            return false;
        }
        C5212j c5212j = (C5212j) obj;
        return AbstractC6492s.d(this.f44499a, c5212j.f44499a) && AbstractC6492s.d(this.f44500b, c5212j.f44500b);
    }

    public int hashCode() {
        return (this.f44499a.hashCode() * 31) + this.f44500b.hashCode();
    }

    public String toString() {
        return "Item(endpoint=" + this.f44499a + ", connection=" + this.f44500b + ")";
    }
}
