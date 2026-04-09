package r8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
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
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f21348a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f21349b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f21350c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f21351d = {31, -117, 8};

    public static c0 a(final String str, Callable callable, j4.o oVar) throws XmlPullParserException, InterruptedException, Resources.NotFoundException, IOException {
        h hVarA = str == null ? null : x8.h.f25094b.a(str);
        c0 c0Var = hVarA != null ? new c0(hVarA) : null;
        HashMap map = f21348a;
        if (str != null && map.containsKey(str)) {
            c0Var = (c0) map.get(str);
        }
        if (c0Var != null) {
            if (oVar != null) {
                oVar.run();
            }
            return c0Var;
        }
        c0 c0Var2 = new c0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i10 = 0;
            c0Var2.b(new y() { // from class: r8.j
                @Override // r8.y
                public final void onResult(Object obj) {
                    switch (i10) {
                        case 0:
                            HashMap map2 = l.f21348a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                l.j();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = l.f21348a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                l.j();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i11 = 1;
            c0Var2.a(new y() { // from class: r8.j
                @Override // r8.y
                public final void onResult(Object obj) {
                    switch (i11) {
                        case 0:
                            HashMap map2 = l.f21348a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                l.j();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = l.f21348a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                l.j();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, c0Var2);
                if (map.size() == 1) {
                    j();
                }
            }
        }
        return c0Var2;
    }

    public static a0 b(Context context, String str, String str2) {
        h hVarA = str2 == null ? null : x8.h.f25094b.a(str2);
        if (hVarA != null) {
            return new a0(hVarA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e4) {
            return new a0(e4);
        }
    }

    public static a0 c(Context context, InputStream inputStream, String str) {
        h hVarA = str == null ? null : x8.h.f25094b.a(str);
        if (hVarA != null) {
            return new a0(hVarA);
        }
        try {
            cv.z zVarE = a.a.e(a.a.E(inputStream));
            int i10 = 1;
            if (i(zVarE, f21350c).booleanValue()) {
                return g(context, new ZipInputStream(new cv.f(zVarE, i10)), str);
            }
            if (i(zVarE, f21351d).booleanValue()) {
                return d(new GZIPInputStream(new cv.f(zVarE, i10)), str);
            }
            String[] strArr = d9.b.f7177x;
            return e(new d9.c(zVarE), str, true);
        } catch (IOException e4) {
            return new a0(e4);
        }
    }

    public static a0 d(InputStream inputStream, String str) {
        cv.z zVarE = a.a.e(a.a.E(inputStream));
        String[] strArr = d9.b.f7177x;
        return e(new d9.c(zVarE), str, true);
    }

    public static a0 e(d9.c cVar, String str, boolean z10) throws IOException {
        h hVarA;
        try {
            if (str == null) {
                hVarA = null;
            } else {
                try {
                    hVarA = x8.h.f25094b.a(str);
                } catch (Exception e4) {
                    a0 a0Var = new a0(e4);
                    if (z10) {
                        e9.j.b(cVar);
                    }
                    return a0Var;
                }
            }
            if (hVarA != null) {
                a0 a0Var2 = new a0(hVarA);
                if (z10) {
                    e9.j.b(cVar);
                }
                return a0Var2;
            }
            h hVarA2 = c9.u.a(cVar);
            if (str != null) {
                x8.h.f25094b.f25095a.l(str, hVarA2);
            }
            a0 a0Var3 = new a0(hVarA2);
            if (z10) {
                e9.j.b(cVar);
            }
            return a0Var3;
        } catch (Throwable th2) {
            if (z10) {
                e9.j.b(cVar);
            }
            throw th2;
        }
    }

    public static a0 f(int i10, Context context, String str) {
        h hVarA = str == null ? null : x8.h.f25094b.a(str);
        if (hVarA != null) {
            return new a0(hVarA);
        }
        try {
            cv.z zVarE = a.a.e(a.a.E(context.getResources().openRawResource(i10)));
            int i11 = 1;
            if (i(zVarE, f21350c).booleanValue()) {
                return g(context, new ZipInputStream(new cv.f(zVarE, i11)), str);
            }
            if (!i(zVarE, f21351d).booleanValue()) {
                String[] strArr = d9.b.f7177x;
                return e(new d9.c(zVarE), str, true);
            }
            try {
                return d(new GZIPInputStream(new cv.f(zVarE, i11)), str);
            } catch (IOException e4) {
                return new a0(e4);
            }
        } catch (Resources.NotFoundException e10) {
            return new a0(e10);
        }
    }

    public static a0 g(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return h(context, zipInputStream, str);
        } finally {
            e9.j.b(zipInputStream);
        }
    }

    public static a0 h(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        h hVarA;
        x xVar;
        FileOutputStream fileOutputStreamK;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            hVarA = null;
        } else {
            try {
                hVarA = x8.h.f25094b.a(str);
            } catch (IOException e4) {
                return new a0(e4);
            }
        }
        if (hVarA != null) {
            return new a0(hVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        h hVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                cv.z zVarE = a.a.e(a.a.E(zipInputStream));
                String[] strArr = d9.b.f7177x;
                hVar = e(new d9.c(zVarE), null, false).f21304a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new a0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    fileOutputStreamK = xu.l.k(new FileOutputStream(file), file);
                } catch (Throwable th2) {
                    e9.c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th2);
                }
                try {
                    FileOutputStream fileOutputStreamK2 = xu.l.k(new FileOutputStream(file), file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i10 = zipInputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            fileOutputStreamK2.write(bArr, 0, i10);
                        }
                        fileOutputStreamK2.flush();
                        fileOutputStreamK2.close();
                        fileOutputStreamK.close();
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            e9.c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    } catch (Throwable th3) {
                        try {
                            fileOutputStreamK2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        fileOutputStreamK.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (hVar == null) {
            return new a0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) hVar.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    xVar = null;
                    break;
                }
                xVar = (x) it.next();
                if (xVar.f21398d.equals(str4)) {
                    break;
                }
            }
            if (xVar != null) {
                xVar.f21400f = e9.j.d((Bitmap) entry.getValue(), xVar.f21395a, xVar.f21396b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z10 = false;
            for (x8.d dVar : hVar.f21328f.values()) {
                if (dVar.f25082a.equals(entry2.getKey())) {
                    dVar.f25085d = (Typeface) entry2.getValue();
                    z10 = true;
                }
            }
            if (!z10) {
                e9.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) hVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                x xVar2 = (x) ((Map.Entry) it2.next()).getValue();
                if (xVar2 == null) {
                    return null;
                }
                String str5 = xVar2.f21398d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            xVar2.f21400f = e9.j.d(bitmapDecodeByteArray, xVar2.f21395a, xVar2.f21396b);
                        }
                    } catch (IllegalArgumentException e10) {
                        e9.c.c("data URL did not have correct base64 format.", e10);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            x8.h.f25094b.f25095a.l(str, hVar);
        }
        return new a0(hVar);
    }

    public static Boolean i(cv.z zVar, byte[] bArr) {
        try {
            cv.z zVarF = zVar.f();
            for (byte b2 : bArr) {
                if (zVarF.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            zVarF.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            e9.c.f7982a.getClass();
            a aVar = d.f21312a;
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void j() {
        ArrayList arrayList = new ArrayList(f21349b);
        if (arrayList.size() > 0) {
            throw h0.b.e(0, arrayList);
        }
    }

    public static String k(Context context, int i10) {
        return c7.a.l(i10, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
