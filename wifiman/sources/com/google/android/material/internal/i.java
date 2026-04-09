package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    private float f37596c;

    /* renamed from: d, reason: collision with root package name */
    private float f37597d;

    /* renamed from: g, reason: collision with root package name */
    private c4.d f37600g;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f37594a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final c4.f f37595b = new a();

    /* renamed from: e, reason: collision with root package name */
    private boolean f37598e = true;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f37599f = new WeakReference(null);

    class a extends c4.f {
        a() {
        }

        @Override // c4.f
        public void a(int i10) {
            i.this.f37598e = true;
            b bVar = (b) i.this.f37599f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // c4.f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            i.this.f37598e = true;
            b bVar = (b) i.this.f37599f.get();
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

    public i(b bVar) {
        i(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f37594a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f37594a.measureText(charSequence, 0, charSequence.length());
    }

    private void h(String str) {
        this.f37596c = d(str);
        this.f37597d = c(str);
        this.f37598e = false;
    }

    public c4.d e() {
        return this.f37600g;
    }

    public TextPaint f() {
        return this.f37594a;
    }

    public float g(String str) {
        if (!this.f37598e) {
            return this.f37596c;
        }
        h(str);
        return this.f37596c;
    }

    public void i(b bVar) {
        this.f37599f = new WeakReference(bVar);
    }

    public void j(c4.d dVar, Context context) {
        if (this.f37600g != dVar) {
            this.f37600g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f37594a, this.f37595b);
                b bVar = (b) this.f37599f.get();
                if (bVar != null) {
                    this.f37594a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f37594a, this.f37595b);
                this.f37598e = true;
            }
            b bVar2 = (b) this.f37599f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z10) {
        this.f37598e = z10;
    }

    public void l(Context context) {
        this.f37600g.n(context, this.f37594a, this.f37595b);
    }
}
