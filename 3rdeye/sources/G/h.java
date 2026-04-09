package G;

import C.S;
import android.util.Pair;
import androidx.camera.core.impl.EnumC1722z;
import g0.C4356c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: ExifData.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final k[] f1814c;

    /* renamed from: d, reason: collision with root package name */
    public static final k[][] f1815d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet<String> f1816e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1817a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteOrder f1818b;

    /* compiled from: ExifData.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1819a;

        static {
            int[] iArr = new int[EnumC1722z.values().length];
            f1819a = iArr;
            try {
                iArr[EnumC1722z.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1819a[EnumC1722z.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1819a[EnumC1722z.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ExifData.java */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f1820c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d, reason: collision with root package name */
        public static final Pattern f1821d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e, reason: collision with root package name */
        public static final Pattern f1822e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f, reason: collision with root package name */
        public static final ArrayList f1823f;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f1824a;

        /* renamed from: b, reason: collision with root package name */
        public final ByteOrder f1825b;

        /* compiled from: ExifData.java */
        public class a implements Enumeration<HashMap<String, k>> {

            /* renamed from: a, reason: collision with root package name */
            public int f1826a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.f1826a;
                k[] kVarArr = h.f1814c;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final HashMap<String, k> nextElement() {
                HashMap<String, k> map = new HashMap<>();
                for (k kVar : h.f1815d[this.f1826a]) {
                    map.put(kVar.f1837b, kVar);
                }
                this.f1826a++;
                return map;
            }
        }

        /* compiled from: ExifData.java */
        /* renamed from: G.h$b$b, reason: collision with other inner class name */
        public class C0032b implements Enumeration<Map<String, g>> {

            /* renamed from: a, reason: collision with root package name */
            public int f1827a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.f1827a;
                k[] kVarArr = h.f1814c;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final Map<String, g> nextElement() {
                this.f1827a++;
                return new HashMap();
            }
        }

        static {
            a aVar = new a();
            aVar.f1826a = 0;
            f1823f = Collections.list(aVar);
        }

        public b() {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            C0032b c0032b = new C0032b();
            c0032b.f1827a = 0;
            this.f1824a = Collections.list(c0032b);
            this.f1825b = byteOrder;
        }

        public static Pair<Integer, Integer> a(String str) throws NumberFormatException {
            if (str.contains(StringUtils.COMMA)) {
                String[] strArrSplit = str.split(StringUtils.COMMA, -1);
                Pair<Integer, Integer> pairA = a(strArrSplit[0]);
                if (((Integer) pairA.first).intValue() == 2) {
                    return pairA;
                }
                for (int i = 1; i < strArrSplit.length; i++) {
                    Pair<Integer, Integer> pairA2 = a(strArrSplit[i]);
                    int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairA = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairA = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairA;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j4 = Long.parseLong(str);
                        return (j4 < 0 || j4 > 65535) ? j4 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        Double.parseDouble(str);
                        return new Pair<>(12, -1);
                    }
                } catch (NumberFormatException unused2) {
                    return new Pair<>(2, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j10 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j11 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j10 >= 0 && j11 >= 0) {
                        if (j10 <= 2147483647L && j11 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        public final void b(String str, String str2, ArrayList arrayList) throws NumberFormatException {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            c(str, str2, arrayList);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0312  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x033f  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0390  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x03b7  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02a5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(java.lang.String r20, java.lang.String r21, java.util.List<java.util.Map<java.lang.String, G.g>> r22) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 1058
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: G.h.b.c(java.lang.String, java.lang.String, java.util.List):void");
        }

        public final void d(float f10) throws NumberFormatException {
            c("FocalLength", ((long) (f10 * 1000.0f)) + "/1000", this.f1824a);
        }

        public final void e(int i) throws NumberFormatException {
            int i10;
            if (i == 0) {
                i10 = 1;
            } else if (i == 90) {
                i10 = 6;
            } else if (i == 180) {
                i10 = 3;
            } else if (i != 270) {
                S.g("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i10 = 0;
            } else {
                i10 = 8;
            }
            c("Orientation", String.valueOf(i10), this.f1824a);
        }
    }

    /* compiled from: ExifData.java */
    public enum c {
        AUTO,
        MANUAL
    }

    static {
        k[] kVarArr = {new k(256, 3, 4, "ImageWidth"), new k(257, 3, 4, "ImageLength"), new k("Make", 271, 2), new k("Model", 272, 2), new k("Orientation", 274, 3), new k("XResolution", 282, 5), new k("YResolution", 283, 5), new k("ResolutionUnit", 296, 3), new k("Software", 305, 2), new k("DateTime", 306, 2), new k("YCbCrPositioning", 531, 3), new k("SubIFDPointer", 330, 4), new k("ExifIFDPointer", 34665, 4), new k("GPSInfoIFDPointer", 34853, 4)};
        k[] kVarArr2 = {new k("ExposureTime", 33434, 5), new k("FNumber", 33437, 5), new k("ExposureProgram", 34850, 3), new k("PhotographicSensitivity", 34855, 3), new k("SensitivityType", 34864, 3), new k("ExifVersion", 36864, 2), new k("DateTimeOriginal", 36867, 2), new k("DateTimeDigitized", 36868, 2), new k("ComponentsConfiguration", 37121, 7), new k("ShutterSpeedValue", 37377, 10), new k("ApertureValue", 37378, 5), new k("BrightnessValue", 37379, 10), new k("ExposureBiasValue", 37380, 10), new k("MaxApertureValue", 37381, 5), new k("MeteringMode", 37383, 3), new k("LightSource", 37384, 3), new k("Flash", 37385, 3), new k("FocalLength", 37386, 5), new k("SubSecTime", 37520, 2), new k("SubSecTimeOriginal", 37521, 2), new k("SubSecTimeDigitized", 37522, 2), new k("FlashpixVersion", 40960, 7), new k("ColorSpace", 40961, 3), new k(40962, 3, 4, "PixelXDimension"), new k(40963, 3, 4, "PixelYDimension"), new k("InteroperabilityIFDPointer", 40965, 4), new k("FocalPlaneResolutionUnit", 41488, 3), new k("SensingMethod", 41495, 3), new k("FileSource", 41728, 7), new k("SceneType", 41729, 7), new k("CustomRendered", 41985, 3), new k("ExposureMode", 41986, 3), new k("WhiteBalance", 41987, 3), new k("SceneCaptureType", 41990, 3), new k("Contrast", 41992, 3), new k("Saturation", 41993, 3), new k("Sharpness", 41994, 3)};
        k[] kVarArr3 = {new k("GPSVersionID", 0, 1), new k("GPSLatitudeRef", 1, 2), new k(2, 5, 10, "GPSLatitude"), new k("GPSLongitudeRef", 3, 2), new k(4, 5, 10, "GPSLongitude"), new k("GPSAltitudeRef", 5, 1), new k("GPSAltitude", 6, 5), new k("GPSTimeStamp", 7, 5), new k("GPSSpeedRef", 12, 2), new k("GPSTrackRef", 14, 2), new k("GPSImgDirectionRef", 16, 2), new k("GPSDestBearingRef", 23, 2), new k("GPSDestDistanceRef", 25, 2)};
        f1814c = new k[]{new k("SubIFDPointer", 330, 4), new k("ExifIFDPointer", 34665, 4), new k("GPSInfoIFDPointer", 34853, 4), new k("InteroperabilityIFDPointer", 40965, 4)};
        f1815d = new k[][]{kVarArr, kVarArr2, kVarArr3, new k[]{new k("InteroperabilityIndex", 1, 2)}};
        f1816e = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public h(ByteOrder byteOrder, ArrayList arrayList) {
        A2.l.q("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.f1818b = byteOrder;
        this.f1817a = arrayList;
    }

    public final Map<String, g> a(int i) {
        A2.l.m(i, 0, 4, C4356c.i(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.f1817a.get(i);
    }
}
