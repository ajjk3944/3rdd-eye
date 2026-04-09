package va;

import android.os.Parcel;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t extends mg implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final pa.u f36169a;

    public t(pa.u uVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f36169a = uVar;
    }

    @Override // va.a1
    public final void c() {
        pa.u uVar = this.f36169a;
        if (uVar != null) {
            uVar.e();
        }
    }

    @Override // va.a1
    public final void d() {
        pa.u uVar = this.f36169a;
        if (uVar != null) {
            uVar.a();
        }
    }

    @Override // va.a1
    public final void f() {
        pa.u uVar = this.f36169a;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            w1 w1Var = (w1) ng.b(parcel, w1.CREATOR);
            ng.f(parcel);
            r1(w1Var);
        } else if (i4 == 2) {
            h();
        } else if (i4 == 3) {
            f();
        } else if (i4 == 4) {
            c();
        } else {
            if (i4 != 5) {
                return false;
            }
            d();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // va.a1
    public final void h() {
        pa.u uVar = this.f36169a;
        if (uVar != null) {
            uVar.g();
        }
    }

    @Override // va.a1
    public final void r1(w1 w1Var) {
        pa.u uVar = this.f36169a;
        if (uVar != null) {
            uVar.d(w1Var.a());
        }
    }
}
