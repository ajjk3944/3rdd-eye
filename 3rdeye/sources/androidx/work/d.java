package androidx.work;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import c9.C2101v;
import java.util.Set;

/* compiled from: Constraints.kt */
/* loaded from: classes.dex */
public final class d {
    public static final d i;

    /* renamed from: a, reason: collision with root package name */
    public final n f16882a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16883b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16884c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16885d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16886e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16887f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16888g;

    /* renamed from: h, reason: collision with root package name */
    public final Set<a> f16889h;

    /* compiled from: Constraints.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f16890a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16891b;

        public a(boolean z10, Uri uri) {
            this.f16890a = uri;
            this.f16891b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f16890a, aVar.f16890a) && this.f16891b == aVar.f16891b;
        }

        public final int hashCode() {
            return (this.f16890a.hashCode() * 31) + (this.f16891b ? 1231 : 1237);
        }
    }

    static {
        n requiredNetworkType = n.NOT_REQUIRED;
        kotlin.jvm.internal.l.f(requiredNetworkType, "requiredNetworkType");
        i = new d(requiredNetworkType, false, false, false, false, -1L, -1L, C2101v.f18583b);
    }

    public d(n requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j4, long j10, Set<a> contentUriTriggers) {
        kotlin.jvm.internal.l.f(requiredNetworkType, "requiredNetworkType");
        kotlin.jvm.internal.l.f(contentUriTriggers, "contentUriTriggers");
        this.f16882a = requiredNetworkType;
        this.f16883b = z10;
        this.f16884c = z11;
        this.f16885d = z12;
        this.f16886e = z13;
        this.f16887f = j4;
        this.f16888g = j10;
        this.f16889h = contentUriTriggers;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT < 24 || !this.f16889h.isEmpty();
    }

    @SuppressLint({"NewApi"})
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.class.equals(obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f16883b == dVar.f16883b && this.f16884c == dVar.f16884c && this.f16885d == dVar.f16885d && this.f16886e == dVar.f16886e && this.f16887f == dVar.f16887f && this.f16888g == dVar.f16888g && this.f16882a == dVar.f16882a) {
            return kotlin.jvm.internal.l.b(this.f16889h, dVar.f16889h);
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public final int hashCode() {
        int iHashCode = ((((((((this.f16882a.hashCode() * 31) + (this.f16883b ? 1 : 0)) * 31) + (this.f16884c ? 1 : 0)) * 31) + (this.f16885d ? 1 : 0)) * 31) + (this.f16886e ? 1 : 0)) * 31;
        long j4 = this.f16887f;
        int i10 = (iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j10 = this.f16888g;
        return this.f16889h.hashCode() + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    @SuppressLint({"NewApi"})
    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f16882a + ", requiresCharging=" + this.f16883b + ", requiresDeviceIdle=" + this.f16884c + ", requiresBatteryNotLow=" + this.f16885d + ", requiresStorageNotLow=" + this.f16886e + ", contentTriggerUpdateDelayMillis=" + this.f16887f + ", contentTriggerMaxDelayMillis=" + this.f16888g + ", contentUriTriggers=" + this.f16889h + ", }";
    }

    @SuppressLint({"NewApi"})
    public d(d other) {
        kotlin.jvm.internal.l.f(other, "other");
        this.f16883b = other.f16883b;
        this.f16884c = other.f16884c;
        this.f16882a = other.f16882a;
        this.f16885d = other.f16885d;
        this.f16886e = other.f16886e;
        this.f16889h = other.f16889h;
        this.f16887f = other.f16887f;
        this.f16888g = other.f16888g;
    }
}
