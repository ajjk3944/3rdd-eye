package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.yandex.mobile.ads.impl.jw0;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class h60 extends sh1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f28096d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28097e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28098f;

    /* renamed from: g, reason: collision with root package name */
    public final dc0 f28099g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28100h;
    public final fw0 i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f28101j;

    private h60(int i, Throwable th, int i10, int i11) {
        this(a(i, null, null, -1, null, 4), th, i10, i, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    public static h60 a() {
        return new h60(a(3, "Video load error occurred", null, -1, null, 4), null, 1001, 3, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    private h60(Bundle bundle) {
        super(bundle);
        this.f28096d = bundle.getInt(sh1.a(1001), 2);
        this.f28097e = bundle.getString(sh1.a(1002));
        this.f28098f = bundle.getInt(sh1.a(1003), -1);
        Bundle bundle2 = bundle.getBundle(sh1.a(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
        this.f28099g = bundle2 == null ? null : (dc0) dc0.f26065I.fromBundle(bundle2);
        this.f28100h = bundle.getInt(sh1.a(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT), 4);
        this.f28101j = bundle.getBoolean(sh1.a(1006), false);
        this.i = null;
    }

    public static h60 a(Exception exc, String str, int i, dc0 dc0Var, int i10, boolean z10, int i11) {
        int i12 = dc0Var == null ? 4 : i10;
        return new h60(a(1, null, str, i, dc0Var, i12), exc, i11, 1, str, i, dc0Var, i12, null, SystemClock.elapsedRealtime(), z10);
    }

    @Deprecated
    public static h60 a(IllegalStateException illegalStateException) {
        return new h60(2, illegalStateException, 1000, 0);
    }

    private static String a(int i, String str, String str2, int i10, dc0 dc0Var, int i11) {
        String string;
        String str3;
        if (i == 0) {
            string = "Source error";
        } else if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i10);
            sb.append(", format=");
            sb.append(dc0Var);
            sb.append(", format_supported=");
            int i12 = s82.f32899a;
            if (i11 == 0) {
                str3 = "NO";
            } else if (i11 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i11 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i11 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i11 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str3);
            string = sb.toString();
        } else if (i != 3) {
            string = "Unexpected runtime error";
        } else {
            string = "Remote error";
        }
        return !TextUtils.isEmpty(str) ? B4.g.o(string, ": ", str) : string;
    }

    private h60(String str, Throwable th, int i, int i10, String str2, int i11, dc0 dc0Var, int i12, jw0.b bVar, long j4, boolean z10) {
        super(str, th, i, j4);
        zf.a(!z10 || i10 == 1);
        zf.a(th != null || i10 == 3);
        this.f28096d = i10;
        this.f28097e = str2;
        this.f28098f = i11;
        this.f28099g = dc0Var;
        this.f28100h = i12;
        this.i = bVar;
        this.f28101j = z10;
    }

    public static h60 a(IOException iOException, int i) {
        return new h60(0, iOException, i, 0);
    }

    public static h60 a(RuntimeException runtimeException, int i) {
        return new h60(2, runtimeException, i, 0);
    }

    public final h60 a(jw0.b bVar) {
        String message = getMessage();
        int i = s82.f32899a;
        return new h60(message, getCause(), this.f33070b, this.f28096d, this.f28097e, this.f28098f, this.f28099g, this.f28100h, bVar, this.f33071c, this.f28101j);
    }
}
