package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C7;

/* renamed from: q2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2843t extends B7 implements InterfaceC2809b0 {

    /* renamed from: a, reason: collision with root package name */
    public final j2.u f23272a;

    public BinderC2843t(j2.u uVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f23272a = uVar;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
            C7.f(parcel);
            L1(c2852x0);
        } else if (i == 2) {
            s();
        } else if (i == 3) {
            m();
        } else if (i == 4) {
            b();
        } else {
            if (i != 5) {
                return false;
            }
            d();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.InterfaceC2809b0
    public final void L1(C2852x0 c2852x0) {
        j2.u uVar = this.f23272a;
        if (uVar != null) {
            uVar.d(c2852x0.a());
        }
    }

    @Override // q2.InterfaceC2809b0
    public final void b() {
        j2.u uVar = this.f23272a;
        if (uVar != null) {
            uVar.e();
        }
    }

    @Override // q2.InterfaceC2809b0
    public final void d() {
        j2.u uVar = this.f23272a;
        if (uVar != null) {
            uVar.a();
        }
    }

    @Override // q2.InterfaceC2809b0
    public final void m() {
        j2.u uVar = this.f23272a;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // q2.InterfaceC2809b0
    public final void s() {
        j2.u uVar = this.f23272a;
        if (uVar != null) {
            uVar.g();
        }
    }
}
