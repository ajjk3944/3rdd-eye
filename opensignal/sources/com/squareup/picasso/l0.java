package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f5926f = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final f0 f5927a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f5928b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5929c;

    /* renamed from: d, reason: collision with root package name */
    public int f5930d;

    /* renamed from: e, reason: collision with root package name */
    public int f5931e;

    public l0(f0 f0Var, Uri uri, int i10) {
        this.f5927a = f0Var;
        j0 j0Var = new j0();
        j0Var.f5913d = uri;
        j0Var.f5910a = i10;
        this.f5928b = j0Var;
    }

    public final k0 a(long j) {
        f5926f.getAndIncrement();
        j0 j0Var = this.f5928b;
        if (((d0) j0Var.f5914e) == null) {
            j0Var.f5914e = d0.NORMAL;
        }
        k0 k0Var = new k0((Uri) j0Var.f5913d, j0Var.f5910a, j0Var.f5911b, j0Var.f5912c, (d0) j0Var.f5914e);
        this.f5927a.f5888a.getClass();
        return k0Var;
    }

    public final Drawable b() {
        if (this.f5930d != 0) {
            return this.f5927a.f5890c.getResources().getDrawable(this.f5930d);
        }
        return null;
    }

    public final void c(ImageView imageView, g gVar) {
        Bitmap bitmapE;
        long jNanoTime = System.nanoTime();
        t0.b();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        j0 j0Var = this.f5928b;
        Uri uri = (Uri) j0Var.f5913d;
        f0 f0Var = this.f5927a;
        if (uri == null && j0Var.f5910a == 0) {
            f0Var.a(imageView);
            g0.a(imageView, b());
            return;
        }
        if (this.f5929c) {
            if (j0Var.f5911b != 0 || j0Var.f5912c != 0) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                g0.a(imageView, b());
                f0Var.f5895h.put(imageView, new j(this, imageView, gVar));
                return;
            }
            j0Var.b(width, height);
        }
        k0 k0VarA = a(jNanoTime);
        String strC = t0.c(k0VarA);
        if (!w.shouldReadFromMemoryCache(0) || (bitmapE = f0Var.e(strC)) == null) {
            g0.a(imageView, b());
            r rVar = new r(f0Var, imageView, k0VarA, this.f5931e, strC);
            rVar.f5975i = gVar;
            f0Var.c(rVar);
            return;
        }
        f0Var.a(imageView);
        Context context = f0Var.f5890c;
        c0 c0Var = c0.MEMORY;
        int i10 = g0.f5897e;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new g0(context, bitmapE, drawable, c0Var));
    }

    public final void d(uk.a aVar) {
        Bitmap bitmapE;
        long jNanoTime = System.nanoTime();
        t0.b();
        if (this.f5929c) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        j0 j0Var = this.f5928b;
        Uri uri = (Uri) j0Var.f5913d;
        f0 f0Var = this.f5927a;
        if (uri == null && j0Var.f5910a == 0) {
            f0Var.a(aVar);
            b();
            return;
        }
        k0 k0VarA = a(jNanoTime);
        String strC = t0.c(k0VarA);
        if (!w.shouldReadFromMemoryCache(0) || (bitmapE = f0Var.e(strC)) == null) {
            b();
            f0Var.c(new p0(f0Var, aVar, k0VarA, this.f5931e, strC));
        } else {
            f0Var.a(aVar);
            c0 c0Var = c0.MEMORY;
            aVar.a(bitmapE);
        }
    }

    public final void e(x xVar, x... xVarArr) {
        if (xVar == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        this.f5931e = xVar.index | this.f5931e;
        if (xVarArr.length > 0) {
            for (x xVar2 : xVarArr) {
                if (xVar2 == null) {
                    throw new IllegalArgumentException("Network policy cannot be null.");
                }
                this.f5931e = xVar2.index | this.f5931e;
            }
        }
    }
}
