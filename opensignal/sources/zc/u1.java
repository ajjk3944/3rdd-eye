package zc;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27225a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27226d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27227g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f27228r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f27229x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f27230y;

    public u1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.m0 m0Var, String str, String str2, boolean z10) {
        this.f27229x = m0Var;
        this.f27226d = str;
        this.f27227g = str2;
        this.f27228r = z10;
        this.f27230y = appMeasurementDynamiteService;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.u1.run():void");
    }

    public u1(kg.j jVar, boolean z10, Uri uri, String str, String str2) {
        this.f27228r = z10;
        this.f27229x = uri;
        this.f27226d = str;
        this.f27227g = str2;
        this.f27230y = jVar;
    }

    public u1(d2 d2Var, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f27229x = atomicReference;
        this.f27226d = str;
        this.f27227g = str2;
        this.f27228r = z10;
        Objects.requireNonNull(d2Var);
        this.f27230y = d2Var;
    }

    public u1(x2 x2Var, zzr zzrVar, boolean z10, zzbe zzbeVar, Bundle bundle) {
        this.f27229x = zzrVar;
        this.f27228r = z10;
        this.f27226d = zzbeVar;
        this.f27227g = bundle;
        Objects.requireNonNull(x2Var);
        this.f27230y = x2Var;
    }
}
