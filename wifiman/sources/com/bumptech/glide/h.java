package com.bumptech.glide;

import I2.a;
import I2.b;
import I2.d;
import I2.e;
import I2.g;
import I2.l;
import I2.s;
import I2.u;
import I2.v;
import I2.w;
import I2.x;
import I2.y;
import J2.a;
import J2.b;
import J2.c;
import J2.d;
import J2.g;
import L2.a;
import M2.m;
import W2.f;
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
import com.bumptech.glide.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.A;
import com.bumptech.glide.load.resource.bitmap.C4271a;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.t;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.load.resource.bitmap.w;
import com.bumptech.glide.load.resource.bitmap.y;
import f.AbstractC5487d;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import v2.AbstractC8187a;

/* loaded from: classes.dex */
abstract class h {

    class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f34208a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f34209b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f34210c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ R2.a f34211d;

        a(b bVar, List list, R2.a aVar) {
            this.f34209b = bVar;
            this.f34210c = list;
            this.f34211d = aVar;
        }

        @Override // W2.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f34208a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            AbstractC8187a.a("Glide registry");
            this.f34208a = true;
            try {
                return h.a(this.f34209b, this.f34210c, this.f34211d);
            } finally {
                this.f34208a = false;
                AbstractC8187a.b();
            }
        }
    }

    static Registry a(b bVar, List list, R2.a aVar) {
        F2.d dVarF = bVar.f();
        F2.b bVarE = bVar.e();
        Context applicationContext = bVar.i().getApplicationContext();
        e eVarF = bVar.i().f();
        Registry registry = new Registry();
        b(applicationContext, registry, dVarF, bVarE, eVarF);
        c(applicationContext, bVar, registry, list, aVar);
        return registry;
    }

    private static void b(Context context, Registry registry, F2.d dVar, F2.b bVar, e eVar) {
        C2.i hVar;
        C2.i wVar;
        Class cls;
        Registry registry2;
        registry.o(new DefaultImageHeaderParser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry.o(new o());
        }
        Resources resources = context.getResources();
        List listG = registry.g();
        O2.a aVar = new O2.a(context, listG, dVar, bVar);
        C2.i iVarM = A.m(dVar);
        l lVar = new l(registry.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i10 < 28 || !eVar.a(c.b.class)) {
            hVar = new com.bumptech.glide.load.resource.bitmap.h(lVar);
            wVar = new w(lVar, bVar);
        } else {
            wVar = new r();
            hVar = new com.bumptech.glide.load.resource.bitmap.j();
        }
        if (i10 >= 28) {
            registry.e("Animation", InputStream.class, Drawable.class, M2.h.f(listG, bVar));
            registry.e("Animation", ByteBuffer.class, Drawable.class, M2.h.a(listG, bVar));
        }
        M2.l lVar2 = new M2.l(context);
        com.bumptech.glide.load.resource.bitmap.c cVar = new com.bumptech.glide.load.resource.bitmap.c(bVar);
        P2.a aVar2 = new P2.a();
        P2.d dVar2 = new P2.d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.a(ByteBuffer.class, new I2.c()).a(InputStream.class, new u(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, hVar).e("Bitmap", InputStream.class, Bitmap.class, wVar);
        if (ParcelFileDescriptorRewinder.c()) {
            registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new t(lVar));
        }
        registry.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, A.c(dVar));
        registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, iVarM).d(Bitmap.class, Bitmap.class, w.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new y()).b(Bitmap.class, cVar).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C4271a(resources, hVar)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C4271a(resources, wVar)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C4271a(resources, iVarM)).b(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.b(dVar, cVar)).e("Animation", InputStream.class, O2.c.class, new O2.j(listG, aVar, bVar)).e("Animation", ByteBuffer.class, O2.c.class, aVar).b(O2.c.class, new O2.d()).d(B2.a.class, B2.a.class, w.a.a()).e("Bitmap", B2.a.class, Bitmap.class, new O2.h(dVar)).c(Uri.class, Drawable.class, lVar2).c(Uri.class, Bitmap.class, new v(lVar2, dVar)).p(new a.C0443a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new g.e()).c(File.class, File.class, new N2.a()).d(File.class, ParcelFileDescriptor.class, new g.b()).d(File.class, File.class, w.a.a()).p(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            cls = BitmapDrawable.class;
            registry2 = registry;
            registry2.p(new ParcelFileDescriptorRewinder.a());
        } else {
            cls = BitmapDrawable.class;
            registry2 = registry;
        }
        I2.o oVarG = I2.f.g(context);
        I2.o oVarC = I2.f.c(context);
        I2.o oVarE = I2.f.e(context);
        Class cls2 = Integer.TYPE;
        registry2.d(cls2, InputStream.class, oVarG).d(Integer.class, InputStream.class, oVarG).d(cls2, AssetFileDescriptor.class, oVarC).d(Integer.class, AssetFileDescriptor.class, oVarC).d(cls2, Drawable.class, oVarE).d(Integer.class, Drawable.class, oVarE).d(Uri.class, InputStream.class, I2.t.f(context)).d(Uri.class, AssetFileDescriptor.class, I2.t.e(context));
        s.c cVar2 = new s.c(resources);
        s.a aVar3 = new s.a(resources);
        s.b bVar2 = new s.b(resources);
        Class cls3 = cls;
        registry2.d(Integer.class, Uri.class, cVar2).d(cls2, Uri.class, cVar2).d(Integer.class, AssetFileDescriptor.class, aVar3).d(cls2, AssetFileDescriptor.class, aVar3).d(Integer.class, InputStream.class, bVar2).d(cls2, InputStream.class, bVar2);
        registry2.d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new v.c()).d(String.class, ParcelFileDescriptor.class, new v.b()).d(String.class, AssetFileDescriptor.class, new v.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new b.a(context)).d(Uri.class, InputStream.class, new c.a(context));
        if (i10 >= 29) {
            registry2.d(Uri.class, InputStream.class, new d.c(context));
            registry2.d(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        registry2.d(Uri.class, InputStream.class, new x.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new x.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new x.a(contentResolver)).d(Uri.class, InputStream.class, new y.a()).d(URL.class, InputStream.class, new g.a()).d(Uri.class, File.class, new l.a(context)).d(I2.h.class, InputStream.class, new a.C0387a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, w.a.a()).d(Drawable.class, Drawable.class, w.a.a()).c(Drawable.class, Drawable.class, new m()).q(Bitmap.class, cls3, new P2.b(resources)).q(Bitmap.class, byte[].class, aVar2).q(Drawable.class, byte[].class, new P2.c(dVar, aVar2, dVar2)).q(O2.c.class, byte[].class, dVar2);
        C2.i iVarD = A.d(dVar);
        registry2.c(ByteBuffer.class, Bitmap.class, iVarD);
        registry2.c(ByteBuffer.class, cls3, new C4271a(resources, iVarD));
    }

    private static void c(Context context, b bVar, Registry registry, List list, R2.a aVar) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC5487d.a(it.next());
            throw null;
        }
        if (aVar != null) {
            aVar.a(context, bVar, registry);
        }
    }

    static f.b d(b bVar, List list, R2.a aVar) {
        return new a(bVar, list, aVar);
    }
}
