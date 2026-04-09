package b3;

import K2.g;
import K2.h;
import M2.AbstractC0168h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import q2.C2834o;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331a extends AbstractC0168h implements K2.c {

    /* renamed from: A, reason: collision with root package name */
    public final C2834o f5719A;

    /* renamed from: B, reason: collision with root package name */
    public final Bundle f5720B;

    /* renamed from: C, reason: collision with root package name */
    public final Integer f5721C;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f5722z;

    public C0331a(Context context, Looper looper, C2834o c2834o, Bundle bundle, g gVar, h hVar) {
        super(context, looper, 44, c2834o, gVar, hVar);
        this.f5722z = true;
        this.f5719A = c2834o;
        this.f5720B = bundle;
        this.f5721C = (Integer) c2834o.f23257g;
    }

    @Override // M2.AbstractC0165e, K2.c
    public final int j() {
        return 12451000;
    }

    @Override // M2.AbstractC0165e, K2.c
    public final boolean m() {
        return this.f5722z;
    }

    @Override // M2.AbstractC0165e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C0333c ? (C0333c) iInterfaceQueryLocalInterface : new C0333c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // M2.AbstractC0165e
    public final Bundle r() {
        C2834o c2834o = this.f5719A;
        boolean zEquals = this.f2735c.getPackageName().equals((String) c2834o.f23254d);
        Bundle bundle = this.f5720B;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c2834o.f23254d);
        }
        return bundle;
    }

    @Override // M2.AbstractC0165e
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // M2.AbstractC0165e
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
