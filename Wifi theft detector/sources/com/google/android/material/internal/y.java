package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: c, reason: collision with root package name */
    public float f10769c;

    /* renamed from: d, reason: collision with root package name */
    public float f10770d;

    /* renamed from: g, reason: collision with root package name */
    public d5.e f10773g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f10767a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final d5.g f10768b = new a();

    /* renamed from: e, reason: collision with root package name */
    public boolean f10771e = true;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f10772f = new WeakReference(null);

    public class a extends d5.g {
        public a() {
        }

        @Override // d5.g
        public void a(int i10) {
            y.this.f10771e = true;
            b bVar = (b) y.this.f10772f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // d5.g
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            y.this.f10771e = true;
            b bVar = (b) y.this.f10772f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public y(b bVar) {
        j(bVar);
    }

    public final float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f10767a.getFontMetrics().ascent);
    }

    public final float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f10767a.measureText(charSequence, 0, charSequence.length());
    }

    public d5.e e() {
        return this.f10773g;
    }

    public float f(String str) {
        if (!this.f10771e) {
            return this.f10770d;
        }
        i(str);
        return this.f10770d;
    }

    public TextPaint g() {
        return this.f10767a;
    }

    public float h(String str) {
        if (!this.f10771e) {
            return this.f10769c;
        }
        i(str);
        return this.f10769c;
    }

    public final void i(String str) {
        this.f10769c = d(str);
        this.f10770d = c(str);
        this.f10771e = false;
    }

    public void j(b bVar) {
        this.f10772f = new WeakReference(bVar);
    }

    public void k(d5.e eVar, Context context) {
        if (this.f10773g != eVar) {
            this.f10773g = eVar;
            if (eVar != null) {
                eVar.q(context, this.f10767a, this.f10768b);
                b bVar = (b) this.f10772f.get();
                if (bVar != null) {
                    this.f10767a.drawableState = bVar.getState();
                }
                eVar.p(context, this.f10767a, this.f10768b);
                this.f10771e = true;
            }
            b bVar2 = (b) this.f10772f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z10) {
        this.f10771e = z10;
    }

    public void m(boolean z10) {
        this.f10771e = z10;
    }

    public void n(Context context) {
        this.f10773g.p(context, this.f10767a, this.f10768b);
    }
}
