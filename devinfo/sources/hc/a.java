package hc;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ob.g;
import pb.h;
import va.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends h implements ob.c {
    public final o A;
    public final Bundle B;
    public final Integer C;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f25042z;

    public a(Context context, Looper looper, o oVar, Bundle bundle, g gVar, ob.h hVar) {
        super(context, looper, 44, oVar, gVar, hVar);
        this.f25042z = true;
        this.A = oVar;
        this.B = bundle;
        this.C = (Integer) oVar.g;
    }

    @Override // pb.e
    public final int j() {
        return 12451000;
    }

    @Override // pb.e, ob.c
    public final boolean m() {
        return this.f25042z;
    }

    @Override // pb.e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 4);
    }

    @Override // pb.e
    public final Bundle r() {
        o oVar = this.A;
        boolean zEquals = this.f31569c.getPackageName().equals((String) oVar.f36148d);
        Bundle bundle = this.B;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) oVar.f36148d);
        }
        return bundle;
    }

    @Override // pb.e
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // pb.e
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
