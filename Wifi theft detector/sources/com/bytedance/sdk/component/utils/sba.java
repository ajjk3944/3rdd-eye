package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes.dex */
public class sba {
    public static boolean bw(Context context) {
        return xq(context) == 5;
    }

    public static boolean dg(Context context) {
        return xq(context) == 4;
    }

    public static boolean emc(Context context) {
        return xq(context) != 0;
    }

    public static boolean msw(Context context) {
        if (context == null) {
            return false;
        }
        int iXq = xq(context);
        return iXq == 2 || iXq == 3 || iXq == 4 || iXq == 5 || iXq == 6;
    }

    public static String uym(Context context) {
        int iXq = xq(context);
        return iXq != 2 ? iXq != 3 ? iXq != 4 ? iXq != 5 ? iXq != 6 ? "mobile" : "5g" : "4g" : "wifi" : "3g" : "2g";
    }

    public static int xq(Context context) {
        return sb.emc(context, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean ycc(Context context) {
        return xq(context) == 6;
    }

    public static int ypw(Context context) {
        int iXq = xq(context);
        if (iXq == 1) {
            return 0;
        }
        if (iXq == 4) {
            return 1;
        }
        if (iXq == 5) {
            return 4;
        }
        if (iXq != 6) {
            return iXq;
        }
        return 6;
    }

    public static boolean emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }
}
