package com.liuzho.lib.appinfo.provider;

import a4.f;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import androidx.recyclerview.widget.m;
import com.google.android.gms.internal.measurement.j4;
import com.liuzh.deviceinfo.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import je.u;
import ui.e0;
import ui.f0;
import ui.i;
import ui.i0;
import ui.j0;
import ui.k;
import ui.k0;
import ui.n;
import ui.n0;
import ui.o;
import ui.r;
import ui.s;
import ui.v;
import ui.w;
import wi.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21402a;

    static {
        f21402a = (h.f36759d ? 134217728 : 64) | 20623;
    }

    public static o.e a(Context context, String str) {
        List list;
        File[] fileArrListFiles;
        int i4;
        CharSequence charSequenceLoadLabel;
        CharSequence charSequenceLoadLabel2;
        o.e eVar = new o.e((byte) 0, 20);
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, f21402a);
            if (packageInfo != null) {
                eVar.u(0, j4.g(packageInfo, packageManager));
                k kVarE = f.e(packageInfo);
                int i10 = 1;
                if (kVarE != null) {
                    eVar.u(1, kVarE);
                }
                ActivityInfo[] activityInfoArr = packageInfo.activities;
                if (activityInfoArr != null && activityInfoArr.length > 0) {
                    ui.d dVar = new ui.d();
                    ArrayList arrayList = new ArrayList();
                    for (ActivityInfo activityInfo : packageInfo.activities) {
                        arrayList.add(new ui.c(activityInfo));
                    }
                    Collections.sort(arrayList);
                    dVar.f35355a = arrayList;
                    eVar.u(2, dVar);
                }
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                if (serviceInfoArr != null && serviceInfoArr.length > 0) {
                    n0 n0Var = new n0();
                    ArrayList arrayList2 = new ArrayList();
                    for (ServiceInfo serviceInfo : packageInfo.services) {
                        try {
                            charSequenceLoadLabel2 = serviceInfo.loadLabel(packageManager);
                        } catch (Throwable unused) {
                            charSequenceLoadLabel2 = "N/A";
                        }
                        arrayList2.add(new k0(serviceInfo, charSequenceLoadLabel2));
                    }
                    Collections.sort(arrayList2);
                    n0Var.f35441a = arrayList2;
                    eVar.u(3, n0Var);
                }
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null && providerInfoArr.length > 0) {
                    o oVar = new o();
                    ArrayList arrayList3 = new ArrayList();
                    for (ProviderInfo providerInfo : packageInfo.providers) {
                        arrayList3.add(new n(providerInfo));
                    }
                    Collections.sort(arrayList3);
                    oVar.f35443a = arrayList3;
                    eVar.u(4, oVar);
                }
                ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
                if (activityInfoArr2 != null && activityInfoArr2.length > 0) {
                    i iVar = new i();
                    ArrayList arrayList4 = new ArrayList();
                    for (ActivityInfo activityInfo2 : packageInfo.receivers) {
                        try {
                            charSequenceLoadLabel = activityInfo2.loadLabel(packageManager);
                        } catch (Throwable unused2) {
                            charSequenceLoadLabel = "N/A";
                        }
                        arrayList4.add(new ui.h(activityInfo2, charSequenceLoadLabel));
                    }
                    Collections.sort(arrayList4);
                    iVar.f35388a = arrayList4;
                    eVar.u(5, iVar);
                }
                c cVar = new c(context);
                ArrayList arrayList5 = new ArrayList();
                HashSet hashSet = new HashSet();
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && !TextUtils.isEmpty(applicationInfo.nativeLibraryDir) && (fileArrListFiles = new File(packageInfo.applicationInfo.nativeLibraryDir).listFiles()) != null) {
                    int length = fileArrListFiles.length;
                    int i11 = 0;
                    while (i11 < length) {
                        File file = fileArrListFiles[i11];
                        if (hashSet.contains(file.getName())) {
                            i4 = i10;
                        } else {
                            hashSet.add(file.getName());
                            i4 = i10;
                            arrayList5.add(new e0(file.getName(), file.length()));
                        }
                        i11++;
                        i10 = i4;
                    }
                }
                int i12 = i10;
                ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                if (applicationInfo2 != null && !TextUtils.isEmpty(applicationInfo2.sourceDir)) {
                    try {
                        ZipFile zipFile = new ZipFile(new File(packageInfo.applicationInfo.sourceDir));
                        try {
                            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                            while (enumerationEntries.hasMoreElements()) {
                                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                String str2 = zipEntryNextElement.getName().split("/")[r11.length - 1];
                                if (str2.endsWith(".so") && !hashSet.contains(str2)) {
                                    hashSet.add(str2);
                                    arrayList5.add(new e0(str2, zipEntryNextElement.getSize()));
                                }
                            }
                            zipFile.close();
                        } finally {
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                int size = arrayList5.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList5.get(i13);
                    i13++;
                    e0 e0Var = (e0) obj;
                    NativeLibInfoProvider$LocalNativeLibInfo nativeLibInfoProvider$LocalNativeLibInfo = (NativeLibInfoProvider$LocalNativeLibInfo) cVar.f21404b.get(e0Var.f35360a);
                    if (nativeLibInfoProvider$LocalNativeLibInfo == null) {
                        ArrayList arrayList6 = cVar.f21405c;
                        int size2 = arrayList6.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                break;
                            }
                            Object obj2 = arrayList6.get(i14);
                            i14++;
                            NativeLibInfoProvider$LocalNativeLibInfo nativeLibInfoProvider$LocalNativeLibInfo2 = (NativeLibInfoProvider$LocalNativeLibInfo) obj2;
                            if (nativeLibInfoProvider$LocalNativeLibInfo2.getPattern() != null && nativeLibInfoProvider$LocalNativeLibInfo2.getPattern().matcher(e0Var.f35360a).matches()) {
                                nativeLibInfoProvider$LocalNativeLibInfo = nativeLibInfoProvider$LocalNativeLibInfo2;
                                break;
                            }
                        }
                    }
                    if (nativeLibInfoProvider$LocalNativeLibInfo != null) {
                        String str3 = nativeLibInfoProvider$LocalNativeLibInfo.label;
                        e0Var.f35363d = str3;
                        e0Var.f35364e = (String) cVar.f21408f.get(str3);
                        String str4 = e0Var.f35363d;
                        HashMap map = cVar.f21407e;
                        Integer numValueOf = (Integer) map.get(str4);
                        if (numValueOf == null) {
                            String str5 = (String) cVar.f21406d.get(e0Var.f35363d);
                            if (!TextUtils.isEmpty(str5)) {
                                String strT = u.t("appi_native_lib_icon_", str5);
                                Context context2 = cVar.f21403a;
                                int identifier = context2.getResources().getIdentifier(strT, "drawable", context2.getPackageName());
                                if (identifier != 0) {
                                    numValueOf = Integer.valueOf(identifier);
                                    map.put(e0Var.f35363d, Integer.valueOf(identifier));
                                }
                            }
                        }
                        if (numValueOf != null) {
                            e0Var.f35362c = numValueOf.intValue();
                        }
                    }
                }
                Collections.sort(arrayList5, new b4.b(2));
                Collections.sort(arrayList5, new b4.b(3));
                if (!arrayList5.isEmpty()) {
                    f0 f0Var = new f0();
                    f0Var.f35371b = arrayList5;
                    eVar.u(6, f0Var);
                }
                FeatureInfo[] featureInfoArr = packageInfo.reqFeatures;
                if (featureInfoArr != null && featureInfoArr.length > 0) {
                    w wVar = new w();
                    ArrayList arrayList7 = new ArrayList();
                    FeatureInfo[] featureInfoArr2 = packageInfo.reqFeatures;
                    int length2 = featureInfoArr2.length;
                    int i15 = 0;
                    while (i15 < length2) {
                        FeatureInfo featureInfo = featureInfoArr2[i15];
                        v vVar = new v();
                        vVar.f35475b = TextUtils.isEmpty(featureInfo.name) ? "OpenGL ES " + featureInfo.getGlEsVersion() : featureInfo.name;
                        vVar.f35474a = ti.e.e(featureInfo.flags, i12);
                        arrayList7.add(vVar);
                        i15++;
                        i12 = 1;
                    }
                    wVar.f35476a = arrayList7;
                    eVar.u(7, wVar);
                }
                PermissionInfo[] permissionInfoArr = packageInfo.permissions;
                if (permissionInfoArr != null && permissionInfoArr.length > 0) {
                    s sVar = new s();
                    ArrayList arrayList8 = new ArrayList();
                    for (PermissionInfo permissionInfo : packageInfo.permissions) {
                        r rVar = new r(permissionInfo);
                        CharSequence charSequenceLoadDescription = permissionInfo.loadDescription(packageManager);
                        if (charSequenceLoadDescription != null) {
                            rVar.f35461c = charSequenceLoadDescription.toString();
                        }
                        rVar.f35460b = permissionInfo.loadLabel(packageManager).toString();
                        arrayList8.add(rVar);
                    }
                    sVar.f35465a = arrayList8;
                    eVar.u(8, sVar);
                }
                String[] strArr = packageInfo.requestedPermissions;
                if (strArr != null && strArr.length > 0) {
                    j0 j0Var = new j0();
                    j0Var.f35395a = packageInfo.packageName;
                    ArrayList arrayList9 = new ArrayList();
                    e eVar2 = new e(context);
                    int i16 = 0;
                    while (true) {
                        String[] strArr2 = packageInfo.requestedPermissions;
                        if (i16 >= strArr2.length) {
                            break;
                        }
                        String str6 = strArr2[i16];
                        i0 i0Var = new i0();
                        i0Var.f35390a = str6;
                        Map map2 = eVar2.f21409a;
                        if (map2 != null && map2.containsKey(str6) && (list = (List) map2.get(str6)) != null && !list.isEmpty()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((String) list.get(0));
                            for (int i17 = 1; i17 < list.size(); i17++) {
                                sb2.append(" | ");
                                sb2.append((String) list.get(i17));
                            }
                            i0Var.f35392c = sb2.toString();
                        }
                        String[] strArrSplit = str6.split("\\.");
                        if (strArrSplit.length > 0) {
                            String str7 = "appi_permission_desc_" + strArrSplit[strArrSplit.length - 1].toLowerCase();
                            Context context3 = eVar2.f21410b;
                            int identifier2 = context3.getResources().getIdentifier(str7, "string", context3.getPackageName());
                            if (identifier2 != 0) {
                                i0Var.f35393d = context3.getString(identifier2);
                            }
                        }
                        int[] iArr = packageInfo.requestedPermissionsFlags;
                        if (iArr == null || i16 >= iArr.length) {
                            i0Var.f35391b = a.a.f2b.getString(R.string.appi_unknown);
                        } else {
                            i0Var.f35391b = ti.e.e(iArr[i16], 2) ? a.a.f2b.getString(R.string.appi_granted_permission) : a.a.f2b.getString(R.string.appi_not_granted_permission);
                        }
                        arrayList9.add(i0Var);
                        i16++;
                    }
                    j0Var.f35396b = arrayList9;
                    Collections.sort(arrayList9, new m(3));
                    eVar.u(9, j0Var);
                }
            }
        } catch (Exception unused3) {
        }
        return eVar;
    }
}
