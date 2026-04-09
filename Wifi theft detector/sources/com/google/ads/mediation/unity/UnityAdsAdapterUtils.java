package com.google.ads.mediation.unity;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.UnityBannerSize;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class UnityAdsAdapterUtils {

    public enum AdEvent {
        LOADED,
        OPENED,
        CLICKED,
        CLOSED,
        LEFT_APPLICATION,
        IMPRESSION,
        VIDEO_START,
        REWARD,
        VIDEO_COMPLETE
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9578a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9579b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f9580c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f9581d;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            f9581d = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9581d[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9581d[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9581d[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9581d[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9581d[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9581d[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9581d[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            f9580c = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9580c[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9580c[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9580c[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9580c[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[UnityAds.UnityAdsInitializationError.values().length];
            f9579b = iArr3;
            try {
                iArr3[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9579b[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9579b[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr4 = new int[BannerErrorCode.values().length];
            f9578a = iArr4;
            try {
                iArr4[BannerErrorCode.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9578a[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f9578a[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9578a[BannerErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    public static AdError b(int i10, String str) {
        return new AdError(i10, str, "com.unity3d.ads");
    }

    public static AdError c(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        return b(g(unityAdsInitializationError), str);
    }

    public static AdError d(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        return b(h(unityAdsLoadError), str);
    }

    public static AdError e(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        return b(i(unityAdsShowError), str);
    }

    public static AdFormat f(RtbSignalData rtbSignalData) {
        Iterator<MediationConfiguration> it = rtbSignalData.getConfigurations().iterator();
        if (it.hasNext()) {
            return it.next().getFormat();
        }
        return null;
    }

    public static int g(UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        int i10 = a.f9579b[unityAdsInitializationError.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? 300 : 303 : Sdk$SDKError.Reason.INVALID_IFA_STATUS_VALUE : Sdk$SDKError.Reason.MRAID_ERROR_VALUE;
    }

    public static int h(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i10 = a.f9580c[unityAdsLoadError.ordinal()];
        if (i10 == 1) {
            return TTAdConstant.MATE_IS_NULL_CODE;
        }
        if (i10 == 2) {
            return TTAdConstant.AD_ID_IS_NULL_CODE;
        }
        if (i10 == 3) {
            return TTAdConstant.DEEPLINK_UNAVAILABLE_CODE;
        }
        if (i10 == 4) {
            return TTAdConstant.DEEPLINK_FALLBACK_CODE;
        }
        if (i10 != 5) {
            return 400;
        }
        return TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE;
    }

    public static int i(UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (a.f9581d[unityAdsShowError.ordinal()]) {
            case 1:
                return PglCryptUtils.LOAD_SO_FAILED;
            case 2:
                return PglCryptUtils.INPUT_INVALID;
            case 3:
                return PglCryptUtils.COMPRESS_FAILED;
            case 4:
                return PglCryptUtils.BASE64_FAILED;
            case 5:
                return PglCryptUtils.ENCRYPT_FAILED;
            case 6:
                return PglCryptUtils.DECRYPT_FAILED;
            case 7:
                return PglCryptUtils.UNKNOWN_ERR;
            case 8:
                return 508;
            default:
                return 500;
        }
    }

    public static int j(BannerErrorInfo bannerErrorInfo) {
        int i10 = a.f9578a[bannerErrorInfo.errorCode.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? i10 != 3 ? i10 != 4 ? 200 : 204 : Sdk$SDKError.Reason.AD_IS_LOADING_VALUE : Sdk$SDKError.Reason.AD_CONSUMED_VALUE;
        }
        return 201;
    }

    public static UnityBannerSize k(Context context, AdSize adSize, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdSize.BANNER);
        arrayList.add(AdSize.LEADERBOARD);
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize != null) {
            return new UnityBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight());
        }
        if (z10) {
            return new UnityBannerSize(adSize.getWidth(), adSize.getHeight());
        }
        return null;
    }

    public static void l(int i10, Context context) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        MetaData metaData = new MetaData(context);
        if (i10 == 0) {
            metaData.set("user.nonbehavioral", Boolean.FALSE);
        } else {
            metaData.set("user.nonbehavioral", Boolean.TRUE);
        }
        metaData.commit();
    }
}
