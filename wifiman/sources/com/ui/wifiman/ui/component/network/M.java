package com.ui.wifiman.ui.component.network;

import com.ui.wifiman.ui.component.network.C5219q;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* loaded from: classes4.dex */
public final class M implements C5219q.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f44344a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7929a f44345b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f44346c;

    /* renamed from: d, reason: collision with root package name */
    private final Af.v f44347d;

    /* renamed from: e, reason: collision with root package name */
    private final s9.d f44348e;

    /* renamed from: f, reason: collision with root package name */
    private final K f44349f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f44350g;

    public M(String id2, InterfaceC7929a image, s9.d name, Af.v vVar, s9.d dVar, K info, boolean z10) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(image, "image");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(info, "info");
        this.f44344a = id2;
        this.f44345b = image;
        this.f44346c = name;
        this.f44347d = vVar;
        this.f44348e = dVar;
        this.f44349f = info;
        this.f44350g = z10;
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.b
    public InterfaceC7929a a() {
        return this.f44345b;
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.b
    public s9.d b() {
        return this.f44348e;
    }

    public final boolean c() {
        return this.f44350g;
    }

    public final K d() {
        return this.f44349f;
    }

    public final Af.v e() {
        return this.f44347d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return AbstractC6492s.d(this.f44344a, m10.f44344a) && AbstractC6492s.d(this.f44345b, m10.f44345b) && AbstractC6492s.d(this.f44346c, m10.f44346c) && AbstractC6492s.d(this.f44347d, m10.f44347d) && AbstractC6492s.d(this.f44348e, m10.f44348e) && AbstractC6492s.d(this.f44349f, m10.f44349f) && this.f44350g == m10.f44350g;
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.b
    public String getId() {
        return this.f44344a;
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.b
    public s9.d getTitle() {
        return this.f44346c;
    }

    public int hashCode() {
        int iHashCode = ((((this.f44344a.hashCode() * 31) + this.f44345b.hashCode()) * 31) + this.f44346c.hashCode()) * 31;
        Af.v vVar = this.f44347d;
        int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
        s9.d dVar = this.f44348e;
        return ((((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.f44349f.hashCode()) * 31) + Boolean.hashCode(this.f44350g);
    }

    public String toString() {
        return "Item(id=" + this.f44344a + ", image=" + this.f44345b + ", name=" + this.f44346c + ", wifiGenBadge=" + this.f44347d + ", ip=" + this.f44348e + ", info=" + this.f44349f + ", clickable=" + this.f44350g + ")";
    }
}
