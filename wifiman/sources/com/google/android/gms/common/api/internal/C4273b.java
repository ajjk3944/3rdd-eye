package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import s3.AbstractC7900o;

/* renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4273b {

    /* renamed from: a, reason: collision with root package name */
    private final int f34802a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f34803b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f34804c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34805d;

    private C4273b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f34803b = aVar;
        this.f34804c = dVar;
        this.f34805d = str;
        this.f34802a = AbstractC7900o.b(aVar, dVar, str);
    }

    public static C4273b a(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        return new C4273b(aVar, dVar, str);
    }

    public final String b() {
        return this.f34803b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4273b)) {
            return false;
        }
        C4273b c4273b = (C4273b) obj;
        return AbstractC7900o.a(this.f34803b, c4273b.f34803b) && AbstractC7900o.a(this.f34804c, c4273b.f34804c) && AbstractC7900o.a(this.f34805d, c4273b.f34805d);
    }

    public final int hashCode() {
        return this.f34802a;
    }
}
