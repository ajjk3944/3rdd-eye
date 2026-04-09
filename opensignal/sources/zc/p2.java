package zc;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class p2 implements Runnable {
    public final /* synthetic */ Object B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27084a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27085d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f27086g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ zzr f27087r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f27088x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x2 f27089y;

    public p2(x2 x2Var, String str, String str2, zzr zzrVar, boolean z10, com.google.android.gms.internal.measurement.m0 m0Var) {
        this.f27085d = str;
        this.f27086g = str2;
        this.f27087r = zzrVar;
        this.f27088x = z10;
        this.B = m0Var;
        this.f27089y = x2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        s3 s3Var;
        x xVar;
        c1 c1Var;
        AtomicReference atomicReference;
        x2 x2Var;
        x xVar2;
        switch (this.f27084a) {
            case 0:
                String str = this.f27086g;
                String str2 = this.f27085d;
                com.google.android.gms.internal.measurement.m0 m0Var = (com.google.android.gms.internal.measurement.m0) this.B;
                x2 x2Var2 = this.f27089y;
                Bundle bundle = new Bundle();
                try {
                    try {
                        xVar = x2Var2.f27267x;
                        c1Var = (c1) x2Var2.f1504d;
                    } catch (RemoteException e4) {
                        e = e4;
                    }
                    if (xVar == null) {
                        j0 j0Var = c1Var.f26889y;
                        c1.g(j0Var);
                        j0Var.B.d(str2, str, "Failed to get user properties; not connected to service");
                        s3Var = c1Var.E;
                        c1.e(s3Var);
                        s3Var.f2(m0Var, bundle);
                        return;
                    }
                    List<zzpl> listI = xVar.I(str2, str, this.f27088x, this.f27087r);
                    Bundle bundle2 = new Bundle();
                    if (listI != null) {
                        for (zzpl zzplVar : listI) {
                            String str3 = zzplVar.f5424x;
                            String str4 = zzplVar.f5421d;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l10 = zzplVar.f5423r;
                                if (l10 != null) {
                                    bundle2.putLong(str4, l10.longValue());
                                } else {
                                    Double d6 = zzplVar.B;
                                    if (d6 != null) {
                                        bundle2.putDouble(str4, d6.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        x2Var2.F1();
                        s3 s3Var2 = c1Var.E;
                        c1.e(s3Var2);
                        s3Var2.f2(m0Var, bundle2);
                        return;
                    } catch (RemoteException e10) {
                        e = e10;
                        bundle = bundle2;
                        j0 j0Var2 = ((c1) x2Var2.f1504d).f26889y;
                        c1.g(j0Var2);
                        j0Var2.B.d(str2, e, "Failed to get user properties; remote exception");
                        s3Var = ((c1) x2Var2.f1504d).E;
                        c1.e(s3Var);
                        s3Var.f2(m0Var, bundle);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        bundle = bundle2;
                        s3 s3Var3 = ((c1) x2Var2.f1504d).E;
                        c1.e(s3Var3);
                        s3Var3.f2(m0Var, bundle);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.B;
                synchronized (atomicReference2) {
                    try {
                        try {
                            x2Var = this.f27089y;
                            xVar2 = x2Var.f27267x;
                        } catch (RemoteException e11) {
                            j0 j0Var3 = ((c1) this.f27089y.f1504d).f26889y;
                            c1.g(j0Var3);
                            j0Var3.B.e("(legacy) Failed to get user properties; remote exception", null, this.f27085d, e11);
                            ((AtomicReference) this.B).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.B;
                        }
                        if (xVar2 == null) {
                            j0 j0Var4 = ((c1) x2Var.f1504d).f26889y;
                            c1.g(j0Var4);
                            j0Var4.B.e("(legacy) Failed to get user properties; not connected to service", null, this.f27085d, this.f27086g);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(xVar2.I(this.f27085d, this.f27086g, this.f27088x, this.f27087r));
                        } else {
                            atomicReference2.set(xVar2.g(null, this.f27085d, this.f27086g, this.f27088x));
                        }
                        x2Var.F1();
                        atomicReference = (AtomicReference) this.B;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th4) {
                        ((AtomicReference) this.B).notify();
                        throw th4;
                    }
                }
        }
    }

    public p2(x2 x2Var, AtomicReference atomicReference, String str, String str2, zzr zzrVar, boolean z10) {
        this.B = atomicReference;
        this.f27085d = str;
        this.f27086g = str2;
        this.f27087r = zzrVar;
        this.f27088x = z10;
        this.f27089y = x2Var;
    }
}
