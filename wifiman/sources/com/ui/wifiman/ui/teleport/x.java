package com.ui.wifiman.ui.teleport;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final s9.d f45161a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f45162b;

    public x(s9.d download, s9.d upload) {
        AbstractC6492s.i(download, "download");
        AbstractC6492s.i(upload, "upload");
        this.f45161a = download;
        this.f45162b = upload;
    }

    public final s9.d a() {
        return this.f45161a;
    }

    public final s9.d b() {
        return this.f45162b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return AbstractC6492s.d(this.f45161a, xVar.f45161a) && AbstractC6492s.d(this.f45162b, xVar.f45162b);
    }

    public int hashCode() {
        return (this.f45161a.hashCode() * 31) + this.f45162b.hashCode();
    }

    public String toString() {
        return "ConnectionSpeed(download=" + this.f45161a + ", upload=" + this.f45162b + ")";
    }
}
