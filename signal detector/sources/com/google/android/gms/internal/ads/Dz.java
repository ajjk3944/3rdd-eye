package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import f4.InterfaceFutureC2326a;

/* loaded from: classes.dex */
public final /* synthetic */ class Dz implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gz f7862b;

    public /* synthetic */ Dz(Gz gz, int i) {
        this.f7861a = i;
        this.f7862b = gz;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final /* synthetic */ InterfaceFutureC2326a b(Object obj) {
        switch (this.f7861a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Gz gz = this.f7862b;
                if (zBooleanValue) {
                    return gz.b(0);
                }
                gz.f8492d.b(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
                return AbstractC1984ut.e(Fz.f8244b);
            default:
                Jy jy = (Jy) obj;
                Vz vz = this.f7862b.f8491c;
                if (jy.H() == 2) {
                    return vz.e(jy.A(), jy.B().u());
                }
                if (jy.H() == 3) {
                    return vz.d(jy.A(), jy.C().u(), jy.B().u());
                }
                throw new AssertionError("Unreachable");
        }
    }
}
