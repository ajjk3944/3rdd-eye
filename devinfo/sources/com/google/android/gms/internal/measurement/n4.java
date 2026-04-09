package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n4 {
    public static final Object g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static volatile d4 f19835h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f19836i;

    /* renamed from: a, reason: collision with root package name */
    public final a4.d f19837a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19838b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19839c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f19840d = -1;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f19841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19842f;

    static {
        new AtomicReference();
        f19836i = new AtomicInteger();
    }

    public /* synthetic */ n4(a4.d dVar, String str, Object obj, int i4) {
        this.f19842f = i4;
        if (((Uri) dVar.f189b) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f19837a = dVar;
        this.f19838b = str;
        this.f19839c = obj;
    }

    public final Object a(Object obj) {
        switch (this.f19842f) {
            case 0:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    String string = obj.toString();
                    String str = this.f19838b;
                    Log.e("PhenotypeFlag", a0.g.p(new StringBuilder(str.length() + 25 + string.length()), "Invalid long value for ", str, ": ", string));
                    break;
                } else {
                    break;
                }
            case 1:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!y3.f20045b.matcher(str2).matches()) {
                            if (y3.f20046c.matcher(str2).matches()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    String string2 = obj.toString();
                    String str3 = this.f19838b;
                    Log.e("PhenotypeFlag", a0.g.p(new StringBuilder(str3.length() + 28 + string2.length()), "Invalid boolean value for ", str3, ": ", string2));
                    break;
                } else {
                    break;
                }
            case 2:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        String string3 = obj.toString();
                        String str4 = this.f19838b;
                        Log.e("PhenotypeFlag", a0.g.p(new StringBuilder(str4.length() + 27 + string3.length()), "Invalid double value for ", str4, ": ", string3));
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                if (obj instanceof String) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[PHI: r2
  0x0058: PHI (r2v1 td.b) = (r2v0 td.b), (r2v5 td.b), (r2v5 td.b) binds: [B:8:0x0014, B:10:0x0022, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:17:0x0048, B:26:0x0062, B:28:0x006a, B:30:0x0072, B:33:0x0082, B:35:0x0090, B:47:0x00b5, B:50:0x00bd, B:51:0x00c0, B:52:0x00c4, B:39:0x0099, B:41:0x009d, B:43:0x00ab, B:45:0x00b1, B:53:0x00c9, B:54:0x00cb, B:55:0x00cc, B:56:0x00d1, B:14:0x0041, B:57:0x00d2), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:17:0x0048, B:26:0x0062, B:28:0x006a, B:30:0x0072, B:33:0x0082, B:35:0x0090, B:47:0x00b5, B:50:0x00bd, B:51:0x00c0, B:52:0x00c4, B:39:0x0099, B:41:0x009d, B:43:0x00ab, B:45:0x00b1, B:53:0x00c9, B:54:0x00cb, B:55:0x00cc, B:56:0x00d1, B:14:0x0041, B:57:0x00d2), top: B:63:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n4.b():java.lang.Object");
    }
}
