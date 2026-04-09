package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class ZJ implements InterfaceC0877aK, InterfaceC2121xL, ZA, InterfaceC0801Wn, InterfaceC1172fo {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ZJ f12816b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ZJ f12817c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ZJ f12818d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12819a;

    static {
        byte b5 = 0;
        f12816b = new ZJ(12, b5);
        f12817c = new ZJ(14, b5);
        f12818d = new ZJ(19, b5);
    }

    public static final InterfaceC1474lL c(long j6, Object obj) {
        InterfaceC1474lL interfaceC1474lL = (InterfaceC1474lL) WL.k(j6, obj);
        if (((GK) interfaceC1474lL).f8358a) {
            return interfaceC1474lL;
        }
        int size = interfaceC1474lL.size();
        InterfaceC1474lL interfaceC1474lLB = interfaceC1474lL.B(size == 0 ? 10 : size + size);
        WL.l(obj, j6, interfaceC1474lLB);
        return interfaceC1474lLB;
    }

    public static final C1959uL e(Object obj, Object obj2) {
        C1959uL c1959uLA = (C1959uL) obj;
        C1959uL c1959uL = (C1959uL) obj2;
        if (!c1959uL.isEmpty()) {
            if (!c1959uLA.f17114a) {
                c1959uLA = c1959uLA.a();
            }
            c1959uLA.c();
            if (!c1959uL.isEmpty()) {
                c1959uLA.putAll(c1959uL);
            }
        }
        return c1959uLA;
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public /* synthetic */ Object a() {
        return new FN();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public void mo4b(Object obj) {
        switch (this.f12819a) {
            case 13:
                ((D6) obj).r();
                break;
            case 14:
                break;
            case 15:
                int i = UN.f11644s0;
                ((D6) obj).b();
                break;
            case 16:
                ((D6) obj).e();
                break;
            case 17:
                int i3 = UN.f11644s0;
                ((D6) obj).A();
                break;
            case 18:
                int i6 = UN.f11644s0;
                ((D6) obj).l();
                break;
            case 19:
                int i7 = UN.f11644s0;
                ((D6) obj).i0(new HN(2, new J0.c("Player release timed out."), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
                break;
            case 20:
                int i8 = UN.f11644s0;
                ((D6) obj).w();
                break;
            case 21:
                int i9 = UN.f11644s0;
                ((D6) obj).f();
                break;
            case 22:
            default:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0877aK
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        switch (this.f12819a) {
            case 0:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 1:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 2:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 3:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 4:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2121xL
    public boolean k(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2121xL
    public GL m(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1172fo
    public /* synthetic */ void q(Object obj, C1264hP c1264hP) {
        ((D6) obj).a();
    }

    public /* synthetic */ ZJ(int i, byte b5) {
        this.f12819a = i;
    }
}
