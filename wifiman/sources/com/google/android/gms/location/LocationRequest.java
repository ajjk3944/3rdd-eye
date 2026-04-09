package com.google.android.gms.location;

import C3.t;
import C3.w;
import I3.u;
import I3.v;
import I3.x;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.q;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.snmp4j.mp.MPv3;
import s3.AbstractC7900o;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class LocationRequest extends AbstractC8026a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private int f35746a;

    /* renamed from: b, reason: collision with root package name */
    private long f35747b;

    /* renamed from: c, reason: collision with root package name */
    private long f35748c;

    /* renamed from: d, reason: collision with root package name */
    private long f35749d;

    /* renamed from: e, reason: collision with root package name */
    private long f35750e;

    /* renamed from: f, reason: collision with root package name */
    private int f35751f;

    /* renamed from: g, reason: collision with root package name */
    private float f35752g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f35753h;

    /* renamed from: i, reason: collision with root package name */
    private long f35754i;

    /* renamed from: j, reason: collision with root package name */
    private final int f35755j;

    /* renamed from: k, reason: collision with root package name */
    private final int f35756k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f35757l;

    /* renamed from: m, reason: collision with root package name */
    private final WorkSource f35758m;

    /* renamed from: n, reason: collision with root package name */
    private final t f35759n;

    LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, boolean z11, WorkSource workSource, t tVar) {
        long j16;
        this.f35746a = i10;
        if (i10 == 105) {
            this.f35747b = Long.MAX_VALUE;
            j16 = j10;
        } else {
            j16 = j10;
            this.f35747b = j16;
        }
        this.f35748c = j11;
        this.f35749d = j12;
        this.f35750e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f35751f = i11;
        this.f35752g = f10;
        this.f35753h = z10;
        this.f35754i = j15 != -1 ? j15 : j16;
        this.f35755j = i12;
        this.f35756k = i13;
        this.f35757l = z11;
        this.f35758m = workSource;
        this.f35759n = tVar;
    }

    public static LocationRequest b() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, MPv3.MAX_MESSAGE_ID, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String y(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : w.a(j10);
    }

    public long e() {
        return this.f35750e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f35746a == locationRequest.f35746a && ((w() || this.f35747b == locationRequest.f35747b) && this.f35748c == locationRequest.f35748c && u() == locationRequest.u() && ((!u() || this.f35749d == locationRequest.f35749d) && this.f35750e == locationRequest.f35750e && this.f35751f == locationRequest.f35751f && this.f35752g == locationRequest.f35752g && this.f35753h == locationRequest.f35753h && this.f35755j == locationRequest.f35755j && this.f35756k == locationRequest.f35756k && this.f35757l == locationRequest.f35757l && this.f35758m.equals(locationRequest.f35758m) && AbstractC7900o.a(this.f35759n, locationRequest.f35759n)))) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f35755j;
    }

    public long g() {
        return this.f35747b;
    }

    public int hashCode() {
        return AbstractC7900o.b(Integer.valueOf(this.f35746a), Long.valueOf(this.f35747b), Long.valueOf(this.f35748c), this.f35758m);
    }

    public long i() {
        return this.f35754i;
    }

    public long j() {
        return this.f35749d;
    }

    public int k() {
        return this.f35751f;
    }

    public float m() {
        return this.f35752g;
    }

    public long o() {
        return this.f35748c;
    }

    public int q() {
        return this.f35746a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (w()) {
            sb2.append(u.a(this.f35746a));
            if (this.f35749d > 0) {
                sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
                w.b(this.f35749d, sb2);
            }
        } else {
            sb2.append("@");
            if (u()) {
                w.b(this.f35747b, sb2);
                sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
                w.b(this.f35749d, sb2);
            } else {
                w.b(this.f35747b, sb2);
            }
            sb2.append(" ");
            sb2.append(u.a(this.f35746a));
        }
        if (w() || this.f35748c != this.f35747b) {
            sb2.append(", minUpdateInterval=");
            sb2.append(y(this.f35748c));
        }
        if (this.f35752g > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f35752g);
        }
        if (!w() ? this.f35754i != this.f35747b : this.f35754i != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(y(this.f35754i));
        }
        if (this.f35750e != Long.MAX_VALUE) {
            sb2.append(", duration=");
            w.b(this.f35750e, sb2);
        }
        if (this.f35751f != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f35751f);
        }
        if (this.f35756k != 0) {
            sb2.append(", ");
            sb2.append(v.a(this.f35756k));
        }
        if (this.f35755j != 0) {
            sb2.append(", ");
            sb2.append(x.a(this.f35755j));
        }
        if (this.f35753h) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f35757l) {
            sb2.append(", bypass");
        }
        if (!q.a(this.f35758m)) {
            sb2.append(", ");
            sb2.append(this.f35758m);
        }
        if (this.f35759n != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f35759n);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public boolean u() {
        long j10 = this.f35749d;
        return j10 > 0 && (j10 >> 1) >= this.f35747b;
    }

    public boolean w() {
        return this.f35746a == 105;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, q());
        t3.b.n(parcel, 2, g());
        t3.b.n(parcel, 3, o());
        t3.b.k(parcel, 6, k());
        t3.b.h(parcel, 7, m());
        t3.b.n(parcel, 8, j());
        t3.b.c(parcel, 9, x());
        t3.b.n(parcel, 10, e());
        t3.b.n(parcel, 11, i());
        t3.b.k(parcel, 12, f());
        t3.b.k(parcel, 13, this.f35756k);
        t3.b.c(parcel, 15, this.f35757l);
        t3.b.p(parcel, 16, this.f35758m, i10, false);
        t3.b.p(parcel, 17, this.f35759n, i10, false);
        t3.b.b(parcel, iA);
    }

    public boolean x() {
        return this.f35753h;
    }
}
