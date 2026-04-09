package j3;

import N7.C1154e9;
import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.work.s;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.singular.sdk.internal.Constants;
import g0.C4356c;
import io.appmetrica.analytics.impl.Oo;
import j3.b;
import j3.e;
import j3.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlin.KotlinVersion;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SVGParser.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public j3.f f42926a;

    /* renamed from: b, reason: collision with root package name */
    public f.J f42927b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f42928c;

    /* renamed from: d, reason: collision with root package name */
    public int f42929d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f42930e;

    /* renamed from: f, reason: collision with root package name */
    public h f42931f;

    /* renamed from: g, reason: collision with root package name */
    public StringBuilder f42932g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f42933h;
    public StringBuilder i;

    /* compiled from: SVGParser.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42934a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f42935b;

        static {
            int[] iArr = new int[g.values().length];
            f42935b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42935b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42935b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42935b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42935b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42935b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42935b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42935b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42935b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42935b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f42935b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42935b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42935b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f42935b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f42935b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f42935b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f42935b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f42935b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f42935b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f42935b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f42935b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f42935b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f42935b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f42935b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f42935b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f42935b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f42935b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f42935b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f42935b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f42935b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f42935b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f42935b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f42935b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f42935b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f42935b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f42935b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f42935b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f42935b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f42935b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f42935b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f42935b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f42935b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f42935b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f42935b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f42935b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f42935b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f42935b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f42935b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f42935b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f42935b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f42935b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f42935b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f42935b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f42935b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f42935b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f42935b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f42935b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f42935b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f42935b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f42935b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f42935b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f42935b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f42935b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f42935b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f42935b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f42935b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f42935b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f42935b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f42935b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f42935b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f42935b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f42935b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f42935b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f42935b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f42935b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f42935b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f42935b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f42935b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f42935b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f42935b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f42935b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f42935b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f42935b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f42935b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f42935b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f42935b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f42935b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f42935b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f42935b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f42934a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f42934a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f42934a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f42934a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f42934a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f42934a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f42934a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f42934a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f42934a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f42934a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f42934a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f42934a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f42934a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f42934a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f42934a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f42934a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f42934a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f42934a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f42934a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f42934a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f42934a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f42934a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f42934a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f42934a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f42934a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f42934a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f42934a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f42934a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f42934a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f42934a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f42934a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* compiled from: SVGParser.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f42936a;

        static {
            HashMap map = new HashMap(10);
            f42936a = map;
            map.put("none", e.a.none);
            map.put("xMinYMin", e.a.xMinYMin);
            map.put("xMidYMin", e.a.xMidYMin);
            map.put("xMaxYMin", e.a.xMaxYMin);
            map.put("xMinYMid", e.a.xMinYMid);
            map.put("xMidYMid", e.a.xMidYMid);
            map.put("xMaxYMid", e.a.xMaxYMid);
            map.put("xMinYMax", e.a.xMinYMax);
            map.put("xMidYMax", e.a.xMidYMax);
            map.put("xMaxYMax", e.a.xMaxYMax);
        }
    }

    /* compiled from: SVGParser.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f42937a;

        static {
            HashMap map = new HashMap(47);
            f42937a = map;
            Oo.i(-984833, map, "aliceblue", -332841, "antiquewhite");
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            Oo.i(-983041, map, "azure", -657956, "beige");
            Oo.i(-6972, map, "bisque", -16777216, "black");
            Oo.i(-5171, map, "blanchedalmond", -16776961, "blue");
            Oo.i(-7722014, map, "blueviolet", -5952982, "brown");
            Oo.i(-2180985, map, "burlywood", -10510688, "cadetblue");
            Oo.i(-8388864, map, "chartreuse", -2987746, "chocolate");
            Oo.i(-32944, map, "coral", -10185235, "cornflowerblue");
            Oo.i(-1828, map, "cornsilk", -2354116, "crimson");
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            Oo.i(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            Oo.i(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
            Oo.i(-29696, map, "darkorange", -6737204, "darkorchid");
            Oo.i(-7667712, map, "darkred", -1468806, "darksalmon");
            Oo.i(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            Oo.i(-60269, map, "deeppink", -16728065, "deepskyblue");
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            Oo.i(-1296, map, "floralwhite", -14513374, "forestgreen");
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            Oo.i(-460545, map, "ghostwhite", -10496, "gold");
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            Oo.i(-16744448, map, "green", -5374161, "greenyellow");
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            Oo.i(-38476, map, "hotpink", -3318692, "indianred");
            Oo.i(-11861886, map, "indigo", -16, "ivory");
            Oo.i(-989556, map, "khaki", -1644806, "lavender");
            Oo.i(-3851, map, "lavenderblush", -8586240, "lawngreen");
            Oo.i(-1331, map, "lemonchiffon", -5383962, "lightblue");
            Oo.i(-1015680, map, "lightcoral", -2031617, "lightcyan");
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            Oo.i(-18751, map, "lightpink", -24454, "lightsalmon");
            Oo.i(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            Oo.i(-16711936, map, "lime", -13447886, "limegreen");
            map.put("linen", -331546);
            map.put("magenta", -65281);
            Oo.i(-8388608, map, "maroon", -10039894, "mediumaquamarine");
            Oo.i(-16777011, map, "mediumblue", -4565549, "mediumorchid");
            Oo.i(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
            Oo.i(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
            Oo.i(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
            Oo.i(-15132304, map, "midnightblue", -655366, "mintcream");
            Oo.i(-6943, map, "mistyrose", -6987, "moccasin");
            Oo.i(-8531, map, "navajowhite", -16777088, "navy");
            Oo.i(-133658, map, "oldlace", -8355840, "olive");
            Oo.i(-9728477, map, "olivedrab", -23296, "orange");
            Oo.i(-47872, map, "orangered", -2461482, "orchid");
            Oo.i(-1120086, map, "palegoldenrod", -6751336, "palegreen");
            Oo.i(-5247250, map, "paleturquoise", -2396013, "palevioletred");
            Oo.i(-4139, map, "papayawhip", -9543, "peachpuff");
            Oo.i(-3308225, map, "peru", -16181, "pink");
            Oo.i(-2252579, map, "plum", -5185306, "powderblue");
            Oo.i(-8388480, map, "purple", -10079335, "rebeccapurple");
            Oo.i(-65536, map, "red", -4419697, "rosybrown");
            Oo.i(-12490271, map, "royalblue", -7650029, "saddlebrown");
            Oo.i(-360334, map, "salmon", -744352, "sandybrown");
            Oo.i(-13726889, map, "seagreen", -2578, "seashell");
            Oo.i(-6270419, map, "sienna", -4144960, "silver");
            Oo.i(-7876885, map, "skyblue", -9807155, "slateblue");
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            Oo.i(-12156236, map, "steelblue", -2968436, "tan");
            Oo.i(-16744320, map, "teal", -2572328, "thistle");
            Oo.i(-40121, map, "tomato", -12525360, "turquoise");
            Oo.i(-1146130, map, "violet", -663885, "wheat");
            Oo.i(-1, map, "white", -657931, "whitesmoke");
            Oo.i(-256, map, "yellow", -6632142, "yellowgreen");
            map.put("transparent", 0);
        }
    }

    /* compiled from: SVGParser.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f42938a;

        static {
            HashMap map = new HashMap(9);
            f42938a = map;
            f.d0 d0Var = f.d0.pt;
            map.put("xx-small", new f.C5183p(0.694f, d0Var));
            map.put("x-small", new f.C5183p(0.833f, d0Var));
            map.put(Constants.SMALL, new f.C5183p(10.0f, d0Var));
            map.put(Constants.MEDIUM, new f.C5183p(12.0f, d0Var));
            map.put(Constants.LARGE, new f.C5183p(14.4f, d0Var));
            map.put("x-large", new f.C5183p(17.3f, d0Var));
            map.put("xx-large", new f.C5183p(20.7f, d0Var));
            f.d0 d0Var2 = f.d0.percent;
            map.put("smaller", new f.C5183p(83.33f, d0Var2));
            map.put("larger", new f.C5183p(120.0f, d0Var2));
        }
    }

    /* compiled from: SVGParser.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f42939a;

        static {
            HashMap map = new HashMap(13);
            f42939a = map;
            map.put(Constants.NORMAL, 400);
            map.put("bold", 700);
            Oo.i(1, map, "bolder", -1, "lighter");
            Oo.i(100, map, "100", 200, "200");
            map.put("300", 300);
            map.put("400", 400);
            Oo.i(500, map, "500", 600, "600");
            map.put("700", 700);
            map.put("800", 800);
            map.put("900", 900);
        }
    }

    /* compiled from: SVGParser.java */
    public class f extends DefaultHandler2 {
        public f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void characters(char[] cArr, int i, int i10) throws SAXException {
            i.this.G(new String(cArr, i, i10));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endDocument() throws SAXException {
            i.this.getClass();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endElement(String str, String str2, String str3) throws SAXException {
            i.this.c(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void processingInstruction(String str, String str2) throws SAXException {
            C0476i c0476i = new C0476i(str2);
            i.this.getClass();
            i.y(c0476i);
            str.equals("xml-stylesheet");
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startDocument() throws SAXException {
            i.this.E();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            i.this.F(str, str2, str3, attributes);
        }
    }

    /* compiled from: SVGParser.java */
    public enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final Map<String, g> cache = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    cache.put("class", gVar);
                } else {
                    if (gVar != UNSUPPORTED) {
                        cache.put(gVar.name().replace('_', '-'), gVar);
                    }
                }
            }
        }

        public static g fromString(String str) {
            g gVar = cache.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    /* compiled from: SVGParser.java */
    public enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map<String, h> cache = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    cache.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    cache.put(hVar.name(), hVar);
                }
            }
        }

        public static h fromString(String str) {
            h hVar = cache.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    /* compiled from: SVGParser.java */
    /* renamed from: j3.i$i, reason: collision with other inner class name */
    public static class C0476i {

        /* renamed from: a, reason: collision with root package name */
        public final String f42951a;

        /* renamed from: c, reason: collision with root package name */
        public final int f42953c;

        /* renamed from: b, reason: collision with root package name */
        public int f42952b = 0;

        /* renamed from: d, reason: collision with root package name */
        public final j3.d f42954d = new j3.d();

        public C0476i(String str) {
            this.f42953c = 0;
            String strTrim = str.trim();
            this.f42951a = strTrim;
            this.f42953c = strTrim.length();
        }

        public static boolean g(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        public final int a() {
            int i = this.f42952b;
            int i10 = this.f42953c;
            if (i == i10) {
                return -1;
            }
            int i11 = i + 1;
            this.f42952b = i11;
            if (i11 < i10) {
                return this.f42951a.charAt(i11);
            }
            return -1;
        }

        public final Boolean b(Object obj) {
            if (obj == null) {
                return null;
            }
            p();
            int i = this.f42952b;
            if (i == this.f42953c) {
                return null;
            }
            char cCharAt = this.f42951a.charAt(i);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f42952b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public final float c(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            p();
            return i();
        }

        public final boolean d(char c10) {
            int i = this.f42952b;
            boolean z10 = i < this.f42953c && this.f42951a.charAt(i) == c10;
            if (z10) {
                this.f42952b++;
            }
            return z10;
        }

        public final boolean e(String str) {
            int length = str.length();
            int i = this.f42952b;
            boolean z10 = i <= this.f42953c - length && this.f42951a.substring(i, i + length).equals(str);
            if (z10) {
                this.f42952b += length;
            }
            return z10;
        }

        public final boolean f() {
            return this.f42952b == this.f42953c;
        }

        public final Integer h() {
            int i = this.f42952b;
            if (i == this.f42953c) {
                return null;
            }
            this.f42952b = i + 1;
            return Integer.valueOf(this.f42951a.charAt(i));
        }

        public final float i() {
            int i = this.f42952b;
            int i10 = this.f42953c;
            j3.d dVar = this.f42954d;
            float fA = dVar.a(i, i10, this.f42951a);
            if (!Float.isNaN(fA)) {
                this.f42952b = dVar.f42711a;
            }
            return fA;
        }

        public final f.C5183p j() {
            float fI = i();
            if (Float.isNaN(fI)) {
                return null;
            }
            f.d0 d0VarN = n();
            return d0VarN == null ? new f.C5183p(fI, f.d0.px) : new f.C5183p(fI, d0VarN);
        }

        public final String k() {
            if (f()) {
                return null;
            }
            int i = this.f42952b;
            String str = this.f42951a;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.f42952b = i;
                return null;
            }
            int i10 = this.f42952b;
            this.f42952b = i10 + 1;
            return str.substring(i + 1, i10);
        }

        public final String l() {
            return m(' ', false);
        }

        public final String m(char c10, boolean z10) {
            if (f()) {
                return null;
            }
            int i = this.f42952b;
            String str = this.f42951a;
            char cCharAt = str.charAt(i);
            if ((!z10 && g(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i10 = this.f42952b;
            int iA = a();
            while (iA != -1 && iA != c10 && (z10 || !g(iA))) {
                iA = a();
            }
            return str.substring(i10, this.f42952b);
        }

        public final f.d0 n() {
            if (f()) {
                return null;
            }
            int i = this.f42952b;
            String str = this.f42951a;
            if (str.charAt(i) == '%') {
                this.f42952b++;
                return f.d0.percent;
            }
            int i10 = this.f42952b;
            if (i10 > this.f42953c - 2) {
                return null;
            }
            try {
                f.d0 d0VarValueOf = f.d0.valueOf(str.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.f42952b += 2;
                return d0VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final float o() {
            p();
            int i = this.f42952b;
            int i10 = this.f42953c;
            j3.d dVar = this.f42954d;
            float fA = dVar.a(i, i10, this.f42951a);
            if (!Float.isNaN(fA)) {
                this.f42952b = dVar.f42711a;
            }
            return fA;
        }

        public final boolean p() {
            q();
            int i = this.f42952b;
            if (i == this.f42953c || this.f42951a.charAt(i) != ',') {
                return false;
            }
            this.f42952b++;
            q();
            return true;
        }

        public final void q() {
            while (true) {
                int i = this.f42952b;
                if (i >= this.f42953c || !g(this.f42951a.charAt(i))) {
                    return;
                } else {
                    this.f42952b++;
                }
            }
        }
    }

    /* compiled from: SVGParser.java */
    public class j implements Attributes {

        /* renamed from: a, reason: collision with root package name */
        public XmlPullParser f42955a;

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final int getLength() {
            return this.f42955a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public final String getLocalName(int i) {
            return this.f42955a.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getQName(int i) {
            XmlPullParser xmlPullParser = this.f42955a;
            String attributeName = xmlPullParser.getAttributeName(i);
            if (xmlPullParser.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getURI(int i) {
            return this.f42955a.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(int i) {
            return this.f42955a.getAttributeValue(i);
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void D(j3.f.E r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.i.D(j3.f$E, java.lang.String, java.lang.String):void");
    }

    public static int b(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        return f10 > 255.0f ? KotlinVersion.MAX_COMPONENT_VALUE : Math.round(f10);
    }

    public static int d(float f10, float f11, float f12) {
        float f13 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f11 / 100.0f;
        float f16 = f12 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        float f17 = f16 >= 0.0f ? f16 > 1.0f ? 1.0f : f16 : 0.0f;
        float f18 = f17 <= 0.5f ? (f15 + 1.0f) * f17 : (f17 + f15) - (f15 * f17);
        float f19 = (f17 * 2.0f) - f18;
        return b(e(f19, f18, f14 - 2.0f) * 256.0f) | (b(e(f19, f18, f14 + 2.0f) * 256.0f) << 16) | (b(e(f19, f18, f14) * 256.0f) << 8);
    }

    public static float e(float f10, float f11, float f12) {
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        return f12 < 1.0f ? com.google.android.gms.measurement.internal.a.e(f11, f10, f12, f10) : f12 < 3.0f ? f11 : f12 < 4.0f ? com.google.android.gms.measurement.internal.a.e(4.0f, f12, f11 - f10, f10) : f10;
    }

    public static void f(f.G g10, Attributes attributes) throws j3.h {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (a.f42935b[C4356c.d(attributes, i)]) {
                case 21:
                    C0476i c0476i = new C0476i(strTrim);
                    HashSet hashSet = new HashSet();
                    while (!c0476i.f()) {
                        String strL = c0476i.l();
                        if (strL.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(strL.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        c0476i.q();
                    }
                    g10.f(hashSet);
                    break;
                case 22:
                    g10.h(strTrim);
                    break;
                case 23:
                    C0476i c0476i2 = new C0476i(strTrim);
                    HashSet hashSet2 = new HashSet();
                    while (!c0476i2.f()) {
                        String strL2 = c0476i2.l();
                        int iIndexOf = strL2.indexOf(45);
                        if (iIndexOf != -1) {
                            strL2 = strL2.substring(0, iIndexOf);
                        }
                        hashSet2.add(new Locale(strL2, "", "").getLanguage());
                        c0476i2.q();
                    }
                    g10.j(hashSet2);
                    break;
                case 24:
                    C0476i c0476i3 = new C0476i(strTrim);
                    HashSet hashSet3 = new HashSet();
                    while (!c0476i3.f()) {
                        hashSet3.add(c0476i3.l());
                        c0476i3.q();
                    }
                    g10.i(hashSet3);
                    break;
                case 25:
                    ArrayList arrayListQ = q(strTrim);
                    g10.g(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                    break;
            }
        }
    }

    public static void g(f.L l5, Attributes attributes) throws j3.h {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals(FacebookMediationAdapter.KEY_ID) || qName.equals("xml:id")) {
                l5.f42777c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    l5.f42778d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new j3.h(s.d("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    l5.f42778d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(j3.f.AbstractC5177j r4, org.xml.sax.Attributes r5) throws j3.h {
        /*
            r0 = 0
        L1:
            int r1 = r5.getLength()
            if (r0 >= r1) goto L79
            java.lang.String r1 = r5.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = j3.i.a.f42935b
            int r3 = g0.C4356c.d(r5, r0)
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L5c
            switch(r2) {
                case 32: goto L3a;
                case 33: goto L33;
                case 34: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L76
        L1e:
            j3.f$k r2 = j3.f.EnumC5178k.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L25
            r4.f42835k = r2     // Catch: java.lang.IllegalArgumentException -> L25
            goto L76
        L25:
            j3.h r4 = new j3.h
            java.lang.String r5 = "Invalid spreadMethod attribute. \""
            java.lang.String r0 = "\" is not a valid value."
            java.lang.String r5 = N7.C1154e9.i(r5, r1, r0)
            r4.<init>(r5)
            throw r4
        L33:
            android.graphics.Matrix r1 = z(r1)
            r4.f42834j = r1
            goto L76
        L3a:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L47
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.i = r1
            goto L76
        L47:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L54
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.i = r1
            goto L76
        L54:
            j3.h r4 = new j3.h
            java.lang.String r5 = "Invalid value for attribute gradientUnits"
            r4.<init>(r5)
            throw r4
        L5c:
            java.lang.String r2 = ""
            java.lang.String r3 = r5.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L74
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r5.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L76
        L74:
            r4.f42836l = r1
        L76:
            int r0 = r0 + 1
            goto L1
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.i.h(j3.f$j, org.xml.sax.Attributes):void");
    }

    public static void i(f.C5193z c5193z, Attributes attributes, String str) throws j3.h {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (g.fromString(attributes.getLocalName(i)) == g.points) {
                C0476i c0476i = new C0476i(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                c0476i.q();
                while (!c0476i.f()) {
                    float fI = c0476i.i();
                    if (Float.isNaN(fI)) {
                        throw new j3.h(C1154e9.i("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    c0476i.p();
                    float fI2 = c0476i.i();
                    if (Float.isNaN(fI2)) {
                        throw new j3.h(C1154e9.i("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    c0476i.p();
                    arrayList.add(Float.valueOf(fI));
                    arrayList.add(Float.valueOf(fI2));
                }
                c5193z.f42876o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    c5193z.f42876o[i10] = ((Float) it.next()).floatValue();
                    i10++;
                }
            }
        }
    }

    public static void j(f.L l5, Attributes attributes) throws j3.h {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int i10 = a.f42935b[C4356c.d(attributes, i)];
                if (i10 == 45) {
                    C0476i c0476i = new C0476i(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strM = c0476i.m(':', false);
                        c0476i.q();
                        if (!c0476i.d(':')) {
                            break;
                        }
                        c0476i.q();
                        String strM2 = c0476i.m(';', true);
                        if (strM2 == null) {
                            break;
                        }
                        c0476i.q();
                        if (c0476i.f() || c0476i.d(';')) {
                            if (l5.f42780f == null) {
                                l5.f42780f = new f.E();
                            }
                            D(l5.f42780f, strM, strM2);
                            c0476i.q();
                        }
                    }
                } else if (i10 != 46) {
                    if (l5.f42779e == null) {
                        l5.f42779e = new f.E();
                    }
                    D(l5.f42779e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    b.d dVar = new b.d(strTrim);
                    ArrayList arrayList = null;
                    while (!dVar.f()) {
                        String strL = dVar.l();
                        if (strL != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strL);
                            dVar.q();
                        }
                    }
                    l5.f42781g = arrayList;
                }
            }
        }
    }

    public static void k(f.a0 a0Var, Attributes attributes) throws j3.h {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i10 = a.f42935b[C4356c.d(attributes, i)];
            if (i10 == 1) {
                a0Var.f42803n = t(strTrim);
            } else if (i10 == 2) {
                a0Var.f42804o = t(strTrim);
            } else if (i10 == 19) {
                a0Var.f42805p = t(strTrim);
            } else if (i10 == 20) {
                a0Var.f42806q = t(strTrim);
            }
        }
    }

    public static void l(f.InterfaceC5181n interfaceC5181n, Attributes attributes) throws j3.h {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (g.fromString(attributes.getLocalName(i)) == g.transform) {
                interfaceC5181n.k(z(attributes.getValue(i)));
            }
        }
    }

    public static void m(f.R r9, Attributes attributes) throws j3.h {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i10 = a.f42935b[C4356c.d(attributes, i)];
            if (i10 == 7) {
                x(r9, strTrim);
            } else if (i10 != 87) {
                continue;
            } else {
                C0476i c0476i = new C0476i(strTrim);
                c0476i.q();
                float fI = c0476i.i();
                c0476i.p();
                float fI2 = c0476i.i();
                c0476i.p();
                float fI3 = c0476i.i();
                c0476i.p();
                float fI4 = c0476i.i();
                if (Float.isNaN(fI) || Float.isNaN(fI2) || Float.isNaN(fI3) || Float.isNaN(fI4)) {
                    throw new j3.h("Invalid viewBox definition - should have four numbers");
                }
                if (fI3 < 0.0f) {
                    throw new j3.h("Invalid viewBox. width cannot be negative");
                }
                if (fI4 < 0.0f) {
                    throw new j3.h("Invalid viewBox. height cannot be negative");
                }
                r9.f42794o = new f.C5170b(fI, fI2, fI3, fI4);
            }
        }
    }

    public static f.C0474f n(String str) throws j3.h {
        long j4;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            j3.c cVar = null;
            if (1 < length) {
                long j10 = 0;
                int i10 = 1;
                while (i10 < length) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt >= 'A' && cCharAt <= 'F') {
                            j4 = j10 * 16;
                            i = cCharAt - 'A';
                        } else {
                            if (cCharAt < 'a' || cCharAt > 'f') {
                                break;
                            }
                            j4 = j10 * 16;
                            i = cCharAt - 'a';
                        }
                        j10 = j4 + i + 10;
                    } else {
                        j10 = (j10 * 16) + (cCharAt - '0');
                    }
                    if (j10 > 4294967295L) {
                        break;
                    }
                    i10++;
                }
                if (i10 != 1) {
                    cVar = new j3.c(j10, i10);
                }
            }
            if (cVar == null) {
                throw new j3.h("Bad hex colour value: ".concat(str));
            }
            long j11 = cVar.f42708b;
            int i11 = cVar.f42707a;
            if (i11 == 4) {
                int i12 = (int) j11;
                int i13 = i12 & 3840;
                int i14 = i12 & 240;
                int i15 = i12 & 15;
                return new f.C0474f(i15 | (i13 << 8) | (-16777216) | (i13 << 12) | (i14 << 8) | (i14 << 4) | (i15 << 4));
            }
            if (i11 != 5) {
                if (i11 == 7) {
                    return new f.C0474f(((int) j11) | (-16777216));
                }
                if (i11 != 9) {
                    throw new j3.h("Bad hex colour value: ".concat(str));
                }
                int i16 = (int) j11;
                return new f.C0474f((i16 >>> 8) | (i16 << 24));
            }
            int i17 = (int) j11;
            int i18 = 61440 & i17;
            int i19 = i17 & 3840;
            int i20 = i17 & 240;
            int i21 = i17 & 15;
            return new f.C0474f((i21 << 24) | (i21 << 28) | (i18 << 8) | (i18 << 4) | (i19 << 4) | i19 | i20 | (i20 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            C0476i c0476i = new C0476i(str.substring(zStartsWith ? 5 : 4));
            c0476i.q();
            float fI = c0476i.i();
            if (!Float.isNaN(fI) && c0476i.d('%')) {
                fI = (fI * 256.0f) / 100.0f;
            }
            float fC = c0476i.c(fI);
            if (!Float.isNaN(fC) && c0476i.d('%')) {
                fC = (fC * 256.0f) / 100.0f;
            }
            float fC2 = c0476i.c(fC);
            if (!Float.isNaN(fC2) && c0476i.d('%')) {
                fC2 = (fC2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                c0476i.q();
                if (Float.isNaN(fC2) || !c0476i.d(')')) {
                    throw new j3.h("Bad rgb() colour value: ".concat(str));
                }
                return new f.C0474f((b(fI) << 16) | (-16777216) | (b(fC) << 8) | b(fC2));
            }
            float fC3 = c0476i.c(fC2);
            c0476i.q();
            if (Float.isNaN(fC3) || !c0476i.d(')')) {
                throw new j3.h("Bad rgba() colour value: ".concat(str));
            }
            return new f.C0474f((b(fC3 * 256.0f) << 24) | (b(fI) << 16) | (b(fC) << 8) | b(fC2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) c.f42937a.get(lowerCase);
            if (num != null) {
                return new f.C0474f(num.intValue());
            }
            throw new j3.h("Invalid colour keyword: ".concat(lowerCase));
        }
        C0476i c0476i2 = new C0476i(str.substring(zStartsWith2 ? 5 : 4));
        c0476i2.q();
        float fI2 = c0476i2.i();
        float fC4 = c0476i2.c(fI2);
        if (!Float.isNaN(fC4)) {
            c0476i2.d('%');
        }
        float fC5 = c0476i2.c(fC4);
        if (!Float.isNaN(fC5)) {
            c0476i2.d('%');
        }
        if (!zStartsWith2) {
            c0476i2.q();
            if (Float.isNaN(fC5) || !c0476i2.d(')')) {
                throw new j3.h("Bad hsl() colour value: ".concat(str));
            }
            return new f.C0474f(d(fI2, fC4, fC5) | (-16777216));
        }
        float fC6 = c0476i2.c(fC5);
        c0476i2.q();
        if (Float.isNaN(fC6) || !c0476i2.d(')')) {
            throw new j3.h("Bad hsla() colour value: ".concat(str));
        }
        return new f.C0474f((b(fC6 * 256.0f) << 24) | d(fI2, fC4, fC5));
    }

    public static float o(int i, String str) throws j3.h {
        float fA = new j3.d().a(0, i, str);
        if (Float.isNaN(fA)) {
            throw new j3.h(s.d("Invalid float value: ", str));
        }
        return fA;
    }

    public static float p(String str) throws j3.h {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        throw new j3.h("Invalid float value (empty string)");
    }

    public static ArrayList q(String str) {
        C0476i c0476i = new C0476i(str);
        ArrayList arrayList = null;
        do {
            String strK = c0476i.k();
            if (strK == null) {
                strK = c0476i.m(',', true);
            }
            if (strK == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strK);
            c0476i.p();
        } while (!c0476i.f());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static f.C5183p s(String str) throws j3.h {
        if (str.length() == 0) {
            throw new j3.h("Invalid length value (empty string)");
        }
        int length = str.length();
        f.d0 d0VarValueOf = f.d0.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d0VarValueOf = f.d0.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d0VarValueOf = f.d0.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new j3.h("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new f.C5183p(o(length, str), d0VarValueOf);
        } catch (NumberFormatException e4) {
            throw new j3.h("Invalid length value: ".concat(str), e4);
        }
    }

    public static ArrayList t(String str) throws j3.h {
        String str2;
        if (str.length() == 0) {
            throw new j3.h("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C0476i c0476i = new C0476i(str);
        c0476i.q();
        while (!c0476i.f()) {
            float fI = c0476i.i();
            if (Float.isNaN(fI)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                int i = c0476i.f42952b;
                while (true) {
                    boolean zF = c0476i.f();
                    str2 = c0476i.f42951a;
                    if (zF || C0476i.g(str2.charAt(c0476i.f42952b))) {
                        break;
                    }
                    c0476i.f42952b++;
                }
                String strSubstring = str2.substring(i, c0476i.f42952b);
                c0476i.f42952b = i;
                sb.append(strSubstring);
                throw new j3.h(sb.toString());
            }
            f.d0 d0VarN = c0476i.n();
            if (d0VarN == null) {
                d0VarN = f.d0.px;
            }
            arrayList.add(new f.C5183p(fI, d0VarN));
            c0476i.p();
        }
        return arrayList;
    }

    public static f.C5183p u(C0476i c0476i) {
        return c0476i.e("auto") ? new f.C5183p(0.0f) : c0476i.j();
    }

    public static Float v(String str) {
        try {
            float fP = p(str);
            float f10 = 0.0f;
            if (fP < 0.0f) {
                fP = f10;
            } else {
                f10 = 1.0f;
                if (fP > 1.0f) {
                    fP = f10;
                }
            }
            return Float.valueOf(fP);
        } catch (j3.h unused) {
            return null;
        }
    }

    public static f.O w(String str) {
        boolean zStartsWith = str.startsWith("url(");
        f.O oN = f.C0474f.f42826d;
        f.O o10 = f.C5174g.f42828b;
        f.O o11 = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return oN;
            }
            if (str.equals("currentColor")) {
                return o10;
            }
            try {
                return n(str);
            } catch (j3.h unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new f.C5188u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    oN = o10;
                } else {
                    try {
                        oN = n(strTrim2);
                    } catch (j3.h unused2) {
                        oN = null;
                    }
                }
            }
            o11 = oN;
        }
        return new f.C5188u(strTrim, o11);
    }

    public static void x(f.P p10, String str) throws j3.h {
        e.b bVar;
        C0476i c0476i = new C0476i(str);
        c0476i.q();
        String strL = c0476i.l();
        if ("defer".equals(strL)) {
            c0476i.q();
            strL = c0476i.l();
        }
        e.a aVar = (e.a) b.f42936a.get(strL);
        c0476i.q();
        if (c0476i.f()) {
            bVar = null;
        } else {
            String strL2 = c0476i.l();
            strL2.getClass();
            if (strL2.equals("meet")) {
                bVar = e.b.meet;
            } else {
                if (!strL2.equals("slice")) {
                    throw new j3.h("Invalid preserveAspectRatio definition: ".concat(str));
                }
                bVar = e.b.slice;
            }
        }
        p10.f42788n = new j3.e(aVar, bVar);
    }

    public static HashMap y(C0476i c0476i) {
        HashMap map = new HashMap();
        c0476i.q();
        String strM = c0476i.m('=', false);
        while (strM != null) {
            c0476i.d('=');
            map.put(strM, c0476i.k());
            c0476i.q();
            strM = c0476i.m('=', false);
        }
        return map;
    }

    public static Matrix z(String str) throws j3.h {
        Matrix matrix = new Matrix();
        C0476i c0476i = new C0476i(str);
        c0476i.q();
        while (!c0476i.f()) {
            String strSubstring = null;
            if (!c0476i.f()) {
                int i = c0476i.f42952b;
                String str2 = c0476i.f42951a;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = c0476i.a();
                    }
                }
                int i10 = c0476i.f42952b;
                while (C0476i.g(iCharAt)) {
                    iCharAt = c0476i.a();
                }
                if (iCharAt == 40) {
                    c0476i.f42952b++;
                    strSubstring = str2.substring(i, i10);
                } else {
                    c0476i.f42952b = i;
                }
            }
            if (strSubstring == null) {
                throw new j3.h("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    c0476i.q();
                    float fI = c0476i.i();
                    c0476i.p();
                    float fI2 = c0476i.i();
                    c0476i.p();
                    float fI3 = c0476i.i();
                    c0476i.p();
                    float fI4 = c0476i.i();
                    c0476i.p();
                    float fI5 = c0476i.i();
                    c0476i.p();
                    float fI6 = c0476i.i();
                    c0476i.q();
                    if (!Float.isNaN(fI6) && c0476i.d(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{fI, fI3, fI5, fI2, fI4, fI6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new j3.h("Invalid transform list: ".concat(str));
                    }
                    break;
                case "rotate":
                    c0476i.q();
                    float fI7 = c0476i.i();
                    float fO = c0476i.o();
                    float fO2 = c0476i.o();
                    c0476i.q();
                    if (Float.isNaN(fI7) || !c0476i.d(')')) {
                        throw new j3.h("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fO)) {
                        matrix.preRotate(fI7);
                        break;
                    } else if (!Float.isNaN(fO2)) {
                        matrix.preRotate(fI7, fO, fO2);
                        break;
                    } else {
                        throw new j3.h("Invalid transform list: ".concat(str));
                    }
                case "scale":
                    c0476i.q();
                    float fI8 = c0476i.i();
                    float fO3 = c0476i.o();
                    c0476i.q();
                    if (!Float.isNaN(fI8) && c0476i.d(')')) {
                        if (!Float.isNaN(fO3)) {
                            matrix.preScale(fI8, fO3);
                            break;
                        } else {
                            matrix.preScale(fI8, fI8);
                            break;
                        }
                    } else {
                        throw new j3.h("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewX":
                    c0476i.q();
                    float fI9 = c0476i.i();
                    c0476i.q();
                    if (!Float.isNaN(fI9) && c0476i.d(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(fI9)), 0.0f);
                        break;
                    } else {
                        throw new j3.h("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewY":
                    c0476i.q();
                    float fI10 = c0476i.i();
                    c0476i.q();
                    if (!Float.isNaN(fI10) && c0476i.d(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fI10)));
                        break;
                    } else {
                        throw new j3.h("Invalid transform list: ".concat(str));
                    }
                    break;
                case "translate":
                    c0476i.q();
                    float fI11 = c0476i.i();
                    float fO4 = c0476i.o();
                    c0476i.q();
                    if (!Float.isNaN(fI11) && c0476i.d(')')) {
                        if (!Float.isNaN(fO4)) {
                            matrix.preTranslate(fI11, fO4);
                            break;
                        } else {
                            matrix.preTranslate(fI11, 0.0f);
                            break;
                        }
                    } else {
                        throw new j3.h("Invalid transform list: ".concat(str));
                    }
                    break;
                default:
                    throw new j3.h(C1154e9.i("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (c0476i.f()) {
                return matrix;
            }
            c0476i.p();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f();
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e4) {
            throw new j3.h("Stream error", e4);
        } catch (ParserConfigurationException e10) {
            throw new j3.h("XML parser problem", e10);
        } catch (SAXException e11) {
            throw new j3.h("SVG parse error", e11);
        }
    }

    public final void B(InputStream inputStream) throws XmlPullParserException, ParserConfigurationException, SAXException, IOException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j();
                jVar.f42955a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        E();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        C0476i c0476i = new C0476i(xmlPullParserNewPullParser.getText());
                        String strL = c0476i.l();
                        y(c0476i);
                        strL.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (this.f42926a.f42716a == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        F(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        H(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        G(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (IOException e4) {
                throw new j3.h("Stream error", e4);
            }
        } catch (XmlPullParserException e10) {
            throw new j3.h("XML parser problem", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x032a, code lost:
    
        android.util.Log.e("SVGParser", "Bad path coords for " + ((char) r5) + " path segment");
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(org.xml.sax.Attributes r25) throws j3.h {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.i.C(org.xml.sax.Attributes):void");
    }

    public final void E() {
        j3.f fVar = new j3.f();
        fVar.f42716a = null;
        fVar.f42717b = new b.q();
        fVar.f42718c = new HashMap();
        this.f42926a = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:659:0x033e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x053d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(java.lang.String r17, java.lang.String r18, java.lang.String r19, org.xml.sax.Attributes r20) throws j3.h {
        /*
            Method dump skipped, instructions count: 3104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.i.F(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void G(String str) throws j3.h {
        if (this.f42928c) {
            return;
        }
        if (this.f42930e) {
            if (this.f42932g == null) {
                this.f42932g = new StringBuilder(str.length());
            }
            this.f42932g.append(str);
        } else if (this.f42933h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.f42927b instanceof f.Y) {
            a(str);
        }
    }

    public final void H(char[] cArr, int i, int i10) throws j3.h {
        if (this.f42928c) {
            return;
        }
        if (this.f42930e) {
            if (this.f42932g == null) {
                this.f42932g = new StringBuilder(i10);
            }
            this.f42932g.append(cArr, i, i10);
        } else if (this.f42933h) {
            if (this.i == null) {
                this.i = new StringBuilder(i10);
            }
            this.i.append(cArr, i, i10);
        } else if (this.f42927b instanceof f.Y) {
            a(new String(cArr, i, i10));
        }
    }

    public final void a(String str) throws j3.h {
        f.H h10 = (f.H) this.f42927b;
        int size = h10.i.size();
        f.N n9 = size == 0 ? null : (f.N) h10.i.get(size - 1);
        if (n9 instanceof f.c0) {
            f.c0 c0Var = (f.c0) n9;
            c0Var.f42815c = B4.f.c(new StringBuilder(), c0Var.f42815c, str);
        } else {
            f.J j4 = this.f42927b;
            f.c0 c0Var2 = new f.c0();
            c0Var2.f42815c = str;
            j4.b(c0Var2);
        }
    }

    public final void c(String str, String str2, String str3) throws j3.h {
        if (this.f42928c) {
            int i = this.f42929d - 1;
            this.f42929d = i;
            if (i == 0) {
                this.f42928c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i10 = a.f42934a[h.fromString(str2).ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 13 && i10 != 14) {
                switch (i10) {
                    case 22:
                    case 23:
                        this.f42930e = false;
                        if (this.f42932g != null) {
                            h hVar = this.f42931f;
                            if (hVar == h.title || hVar == h.desc) {
                                this.f42926a.getClass();
                            }
                            this.f42932g.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb = this.i;
                        if (sb != null) {
                            this.f42933h = false;
                            String string = sb.toString();
                            b.f fVar = b.f.screen;
                            b.t tVar = b.t.Document;
                            j3.b bVar = new j3.b();
                            bVar.f42680c = false;
                            bVar.f42678a = fVar;
                            bVar.f42679b = tVar;
                            j3.f fVar2 = this.f42926a;
                            b.d dVar = new b.d(string);
                            dVar.q();
                            fVar2.f42717b.b(bVar.e(dVar));
                            this.i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.f42927b = ((f.N) this.f42927b).f42787b;
        }
    }
}
