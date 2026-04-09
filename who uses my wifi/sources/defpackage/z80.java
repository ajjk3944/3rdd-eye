package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class z80 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static q90 a(final String str, Callable callable, e2 e2Var) throws IOException {
        u80 u80VarA = str == null ? null : v80.b.a(str);
        q90 q90Var = u80VarA != null ? new q90(u80VarA) : null;
        HashMap map = a;
        if (str != null && map.containsKey(str)) {
            q90Var = (q90) map.get(str);
        }
        if (q90Var != null) {
            if (e2Var != null) {
                e2Var.run();
            }
            return q90Var;
        }
        q90 q90Var2 = new q90(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i = 0;
            q90Var2.b(new m90() { // from class: x80
                @Override // defpackage.m90
                public final void onResult(Object obj) {
                    switch (i) {
                        case 0:
                            HashMap map2 = z80.a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                z80.j();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = z80.a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                z80.j();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            q90Var2.a(new m90() { // from class: x80
                @Override // defpackage.m90
                public final void onResult(Object obj) {
                    switch (i2) {
                        case 0:
                            HashMap map2 = z80.a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                z80.j();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = z80.a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                z80.j();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, q90Var2);
                if (map.size() == 1) {
                    j();
                }
            }
        }
        return q90Var2;
    }

    public static o90 b(Context context, String str, String str2) {
        u80 u80VarA = str2 == null ? null : v80.b.a(str2);
        if (u80VarA != null) {
            return new o90(u80VarA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new o90(e);
        }
    }

    public static o90 c(Context context, InputStream inputStream, String str) {
        u80 u80VarA = str == null ? null : v80.b.a(str);
        if (u80VarA != null) {
            return new o90(u80VarA);
        }
        try {
            sn0 sn0Var = new sn0(ri0.a(inputStream));
            if (i(sn0Var, c).booleanValue()) {
                return g(context, new ZipInputStream(new rn0(sn0Var)), str);
            }
            if (i(sn0Var, d).booleanValue()) {
                return d(new GZIPInputStream(new rn0(sn0Var)), str);
            }
            String[] strArr = i40.j;
            return e(new j40(sn0Var), str, true);
        } catch (IOException e) {
            return new o90(e);
        }
    }

    public static o90 d(InputStream inputStream, String str) {
        sn0 sn0Var = new sn0(ri0.a(inputStream));
        String[] strArr = i40.j;
        return e(new j40(sn0Var), str, true);
    }

    public static o90 e(j40 j40Var, String str, boolean z) throws IOException {
        u80 u80VarA;
        try {
            if (str == null) {
                u80VarA = null;
            } else {
                try {
                    u80VarA = v80.b.a(str);
                } catch (Exception e) {
                    o90 o90Var = new o90(e);
                    if (z) {
                        l41.b(j40Var);
                    }
                    return o90Var;
                }
            }
            if (u80VarA != null) {
                o90 o90Var2 = new o90(u80VarA);
                if (z) {
                    l41.b(j40Var);
                }
                return o90Var2;
            }
            u80 u80VarA2 = a90.a(j40Var);
            if (str != null) {
                v80.b.a.m(str, u80VarA2);
            }
            o90 o90Var3 = new o90(u80VarA2);
            if (z) {
                l41.b(j40Var);
            }
            return o90Var3;
        } catch (Throwable th) {
            if (z) {
                l41.b(j40Var);
            }
            throw th;
        }
    }

    public static o90 f(int i, Context context, String str) {
        u80 u80VarA = str == null ? null : v80.b.a(str);
        if (u80VarA != null) {
            return new o90(u80VarA);
        }
        try {
            sn0 sn0Var = new sn0(ri0.a(context.getResources().openRawResource(i)));
            if (i(sn0Var, c).booleanValue()) {
                return g(context, new ZipInputStream(new rn0(sn0Var)), str);
            }
            if (!i(sn0Var, d).booleanValue()) {
                String[] strArr = i40.j;
                return e(new j40(sn0Var), str, true);
            }
            try {
                return d(new GZIPInputStream(new rn0(sn0Var)), str);
            } catch (IOException e) {
                return new o90(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new o90(e2);
        }
    }

    public static o90 g(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return h(context, zipInputStream, str);
        } finally {
            l41.b(zipInputStream);
        }
    }

    public static o90 h(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        u80 u80VarA;
        l90 l90Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            u80VarA = null;
        } else {
            try {
                u80VarA = v80.b.a(str);
            } catch (IOException e) {
                return new o90(e);
            }
        }
        if (u80VarA != null) {
            return new o90(u80VarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        u80 u80Var = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                sn0 sn0Var = new sn0(ri0.a(zipInputStream));
                String[] strArr = i40.j;
                u80Var = e(new j40(sn0Var), null, false).a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new o90(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    j80.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    j80.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (u80Var == null) {
            return new o90(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) u80Var.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    l90Var = null;
                    break;
                }
                l90Var = (l90) it.next();
                if (l90Var.d.equals(str4)) {
                    break;
                }
            }
            if (l90Var != null) {
                l90Var.f = l41.d((Bitmap) entry.getValue(), l90Var.a, l90Var.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (gv gvVar : u80Var.f.values()) {
                if (gvVar.a.equals(entry2.getKey())) {
                    gvVar.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                j80.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) u80Var.c()).entrySet().iterator();
            while (it2.hasNext()) {
                l90 l90Var2 = (l90) ((Map.Entry) it2.next()).getValue();
                if (l90Var2 == null) {
                    return null;
                }
                String str5 = l90Var2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            l90Var2.f = l41.d(bitmapDecodeByteArray, l90Var2.a, l90Var2.b);
                        }
                    } catch (IllegalArgumentException e2) {
                        j80.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            v80.b.a.m(str, u80Var);
        }
        return new o90(u80Var);
    }

    public static Boolean i(sn0 sn0Var, byte[] bArr) throws EOFException {
        try {
            sn0 sn0Var2 = new sn0(new pk0(sn0Var));
            for (byte b2 : bArr) {
                if (!sn0Var2.d(1L)) {
                    throw new EOFException();
                }
                if (sn0Var2.f.c() != b2) {
                    return Boolean.FALSE;
                }
            }
            sn0Var2.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            j80.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void j() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String k(Context context, int i) {
        return ex0.j(new StringBuilder("rawRes"), (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", i);
    }
}
