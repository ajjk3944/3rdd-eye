package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class aw {

    /* renamed from: a, reason: collision with root package name */
    private static List<String> f19873a = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f19874a;

        /* renamed from: b, reason: collision with root package name */
        public String f19875b;

        public a(int i10, String... strArr) {
            this.f19874a = i10;
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            this.f19875b = jSONArray.toString();
        }
    }

    private static File a(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            as.a(file.getAbsolutePath());
        }
        return file;
    }

    public static synchronized a b(Context context, String str) {
        if (f19873a.contains(str)) {
            return null;
        }
        try {
            System.loadLibrary(str);
            f19873a.add(str);
        } catch (UnsatisfiedLinkError e10) {
            File fileA = a(context, str);
            if (fileA == null) {
                return new a(3, e10.getMessage(), "output null");
            }
            if (fileA.exists()) {
                fileA.delete();
            }
            a aVarA = a(context, str, fileA);
            if (aVarA != null) {
                return aVarA;
            }
            try {
                System.load(fileA.getAbsolutePath());
                f19873a.add(str);
            } catch (Throwable th) {
                return new a(3, e10.getMessage(), th.getMessage());
            }
        } catch (Throwable th2) {
            return new a(3, th2.getMessage());
        }
        return null;
    }

    private static File a(Context context, String str) {
        String strMapLibraryName = System.mapLibraryName(str);
        File fileA = a(context);
        if (fileA != null) {
            return new File(fileA, strMapLibraryName);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static a a(Context context, String str, File file) throws IOException {
        InputStream inputStream;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        ZipFile zipFile2 = null;
        try {
            ZipFile zipFile3 = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                ZipEntry zipEntryA = a(zipFile3, Build.CPU_ABI, str);
                if (zipEntryA == null) {
                    try {
                        zipEntryA = a(zipFile3, Build.CPU_ABI2, str);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = null;
                        zipFile = null;
                        zipFile2 = zipFile3;
                        try {
                            return new a(3, th.getMessage());
                        } finally {
                            as.a((Closeable) zipFile);
                            as.a(inputStream);
                            as.a(zipFile2);
                        }
                    }
                }
                if (zipEntryA != null) {
                    file.createNewFile();
                    InputStream inputStream2 = zipFile3.getInputStream(zipEntryA);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Throwable th2) {
                        inputStream = inputStream2;
                        th = th2;
                    }
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int i10 = inputStream2.read(bArr);
                            if (i10 > 0) {
                                fileOutputStream.write(bArr, 0, i10);
                            } else {
                                as.a(file.getAbsolutePath(), 493);
                                as.a(fileOutputStream);
                                as.a(inputStream2);
                                as.a(zipFile3);
                                return null;
                            }
                        }
                    } catch (Throwable th3) {
                        zipFile2 = fileOutputStream;
                        inputStream = inputStream2;
                        th = th3;
                        zipFile = zipFile2;
                        zipFile2 = zipFile3;
                        return new a(3, th.getMessage());
                    }
                } else {
                    a aVar = new a(2, a(zipFile3, str));
                    as.a((Closeable) null);
                    as.a((Closeable) null);
                    as.a(zipFile3);
                    return aVar;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            zipFile = null;
        }
    }

    private static String a(ZipFile zipFile, String str) throws JSONException {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"};
        for (int i10 = 0; i10 < 5; i10++) {
            String str2 = strArr[i10];
            if (a(zipFile, str2, str) != null) {
                arrayList.add(str2);
            }
        }
        List listAsList = Arrays.asList(Build.SUPPORTED_ABIS);
        ArrayList arrayList2 = new ArrayList();
        String str3 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str3)) {
            arrayList2.add(str3);
        }
        String str4 = Build.CPU_ABI2;
        if (!TextUtils.isEmpty(str4)) {
            arrayList2.add(str4);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("supportedABIS", listAsList);
            jSONObject.put("curABIs", arrayList2);
            jSONObject.put("apkABIS", arrayList);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private static ZipEntry a(ZipFile zipFile, String str, String str2) {
        ZipEntry entry = zipFile.getEntry("lib/" + str + "/" + System.mapLibraryName(str2));
        if (entry != null) {
            return entry;
        }
        int iIndexOf = str.indexOf(45);
        StringBuilder sb = new StringBuilder("lib/");
        if (iIndexOf <= 0) {
            iIndexOf = str.length();
        }
        sb.append(str.substring(0, iIndexOf));
        sb.append("/");
        sb.append(System.mapLibraryName(str2));
        return zipFile.getEntry(sb.toString());
    }
}
