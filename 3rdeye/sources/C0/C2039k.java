package c0;

import C.C;
import C.S;
import W.AbstractC1630s;
import W.b0;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1680b0;
import androidx.camera.core.impl.Q0;
import c0.C2037i;
import com.google.android.gms.ads.AdRequest;
import com.singular.sdk.internal.Constants;
import d0.AbstractC4254A;
import d0.AbstractC4255B;
import d0.C4260d;
import e0.C4301b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: VideoConfigUtil.java */
/* renamed from: c0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2039k {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f18359a;

    /* renamed from: b, reason: collision with root package name */
    public static final Q0 f18360b;

    static {
        HashMap map = new HashMap();
        f18359a = map;
        f18360b = Q0.UPTIME;
        HashMap map2 = new HashMap();
        d0.e eVar = AbstractC4255B.f37192a;
        map2.put(1, eVar);
        d0.e eVar2 = AbstractC4255B.f37194c;
        map2.put(2, eVar2);
        d0.e eVar3 = AbstractC4255B.f37195d;
        map2.put(4096, eVar3);
        map2.put(8192, eVar3);
        HashMap map3 = new HashMap();
        map3.put(1, eVar);
        map3.put(2, eVar2);
        map3.put(4096, eVar3);
        map3.put(8192, eVar3);
        HashMap map4 = new HashMap();
        map4.put(1, eVar);
        map4.put(4, eVar2);
        map4.put(4096, eVar3);
        map4.put(16384, eVar3);
        map4.put(2, eVar);
        map4.put(8, eVar2);
        map4.put(8192, eVar3);
        map4.put(Integer.valueOf(Constants.QUEUE_ELEMENT_MAX_SIZE), eVar3);
        HashMap map5 = new HashMap();
        map5.put(256, eVar2);
        map5.put(Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH), AbstractC4255B.f37193b);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    public static AbstractC4255B a(int i, String str) {
        AbstractC4255B abstractC4255B;
        Map map = (Map) f18359a.get(str);
        if (map != null && (abstractC4255B = (AbstractC4255B) map.get(Integer.valueOf(i))) != null) {
            return abstractC4255B;
        }
        S.g("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i)));
        return AbstractC4255B.f37192a;
    }

    public static C2037i b(AbstractC1630s abstractC1630s, C c10, Y.f fVar) {
        InterfaceC1680b0.c next;
        A2.l.q("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + c10 + "]", c10.b());
        String str = "video/avc";
        String str2 = abstractC1630s.c() != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        int i = c10.f621a;
        if (fVar == null) {
            next = null;
        } else {
            Set set = (Set) C4301b.f37632b.get(Integer.valueOf(i));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) C4301b.f37631a.get(Integer.valueOf(c10.f622b));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            Iterator<InterfaceC1680b0.c> it = ((Y.a) fVar).f13691d.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (set.contains(Integer.valueOf(next.f())) && set2.contains(Integer.valueOf(next.a()))) {
                    String strH = next.h();
                    if (str2.equals(strH)) {
                        S.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str2 + "]");
                    } else if (abstractC1630s.c() == -1) {
                        S.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + str2 + ", dynamic range: " + c10 + "]");
                    }
                    str2 = strH;
                    break;
                }
            }
            next = null;
        }
        if (next == null) {
            if (abstractC1630s.c() == -1) {
                if (i != 1) {
                    if (i == 3 || i == 4 || i == 5) {
                        str = "video/hevc";
                    } else {
                        if (i != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + c10 + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (fVar == null) {
                S.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + c10 + "]");
            } else {
                S.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + c10 + "]");
            }
        }
        C2037i.a aVar = new C2037i.a();
        if (str2 == null) {
            throw new NullPointerException("Null mimeType");
        }
        aVar.f18356a = str2;
        aVar.f18357b = -1;
        if (next != null) {
            aVar.f18358c = next;
        }
        String str3 = aVar.f18356a == null ? " mimeType" : "";
        if (str3.isEmpty()) {
            return new C2037i(aVar.f18356a, aVar.f18357b.intValue(), aVar.f18358c);
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static int c(int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Range<Integer> range) {
        Rational rational = new Rational(i10, i11);
        int iDoubleValue = (int) (new Rational(i16, i17).doubleValue() * new Rational(i14, i15).doubleValue() * new Rational(i12, i13).doubleValue() * rational.doubleValue() * i);
        String strConcat = S.d("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(iDoubleValue)) : "";
        if (!b0.f13236b.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (S.d("VideoConfigUtil")) {
                strConcat = strConcat.concat(String.format("\nClamped to range %s -> %dbps", range, num));
            }
            iDoubleValue = iIntValue;
        }
        S.a("VideoConfigUtil", strConcat);
        return iDoubleValue;
    }

    public static C4260d d(InterfaceC1680b0.c cVar) {
        C4260d.a aVarD = AbstractC4254A.d();
        String strH = cVar.h();
        if (strH == null) {
            throw new NullPointerException("Null mimeType");
        }
        aVarD.f37218a = strH;
        aVarD.f37219b = Integer.valueOf(cVar.i());
        aVarD.f37221d = new Size(cVar.j(), cVar.g());
        aVarD.f37224g = Integer.valueOf(cVar.e());
        aVarD.i = Integer.valueOf(cVar.b());
        Q0 q02 = f18360b;
        if (q02 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        aVarD.f37220c = q02;
        return aVarD.a();
    }
}
