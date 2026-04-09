package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import s3.AbstractC7905u;
import s3.C7899n;
import s3.C7904t;
import s3.C7907w;
import s3.InterfaceC7906v;

/* loaded from: classes.dex */
public final class J2 {

    /* renamed from: d, reason: collision with root package name */
    private static J2 f35937d;

    /* renamed from: e, reason: collision with root package name */
    private static final Duration f35938e = Duration.ofMinutes(30);

    /* renamed from: a, reason: collision with root package name */
    private final C4976v3 f35939a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7906v f35940b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f35941c = new AtomicLong(-1);

    private J2(Context context, C4976v3 c4976v3) {
        this.f35940b = AbstractC7905u.b(context, C7907w.a().b("measurement:api").a());
        this.f35939a = c4976v3;
    }

    static J2 a(C4976v3 c4976v3) {
        if (f35937d == null) {
            f35937d = new J2(c4976v3.zza(), c4976v3);
        }
        return f35937d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long jC = this.f35939a.zzb().c();
        if (this.f35941c.get() != -1 && jC - this.f35941c.get() <= f35938e.toMillis()) {
            return;
        }
        this.f35940b.a(new C7904t(0, Arrays.asList(new C7899n(36301, i11, 0, j10, j11, null, null, 0, i12)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.measurement.internal.H2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f35913a.f35941c.set(jC);
            }
        });
    }
}
