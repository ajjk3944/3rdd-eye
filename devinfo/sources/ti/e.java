package ti;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.liuzh.deviceinfo.R;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import pb.l0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f34667a = Arrays.asList(new b(0), new b(1), new b(2), new b(3), new b(4));

    /* renamed from: b, reason: collision with root package name */
    public static final List f34668b = Arrays.asList(new c(0), new c(1));

    public static d a(ApplicationInfo applicationInfo, PackageManager packageManager) {
        File parentFile;
        String[] list;
        ZipFile zipFile;
        List list2 = f34667a;
        d dVar = new d();
        dVar.f34662a = -1;
        if (applicationInfo != null) {
            String str = applicationInfo.sourceDir;
            String str2 = applicationInfo.nativeLibraryDir;
            if (!TextUtils.isEmpty(str)) {
                try {
                    zipFile = new ZipFile(new File(str));
                } catch (Exception unused) {
                }
                try {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).a(dVar, zipFile);
                    }
                    zipFile.close();
                    String[] strArr = applicationInfo.splitSourceDirs;
                    int i4 = 0;
                    if (strArr != null) {
                        for (String str3 : strArr) {
                            if (str3 != null) {
                                try {
                                    ZipFile zipFile2 = new ZipFile(new File(str3));
                                    try {
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            ((b) it2.next()).a(dVar, zipFile2);
                                        }
                                        zipFile2.close();
                                    } catch (Throwable th2) {
                                        try {
                                            zipFile2.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                } catch (Exception unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                    int i10 = dVar.f34662a;
                    if ((i10 == 0 || i10 == -1) && !TextUtils.isEmpty(str2) && (parentFile = new File(str2).getParentFile()) != null && (list = parentFile.list()) != null) {
                        int length = list.length;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            String str4 = list[i4];
                            if (str4.equals("arm64")) {
                                dVar.f34662a = 1;
                                break;
                            }
                            if (str4.equals("arm")) {
                                dVar.f34662a = 2;
                            }
                            i4++;
                        }
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    public static String b(boolean z3) {
        return a.a.f2b.getString(z3 ? R.string.appi_yes : R.string.appi_no);
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? "N/A" : str;
    }

    public static String d(int i4, int i10) {
        String strS = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? "" : "signatureOrSystem" : "signature" : "dangerous" : "normal";
        if (e(16, i10)) {
            strS = strS.concat(" | privileged(system)");
        }
        if (e(32, i10)) {
            strS = d.h.s(strS, " | development");
        }
        if (e(64, i10)) {
            strS = d.h.s(strS, " | appop");
        }
        if (e(128, i10)) {
            strS = d.h.s(strS, " | pre23");
        }
        if (e(256, i10)) {
            strS = d.h.s(strS, " | installer");
        }
        if (e(512, i10)) {
            strS = d.h.s(strS, " | verifier");
        }
        if (e(Segment.SHARE_MINIMUM, i10)) {
            strS = d.h.s(strS, " | preinstalled");
        }
        if (e(2048, i10)) {
            strS = d.h.s(strS, " | setup");
        }
        if (e(Buffer.SEGMENTING_THRESHOLD, i10)) {
            strS = d.h.s(strS, " | instant");
        }
        if (e(Segment.SIZE, i10)) {
            strS = d.h.s(strS, " | runtimeOnly");
        }
        if (e(Http2.INITIAL_MAX_FRAME_SIZE, i10)) {
            strS = d.h.s(strS, " | oem");
        }
        if (e(32768, i10)) {
            strS = d.h.s(strS, " | vendorPrivileged");
        }
        if (e(65536, i10)) {
            strS = d.h.s(strS, " | systemTextClassifier");
        }
        if (e(131072, i10)) {
            strS = d.h.s(strS, " | wellbeing");
        }
        if (e(262144, i10)) {
            strS = d.h.s(strS, " | documenter");
        }
        if (e(524288, i10)) {
            strS = d.h.s(strS, " | configurator");
        }
        if (e(1048576, i10)) {
            strS = d.h.s(strS, " | incidentReportApprover");
        }
        return e(2097152, i10) ? d.h.s(strS, " | appPredictor") : strS;
    }

    public static boolean e(int i4, int i10) {
        return (i4 & i10) != 0;
    }

    public static boolean f(ZipFile zipFile, String str) {
        ZipEntry entry = zipFile.getEntry("lib/arm64-v8a/".concat(str));
        if (entry == null) {
            entry = zipFile.getEntry("lib/armeabi-v7a/".concat(str));
        }
        if (entry == null) {
            entry = zipFile.getEntry("lib/armeabi/".concat(str));
        }
        return entry != null;
    }

    public static l0 g(String str) {
        l0 l0Var = new l0();
        l0Var.f31648a = false;
        if (!TextUtils.isEmpty(str)) {
            try {
                ZipFile zipFile = new ZipFile(new File(str));
                try {
                    Iterator it = f34668b.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).a(l0Var, zipFile);
                    }
                    zipFile.close();
                    return l0Var;
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return l0Var;
    }
}
