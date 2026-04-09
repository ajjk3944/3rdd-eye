package a;

import a4.d;
import a8.g;
import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.KeyEvent;
import ca.b;
import com.applovin.shadow.okio.Segment;
import com.bumptech.glide.h;
import com.bumptech.glide.k;
import com.google.android.gms.internal.ads.sh0;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.play_billing.g1;
import com.liuzh.deviceinfo.DeviceInfoApp;
import d8.d0;
import d8.w;
import ec.x;
import ec.y;
import g8.c0;
import g8.e;
import g8.f0;
import g8.l;
import g8.o;
import g8.s;
import j$.util.Objects;
import j4.f;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import je.u;
import o7.c;
import p6.i;
import t7.m;
import x7.j;
import yj.n;
import yj.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f1a;

    /* renamed from: b, reason: collision with root package name */
    public static Context f2b;

    /* renamed from: c, reason: collision with root package name */
    public static d f3c;

    public static int a(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, r3.f.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static void c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(File file, Resources resources, int i4) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i4);
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
        try {
            boolean zE = e(file, inputStreamOpenRawResource);
            c(inputStreamOpenRawResource);
            return zE;
        } catch (Throwable th3) {
            th = th3;
            c(inputStreamOpenRawResource);
            throw th;
        }
    }

    public static boolean e(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                    while (true) {
                        int i4 = inputStream.read(bArr);
                        if (i4 == -1) {
                            c(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i4);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e10) {
            e = e10;
        }
    }

    public static de.a f(String str, String str2) {
        jf.a aVar = new jf.a(str, str2);
        sh0 sh0VarB = de.a.b(jf.a.class);
        sh0VarB.f16014c = 1;
        sh0VarB.f16017f = new b(6, aVar);
        return sh0VarB.c();
    }

    public static k g(com.bumptech.glide.b bVar, List list, nh.a aVar) {
        j aVar2;
        j fVar;
        a8.b bVar2;
        int i4;
        ContentResolver contentResolver;
        Class cls;
        a8.b bVar3 = bVar.f6470a;
        g gVar = bVar.f6473d;
        h hVar = bVar.f6472c;
        Context applicationContext = hVar.getApplicationContext();
        c cVar = hVar.f6496h;
        k kVar = new k();
        l lVar = new l();
        o8.b bVar4 = kVar.g;
        synchronized (bVar4) {
            bVar4.f30424a.add(lVar);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            kVar.l(new s());
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListF = kVar.f();
        k8.a aVar3 = new k8.a(applicationContext, arrayListF, bVar3, gVar);
        j f0Var = new f0(bVar3, new x(27));
        o oVar = new o(kVar.f(), resources.getDisplayMetrics(), bVar3, gVar);
        if (i10 < 28 || !((Map) cVar.f30419b).containsKey(com.bumptech.glide.c.class)) {
            j eVar = new e(0, oVar);
            aVar2 = new g8.a(2, oVar, gVar);
            fVar = eVar;
        } else {
            j fVar2 = new g8.f(1);
            fVar = new g8.f(0);
            aVar2 = fVar2;
        }
        if (i10 >= 28) {
            i4 = i10;
            bVar2 = bVar3;
            kVar.d("Animation", InputStream.class, Drawable.class, new i8.b(new i8.c(arrayListF, gVar), 1));
            kVar.d("Animation", ByteBuffer.class, Drawable.class, new i8.b(new i8.c(arrayListF, gVar), 0));
        } else {
            bVar2 = bVar3;
            i4 = i10;
        }
        j eVar2 = new i8.e(applicationContext);
        x7.k bVar5 = new g8.b(gVar);
        l8.a mVar = new m((byte) 0, 14);
        l8.a dVar = new l8.d(1);
        ContentResolver contentResolver2 = applicationContext.getContentResolver();
        kVar.b(ByteBuffer.class, new d0(5));
        kVar.b(InputStream.class, new c(12, gVar));
        kVar.d("Bitmap", ByteBuffer.class, Bitmap.class, fVar);
        kVar.d("Bitmap", InputStream.class, Bitmap.class, aVar2);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            contentResolver = contentResolver2;
            cls = ParcelFileDescriptor.class;
        } else {
            contentResolver = contentResolver2;
            cls = ParcelFileDescriptor.class;
            kVar.d("Bitmap", cls, Bitmap.class, new e(1, oVar));
        }
        a8.b bVar6 = bVar2;
        kVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new f0(bVar6, new x(26)));
        kVar.d("Bitmap", cls, Bitmap.class, f0Var);
        w wVar = d0.f22003b;
        kVar.a(Bitmap.class, Bitmap.class, wVar);
        kVar.d("Bitmap", Bitmap.class, Bitmap.class, new c0(0));
        kVar.c(Bitmap.class, bVar5);
        kVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new g8.a(resources, fVar));
        kVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new g8.a(resources, aVar2));
        kVar.d("BitmapDrawable", cls, BitmapDrawable.class, new g8.a(resources, f0Var));
        kVar.c(BitmapDrawable.class, new y4.a(bVar6, bVar5));
        kVar.d("Animation", InputStream.class, k8.b.class, new k8.h(arrayListF, aVar3, gVar));
        kVar.d("Animation", ByteBuffer.class, k8.b.class, aVar3);
        kVar.c(k8.b.class, new ja.c());
        kVar.a(w7.d.class, w7.d.class, wVar);
        kVar.d("Bitmap", w7.d.class, Bitmap.class, new e(2, bVar6));
        kVar.d("legacy_append", Uri.class, Drawable.class, eVar2);
        kVar.d("legacy_append", Uri.class, Bitmap.class, new g8.a(1, eVar2, bVar6));
        kVar.j(new com.bumptech.glide.load.data.g(2));
        kVar.a(File.class, ByteBuffer.class, new d0(6));
        kVar.a(File.class, InputStream.class, new d8.k(3, new d0(9)));
        kVar.d("legacy_append", File.class, File.class, new c0(2));
        kVar.a(File.class, cls, new d8.k(3, new d0(8)));
        kVar.a(File.class, File.class, wVar);
        kVar.j(new com.bumptech.glide.load.data.l(gVar));
        if (!"robolectric".equals(str)) {
            kVar.j(new com.bumptech.glide.load.data.g(1));
        }
        w hVar2 = new d8.h(applicationContext, 0, false);
        w fVar3 = new d8.f(applicationContext);
        w gVar2 = new d8.g(applicationContext, 0);
        Class cls2 = Integer.TYPE;
        kVar.a(cls2, InputStream.class, hVar2);
        kVar.a(Integer.class, InputStream.class, hVar2);
        kVar.a(cls2, AssetFileDescriptor.class, fVar3);
        kVar.a(Integer.class, AssetFileDescriptor.class, fVar3);
        kVar.a(cls2, Drawable.class, gVar2);
        kVar.a(Integer.class, Drawable.class, gVar2);
        kVar.a(Uri.class, InputStream.class, new d8.h(applicationContext, 1, false));
        kVar.a(Uri.class, AssetFileDescriptor.class, new d8.g(applicationContext, 1));
        w dVar2 = new o7.d(11, resources);
        w cVar2 = new jf.c(9, resources);
        w cVar3 = new c(11, resources);
        kVar.a(Integer.class, Uri.class, dVar2);
        kVar.a(cls2, Uri.class, dVar2);
        kVar.a(Integer.class, AssetFileDescriptor.class, cVar2);
        kVar.a(cls2, AssetFileDescriptor.class, cVar2);
        kVar.a(Integer.class, InputStream.class, cVar3);
        kVar.a(cls2, InputStream.class, cVar3);
        kVar.a(String.class, InputStream.class, new c(10));
        kVar.a(Uri.class, InputStream.class, new c(10));
        kVar.a(String.class, InputStream.class, new d0(13));
        kVar.a(String.class, cls, new d0(12));
        kVar.a(String.class, AssetFileDescriptor.class, new d0(11));
        kVar.a(Uri.class, InputStream.class, new jf.c(8, applicationContext.getAssets()));
        kVar.a(Uri.class, AssetFileDescriptor.class, new i(applicationContext.getAssets()));
        int i11 = 2;
        kVar.a(Uri.class, InputStream.class, new d8.g(applicationContext, i11));
        kVar.a(Uri.class, InputStream.class, new d8.h(applicationContext, i11, false));
        if (i4 >= 29) {
            kVar.a(Uri.class, InputStream.class, new e8.b(applicationContext, InputStream.class));
            kVar.a(Uri.class, cls, new e8.b(applicationContext, cls));
        }
        boolean zContainsKey = ((Map) cVar.f30419b).containsKey(com.bumptech.glide.f.class);
        ContentResolver contentResolver3 = contentResolver;
        kVar.a(Uri.class, InputStream.class, new d8.f0(contentResolver3, zContainsKey, 2));
        kVar.a(Uri.class, cls, new d8.f0(contentResolver3, zContainsKey, 1));
        kVar.a(Uri.class, AssetFileDescriptor.class, new d8.f0(contentResolver3, zContainsKey, 0));
        kVar.a(Uri.class, InputStream.class, new d0(14));
        kVar.a(URL.class, InputStream.class, new bf.f(12));
        kVar.a(Uri.class, File.class, new b8.e(applicationContext));
        kVar.a(d8.l.class, InputStream.class, new o7.d(13));
        kVar.a(byte[].class, ByteBuffer.class, new d0(2));
        kVar.a(byte[].class, InputStream.class, new d0(4));
        kVar.a(Uri.class, Uri.class, wVar);
        kVar.a(Drawable.class, Drawable.class, wVar);
        kVar.d("legacy_append", Drawable.class, Drawable.class, new c0(1));
        kVar.k(Bitmap.class, BitmapDrawable.class, new i(resources));
        kVar.k(Bitmap.class, byte[].class, mVar);
        kVar.k(Drawable.class, byte[].class, new i0.f(bVar6, mVar, dVar, 10));
        kVar.k(k8.b.class, byte[].class, dVar);
        j f0Var2 = new f0(bVar6, new y(26));
        kVar.d("legacy_append", ByteBuffer.class, Bitmap.class, f0Var2);
        kVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new g8.a(resources, f0Var2));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw u.o(it);
        }
        if (aVar != null) {
            aVar.u(applicationContext, bVar, kVar);
        }
        return kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ck.c h(ck.c cVar, ck.c cVar2, mk.e eVar) {
        nk.k.e(eVar, "<this>");
        if (eVar instanceof ek.a) {
            return ((ek.a) eVar).create(cVar, cVar2);
        }
        ck.h context = cVar2.getContext();
        return context == ck.i.f2898a ? new dk.b(cVar2, cVar, eVar) : new dk.c(cVar2, context, eVar, cVar);
    }

    public static final long k(long j, boolean z3, int i4, float f10) {
        int iH = ((z3 || i4 == 2 || i4 == 4 || i4 == 5) && d3.a.d(j)) ? d3.a.h(j) : Integer.MAX_VALUE;
        if (d3.a.j(j) != iH) {
            iH = ci.b.e(com.bumptech.glide.d.f(f10), d3.a.j(j), iH);
        }
        return z3.g(0, iH, 0, d3.a.g(j));
    }

    public static de.a l(String str, pf.u uVar) {
        sh0 sh0VarB = de.a.b(jf.a.class);
        sh0VarB.f16014c = 1;
        sh0VarB.a(de.i.b(Context.class));
        sh0VarB.f16017f = new com.applovin.impl.sdk.ad.f(7, str, uVar);
        return sh0VarB.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static zi.a m(android.content.Context r16, zi.c r17, android.database.Cursor r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.m(android.content.Context, zi.c, android.database.Cursor):zi.a");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static final java.lang.String n(int r3) {
        /*
            com.liuzh.deviceinfo.DeviceInfoApp r0 = com.liuzh.deviceinfo.DeviceInfoApp.f21145f
            android.content.res.Resources r0 = r0.getResources()
            r1 = 16
            java.lang.String r2 = "getString(...)"
            if (r3 == r1) goto L74
            r1 = 35
            if (r3 == r1) goto L66
            r1 = 2131886857(0x7f120309, float:1.9408305E38)
            switch(r3) {
                case 1: goto L66;
                case 2: goto L5b;
                case 3: goto L53;
                case 4: goto L74;
                case 5: goto L48;
                case 6: goto L3d;
                default: goto L16;
            }
        L16:
            switch(r3) {
                case 8: goto L32;
                case 9: goto L66;
                case 10: goto L66;
                default: goto L19;
            }
        L19:
            switch(r3) {
                case 12: goto L27;
                case 13: goto L1f;
                case 14: goto L5b;
                default: goto L1c;
            }
        L1c:
            java.lang.String r3 = ""
            return r3
        L1f:
            java.lang.String r3 = r0.getString(r1)
            nk.k.d(r3, r2)
            return r3
        L27:
            r3 = 2131887568(0x7f1205d0, float:1.9409747E38)
            java.lang.String r3 = r0.getString(r3)
            nk.k.d(r3, r2)
            return r3
        L32:
            r3 = 2131886783(0x7f1202bf, float:1.9408155E38)
            java.lang.String r3 = r0.getString(r3)
            nk.k.d(r3, r2)
            return r3
        L3d:
            r3 = 2131887186(0x7f120452, float:1.9408972E38)
            java.lang.String r3 = r0.getString(r3)
            nk.k.d(r3, r2)
            return r3
        L48:
            r3 = 2131887274(0x7f1204aa, float:1.940915E38)
            java.lang.String r3 = r0.getString(r3)
            nk.k.d(r3, r2)
            return r3
        L53:
            java.lang.String r3 = r0.getString(r1)
            nk.k.d(r3, r2)
            return r3
        L5b:
            r3 = 2131887476(0x7f120574, float:1.940956E38)
            java.lang.String r3 = r0.getString(r3)
            nk.k.d(r3, r2)
            return r3
        L66:
            r3 = 2131887409(0x7f120531, float:1.9409424E38)
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r0 = "²"
            java.lang.String r3 = d.h.s(r3, r0)
            return r3
        L74:
            r3 = 2131887642(0x7f12061a, float:1.9409897E38)
            java.lang.String r3 = r0.getString(r3)
            nk.k.d(r3, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.n(int):java.lang.String");
    }

    public static File o(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i4 = 0; i4 < 100; i4++) {
            File file = new File(cacheDir, str + i4);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final int p(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static void q() {
        if (f1a) {
            return;
        }
        f1a = true;
        j6.i iVar = new j6.i(6);
        DeviceInfoApp deviceInfoApp = fi.a.f24058a;
        nk.k.e(deviceInfoApp, "context");
        new Thread(new i.i(deviceInfoApp, 1)).start();
        ci.b.j = iVar;
        pi.h hVar = pi.h.f32018b;
        hVar.f32019a.add(new pi.c());
    }

    public static ck.c r(ck.c cVar) {
        ck.c<Object> cVarIntercepted;
        nk.k.e(cVar, "<this>");
        ek.c cVar2 = cVar instanceof ek.c ? (ek.c) cVar : null;
        return (cVar2 == null || (cVarIntercepted = cVar2.intercepted()) == null) ? cVar : cVarIntercepted;
    }

    public static final boolean s() {
        Context context = pk.a.f32022a;
        nk.k.b(context);
        return "CN".equalsIgnoreCase(j4.q(context).getCountry());
    }

    public static yj.f t(yj.g gVar, mk.a aVar) {
        yj.s sVar = yj.s.f37648a;
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return new n(aVar);
        }
        if (iOrdinal == 1) {
            yj.m mVar = new yj.m();
            mVar.f37643a = aVar;
            mVar.f37644b = sVar;
            return mVar;
        }
        if (iOrdinal != 2) {
            throw new ac.m();
        }
        v vVar = new v();
        vVar.f37650a = aVar;
        vVar.f37651b = sVar;
        return vVar;
    }

    public static n u(mk.a aVar) {
        nk.k.e(aVar, "initializer");
        return new n(aVar);
    }

    public static MappedByteBuffer v(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static Object w(mk.e eVar, Object obj, ck.c cVar) {
        nk.k.e(eVar, "<this>");
        ck.h context = cVar.getContext();
        Object dVar = context == ck.i.f2898a ? new dk.d(cVar) : new dk.e(cVar, context);
        nk.x.d(2, eVar);
        return eVar.invoke(obj, dVar);
    }

    public static String x(g1 g1Var) {
        StringBuilder sb2 = new StringBuilder(g1Var.d());
        for (int i4 = 0; i4 < g1Var.d(); i4++) {
            byte bA = g1Var.a(i4);
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

    public abstract List b(List list, String str);

    public abstract String i(int i4, int i10, byte[] bArr);

    public abstract int j(String str, byte[] bArr, int i4, int i10);
}
