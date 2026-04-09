package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.shadow.okio.Segment;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.xz;
import com.liuzh.deviceinfo.R;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class d5 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f19661a = true;

    public static String A(x4 x4Var) {
        StringBuilder sb2 = new StringBuilder(x4Var.d());
        for (int i4 = 0; i4 < x4Var.d(); i4++) {
            byte bA = x4Var.a(i4);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bA);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static z4 B() {
        String str;
        ClassLoader classLoader = d5.class.getClassLoader();
        if (z4.class.equals(z4.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!z4.class.getPackage().equals(d5.class.getPackage())) {
                throw new IllegalArgumentException(z4.class.getName());
            }
            str = z4.class.getPackage().getName() + ".BlazeGenerated" + z4.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    d.h.C(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (InstantiationException e2) {
                    throw new IllegalStateException(e2);
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new d5[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e13) {
                        Logger.getLogger(y4.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(z4.class.getSimpleName()), (Throwable) e13);
                    }
                }
                if (arrayList.size() == 1) {
                    return (z4) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (z4) z4.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(e14);
                } catch (NoSuchMethodException e15) {
                    throw new IllegalStateException(e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(e16);
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    public static d3.d a() {
        return new d3.d(1.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(n1.s r7, g3.f r8) {
        /*
            n1.q r0 = r7.u0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L89
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L37
            if (r0 == r3) goto L89
            if (r0 != r1) goto L31
            boolean r0 = q(r7, r8)
            if (r0 != 0) goto L7d
            n1.n r0 = r7.r0()
            boolean r0 = r0.f29530a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L7c
            goto L7d
        L31:
            ac.m r7 = new ac.m
            r7.<init>()
            throw r7
        L37:
            n1.s r0 = com.google.android.gms.internal.measurement.z3.i(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L83
            n1.q r6 = r0.u0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L7e
            if (r6 == r4) goto L5b
            if (r6 == r3) goto L7e
            if (r6 == r1) goto L55
            ac.m r7 = new ac.m
            r7.<init>()
            throw r7
        L55:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5b:
            boolean r1 = b(r0, r8)
            if (r1 != 0) goto L7d
            boolean r7 = g(r7, r0, r3, r8)
            if (r7 != 0) goto L7d
            n1.n r7 = r0.r0()
            boolean r7 = r7.f29530a
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            return r2
        L7d:
            return r4
        L7e:
            boolean r7 = g(r7, r0, r3, r8)
            return r7
        L83:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L89:
            boolean r7 = q(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d5.b(n1.s, g3.f):boolean");
    }

    public static final void c(AutoCloseable autoCloseable, Throwable th2) throws Exception {
        if (autoCloseable != null) {
            if (th2 != null) {
                try {
                    d.h.B(autoCloseable);
                    return;
                } catch (Throwable th3) {
                    wd.b.a(th2, th3);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (autoCloseable instanceof ExecutorService) {
                a3.a.k((ExecutorService) autoCloseable);
                return;
            }
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
            if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
    }

    public static w4.o d(Context context) {
        ProviderInfo providerInfo;
        b4.f fVar;
        ApplicationInfo applicationInfo;
        ja.c cVar = Build.VERSION.SDK_INT >= 28 ? new w4.c() : new ja.c();
        PackageManager packageManager = context.getPackageManager();
        pk.a.e(packageManager, "Package manager required to locate emoji font provider");
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
            fVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrW = cVar.w(str2, packageManager);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrW) {
                    arrayList.add(signature.toByteArray());
                }
                fVar = new b4.f(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
        }
        if (fVar == null) {
            return null;
        }
        return new w4.o(new w4.n(context, fVar));
    }

    public static int e(int i4, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i4 + (i4 >> 1) + 1;
        if (iHighestOneBit < i10) {
            iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public static final boolean f(n1.s sVar, g3.f fVar) {
        int iOrdinal = sVar.u0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                n1.s sVarI = z3.i(sVar);
                if (sVarI != null) {
                    return f(sVarI, fVar) || g(sVar, sVarI, 1, fVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return sVar.r0().f29530a ? ((Boolean) fVar.invoke(sVar)).booleanValue() : r(sVar, fVar);
                }
                throw new ac.m();
            }
        }
        return r(sVar, fVar);
    }

    public static final boolean g(n1.s sVar, n1.s sVar2, int i4, g3.f fVar) {
        if (t(sVar, sVar2, i4, fVar)) {
            return true;
        }
        Boolean bool = (Boolean) com.bumptech.glide.e.Q(sVar, i4, new n1.u(((xz) ((j2.r) i2.k.t(sVar)).getFocusOwner()).h(), sVar, sVar2, i4, fVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final b7.l h(b7.r rVar) {
        nk.k.e(rVar, "<this>");
        return new b7.l(rVar.f2030a, rVar.f2047t);
    }

    public static Drawable i(Context context, Context context2, int i4, Resources.Theme theme) {
        try {
            if (f19661a) {
                return p(context2, i4, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return context2.getDrawable(i4);
        } catch (NoClassDefFoundError unused2) {
            f19661a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = u3.k.f35091a;
        return resources.getDrawable(i4, theme);
    }

    public static long j(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a4.f.h(packageInfo) : packageInfo.versionCode;
    }

    public static int k(List list, InputStream inputStream, a8.g gVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new g8.y(inputStream, gVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                int iD = ((x7.d) list.get(i4)).d(inputStream, gVar);
                if (iD != -1) {
                    return iD;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType l(List list, InputStream inputStream, a8.g gVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new g8.y(inputStream, gVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = ((x7.d) list.get(i4)).c(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeC;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType m(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((x7.d) list.get(i4)).a(byteBuffer);
                AtomicReference atomicReference = t8.b.f34503a;
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th2) {
                AtomicReference atomicReference2 = t8.b.f34503a;
                throw th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static Drawable p(Context context, int i4, Resources.Theme theme) {
        if (theme != null) {
            n.c cVar = new n.c(context);
            cVar.f29443b = theme;
            cVar.a(theme.getResources().getConfiguration());
            context = cVar;
        }
        return jm.a.l(i4, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean q(n1.s sVar, g3.f fVar) {
        n1.s[] sVarArr = new n1.s[16];
        if (!sVar.f25554a.f25565n) {
            f2.a.b("visitChildren called on an unattached node");
        }
        w0.e eVar = new w0.e(new i1.m[16]);
        i1.m mVar = sVar.f25554a;
        i1.m mVar2 = mVar.f25559f;
        if (mVar2 == null) {
            i2.k.b(eVar, mVar);
        } else {
            eVar.b(mVar2);
        }
        int i4 = 0;
        while (true) {
            int i10 = eVar.f36399c;
            if (i10 == 0) {
                break;
            }
            i1.m mVarE = (i1.m) eVar.l(i10 - 1);
            if ((mVarE.f25557d & Segment.SHARE_MINIMUM) == 0) {
                i2.k.b(eVar, mVarE);
            } else {
                while (true) {
                    if (mVarE == null) {
                        break;
                    }
                    if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0) {
                        w0.e eVar2 = null;
                        while (mVarE != null) {
                            if (mVarE instanceof n1.s) {
                                n1.s sVar2 = (n1.s) mVarE;
                                int i11 = i4 + 1;
                                if (sVarArr.length < i11) {
                                    int length = sVarArr.length;
                                    ?? r10 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(sVarArr, 0, r10, 0, length);
                                    sVarArr = r10;
                                }
                                sVarArr[i4] = sVar2;
                                i4 = i11;
                            } else if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE instanceof i2.j)) {
                                int i12 = 0;
                                for (i1.m mVar3 = ((i2.j) mVarE).f25691p; mVar3 != null; mVar3 = mVar3.f25559f) {
                                    if ((mVar3.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            mVarE = mVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new w0.e(new i1.m[16]);
                                            }
                                            if (mVarE != null) {
                                                eVar2.b(mVarE);
                                                mVarE = null;
                                            }
                                            eVar2.b(mVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            mVarE = i2.k.e(eVar2);
                        }
                    } else {
                        mVarE = mVarE.f25559f;
                    }
                }
            }
        }
        zj.m.d0(sVarArr, n1.t.f29554a, 0, i4);
        int i13 = i4 - 1;
        if (i13 < sVarArr.length) {
            while (i13 >= 0) {
                n1.s sVar3 = sVarArr[i13];
                if (z3.o(sVar3) && b(sVar3, fVar)) {
                    return true;
                }
                i13--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean r(n1.s sVar, g3.f fVar) {
        n1.s[] sVarArr = new n1.s[16];
        if (!sVar.f25554a.f25565n) {
            f2.a.b("visitChildren called on an unattached node");
        }
        w0.e eVar = new w0.e(new i1.m[16]);
        i1.m mVar = sVar.f25554a;
        i1.m mVar2 = mVar.f25559f;
        if (mVar2 == null) {
            i2.k.b(eVar, mVar);
        } else {
            eVar.b(mVar2);
        }
        int i4 = 0;
        while (true) {
            int i10 = eVar.f36399c;
            if (i10 == 0) {
                break;
            }
            i1.m mVarE = (i1.m) eVar.l(i10 - 1);
            if ((mVarE.f25557d & Segment.SHARE_MINIMUM) == 0) {
                i2.k.b(eVar, mVarE);
            } else {
                while (true) {
                    if (mVarE == null) {
                        break;
                    }
                    if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0) {
                        w0.e eVar2 = null;
                        while (mVarE != null) {
                            if (mVarE instanceof n1.s) {
                                n1.s sVar2 = (n1.s) mVarE;
                                int i11 = i4 + 1;
                                if (sVarArr.length < i11) {
                                    int length = sVarArr.length;
                                    ?? r10 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(sVarArr, 0, r10, 0, length);
                                    sVarArr = r10;
                                }
                                sVarArr[i4] = sVar2;
                                i4 = i11;
                            } else if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE instanceof i2.j)) {
                                int i12 = 0;
                                for (i1.m mVar3 = ((i2.j) mVarE).f25691p; mVar3 != null; mVar3 = mVar3.f25559f) {
                                    if ((mVar3.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            mVarE = mVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new w0.e(new i1.m[16]);
                                            }
                                            if (mVarE != null) {
                                                eVar2.b(mVarE);
                                                mVarE = null;
                                            }
                                            eVar2.b(mVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            mVarE = i2.k.e(eVar2);
                        }
                    } else {
                        mVarE = mVarE.f25559f;
                    }
                }
            }
        }
        zj.m.d0(sVarArr, n1.t.f29554a, 0, i4);
        for (int i13 = 0; i13 < i4; i13++) {
            n1.s sVar3 = sVarArr[i13];
            if (z3.o(sVar3) && f(sVar3, fVar)) {
                return true;
            }
        }
        return false;
    }

    public static final void s(x.e eVar, mk.c cVar) {
        nk.k.e(eVar, "map");
        x.e eVar2 = new x.e(999);
        int i4 = eVar.f36920c;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i4) {
            eVar2.put(eVar.f(i10), eVar.j(i10));
            i10++;
            i11++;
            if (i11 == 999) {
                cVar.invoke(eVar2);
                eVar2.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            cVar.invoke(eVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x019b A[EDGE_INSN: B:157:0x019b->B:127:0x019b BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean t(n1.s r12, n1.s r13, int r14, g3.f r15) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d5.t(n1.s, n1.s, int, g3.f):boolean");
    }

    public static final void u(View view, a6.f fVar) {
        nk.k.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static final pi.b y(com.google.android.gms.internal.ads.c2 c2Var, pi.a aVar, String str) {
        nk.k.e(c2Var, "<this>");
        nk.k.e(aVar, "adItem");
        pi.b bVar = new pi.b();
        bVar.f32010a = c2Var.f9923a / 1000000.0d;
        bVar.f32011b = AppLovinMediationProvider.ADMOB;
        bVar.f32013d = aVar.f32003a;
        bVar.f32014e = "USD";
        bVar.f32012c = str;
        return bVar;
    }

    public static final void z(p2.p pVar, int i4, o2.h hVar) {
        p2.p pVar2;
        w0.e eVar = new w0.e(new p2.p[16]);
        List listI = pVar.i(false, false);
        while (true) {
            eVar.c(eVar.f36399c, listI);
            while (true) {
                int i10 = eVar.f36399c;
                if (i10 == 0) {
                    return;
                }
                pVar2 = (p2.p) eVar.l(i10 - 1);
                boolean zE = p2.s.e(pVar2);
                p2.l lVar = pVar2.f31104d;
                x.e0 e0Var = lVar.f31095a;
                if (!zE && !e0Var.c(p2.t.f31121i)) {
                    i2.d1 d1VarD = pVar2.d();
                    if (d1VarD == null) {
                        throw d.h.o("Expected semantics node to have a coordinator.");
                    }
                    d3.j jVarX = jm.a.x(g2.n0.d(d1VarD, true));
                    if (jVarX.f21961a < jVarX.f21963c && jVarX.f21962b < jVarX.f21964d) {
                        Object objG = lVar.f31095a.g(p2.k.f31075e);
                        if (objG == null) {
                            objG = null;
                        }
                        mk.e eVar2 = (mk.e) objG;
                        Object objG2 = e0Var.g(p2.t.f31133v);
                        p2.i iVar = (p2.i) (objG2 != null ? objG2 : null);
                        if (eVar2 == null || iVar == null || ((Number) iVar.f31052b.invoke()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i11 = 1 + i4;
                        hVar.invoke(new o2.i(pVar2, i11, jVarX, d1VarD));
                        z(pVar2, i11, hVar);
                    }
                }
            }
            listI = pVar2.i(false, false);
        }
    }

    public abstract void n();

    public abstract boolean o();

    public abstract void w(boolean z3);

    public abstract void x(int i4);

    public void v(boolean z3) {
    }
}
