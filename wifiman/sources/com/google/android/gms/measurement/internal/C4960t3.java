package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4960t3 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final long f36737a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f36738b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36739c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C4952s3 f36740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4960t3(C4952s3 c4952s3, Runnable runnable, boolean z10, String str) {
        super(com.google.android.gms.internal.measurement.M0.a().b(runnable), null);
        this.f36740d = c4952s3;
        AbstractC7901p.l(str);
        long andIncrement = C4952s3.f36722l.getAndIncrement();
        this.f36737a = andIncrement;
        this.f36739c = str;
        this.f36738b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c4952s3.zzj().C().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C4960t3 c4960t3 = (C4960t3) obj;
        boolean z10 = this.f36738b;
        if (z10 != c4960t3.f36738b) {
            return z10 ? -1 : 1;
        }
        long j10 = this.f36737a;
        long j11 = c4960t3.f36737a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f36740d.zzj().E().b("Two tasks share the same index. index", Long.valueOf(this.f36737a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        this.f36740d.zzj().C().b(this.f36739c, th2);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4960t3(C4952s3 c4952s3, Callable callable, boolean z10, String str) {
        super(com.google.android.gms.internal.measurement.M0.a().a(callable));
        this.f36740d = c4952s3;
        AbstractC7901p.l(str);
        long andIncrement = C4952s3.f36722l.getAndIncrement();
        this.f36737a = andIncrement;
        this.f36739c = str;
        this.f36738b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c4952s3.zzj().C().a("Tasks index overflow");
        }
    }
}
