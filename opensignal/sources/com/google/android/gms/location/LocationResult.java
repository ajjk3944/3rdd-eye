package com.google.android.gms.location;

import a2.e;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import cc.s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import i6.a;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import pc.i;
import tc.d;

/* loaded from: classes.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final List f5314a;

    /* renamed from: d, reason: collision with root package name */
    public static final List f5313d = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new a(28);

    public LocationResult(List list) {
        this.f5314a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List list = ((LocationResult) obj).f5314a;
        int i10 = Build.VERSION.SDK_INT;
        List<Location> list2 = this.f5314a;
        if (i10 >= 31) {
            return list2.equals(list);
        }
        if (list2.size() != list.size()) {
            return false;
        }
        Iterator it = list.iterator();
        for (Location location : list2) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !s.k(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5314a});
    }

    public final String toString() {
        String string;
        boolean zH;
        boolean zI;
        float f10;
        boolean zJ;
        float fG;
        StringBuilder sb2 = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = d.f22698a;
        List<Location> list = this.f5314a;
        int i10 = 100;
        sb2.ensureCapacity(list.size() * 100);
        sb2.append("[");
        boolean z10 = false;
        for (Location location : list) {
            DecimalFormat decimalFormat2 = d.f22699b;
            sb2.ensureCapacity(i10);
            if (location == null) {
                sb2.append((String) null);
            } else {
                sb2.append("{");
                sb2.append(location.getProvider());
                sb2.append(", ");
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 31 ? n3.a.a(location) : location.isFromMockProvider()) {
                    sb2.append("mock, ");
                }
                DecimalFormat decimalFormat3 = d.f22698a;
                sb2.append(decimalFormat3.format(location.getLatitude()));
                sb2.append(",");
                sb2.append(decimalFormat3.format(location.getLongitude()));
                if (location.hasAccuracy()) {
                    sb2.append("±");
                    sb2.append(decimalFormat2.format(location.getAccuracy()));
                    sb2.append("m");
                }
                float fC = 0.0f;
                if (location.hasAltitude()) {
                    sb2.append(", alt=");
                    sb2.append(decimalFormat2.format(location.getAltitude()));
                    if (i11 >= 26) {
                        zJ = e.j(location);
                    } else {
                        Bundle extras = location.getExtras();
                        zJ = extras != null && extras.containsKey("verticalAccuracy");
                    }
                    if (zJ) {
                        sb2.append("±");
                        if (i11 >= 26) {
                            fG = e.g(location);
                        } else {
                            Bundle extras2 = location.getExtras();
                            fG = extras2 == null ? 0.0f : extras2.getFloat("verticalAccuracy", 0.0f);
                        }
                        sb2.append(decimalFormat2.format(fG));
                    }
                    sb2.append("m");
                }
                if (location.hasSpeed()) {
                    sb2.append(", spd=");
                    sb2.append(decimalFormat2.format(location.getSpeed()));
                    if (i11 >= 26) {
                        zI = e.i(location);
                    } else {
                        Bundle extras3 = location.getExtras();
                        zI = extras3 != null && extras3.containsKey("speedAccuracy");
                    }
                    if (zI) {
                        sb2.append("±");
                        if (i11 >= 26) {
                            f10 = e.f(location);
                        } else {
                            Bundle extras4 = location.getExtras();
                            f10 = extras4 == null ? 0.0f : extras4.getFloat("speedAccuracy", 0.0f);
                        }
                        sb2.append(decimalFormat2.format(f10));
                    }
                    sb2.append("m/s");
                }
                if (location.hasBearing()) {
                    sb2.append(", brg=");
                    sb2.append(decimalFormat2.format(location.getBearing()));
                    if (i11 >= 26) {
                        zH = e.h(location);
                    } else {
                        Bundle extras5 = location.getExtras();
                        zH = extras5 != null && extras5.containsKey("bearingAccuracy");
                    }
                    if (zH) {
                        sb2.append("±");
                        if (i11 >= 26) {
                            fC = e.c(location);
                        } else {
                            Bundle extras6 = location.getExtras();
                            if (extras6 != null) {
                                fC = extras6.getFloat("bearingAccuracy", 0.0f);
                            }
                        }
                        sb2.append(decimalFormat2.format(fC));
                    }
                    sb2.append("°");
                }
                Bundle extras7 = location.getExtras();
                String string2 = extras7 != null ? extras7.getString("floorLabel") : null;
                if (string2 != null) {
                    sb2.append(", fl=");
                    sb2.append(string2);
                }
                Bundle extras8 = location.getExtras();
                String string3 = extras8 != null ? extras8.getString("levelId") : null;
                if (string3 != null) {
                    sb2.append(", lv=");
                    sb2.append(string3);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb2.append(", ert=");
                long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + jCurrentTimeMillis;
                if (millis >= 0) {
                    string = i.f20448a.format(new Date(millis));
                } else {
                    SimpleDateFormat simpleDateFormat = i.f20448a;
                    string = Long.toString(millis);
                }
                sb2.append(string);
                sb2.append('}');
            }
            sb2.append(", ");
            z10 = true;
            i10 = 100;
        }
        if (z10) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.R(parcel, 1, this.f5314a);
        i4.W(parcel, iU);
    }
}
