package com.bytedance.adsdk.vt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Pair;
import com.applovin.shadow.okio.internal.Buffer;
import d.h;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno {
    private static final Map<String, jg<ra>> ouw = new HashMap();
    private static final Set<Object> vt = new HashSet();

    /* renamed from: lh, reason: collision with root package name */
    private static final byte[] f7190lh = {80, 75, 3, 4};

    public static mwh<ra> lh(Context context, String str) {
        return lh(context, str, "asset_".concat(String.valueOf(str)));
    }

    private static String yu(Context context, int i4) {
        return h.q(i4, ouw(context) ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }

    public static jg<ra> ouw(Context context, String str) {
        return ouw(context, str, "url_".concat(String.valueOf(str)));
    }

    public static jg<ra> vt(Context context, String str) {
        return vt(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static mwh<ra> lh(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return lh(context.getAssets().open(str), str2);
            }
            return ouw(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e2) {
            return new mwh<>((Throwable) e2);
        }
    }

    public static jg<ra> ouw(final Context context, final String str, final String str2) {
        return ouw(str2, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.1
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                mwh<ra> mwhVarOuw;
                com.bytedance.adsdk.vt.yu.ra raVar;
                Pair<com.bytedance.adsdk.vt.yu.lh, InputStream> pairOuw;
                com.bytedance.adsdk.vt.yu.pno pnoVarOuw = fkw.ouw(context);
                Context context2 = context;
                String str3 = str;
                String str4 = str2;
                ra raVar2 = null;
                if (str4 != null && (raVar = pnoVarOuw.ouw) != null && (pairOuw = raVar.ouw(str3)) != null) {
                    com.bytedance.adsdk.vt.yu.lh lhVar = (com.bytedance.adsdk.vt.yu.lh) pairOuw.first;
                    InputStream inputStream = (InputStream) pairOuw.second;
                    ra raVar3 = (lhVar == com.bytedance.adsdk.vt.yu.lh.ZIP ? pno.ouw(context2, new ZipInputStream(inputStream), str4) : pno.vt(inputStream, str4)).ouw;
                    if (raVar3 != null) {
                        raVar2 = raVar3;
                    }
                }
                if (raVar2 != null) {
                    mwhVarOuw = new mwh<>(raVar2);
                } else {
                    com.bytedance.adsdk.vt.le.yu.ouw("Animation for " + str3 + " not found in cache. Fetching from network.");
                    mwhVarOuw = pnoVarOuw.ouw(context2, str3, str4);
                }
                if (str2 != null && mwhVarOuw.ouw != null) {
                    com.bytedance.adsdk.vt.lh.fkw.ouw().ouw(str2, mwhVarOuw.ouw);
                }
                return mwhVarOuw;
            }
        });
    }

    public static jg<ra> ouw(Context context, int i4) {
        return ouw(context, i4, yu(context, i4));
    }

    public static jg<ra> vt(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return ouw(str2, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.4
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                return pno.lh(applicationContext, str, str2);
            }
        });
    }

    public static jg<ra> ouw(Context context, final int i4, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return ouw(str, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.5
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return pno.lh(context2, i4);
            }
        });
    }

    public static mwh<ra> vt(Context context, int i4) {
        yu(context, i4);
        return lh(context, i4);
    }

    public static mwh<ra> vt(InputStream inputStream, String str) {
        return lh(inputStream, str);
    }

    public static mwh<ra> lh(Context context, int i4) {
        try {
            return lh(context.getResources().openRawResource(i4), yu(context, i4));
        } catch (Resources.NotFoundException e2) {
            return new mwh<>((Throwable) e2);
        }
    }

    private static boolean ouw(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static mwh<ra> vt(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        FileOutputStream fileOutputStream;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            ra raVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    raVar = ouw(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).ouw;
                } else if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
                    if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                        zipInputStream.closeEntry();
                    } else if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split("/");
                        String str2 = strArrSplit[strArrSplit.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            fileOutputStream = new FileOutputStream(file);
                        } catch (Throwable th2) {
                            com.bytedance.adsdk.vt.le.yu.ouw("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th2);
                        }
                        try {
                            byte[] bArr = new byte[Buffer.SEGMENTING_THRESHOLD];
                            while (true) {
                                int i4 = zipInputStream.read(bArr);
                                if (i4 == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i4);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                com.bytedance.adsdk.vt.le.yu.vt("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th5) {
                                    th3.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        }
                    }
                } else if (name.contains("../")) {
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    String[] strArrSplit2 = name.split("/");
                    map.put(strArrSplit2[strArrSplit2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (raVar == null) {
                return new mwh<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                tlj tljVarOuw = ouw(raVar, (String) entry.getKey());
                if (tljVarOuw != null) {
                    tljVarOuw.f7211cf = com.bytedance.adsdk.vt.le.pno.ouw((Bitmap) entry.getValue(), tljVarOuw.ouw, tljVarOuw.vt);
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z3 = false;
                for (com.bytedance.adsdk.vt.lh.lh lhVar : raVar.yu.values()) {
                    if (lhVar.ouw.equals(entry2.getKey())) {
                        lhVar.yu = (Typeface) entry2.getValue();
                        z3 = true;
                    }
                }
                if (!z3) {
                    com.bytedance.adsdk.vt.le.yu.vt("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, tlj>> it = raVar.f7198lh.entrySet().iterator();
                while (it.hasNext()) {
                    tlj value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String str4 = value.yu;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (str4.startsWith("data:") && str4.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str4.substring(str4.indexOf(44) + 1), 0);
                            value.f7211cf = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e2) {
                            com.bytedance.adsdk.vt.le.yu.ouw("data URL did not have correct base64 format.", e2);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, tlj> entry3 : raVar.f7198lh.entrySet()) {
                if (entry3.getValue().f7211cf == null) {
                    return new mwh<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().yu));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.vt.lh.fkw.ouw().ouw(str, raVar);
            }
            return new mwh<>(raVar);
        } catch (IOException e10) {
            return new mwh<>((Throwable) e10);
        }
    }

    public static jg<ra> ouw(final InputStream inputStream, final String str) {
        return ouw(str, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.6
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                return pno.vt(inputStream, str);
            }
        });
    }

    private static void ouw(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static mwh<ra> lh(InputStream inputStream, String str) throws IOException {
        try {
            return ouw(new JsonReader(new InputStreamReader(inputStream)), str, true);
        } finally {
            com.bytedance.adsdk.vt.le.pno.ouw(inputStream);
        }
    }

    public static mwh<ra> ouw(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return vt(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.vt.le.pno.ouw(zipInputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lh() {
        ArrayList arrayList = new ArrayList(vt);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList.get(i4);
        }
    }

    private static jg<ra> ouw(final String str, Callable<mwh<ra>> callable) {
        final ra raVarOuw = str == null ? null : com.bytedance.adsdk.vt.lh.fkw.ouw().ouw(str);
        if (raVarOuw != null) {
            return new jg<>(new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.7
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ mwh<ra> call() throws Exception {
                    return new mwh<>(raVarOuw);
                }
            });
        }
        if (str != null) {
            Map<String, jg<ra>> map = ouw;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        jg<ra> jgVar = new jg<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            jgVar.ouw(new cf<ra>() { // from class: com.bytedance.adsdk.vt.pno.2
                @Override // com.bytedance.adsdk.vt.cf
                public final /* synthetic */ void ouw(ra raVar) {
                    pno.ouw.remove(str);
                    atomicBoolean.set(true);
                    if (pno.ouw.size() == 0) {
                        pno.lh();
                    }
                }
            });
            jgVar.lh(new cf<Throwable>() { // from class: com.bytedance.adsdk.vt.pno.3
                @Override // com.bytedance.adsdk.vt.cf
                public final /* synthetic */ void ouw(Throwable th2) {
                    pno.ouw.remove(str);
                    atomicBoolean.set(true);
                    if (pno.ouw.size() == 0) {
                        pno.lh();
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, jg<ra>> map2 = ouw;
                map2.put(str, jgVar);
                if (map2.size() == 1) {
                    lh();
                }
            }
        }
        return jgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1 A[Catch: all -> 0x007a, Exception -> 0x007d, PHI: r13 r21 r22
  0x01b1: PHI (r13v30 java.util.HashMap) = 
  (r13v3 java.util.HashMap)
  (r13v4 java.util.HashMap)
  (r13v5 java.util.HashMap)
  (r13v6 java.util.HashMap)
  (r13v7 java.util.HashMap)
  (r13v8 java.util.HashMap)
  (r13v9 java.util.HashMap)
  (r13v10 java.util.HashMap)
  (r13v11 java.util.HashMap)
  (r13v12 java.util.HashMap)
  (r13v23 java.util.HashMap)
  (r13v31 java.util.HashMap)
 binds: [B:63:0x01aa, B:60:0x0198, B:57:0x0186, B:54:0x0174, B:49:0x013c, B:46:0x012a, B:43:0x0118, B:39:0x0100, B:36:0x00ef, B:33:0x00d7, B:17:0x0080, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x01b1: PHI (r21v21 float) = 
  (r21v2 float)
  (r21v3 float)
  (r21v4 float)
  (r21v5 float)
  (r21v6 float)
  (r21v7 float)
  (r21v8 float)
  (r21v9 float)
  (r21v10 float)
  (r21v11 float)
  (r21v16 float)
  (r21v22 float)
 binds: [B:63:0x01aa, B:60:0x0198, B:57:0x0186, B:54:0x0174, B:49:0x013c, B:46:0x012a, B:43:0x0118, B:39:0x0100, B:36:0x00ef, B:33:0x00d7, B:17:0x0080, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x01b1: PHI (r22v17 java.util.ArrayList) = 
  (r22v1 java.util.ArrayList)
  (r22v2 java.util.ArrayList)
  (r22v3 java.util.ArrayList)
  (r22v4 java.util.ArrayList)
  (r22v5 java.util.ArrayList)
  (r22v6 java.util.ArrayList)
  (r22v7 java.util.ArrayList)
  (r22v8 java.util.ArrayList)
  (r22v9 java.util.ArrayList)
  (r22v10 java.util.ArrayList)
  (r22v12 java.util.ArrayList)
  (r22v18 java.util.ArrayList)
 binds: [B:63:0x01aa, B:60:0x0198, B:57:0x0186, B:54:0x0174, B:49:0x013c, B:46:0x012a, B:43:0x0118, B:39:0x0100, B:36:0x00ef, B:33:0x00d7, B:17:0x0080, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x007d, blocks: (B:3:0x0002, B:4:0x004e, B:6:0x0054, B:7:0x005e, B:65:0x01b1, B:9:0x0068, B:11:0x0072, B:18:0x0085, B:20:0x008f, B:21:0x0093, B:23:0x009d, B:24:0x00a1, B:26:0x00ab, B:27:0x00af, B:29:0x00b9, B:32:0x00cc, B:34:0x00d9, B:35:0x00e4, B:37:0x00f1, B:38:0x00f5, B:40:0x0102, B:42:0x010d, B:44:0x011a, B:45:0x011f, B:47:0x012c, B:48:0x0131, B:50:0x013e, B:52:0x0163, B:53:0x0169, B:55:0x0176, B:56:0x017b, B:58:0x0188, B:59:0x018d, B:61:0x019a, B:62:0x019f, B:64:0x01ac, B:66:0x01b6), top: B:77:0x0002, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.bytedance.adsdk.vt.mwh<com.bytedance.adsdk.vt.ra> ouw(android.util.JsonReader r24, java.lang.String r25, boolean r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.pno.ouw(android.util.JsonReader, java.lang.String, boolean):com.bytedance.adsdk.vt.mwh");
    }

    private static tlj ouw(ra raVar, String str) {
        for (tlj tljVar : raVar.f7198lh.values()) {
            if (tljVar.yu.equals(str)) {
                return tljVar;
            }
        }
        return null;
    }
}
