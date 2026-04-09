package G;

import C.S;
import e1.C4303a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: Exif.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1802b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final b f1803c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final c f1804d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final List<String> f1805e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* renamed from: f, reason: collision with root package name */
    public static final List<String> f1806f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a, reason: collision with root package name */
    public final C4303a f1807a;

    /* compiled from: Exif.java */
    public class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* compiled from: Exif.java */
    public class b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* compiled from: Exif.java */
    public class c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public f(C4303a c4303a) {
        this.f1807a = c4303a;
    }

    public final void a(f fVar) {
        ArrayList arrayList = new ArrayList(f1805e);
        arrayList.removeAll(f1806f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String strC = this.f1807a.c(str);
            C4303a c4303a = fVar.f1807a;
            String strC2 = c4303a.c(str);
            if (strC != null && !strC.equals(strC2)) {
                c4303a.y(str, strC);
            }
        }
    }

    public final int b() {
        switch (this.f1807a.d(0, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void c(int i) {
        int i10 = i % 90;
        C4303a c4303a = this.f1807a;
        if (i10 != 0) {
            Locale locale = Locale.US;
            S.g("f", "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i + " is unsupported.");
            c4303a.y("Orientation", String.valueOf(0));
            return;
        }
        int i11 = i % 360;
        int iD = c4303a.d(0, "Orientation");
        while (i11 < 0) {
            i11 += 90;
            switch (iD) {
                case 2:
                    iD = 5;
                    break;
                case 3:
                case 8:
                    iD = 6;
                    break;
                case 4:
                    iD = 7;
                    break;
                case 5:
                    iD = 4;
                    break;
                case 6:
                    iD = 1;
                    break;
                case 7:
                    iD = 2;
                    break;
                default:
                    iD = 8;
                    break;
            }
        }
        while (i11 > 0) {
            i11 -= 90;
            switch (iD) {
                case 2:
                    iD = 7;
                    break;
                case 3:
                    iD = 8;
                    break;
                case 4:
                    iD = 5;
                    break;
                case 5:
                    iD = 2;
                    break;
                case 6:
                    iD = 3;
                    break;
                case 7:
                    iD = 4;
                    break;
                case 8:
                    iD = 1;
                    break;
                default:
                    iD = 6;
                    break;
            }
        }
        c4303a.y("Orientation", String.valueOf(iD));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e A[Catch: ParseException -> 0x0117, TRY_ENTER, TryCatch #3 {ParseException -> 0x0117, blocks: (B:55:0x011e, B:58:0x0133), top: B:135:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G.f.toString():java.lang.String");
    }
}
