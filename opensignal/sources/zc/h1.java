package zc;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzr;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class h1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f26959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f26960c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i1 f26961d;

    public /* synthetic */ h1(i1 i1Var, zzr zzrVar, Bundle bundle, int i10) {
        this.f26958a = i10;
        this.f26959b = zzrVar;
        this.f26960c = bundle;
        this.f26961d = i1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f26958a) {
            case 0:
                i1 i1Var = this.f26961d;
                i1Var.f26968d.w();
                return i1Var.f26968d.a0(this.f26960c, this.f26959b);
            default:
                i1 i1Var2 = this.f26961d;
                i1Var2.f26968d.w();
                return i1Var2.f26968d.a0(this.f26960c, this.f26959b);
        }
    }
}
