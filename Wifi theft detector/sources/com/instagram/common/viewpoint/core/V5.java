package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import java.util.Arrays;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network/classes2.dex */
public final class V5 extends Handler {
    public static byte[] A04;
    public static String[] A05 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final String A06;
    public final Context A00;
    public final AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final X9 A03;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -12, -13, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, -31, -28, -1, -23, -28, -1, -21, -27, -7, 17, 18, 16, 29, 0, 19, 12, 2, 10, 3, 29, 9, 3, 23, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -62, -43, -47, -49, -66, -48, 21, 22, 20, 33, 21, 7, 20, 24, Flags.CD, 5, 7, 33, 21, 6, 13, 33, 24, 7, 20, 21, Flags.CD, 17, 16};
        if (A05[5].length() == 23) {
            throw new RuntimeException();
        }
        A05[5] = "AJ3";
        A04 = bArr;
    }

    static {
        A04();
        A06 = V5.class.getSimpleName();
    }

    public V5(Context context, AudienceNetworkRemoteServiceApi.MessageHandler messageHandler, AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A02 = packageVerifier;
        this.A03 = X9.A00();
        this.A01 = messageHandler;
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(72, 23, 92), A03(0, 6, 92));
        bundle.putString(A03(54, 18, 23), new JSONObject().toString());
        return bundle;
    }

    private C1928id A01(C1924iY c1924iY, String str) {
        C1928id c1928id = new C1928id(c1924iY, this.A03, str);
        c1928id.A0G(c1924iY.A0B(), c1924iY.A07());
        return c1928id;
    }

    private C1925iZ A02(C1909iI c1909iI, String str) {
        C1925iZ c1925iZ = new C1925iZ(c1909iI, this.A03, str);
        c1925iZ.A0J(c1909iI.A05, c1909iI.A02, c1909iI.A08);
        return c1925iZ;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) throws Throwable {
        String strVerifyPackage;
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A01 != null && this.A01.handleMessage(msg)) {
                return;
            }
            Messenger messenger = msg.replyTo;
            if (msg.what == 1) {
                if (messenger != null) {
                    X9.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String callingAppPackage = msg.getData().getString(A03(27, 13, 58));
            if (callingAppPackage == null) {
                return;
            }
            C1814gi c1814giA05 = C1187Rp.A05(this.A00, callingAppPackage);
            c1814giA05.A0F().AJS(msg.getData().getBoolean(A03(6, 21, 22), false));
            if (this.A02 != null) {
                strVerifyPackage = this.A02.verifyPackage(this.A00, msg, msg.getData().getString(A03(40, 14, 88)));
            } else {
                strVerifyPackage = null;
            }
            if (strVerifyPackage == null) {
                if (messenger != null) {
                    X9.A00().A07(20, callingAppPackage, null, messenger);
                }
                c1814giA05.A0F().AHv();
                return;
            }
            switch (msg.what) {
                case TTAdConstant.IMAGE_MODE_1010 /* 1010 */:
                    if (messenger == null) {
                        return;
                    }
                    V2 v2A04 = X9.A00().A04(callingAppPackage);
                    if (v2A04 == null) {
                        v2A04 = X9.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C1924iY intAdModel = OX.A04(c1814giA05, msg.getData(), strVerifyPackage);
                    if (v2A04.A00 == null) {
                        v2A04.A00 = A01(intAdModel, callingAppPackage);
                    } else if (v2A04.A00 instanceof C1928id) {
                        ((C1928id) v2A04.A00).A0G(intAdModel.A0B(), intAdModel.A07());
                    }
                    X9.A00().A07(TTAdConstant.IMAGE_MODE_1011, callingAppPackage, A00(), messenger);
                    return;
                case TTAdConstant.IMAGE_MODE_1012 /* 1012 */:
                case 2002:
                    X9.A00().A08(callingAppPackage);
                    return;
                case 2000:
                    if (messenger == null) {
                        return;
                    }
                    V2 v2A042 = X9.A00().A04(callingAppPackage);
                    if (v2A042 == null) {
                        v2A042 = X9.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C1909iI c1909iIA05 = OX.A05(c1814giA05, msg.getData(), strVerifyPackage);
                    if (v2A042.A00 == null) {
                        v2A042.A00 = A02(c1909iIA05, callingAppPackage);
                    } else if (v2A042.A00 instanceof C1925iZ) {
                        C1925iZ c1925iZ = (C1925iZ) v2A042.A00;
                        String adId = c1909iIA05.A05;
                        c1925iZ.A0J(adId, c1909iIA05.A02, c1909iIA05.A08);
                    }
                    X9.A00().A07(2001, callingAppPackage, A00(), messenger);
                    return;
                case 2003:
                    OG ogA03 = X9.A00().A03(callingAppPackage);
                    if (ogA03 instanceof C1925iZ) {
                        RewardData rewardDataA01 = OY.A01(msg.getData());
                        C1925iZ c1925iZ2 = (C1925iZ) ogA03;
                        if (rewardDataA01 != null) {
                            c1925iZ2.A0I(rewardDataA01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (A05[5].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "nIV8RMn07Ah5";
            strArr[1] = "ZacTvu5dUvRq7FGBf";
            WU.A00(th, this);
        }
    }
}
