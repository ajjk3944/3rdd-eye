package w;

import C.S;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import y.C5787a;

/* compiled from: StreamConfigurationMapCompat.java */
/* renamed from: w.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5709w {

    /* renamed from: a, reason: collision with root package name */
    public final C5710x f47161a;

    /* renamed from: b, reason: collision with root package name */
    public final K4.b f47162b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f47163c = new HashMap();

    public C5709w(StreamConfigurationMap streamConfigurationMap, K4.b bVar) {
        new HashMap();
        new HashMap();
        this.f47161a = new C5710x(streamConfigurationMap);
        this.f47162b = bVar;
    }

    public final Size[] a(int i) {
        ArrayList arrayList;
        List arrayList2;
        HashMap map = this.f47163c;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        Size[] outputSizes = this.f47161a.f47164a.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            S.g("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
            return outputSizes;
        }
        K4.b bVar = this.f47162b;
        bVar.getClass();
        ArrayList arrayList3 = new ArrayList(Arrays.asList(outputSizes));
        if (((ExtraSupportedOutputSizeQuirk) bVar.f3143c) != null) {
            Size[] sizeArr = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr.length > 0) {
                arrayList3.addAll(Arrays.asList(sizeArr));
            }
        }
        B7.e eVar = (B7.e) bVar.f3144d;
        eVar.getClass();
        if (((ExcludedSupportedSizesQuirk) C5787a.f47852a.e(ExcludedSupportedSizesQuirk.class)) == null) {
            arrayList2 = new ArrayList();
        } else {
            String str = (String) eVar.f583c;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) && i == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) && i == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
                }
            } else {
                if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList2 = arrayList4;
                    arrayList2 = arrayList4;
                    if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) && (i == 34 || i == 35)) {
                        arrayList4.add(new Size(720, 720));
                        arrayList4.add(new Size(400, 400));
                        arrayList2 = arrayList4;
                    }
                } else if (ExcludedSupportedSizesQuirk.e()) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList2 = arrayList5;
                    if (!str.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
                        arrayList2 = arrayList5;
                        arrayList2 = arrayList5;
                        if (str.equals("1") && (i == 34 || i == 35)) {
                            arrayList5.add(new Size(3264, 2448));
                            arrayList5.add(new Size(3264, 1836));
                            arrayList5.add(new Size(2448, 2448));
                            arrayList5.add(new Size(1920, 1920));
                            arrayList5.add(new Size(2048, 1536));
                            arrayList5.add(new Size(2048, 1152));
                            arrayList5.add(new Size(1920, 1080));
                            arrayList2 = arrayList5;
                        }
                    } else if (i == 34) {
                        arrayList5.add(new Size(4128, 3096));
                        arrayList5.add(new Size(4128, 2322));
                        arrayList5.add(new Size(3088, 3088));
                        arrayList5.add(new Size(3264, 2448));
                        arrayList5.add(new Size(3264, 1836));
                        arrayList5.add(new Size(2048, 1536));
                        arrayList5.add(new Size(2048, 1152));
                        arrayList5.add(new Size(1920, 1080));
                        arrayList2 = arrayList5;
                    } else if (i == 35) {
                        arrayList5.add(new Size(4128, 2322));
                        arrayList5.add(new Size(3088, 3088));
                        arrayList5.add(new Size(3264, 2448));
                        arrayList5.add(new Size(3264, 1836));
                        arrayList5.add(new Size(2048, 1536));
                        arrayList5.add(new Size(2048, 1152));
                        arrayList5.add(new Size(1920, 1080));
                        arrayList2 = arrayList5;
                    }
                } else if (ExcludedSupportedSizesQuirk.d()) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList2 = arrayList6;
                    if (!str.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
                        arrayList2 = arrayList6;
                        arrayList2 = arrayList6;
                        if (str.equals("1") && (i == 34 || i == 35)) {
                            arrayList6.add(new Size(2576, 1932));
                            arrayList6.add(new Size(2560, 1440));
                            arrayList6.add(new Size(1920, 1920));
                            arrayList6.add(new Size(2048, 1536));
                            arrayList6.add(new Size(2048, 1152));
                            arrayList6.add(new Size(1920, 1080));
                            arrayList2 = arrayList6;
                        }
                    } else if (i == 34) {
                        arrayList6.add(new Size(4128, 3096));
                        arrayList6.add(new Size(4128, 2322));
                        arrayList6.add(new Size(3088, 3088));
                        arrayList6.add(new Size(3264, 2448));
                        arrayList6.add(new Size(3264, 1836));
                        arrayList6.add(new Size(2048, 1536));
                        arrayList6.add(new Size(2048, 1152));
                        arrayList6.add(new Size(1920, 1080));
                        arrayList2 = arrayList6;
                    } else if (i == 35) {
                        arrayList6.add(new Size(2048, 1536));
                        arrayList6.add(new Size(2048, 1152));
                        arrayList6.add(new Size(1920, 1080));
                        arrayList2 = arrayList6;
                    }
                } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList2 = arrayList7;
                    if (str.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
                        arrayList2 = arrayList7;
                        if (i == 256) {
                            arrayList7.add(new Size(9280, 6944));
                            arrayList2 = arrayList7;
                        }
                    }
                } else {
                    S.g("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                    arrayList2 = Collections.EMPTY_LIST;
                }
            }
            arrayList2 = arrayList;
        }
        if (!arrayList2.isEmpty()) {
            arrayList3.removeAll(arrayList2);
        }
        if (arrayList3.isEmpty()) {
            S.g("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        Size[] sizeArr2 = (Size[]) arrayList3.toArray(new Size[0]);
        map.put(Integer.valueOf(i), sizeArr2);
        return (Size[]) sizeArr2.clone();
    }
}
