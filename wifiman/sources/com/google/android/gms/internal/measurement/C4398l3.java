package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import m4.AbstractC6769h;
import t1.AbstractC8024d;

/* renamed from: com.google.android.gms.internal.measurement.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4398l3 implements InterfaceC4390k3 {

    /* renamed from: d, reason: collision with root package name */
    private static C4398l3 f35379d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f35380a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f35381b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35382c;

    private C4398l3() {
        this.f35382c = false;
        this.f35380a = null;
        this.f35381b = null;
    }

    static C4398l3 a(Context context) {
        C4398l3 c4398l3;
        synchronized (C4398l3.class) {
            try {
                if (f35379d == null) {
                    f35379d = AbstractC8024d.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C4398l3(context) : new C4398l3();
                }
                C4398l3 c4398l32 = f35379d;
                if (c4398l32 != null && c4398l32.f35381b != null && !c4398l32.f35382c) {
                    try {
                        context.getContentResolver().registerContentObserver(S2.f35103a, true, f35379d.f35381b);
                        ((C4398l3) AbstractC6769h.i(f35379d)).f35382c = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                c4398l3 = (C4398l3) AbstractC6769h.i(f35379d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4398l3;
    }

    static synchronized void c() {
        Context context;
        try {
            C4398l3 c4398l3 = f35379d;
            if (c4398l3 != null && (context = c4398l3.f35380a) != null && c4398l3.f35381b != null && c4398l3.f35382c) {
                context.getContentResolver().unregisterContentObserver(f35379d.f35381b);
            }
            f35379d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4390k3
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String zza(final String str) {
        Context context = this.f35380a;
        if (context != null && !AbstractC4328d3.b(context)) {
            try {
                return (String) AbstractC4382j3.a(new InterfaceC4406m3() { // from class: com.google.android.gms.internal.measurement.o3
                    @Override // com.google.android.gms.internal.measurement.InterfaceC4406m3
                    public final Object zza() {
                        return T2.a(((Context) AbstractC6769h.i(this.f35410a.f35380a)).getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e10);
            }
        }
        return null;
    }

    private C4398l3(Context context) {
        this.f35382c = false;
        this.f35380a = context;
        this.f35381b = new C4414n3(this, null);
    }
}
