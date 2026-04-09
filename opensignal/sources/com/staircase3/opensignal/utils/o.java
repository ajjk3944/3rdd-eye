package com.staircase3.opensignal.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final qm.f f6189a;

    /* renamed from: b, reason: collision with root package name */
    public final r f6190b;

    public o(qm.f fVar, r rVar) {
        br.l.e(fVar, "permissionsManager");
        br.l.e(rVar, "telephonyManagerUtils");
        this.f6189a = fVar;
        this.f6190b = rVar;
    }

    public static l a(int i10) {
        if (i10 == 20) {
            return l.FIVE_G;
        }
        if (i10 != 30) {
            switch (i10) {
                case 0:
                    return l.UNKNOWN;
                case 1:
                case 2:
                case 4:
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                case 11:
                case 16:
                    return l.TWO_G;
                case 3:
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    break;
                case 13:
                    return l.FOUR_G;
                case 18:
                    return l.IWLAN;
                default:
                    return l.UNKNOWN;
            }
        }
        return l.THREE_G;
    }

    public static String b(l lVar, Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        switch (lVar == null ? -1 : n.f6187a[lVar.ordinal()]) {
            case -1:
            case 10:
                return "";
            case 0:
            default:
                throw new bf.n();
            case 1:
                String string = resources.getString(qk.l.out_of_service);
                br.l.d(string, "getString(...)");
                return string;
            case 2:
                String string2 = resources.getString(qk.l.emergency_only);
                br.l.d(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = resources.getString(qk.l.cell_radio_off);
                br.l.d(string3, "getString(...)");
                return string3;
            case 4:
                return "?";
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                String string4 = resources.getString(qk.l.two_g);
                br.l.d(string4, "getString(...)");
                return string4;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                String string5 = resources.getString(qk.l.three_g);
                br.l.d(string5, "getString(...)");
                return string5;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                String string6 = resources.getString(qk.l.four_g);
                br.l.d(string6, "getString(...)");
                return string6;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                String string7 = resources.getString(qk.l.five_g);
                br.l.d(string7, "getString(...)");
                return string7;
            case 9:
                return resources.getString(qk.l.three_g) + ' ' + resources.getString(qk.l.hspap);
        }
    }

    public static String c(int i10) {
        switch (i10) {
            case 0:
                return "unknown";
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return "EVDO 0";
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "EVDO A";
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "1xRTT";
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "iDEN";
            case 12:
                return "EVDO B";
            case 13:
                return "LTE";
            case 14:
                return "eHRPD";
            case 15:
                return "HSPAP";
            case 16:
                return "GSM";
            case 17:
                return "TD SCDMA";
            case 18:
                return "IWLAN";
            case 19:
            default:
                return h0.b.h(i10, "");
            case 20:
                return "5G";
        }
    }

    public final String d(Context context) {
        TelephonyManager telephonyManagerA = null;
        if (context != null) {
            this.f6189a.getClass();
            if (qm.f.c(context, "android.permission.READ_PHONE_STATE")) {
                telephonyManagerA = this.f6190b.a(context);
            }
        }
        return c(telephonyManagerA != null ? Build.VERSION.SDK_INT >= 30 ? telephonyManagerA.getDataNetworkType() : telephonyManagerA.getNetworkType() : 0);
    }
}
