package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.CircularRevealHelper;

/* loaded from: classes2.dex */
public interface c extends CircularRevealHelper.a {

    public static class b implements TypeEvaluator {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator f10277b = new b();

        /* renamed from: a, reason: collision with root package name */
        public final e f10278a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f10278a.b(a5.a.e(eVar.f10281a, eVar2.f10281a, f10), a5.a.e(eVar.f10282b, eVar2.f10282b, f10), a5.a.e(eVar.f10283c, eVar2.f10283c, f10));
            return this.f10278a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c, reason: collision with other inner class name */
    public static class C0207c extends Property {

        /* renamed from: a, reason: collision with root package name */
        public static final Property f10279a = new C0207c("circularReveal");

        public C0207c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    public static class d extends Property {

        /* renamed from: a, reason: collision with root package name */
        public static final Property f10280a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public float f10281a;

        /* renamed from: b, reason: collision with root package name */
        public float f10282b;

        /* renamed from: c, reason: collision with root package name */
        public float f10283c;

        public boolean a() {
            return this.f10283c == Float.MAX_VALUE;
        }

        public void b(float f10, float f11, float f12) {
            this.f10281a = f10;
            this.f10282b = f11;
            this.f10283c = f12;
        }

        public void c(e eVar) {
            b(eVar.f10281a, eVar.f10282b, eVar.f10283c);
        }

        public e() {
        }

        public e(float f10, float f11, float f12) {
            this.f10281a = f10;
            this.f10282b = f11;
            this.f10283c = f12;
        }

        public e(e eVar) {
            this(eVar.f10281a, eVar.f10282b, eVar.f10283c);
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
