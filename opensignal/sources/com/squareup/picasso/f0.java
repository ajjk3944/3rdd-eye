package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f0 {
    public static final yh.a j = new yh.a(Looper.getMainLooper(), 2, false);
    public static volatile f0 k = null;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f5888a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5889b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5890c;

    /* renamed from: d, reason: collision with root package name */
    public final n f5891d;

    /* renamed from: e, reason: collision with root package name */
    public final s f5892e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f5893f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakHashMap f5894g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f5895h;

    /* renamed from: i, reason: collision with root package name */
    public final ReferenceQueue f5896i;

    public f0(Context context, n nVar, s sVar, e0 e0Var, n0 n0Var) {
        this.f5890c = context;
        this.f5891d = nVar;
        this.f5892e = sVar;
        this.f5888a = e0Var;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new i(context, 1));
        arrayList.add(new h(context));
        int i10 = 0;
        arrayList.add(new v(context, i10));
        arrayList.add(new i(context, i10));
        arrayList.add(new i(context));
        arrayList.add(new v(context, 1));
        arrayList.add(new z(nVar.f5934c, n0Var));
        this.f5889b = Collections.unmodifiableList(arrayList);
        this.f5893f = n0Var;
        this.f5894g = new WeakHashMap();
        this.f5895h = new WeakHashMap();
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f5896i = referenceQueue;
        new b0(referenceQueue, j).start();
    }

    public static f0 f(Context context) {
        if (k == null) {
            synchronized (f0.class) {
                try {
                    if (k == null) {
                        k = new cj.a(context).p();
                    }
                } finally {
                }
            }
        }
        return k;
    }

    public final void a(Object obj) {
        t0.b();
        b bVar = (b) this.f5894g.remove(obj);
        if (bVar != null) {
            bVar.a();
            l lVar = this.f5891d.f5939h;
            lVar.sendMessage(lVar.obtainMessage(2, bVar));
        }
        if (obj instanceof ImageView) {
            j jVar = (j) this.f5895h.remove((ImageView) obj);
            if (jVar != null) {
                jVar.f5909g = null;
                ImageView imageView = (ImageView) jVar.f5908d.get();
                if (imageView == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(jVar);
                }
            }
        }
    }

    public final void b(Bitmap bitmap, c0 c0Var, b bVar) {
        if (bVar.f5876h) {
            return;
        }
        if (!bVar.f5875g) {
            this.f5894g.remove(bVar.d());
        }
        if (bitmap == null) {
            bVar.c();
        } else {
            if (c0Var == null) {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
            bVar.b(bitmap, c0Var);
        }
    }

    public final void c(b bVar) {
        Object objD = bVar.d();
        if (objD != null) {
            WeakHashMap weakHashMap = this.f5894g;
            if (weakHashMap.get(objD) != bVar) {
                a(objD);
                weakHashMap.put(objD, bVar);
            }
        }
        l lVar = this.f5891d.f5939h;
        lVar.sendMessage(lVar.obtainMessage(1, bVar));
    }

    public final l0 d(String str) {
        if (str == null) {
            return new l0(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return new l0(this, Uri.parse(str), 0);
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public final Bitmap e(String str) {
        Bitmap bitmapG = this.f5892e.g(str);
        n0 n0Var = this.f5893f;
        if (bitmapG != null) {
            n0Var.f5944b.sendEmptyMessage(0);
            return bitmapG;
        }
        n0Var.f5944b.sendEmptyMessage(1);
        return bitmapG;
    }
}
