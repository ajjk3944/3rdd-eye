package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* renamed from: com.google.android.gms.internal.ads.aP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0882aP implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Vu f13122b;

    public /* synthetic */ RunnableC0882aP(Vu vu, int i, long j6, long j7) {
        this.f13121a = 3;
        this.f13122b = vu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13121a;
        Vu vu = this.f13122b;
        vu.getClass();
        switch (i) {
            case 0:
                String str = Vt.f12096a;
                GO go = ((NN) vu.f12106b).f9997a.f11649G;
                go.t(go.y(), 1008, new DO(25));
                break;
            case 1:
                String str2 = Vt.f12096a;
                GO go2 = ((NN) vu.f12106b).f9997a.f11649G;
                go2.t(go2.y(), 1032, new ZJ(26, (byte) 0));
                break;
            case 2:
                String str3 = Vt.f12096a;
                GO go3 = ((NN) vu.f12106b).f9997a.f11649G;
                go3.t(go3.y(), TTAdConstant.IMAGE_MODE_1010, new DO(27));
                break;
            case 3:
                String str4 = Vt.f12096a;
                GO go4 = ((NN) vu.f12106b).f9997a.f11649G;
                go4.t(go4.y(), TTAdConstant.IMAGE_MODE_1011, new DO(28));
                break;
            case 4:
                String str5 = Vt.f12096a;
                GO go5 = ((NN) vu.f12106b).f9997a.f11649G;
                go5.t(go5.y(), TTAdConstant.IMAGE_MODE_1012, new DO(29));
                break;
            case 5:
                String str6 = Vt.f12096a;
                GO go6 = ((NN) vu.f12106b).f9997a.f11649G;
                go6.t(go6.y(), 1014, new ZJ(23, (byte) 0));
                break;
            case 6:
                String str7 = Vt.f12096a;
                GO go7 = ((NN) vu.f12106b).f9997a.f11649G;
                go7.t(go7.y(), 1029, new ZJ(24, (byte) 0));
                break;
            case 7:
                String str8 = Vt.f12096a;
                GO go8 = ((NN) vu.f12106b).f9997a.f11649G;
                go8.t(go8.y(), 1031, new ZJ(25, (byte) 0));
                break;
            default:
                String str9 = Vt.f12096a;
                GO go9 = ((NN) vu.f12106b).f9997a.f11649G;
                go9.t(go9.y(), 1007, new DO(18));
                break;
        }
    }

    public /* synthetic */ RunnableC0882aP(Vu vu, long j6) {
        this.f13121a = 2;
        this.f13122b = vu;
    }

    public /* synthetic */ RunnableC0882aP(Vu vu, Object obj, int i) {
        this.f13121a = i;
        this.f13122b = vu;
    }

    public /* synthetic */ RunnableC0882aP(Vu vu, String str, long j6, long j7) {
        this.f13121a = 0;
        this.f13122b = vu;
    }
}
