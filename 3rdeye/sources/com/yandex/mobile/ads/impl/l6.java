package com.yandex.mobile.ads.impl;

import com.applovin.sdk.AppLovinMediationProvider;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l6 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f29895c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ l6[] f29896d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4463a f29897e;

    /* renamed from: b, reason: collision with root package name */
    private final String f29898b;

    public static final class a {

        /* renamed from: com.yandex.mobile.ads.impl.l6$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0412a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29899a;

            static {
                int[] iArr = new int[l6.values().length];
                try {
                    iArr[6] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    a aVar = l6.f29895c;
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    a aVar2 = l6.f29895c;
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    a aVar3 = l6.f29895c;
                    iArr[2] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    a aVar4 = l6.f29895c;
                    iArr[3] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    a aVar5 = l6.f29895c;
                    iArr[4] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    a aVar6 = l6.f29895c;
                    iArr[5] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    a aVar7 = l6.f29895c;
                    iArr[7] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    a aVar8 = l6.f29895c;
                    iArr[8] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    a aVar9 = l6.f29895c;
                    iArr[9] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    a aVar10 = l6.f29895c;
                    iArr[10] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    a aVar11 = l6.f29895c;
                    iArr[11] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    a aVar12 = l6.f29895c;
                    iArr[12] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    a aVar13 = l6.f29895c;
                    iArr[13] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    a aVar14 = l6.f29895c;
                    iArr[14] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    a aVar15 = l6.f29895c;
                    iArr[15] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                f29899a = iArr;
            }
        }

        private a() {
        }

        public static AdQualityVerifiableNetwork a(l6 l6Var) {
            switch (l6Var == null ? -1 : C0412a.f29899a[l6Var.ordinal()]) {
                case 1:
                    return AdQualityVerifiableNetwork.ADMOB;
                case 2:
                    return AdQualityVerifiableNetwork.ADCOLONY;
                case 3:
                    return AdQualityVerifiableNetwork.APPLOVIN;
                case 4:
                    return AdQualityVerifiableNetwork.APPLOVINMAX;
                case 5:
                    return AdQualityVerifiableNetwork.BIGOADS;
                case 6:
                    return AdQualityVerifiableNetwork.CHARTBOOST;
                case 7:
                    return AdQualityVerifiableNetwork.GOOGLE;
                case 8:
                    return AdQualityVerifiableNetwork.INMOBI;
                case 9:
                    return AdQualityVerifiableNetwork.IRONSOURCE;
                case 10:
                    return AdQualityVerifiableNetwork.MINTEGRAL;
                case 11:
                    return AdQualityVerifiableNetwork.MYTARGET;
                case 12:
                    return AdQualityVerifiableNetwork.PANGLE;
                case 13:
                    return AdQualityVerifiableNetwork.TAPJOY;
                case 14:
                    return AdQualityVerifiableNetwork.UNITYADS;
                case 15:
                    return AdQualityVerifiableNetwork.VUNGLE;
                case 16:
                    return AdQualityVerifiableNetwork.YANDEX;
                default:
                    return null;
            }
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        l6[] l6VarArr = {new l6(0, "ADCOLONY", "adcolony"), new l6(1, "APPLOVIN", "applovin"), new l6(2, "APPLOVINMAX", "applovin_max"), new l6(3, "BIGOADS", "bigoads"), new l6(4, "CHARTBOOST", "chartboost"), new l6(5, "GOOGLE", "admanager"), new l6(6, "ADMOB", AppLovinMediationProvider.ADMOB), new l6(7, "INMOBI", "inmobi"), new l6(8, "IRONSOURCE", AppLovinMediationProvider.IRONSOURCE), new l6(9, "MINTEGRAL", "mintegral"), new l6(10, "MYTARGET", "mytarget"), new l6(11, "PANGLE", "pangle"), new l6(12, "TAPJOY", "tapjoy"), new l6(13, "UNITYADS", "unityads"), new l6(14, "VUNGLE", "vungle"), new l6(15, "YANDEX", "yandex")};
        f29896d = l6VarArr;
        f29897e = com.google.gson.internal.c.l(l6VarArr);
        f29895c = new a(0);
    }

    private l6(int i, String str, String str2) {
        this.f29898b = str2;
    }

    public static InterfaceC4463a<l6> a() {
        return f29897e;
    }

    public static l6 valueOf(String str) {
        return (l6) Enum.valueOf(l6.class, str);
    }

    public static l6[] values() {
        return (l6[]) f29896d.clone();
    }

    public final String b() {
        return this.f29898b;
    }
}
