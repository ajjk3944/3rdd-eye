package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class J5 implements InterfaceC1260hL {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9256a;

    /* renamed from: b, reason: collision with root package name */
    public static final J5 f9232b = new J5(0);

    /* renamed from: c, reason: collision with root package name */
    public static final J5 f9233c = new J5(1);

    /* renamed from: d, reason: collision with root package name */
    public static final J5 f9234d = new J5(2);

    /* renamed from: e, reason: collision with root package name */
    public static final J5 f9235e = new J5(3);

    /* renamed from: f, reason: collision with root package name */
    public static final J5 f9236f = new J5(4);

    /* renamed from: g, reason: collision with root package name */
    public static final J5 f9237g = new J5(5);

    /* renamed from: h, reason: collision with root package name */
    public static final J5 f9238h = new J5(6);
    public static final J5 i = new J5(7);

    /* renamed from: j, reason: collision with root package name */
    public static final J5 f9239j = new J5(8);

    /* renamed from: k, reason: collision with root package name */
    public static final J5 f9240k = new J5(9);

    /* renamed from: l, reason: collision with root package name */
    public static final J5 f9241l = new J5(10);

    /* renamed from: m, reason: collision with root package name */
    public static final J5 f9242m = new J5(11);

    /* renamed from: n, reason: collision with root package name */
    public static final J5 f9243n = new J5(12);

    /* renamed from: o, reason: collision with root package name */
    public static final J5 f9244o = new J5(13);

    /* renamed from: p, reason: collision with root package name */
    public static final J5 f9245p = new J5(14);

    /* renamed from: q, reason: collision with root package name */
    public static final J5 f9246q = new J5(15);

    /* renamed from: r, reason: collision with root package name */
    public static final J5 f9247r = new J5(16);

    /* renamed from: s, reason: collision with root package name */
    public static final J5 f9248s = new J5(17);

    /* renamed from: t, reason: collision with root package name */
    public static final J5 f9249t = new J5(18);

    /* renamed from: u, reason: collision with root package name */
    public static final J5 f9250u = new J5(19);

    /* renamed from: v, reason: collision with root package name */
    public static final J5 f9251v = new J5(20);

    /* renamed from: w, reason: collision with root package name */
    public static final J5 f9252w = new J5(21);

    /* renamed from: x, reason: collision with root package name */
    public static final J5 f9253x = new J5(22);

    /* renamed from: y, reason: collision with root package name */
    public static final J5 f9254y = new J5(23);

    /* renamed from: z, reason: collision with root package name */
    public static final J5 f9255z = new J5(24);

    /* renamed from: A, reason: collision with root package name */
    public static final J5 f9227A = new J5(25);

    /* renamed from: B, reason: collision with root package name */
    public static final J5 f9228B = new J5(26);

    /* renamed from: C, reason: collision with root package name */
    public static final J5 f9229C = new J5(27);

    /* renamed from: D, reason: collision with root package name */
    public static final J5 f9230D = new J5(28);

    /* renamed from: E, reason: collision with root package name */
    public static final J5 f9231E = new J5(29);

    public /* synthetic */ J5(int i3) {
        this.f9256a = i3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1260hL
    public final boolean a(int i3) {
        B8 b8;
        EnumC1570n9 enumC1570n9;
        switch (this.f9256a) {
            case 0:
                if (i3 == 0 || i3 == 1 || i3 == 2) {
                }
                break;
            case 1:
                if (i3 == 0 || i3 == 1 || i3 == 2) {
                }
                break;
            case 2:
                switch (i3) {
                }
            case 3:
                if (i3 == 0 || i3 == 1 || i3 == 2) {
                }
                break;
            case 4:
                switch (i3) {
                }
            case 5:
                switch (i3) {
                }
            case 6:
                if (i3 == 0 || i3 == 1) {
                }
                break;
            case 7:
                if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                }
                break;
            case 8:
                if (AbstractC0933bL.k(i3) != 0) {
                }
                break;
            case 9:
                switch (i3) {
                }
            case 10:
                switch (i3) {
                }
            case 11:
                if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 1000) {
                }
                break;
            case 12:
                if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                }
                break;
            case 13:
                if (EnumC1945u7.b(i3) != null) {
                }
                break;
            case 14:
                switch (i3) {
                    case 0:
                        b8 = B8.AD_INITIATER_UNSPECIFIED;
                        break;
                    case 1:
                        b8 = B8.BANNER;
                        break;
                    case 2:
                        b8 = B8.DFP_BANNER;
                        break;
                    case 3:
                        b8 = B8.INTERSTITIAL;
                        break;
                    case 4:
                        b8 = B8.DFP_INTERSTITIAL;
                        break;
                    case 5:
                        b8 = B8.NATIVE_EXPRESS;
                        break;
                    case 6:
                        b8 = B8.AD_LOADER;
                        break;
                    case 7:
                        b8 = B8.REWARD_BASED_VIDEO_AD;
                        break;
                    case 8:
                        b8 = B8.BANNER_SEARCH_ADS;
                        break;
                    case 9:
                        b8 = B8.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                        break;
                    case 10:
                        b8 = B8.APP_OPEN;
                        break;
                    case 11:
                        b8 = B8.REWARDED_INTERSTITIAL;
                        break;
                    default:
                        b8 = null;
                        break;
                }
                if (b8 != null) {
                }
                break;
            case 15:
                if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 4) {
                }
                break;
            case 16:
                if (i3 == 0 || i3 == 1 || i3 == 2) {
                }
                break;
            case 17:
                if ((i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? null : K8.SUSPENDED : K8.DISCONNECTED : K8.DISCONNECTING : K8.CONNECTED : K8.CONNECTING : K8.UNSPECIFIED) != null) {
                }
                break;
            case 18:
                if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3) {
                }
                break;
            case 19:
                if (i3 == 0 || i3 == 1) {
                }
                break;
            case 20:
                switch (i3) {
                    case 0:
                        enumC1570n9 = EnumC1570n9.AD_FORMAT_TYPE_UNSPECIFIED;
                        break;
                    case 1:
                        enumC1570n9 = EnumC1570n9.BANNER;
                        break;
                    case 2:
                        enumC1570n9 = EnumC1570n9.INTERSTITIAL;
                        break;
                    case 3:
                        enumC1570n9 = EnumC1570n9.NATIVE_EXPRESS;
                        break;
                    case 4:
                        enumC1570n9 = EnumC1570n9.NATIVE_CONTENT;
                        break;
                    case 5:
                        enumC1570n9 = EnumC1570n9.NATIVE_APP_INSTALL;
                        break;
                    case 6:
                        enumC1570n9 = EnumC1570n9.NATIVE_CUSTOM_TEMPLATE;
                        break;
                    case 7:
                        enumC1570n9 = EnumC1570n9.DFP_BANNER;
                        break;
                    case 8:
                        enumC1570n9 = EnumC1570n9.DFP_INTERSTITIAL;
                        break;
                    case 9:
                        enumC1570n9 = EnumC1570n9.REWARD_BASED_VIDEO_AD;
                        break;
                    case 10:
                        enumC1570n9 = EnumC1570n9.BANNER_SEARCH_ADS;
                        break;
                    default:
                        enumC1570n9 = null;
                        break;
                }
                if (enumC1570n9 != null) {
                }
                break;
            case 21:
                if (i3 == 0 || i3 == 1 || i3 == 2) {
                }
                break;
            case 22:
                if (i3 == 0 || i3 == 1 || i3 == 1000) {
                }
                break;
            case 23:
                if (i3 == 1 || i3 == 2) {
                }
                break;
            case 24:
                if (i3 == 0 || i3 == 1) {
                }
                break;
            case 25:
                if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3) {
                }
                break;
            case 26:
                if (C1476lN.b(i3) != 0) {
                }
                break;
            case 27:
                if (i3 != 0 && i3 != 1 && i3 != 2 && i3 != 1999) {
                    switch (i3) {
                    }
                }
                break;
            case 28:
                if (i3 == 0 || i3 == 1) {
                }
                break;
            default:
                if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3) {
                }
                break;
        }
        return true;
    }
}
