package io.sentry.clientreport;

import ir.f0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f12158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12159b;

    public c(String str, String str2) {
        this.f12158a = str;
        this.f12159b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f0.s(this.f12158a, cVar.f12158a) && f0.s(this.f12159b, cVar.f12159b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12158a, this.f12159b});
    }
}
