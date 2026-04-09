package ld;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ld.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6574a {

    /* renamed from: a, reason: collision with root package name */
    private final String f52538a;

    public C6574a(String id2) {
        AbstractC6492s.i(id2, "id");
        this.f52538a = id2;
    }

    public final String a() {
        return this.f52538a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6574a) && AbstractC6492s.d(this.f52538a, ((C6574a) obj).f52538a);
    }

    public int hashCode() {
        return this.f52538a.hashCode();
    }

    public String toString() {
        return "Session ID = " + this.f52538a;
    }
}
