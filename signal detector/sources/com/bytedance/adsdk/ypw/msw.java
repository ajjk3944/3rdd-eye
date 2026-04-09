package com.bytedance.adsdk.ypw;

import A.f;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.ypw.bw.rie;
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

/* loaded from: classes.dex */
public class msw {
    private static final Map<String, sz<uym>> emc = new HashMap();
    private static final Set<Object> ypw = new HashSet();
    private static final byte[] xq = {80, 75, 3, 4};

    public static sup<uym> xq(Context context, String str) {
        return xq(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static sz<uym> ypw(Context context, String str) {
        return ypw(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static sz<uym> emc(Context context, String str) {
        return emc(context, str, "url_".concat(String.valueOf(str)));
    }

    public static sup<uym> xq(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return ypw(context.getAssets().open(str), str2);
            }
            return emc(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e6) {
            return new sup<>((Throwable) e6);
        }
    }

    public static sz<uym> ypw(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return emc(str2, new Callable<sup<uym>>() { // from class: com.bytedance.adsdk.ypw.msw.4
            @Override // java.util.concurrent.Callable
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public sup<uym> call() {
                return msw.xq(applicationContext, str, str2);
            }
        });
    }

    public static sz<uym> emc(final Context context, final String str, final String str2) {
        return emc(str2, new Callable<sup<uym>>() { // from class: com.bytedance.adsdk.ypw.msw.1
            @Override // java.util.concurrent.Callable
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public sup<uym> call() {
                sup<uym> supVarEmc = bw.emc(context).emc(context, str, str2);
                if (str2 != null && supVarEmc.emc() != null) {
                    com.bytedance.adsdk.ypw.xq.bw.emc().emc(str2, supVarEmc.emc());
                }
                return supVarEmc;
            }
        });
    }

    public static sz<uym> emc(Context context, int i) {
        return emc(context, i, xq(context, i));
    }

    public static sup<uym> ypw(Context context, int i) {
        return ypw(context, i, xq(context, i));
    }

    public static sz<uym> emc(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return emc(str, new Callable<sup<uym>>() { // from class: com.bytedance.adsdk.ypw.msw.5
            @Override // java.util.concurrent.Callable
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public sup<uym> call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return msw.ypw(context2, i, str);
            }
        });
    }

    public static sup<uym> ypw(Context context, int i, String str) {
        try {
            return ypw(context.getResources().openRawResource(i), xq(context, i));
        } catch (Resources.NotFoundException e6) {
            return new sup<>((Throwable) e6);
        }
    }

    private static String xq(Context context, int i) {
        return f.i(i, emc(context) ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }

    public static sup<uym> ypw(InputStream inputStream, String str) {
        return emc(inputStream, str, true);
    }

    private static boolean emc(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static sup<uym> ypw(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        FileOutputStream fileOutputStream;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            uym uymVarEmc = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    uymVarEmc = emc(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).emc();
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
                        } catch (Throwable unused) {
                        }
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                file.getAbsolutePath();
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                                throw th2;
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
            if (uymVarEmc == null) {
                return new sup<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                ru ruVarEmc = emc(uymVarEmc, (String) entry.getKey());
                if (ruVarEmc != null) {
                    ruVarEmc.emc(com.bytedance.adsdk.ypw.ycc.ycc.emc((Bitmap) entry.getValue(), ruVarEmc.emc(), ruVarEmc.ypw()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z6 = false;
                for (com.bytedance.adsdk.ypw.xq.xq xqVar : uymVarEmc.cf().values()) {
                    if (xqVar.emc().equals(entry2.getKey())) {
                        xqVar.emc((Typeface) entry2.getValue());
                        z6 = true;
                    }
                }
                if (!z6) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, ru>> it = uymVarEmc.vk().entrySet().iterator();
                while (it.hasNext()) {
                    ru value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strZz = value.zz();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strZz.startsWith("data:") && strZz.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strZz.substring(strZz.indexOf(44) + 1), 0);
                            value.emc(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, ru> entry3 : uymVarEmc.vk().entrySet()) {
                if (entry3.getValue().gbl() == null) {
                    return new sup<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().zz()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.ypw.xq.bw.emc().emc(str, uymVarEmc);
            }
            return new sup<>(uymVarEmc);
        } catch (IOException e6) {
            return new sup<>((Throwable) e6);
        }
    }

    public static sz<uym> emc(final InputStream inputStream, final String str) {
        return emc(str, new Callable<sup<uym>>() { // from class: com.bytedance.adsdk.ypw.msw.6
            @Override // java.util.concurrent.Callable
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public sup<uym> call() {
                return msw.ypw(inputStream, str);
            }
        });
    }

    private static sup<uym> emc(InputStream inputStream, String str, boolean z6) throws IOException {
        try {
            return emc(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z6) {
                com.bytedance.adsdk.ypw.ycc.ycc.emc(inputStream);
            }
        }
    }

    public static sup<uym> emc(JsonReader jsonReader, String str) {
        return emc(jsonReader, str, true);
    }

    private static sup<uym> emc(JsonReader jsonReader, String str, boolean z6) throws IOException {
        try {
            try {
                uym uymVarEmc = rie.emc(jsonReader);
                com.bytedance.adsdk.ypw.xq.bw.emc().emc(str, uymVarEmc);
                sup<uym> supVar = new sup<>(uymVarEmc);
                if (z6) {
                    emc(jsonReader);
                }
                return supVar;
            } catch (Exception e6) {
                sup<uym> supVar2 = new sup<>(e6);
                if (z6) {
                    emc(jsonReader);
                }
                return supVar2;
            }
        } catch (Throwable th) {
            if (z6) {
                emc(jsonReader);
            }
            throw th;
        }
    }

    public static void emc(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    public static sup<uym> emc(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return ypw(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.ypw.ycc.ycc.emc(zipInputStream);
        }
    }

    private static ru emc(uym uymVar, String str) {
        for (ru ruVar : uymVar.vk().values()) {
            if (ruVar.zz().equals(str)) {
                return ruVar;
            }
        }
        return null;
    }

    private static sz<uym> emc(final String str, Callable<sup<uym>> callable) {
        final uym uymVarEmc = str == null ? null : com.bytedance.adsdk.ypw.xq.bw.emc().emc(str);
        if (uymVarEmc != null) {
            return new sz<>(new Callable<sup<uym>>() { // from class: com.bytedance.adsdk.ypw.msw.7
                @Override // java.util.concurrent.Callable
                /* renamed from: emc, reason: merged with bridge method [inline-methods] */
                public sup<uym> call() {
                    return new sup<>(uymVarEmc);
                }
            });
        }
        if (str != null) {
            Map<String, sz<uym>> map = emc;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        sz<uym> szVar = new sz<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            szVar.emc(new gbl<uym>() { // from class: com.bytedance.adsdk.ypw.msw.2
                @Override // com.bytedance.adsdk.ypw.gbl
                public void emc(uym uymVar) {
                    msw.emc.remove(str);
                    atomicBoolean.set(true);
                    if (msw.emc.size() == 0) {
                        msw.ypw(true);
                    }
                }
            });
            szVar.xq(new gbl<Throwable>() { // from class: com.bytedance.adsdk.ypw.msw.3
                @Override // com.bytedance.adsdk.ypw.gbl
                public void emc(Throwable th) {
                    msw.emc.remove(str);
                    atomicBoolean.set(true);
                    if (msw.emc.size() == 0) {
                        msw.ypw(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, sz<uym>> map2 = emc;
                map2.put(str, szVar);
                if (map2.size() == 1) {
                    ypw(false);
                }
            }
        }
        return szVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(boolean z6) {
        ArrayList arrayList = new ArrayList(ypw);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }
}
