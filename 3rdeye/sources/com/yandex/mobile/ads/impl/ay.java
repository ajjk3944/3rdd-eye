package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class ay {

    /* renamed from: a, reason: collision with root package name */
    private final ay f25017a;

    /* renamed from: b, reason: collision with root package name */
    private final ax f25018b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25019c;

    /* renamed from: d, reason: collision with root package name */
    private final List<dy> f25020d;

    /* JADX WARN: Multi-variable type inference failed */
    public ay(ay ayVar, ax destination, boolean z10, List<? extends dy> uiData) {
        kotlin.jvm.internal.l.f(destination, "destination");
        kotlin.jvm.internal.l.f(uiData, "uiData");
        this.f25017a = ayVar;
        this.f25018b = destination;
        this.f25019c = z10;
        this.f25020d = uiData;
    }

    public static ay a(ay ayVar, ay ayVar2, ax destination, boolean z10, List uiData, int i) {
        if ((i & 1) != 0) {
            ayVar2 = ayVar.f25017a;
        }
        if ((i & 2) != 0) {
            destination = ayVar.f25018b;
        }
        if ((i & 4) != 0) {
            z10 = ayVar.f25019c;
        }
        if ((i & 8) != 0) {
            uiData = ayVar.f25020d;
        }
        ayVar.getClass();
        kotlin.jvm.internal.l.f(destination, "destination");
        kotlin.jvm.internal.l.f(uiData, "uiData");
        return new ay(ayVar2, destination, z10, uiData);
    }

    public final ay b() {
        return this.f25017a;
    }

    public final List<dy> c() {
        return this.f25020d;
    }

    public final boolean d() {
        return this.f25019c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        return kotlin.jvm.internal.l.b(this.f25017a, ayVar.f25017a) && kotlin.jvm.internal.l.b(this.f25018b, ayVar.f25018b) && this.f25019c == ayVar.f25019c && kotlin.jvm.internal.l.b(this.f25020d, ayVar.f25020d);
    }

    public final int hashCode() {
        ay ayVar = this.f25017a;
        return this.f25020d.hashCode() + m6.a(this.f25019c, (this.f25018b.hashCode() + ((ayVar == null ? 0 : ayVar.hashCode()) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DebugPanelUiState(prevState=" + this.f25017a + ", destination=" + this.f25018b + ", isLoading=" + this.f25019c + ", uiData=" + this.f25020d + ")";
    }

    public final ax a() {
        return this.f25018b;
    }
}
