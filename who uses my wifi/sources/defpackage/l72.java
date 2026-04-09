package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l72 implements ad0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ z62 g;
    public final /* synthetic */ m72 h;

    public /* synthetic */ l72(m72 m72Var, z62 z62Var, int i) {
        this.f = i;
        this.g = z62Var;
        this.h = m72Var;
    }

    @Override // defpackage.ad0
    public final void C(r2 r2Var) {
        switch (this.f) {
            case 0:
                try {
                    String canonicalName = this.h.f.getClass().getCanonicalName();
                    int i = r2Var.g;
                    String str = (String) r2Var.h;
                    String str2 = (String) r2Var.i;
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb.append(canonicalName);
                    sb.append("failed to load mediation ad: ErrorCode = ");
                    sb.append(i);
                    sb.append(". ErrorMessage = ");
                    sb.append(str);
                    sb.append(". ErrorDomain = ");
                    sb.append(str2);
                    gi2.U(sb.toString());
                    z62 z62Var = this.g;
                    z62Var.K0(r2Var.d());
                    z62Var.w0(str, i);
                    z62Var.m0(i);
                    break;
                } catch (RemoteException e) {
                    gi2.c0("", e);
                    return;
                }
            default:
                try {
                    String canonicalName2 = this.h.f.getClass().getCanonicalName();
                    int i2 = r2Var.g;
                    String str3 = (String) r2Var.h;
                    String str4 = (String) r2Var.i;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 41 + String.valueOf(i2).length() + 17 + String.valueOf(str3).length() + 16 + String.valueOf(str4).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to load mediation ad: ErrorCode = ");
                    sb2.append(i2);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str3);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str4);
                    gi2.U(sb2.toString());
                    z62 z62Var2 = this.g;
                    z62Var2.K0(r2Var.d());
                    z62Var2.w0(str3, i2);
                    z62Var2.m0(i2);
                    break;
                } catch (RemoteException e2) {
                    gi2.c0("", e2);
                }
        }
    }
}
