package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class mq {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f30476a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f30477b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f30478c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f30479d;

    static {
        HashMap map = new HashMap();
        f30479d = map;
        yt0.a(-984833, map, "aliceblue", -332841, "antiquewhite");
        yt0.a(-16711681, map, "aqua", -8388652, "aquamarine");
        yt0.a(-983041, map, "azure", -657956, "beige");
        yt0.a(-6972, map, "bisque", -16777216, "black");
        yt0.a(-5171, map, "blanchedalmond", -16776961, "blue");
        yt0.a(-7722014, map, "blueviolet", -5952982, "brown");
        yt0.a(-2180985, map, "burlywood", -10510688, "cadetblue");
        yt0.a(-8388864, map, "chartreuse", -2987746, "chocolate");
        yt0.a(-32944, map, "coral", -10185235, "cornflowerblue");
        yt0.a(-1828, map, "cornsilk", -2354116, "crimson");
        yt0.a(-16711681, map, "cyan", -16777077, "darkblue");
        yt0.a(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        yt0.a(-5658199, map, "darkgray", -16751616, "darkgreen");
        yt0.a(-5658199, map, "darkgrey", -4343957, "darkkhaki");
        yt0.a(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        yt0.a(-29696, map, "darkorange", -6737204, "darkorchid");
        yt0.a(-7667712, map, "darkred", -1468806, "darksalmon");
        yt0.a(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        yt0.a(-13676721, map, "darkslategray", -13676721, "darkslategrey");
        yt0.a(-16724271, map, "darkturquoise", -7077677, "darkviolet");
        yt0.a(-60269, map, "deeppink", -16728065, "deepskyblue");
        yt0.a(-9868951, map, "dimgray", -9868951, "dimgrey");
        yt0.a(-14774017, map, "dodgerblue", -5103070, "firebrick");
        yt0.a(-1296, map, "floralwhite", -14513374, "forestgreen");
        yt0.a(-65281, map, "fuchsia", -2302756, "gainsboro");
        yt0.a(-460545, map, "ghostwhite", -10496, "gold");
        yt0.a(-2448096, map, "goldenrod", -8355712, "gray");
        yt0.a(-16744448, map, "green", -5374161, "greenyellow");
        yt0.a(-8355712, map, "grey", -983056, "honeydew");
        yt0.a(-38476, map, "hotpink", -3318692, "indianred");
        yt0.a(-11861886, map, "indigo", -16, "ivory");
        yt0.a(-989556, map, "khaki", -1644806, "lavender");
        yt0.a(-3851, map, "lavenderblush", -8586240, "lawngreen");
        yt0.a(-1331, map, "lemonchiffon", -5383962, "lightblue");
        yt0.a(-1015680, map, "lightcoral", -2031617, "lightcyan");
        yt0.a(-329006, map, "lightgoldenrodyellow", -2894893, "lightgray");
        yt0.a(-7278960, map, "lightgreen", -2894893, "lightgrey");
        yt0.a(-18751, map, "lightpink", -24454, "lightsalmon");
        yt0.a(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        yt0.a(-8943463, map, "lightslategray", -8943463, "lightslategrey");
        yt0.a(-5192482, map, "lightsteelblue", -32, "lightyellow");
        yt0.a(-16711936, map, "lime", -13447886, "limegreen");
        yt0.a(-331546, map, "linen", -65281, "magenta");
        yt0.a(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        yt0.a(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        yt0.a(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        yt0.a(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        yt0.a(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        yt0.a(-15132304, map, "midnightblue", -655366, "mintcream");
        yt0.a(-6943, map, "mistyrose", -6987, "moccasin");
        yt0.a(-8531, map, "navajowhite", -16777088, "navy");
        yt0.a(-133658, map, "oldlace", -8355840, "olive");
        yt0.a(-9728477, map, "olivedrab", -23296, "orange");
        yt0.a(-47872, map, "orangered", -2461482, "orchid");
        yt0.a(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        yt0.a(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        yt0.a(-4139, map, "papayawhip", -9543, "peachpuff");
        yt0.a(-3308225, map, "peru", -16181, "pink");
        yt0.a(-2252579, map, "plum", -5185306, "powderblue");
        yt0.a(-8388480, map, "purple", -10079335, "rebeccapurple");
        yt0.a(-65536, map, "red", -4419697, "rosybrown");
        yt0.a(-12490271, map, "royalblue", -7650029, "saddlebrown");
        yt0.a(-360334, map, "salmon", -744352, "sandybrown");
        yt0.a(-13726889, map, "seagreen", -2578, "seashell");
        yt0.a(-6270419, map, "sienna", -4144960, "silver");
        yt0.a(-7876885, map, "skyblue", -9807155, "slateblue");
        yt0.a(-9404272, map, "slategray", -9404272, "slategrey");
        yt0.a(-1286, map, "snow", -16711809, "springgreen");
        yt0.a(-12156236, map, "steelblue", -2968436, "tan");
        yt0.a(-16744320, map, "teal", -2572328, "thistle");
        yt0.a(-40121, map, "tomato", 0, "transparent");
        yt0.a(-12525360, map, "turquoise", -1146130, "violet");
        yt0.a(-663885, map, "wheat", -1, "white");
        yt0.a(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    private static int a(String str, boolean z10) throws NumberFormatException {
        int i;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i10 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i10;
            }
            if (strReplace.length() == 9) {
                return ((i10 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (i10 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z10 ? f30478c : f30477b).matcher(strReplace);
            if (matcher.matches()) {
                if (z10) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i11 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i12 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i11, i12, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f30476a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i13 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i14 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i13, i14, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f30479d.get(xf.b(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int b(String str) {
        return a(str, false);
    }

    public static int a(String str) {
        return a(str, true);
    }
}
