package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Q0 extends T0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f35097a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private boolean f35098b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r3 = r3.get(org.snmp4j.util.SnmpConfigurator.O_RETRIES);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L3e
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}
            java.lang.String r3 = java.lang.String.format(r1, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Q0.f(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.U0
    public final void a(Bundle bundle) {
        synchronized (this.f35097a) {
            try {
                try {
                    this.f35097a.set(bundle);
                    this.f35098b = true;
                } finally {
                    this.f35097a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bundle c(long j10) {
        Bundle bundle;
        synchronized (this.f35097a) {
            if (!this.f35098b) {
                try {
                    this.f35097a.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f35097a.get();
        }
        return bundle;
    }

    public final Long n0(long j10) {
        return (Long) f(c(j10), Long.class);
    }

    public final String o0(long j10) {
        return (String) f(c(j10), String.class);
    }
}
