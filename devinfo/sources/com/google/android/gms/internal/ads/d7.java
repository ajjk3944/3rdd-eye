package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.liuzh.deviceinfo.DeviceInfoApp;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class d7 {
    public static /* synthetic */ String A(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? "null" : "VIDEO" : "NATIVE_DISPLAY" : "HTML_DISPLAY";
    }

    public static boolean B(int i4, boolean z3) {
        int i10 = i4 & 7;
        if (i10 != 4) {
            return z3 && i10 == 3;
        }
        return true;
    }

    public static yr0 C(int i4, Context context) {
        boolean zBooleanValue;
        if (cs0.a()) {
            int i10 = i4 - 2;
            if (i10 == 20 || i10 == 21) {
                zBooleanValue = ((Boolean) ol.f14726e.u()).booleanValue();
            } else if (i10 != 110) {
                switch (i10) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) ol.f14724c.u()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) ol.f14725d.u()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) ol.f14723b.u()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.f16094da)).booleanValue();
            }
            if (zBooleanValue) {
                return new zr0(context, i4);
            }
        }
        return new os0();
    }

    public static yr0 D(Context context, int i4, int i10, va.z2 z2Var) {
        boolean zMatches;
        yr0 yr0VarC = C(i4, context);
        if (yr0VarC instanceof zr0) {
            zr0 zr0Var = (zr0) yr0VarC;
            zr0Var.d();
            zr0Var.l(i10);
            zr0Var.K1(u6.t.z(z2Var.f36198m));
            String str = z2Var.f36201p;
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) va.s.f36163e.f36166c.a(sk.V9), str);
            }
            if (zMatches) {
                zr0Var.k(str);
            }
        }
        return yr0VarC;
    }

    public static com.google.android.gms.internal.measurement.n E(com.google.android.gms.internal.measurement.j jVar, com.google.android.gms.internal.measurement.q qVar, a0.x0 x0Var, ArrayList arrayList) {
        String str = qVar.f19867a;
        if (jVar.j(str)) {
            com.google.android.gms.internal.measurement.n nVarG = jVar.g(str);
            if (nVarG instanceof com.google.android.gms.internal.measurement.h) {
                return ((com.google.android.gms.internal.measurement.h) nVarG).b(x0Var, arrayList);
            }
            throw new IllegalArgumentException(d.h.s(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(je.u.t("Object has no function ", str));
        }
        com.bumptech.glide.c.v(1, arrayList, "hasOwnProperty");
        return jVar.j(((com.google.android.gms.internal.measurement.t) x0Var.f145b).c(x0Var, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).zzc()) ? com.google.android.gms.internal.measurement.n.O8 : com.google.android.gms.internal.measurement.n.P8;
    }

    public static void a(wp wpVar, String str, String str2) {
        wpVar.g(a0.g.p(new StringBuilder(r5.c.f(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    public static void b(wp wpVar, JSONObject jSONObject) {
        StringBuilder sbA = d.h.A("(window.AFMA_ReceiveMessage || function() {})('openIntentAsync',", jSONObject.toString(), ");");
        za.i.c("Dispatching AFMA event: ".concat(sbA.toString()));
        wpVar.g(sbA.toString());
    }

    public static int c(int i4) {
        switch (i4) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i4) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static int d(int i4) {
        if (i4 == 90) {
            return 81;
        }
        if (i4 == 91) {
            return 82;
        }
        if (i4 == 93) {
            return 84;
        }
        if (i4 == 94) {
            return 85;
        }
        switch (i4) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                return 37;
            case 37:
                return 38;
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                return 39;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                return 40;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                return 41;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                return 42;
            case 42:
                return 43;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                return 44;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i4) {
                    case 96:
                        return 87;
                    case 97:
                        return 88;
                    case 98:
                        return 89;
                    case 99:
                        return 90;
                    case 100:
                        return 91;
                    case 101:
                        return 92;
                    case FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH /* 102 */:
                        return 83;
                    case FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT /* 103 */:
                        return 86;
                    case 104:
                        return 93;
                    case 105:
                        return 94;
                    case 106:
                        return 95;
                    case FacebookMediationAdapter.ERROR_NULL_CONTEXT /* 107 */:
                        return 96;
                    case 108:
                        return 97;
                    case FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD /* 109 */:
                        return 98;
                    case 110:
                        return 99;
                    case FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION /* 111 */:
                        return 100;
                    case AppLovinMediationAdapter.ERROR_CHILD_USER /* 112 */:
                        return 101;
                    case AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID /* 113 */:
                        return FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
                    case 114:
                        return FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT;
                    case 115:
                        return 104;
                    case 116:
                        return 105;
                    case 117:
                        return 106;
                    case 118:
                        return FacebookMediationAdapter.ERROR_NULL_CONTEXT;
                    case 119:
                        return 108;
                    case 120:
                        return FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD;
                    case 121:
                        return 110;
                    case 122:
                        return FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION;
                    case 123:
                        return AppLovinMediationAdapter.ERROR_CHILD_USER;
                    case 124:
                        return AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID;
                    case 125:
                        return 114;
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                        return 117;
                    case 127:
                        return 119;
                    case 128:
                        return 120;
                    case 129:
                        return 121;
                    case 130:
                        return 122;
                    case 131:
                        return 123;
                    case 132:
                        return 124;
                    case 133:
                        return 125;
                    case 134:
                        return WebSocketProtocol.PAYLOAD_SHORT;
                    case 135:
                        return 127;
                    case 136:
                        return 128;
                    case 137:
                        return 129;
                    case 138:
                        return 130;
                    case 139:
                        return 131;
                    case 140:
                        return 132;
                    case 141:
                        return 133;
                    case 142:
                        return 134;
                    case 143:
                        return 135;
                    case 144:
                        return 136;
                    case 145:
                        return 115;
                    case 146:
                        return 116;
                    case 147:
                        return 118;
                    case 148:
                        return 137;
                    case 149:
                        return 138;
                    default:
                        return 0;
                }
        }
    }

    public static boolean e(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z3 = false;
            boolean z10 = false;
            int i4 = 0;
            boolean z11 = true;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                com.liuzh.deviceinfo.utilities.p pVar = (com.liuzh.deviceinfo.utilities.p) obj;
                if ("/dev/root".equalsIgnoreCase(pVar.f21287a) && "/".equalsIgnoreCase(pVar.f21288b)) {
                    z3 = true;
                }
                if ("/system_root".equalsIgnoreCase(pVar.f21288b) && "tmpfs".equalsIgnoreCase(pVar.f21289c)) {
                    z10 = true;
                }
                if ("/system".equalsIgnoreCase(pVar.f21288b) && !"tmpfs".equalsIgnoreCase(pVar.f21289c) && !"none".equalsIgnoreCase(pVar.f21287a)) {
                    z11 = false;
                }
            }
            if (z3 || z11 || z10) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String f(int i4) {
        switch (i4) {
            case 1:
                return "api-call";
            case 2:
                return "dynamite-enter";
            case 3:
                return "read-from-disk-start";
            case 4:
                return "read-from-disk-end";
            case 5:
                return "client-signals-start";
            case 6:
                return "client-signals-end";
            case 7:
                return "service-connected";
            case 8:
                return "gms-signals-start";
            case 9:
                return "gms-signals-end";
            case 10:
                return "get-signals-sdkcore-start";
            case 11:
                return "get-signals-sdkcore-end";
            case 12:
                return "get-ad-dictionary-sdkcore-start";
            case 13:
                return "get-ad-dictionary-sdkcore-end";
            case 14:
                return "http-response-ready";
            case 15:
                return "scar-preloader-ready";
            case 16:
                return "scar-preloader-processing-done";
            case 17:
                return "normalize-ad-response-start";
            case 18:
                return "normalize-ad-response-end";
            case 19:
                return "binder-call-start";
            case 20:
                return "server-response-parse-start";
            case 21:
                return "rendering-start";
            case 22:
                return "public-api-callback";
            case 23:
                return "rendering-native-ads-native-js-webview-start";
            case 24:
                return "rendering-native-ads-preprocess-start";
            case 25:
                return "rendering-native-ads-preprocess-end";
            case 26:
                return "rendering-native-assets-loading-start";
            case 27:
                return "rendering-native-assets-loading-end";
            case 28:
                return "rendering-webview-creation-start";
            case 29:
                return "rendering-webview-creation-end";
            case 30:
                return "rendering-ad-component-creation-end";
            case 31:
                return "rendering-configure-webview-start";
            case 32:
                return "rendering-configure-webview-end";
            case 33:
                return "rendering-webview-load-html-start";
            case 34:
                return "rendering-webview-load-html-end";
            case 35:
                return "type2-fetch-start";
            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                return "type2-fetch-end";
            case 37:
                return "sod-validation-start";
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                return "sod-validation-end";
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                return "sod-cache-key-start";
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                return "sod-cache-key-end";
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                return "sod-read-and-remove-start";
            case 42:
                return "sod-read-and-remove-end";
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                return "sod-decode-start";
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                return "sod-decode-end";
            case 45:
                return "native-assets-loading-basic-start";
            case 46:
                return "native-assets-loading-basic-end";
            case 47:
                return "native-assets-loading-image-start";
            case 48:
                return "native-assets-loading-image-end";
            case 49:
                return "native-assets-loading-image-composition-start";
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                return "native-assets-loading-image-composition-end";
            case 51:
                return "native-assets-loading-logo-start";
            case 52:
                return "native-assets-loading-logo-end";
            case 53:
                return "native-assets-loading-icon-start";
            case 54:
                return "native-assets-loading-icon-end";
            case 55:
                return "native-assets-loading-attribution-start";
            case 56:
                return "native-assets-loading-attribution-end";
            case 57:
                return "native-assets-loading-video-start";
            case 58:
                return "native-assets-loading-video-end";
            case 59:
                return "native-assets-loading-video-composition-start";
            case 60:
                return "native-assets-loading-media-start";
            case 61:
                return "native-assets-loading-media-end";
            case 62:
                return "native-assets-loading-custom-start";
            case 63:
                return "native-assets-loading-custom-end";
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                return "native-assets-loading-omid-start";
            case 65:
                return "native-assets-loading-omid-end";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int g(int i4) {
        switch (i4) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                return 35;
            case 37:
                return 36;
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                return 37;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                return 38;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                return 39;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                return 40;
            case 42:
                return 41;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                return 42;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 48;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                return 49;
            case 51:
                return 50;
            case 52:
                return 51;
            case 53:
                return 52;
            case 54:
                return 53;
            case 55:
                return 54;
            case 56:
                return 55;
            case 57:
                return 56;
            case 58:
                return 57;
            case 59:
                return 58;
            case 60:
                return 59;
            case 61:
                return 60;
            case 62:
                return 61;
            case 63:
                return 62;
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                return 63;
            case 65:
                return 64;
            case 66:
                return 65;
            case 67:
                return 66;
            case 68:
                return 67;
            case 69:
                return 68;
            case 70:
                return 69;
            case 71:
                return 70;
            case 72:
                return 71;
            case 73:
                return 72;
            case 74:
                return 73;
            case 75:
                return 74;
            case 76:
                return 75;
            case 77:
                return 76;
            case 78:
                return 77;
            case 79:
                return 78;
            case 80:
                return 79;
            case 81:
                return 90;
            case 82:
                return 91;
            case 83:
                return FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
            case 84:
                return 93;
            case 85:
                return 94;
            case 86:
                return FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT;
            case 87:
                return 96;
            case 88:
                return 97;
            case 89:
                return 98;
            case 90:
                return 99;
            case 91:
                return 100;
            case 92:
                return 101;
            case 93:
                return 104;
            case 94:
                return 105;
            case 95:
                return 106;
            case 96:
                return FacebookMediationAdapter.ERROR_NULL_CONTEXT;
            case 97:
                return 108;
            case 98:
                return FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD;
            case 99:
                return 110;
            case 100:
                return FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION;
            case 101:
                return AppLovinMediationAdapter.ERROR_CHILD_USER;
            case FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH /* 102 */:
                return AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID;
            case FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT /* 103 */:
                return 114;
            case 104:
                return 115;
            case 105:
                return 116;
            case 106:
                return 117;
            case FacebookMediationAdapter.ERROR_NULL_CONTEXT /* 107 */:
                return 118;
            case 108:
                return 119;
            case FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD /* 109 */:
                return 120;
            case 110:
                return 121;
            case FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION /* 111 */:
                return 122;
            case AppLovinMediationAdapter.ERROR_CHILD_USER /* 112 */:
                return 123;
            case AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID /* 113 */:
                return 124;
            case 114:
                return 125;
            case 115:
                return 145;
            case 116:
                return 146;
            case 117:
                return WebSocketProtocol.PAYLOAD_SHORT;
            case 118:
                return 147;
            case 119:
                return 127;
            case 120:
                return 128;
            case 121:
                return 129;
            case 122:
                return 130;
            case 123:
                return 131;
            case 124:
                return 132;
            case 125:
                return 133;
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                return 134;
            case 127:
                return 135;
            case 128:
                return 136;
            case 129:
                return 137;
            case 130:
                return 138;
            case 131:
                return 139;
            case 132:
                return 140;
            case 133:
                return 141;
            case 134:
                return 142;
            case 135:
                return 143;
            case 136:
                return 144;
            case 137:
                return 148;
            case 138:
                return 149;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String h(int i4) {
        if (i4 == 1) {
            return "htmlDisplay";
        }
        if (i4 == 2) {
            return "nativeDisplay";
        }
        if (i4 == 3) {
            return "video";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i4) {
        if (i4 == 1) {
            return "beginToRender";
        }
        if (i4 == 2) {
            return "definedByJavascript";
        }
        if (i4 == 3) {
            return "onePixel";
        }
        if (i4 == 4) {
            return "unspecified";
        }
        throw null;
    }

    public static /* synthetic */ int j(int i4) {
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 3) {
            return 1000;
        }
        throw null;
    }

    public static /* synthetic */ int k(int i4) {
        switch (i4) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int l(int i4, int i10, int i11) {
        int i12 = i4 / i10;
        return i12 + i12 + i11;
    }

    public static int m(int i4, int i10, int i11, int i12) {
        return ((i4 + i10) - i11) + i12;
    }

    public static int n(int i4, int i10, int i11, int i12, int i13) {
        return Math.max(((i4 * i10) / i11) + i12, i13);
    }

    public static /* synthetic */ int o(long j) {
        int i4 = (int) j;
        if (j == i4) {
            return i4;
        }
        throw new ArithmeticException();
    }

    public static void p(DeviceInfoApp deviceInfoApp, int i4, StringBuilder sb2, String str) {
        sb2.append(deviceInfoApp.getString(i4));
        sb2.append(str);
    }

    public static void q(String str, String str2, String str3) {
        ls.t(str3, str2.concat(String.valueOf(str)));
    }

    public static int r(int i4, int i10, int i11) {
        return hn1.J(i4) + i10 + i11;
    }

    public static int s(int i4, int i10, int i11, int i12) {
        return hn1.J(i4) + i10 + i11 + i12;
    }

    public static int t(int i4, int i10, int i11) {
        return com.google.android.gms.internal.consent_sdk.q5.i(i4) + i10 + i11;
    }

    public static int u(int i4, int i10, int i11, int i12) {
        return com.google.android.gms.internal.consent_sdk.q5.i(i4) + i10 + i11 + i12;
    }

    public static int v(int i4, int i10, int i11) {
        return com.google.android.gms.internal.measurement.y4.h0(i4) + i10 + i11;
    }

    public static int w(int i4, int i10, int i11, int i12) {
        return com.google.android.gms.internal.measurement.y4.h0(i4) + i10 + i11 + i12;
    }

    public static int x(int i4, int i10, int i11) {
        return com.google.android.gms.internal.play_billing.h1.W(i4) + i10 + i11;
    }

    public static int y(int i4, int i10, int i11, int i12) {
        return com.google.android.gms.internal.play_billing.h1.W(i4) + i10 + i11 + i12;
    }

    public static /* synthetic */ String z(int i4) {
        switch (i4) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }
}
