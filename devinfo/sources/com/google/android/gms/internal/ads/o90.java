package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o90 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14614a;

    public /* synthetic */ o90(int i4) {
        this.f14614a = i4;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f14614a) {
            case 0:
                return mi.AD_LOADER;
            case 1:
                return "native";
            case 2:
                return null;
            case 3:
                return new vk0();
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return new lc0();
            case 8:
                return new zc0();
            case 9:
                return new dd0();
            case 10:
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new gd0(exVar);
            case 11:
                return new id0(11, 12, 1007);
            case 12:
                return new id0(19, 20, 1008);
            case 13:
                return new id0(13, 14, TTAdConstant.IMAGE_MODE_CAROUSEL_IMG);
            case 14:
                return new id0(1001, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 1003);
            case 15:
                return new id0(15, 16, WebSocketProtocol.CLOSE_NO_STATUS_CODE);
            case 16:
                return new id0(17, 18, 1006);
            case 17:
                return new sd0(qr0.SIGNALS, "ttc");
            case 18:
                return new sd0(qr0.PRELOADED_LOADER, "t_load_as");
            case 19:
                return new be0();
            case 20:
                return new se0();
            case 21:
                ya.f0 f0Var = ua.j.C.f35261c;
                String string = UUID.randomUUID().toString();
                al0.z(string);
                return string;
            case 22:
                return new eh0();
            case 23:
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                return new kk0(exVar2);
            case 24:
                return new wk0();
            case 25:
                return new ul0();
            case 26:
                ex exVar3 = fx.f11274a;
                al0.z(exVar3);
                return new nm0(exVar3, 0);
            case 27:
                Object arrayList = new ArrayList();
                pk pkVar = sk.Yc;
                va.s sVar = va.s.f36163e;
                if (!((String) sVar.f36166c.a(pkVar)).isEmpty()) {
                    arrayList = Arrays.asList(((String) sVar.f36166c.a(pkVar)).split(","));
                }
                al0.z(arrayList);
                return arrayList;
            case 28:
                ex exVar4 = fx.f11274a;
                al0.z(exVar4);
                return new nm0(exVar4, 1);
            default:
                ex exVar5 = fx.f11274a;
                al0.z(exVar5);
                return new nm0(exVar5, 2);
        }
    }
}
