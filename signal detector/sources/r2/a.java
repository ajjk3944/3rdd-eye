package R2;

import F4.e;
import J0.c;
import S4.r;
import a.AbstractC0241a;
import a4.p;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Looper;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import b4.C0345j;
import b4.InterfaceC0341f;
import b4.InterfaceC0342g;
import c5.C0408e;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.AbstractC1370jP;
import com.google.android.gms.internal.ads.C0752Tp;
import d4.h;
import e5.C2305a;
import e5.C2307c;
import h.AbstractActivityC2349g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import l1.InterfaceC2638d;
import org.json.JSONArray;
import p5.l;
import q0.C2793f;
import q5.i;
import s3.AbstractC2895a;
import s3.AbstractC2897c;
import u1.y;
import w.f;
import w.g;

/* loaded from: classes.dex */
public abstract class a implements InterfaceC0341f {

    /* renamed from: a, reason: collision with root package name */
    public static Context f3387a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f3388b = null;

    /* renamed from: c, reason: collision with root package name */
    public static double f3389c = -1.0d;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3390d = true;

    public static final int A(File file) throws IOException {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getInt();
            channel.close();
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0241a.a(channel, th);
                throw th2;
            }
        }
    }

    public static void F(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC2897c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC2895a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC2895a.a(outline, path);
        }
    }

    public static void G(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static final void H(Object obj) throws Throwable {
        if (obj instanceof C0408e) {
            throw ((C0408e) obj).f5923a;
        }
    }

    public static boolean J(ClassLoader classLoader, File file, File file2, boolean z6, r rVar, String str, InterfaceC0342g interfaceC0342g) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        Field fieldE = R3.b.E(classLoader, "pathList");
        try {
            Object objCast = Object.class.cast(fieldE.get(classLoader));
            C0345j c0345jB = R3.b.B(objCast, "dexElements", Object.class);
            List listAsList = Arrays.asList((Object[]) c0345jB.B());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listAsList) {
                Field fieldE2 = R3.b.E(obj, str);
                try {
                    arrayList2.add((File) File.class.cast(fieldE2.get(obj)));
                } catch (Exception e6) {
                    throw new c("Failed to get value of field " + fieldE2.getName() + " of type " + obj.getClass().getName() + " on object of type " + File.class.getName(), e6);
                }
            }
            if (!arrayList2.contains(file2)) {
                if (!z6 && !interfaceC0342g.b(objCast, file2, file)) {
                    Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
                    return false;
                }
                ArrayList arrayList3 = new ArrayList(Collections.singleton(file2));
                rVar.getClass();
                c0345jB.F(Arrays.asList((Object[]) R3.b.D(objCast, "makePathElements", List.class, arrayList3, file, List.class, arrayList)));
                if (!arrayList.isEmpty()) {
                    c cVar = new c("DexPathList.makeDexElement failed");
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        IOException iOException = (IOException) arrayList.get(i);
                        Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(cVar, iOException);
                        } catch (Exception unused) {
                        }
                    }
                    R3.b.B(objCast, "dexElementsSuppressedExceptions", IOException.class).F(arrayList);
                    throw cVar;
                }
            }
            return true;
        } catch (Exception e7) {
            throw new c("Failed to get value of field " + fieldE.getName() + " of type " + classLoader.getClass().getName() + " on object of type " + Object.class.getName(), e7);
        }
    }

    public static final C0408e d(Throwable th) {
        i.e(th, "exception");
        return new C0408e(th);
    }

    public static final void g(H0.c cVar) throws IOException, SQLException {
        C2307c c2307c = new C2307c(10);
        Cursor cursorP = cVar.p("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorP.moveToNext()) {
            try {
                c2307c.add(cursorP.getString(0));
            } finally {
            }
        }
        cursorP.close();
        ListIterator listIterator = p.a(c2307c).listIterator(0);
        while (true) {
            C2305a c2305a = (C2305a) listIterator;
            if (!c2305a.hasNext()) {
                return;
            }
            String str = (String) c2305a.next();
            i.d(str, "triggerName");
            if (str.startsWith("room_fts_content_sync_")) {
                cVar.h("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static JSONArray h() throws SecurityException {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo[] mediaCodecInfoArr;
        int i;
        int i3;
        String strValueOf;
        HashSet hashSet = new HashSet();
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        int length = codecInfos.length;
        int i6 = 0;
        while (i6 < length) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i6];
            if (!mediaCodecInfo.isEncoder() && (Build.VERSION.SDK_INT < 29 || !mediaCodecInfo.isAlias())) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length2 = supportedTypes.length;
                int i7 = 0;
                while (i7 < length2) {
                    if (supportedTypes[i7].equals("video/hevc") && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/hevc")) != null) {
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                        int length3 = codecProfileLevelArr.length;
                        int i8 = 0;
                        while (i8 < length3) {
                            int i9 = codecProfileLevelArr[i8].level;
                            Field[] fields = MediaCodecInfo.CodecProfileLevel.class.getFields();
                            int length4 = fields.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length4) {
                                    mediaCodecInfoArr = codecInfos;
                                    i = length;
                                    i3 = i6;
                                    strValueOf = String.valueOf(i9);
                                    break;
                                }
                                Field field = fields[i10];
                                mediaCodecInfoArr = codecInfos;
                                strValueOf = field.getName();
                                i = length;
                                i3 = i6;
                                if (field.getType() == Integer.TYPE && strValueOf.contains("HEVC")) {
                                    try {
                                        if (field.getInt(null) == i9) {
                                            break;
                                        }
                                    } catch (IllegalAccessException unused) {
                                        continue;
                                    }
                                }
                                i10++;
                                codecInfos = mediaCodecInfoArr;
                                length = i;
                                i6 = i3;
                            }
                            hashSet.add(strValueOf);
                            i8++;
                            codecInfos = mediaCodecInfoArr;
                            length = i;
                            i6 = i3;
                        }
                    }
                    i7++;
                    codecInfos = codecInfos;
                    length = length;
                    i6 = i6;
                }
            }
            i6++;
            codecInfos = codecInfos;
            length = length;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    public static boolean i() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static String k(Object obj, String str) {
        if (!f3390d) {
            return String.format(Locale.ENGLISH, str, Arrays.copyOf(new Object[]{obj}, 1));
        }
        Locale locale = e.f1457a;
        return String.format(e.b(), str, Arrays.copyOf(new Object[]{obj}, 1));
    }

    public static String l(String str, Comparable comparable, Comparable comparable2) {
        if (!f3390d) {
            return String.format(Locale.ENGLISH, str, Arrays.copyOf(new Object[]{comparable, comparable2}, 2));
        }
        Locale locale = e.f1457a;
        return String.format(e.b(), str, Arrays.copyOf(new Object[]{comparable, comparable2}, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x05b6 A[PHI: r42
  0x05b6: PHI (r42v2 java.lang.String) = (r42v1 java.lang.String), (r42v4 java.lang.String) binds: [B:119:0x05b4, B:115:0x05a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05e1 A[PHI: r43
  0x05e1: PHI (r43v2 java.lang.String) = (r43v1 java.lang.String), (r43v4 java.lang.String) binds: [B:129:0x05df, B:124:0x05cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x09ee A[PHI: r53
  0x09ee: PHI (r53v3 android.telephony.CellIdentityWcdma) = (r53v2 android.telephony.CellIdentityWcdma), (r53v5 android.telephony.CellIdentityWcdma) binds: [B:214:0x09ec, B:210:0x09dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0330 A[PHI: r30
  0x0330: PHI (r30v2 java.lang.String) = (r30v1 java.lang.String), (r30v4 java.lang.String) binds: [B:57:0x032e, B:52:0x031e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.lefan.signal.db.CellInfoBean m(java.lang.String r50, java.lang.String r51, android.telephony.CellInfo r52, android.content.Context r53) {
        /*
            Method dump skipped, instructions count: 4731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.a.m(java.lang.String, java.lang.String, android.telephony.CellInfo, android.content.Context):com.lefan.signal.db.CellInfoBean");
    }

    public static ColorStateList n(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC1370jP.q(drawable)) {
            return null;
        }
        return AbstractC1370jP.e(drawable).getColorStateList();
    }

    public static int p(List list, InputStream inputStream, C0752Tp c0752Tp) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, c0752Tp);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iF = ((InterfaceC2638d) list.get(i)).f(inputStream, c0752Tp);
                if (iF != -1) {
                    return iF;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType r(List list, InputStream inputStream, C0752Tp c0752Tp) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, c0752Tp);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = ((InterfaceC2638d) list.get(i)).d(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeD;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType s(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((InterfaceC2638d) list.get(i)).a(byteBuffer);
                AtomicReference atomicReference = H1.b.f1755a;
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = H1.b.f1755a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static synchronized boolean v(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f3387a;
        if (context2 != null && (bool = f3388b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f3388b = null;
        if (Q2.b.e()) {
            f3388b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f3388b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f3388b = Boolean.FALSE;
            }
        }
        f3387a = applicationContext;
        return f3388b.booleanValue();
    }

    public static final ArrayList w(Map map, l lVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C2793f c2793f = (C2793f) entry.getValue();
            if (c2793f != null && !c2793f.f22961b && !c2793f.f22962c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) lVar.f((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public abstract void B(boolean z6);

    public abstract void D(boolean z6);

    public abstract void E(boolean z6);

    public abstract TransformationMethod I(TransformationMethod transformationMethod);

    public abstract boolean a(g gVar, w.c cVar, w.c cVar2);

    public abstract boolean b(g gVar, Object obj, Object obj2);

    public abstract boolean c(g gVar, f fVar, f fVar2);

    public abstract Intent e(AbstractActivityC2349g abstractActivityC2349g, Object obj);

    public abstract InputFilter[] o(InputFilter[] inputFilterArr);

    public h q(AbstractActivityC2349g abstractActivityC2349g, Object obj) {
        return null;
    }

    public abstract boolean t();

    public abstract boolean u();

    public abstract Object x(Intent intent, int i);

    public abstract void y(f fVar, f fVar2);

    public abstract void z(f fVar, Thread thread);

    public void C(boolean z6) {
    }
}
