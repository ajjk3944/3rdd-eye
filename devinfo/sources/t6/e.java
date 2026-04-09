package t6;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {
    public static final e j = new e();

    /* renamed from: a, reason: collision with root package name */
    public final w f34334a;

    /* renamed from: b, reason: collision with root package name */
    public final c7.h f34335b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34336c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34337d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34338e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34339f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f34340h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f34341i;

    public e() {
        this.f34335b = new c7.h(null);
        this.f34334a = w.f34401a;
        this.f34336c = false;
        this.f34337d = false;
        this.f34338e = false;
        this.f34339f = false;
        this.g = -1L;
        this.f34340h = -1L;
        this.f34341i = zj.u.f38319a;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.f34335b.f2782a;
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT < 24 || !this.f34341i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !e.class.equals(obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f34336c == eVar.f34336c && this.f34337d == eVar.f34337d && this.f34338e == eVar.f34338e && this.f34339f == eVar.f34339f && this.g == eVar.g && this.f34340h == eVar.f34340h && nk.k.a(a(), eVar.a()) && this.f34334a == eVar.f34334a) {
            return nk.k.a(this.f34341i, eVar.f34341i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f34334a.hashCode() * 31) + (this.f34336c ? 1 : 0)) * 31) + (this.f34337d ? 1 : 0)) * 31) + (this.f34338e ? 1 : 0)) * 31) + (this.f34339f ? 1 : 0)) * 31;
        long j8 = this.g;
        int i4 = (iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f34340h;
        int iHashCode2 = (this.f34341i.hashCode() + ((i4 + ((int) (j9 ^ (j9 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f34334a + ", requiresCharging=" + this.f34336c + ", requiresDeviceIdle=" + this.f34337d + ", requiresBatteryNotLow=" + this.f34338e + ", requiresStorageNotLow=" + this.f34339f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.f34340h + ", contentUriTriggers=" + this.f34341i + ", }";
    }

    public e(c7.h hVar, w wVar, boolean z3, boolean z10, boolean z11, boolean z12, long j8, long j9, Set set) {
        this.f34335b = hVar;
        this.f34334a = wVar;
        this.f34336c = z3;
        this.f34337d = z10;
        this.f34338e = z11;
        this.f34339f = z12;
        this.g = j8;
        this.f34340h = j9;
        this.f34341i = set;
    }

    public e(e eVar) {
        nk.k.e(eVar, "other");
        this.f34336c = eVar.f34336c;
        this.f34337d = eVar.f34337d;
        this.f34335b = eVar.f34335b;
        this.f34334a = eVar.f34334a;
        this.f34338e = eVar.f34338e;
        this.f34339f = eVar.f34339f;
        this.f34341i = eVar.f34341i;
        this.g = eVar.g;
        this.f34340h = eVar.f34340h;
    }
}
