package t1;

import kotlin.jvm.internal.l;

/* compiled from: GetTopicsRequest.kt */
/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5594a {

    /* renamed from: a, reason: collision with root package name */
    public final String f46372a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46373b;

    /* compiled from: GetTopicsRequest.kt */
    /* renamed from: t1.a$a, reason: collision with other inner class name */
    public static final class C0534a {
    }

    public C5594a() {
        this("", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5594a)) {
            return false;
        }
        C5594a c5594a = (C5594a) obj;
        return l.b(this.f46372a, c5594a.f46372a) && this.f46373b == c5594a.f46373b;
    }

    public final int hashCode() {
        return (this.f46372a.hashCode() * 31) + (this.f46373b ? 1231 : 1237);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f46372a + ", shouldRecordObservation=" + this.f46373b;
    }

    public C5594a(String str, boolean z10) {
        this.f46372a = str;
        this.f46373b = z10;
    }
}
