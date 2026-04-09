package i2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import f2.RunnableC4331a;
import ia.w.a;
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
import n2.C5349c;
import n2.C5353g;
import t2.AbstractC5601b;
import u2.C5624c;
import u2.C5629h;

/* compiled from: LottieCompositionFactory.java */
/* renamed from: i2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4453m {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f38371a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f38372b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f38373c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f38374d = {31, -117, 8};

    public static C4435H a(final String str, Callable callable, RunnableC4331a runnableC4331a) {
        C4448h c4448hA = str == null ? null : C5353g.f44272b.a(str);
        C4435H c4435h = c4448hA != null ? new C4435H(c4448hA) : null;
        HashMap map = f38371a;
        if (str != null && map.containsKey(str)) {
            c4435h = (C4435H) map.get(str);
        }
        if (c4435h != null) {
            if (runnableC4331a != null) {
                runnableC4331a.run();
            }
            return c4435h;
        }
        C4435H c4435h2 = new C4435H(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c4435h2.b(new InterfaceC4431D() { // from class: i2.j
                @Override // i2.InterfaceC4431D
                public final void onResult(Object obj) {
                    HashMap map2 = C4453m.f38371a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        C4453m.i(true);
                    }
                }
            });
            c4435h2.a(new InterfaceC4431D() { // from class: i2.k
                @Override // i2.InterfaceC4431D
                public final void onResult(Object obj) {
                    HashMap map2 = C4453m.f38371a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        C4453m.i(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, c4435h2);
                if (map.size() == 1) {
                    i(false);
                }
            }
        }
        return c4435h2;
    }

    public static C4434G<C4448h> b(Context context, String str, String str2) {
        C4448h c4448hA = str2 == null ? null : C5353g.f44272b.a(str2);
        if (c4448hA != null) {
            return new C4434G<>(c4448hA);
        }
        try {
            ia.w wVarC = ia.q.c(ia.q.g(context.getAssets().open(str)));
            return h(wVarC, f38373c).booleanValue() ? f(context, new ZipInputStream(wVarC.new a()), str2) : h(wVarC, f38374d).booleanValue() ? c(new GZIPInputStream(wVarC.new a()), str2) : c(wVarC.new a(), str2);
        } catch (IOException e4) {
            return new C4434G<>(e4);
        }
    }

    public static C4434G<C4448h> c(InputStream inputStream, String str) {
        ia.w wVarC = ia.q.c(ia.q.g(inputStream));
        String[] strArr = AbstractC5601b.f46383f;
        return d(new t2.c(wVarC), str, true);
    }

    public static C4434G d(t2.c cVar, String str, boolean z10) {
        C4448h c4448hA;
        try {
            if (str == null) {
                c4448hA = null;
            } else {
                try {
                    c4448hA = C5353g.f44272b.a(str);
                } catch (Exception e4) {
                    C4434G c4434g = new C4434G(e4);
                    if (z10) {
                        C5629h.b(cVar);
                    }
                    return c4434g;
                }
            }
            if (c4448hA != null) {
                C4434G c4434g2 = new C4434G(c4448hA);
                if (z10) {
                    C5629h.b(cVar);
                }
                return c4434g2;
            }
            C4448h c4448hA2 = s2.v.a(cVar);
            if (str != null) {
                C5353g.f44272b.f44273a.put(str, c4448hA2);
            }
            C4434G c4434g3 = new C4434G(c4448hA2);
            if (z10) {
                C5629h.b(cVar);
            }
            return c4434g3;
        } catch (Throwable th) {
            if (z10) {
                C5629h.b(cVar);
            }
            throw th;
        }
    }

    public static C4434G<C4448h> e(Context context, int i, String str) {
        C4448h c4448hA = str == null ? null : C5353g.f44272b.a(str);
        if (c4448hA != null) {
            return new C4434G<>(c4448hA);
        }
        try {
            ia.w wVarC = ia.q.c(ia.q.g(context.getResources().openRawResource(i)));
            if (h(wVarC, f38373c).booleanValue()) {
                return f(context, new ZipInputStream(wVarC.new a()), str);
            }
            if (!h(wVarC, f38374d).booleanValue()) {
                return c(wVarC.new a(), str);
            }
            try {
                return c(new GZIPInputStream(wVarC.new a()), str);
            } catch (IOException e4) {
                return new C4434G<>(e4);
            }
        } catch (Resources.NotFoundException e10) {
            return new C4434G<>(e10);
        }
    }

    public static C4434G<C4448h> f(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return g(context, zipInputStream, str);
        } finally {
            C5629h.b(zipInputStream);
        }
    }

    public static C4434G<C4448h> g(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        C4448h c4448hA;
        C4430C c4430c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c4448hA = null;
        } else {
            try {
                c4448hA = C5353g.f44272b.a(str);
            } catch (IOException e4) {
                return new C4434G<>(e4);
            }
        }
        if (c4448hA != null) {
            return new C4434G<>(c4448hA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C4448h c4448h = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                ia.w wVarC = ia.q.c(ia.q.g(zipInputStream));
                String[] strArr = AbstractC5601b.f46383f;
                c4448h = d(new t2.c(wVarC), null, false).f38325a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                File file = new File(context.getCacheDir(), str2);
                new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
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
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    C5624c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    C5624c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c4448h == null) {
            return new C4434G<>(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) c4448h.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    c4430c = null;
                    break;
                }
                c4430c = (C4430C) it.next();
                if (c4430c.f38286d.equals(str4)) {
                    break;
                }
            }
            if (c4430c != null) {
                c4430c.f38288f = C5629h.e((Bitmap) entry.getValue(), c4430c.f38283a, c4430c.f38284b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z10 = false;
            for (C5349c c5349c : c4448h.f38350f.values()) {
                if (c5349c.f44260a.equals(entry2.getKey())) {
                    c5349c.f44263d = (Typeface) entry2.getValue();
                    z10 = true;
                }
            }
            if (!z10) {
                C5624c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) c4448h.c()).entrySet().iterator();
            while (it2.hasNext()) {
                C4430C c4430c2 = (C4430C) ((Map.Entry) it2.next()).getValue();
                if (c4430c2 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String str5 = c4430c2.f38286d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        c4430c2.f38288f = C5629h.e(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), c4430c2.f38283a, c4430c2.f38284b);
                    } catch (IllegalArgumentException e10) {
                        C5624c.c("data URL did not have correct base64 format.", e10);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            C5353g.f44272b.f44273a.put(str, c4448h);
        }
        return new C4434G<>(c4448h);
    }

    public static Boolean h(ia.w wVar, byte[] bArr) {
        try {
            ia.w wVarC = ia.q.c(new ia.u(wVar));
            for (byte b10 : bArr) {
                if (wVarC.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            wVarC.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            C5624c.f46540a.getClass();
            EnumC4441a enumC4441a = C4444d.f38338a;
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void i(boolean z10) {
        ArrayList arrayList = new ArrayList(f38372b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((InterfaceC4436I) arrayList.get(i)).a();
        }
    }

    public static String j(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
