package f7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.lifecycle.o0;
import com.applovin.shadow.okio.internal.Buffer;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f23777a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f23778b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f23779c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f23780d = {31, -117, 8};

    public static e0 a(final String str, Callable callable, o0 o0Var) {
        j jVarA = str == null ? null : k7.g.f28064b.a(str);
        e0 e0Var = jVarA != null ? new e0(jVarA) : null;
        HashMap map = f23777a;
        if (str != null && map.containsKey(str)) {
            e0Var = (e0) map.get(str);
        }
        if (e0Var != null) {
            if (o0Var != null) {
                o0Var.run();
            }
            return e0Var;
        }
        e0 e0Var2 = new e0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i4 = 0;
            e0Var2.b(new a0() { // from class: f7.m
                @Override // f7.a0
                public final void onResult(Object obj) {
                    switch (i4) {
                        case 0:
                            HashMap map2 = o.f23777a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                o.j();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = o.f23777a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                o.j();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            e0Var2.a(new a0() { // from class: f7.m
                @Override // f7.a0
                public final void onResult(Object obj) {
                    switch (i10) {
                        case 0:
                            HashMap map2 = o.f23777a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                o.j();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = o.f23777a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                o.j();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, e0Var2);
                if (map.size() == 1) {
                    j();
                }
            }
        }
        return e0Var2;
    }

    public static c0 b(Context context, String str, String str2) {
        j jVarA = str2 == null ? null : k7.g.f28064b.a(str2);
        if (jVarA != null) {
            return new c0(jVarA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e2) {
            return new c0(e2);
        }
    }

    public static c0 c(Context context, InputStream inputStream, String str) {
        j jVarA = str == null ? null : k7.g.f28064b.a(str);
        if (jVarA != null) {
            return new c0(jVarA);
        }
        try {
            hm.q qVarD = u6.t.d(u6.t.q(inputStream));
            int i4 = 1;
            if (i(qVarD, f23779c).booleanValue()) {
                return g(context, new ZipInputStream(new hm.c(qVarD, i4)), str);
            }
            if (i(qVarD, f23780d).booleanValue()) {
                return d(new GZIPInputStream(new hm.c(qVarD, i4)), str);
            }
            String[] strArr = q7.a.f32199e;
            return e(new q7.b(qVarD), str, true);
        } catch (IOException e2) {
            return new c0(e2);
        }
    }

    public static c0 d(InputStream inputStream, String str) {
        hm.q qVarD = u6.t.d(u6.t.q(inputStream));
        String[] strArr = q7.a.f32199e;
        return e(new q7.b(qVarD), str, true);
    }

    public static c0 e(q7.b bVar, String str, boolean z3) throws IOException {
        j jVarA;
        try {
            if (str == null) {
                jVarA = null;
            } else {
                try {
                    jVarA = k7.g.f28064b.a(str);
                } catch (Exception e2) {
                    c0 c0Var = new c0(e2);
                    if (z3) {
                        r7.j.b(bVar);
                    }
                    return c0Var;
                }
            }
            if (jVarA != null) {
                c0 c0Var2 = new c0(jVarA);
                if (z3) {
                    r7.j.b(bVar);
                }
                return c0Var2;
            }
            j jVarA2 = p7.r.a(bVar);
            if (str != null) {
                k7.g.f28064b.f28065a.k(str, jVarA2);
            }
            c0 c0Var3 = new c0(jVarA2);
            if (z3) {
                r7.j.b(bVar);
            }
            return c0Var3;
        } catch (Throwable th2) {
            if (z3) {
                r7.j.b(bVar);
            }
            throw th2;
        }
    }

    public static c0 f(Context context, int i4, String str) {
        j jVarA = str == null ? null : k7.g.f28064b.a(str);
        if (jVarA != null) {
            return new c0(jVarA);
        }
        try {
            hm.q qVarD = u6.t.d(u6.t.q(context.getResources().openRawResource(i4)));
            int i10 = 1;
            if (i(qVarD, f23779c).booleanValue()) {
                return g(context, new ZipInputStream(new hm.c(qVarD, i10)), str);
            }
            if (!i(qVarD, f23780d).booleanValue()) {
                String[] strArr = q7.a.f32199e;
                return e(new q7.b(qVarD), str, true);
            }
            try {
                return d(new GZIPInputStream(new hm.c(qVarD, i10)), str);
            } catch (IOException e2) {
                return new c0(e2);
            }
        } catch (Resources.NotFoundException e10) {
            return new c0(e10);
        }
    }

    public static c0 g(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return h(context, zipInputStream, str);
        } finally {
            r7.j.b(zipInputStream);
        }
    }

    public static c0 h(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        j jVarA;
        z zVar;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            jVarA = null;
        } else {
            try {
                jVarA = k7.g.f28064b.a(str);
            } catch (IOException e2) {
                return new c0(e2);
            }
        }
        if (jVarA != null) {
            return new c0(jVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        j jVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                hm.q qVarD = u6.t.d(u6.t.q(zipInputStream));
                String[] strArr = q7.a.f32199e;
                jVar = e(new q7.b(qVarD), null, false).f23716a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new c0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[Buffer.SEGMENTING_THRESHOLD];
                            while (true) {
                                int i4 = zipInputStream.read(bArr);
                                if (i4 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i4);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } finally {
                    }
                } catch (Throwable th4) {
                    r7.d.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th4);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    r7.d.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (jVar == null) {
            return new c0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) jVar.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    zVar = null;
                    break;
                }
                zVar = (z) it.next();
                if (zVar.f23830d.equals(str4)) {
                    break;
                }
            }
            if (zVar != null) {
                zVar.f23832f = r7.j.d((Bitmap) entry.getValue(), zVar.f23827a, zVar.f23828b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z3 = false;
            for (k7.c cVar : jVar.f23755f.values()) {
                if (cVar.f28052a.equals(entry2.getKey())) {
                    cVar.f28055d = (Typeface) entry2.getValue();
                    z3 = true;
                }
            }
            if (!z3) {
                r7.d.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) jVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                z zVar2 = (z) ((Map.Entry) it2.next()).getValue();
                if (zVar2 == null) {
                    return null;
                }
                String str5 = zVar2.f23830d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            zVar2.f23832f = r7.j.d(bitmapDecodeByteArray, zVar2.f23827a, zVar2.f23828b);
                        }
                    } catch (IllegalArgumentException e10) {
                        r7.d.c("data URL did not have correct base64 format.", e10);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            k7.g.f28064b.f28065a.k(str, jVar);
        }
        return new c0(jVar);
    }

    public static Boolean i(hm.q qVar, byte[] bArr) {
        try {
            hm.q qVarD = u6.t.d(new hm.o(qVar));
            for (byte b10 : bArr) {
                if (qVarD.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            qVarD.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            r7.d.f32852a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void j() {
        ArrayList arrayList = new ArrayList(f23778b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String k(int i4, Context context) {
        return d.h.q(i4, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
