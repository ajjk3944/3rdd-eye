package v;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8178b {

    /* renamed from: a, reason: collision with root package name */
    private final long f63272a;

    /* renamed from: b, reason: collision with root package name */
    private final long f63273b;

    /* renamed from: c, reason: collision with root package name */
    private final long f63274c;

    /* renamed from: d, reason: collision with root package name */
    private final long f63275d;

    /* renamed from: e, reason: collision with root package name */
    private final long f63276e;

    public /* synthetic */ C8178b(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    public final long a() {
        return this.f63272a;
    }

    public final long b() {
        return this.f63276e;
    }

    public final long c() {
        return this.f63275d;
    }

    public final long d() {
        return this.f63274c;
    }

    public final long e() {
        return this.f63273b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8178b)) {
            return false;
        }
        C8178b c8178b = (C8178b) obj;
        return C6733v0.m(this.f63272a, c8178b.f63272a) && C6733v0.m(this.f63273b, c8178b.f63273b) && C6733v0.m(this.f63274c, c8178b.f63274c) && C6733v0.m(this.f63275d, c8178b.f63275d) && C6733v0.m(this.f63276e, c8178b.f63276e);
    }

    public int hashCode() {
        return (((((((C6733v0.s(this.f63272a) * 31) + C6733v0.s(this.f63273b)) * 31) + C6733v0.s(this.f63274c)) * 31) + C6733v0.s(this.f63275d)) * 31) + C6733v0.s(this.f63276e);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) C6733v0.t(this.f63272a)) + ", textColor=" + ((Object) C6733v0.t(this.f63273b)) + ", iconColor=" + ((Object) C6733v0.t(this.f63274c)) + ", disabledTextColor=" + ((Object) C6733v0.t(this.f63275d)) + ", disabledIconColor=" + ((Object) C6733v0.t(this.f63276e)) + ')';
    }

    private C8178b(long j10, long j11, long j12, long j13, long j14) {
        this.f63272a = j10;
        this.f63273b = j11;
        this.f63274c = j12;
        this.f63275d = j13;
        this.f63276e = j14;
    }
}
