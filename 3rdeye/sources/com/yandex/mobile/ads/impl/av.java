package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.em;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class av implements em {

    /* renamed from: s, reason: collision with root package name */
    public static final av f24818s;

    /* renamed from: t, reason: collision with root package name */
    public static final em.a<av> f24819t;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f24820b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f24821c;

    /* renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f24822d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f24823e;

    /* renamed from: f, reason: collision with root package name */
    public final float f24824f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24825g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24826h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final int f24827j;

    /* renamed from: k, reason: collision with root package name */
    public final float f24828k;

    /* renamed from: l, reason: collision with root package name */
    public final float f24829l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f24830m;

    /* renamed from: n, reason: collision with root package name */
    public final int f24831n;

    /* renamed from: o, reason: collision with root package name */
    public final int f24832o;

    /* renamed from: p, reason: collision with root package name */
    public final float f24833p;

    /* renamed from: q, reason: collision with root package name */
    public final int f24834q;

    /* renamed from: r, reason: collision with root package name */
    public final float f24835r;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f24836a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f24837b;

        /* renamed from: c, reason: collision with root package name */
        private Layout.Alignment f24838c;

        /* renamed from: d, reason: collision with root package name */
        private Layout.Alignment f24839d;

        /* renamed from: e, reason: collision with root package name */
        private float f24840e;

        /* renamed from: f, reason: collision with root package name */
        private int f24841f;

        /* renamed from: g, reason: collision with root package name */
        private int f24842g;

        /* renamed from: h, reason: collision with root package name */
        private float f24843h;
        private int i;

        /* renamed from: j, reason: collision with root package name */
        private int f24844j;

        /* renamed from: k, reason: collision with root package name */
        private float f24845k;

        /* renamed from: l, reason: collision with root package name */
        private float f24846l;

        /* renamed from: m, reason: collision with root package name */
        private float f24847m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f24848n;

        /* renamed from: o, reason: collision with root package name */
        private int f24849o;

        /* renamed from: p, reason: collision with root package name */
        private int f24850p;

        /* renamed from: q, reason: collision with root package name */
        private float f24851q;

        public /* synthetic */ a(av avVar, int i) {
            this(avVar);
        }

        public a() {
            this.f24836a = null;
            this.f24837b = null;
            this.f24838c = null;
            this.f24839d = null;
            this.f24840e = -3.4028235E38f;
            this.f24841f = RecyclerView.UNDEFINED_DURATION;
            this.f24842g = RecyclerView.UNDEFINED_DURATION;
            this.f24843h = -3.4028235E38f;
            this.i = RecyclerView.UNDEFINED_DURATION;
            this.f24844j = RecyclerView.UNDEFINED_DURATION;
            this.f24845k = -3.4028235E38f;
            this.f24846l = -3.4028235E38f;
            this.f24847m = -3.4028235E38f;
            this.f24848n = false;
            this.f24849o = -16777216;
            this.f24850p = RecyclerView.UNDEFINED_DURATION;
        }

        public final a a(Bitmap bitmap) {
            this.f24837b = bitmap;
            return this;
        }

        public final int b() {
            return this.f24842g;
        }

        public final int c() {
            return this.i;
        }

        public final CharSequence d() {
            return this.f24836a;
        }

        public final a a(float f10) {
            this.f24847m = f10;
            return this;
        }

        public final a b(float f10) {
            this.f24843h = f10;
            return this;
        }

        public final void c(float f10) {
            this.f24851q = f10;
        }

        public final a d(float f10) {
            this.f24846l = f10;
            return this;
        }

        public final a a(int i, float f10) {
            this.f24840e = f10;
            this.f24841f = i;
            return this;
        }

        public final a b(int i) {
            this.i = i;
            return this;
        }

        public final a c(int i) {
            this.f24850p = i;
            return this;
        }

        public final void d(int i) {
            this.f24849o = i;
            this.f24848n = true;
        }

        public final a b(Layout.Alignment alignment) {
            this.f24838c = alignment;
            return this;
        }

        public final a a(int i) {
            this.f24842g = i;
            return this;
        }

        public final void b(int i, float f10) {
            this.f24845k = f10;
            this.f24844j = i;
        }

        public final void a(Layout.Alignment alignment) {
            this.f24839d = alignment;
        }

        public final a a(CharSequence charSequence) {
            this.f24836a = charSequence;
            return this;
        }

        public final av a() {
            return new av(this.f24836a, this.f24838c, this.f24839d, this.f24837b, this.f24840e, this.f24841f, this.f24842g, this.f24843h, this.i, this.f24844j, this.f24845k, this.f24846l, this.f24847m, this.f24848n, this.f24849o, this.f24850p, this.f24851q, 0);
        }

        private a(av avVar) {
            this.f24836a = avVar.f24820b;
            this.f24837b = avVar.f24823e;
            this.f24838c = avVar.f24821c;
            this.f24839d = avVar.f24822d;
            this.f24840e = avVar.f24824f;
            this.f24841f = avVar.f24825g;
            this.f24842g = avVar.f24826h;
            this.f24843h = avVar.i;
            this.i = avVar.f24827j;
            this.f24844j = avVar.f24832o;
            this.f24845k = avVar.f24833p;
            this.f24846l = avVar.f24828k;
            this.f24847m = avVar.f24829l;
            this.f24848n = avVar.f24830m;
            this.f24849o = avVar.f24831n;
            this.f24850p = avVar.f24834q;
            this.f24851q = avVar.f24835r;
        }
    }

    static {
        a aVar = new a();
        aVar.f24836a = "";
        f24818s = aVar.a();
        f24819t = new L2(1);
    }

    public /* synthetic */ av(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z10, int i13, int i14, float f15, int i15) {
        this(charSequence, alignment, alignment2, bitmap, f10, i, i10, f11, i11, i12, f12, f13, f14, z10, i13, i14, f15);
    }

    public final a a() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && av.class == obj.getClass()) {
            av avVar = (av) obj;
            if (TextUtils.equals(this.f24820b, avVar.f24820b) && this.f24821c == avVar.f24821c && this.f24822d == avVar.f24822d && ((bitmap = this.f24823e) != null ? !((bitmap2 = avVar.f24823e) == null || !bitmap.sameAs(bitmap2)) : avVar.f24823e == null) && this.f24824f == avVar.f24824f && this.f24825g == avVar.f24825g && this.f24826h == avVar.f24826h && this.i == avVar.i && this.f24827j == avVar.f24827j && this.f24828k == avVar.f24828k && this.f24829l == avVar.f24829l && this.f24830m == avVar.f24830m && this.f24831n == avVar.f24831n && this.f24832o == avVar.f24832o && this.f24833p == avVar.f24833p && this.f24834q == avVar.f24834q && this.f24835r == avVar.f24835r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24820b, this.f24821c, this.f24822d, this.f24823e, Float.valueOf(this.f24824f), Integer.valueOf(this.f24825g), Integer.valueOf(this.f24826h), Float.valueOf(this.i), Integer.valueOf(this.f24827j), Float.valueOf(this.f24828k), Float.valueOf(this.f24829l), Boolean.valueOf(this.f24830m), Integer.valueOf(this.f24831n), Integer.valueOf(this.f24832o), Float.valueOf(this.f24833p), Integer.valueOf(this.f24834q), Float.valueOf(this.f24835r)});
    }

    private av(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z10, int i13, int i14, float f15) {
        if (charSequence == null) {
            zf.a(bitmap);
        } else {
            zf.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f24820b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f24820b = charSequence.toString();
        } else {
            this.f24820b = null;
        }
        this.f24821c = alignment;
        this.f24822d = alignment2;
        this.f24823e = bitmap;
        this.f24824f = f10;
        this.f24825g = i;
        this.f24826h = i10;
        this.i = f11;
        this.f24827j = i11;
        this.f24828k = f13;
        this.f24829l = f14;
        this.f24830m = z10;
        this.f24831n = i13;
        this.f24832o = i12;
        this.f24833p = f12;
        this.f24834q = i14;
        this.f24835r = f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final av a(Bundle bundle) {
        a aVar = new a();
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        if (charSequence != null) {
            aVar.f24836a = charSequence;
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        if (alignment != null) {
            aVar.f24838c = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        if (alignment2 != null) {
            aVar.f24839d = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        if (bitmap != null) {
            aVar.f24837b = bitmap;
        }
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            float f10 = bundle.getFloat(Integer.toString(4, 36));
            int i = bundle.getInt(Integer.toString(5, 36));
            aVar.f24840e = f10;
            aVar.f24841f = i;
        }
        if (bundle.containsKey(Integer.toString(6, 36))) {
            aVar.f24842g = bundle.getInt(Integer.toString(6, 36));
        }
        if (bundle.containsKey(Integer.toString(7, 36))) {
            aVar.f24843h = bundle.getFloat(Integer.toString(7, 36));
        }
        if (bundle.containsKey(Integer.toString(8, 36))) {
            aVar.i = bundle.getInt(Integer.toString(8, 36));
        }
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            float f11 = bundle.getFloat(Integer.toString(10, 36));
            int i10 = bundle.getInt(Integer.toString(9, 36));
            aVar.f24845k = f11;
            aVar.f24844j = i10;
        }
        if (bundle.containsKey(Integer.toString(11, 36))) {
            aVar.f24846l = bundle.getFloat(Integer.toString(11, 36));
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            aVar.f24847m = bundle.getFloat(Integer.toString(12, 36));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            aVar.f24849o = bundle.getInt(Integer.toString(13, 36));
            aVar.f24848n = true;
        }
        if (!bundle.getBoolean(Integer.toString(14, 36), false)) {
            aVar.f24848n = false;
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            aVar.f24850p = bundle.getInt(Integer.toString(15, 36));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            aVar.f24851q = bundle.getFloat(Integer.toString(16, 36));
        }
        return aVar.a();
    }
}
