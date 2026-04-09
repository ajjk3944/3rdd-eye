package com.google.firebase.crashlytics.internal.common;

import java.io.File;

/* renamed from: com.google.firebase.crashlytics.internal.common.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5100b extends D {

    /* renamed from: a, reason: collision with root package name */
    private final N4.F f38760a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38761b;

    /* renamed from: c, reason: collision with root package name */
    private final File f38762c;

    C5100b(N4.F f10, String str, File file) {
        if (f10 == null) {
            throw new NullPointerException("Null report");
        }
        this.f38760a = f10;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f38761b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f38762c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.D
    public N4.F b() {
        return this.f38760a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.D
    public File c() {
        return this.f38762c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.D
    public String d() {
        return this.f38761b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return this.f38760a.equals(d10.b()) && this.f38761b.equals(d10.d()) && this.f38762c.equals(d10.c());
    }

    public int hashCode() {
        return ((((this.f38760a.hashCode() ^ 1000003) * 1000003) ^ this.f38761b.hashCode()) * 1000003) ^ this.f38762c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f38760a + ", sessionId=" + this.f38761b + ", reportFile=" + this.f38762c + "}";
    }
}
