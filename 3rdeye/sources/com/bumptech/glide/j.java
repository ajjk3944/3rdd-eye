package com.bumptech.glide;

import A9.I;
import E.u;
import R2.A;
import R2.C1563a;
import R2.b;
import R2.c;
import R2.d;
import R2.e;
import R2.f;
import R2.m;
import R2.v;
import R2.w;
import R2.x;
import R2.y;
import R2.z;
import S2.a;
import S2.b;
import S2.c;
import S2.d;
import S2.e;
import U2.A;
import U2.C;
import U2.C1600a;
import U2.C1601b;
import U2.C1602c;
import U2.p;
import U2.t;
import U2.v;
import U2.x;
import U2.y;
import V2.a;
import W2.a;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.camera.core.impl.C0;
import b3.InterfaceC1847b;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import t4.C5606d;

/* compiled from: RegistryFactory.java */
/* loaded from: classes.dex */
public final class j {
    public static i a(b bVar, ArrayList arrayList) {
        L2.j gVar;
        L2.j yVar;
        int i;
        String str;
        O2.b bVar2 = bVar.f22237b;
        e eVar = bVar.f22239d;
        Context applicationContext = eVar.getApplicationContext();
        f fVar = eVar.f22252h;
        i iVar = new i();
        U2.k kVar = new U2.k();
        C0 c02 = iVar.f22262g;
        synchronized (c02) {
            c02.f14871a.add(kVar);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            iVar.i(new p());
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListF = iVar.f();
        O2.g gVar2 = bVar.f22240e;
        Y2.a aVar = new Y2.a(applicationContext, arrayListF, bVar2, gVar2);
        C c10 = new C(bVar2, new C.g());
        U2.m mVar = new U2.m(iVar.f(), resources.getDisplayMetrics(), bVar2, gVar2);
        if (i10 < 28 || !fVar.f22254a.containsKey(c.class)) {
            gVar = new U2.g(mVar);
            yVar = new y(mVar, gVar2);
        } else {
            yVar = new t();
            gVar = new U2.h();
        }
        if (i10 >= 28) {
            i = i10;
            iVar.d("Animation", InputStream.class, Drawable.class, new a.c(new W2.a(arrayListF, gVar2)));
            iVar.d("Animation", ByteBuffer.class, Drawable.class, new a.b(new W2.a(arrayListF, gVar2)));
        } else {
            i = i10;
        }
        W2.e eVar2 = new W2.e(applicationContext);
        C1602c c1602c = new C1602c(gVar2);
        Z2.a aVar2 = new Z2.a();
        C5606d c5606d = new C5606d(21);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        iVar.a(ByteBuffer.class, new I());
        iVar.a(InputStream.class, new H7.e(gVar2));
        iVar.d("Bitmap", ByteBuffer.class, Bitmap.class, gVar);
        iVar.d("Bitmap", InputStream.class, Bitmap.class, yVar);
        String str2 = Build.FINGERPRINT;
        if ("robolectric".equals(str2)) {
            str = str2;
        } else {
            str = str2;
            iVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new v(mVar));
        }
        iVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C(bVar2, new C.c()));
        iVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c10);
        y.a<?> aVar3 = y.a.f11722a;
        iVar.c(Bitmap.class, Bitmap.class, aVar3);
        iVar.d("Bitmap", Bitmap.class, Bitmap.class, new A());
        iVar.b(Bitmap.class, c1602c);
        iVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1600a(resources, gVar));
        iVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1600a(resources, yVar));
        iVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1600a(resources, c10));
        iVar.b(BitmapDrawable.class, new C1601b(bVar2, c1602c));
        iVar.d("Animation", InputStream.class, Y2.c.class, new Y2.i(arrayListF, aVar, gVar2));
        iVar.d("Animation", ByteBuffer.class, Y2.c.class, aVar);
        iVar.b(Y2.c.class, new u(14));
        iVar.c(K2.a.class, K2.a.class, aVar3);
        iVar.d("Bitmap", K2.a.class, Bitmap.class, new Y2.g(bVar2));
        iVar.d("legacy_append", Uri.class, Drawable.class, eVar2);
        iVar.d("legacy_append", Uri.class, Bitmap.class, new x(eVar2, bVar2));
        iVar.j(new a.C0182a());
        iVar.c(File.class, ByteBuffer.class, new c.b());
        iVar.c(File.class, InputStream.class, new f.e(new R2.h()));
        iVar.d("legacy_append", File.class, File.class, new X2.a());
        iVar.c(File.class, ParcelFileDescriptor.class, new f.b(new R2.g()));
        iVar.c(File.class, File.class, aVar3);
        iVar.j(new k.a(gVar2));
        if (!"robolectric".equals(str)) {
            iVar.j(new ParcelFileDescriptorRewinder.a());
        }
        e.c cVar = new e.c(applicationContext);
        e.a aVar4 = new e.a(applicationContext);
        e.b bVar3 = new e.b(applicationContext);
        Class cls = Integer.TYPE;
        iVar.c(cls, InputStream.class, cVar);
        iVar.c(Integer.class, InputStream.class, cVar);
        iVar.c(cls, AssetFileDescriptor.class, aVar4);
        iVar.c(Integer.class, AssetFileDescriptor.class, aVar4);
        iVar.c(cls, Drawable.class, bVar3);
        iVar.c(Integer.class, Drawable.class, bVar3);
        iVar.c(Uri.class, InputStream.class, new w.b(applicationContext));
        iVar.c(Uri.class, AssetFileDescriptor.class, new w.a(applicationContext));
        v.c cVar2 = new v.c(resources);
        v.a aVar5 = new v.a(resources);
        v.b bVar4 = new v.b(resources);
        iVar.c(Integer.class, Uri.class, cVar2);
        iVar.c(cls, Uri.class, cVar2);
        iVar.c(Integer.class, AssetFileDescriptor.class, aVar5);
        iVar.c(cls, AssetFileDescriptor.class, aVar5);
        iVar.c(Integer.class, InputStream.class, bVar4);
        iVar.c(cls, InputStream.class, bVar4);
        iVar.c(String.class, InputStream.class, new d.b());
        iVar.c(Uri.class, InputStream.class, new d.b());
        iVar.c(String.class, InputStream.class, new x.c());
        iVar.c(String.class, ParcelFileDescriptor.class, new x.b());
        iVar.c(String.class, AssetFileDescriptor.class, new x.a());
        iVar.c(Uri.class, InputStream.class, new C1563a.c(applicationContext.getAssets()));
        iVar.c(Uri.class, AssetFileDescriptor.class, new C1563a.b(applicationContext.getAssets()));
        iVar.c(Uri.class, InputStream.class, new b.a(applicationContext));
        iVar.c(Uri.class, InputStream.class, new c.a(applicationContext));
        if (i >= 29) {
            iVar.c(Uri.class, InputStream.class, new d.c(applicationContext, InputStream.class));
            iVar.c(Uri.class, ParcelFileDescriptor.class, new d.b(applicationContext, ParcelFileDescriptor.class));
        }
        iVar.c(Uri.class, InputStream.class, new z.d(contentResolver));
        iVar.c(Uri.class, ParcelFileDescriptor.class, new z.b(contentResolver));
        iVar.c(Uri.class, AssetFileDescriptor.class, new z.a(contentResolver));
        iVar.c(Uri.class, InputStream.class, new A.a());
        iVar.c(URL.class, InputStream.class, new e.a());
        iVar.c(Uri.class, File.class, new m.a(applicationContext));
        iVar.c(R2.i.class, InputStream.class, new a.C0162a());
        iVar.c(byte[].class, ByteBuffer.class, new b.a());
        iVar.c(byte[].class, InputStream.class, new b.d());
        iVar.c(Uri.class, Uri.class, aVar3);
        iVar.c(Drawable.class, Drawable.class, aVar3);
        iVar.d("legacy_append", Drawable.class, Drawable.class, new W2.f());
        iVar.k(Bitmap.class, BitmapDrawable.class, new H7.e(resources));
        iVar.k(Bitmap.class, byte[].class, aVar2);
        iVar.k(Drawable.class, byte[].class, new N2.g(bVar2, aVar2, c5606d));
        iVar.k(Y2.c.class, byte[].class, c5606d);
        C c11 = new C(bVar2, new C.d());
        iVar.d("legacy_append", ByteBuffer.class, Bitmap.class, c11);
        iVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C1600a(resources, c11));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC1847b interfaceC1847b = (InterfaceC1847b) it.next();
            try {
                interfaceC1847b.a();
            } catch (AbstractMethodError e4) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(interfaceC1847b.getClass().getName()), e4);
            }
        }
        return iVar;
    }
}
