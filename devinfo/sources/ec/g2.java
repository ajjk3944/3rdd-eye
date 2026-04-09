package ec;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22722a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22724c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22727f;

    public g2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.l0 l0Var, String str, String str2, boolean z3) {
        this.f22726e = l0Var;
        this.f22723b = str;
        this.f22724c = str2;
        this.f22725d = z3;
        this.f22727f = appMeasurementDynamiteService;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0107 A[Catch: RuntimeException -> 0x00e1, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x00e1, blocks: (B:53:0x0107, B:55:0x0112, B:58:0x011f, B:60:0x0125, B:62:0x013f, B:64:0x0148, B:67:0x0150, B:70:0x0169, B:72:0x0178, B:71:0x0170, B:73:0x018b, B:75:0x0191, B:77:0x0197, B:79:0x019d, B:81:0x01a3, B:83:0x01ab, B:85:0x01b3, B:87:0x01b9, B:88:0x01cb, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e8, B:50:0x00f6), top: B:102:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150 A[Catch: RuntimeException -> 0x00e1, TryCatch #1 {RuntimeException -> 0x00e1, blocks: (B:53:0x0107, B:55:0x0112, B:58:0x011f, B:60:0x0125, B:62:0x013f, B:64:0x0148, B:67:0x0150, B:70:0x0169, B:72:0x0178, B:71:0x0170, B:73:0x018b, B:75:0x0191, B:77:0x0197, B:79:0x019d, B:81:0x01a3, B:83:0x01ab, B:85:0x01b3, B:87:0x01b9, B:88:0x01cb, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e8, B:50:0x00f6), top: B:102:0x0090 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g2.run():void");
    }

    public g2(m2 m2Var, boolean z3, Uri uri, String str, String str2) {
        this.f22725d = z3;
        this.f22726e = uri;
        this.f22723b = str;
        this.f22724c = str2;
        this.f22727f = m2Var;
    }

    public g2(q2 q2Var, AtomicReference atomicReference, String str, String str2, boolean z3) {
        this.f22726e = atomicReference;
        this.f22723b = str;
        this.f22724c = str2;
        this.f22725d = z3;
        Objects.requireNonNull(q2Var);
        this.f22727f = q2Var;
    }

    public g2(j3 j3Var, n4 n4Var, boolean z3, t tVar, Bundle bundle) {
        this.f22726e = n4Var;
        this.f22725d = z3;
        this.f22723b = tVar;
        this.f22724c = bundle;
        Objects.requireNonNull(j3Var);
        this.f22727f = j3Var;
    }
}
