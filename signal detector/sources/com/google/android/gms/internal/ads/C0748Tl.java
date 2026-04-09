package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Tl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748Tl implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11439a;

    public /* synthetic */ C0748Tl(int i) {
        this.f11439a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f11439a) {
            case 0:
                return B8.AD_LOADER;
            case 1:
                return "native";
            case 2:
                return null;
            case 3:
                return new C2144xr();
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return new C1709pn();
            case 8:
                return new C0478Dn();
            case 9:
                return new C0546Hn();
            case 10:
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C0597Kn(c0623Mf);
            case 11:
                return new C0631Mn(11, 12, 1007);
            case 12:
                return new C0631Mn(19, 20, 1008);
            case 13:
                return new C0631Mn(13, 14, 1004);
            case 14:
                return new C0631Mn(BackupConstant.SCENE_RENDER_FAIL, BackupConstant.SCENE_BACKUP_RENDER_FAIL, BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
            case 15:
                return new C0631Mn(15, 16, 1005);
            case 16:
                return new C0631Mn(17, 18, 1006);
            case 17:
                return new C0818Xn(Ku.SIGNALS, "ttc");
            case 18:
                return new C0818Xn(Ku.PRELOADED_LOADER, "t_load_as");
            case 19:
                return new C1280ho();
            case 20:
                return new C2141xo();
            case 21:
                C2911G c2911g = p2.j.f22785C.f22790c;
                String string = UUID.randomUUID().toString();
                Cr.v(string);
                return string;
            case 22:
                return new C0514Fp();
            case 23:
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                return new C1605nr(c0623Mf2);
            case 24:
                return new C2198yr();
            case 25:
                return new Vr();
            case 26:
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf3);
                return new C1606ns(c0623Mf3, 0);
            case 27:
                Object arrayList = new ArrayList();
                E9 e9 = H9.Wc;
                C2841s c2841s = C2841s.f23267e;
                if (!((String) c2841s.f23270c.a(e9)).isEmpty()) {
                    arrayList = Arrays.asList(((String) c2841s.f23270c.a(e9)).split(","));
                }
                Cr.v(arrayList);
                return arrayList;
            case 28:
                C0623Mf c0623Mf4 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf4);
                return new C1606ns(c0623Mf4, 1);
            default:
                C0623Mf c0623Mf5 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf5);
                return new C1606ns(c0623Mf5, 2);
        }
    }
}
