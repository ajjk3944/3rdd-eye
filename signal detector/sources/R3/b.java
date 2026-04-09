package R3;

import A1.n;
import A2.C0117e;
import L2.w;
import a4.t;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import b4.C0344i;
import b4.C0345j;
import c5.C0408e;
import c5.C0412i;
import com.google.android.gms.internal.ads.C0752Tp;
import d5.y;
import f0.C2318c;
import f0.q;
import f0.r;
import h0.C2352b;
import j2.C2545a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import n0.C2679a;
import o.a1;
import o1.InterfaceC2753a;
import o4.AbstractC2763b;
import q0.o;
import q2.I0;
import r1.C;
import r1.C2870A;
import u1.C2945C;
import u1.C2946a;
import u1.C2947b;
import u1.C2948c;
import u1.E;
import u1.m;
import u1.p;
import z5.AbstractC3025a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static f f3397a;

    /* renamed from: b, reason: collision with root package name */
    public static long f3398b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f3399c;

    public static File A(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, AbstractC2763b.e(str2, ".temp"));
    }

    public static C0345j B(Object obj, String str, Class cls) {
        return new C0345j(obj, E(obj, str), Array.newInstance((Class<?>) cls, 0).getClass(), 21);
    }

    public static Object C(Object obj, String str, Class cls, Class cls2, Serializable serializable) {
        try {
            return cls.cast(F(obj.getClass(), str, cls2).invoke(obj, serializable));
        } catch (Exception e6) {
            throw new J0.c("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e6);
        }
    }

    public static Object D(Object obj, String str, Class cls, ArrayList arrayList, File file, Class cls2, ArrayList arrayList2) {
        try {
            return Object[].class.cast(F(obj.getClass(), str, cls, File.class, cls2).invoke(obj, arrayList, file, arrayList2));
        } catch (Exception e6) {
            throw new J0.c("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e6);
        }
    }

    public static Field E(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new J0.c("Failed to find a field named " + str + " on an object of instance " + obj.getClass().getName());
    }

    public static Method F(Class cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new J0.c(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = b(r8, r9, r10)
            boolean r1 = b(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = u(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.b.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void c(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static r d(Context context) {
        ProviderInfo providerInfo;
        O.e eVar;
        ApplicationInfo applicationInfo;
        C0344i c2318c = Build.VERSION.SDK_INT >= 28 ? new C2318c(10) : new C0344i(10);
        PackageManager packageManager = context.getPackageManager();
        t.e(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            eVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrT = c2318c.t(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrT) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new O.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e6) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e6);
            }
        }
        if (eVar == null) {
            return null;
        }
        return new r(new q(context, eVar));
    }

    public static C2545a e(int i, String str) {
        return new C2545a(i, str, "com.google.ads.mediation.pangle", null);
    }

    public static com.bumptech.glide.j f(com.bumptech.glide.b bVar, ArrayList arrayList) {
        l1.j c2946a;
        l1.j gVar;
        InterfaceC2753a interfaceC2753a;
        int i;
        ContentResolver contentResolver;
        Class cls;
        InterfaceC2753a interfaceC2753a2 = bVar.f6484a;
        C0752Tp c0752Tp = bVar.f6487d;
        com.bumptech.glide.f fVar = bVar.f6486c;
        Context applicationContext = fVar.getApplicationContext();
        C0117e c0117e = fVar.f6505h;
        com.bumptech.glide.j jVar = new com.bumptech.glide.j();
        Class<InputStream> cls2 = InputStream.class;
        m mVar = new m();
        C1.b bVar2 = jVar.f6519g;
        synchronized (bVar2) {
            bVar2.f1138a.add(mVar);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            jVar.k(new u1.t());
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListF = jVar.f();
        y1.a aVar = new y1.a(applicationContext, arrayListF, interfaceC2753a2, c0752Tp);
        E e6 = new E(interfaceC2753a2, new p1.e(16));
        p pVar = new p(jVar.f(), resources.getDisplayMetrics(), interfaceC2753a2, c0752Tp);
        if (i3 < 28 || !((Map) c0117e.f245b).containsKey(y.class)) {
            u1.f fVar2 = new u1.f(pVar, 0);
            c2946a = new C2946a(pVar, 2, c0752Tp);
            gVar = fVar2;
        } else {
            l1.j gVar2 = new u1.g(1);
            gVar = new u1.g(0);
            c2946a = gVar2;
        }
        if (i3 >= 28) {
            i = i3;
            interfaceC2753a = interfaceC2753a2;
            jVar.d("Animation", InputStream.class, Drawable.class, new w1.b(new t2.q(arrayListF, 2, c0752Tp), 1));
            jVar.d("Animation", ByteBuffer.class, Drawable.class, new w1.b(new t2.q(arrayListF, 2, c0752Tp), 0));
        } else {
            interfaceC2753a = interfaceC2753a2;
            i = i3;
        }
        w1.d dVar = new w1.d(applicationContext);
        C2947b c2947b = new C2947b(c0752Tp);
        w wVar = new w(17, (byte) 0);
        z1.c cVar = new z1.c(1);
        ContentResolver contentResolver2 = applicationContext.getContentResolver();
        jVar.b(ByteBuffer.class, new C2870A(5));
        jVar.b(InputStream.class, new C2352b(12, c0752Tp));
        jVar.d("Bitmap", ByteBuffer.class, Bitmap.class, gVar);
        jVar.d("Bitmap", InputStream.class, Bitmap.class, c2946a);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            contentResolver = contentResolver2;
            cls = ParcelFileDescriptor.class;
        } else {
            contentResolver = contentResolver2;
            cls = ParcelFileDescriptor.class;
            jVar.d("Bitmap", cls, Bitmap.class, new u1.f(pVar, 1));
        }
        InterfaceC2753a interfaceC2753a3 = interfaceC2753a;
        jVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new E(interfaceC2753a3, new p1.e(13)));
        jVar.d("Bitmap", cls, Bitmap.class, e6);
        C2870A c2870a = C2870A.f23325b;
        jVar.a(Bitmap.class, Bitmap.class, c2870a);
        jVar.d("Bitmap", Bitmap.class, Bitmap.class, new C2945C(0));
        jVar.c(Bitmap.class, c2947b);
        jVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C2946a(resources, gVar));
        jVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C2946a(resources, c2946a));
        jVar.d("BitmapDrawable", cls, BitmapDrawable.class, new C2946a(resources, e6));
        jVar.c(BitmapDrawable.class, new V2.h(interfaceC2753a3, 29, c2947b));
        jVar.d("Animation", InputStream.class, y1.b.class, new y1.h(arrayListF, aVar, c0752Tp));
        jVar.d("Animation", ByteBuffer.class, y1.b.class, aVar);
        jVar.c(y1.b.class, new p1.e(22));
        jVar.a(k1.d.class, k1.d.class, c2870a);
        jVar.d("Bitmap", k1.d.class, Bitmap.class, new C2948c(interfaceC2753a3));
        jVar.d("legacy_append", Uri.class, Drawable.class, dVar);
        jVar.d("legacy_append", Uri.class, Bitmap.class, new C2946a(dVar, 1, interfaceC2753a3));
        jVar.i(new com.bumptech.glide.load.data.g(2));
        jVar.a(File.class, ByteBuffer.class, new C2870A(6));
        jVar.a(File.class, InputStream.class, new r1.g(new C2870A(9)));
        jVar.d("legacy_append", File.class, File.class, new C2945C(2));
        jVar.a(File.class, cls, new r1.g(new C2870A(8)));
        jVar.a(File.class, File.class, c2870a);
        jVar.i(new com.bumptech.glide.load.data.l(c0752Tp));
        if (!"robolectric".equals(str)) {
            jVar.i(new com.bumptech.glide.load.data.g(1));
        }
        n nVar = new n(applicationContext, 2);
        e eVar = new e(applicationContext, 2);
        J2.i iVar = new J2.i(applicationContext, 5, false);
        Class cls3 = Integer.TYPE;
        jVar.a(cls3, InputStream.class, nVar);
        jVar.a(Integer.class, InputStream.class, nVar);
        jVar.a(cls3, AssetFileDescriptor.class, eVar);
        jVar.a(Integer.class, AssetFileDescriptor.class, eVar);
        jVar.a(cls3, Drawable.class, iVar);
        jVar.a(Integer.class, Drawable.class, iVar);
        jVar.a(Uri.class, InputStream.class, new J2.i(applicationContext, 6, false));
        jVar.a(Uri.class, AssetFileDescriptor.class, new e(applicationContext, 4));
        C2352b c2352b = new C2352b(11, resources);
        d4.h hVar = new d4.h(15, resources);
        r1.y yVar = new r1.y(resources);
        jVar.a(Integer.class, Uri.class, c2352b);
        jVar.a(cls3, Uri.class, c2352b);
        jVar.a(Integer.class, AssetFileDescriptor.class, hVar);
        jVar.a(cls3, AssetFileDescriptor.class, hVar);
        jVar.a(Integer.class, InputStream.class, yVar);
        jVar.a(cls3, InputStream.class, yVar);
        jVar.a(String.class, InputStream.class, new C2352b(10));
        jVar.a(Uri.class, InputStream.class, new C2352b(10));
        jVar.a(String.class, InputStream.class, new C2870A(13));
        jVar.a(String.class, cls, new C2870A(12));
        jVar.a(String.class, AssetFileDescriptor.class, new C2870A(11));
        jVar.a(Uri.class, InputStream.class, new h2.d(applicationContext.getAssets()));
        jVar.a(Uri.class, AssetFileDescriptor.class, new d4.h(14, applicationContext.getAssets()));
        jVar.a(Uri.class, InputStream.class, new J2.i(applicationContext, 7, false));
        jVar.a(Uri.class, InputStream.class, new n(applicationContext, 3));
        if (i >= 29) {
            jVar.a(Uri.class, InputStream.class, new s1.b(applicationContext, cls2));
            jVar.a(Uri.class, cls, new s1.b(applicationContext, cls));
        }
        boolean zContainsKey = ((Map) c0117e.f245b).containsKey(com.bumptech.glide.e.class);
        ContentResolver contentResolver3 = contentResolver;
        jVar.a(Uri.class, InputStream.class, new C(contentResolver3, zContainsKey, 2));
        jVar.a(Uri.class, cls, new C(contentResolver3, zContainsKey, 1));
        jVar.a(Uri.class, AssetFileDescriptor.class, new C(contentResolver3, zContainsKey, 0));
        jVar.a(Uri.class, InputStream.class, new C2870A(14));
        jVar.a(URL.class, InputStream.class, new p1.e(4));
        jVar.a(Uri.class, File.class, new e(applicationContext, 3));
        jVar.a(r1.h.class, InputStream.class, new d4.h(16));
        jVar.a(byte[].class, ByteBuffer.class, new C2870A(2));
        jVar.a(byte[].class, InputStream.class, new C2870A(4));
        jVar.a(Uri.class, Uri.class, c2870a);
        jVar.a(Drawable.class, Drawable.class, c2870a);
        jVar.d("legacy_append", Drawable.class, Drawable.class, new C2945C(1));
        jVar.j(Bitmap.class, BitmapDrawable.class, new r1.y(resources));
        jVar.j(Bitmap.class, byte[].class, wVar);
        jVar.j(Drawable.class, byte[].class, new a1(interfaceC2753a3, wVar, cVar, 7));
        jVar.j(y1.b.class, byte[].class, cVar);
        E e7 = new E(interfaceC2753a3, new p1.e(14));
        jVar.d("legacy_append", ByteBuffer.class, Bitmap.class, e7);
        jVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C2946a(resources, e7));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw A.f.f(it);
        }
        return jVar;
    }

    public static C2545a g(int i, String str) {
        return new C2545a(i, str, "com.pangle.ads", null);
    }

    public static boolean h(String str, String str2) {
        q5.i.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i3 = 0;
            int i6 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i7 = i6 + 1;
                    if (i6 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt != '(') {
                        if (cCharAt == ')' && i3 - 1 == 0 && i6 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i3++;
                    }
                    i++;
                    i6 = i7;
                } else if (i3 == 0) {
                    String strSubstring = str.substring(1, str.length() - 1);
                    q5.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return q5.i.a(y5.l.j0(strSubstring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static String i(File file) throws NoSuchAlgorithmException, IOException {
        int i;
        if (!file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i3 = bufferedInputStream.read(bArr, 0, 1024);
                if (i3 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i3);
            }
            if (!TextUtils.isEmpty(null)) {
                throw null;
            }
            bufferedInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest == null || bArrDigest.length <= 0) {
                return "";
            }
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i6 = 0;
            for (byte b5 : bArrDigest) {
                int i7 = i6 + 1;
                cArr2[i6] = cArr[(b5 >>> 4) & 15];
                i6 += 2;
                cArr2[i7] = cArr[b5 & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String j(Double d6) {
        if (d6 == null) {
            if (!R2.a.f3390d) {
                return String.format(Locale.ENGLISH, "%d°%02d'%02d″", Arrays.copyOf(new Object[]{0, 0, 0}, 3));
            }
            Locale locale = F4.e.f1457a;
            return String.format(F4.e.b(), "%d°%02d'%02d″", Arrays.copyOf(new Object[]{0, 0, 0}, 3));
        }
        int iDoubleValue = (int) d6.doubleValue();
        double d7 = 60;
        double dDoubleValue = (d6.doubleValue() - iDoubleValue) * d7;
        int i = (int) dDoubleValue;
        Integer numValueOf = Integer.valueOf(iDoubleValue);
        Integer numValueOf2 = Integer.valueOf(Math.abs(i));
        Double dValueOf = Double.valueOf(Math.abs((dDoubleValue - i) * d7));
        if (!R2.a.f3390d) {
            return String.format(Locale.ENGLISH, "%d°%02d'%.2f″", Arrays.copyOf(new Object[]{numValueOf, numValueOf2, dValueOf}, 3));
        }
        Locale locale2 = F4.e.f1457a;
        return String.format(F4.e.b(), "%d°%02d'%.2f″", Arrays.copyOf(new Object[]{numValueOf, numValueOf2, dValueOf}, 3));
    }

    public static w.k m(w.i iVar) {
        w.h hVar = new w.h();
        hVar.f23926c = new w.l();
        w.k kVar = new w.k(hVar);
        hVar.f23925b = kVar;
        hVar.f23924a = iVar.getClass();
        try {
            Object objO = iVar.o(hVar);
            if (objO == null) {
                return kVar;
            }
            hVar.f23924a = objO;
            return kVar;
        } catch (Exception e6) {
            kVar.f23930b.i(e6);
            return kVar;
        }
    }

    public static o n(a0 a0Var) {
        C2679a c2679a = C2679a.f22142b;
        q5.i.e(c2679a, "defaultCreationExtras");
        V2.e eVar = new V2.e(a0Var, o.f23002c, c2679a);
        q5.d dVarA = q5.p.a(o.class);
        String strS = com.bumptech.glide.d.s(dVarA);
        if (strS != null) {
            return (o) eVar.q(dVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static String p(String str) {
        Object objD;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            q5.i.d(method, "getMethod(...)");
            Object objInvoke = method.invoke(null, str);
            q5.i.c(objInvoke, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) objInvoke;
            boolean zB0 = y5.l.b0(str2);
            objD = str2;
            if (zB0) {
                objD = null;
            }
        } catch (Throwable th) {
            objD = R2.a.d(th);
        }
        return (String) (objD instanceof C0408e ? null : objD);
    }

    public static boolean q(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i3 = rect.right;
            int i6 = rect2.right;
            return (i3 > i6 || rect.left >= i6) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            return (i7 > i8 || rect.top >= i8) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i9 = rect.left;
            int i10 = rect2.left;
            return (i9 < i10 || rect.right <= i10) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        return (i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom;
    }

    public static void r() {
        I0.d().f23126j.getClass();
    }

    public static boolean s() {
        if (Build.VERSION.SDK_INT >= 29) {
            return K0.a.a();
        }
        try {
            if (f3399c == null) {
                f3398b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3399c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3399c.invoke(null, Long.valueOf(f3398b))).booleanValue();
        } catch (Exception e6) {
            if (!(e6 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e6);
                return false;
            }
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static int u(int i, Rect rect, Rect rect2) {
        int i3;
        int i6;
        if (i == 17) {
            i3 = rect.left;
            i6 = rect2.right;
        } else if (i == 33) {
            i3 = rect.top;
            i6 = rect2.bottom;
        } else if (i == 66) {
            i3 = rect2.left;
            i6 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i6 = rect.bottom;
        }
        return Math.max(0, i3 - i6);
    }

    public static int v(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static int w(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d6 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        return d6 < -2.147483648E9d ? LinearLayoutManager.INVALID_OFFSET : (int) Math.round(d6);
    }

    public static int x(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void y(p5.p pVar, AbstractC3025a abstractC3025a, AbstractC3025a abstractC3025a2) {
        try {
            E5.a.g(com.bumptech.glide.c.B(((j5.b) pVar).j(abstractC3025a2, abstractC3025a)), C0412i.f5929a);
        } catch (Throwable th) {
            abstractC3025a2.e(R2.a.d(th));
            throw th;
        }
    }

    public static File z(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public abstract Method k(Class cls, Field field);

    public abstract Constructor l(Class cls);

    public abstract String[] o(Class cls);

    public abstract boolean t(Class cls);
}
