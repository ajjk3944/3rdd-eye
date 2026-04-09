package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.XmlResourceParser;
import android.hardware.Sensor;
import android.icu.text.DateFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.UserManager;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.PointerIcon;
import com.facebook.ads.AdError;
import com.liuzh.deviceinfo.R;
import j$.util.stream.IntStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile td.b f19788a;

    public static IntStream a(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.chars());
    }

    public static IntStream b(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
    }

    public static Context c(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static LocaleList d(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static ph.b e(Sensor sensor) {
        Integer numValueOf;
        Boolean bool;
        Boolean bool2;
        nk.k.e(sensor, "sensor");
        boolean z3 = wi.h.f36756a;
        Integer numValueOf2 = z3 ? Integer.valueOf(sensor.getId()) : null;
        String stringType = sensor.getStringType();
        nk.k.d(stringType, "getStringType(...)");
        Integer num = numValueOf2;
        String vendor = sensor.getVendor();
        nk.k.d(vendor, "getVendor(...)");
        int version = sensor.getVersion();
        float resolution = sensor.getResolution();
        float power = sensor.getPower();
        float maximumRange = sensor.getMaximumRange();
        Boolean boolValueOf = z3 ? Boolean.valueOf(sensor.isDynamicSensor()) : null;
        Boolean boolValueOf2 = z3 ? Boolean.valueOf(sensor.isWakeUpSensor()) : null;
        if (z3) {
            bool = boolValueOf;
            bool2 = boolValueOf2;
            numValueOf = Integer.valueOf(sensor.getReportingMode());
        } else {
            Boolean bool3 = boolValueOf2;
            numValueOf = null;
            bool = boolValueOf;
            bool2 = bool3;
        }
        return new ph.b(num, stringType, vendor, version, resolution, power, maximumRange, bool, bool2, numValueOf);
    }

    public static Spanned f(String str) {
        return Html.fromHtml(str, 0);
    }

    public static final ui.y g(PackageInfo packageInfo, PackageManager packageManager) {
        String string;
        int attributeIntValue;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        nk.k.b(applicationInfo);
        ui.y yVar = new ui.y();
        String str = packageInfo.packageName;
        nk.k.d(str, "packageName");
        yVar.f35480b = str;
        yVar.f35479a = applicationInfo.loadLabel(packageManager).toString();
        String str2 = applicationInfo.processName;
        nk.k.d(str2, "processName");
        yVar.f35481c = str2;
        yVar.f35482d = packageInfo.versionName;
        yVar.f35483e = d5.j(packageInfo);
        yVar.f35484f = (applicationInfo.flags & 1) != 0;
        String str3 = applicationInfo.sourceDir;
        nk.k.d(str3, "sourceDir");
        yVar.f35488l = str3;
        yVar.f35489m = applicationInfo.splitSourceDirs;
        long length = !TextUtils.isEmpty(str3) ? new File(yVar.f35488l).length() : 0L;
        String[] strArr = yVar.f35489m;
        if (strArr != null) {
            e4.y0 y0VarI = nk.k.i(strArr);
            while (y0VarI.hasNext()) {
                length += new File((String) y0VarI.next()).length();
            }
        }
        yVar.f35492p = wi.c.e(length);
        String str4 = applicationInfo.dataDir;
        if (str4 == null) {
            str4 = "";
        }
        yVar.f35490n = str4;
        String str5 = packageInfo.packageName;
        nk.k.d(str5, "packageName");
        String strG = a4.a.g(str5, packageManager);
        yVar.g = strG;
        if (strG == null || vk.i.H0(strG)) {
            yVar.f35496t = "";
        } else {
            try {
                String str6 = yVar.g;
                nk.k.b(str6);
                yVar.f35496t = packageManager.getApplicationInfo(str6, 0).loadLabel(packageManager).toString();
            } catch (Exception unused) {
                if ("system".equalsIgnoreCase(yVar.g) || yVar.f35484f) {
                    String string2 = a.a.f2b.getString(R.string.appi_system_pre_installed);
                    nk.k.d(string2, "getString(...)");
                    yVar.f35496t = string2;
                } else {
                    yVar.f35496t = "";
                }
            }
        }
        int i4 = packageInfo.installLocation;
        Context context = a.a.f2b;
        if (i4 == 0) {
            string = context.getString(R.string.appi_install_loc_auto);
            nk.k.d(string, "getString(...)");
        } else if (i4 == 1) {
            string = context.getString(R.string.appi_install_loc_internal_only);
            nk.k.d(string, "getString(...)");
        } else if (i4 != 2) {
            string = context.getString(R.string.appi_install_loc_internal_only);
            nk.k.d(string, "getString(...)");
        } else {
            string = context.getString(R.string.appi_install_loc_prefer_external);
            nk.k.d(string, "getString(...)");
        }
        yVar.f35491o = string;
        List list = ti.e.f34667a;
        String str7 = a.a.s() ? "yyyy-MM-dd a hh:mm" : "dd/MM/yy hh:mm a";
        Context context2 = pk.a.f32022a;
        nk.k.b(context2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str7, q(context2));
        String str8 = simpleDateFormat.format(Long.valueOf(packageInfo.firstInstallTime));
        nk.k.d(str8, "format(...)");
        yVar.f35493q = str8;
        String str9 = simpleDateFormat.format(Long.valueOf(packageInfo.lastUpdateTime));
        nk.k.d(str9, "format(...)");
        yVar.f35494r = str9;
        if (Build.VERSION.SDK_INT >= 24) {
            yVar.f35486i = applicationInfo.minSdkVersion;
        } else {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = null;
            try {
                xmlResourceParserOpenXmlResourceParser = packageManager.getResourcesForApplication(applicationInfo).getAssets().openXmlResourceParser("AndroidManifest.xml");
                for (int next = -1; next != 1; next = xmlResourceParserOpenXmlResourceParser.next()) {
                    if (next == 2 && "uses-sdk".equals(xmlResourceParserOpenXmlResourceParser.getName())) {
                        attributeIntValue = xmlResourceParserOpenXmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minSdkVersion", 0);
                        com.bumptech.glide.c.j(xmlResourceParserOpenXmlResourceParser);
                        break;
                    }
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                com.bumptech.glide.c.j(xmlResourceParserOpenXmlResourceParser);
                throw th2;
            }
            com.bumptech.glide.c.j(xmlResourceParserOpenXmlResourceParser);
            attributeIntValue = 0;
            yVar.f35486i = attributeIntValue;
        }
        Context context3 = a.a.f2b;
        nk.k.d(context3, "context(...)");
        yVar.f35487k = pd.b.b(yVar.f35486i, context3);
        yVar.f35485h = applicationInfo.targetSdkVersion;
        Context context4 = a.a.f2b;
        nk.k.d(context4, "context(...)");
        yVar.j = pd.b.b(applicationInfo.targetSdkVersion, context4);
        yVar.f35497u = String.valueOf(applicationInfo.uid);
        yVar.f35495s = applicationInfo.loadIcon(packageManager);
        ti.d dVarA = ti.e.a(applicationInfo, packageManager);
        int i10 = dVarA.f34662a;
        yVar.f35499w = i10 == 1 || (i10 == 0 && Build.SUPPORTED_64_BIT_ABIS.length != 0);
        if (i10 == 1) {
            yVar.f35498v = "64 bit";
        } else if (i10 == 0 || i10 == -1) {
            String string3 = a.a.f2b.getString(R.string.appi_no_native_lib);
            nk.k.d(string3, "getString(...)");
            yVar.f35498v = string3;
        } else {
            yVar.f35498v = "32 bit";
        }
        yVar.f35501y = dVarA.f34664c;
        yVar.B = dVarA.f34663b;
        yVar.f35502z = dVarA.f34665d;
        yVar.A = dVarA.f34666e;
        pb.l0 l0VarG = ti.e.g(applicationInfo.sourceDir);
        String[] strArr2 = applicationInfo.splitSourceDirs;
        if (strArr2 != null) {
            e4.y0 y0VarI2 = nk.k.i(strArr2);
            while (y0VarI2.hasNext()) {
                l0VarG.f31648a = l0VarG.f31648a || ti.e.g((String) y0VarI2.next()).f31648a;
            }
        }
        yVar.f35500x = l0VarG.f31648a;
        String str10 = l0VarG.f31649b;
        yVar.C = str10 != null ? str10 : "";
        return yVar;
    }

    public static DecimalFormatSymbols h(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList i(Configuration configuration) {
        return configuration.getLocales();
    }

    public static PointerIcon j(Context context) {
        return PointerIcon.getSystemIcon(context, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
    }

    public static String[] k(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Uri[] l(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static String m(long j) {
        if (Build.VERSION.SDK_INT < 24) {
            return DateUtils.formatDateTime(null, j, 8228);
        }
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = com.google.android.material.datepicker.w.f20508a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton.format(new Date(j));
    }

    public static boolean n(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static boolean o(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static boolean p(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final Locale q(Context context) {
        if (wi.h.f36756a) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            nk.k.b(locale);
            return locale;
        }
        Locale locale2 = context.getResources().getConfiguration().locale;
        nk.k.b(locale2);
        return locale2;
    }

    public static void r(z2.d dVar, y2.c cVar) {
        ArrayList arrayList = new ArrayList(zj.o.T(cVar, 10));
        Iterator it = cVar.f37320a.iterator();
        while (it.hasNext()) {
            arrayList.add(((y2.b) it.next()).f37318a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        dVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #2 {all -> 0x0022, all -> 0x0072, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:77:0x017d, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0046, B:27:0x004e, B:76:0x0179, B:78:0x0180, B:79:0x0183, B:80:0x0184, B:28:0x0052, B:30:0x0056, B:31:0x0063, B:33:0x0069, B:39:0x007f, B:41:0x0085, B:42:0x0091, B:63:0x015d, B:64:0x0160, B:72:0x0170, B:71:0x016d, B:73:0x0171, B:74:0x0176, B:75:0x0177, B:34:0x006f, B:38:0x0076), top: B:88:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static td.b s(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j4.s(android.content.Context):td.b");
    }
}
