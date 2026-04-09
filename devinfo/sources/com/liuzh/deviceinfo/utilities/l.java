package com.liuzh.deviceinfo.utilities;

import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaDrm;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.sdk.AppLovinMediationProvider;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f21278a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f21279b = {"/sys/class/kgsl/kgsl-3d0/devfreq/cur_freq", "/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/gpuclk", "/sys/class/kgsl/kgsl-3d0/gpuclk", "/sys/devices/platform/gpusysfs/gpu_clock", "/sys/kernel/tegra_gpu/gpu_rate", "/sys/devices/platform/*mali*/clock", "/sys/kernel/debug/ged/hal/current_freqency", "/sys/devices/fdb00000.qcom,kgsl-3d0/kgsl/kgsl-3d0/gpuclk", "/sys/devices/soc.0/1c00000.qcom,kgsl-3d0/kgsl/kgsl-3d0/gpuclk", "/sys/devices/platform/omap/pvrsrvkm.0/sgxfreq/frequency", "/sys/class/devfreq/dfrgx/cur_freq", "/sys/kernel/gpu/gpu_clock", "/sys/class/devfreq/gpufreq/cur_freq"};

    /* renamed from: c, reason: collision with root package name */
    public static final UUID f21280c = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f21281d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Class f21282e;

    /* renamed from: f, reason: collision with root package name */
    public static k f21283f;

    public static float A() {
        String str;
        int i4 = 0;
        while (true) {
            if (i4 >= 13) {
                str = null;
                break;
            }
            str = f21279b[i4];
            if (new File(str).exists()) {
                break;
            }
            i4++;
        }
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            try {
                float f10 = Long.parseLong(bufferedReader.readLine()) / 1000.0f;
                if (f10 > 5000.0f) {
                    f10 /= 1000.0f;
                }
                bufferedReader.close();
                return f10;
            } finally {
            }
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    public static String B(String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (f21282e == null) {
            try {
                f21282e = Class.forName("com.huawei.system.BuildEx");
            } catch (Throwable unused) {
            }
        }
        Class cls = f21282e;
        if (cls == null) {
            return null;
        }
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            Object obj = field.get(cls);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String C() {
        try {
            String property = System.getProperty("java.runtime.name");
            String property2 = System.getProperty("java.runtime.version");
            if (TextUtils.isEmpty(property)) {
                return property2;
            }
            if (TextUtils.isEmpty(property2)) {
                return DeviceInfoApp.f21145f.getString(R.string.unknown);
            }
            return property + " " + property2;
        } catch (Exception unused) {
            return DeviceInfoApp.f21145f.getString(R.string.unknown);
        }
    }

    public static String D() {
        try {
            String property = System.getProperty("java.vm.name");
            String property2 = System.getProperty("java.vm.version");
            if ("DALVIK".equalsIgnoreCase(property) && property2 != null && property2.startsWith("2.")) {
                property = "ART";
            }
            if (TextUtils.isEmpty(property)) {
                return property2;
            }
            if (TextUtils.isEmpty(property2)) {
                return DeviceInfoApp.f21145f.getString(R.string.unknown);
            }
            return property + " " + property2;
        } catch (Exception unused) {
            return DeviceInfoApp.f21145f.getString(R.string.unknown);
        }
    }

    public static String E(Context context, String str) {
        str.getClass();
        switch (str) {
            case "android.control.availableEffects":
                return context.getString(R.string.camera_effects);
            case "android.control.availableVideoStabilizationModes":
                return context.getString(R.string.camera_video_stabilization_modes);
            case "android.scaler.streamConfigurationMap":
                return context.getString(R.string.camera_supported_resolutions);
            case "android.sensor.orientation":
                return context.getString(R.string.camera_orientation);
            case "android.control.awbAvailableModes":
                return context.getString(R.string.camera_auto_white_balance_modes);
            case "android.sensor.info.activeArraySize":
                return context.getString(R.string.camera_active_array_size);
            case "android.sensor.info.pixelArraySize":
                return context.getString(R.string.camera_pixel_array_size);
            case "android.control.aeCompensationStep":
                return context.getString(R.string.camera_compensation_step);
            case "android.lens.info.hyperfocalDistance":
                return context.getString(R.string.camera_hyperfocal_distance);
            case "android.edge.availableEdgeModes":
                return context.getString(R.string.camera_edge_modes);
            case "android.tonemap.maxCurvePoints":
                return context.getString(R.string.camera_maximum_curve_points);
            case "android.lens.info.minimumFocusDistance":
                return context.getString(R.string.camera_minimum_focus_distance);
            case "android.lens.info.availableFilterDensities":
                return context.getString(R.string.camera_filter_densities);
            case "android.control.aeAvailableModes":
                return context.getString(R.string.camera_auto_exposure_modes);
            case "android.shading.availableModes":
                return context.getString(R.string.camera_shading_modes);
            case "android.hotPixel.availableHotPixelModes":
                return context.getString(R.string.camera_hot_pixel_modes);
            case "android.sensor.info.sensitivityRange":
                return context.getString(R.string.camera_sensitivity_range);
            case "android.control.aeCompensationRange":
                return context.getString(R.string.camera_compensation_range);
            case "android.sensor.availableTestPatternModes":
                return context.getString(R.string.camera_test_pattern_modes);
            case "android.control.availableModes":
                return context.getString(R.string.camera_available_modes);
            case "android.statistics.info.availableHotPixelMapModes":
                return context.getString(R.string.camera_hot_pixel_map_modes);
            case "android.request.pipelineMaxDepth":
                return context.getString(R.string.camera_maximum_pipeline_depth);
            case "android.lens.info.availableOpticalStabilization":
                return context.getString(R.string.camera_optical_stabilization);
            case "android.colorCorrection.availableAberrationModes":
                return context.getString(R.string.camera_aberration_modes);
            case "android.control.maxRegionsAe":
                return context.getString(R.string.camera_maximum_auto_exposure_regions);
            case "android.control.maxRegionsAf":
                return context.getString(R.string.camera_maximum_auto_focus_regions);
            case "android.flash.info.available":
                return context.getString(R.string.camera_flash_available);
            case "android.request.maxNumOutputProcStalling":
                return context.getString(R.string.camera_maximum_output_streams_stalling);
            case "android.jpeg.availableThumbnailSizes":
                return context.getString(R.string.camera_thumbnail_sizes);
            case "android.sensor.info.preCorrectionActiveArraySize":
                return context.getString(R.string.camera_pre_correction_active_array_size);
            case "android.sensor.maxAnalogSensitivity":
                return context.getString(R.string.camera_maximum_analog_sensitivity);
            case "android.statistics.info.availableFaceDetectModes":
                return context.getString(R.string.camera_face_detection_modes);
            case "android.control.afAvailableModes":
                return context.getString(R.string.camera_autofocus_modes);
            case "android.request.maxNumInputStreams":
                return context.getString(R.string.camera_maximum_input_streams);
            case "android.control.aeAvailableAntibandingModes":
                return context.getString(R.string.camera_antibanding_modes);
            case "android.sensor.info.colorFilterArrangement":
                return context.getString(R.string.camera_color_filter_arrangement);
            case "android.info.supportedHardwareLevel":
                return context.getString(R.string.camera_hardware_level);
            case "android.statistics.info.maxFaceCount":
                return context.getString(R.string.camera_maximum_face_detectable);
            case "android.control.aeLockAvailable":
                return context.getString(R.string.camera_auto_exposure_lock);
            case "android.sensor.info.physicalSize":
                return context.getString(R.string.camera_sensor_size);
            case "android.request.maxNumOutputRaw":
                return context.getString(R.string.camera_maximum_raw_output_streams);
            case "android.sensor.blackLevelPattern":
                return context.getString(R.string.camera_black_level_pattern);
            case "android.scaler.croppingType":
                return context.getString(R.string.camera_cropping_type);
            case "android.lens.info.availableFocalLengths":
                return context.getString(R.string.camera_focal_lengths);
            case "android.request.availableCapabilities":
                return context.getString(R.string.camera_capabilities);
            case "android.lens.facing":
                return context.getString(R.string.camera_lens_placement);
            case "android.lens.info.availableApertures":
                return context.getString(R.string.camera_apertures);
            case "android.noiseReduction.availableNoiseReductionModes":
                return context.getString(R.string.camera_noise_reduction_modes);
            case "android.request.maxNumOutputProc":
                return context.getString(R.string.camera_maximum_output_streams);
            case "android.control.awbLockAvailable":
                return context.getString(R.string.camera_auto_white_balance_lock);
            case "android.statistics.info.availableLensShadingMapModes":
                return context.getString(R.string.camera_lens_shading_map_modes);
            case "android.request.partialResultCount":
                return context.getString(R.string.camera_partial_results);
            case "android.sensor.info.maxFrameDuration":
                return context.getString(R.string.camera_maximum_frame_duration);
            case "android.tonemap.availableToneMapModes":
                return context.getString(R.string.camera_tone_map_modes);
            case "android.scaler.availableMaxDigitalZoom":
                return context.getString(R.string.camera_maximum_digital_zoom);
            case "android.control.availableSceneModes":
                return context.getString(R.string.camera_scene_modes);
            case "android.sensor.info.exposureTimeRange":
                return context.getString(R.string.camera_exposure_time_range);
            case "android.lens.info.focusDistanceCalibration":
                return context.getString(R.string.camera_focus_distance_calibration);
            case "android.control.maxRegionsAwb":
                return context.getString(R.string.camera_maximum_auto_white_balance_regions);
            case "android.sync.maxLatency":
                return context.getString(R.string.camera_maximum_latency);
            case "android.control.aeAvailableTargetFpsRanges":
                return context.getString(R.string.camera_target_fps_ranges);
            case "android.sensor.info.timestampSource":
                return context.getString(R.string.camera_timestamp_source);
            case "android.sensor.info.whiteLevel":
                return context.getString(R.string.camera_white_level);
            default:
                return str;
        }
    }

    public static String F() {
        String strH0 = h0("/sys/touchscreen/touch_chip_info");
        if (!TextUtils.isEmpty(strH0)) {
            return strH0;
        }
        String strH02 = h0("/sys/devices/platform/huawei_touch/touch_chip_info");
        if (strH02 != null) {
            strH02 = strH02.trim();
        }
        return TextUtils.isEmpty(strH02) ? DeviceInfoApp.f21145f.getString(R.string.unknown) : strH02;
    }

    public static String G(Size size, int i4) {
        if (size == null) {
            return "-";
        }
        float height = (size.getHeight() * size.getWidth()) / 1000000.0f;
        if (i4 != -1) {
            return i4 == 1 ? String.format(Locale.US, "%.1f", Float.valueOf(height)).concat(" MP") : i4 == 2 ? String.format(Locale.US, "%.2f", Float.valueOf(height)).concat(" MP") : String.format(Locale.US, "%.2f", Float.valueOf(height)).concat(" MP");
        }
        int i10 = (int) height;
        float f10 = height - i10;
        if (f10 >= 0.9f) {
            return (i10 + 1) + " MP";
        }
        if (f10 > 0.03f) {
            return String.format(Locale.US, "%.1f MP", Float.valueOf(height));
        }
        return i10 + " MP";
    }

    public static String H() {
        String str;
        String strN;
        if (y.d()) {
            strN = N("ro.config.marketing_name");
            String str2 = Build.MANUFACTURER;
            if ("honor".equalsIgnoreCase(str2)) {
                str = "persist.sys.tran.device.name";
            } else {
                String str3 = Build.BRAND;
                str = "persist.sys.tran.device.name";
                if (!"honor".equalsIgnoreCase(str3.trim())) {
                    if (("huawei".equalsIgnoreCase(str3) || "huawei".equalsIgnoreCase(str2)) && strN != null && vk.p.w0(strN, "PORSCHE DESIGN", true)) {
                        strN = strN.substring(14).trim();
                        if (!vk.p.p0(strN, "RS", true)) {
                            strN = strN.concat(" RS");
                        }
                    }
                }
            }
            if (strN != null) {
                strN = strN.replace("荣耀", "HONOR ").replace("HONOR  ", "HONOR ").trim().replace("竞速版", " Racing").replace("  Racing", " Racing").trim().replace("畅玩", "Play ").replace("Play  ", "Play ").trim();
            }
        } else {
            str = "persist.sys.tran.device.name";
            if (y.e()) {
                strN = N("ro.oppo.market.name");
                if (TextUtils.isEmpty(strN)) {
                    strN = N("ro.vendor.oplus.market.name");
                }
                if (strN != null) {
                    strN = strN.replace("真我", "realme ").replace("realme  ", "realme ").trim().replace("一加", "OnePlus ").replace("OnePlus  ", "OnePlus ").trim().replace("闪速版", "Flash").trim().replace("竞速版", "Racing").trim().replace("活力版", "Energy Edition").trim();
                }
            } else if (y.g()) {
                strN = N("ro.product.marketname");
            } else {
                String str4 = Build.MANUFACTURER;
                if ("vivo".equalsIgnoreCase(str4) || "iqoo".equalsIgnoreCase(str4)) {
                    strN = N("ro.vivo.internet.name");
                    if (TextUtils.isEmpty(strN)) {
                        strN = N("ro.vendor.vivo.market.name");
                    }
                } else if ("zte".equalsIgnoreCase(str4) || "nubia".equalsIgnoreCase(str4)) {
                    strN = N("ro.vendor.product.ztename");
                    if (strN != null) {
                        strN = strN.replace("中兴", "ZTE ").replace("ZTE  ", "ZTE ").trim().replace("游戏手机", "").trim().replace("红魔", "RedMagic ").replace("RedMagic  ", "RedMagic ").trim().replace("山系生活版", " URBAN OUTDOOR").replace("  URBAN OUTDOOR", " URBAN OUTDOOR").trim();
                    }
                } else if ("motorola".equalsIgnoreCase(str4)) {
                    strN = N("ro.product.display");
                } else if (y.f()) {
                    strN = N("transsion.device.name");
                    if (TextUtils.isEmpty(strN)) {
                        strN = N(str);
                    }
                } else {
                    strN = "";
                }
            }
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.product.marketname");
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.vendor.oplus.market.name");
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.oppo.market.name");
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.config.marketing_name");
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.vendor.asus.product.mkt_name");
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.lge.petname");
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.boot.vendor.lge.petname");
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.vendor.vivo.market.name");
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.vivo.internet.name");
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.product.odm.marketname");
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.vendor.product.ztename");
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("transsion.device.name");
            if (TextUtils.isEmpty(strN)) {
                strN = N(str);
            }
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N("ro.product.display");
        }
        if (strN != null) {
            String lowerCase = strN.toLowerCase();
            String str5 = Build.BRAND;
            String lowerCase2 = str5.trim().toLowerCase();
            if (vk.p.w0(lowerCase, lowerCase2, true) && lowerCase.length() - lowerCase2.length() > 5) {
                nk.k.e(strN, "<this>");
                nk.k.e(str5, "oldValue");
                int iF0 = vk.i.F0(strN, str5, 0, true, 2);
                if (iF0 >= 0) {
                    int length = str5.length() + iF0;
                    if (length < iF0) {
                        throw new IndexOutOfBoundsException(r5.c.i(length, "End index (", ") is less than start index (", iF0, ")."));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((CharSequence) strN, 0, iF0);
                    sb2.append((CharSequence) "");
                    sb2.append((CharSequence) strN, length, strN.length());
                    strN = sb2.toString();
                }
                return strN.trim();
            }
        }
        return strN;
    }

    public static k I() {
        k kVar = f21283f;
        if (kVar != null) {
            return kVar;
        }
        try {
            k kVar2 = new k();
            Class<?> cls = Class.forName("ohos.system.DeviceInfo");
            Object objInvoke = cls.getMethod("getDeviceType", null).invoke(null, null);
            String string = "";
            kVar2.f21269a = objInvoke == null ? "" : objInvoke.toString();
            Object objInvoke2 = cls.getMethod("getModel", null).invoke(null, null);
            kVar2.f21270b = objInvoke2 == null ? "" : objInvoke2.toString();
            Object objInvoke3 = cls.getMethod("getName", null).invoke(null, null);
            kVar2.f21271c = objInvoke3 == null ? "" : objInvoke3.toString();
            Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
            kVar2.f21272d = i0(cls2.getMethod("getApiVersion", null).invoke(null, null));
            String strN = N("persist.sys.ohc.apiversion");
            if (!TextUtils.isEmpty(strN)) {
                try {
                    kVar2.f21272d = Integer.parseInt(strN);
                } catch (NumberFormatException unused) {
                }
            }
            int i4 = kVar2.f21272d;
            if (i4 >= 9 || i4 <= 0) {
                kVar2.f21275h = N("persist.sys.ohc.releasetype");
            } else {
                kVar2.f21273e = i0(cls2.getMethod("getBuildVersion", null).invoke(null, null));
                kVar2.f21274f = i0(cls2.getMethod("getFeatureVersion", null).invoke(null, null));
                kVar2.g = i0(cls2.getMethod("getMajorVersion", null).invoke(null, null));
                Object objInvoke4 = cls2.getMethod("getReleaseType", null).invoke(null, null);
                kVar2.f21275h = objInvoke4 == null ? "" : objInvoke4.toString();
                kVar2.f21276i = i0(cls2.getMethod("getSeniorVersion", null).invoke(null, null));
                Object objInvoke5 = cls2.getMethod("getVersion", null).invoke(null, null);
                if (objInvoke5 != null) {
                    string = objInvoke5.toString();
                }
                kVar2.j = string;
            }
            String strN2 = N("hw_sc.build.platform.version");
            if (TextUtils.isEmpty(strN2)) {
                strN2 = DeviceInfoApp.f21145f.getString(R.string.unknown);
            }
            kVar2.f21277k = strN2;
            f21283f = kVar2;
        } catch (Throwable unused2) {
        }
        return f21283f;
    }

    public static String J() {
        ActivityManager activityManager = (ActivityManager) DeviceInfoApp.f21145f.getSystemService("activity");
        if (activityManager != null) {
            return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
        }
        String strN = N("ro.opengles.version");
        return strN != null ? strN : DeviceInfoApp.f21145f.getString(R.string.unknown);
    }

    public static String K() {
        try {
            String property = System.getProperty("android.openssl.version");
            return TextUtils.isEmpty(property) ? DeviceInfoApp.f21145f.getString(R.string.unknown) : property;
        } catch (Exception unused) {
            return DeviceInfoApp.f21145f.getString(R.string.unknown);
        }
    }

    public static String L() {
        String strSubstring;
        StringBuilder sb2 = new StringBuilder();
        if (new File("/proc/cpuinfo").exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line + "ndeviceinfo");
                    } finally {
                    }
                }
                bufferedReader.close();
            } catch (Exception unused) {
            }
            String[] strArrSplit = sb2.toString().split(":");
            int i4 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= strArrSplit.length) {
                    break;
                }
                if (strArrSplit[i10].toLowerCase().contains("processor")) {
                    int i11 = i10 + 1;
                    int iIndexOf = strArrSplit[i11].indexOf("ndeviceinfo");
                    strSubstring = iIndexOf != -1 ? strArrSplit[i11].substring(1, iIndexOf) : "";
                } else {
                    i10++;
                }
            }
            if (strSubstring.equals("0") || strSubstring.isEmpty()) {
                while (true) {
                    if (i4 >= strArrSplit.length) {
                        break;
                    }
                    if (strArrSplit[i4].contains("model name")) {
                        int i12 = i4 + 1;
                        int iIndexOf2 = strArrSplit[i12].indexOf("ndeviceinfo");
                        if (iIndexOf2 != -1) {
                            strSubstring = strArrSplit[i12].substring(1, iIndexOf2);
                        }
                    } else {
                        i4++;
                    }
                }
            }
        } else {
            strSubstring = "";
        }
        return (TextUtils.isEmpty(strSubstring) || strSubstring.equals("0")) ? "" : strSubstring;
    }

    public static String M() {
        File file = new File("/proc/cpuinfo");
        if (!file.exists()) {
            return "";
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        break;
                    }
                    if (line.toLowerCase().contains("hardware")) {
                        String[] strArrSplit = line.split(":");
                        if (strArrSplit.length == 2) {
                            String strTrim = strArrSplit[1].trim();
                            bufferedReader.close();
                            return strTrim;
                        }
                    }
                } finally {
                }
            }
        } catch (IOException unused) {
        }
        return "";
    }

    public static String N(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String O(Range range) {
        try {
            return "[" + ((Integer) range.getLower()).toString() + "," + ((Integer) range.getUpper()).toString() + "]";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String P(Configuration configuration) {
        int i4 = configuration.orientation;
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? DeviceInfoApp.f21145f.getString(R.string.unknown) : DeviceInfoApp.f21145f.getString(R.string.orientation_landscape) : DeviceInfoApp.f21145f.getString(R.string.orientation_portrait) : DeviceInfoApp.f21145f.getString(R.string.orientation_undefined);
    }

    public static String Q(Configuration configuration) {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        int i4 = configuration.screenLayout & 15;
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? deviceInfoApp.getString(R.string.unknown) : deviceInfoApp.getString(R.string.xlarge_screen) : deviceInfoApp.getString(R.string.large_screen) : deviceInfoApp.getString(R.string.normal_screen) : deviceInfoApp.getString(R.string.small_screen);
    }

    public static String R() throws Settings.SettingNotFoundException {
        try {
            return (Settings.System.getInt(DeviceInfoApp.f21145f.getContentResolver(), "screen_off_timeout") / 1000) + " " + DeviceInfoApp.f21145f.getString(R.string.seconds);
        } catch (Settings.SettingNotFoundException unused) {
            return DeviceInfoApp.f21145f.getString(R.string.unknown);
        }
    }

    public static String S(Context context) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec("getenforce");
                processExec.waitFor();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    } catch (Exception unused) {
                        bufferedReader = bufferedReader2;
                        String string = context.getString(R.string.not_supported);
                        String[] strArr = h.f21261a;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return string;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        String[] strArr2 = h.f21261a;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                String[] strArr3 = h.f21261a;
                try {
                    bufferedReader2.close();
                } catch (IOException unused4) {
                }
                String string2 = sb2.toString();
                return TextUtils.isEmpty(string2) ? context.getString(R.string.unable_to_determine) : string2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused5) {
        }
    }

    public static String[] T(Context context) {
        String str = System.getenv("SECONDARY_STORAGE");
        ArrayList arrayList = new ArrayList();
        File[] externalFilesDirs = context.getExternalFilesDirs(null);
        if (externalFilesDirs == null || externalFilesDirs.length == 0) {
            return null;
        }
        for (File file : externalFilesDirs) {
            if (file != null) {
                String str2 = file.getPath().split("/Android")[0];
                if (Environment.isExternalStorageRemovable(file) || (str != null && str.contains(str2))) {
                    arrayList.add(str2);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String U() {
        StringBuilder sb2 = new StringBuilder();
        int i4 = 0;
        while (true) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (i4 >= strArr.length) {
                return sb2.substring(0, sb2.length() - 2);
            }
            sb2.append(strArr[i4]);
            sb2.append(", ");
            i4++;
        }
    }

    public static String V(long j) {
        if (j < 0) {
            return "00:00:00";
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j);
        long minutes = timeUnit.toMinutes(j);
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes - TimeUnit.HOURS.toMinutes(hours)), Long.valueOf(timeUnit.toSeconds(j) - TimeUnit.MINUTES.toSeconds(minutes)));
    }

    public static String W() {
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        boolean zInDaylightTime = timeZone.inDaylightTime(new Date());
        String displayName = timeZone.getDisplayName(zInDaylightTime, 1);
        if (displayName == null || displayName.length() <= 0) {
            return timeZone.getDisplayName();
        }
        int rawOffset = timeZone.getRawOffset();
        if (zInDaylightTime) {
            rawOffset += timeZone.getDSTSavings();
        }
        int iAbs = rawOffset / 60000;
        if (iAbs < 0) {
            iAbs = Math.abs(iAbs);
            str = "-";
        } else {
            str = "+";
        }
        return displayName.concat(String.format(Locale.getDefault(), "(GMT%s%02d:%02d)", str, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)));
    }

    public static String X() {
        if (!wi.h.f36756a) {
            return DeviceInfoApp.f21145f.getString(R.string.not_supported);
        }
        PackageManager packageManagerA = DeviceInfoApp.f21145f.a();
        if (packageManagerA == null) {
            return DeviceInfoApp.f21145f.getString(R.string.unknown);
        }
        FeatureInfo[] systemAvailableFeatures = packageManagerA.getSystemAvailableFeatures();
        if (systemAvailableFeatures.length == 0) {
            return DeviceInfoApp.f21145f.getString(R.string.unknown);
        }
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if ("android.hardware.vulkan.version".equals(featureInfo.name)) {
                int i4 = featureInfo.version;
                int i10 = (i4 >> 22) & 1023;
                int i11 = (i4 >> 12) & 1023;
                int i12 = i4 & 4095;
                return i10 + "." + i11 + (i12 > 0 ? je.u.r(i12, ".") : "");
            }
        }
        return packageManagerA.hasSystemFeature("android.hardware.vulkan.level") ? "1.0" : DeviceInfoApp.f21145f.getString(R.string.not_supported);
    }

    public static String Y() throws SocketException {
        String string = DeviceInfoApp.f21145f.getString(R.string.unknown);
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = list.get(i4);
                i4++;
                NetworkInterface networkInterface = (NetworkInterface) obj;
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : hardwareAddress) {
                        sb2.append(String.format("%02X:", Byte.valueOf(b10)));
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    String strTrim = sb2.toString().trim();
                    if (TextUtils.isEmpty(strTrim)) {
                        break;
                    }
                    string = strTrim;
                }
            }
        } catch (Exception unused) {
        }
        return string;
    }

    public static boolean Z() {
        if (f21281d == null) {
            String str = null;
            try {
                if (f21282e == null) {
                    try {
                        f21282e = Class.forName("com.huawei.system.BuildEx");
                    } catch (Throwable unused) {
                    }
                }
                Class cls = f21282e;
                if (cls != null) {
                    str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
                }
            } catch (Throwable unused2) {
            }
            f21281d = Boolean.valueOf("harmony".equalsIgnoreCase(str));
        }
        return f21281d.booleanValue();
    }

    public static String a(int i4, ContextWrapper contextWrapper) {
        switch (i4) {
            case 1:
                return contextWrapper.getString(R.string.sensor_accelerometer);
            case 2:
                return contextWrapper.getString(R.string.sensor_magnetic_field);
            case 3:
                return contextWrapper.getString(R.string.sensor_orientation);
            case 4:
                return contextWrapper.getString(R.string.sensor_gyroscope);
            case 5:
                return contextWrapper.getString(R.string.sensor_light);
            case 6:
                return contextWrapper.getString(R.string.sensor_pressure);
            case 7:
                return contextWrapper.getString(R.string.sensor_temperature);
            case 8:
                return contextWrapper.getString(R.string.sensor_proximity);
            case 9:
                return contextWrapper.getString(R.string.sensor_gravity);
            case 10:
                return contextWrapper.getString(R.string.sensor_linear_acceleration);
            case 11:
                return contextWrapper.getString(R.string.sensor_rotation_vector);
            case 12:
                return contextWrapper.getString(R.string.sensor_relative_humidity);
            case 13:
                return contextWrapper.getString(R.string.sensor_ambient_temperature);
            case 14:
                return contextWrapper.getString(R.string.sensor_magnetic_field_uncalibrated);
            case 15:
                return contextWrapper.getString(R.string.sensor_game_rotation_vector);
            case 16:
                return contextWrapper.getString(R.string.sensor_gyroscope_uncalibrated);
            case 17:
                return contextWrapper.getString(R.string.sensor_significant_motion);
            case 18:
                return contextWrapper.getString(R.string.sensor_step_detector);
            case 19:
                return contextWrapper.getString(R.string.sensor_step_counter);
            case 20:
                return contextWrapper.getString(R.string.sensor_geomagnetic_rotation_vector);
            case 21:
                return contextWrapper.getString(R.string.sensor_heart_rate);
            case 22:
                return contextWrapper.getString(R.string.sensor_tilt_detector);
            case 23:
                return contextWrapper.getString(R.string.sensor_wake_gesture);
            case 24:
                return contextWrapper.getString(R.string.sensor_glance_gesture);
            case 25:
                return contextWrapper.getString(R.string.sensor_pickup_gesture);
            case 26:
                return contextWrapper.getString(R.string.sensor_wrist_tilt_detector);
            case 27:
                return contextWrapper.getString(R.string.sensor_device_orientation);
            case 28:
                return contextWrapper.getString(R.string.sensor_pose_6dof);
            case 29:
                return contextWrapper.getString(R.string.sensor_stationary_detect);
            case 30:
                return contextWrapper.getString(R.string.sensor_motion_detect);
            case 31:
                return contextWrapper.getString(R.string.sensor_heart_beat);
            case 32:
                return contextWrapper.getString(R.string.sensor_dynamic_sensor_meta);
            case 33:
                return contextWrapper.getString(R.string.sensor_additional_info);
            case 34:
                return contextWrapper.getString(R.string.sensor_low_latency_offbody_detect);
            case 35:
                return contextWrapper.getString(R.string.sensor_accelerometer_uncalibrated);
            default:
                return contextWrapper.getString(R.string.unknown);
        }
    }

    public static boolean a0(String str) throws NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String strTrim = str.toLowerCase().trim();
        try {
            Integer.parseInt(strTrim);
            return true;
        } catch (NumberFormatException unused) {
            return strTrim.equals(Build.MODEL.trim().toLowerCase()) || strTrim.equals(Build.DEVICE.trim().toLowerCase()) || "qcom".equals(strTrim) || "ranchu".equals(strTrim) || "ndk_translation".equals(strTrim) || strTrim.contains(AppLovinMediationProvider.UNKNOWN) || "kirin".equals(strTrim) || "kona".equals(strTrim) || "tensor".equals(strTrim) || "null".equals(strTrim) || "default".equals(strTrim) || "windows_x86_64".equals(strTrim) || "android_x86_64".equals(strTrim) || "placeholder".equals(strTrim) || "windows".equals(strTrim) || strTrim.length() <= 4;
        }
    }

    public static String b(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? "" : "SIP" : "CDMA" : "GSM" : "None";
    }

    public static boolean b0() {
        String str = Build.TAGS;
        return (str != null && str.contains("test-keys")) || d("/system/xbin/which su") || d("/system/bin/which su") || d("which su");
    }

    public static boolean c(int i4) {
        return i4 == R.drawable.ic_brand_meizu || i4 == R.drawable.ic_brand_samsung || i4 == R.drawable.ic_brand_realme || i4 == R.drawable.ic_brand_nubia || i4 == R.drawable.ic_brand_hisense || i4 == R.drawable.ic_brand_sharp;
    }

    public static ArrayList c0() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < Runtime.getRuntime().availableProcessors(); i4++) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/scaling_cur_freq", "r");
                try {
                    double d10 = Double.parseDouble(randomAccessFile.readLine()) / 1000.0d;
                    arrayList.add(new vg.b(DeviceInfoApp.f21145f.getString(R.string.core) + " " + (i4 + 1), ((int) d10) + " Mhz"));
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Exception unused) {
                arrayList.add(new vg.b(DeviceInfoApp.f21145f.getString(R.string.core) + " " + (i4 + 1), DeviceInfoApp.f21145f.getString(R.string.idle)));
            }
        }
        return arrayList;
    }

    public static boolean d(String str) {
        try {
            return Runtime.getRuntime().exec(str).waitFor() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static ArrayList d0() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        Pair pairY;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = new File("/sys/devices/virtual/thermal/").listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file.getAbsolutePath() + "/temp"));
                    try {
                        bufferedReader2 = new BufferedReader(new FileReader(file.getAbsolutePath() + "/type"));
                    } finally {
                    }
                } catch (IOException unused) {
                    continue;
                }
                try {
                    String line = bufferedReader2.readLine();
                    String line2 = bufferedReader.readLine();
                    if (!TextUtils.isEmpty(line2) && !line2.trim().equals("0") && (pairY = y(line2)) != null && !TextUtils.isEmpty((CharSequence) pairY.first)) {
                        arrayList.add(new vg.e(line, (String) pairY.first, ((Float) pairY.second).floatValue()));
                    }
                    bufferedReader2.close();
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    public static HashMap e() {
        HashMap map = new HashMap();
        String strM = M();
        if (!TextUtils.isEmpty(strM)) {
            map.put("proc_cpuinfo", strM);
        }
        String str = Build.HARDWARE;
        if (!a0(str)) {
            map.put("build.hardware", str);
        }
        g0(map, "ro.soc.model");
        g0(map, "ro.hardware.chipname");
        g0(map, "ro.chipname");
        g0(map, "ro.board.platform");
        g0(map, "ro.mediatek.platform");
        g0(map, "ro.vendor.soc.model.part_name");
        return map;
    }

    public static int e0(String str) {
        str.getClass();
        switch (str) {
            case "blackshark":
                return R.drawable.ic_brand_blackshark;
            case "smartisan":
                return R.drawable.ic_brand_smartisan;
            case "oneplus":
                return R.drawable.ic_brand_oneplus;
            case "google":
                return R.drawable.ic_brand_google;
            case "huawei":
                return R.drawable.ic_brand_huawei;
            case "lebest":
                return R.drawable.ic_brand_lebest;
            case "lenovo":
                return R.drawable.ic_brand_lenovo;
            case "realme":
                return R.drawable.ic_brand_realme;
            case "xiaomi":
                return R.drawable.ic_brand_mi;
            case "unihertz":
                return R.drawable.ic_brand_unihertz;
            case "motorola":
                return R.drawable.ic_brand_moto;
            case "lg":
            case "lge":
                return R.drawable.ic_brand_lg;
            case "zte":
                return R.drawable.ic_brand_zte;
            case "asus":
                return R.drawable.ic_brand_asus;
            case "iqoo":
                return R.drawable.ic_brand_iqoo;
            case "oppo":
                return R.drawable.ic_brand_oppo;
            case "poco":
                return R.drawable.ic_brand_poco;
            case "sony":
                return R.drawable.ic_brand_sony;
            case "vivo":
                return R.drawable.ic_brand_vivo;
            case "honor":
                return R.drawable.ic_brand_honor;
            case "meizu":
                return R.drawable.ic_brand_meizu;
            case "nokia":
                return R.drawable.ic_brand_nokia;
            case "nubia":
                return R.drawable.ic_brand_nubia;
            case "redmi":
                return R.drawable.ic_brand_redmi;
            case "sharp":
                return R.drawable.ic_brand_sharp;
            case "hisense":
                return R.drawable.ic_brand_hisense;
            case "coolpad":
                return R.drawable.ic_brand_coolpad;
            case "windows":
            case "microsoft corporation":
                return R.drawable.ic_brand_ms;
            case "chinatelecom":
                return R.drawable.ic_brand_china_telecom;
            case "samsung":
                return R.drawable.ic_brand_samsung;
            default:
                return R.drawable.ic_phone_android;
        }
    }

    public static long f() {
        BatteryManager batteryManager = (BatteryManager) DeviceInfoApp.f21145f.getSystemService("batterymanager");
        if (batteryManager == null) {
            return -1L;
        }
        try {
            return batteryManager.computeChargeTimeRemaining();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static String f0(int i4) {
        switch (i4) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
            case 6:
            case 12:
                return "EVDO";
            case 7:
                return "RTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "IDEN";
            case 13:
                return "LTE";
            case 14:
                return "EHRPD";
            case 15:
                return "HSPAP";
            case 16:
                return "GSM";
            case 17:
                return "TD_SCDMA";
            case 18:
                return "IWLAN";
            case 19:
            default:
                return DeviceInfoApp.f21145f.getString(R.string.unknown);
            case 20:
                return "NR";
        }
    }

    public static List g() throws Throwable {
        MediaDrm mediaDrm;
        Throwable th2;
        MediaDrm mediaDrm2 = null;
        try {
            try {
                mediaDrm = new MediaDrm(f21280c);
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Pair(DeviceInfoApp.f21145f.getString(R.string.vendor), mediaDrm.getPropertyString("vendor")));
                    arrayList.add(new Pair(DeviceInfoApp.f21145f.getString(R.string.version), mediaDrm.getPropertyString("version")));
                    arrayList.add(new Pair(DeviceInfoApp.f21145f.getString(R.string.description), mediaDrm.getPropertyString("description")));
                    arrayList.add(new Pair(DeviceInfoApp.f21145f.getString(R.string.algorithm), mediaDrm.getPropertyString("algorithms")));
                    arrayList.add(new Pair(DeviceInfoApp.f21145f.getString(R.string.security_level), mediaDrm.getPropertyString("securityLevel")));
                    arrayList.add(new Pair(DeviceInfoApp.f21145f.getString(R.string.system_id), mediaDrm.getPropertyString("systemId")));
                    arrayList.add(new Pair(DeviceInfoApp.f21145f.getString(R.string.hdcp_level), mediaDrm.getPropertyString("hdcpLevel")));
                    arrayList.add(new Pair(DeviceInfoApp.f21145f.getString(R.string.max_hdcp_level), mediaDrm.getPropertyString("maxHdcpLevel")));
                    arrayList.add(new Pair(DeviceInfoApp.f21145f.getString(R.string.usage_reporting_support), mediaDrm.getPropertyString("usageReportingSupport")));
                    arrayList.add(new Pair(DeviceInfoApp.f21145f.getString(R.string.max_number_of_sessions), mediaDrm.getPropertyString("maxNumberOfSessions")));
                    arrayList.add(new Pair(DeviceInfoApp.f21145f.getString(R.string.number_of_open_sessions), mediaDrm.getPropertyString("numberOfOpenSessions")));
                    mediaDrm.release();
                    return arrayList;
                } catch (Exception unused) {
                    mediaDrm2 = mediaDrm;
                    List list = Collections.EMPTY_LIST;
                    if (mediaDrm2 != null) {
                        mediaDrm2.release();
                    }
                    return list;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (mediaDrm != null) {
                        mediaDrm.release();
                    }
                    throw th2;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th4) {
            mediaDrm = mediaDrm2;
            th2 = th4;
        }
    }

    public static void g0(HashMap map, String str) {
        String strN = N(str);
        if (a0(strN)) {
            return;
        }
        map.put(str, strN);
    }

    public static List h() {
        ArrayList arrayList = new ArrayList();
        SensorManager sensorManager = (SensorManager) DeviceInfoApp.f21145f.getSystemService("sensor");
        if (sensorManager == null) {
            return Collections.EMPTY_LIST;
        }
        List<Sensor> sensorList = sensorManager.getSensorList(-1);
        String string = DeviceInfoApp.f21145f.getString(R.string.unknown);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Sensor sensor : sensorList) {
            String name = sensor.getName();
            String str = DeviceInfoApp.f21145f.getString(R.string.vendor) + " : " + sensor.getVendor();
            String strA = a(sensor.getType(), DeviceInfoApp.f21145f);
            String str2 = DeviceInfoApp.f21145f.getString(R.string.wake_up_sensor) + " : " + DeviceInfoApp.f21145f.getString(sensor.isWakeUpSensor() ? R.string.yes : R.string.no);
            String str3 = DeviceInfoApp.f21145f.getString(R.string.power) + " : " + sensor.getPower() + "mA";
            int type = sensor.getType();
            vg.d dVar = new vg.d();
            dVar.f36232f = type;
            dVar.f36227a = name;
            dVar.f36228b = str;
            dVar.f36229c = strA;
            dVar.f36230d = str2;
            dVar.f36231e = str3;
            dVar.g = (type == 1 || type == 35 || type == 10) ? R.drawable.ic_sensor_speedometer_with_bottom : type == 5 ? R.drawable.ic_sensor_light_vector_icons : (type == 19 || type == 18) ? R.drawable.ic_sensor_steps : (type == 11 || type == 20 || type == 15) ? R.drawable.ic_sensor_screen_rotation : type == 9 ? R.drawable.ic_sensor_earth : type == 2 ? R.drawable.ic_sensor_inclined_magnet : type == 14 ? R.drawable.ic_sensor_magnet_with_bolt : type == 8 ? R.drawable.ic_sensor_ibeacon_proximity : type == 3 ? R.drawable.ic_sensor_camping_nature : (type == 4 || type == 16) ? R.drawable.ic_sensor_worldwide_communications : type == 6 ? R.drawable.ic_sensor_pressure : type == 12 ? R.drawable.ic_sensor_humidity : type == 13 ? R.drawable.ic_sensor_temperature : (type == 31 || type == 21) ? R.drawable.ic_sensor_cardiogram : R.drawable.ic_sensor_speedometer;
            if (strA.equals(string)) {
                arrayList3.add(dVar);
            } else {
                arrayList2.add(dVar);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public static String h0(String str) {
        File file = new File(str);
        String line = "";
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    line = bufferedReader.readLine();
                    bufferedReader.close();
                    return line;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return line;
    }

    public static double i() {
        double dDoubleValue;
        BatteryManager batteryManager;
        try {
            dDoubleValue = ((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(DeviceInfoApp.f21145f), null)).doubleValue();
        } catch (Throwable unused) {
            dDoubleValue = -1.0d;
        }
        return (dDoubleValue > 0.0d || (batteryManager = (BatteryManager) DeviceInfoApp.f21145f.getSystemService("batterymanager")) == null) ? dDoubleValue : batteryManager.getIntProperty(4);
    }

    public static int i0(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    public static int j() {
        BatteryManager batteryManager = (BatteryManager) DeviceInfoApp.f21145f.getSystemService("batterymanager");
        if (batteryManager == null) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        int intProperty = batteryManager.getIntProperty(2);
        if (intProperty >= 20000 || intProperty <= -20000) {
            intProperty /= 1000;
        }
        f fVar = f.f21256b;
        return f.f21257c.getBoolean("double_battery_current", false) ? intProperty * 2 : intProperty;
    }

    public static String k(int i4, Context context) {
        return i4 == 7 ? context.getString(R.string.cold) : i4 == 4 ? context.getString(R.string.dead) : i4 == 2 ? context.getString(R.string.good) : i4 == 5 ? context.getString(R.string.over_voltage) : i4 == 3 ? context.getString(R.string.overheat) : i4 == 1 ? context.getString(R.string.unknown) : i4 == 6 ? context.getString(R.string.battery_failure) : context.getString(R.string.not_available);
    }

    public static String l(int i4, Context context) {
        return i4 == 2 ? context.getString(R.string.usb_port) : i4 == 1 ? context.getString(R.string.ac) : i4 == 4 ? context.getString(R.string.battery_plugged_wireless) : (wi.h.f36762h && i4 == 8) ? context.getString(R.string.battery_plugged_dock) : context.getString(R.string.battery);
    }

    public static String m(int i4, Context context) {
        return i4 == 2 ? context.getString(R.string.charging) : i4 == 3 ? context.getString(R.string.discharging) : i4 == 5 ? context.getString(R.string.battery_full) : i4 == 1 ? context.getString(R.string.unknown) : i4 == 4 ? context.getString(R.string.not_charging) : context.getString(R.string.not_available);
    }

    public static String n(Context context) {
        String string;
        String string2 = DeviceInfoApp.f21145f.getString(R.string.unknown);
        try {
            string = Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
            if (string != null) {
                string = string.trim();
            }
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(string) ? string : string2;
    }

    public static String o() throws Settings.SettingNotFoundException {
        String string = DeviceInfoApp.f21145f.getString(R.string.unknown);
        try {
            int i4 = Settings.System.getInt(DeviceInfoApp.f21145f.getContentResolver(), "screen_brightness_mode");
            return i4 == 1 ? DeviceInfoApp.f21145f.getString(R.string.adaptive) : i4 == 0 ? DeviceInfoApp.f21145f.getString(R.string.manual) : string;
        } catch (Settings.SettingNotFoundException unused) {
            return string;
        }
    }

    public static String p() {
        if (new File("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor").exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor"));
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    return line;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return DeviceInfoApp.f21145f.getString(R.string.unknown);
    }

    public static String q(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        if (key == CameraCharacteristics.COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES) {
            int[] iArr = (int[]) cameraCharacteristics.get(key);
            if (iArr == null) {
                iArr = new int[0];
            }
            int length = iArr.length;
            while (i4 < length) {
                int i10 = iArr[i4];
                if (i10 == 0) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                } else if (i10 == 1) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_fast));
                } else if (i10 == 2) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_high_quality));
                }
                i4++;
            }
        } else if (key == CameraCharacteristics.CONTROL_AE_AVAILABLE_ANTIBANDING_MODES) {
            int[] iArr2 = (int[]) cameraCharacteristics.get(key);
            if (iArr2 == null) {
                iArr2 = new int[0];
            }
            int length2 = iArr2.length;
            while (i4 < length2) {
                int i11 = iArr2[i4];
                if (i11 == 0) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                } else if (i11 == 3) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.auto));
                } else if (i11 == 1) {
                    arrayList.add("50Hz");
                } else if (i11 == 2) {
                    arrayList.add("60Hz");
                }
                i4++;
            }
        } else if (key == CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) {
            int[] iArr3 = (int[]) cameraCharacteristics.get(key);
            if (iArr3 == null) {
                iArr3 = new int[0];
            }
            int length3 = iArr3.length;
            while (i4 < length3) {
                int i12 = iArr3[i4];
                if (i12 == 0) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                } else if (i12 == 1) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.on));
                } else if (i12 == 3) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_always_flash));
                } else if (i12 == 2) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_auto_flash));
                } else if (i12 == 4) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_auto_flash_redeye));
                }
                i4++;
            }
        } else if (key == CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES) {
            Range[] rangeArr = (Range[]) cameraCharacteristics.get(key);
            if (rangeArr != null) {
                int length4 = rangeArr.length;
                while (i4 < length4) {
                    arrayList.add(O(rangeArr[i4]));
                    i4++;
                }
            }
        } else if (key == CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE) {
            Range range = (Range) cameraCharacteristics.get(key);
            Objects.requireNonNull(range);
            arrayList.add(O(range));
        } else if (key == CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP) {
            Rational rational = (Rational) cameraCharacteristics.get(key);
            Objects.requireNonNull(rational);
            arrayList.add(rational.toString());
        } else if (key == CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES) {
            int[] iArr4 = (int[]) cameraCharacteristics.get(key);
            if (iArr4 == null) {
                iArr4 = new int[0];
            }
            int length5 = iArr4.length;
            while (i4 < length5) {
                int i13 = iArr4[i4];
                if (i13 == 0) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                } else if (i13 == 1) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.auto));
                } else if (i13 == 5) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_edof));
                } else if (i13 == 2) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_macro));
                } else if (i13 == 4) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_continuous_picture));
                } else if (i13 == 3) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_continuous_video));
                }
                i4++;
            }
        } else {
            int i14 = 8;
            if (key == CameraCharacteristics.CONTROL_AVAILABLE_EFFECTS) {
                int[] iArr5 = (int[]) cameraCharacteristics.get(key);
                if (iArr5 == null) {
                    iArr5 = new int[0];
                }
                int length6 = iArr5.length;
                while (i4 < length6) {
                    int i15 = iArr5[i4];
                    if (i15 == 0) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                    } else if (i15 == 8) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_aqua));
                    } else if (i15 == 7) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_blackboard));
                    } else if (i15 == 1) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_mono));
                    } else if (i15 == 2) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_negative));
                    } else if (i15 == 5) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_posterize));
                    } else if (i15 == 4) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_sepia));
                    } else if (i15 == 3) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_solarize));
                    } else if (i15 == 6) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_whiteboard));
                    }
                    i4++;
                }
            } else if (key == CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES) {
                int[] iArr6 = (int[]) cameraCharacteristics.get(key);
                if (iArr6 == null) {
                    iArr6 = new int[0];
                }
                int length7 = iArr6.length;
                while (i4 < length7) {
                    int i16 = iArr6[i4];
                    if (i16 == 0) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.disabled));
                    } else if (i16 == 2) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_action));
                    } else if (i16 == 16) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_barcode));
                    } else if (i16 == 8) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_beach));
                    } else if (i16 == 15) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_candlelight));
                    } else if (i16 == 1) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_face_priority));
                    } else if (i16 == 12) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_fireworks));
                    } else if (i16 == 18) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_hdr));
                    } else if (i16 == 4) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_landscape));
                    } else if (i16 == 5) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_night));
                    } else if (i16 == 6) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_night_portrait));
                    } else if (i16 == 14) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_party));
                    } else if (i16 == 3) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_portrait));
                    } else if (i16 == 9) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_snow));
                    } else if (i16 == 13) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_sports));
                    } else if (i16 == 11) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_steady_photo));
                    } else if (i16 == 10) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_sunset));
                    } else if (i16 == 7) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_theatre));
                    } else if (i16 == 17) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_high_speed_video));
                    }
                    i4++;
                }
            } else if (key == CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES) {
                int[] iArr7 = (int[]) cameraCharacteristics.get(key);
                if (iArr7 == null) {
                    iArr7 = new int[0];
                }
                int length8 = iArr7.length;
                while (i4 < length8) {
                    int i17 = iArr7[i4];
                    if (i17 == 1) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.on));
                    } else if (i17 == 0) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                    }
                    i4++;
                }
            } else if (key == CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES) {
                int[] iArr8 = (int[]) cameraCharacteristics.get(key);
                if (iArr8 == null) {
                    iArr8 = new int[0];
                }
                int length9 = iArr8.length;
                while (i4 < length9) {
                    int i18 = iArr8[i4];
                    if (i18 == 0) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                    } else if (i18 == 1) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.auto));
                    } else if (i18 == 6) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_cloudy_daylight));
                    } else if (i18 == 5) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_daylight));
                    } else if (i18 == 3) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_fluorescent));
                    } else if (i18 == 2) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_incandescent));
                    } else if (i18 == 8) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_shade));
                    } else if (i18 == 7) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_twilight));
                    } else if (i18 == 4) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_warm_fluorescent));
                    }
                    i4++;
                }
            } else if (key == CameraCharacteristics.CONTROL_MAX_REGIONS_AE || key == CameraCharacteristics.CONTROL_MAX_REGIONS_AF || key == CameraCharacteristics.CONTROL_MAX_REGIONS_AWB) {
                arrayList.add(String.valueOf((Integer) cameraCharacteristics.get(key)));
            } else if (key == CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES) {
                int[] iArr9 = (int[]) cameraCharacteristics.get(key);
                if (iArr9 == null) {
                    iArr9 = new int[0];
                }
                int length10 = iArr9.length;
                while (i4 < length10) {
                    int i19 = iArr9[i4];
                    if (i19 == 0) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                    } else if (i19 == 1) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_fast));
                    } else if (i19 == 2) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_high_quality));
                    } else if (i19 == 3) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_zero_shutter_lag));
                    }
                    i4++;
                }
            } else if (key == CameraCharacteristics.FLASH_INFO_AVAILABLE) {
                Boolean bool = (Boolean) cameraCharacteristics.get(key);
                if (bool != null) {
                    arrayList.add(DeviceInfoApp.f21145f.getString(bool.booleanValue() ? R.string.yes : R.string.no));
                }
            } else if (key == CameraCharacteristics.HOT_PIXEL_AVAILABLE_HOT_PIXEL_MODES) {
                int[] iArr10 = (int[]) cameraCharacteristics.get(key);
                if (iArr10 == null) {
                    iArr10 = new int[0];
                }
                int length11 = iArr10.length;
                while (i4 < length11) {
                    int i20 = iArr10[i4];
                    if (i20 == 0) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                    } else if (i20 == 1) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_fast));
                    } else {
                        if (i20 == 2) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_high_quality));
                        }
                        i4++;
                    }
                    i4++;
                }
            } else {
                if (key == CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) {
                    Object obj = cameraCharacteristics.get(key);
                    int iIntValue = obj != null ? ((Integer) obj).intValue() : -1;
                    if (iIntValue == 3) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_level_3));
                    } else if (iIntValue == 4) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.external));
                    } else if (iIntValue == 1) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_full));
                    } else if (iIntValue == 2) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_legacy));
                    } else if (iIntValue == 0) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_limited));
                    } else {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.unknown));
                    }
                } else if (key == CameraCharacteristics.JPEG_AVAILABLE_THUMBNAIL_SIZES) {
                    Size[] sizeArr = (Size[]) cameraCharacteristics.get(key);
                    if (sizeArr == null) {
                        sizeArr = new Size[0];
                    }
                    int length12 = sizeArr.length;
                    while (i4 < length12) {
                        Size size = sizeArr[i4];
                        arrayList.add(size.getWidth() + " x " + size.getHeight());
                        i4++;
                    }
                } else if (key == CameraCharacteristics.LENS_FACING) {
                    Object obj2 = cameraCharacteristics.get(key);
                    int iIntValue2 = obj2 != null ? ((Integer) obj2).intValue() : -1;
                    if (iIntValue2 == 1) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.camera_back));
                    } else if (iIntValue2 == 2) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.external));
                    } else if (iIntValue2 == 0) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.camera_front));
                    } else {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.unknown));
                    }
                } else if (key == CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES) {
                    float[] fArr = (float[]) cameraCharacteristics.get(key);
                    if (fArr == null) {
                        fArr = new float[0];
                    }
                    int length13 = fArr.length;
                    while (i4 < length13) {
                        arrayList.add(String.valueOf(fArr[i4]));
                        i4++;
                    }
                } else if (key == CameraCharacteristics.LENS_INFO_AVAILABLE_FILTER_DENSITIES) {
                    float[] fArr2 = (float[]) cameraCharacteristics.get(key);
                    if (fArr2 == null) {
                        fArr2 = new float[0];
                    }
                    int length14 = fArr2.length;
                    while (i4 < length14) {
                        arrayList.add(String.valueOf(fArr2[i4]));
                        i4++;
                    }
                } else if (key == CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS) {
                    float[] fArr3 = (float[]) cameraCharacteristics.get(key);
                    if (fArr3 == null) {
                        fArr3 = new float[0];
                    }
                    int length15 = fArr3.length;
                    while (i4 < length15) {
                        arrayList.add(fArr3[i4] + "mm");
                        i4++;
                    }
                } else if (key == CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION) {
                    int[] iArr11 = (int[]) cameraCharacteristics.get(key);
                    if (iArr11 == null) {
                        iArr11 = new int[0];
                    }
                    int length16 = iArr11.length;
                    while (i4 < length16) {
                        int i21 = iArr11[i4];
                        if (i21 == 0) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                        } else {
                            if (i21 == 1) {
                                arrayList.add(DeviceInfoApp.f21145f.getString(R.string.on));
                            }
                            i4++;
                        }
                        i4++;
                    }
                } else if (key == CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION) {
                    Object obj3 = cameraCharacteristics.get(key);
                    int iIntValue3 = obj3 != null ? ((Integer) obj3).intValue() : -1;
                    if (iIntValue3 == 1) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_approximate));
                    } else if (iIntValue3 == 2) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_calibrated));
                    } else if (iIntValue3 == 0) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_uncalibrated));
                    }
                } else if (key == CameraCharacteristics.LENS_INFO_HYPERFOCAL_DISTANCE || key == CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE) {
                    arrayList.add(String.valueOf((Float) cameraCharacteristics.get(key)));
                } else if (key == CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES) {
                    int[] iArr12 = (int[]) cameraCharacteristics.get(key);
                    if (iArr12 == null) {
                        iArr12 = new int[0];
                    }
                    int length17 = iArr12.length;
                    while (i4 < length17) {
                        int i22 = iArr12[i4];
                        if (i22 == 0) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_backward_compatible));
                        } else if (i22 == 6) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_burst_capture));
                        } else if (i22 == 9) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_constrained_high_speed_video));
                        } else if (i22 == i14) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_depth_output));
                        } else {
                            if (i22 == 11) {
                                arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_logical_multi_camera));
                            } else if (i22 == 2) {
                                arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_manual_post_processing));
                            } else if (i22 == 1) {
                                arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_manual_sensor));
                            } else if (i22 == 12) {
                                arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_monochrome));
                            } else {
                                if (i22 == 10) {
                                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_motion_tracking));
                                } else if (i22 == 4) {
                                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_private_reprocessing));
                                } else if (i22 == 3) {
                                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_raw));
                                } else if (i22 == 5) {
                                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_read_sensor_settings));
                                } else if (i22 == 7) {
                                    arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_yuv_reprocessing));
                                }
                                i4++;
                                i14 = 8;
                            }
                            i4++;
                            i14 = 8;
                        }
                        i4++;
                        i14 = 8;
                    }
                } else if (key == CameraCharacteristics.REQUEST_MAX_NUM_OUTPUT_PROC || key == CameraCharacteristics.REQUEST_MAX_NUM_OUTPUT_PROC_STALLING || key == CameraCharacteristics.REQUEST_MAX_NUM_OUTPUT_RAW || key == CameraCharacteristics.REQUEST_PARTIAL_RESULT_COUNT) {
                    arrayList.add(String.valueOf((Integer) cameraCharacteristics.get(key)));
                } else if (key == CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM) {
                    arrayList.add(String.valueOf((Float) cameraCharacteristics.get(key)));
                } else if (key == CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP) {
                    Size[] sizeArrB = y.b(cameraCharacteristics);
                    if (sizeArrB.length == 0 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(key)) != null) {
                        sizeArrB = streamConfigurationMap.getOutputSizes(256);
                    }
                    int length18 = sizeArrB.length;
                    while (i4 < length18) {
                        Size size2 = sizeArrB[i4];
                        arrayList.add(G(size2, 2) + " - " + size2.getWidth() + " x " + size2.getHeight());
                        i4++;
                    }
                } else if (key == CameraCharacteristics.SCALER_CROPPING_TYPE) {
                    Object obj4 = cameraCharacteristics.get(key);
                    int iIntValue4 = obj4 != null ? ((Integer) obj4).intValue() : -1;
                    if (iIntValue4 == 0) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_center_only));
                    } else if (iIntValue4 == 1) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_freeform));
                    }
                } else if (key == CameraCharacteristics.SENSOR_AVAILABLE_TEST_PATTERN_MODES) {
                    int[] iArr13 = (int[]) cameraCharacteristics.get(key);
                    if (iArr13 == null) {
                        iArr13 = new int[0];
                    }
                    int length19 = iArr13.length;
                    while (i4 < length19) {
                        int i23 = iArr13[i4];
                        if (i23 == 0) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                        } else if (i23 == 2) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_color_bars));
                        } else if (i23 == 3) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_color_bars_fade_to_gray));
                        } else if (i23 == 256) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_custom_1));
                        } else if (i23 == 4) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_pn9));
                        } else if (i23 == 1) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_solid_color));
                        }
                        i4++;
                    }
                } else if (key == CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT) {
                    Object obj5 = cameraCharacteristics.get(key);
                    int iIntValue5 = obj5 != null ? ((Integer) obj5).intValue() : -1;
                    if (iIntValue5 == 3) {
                        arrayList.add("BGGR");
                    } else if (iIntValue5 == 2) {
                        arrayList.add("GBRG");
                    } else if (iIntValue5 == 1) {
                        arrayList.add("GRBG");
                    } else if (iIntValue5 == 4) {
                        arrayList.add("RGB");
                    } else if (iIntValue5 == 0) {
                        arrayList.add("RGGB");
                    } else if (iIntValue5 == 5) {
                        arrayList.add("MONO");
                    } else if (iIntValue5 == 6) {
                        arrayList.add("NIR");
                    }
                } else if (key == CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE) {
                    Object obj6 = cameraCharacteristics.get(key);
                    int iIntValue6 = obj6 != null ? ((Integer) obj6).intValue() : -1;
                    if (iIntValue6 == 1) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_realtime));
                    } else if (iIntValue6 == 0) {
                        arrayList.add(DeviceInfoApp.f21145f.getString(R.string.unknown));
                    }
                } else if (key == CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE) {
                    SizeF sizeF = (SizeF) cameraCharacteristics.get(key);
                    StringBuilder sb2 = new StringBuilder();
                    Locale locale = Locale.US;
                    Objects.requireNonNull(sizeF);
                    sb2.append(String.format(locale, "%.2f", Float.valueOf(sizeF.getWidth())));
                    sb2.append(" x ");
                    sb2.append(String.format(locale, "%.2f", Float.valueOf(sizeF.getHeight())));
                    arrayList.add(sb2.toString());
                } else if (key == CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE) {
                    Size size3 = (Size) cameraCharacteristics.get(key);
                    StringBuilder sb3 = new StringBuilder();
                    Objects.requireNonNull(size3);
                    sb3.append(size3.getWidth());
                    sb3.append(" x ");
                    sb3.append(size3.getHeight());
                    arrayList.add(sb3.toString());
                } else if (key == CameraCharacteristics.SENSOR_ORIENTATION) {
                    arrayList.add(((Integer) cameraCharacteristics.get(key)) + " deg");
                } else if (key == CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES) {
                    int[] iArr14 = (int[]) cameraCharacteristics.get(key);
                    if (iArr14 == null) {
                        iArr14 = new int[0];
                    }
                    int length20 = iArr14.length;
                    while (i4 < length20) {
                        int i24 = iArr14[i4];
                        if (i24 == 0) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.off));
                        } else if (i24 == 2) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_full));
                        } else if (i24 == 1) {
                            arrayList.add(DeviceInfoApp.f21145f.getString(R.string.feature_simple));
                        }
                        i4++;
                    }
                }
            }
        }
        String strSubstring = arrayList.toString().substring(1, arrayList.toString().length() - 1);
        return (key == CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP || key == CameraCharacteristics.JPEG_AVAILABLE_THUMBNAIL_SIZES) ? strSubstring.replace(", ", "\n") : strSubstring;
    }

    public static String r(Size[] sizeArr) {
        if (sizeArr.length == 0) {
            return "-";
        }
        int width = sizeArr[0].getWidth() * sizeArr[0].getHeight();
        Size size = sizeArr[0];
        for (Size size2 : sizeArr) {
            int width2 = size2.getWidth() * size2.getHeight();
            if (width2 > width) {
                size = size2;
                width = width2;
            }
        }
        return G(size, -1);
    }

    public static String s(Size[] sizeArr) {
        Size size = sizeArr[0];
        if (sizeArr.length <= 1) {
            return size.getWidth() + "x" + size.getHeight();
        }
        Size size2 = sizeArr[sizeArr.length - 1];
        if (size.getWidth() > size2.getWidth()) {
            return size.getWidth() + "x" + size.getHeight();
        }
        return size2.getWidth() + "x" + size2.getHeight();
    }

    public static float[] t() {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        float[] fArr = new float[2];
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        for (int i4 = 0; i4 < iAvailableProcessors; i4++) {
            try {
                randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_max_freq", "r");
                try {
                    randomAccessFile2 = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_min_freq", "r");
                } finally {
                }
            } catch (IOException unused) {
                continue;
            }
            try {
                String line = randomAccessFile.readLine();
                String line2 = randomAccessFile2.readLine();
                if (line != null && line2 != null) {
                    float f10 = Float.parseFloat(line) / 1000.0f;
                    float f11 = Float.parseFloat(line2) / 1000.0f;
                    if (i4 == 0) {
                        fArr[0] = f11;
                        fArr[1] = f10;
                    } else {
                        fArr[0] = Math.min(fArr[0], f11);
                        fArr[1] = Math.max(fArr[1], f10);
                    }
                }
                randomAccessFile2.close();
                randomAccessFile.close();
            } catch (Throwable th2) {
                try {
                    randomAccessFile2.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return fArr;
    }

    public static ArrayList u() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < iAvailableProcessors; i4++) {
            Point point = new Point();
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_max_freq", "r");
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_min_freq", "r");
                    try {
                        String line = randomAccessFile.readLine();
                        String line2 = randomAccessFile2.readLine();
                        if (line != null && line2 != null) {
                            point.x = (int) (Float.parseFloat(line2) / 1000.0f);
                            point.y = (int) (Float.parseFloat(line) / 1000.0f);
                            arrayList.add(point);
                        }
                        randomAccessFile2.close();
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        try {
                            randomAccessFile2.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return arrayList;
    }

    public static String v() {
        String strM = M();
        return a0(strM) ? w() : strM;
    }

    public static String w() {
        String strN = N("ro.soc.model");
        if (a0(strN)) {
            strN = N("ro.hardware.chipname");
        }
        if (a0(strN)) {
            strN = N("ro.chipname");
        }
        if (a0(strN)) {
            strN = N("ro.board.platform");
        }
        if (a0(strN)) {
            strN = N("ro.mediatek.platform");
        }
        if (a0(strN)) {
            strN = N("ro.vendor.soc.model.part_name");
        }
        return (TextUtils.isEmpty(strN) || a0(strN)) ? Build.HARDWARE : strN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r4 = r4[1].trim().split(" ", 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r4.length < 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r4 = r4[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        r4 = r1.split(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r4.length != 2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String x(java.lang.String r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "on "
            java.lang.String r1 = " type"
            java.lang.String r4 = d.h.t(r0, r4, r1)
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L5a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L5a
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Exception -> L5a
            java.lang.String r3 = "mount"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Exception -> L5a
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L5a
            r1.<init>(r2)     // Catch: java.lang.Exception -> L5a
            r0.<init>(r1)     // Catch: java.lang.Exception -> L5a
        L20:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4d
            boolean r2 = r1.contains(r4)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L20
            java.lang.String[] r4 = r1.split(r4)     // Catch: java.lang.Throwable -> L4b
            int r1 = r4.length     // Catch: java.lang.Throwable -> L4b
            r2 = 2
            if (r1 != r2) goto L4d
            r1 = 1
            r4 = r4[r1]     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = " "
            java.lang.String[] r4 = r4.split(r3, r2)     // Catch: java.lang.Throwable -> L4b
            int r2 = r4.length     // Catch: java.lang.Throwable -> L4b
            if (r2 < r1) goto L4d
            r1 = 0
            r4 = r4[r1]     // Catch: java.lang.Throwable -> L4b
            r0.close()     // Catch: java.lang.Exception -> L5a
            return r4
        L4b:
            r4 = move-exception
            goto L51
        L4d:
            r0.close()     // Catch: java.lang.Exception -> L5a
            goto L5a
        L51:
            r0.close()     // Catch: java.lang.Throwable -> L55
            goto L59
        L55:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Exception -> L5a
        L59:
            throw r4     // Catch: java.lang.Exception -> L5a
        L5a:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzh.deviceinfo.utilities.l.x(java.lang.String):java.lang.String");
    }

    public static Pair y(String str) throws NumberFormatException {
        float f10;
        float f11;
        float f12;
        float fAbs;
        Float fValueOf = Float.valueOf(-1.0f);
        if (TextUtils.isEmpty(str)) {
            return new Pair(DeviceInfoApp.f21145f.getString(R.string.unknown), fValueOf);
        }
        try {
            int i4 = Integer.parseInt(str.trim());
            if (i4 >= 10000) {
                f11 = i4;
                f12 = 1000.0f;
            } else {
                if (i4 < 1000) {
                    f10 = i4 > 100 ? i4 / 10.0f : i4;
                    fAbs = Math.abs(f10);
                    if (fAbs <= 10.0f && fAbs < 80.0f) {
                        return new Pair(d.f(fAbs), Float.valueOf(fAbs));
                    }
                }
                f11 = i4;
                f12 = 100.0f;
            }
            f10 = f11 / f12;
            fAbs = Math.abs(f10);
            return fAbs <= 10.0f ? null : null;
        } catch (NumberFormatException unused) {
            return new Pair(DeviceInfoApp.f21145f.getString(R.string.unknown), fValueOf);
        }
    }

    public static String z(Context context) {
        Cursor cursorQuery;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
        } catch (Exception unused) {
        }
        if (cursorQuery == null) {
            return "";
        }
        if (cursorQuery.moveToFirst() && cursorQuery.getColumnCount() >= 2) {
            String hexString = Long.toHexString(Long.parseLong(cursorQuery.getString(1)));
            cursorQuery.close();
            return hexString.toUpperCase().trim();
        }
        cursorQuery.close();
        return "";
    }
}
