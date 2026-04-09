package K6;

import H6.C0672i;
import H6.C0675l;
import K6.C0713c;
import N7.A5;
import N7.AbstractC1408w8;
import N7.C1085a0;
import N7.C1137d7;
import N7.C1154e9;
import N7.C1394v8;
import N7.D8;
import N7.E5;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.F4;
import N7.H7;
import N7.I8;
import N7.N2;
import N7.R6;
import N7.S8;
import N7.W4;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import j7.d;
import j7.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k7.C5248a;
import kotlin.KotlinVersion;
import z0.C5848a;

/* compiled from: DivBackgroundBinder.kt */
/* renamed from: K6.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762w {

    /* renamed from: a, reason: collision with root package name */
    public final D9.G f3672a;

    /* compiled from: DivBackgroundBinder.kt */
    /* renamed from: K6.w$a */
    public static abstract class a {

        /* compiled from: DivBackgroundBinder.kt */
        /* renamed from: K6.w$a$a, reason: collision with other inner class name */
        public static final class C0059a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final double f3673a;

            /* renamed from: b, reason: collision with root package name */
            public final EnumC1305p2 f3674b;

            /* renamed from: c, reason: collision with root package name */
            public final EnumC1319q2 f3675c;

            /* renamed from: d, reason: collision with root package name */
            public final Uri f3676d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f3677e;

            /* renamed from: f, reason: collision with root package name */
            public final E5 f3678f;

            /* renamed from: g, reason: collision with root package name */
            public final ArrayList f3679g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f3680h;

            /* compiled from: DivBackgroundBinder.kt */
            /* renamed from: K6.w$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0060a {

                /* compiled from: DivBackgroundBinder.kt */
                /* renamed from: K6.w$a$a$a$a, reason: collision with other inner class name */
                public static final class C0061a extends AbstractC0060a {

                    /* renamed from: a, reason: collision with root package name */
                    public final int f3681a;

                    /* renamed from: b, reason: collision with root package name */
                    public final F4.a f3682b;

                    public C0061a(int i, F4.a aVar) {
                        this.f3681a = i;
                        this.f3682b = aVar;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0061a)) {
                            return false;
                        }
                        C0061a c0061a = (C0061a) obj;
                        return this.f3681a == c0061a.f3681a && kotlin.jvm.internal.l.b(this.f3682b, c0061a.f3682b);
                    }

                    public final int hashCode() {
                        return this.f3682b.hashCode() + (this.f3681a * 31);
                    }

                    public final String toString() {
                        return "Blur(radius=" + this.f3681a + ", div=" + this.f3682b + ')';
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                /* renamed from: K6.w$a$a$a$b */
                public static final class b extends AbstractC0060a {

                    /* renamed from: a, reason: collision with root package name */
                    public final F4.b f3683a;

                    public b(F4.b div) {
                        kotlin.jvm.internal.l.f(div, "div");
                        this.f3683a = div;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof b) && kotlin.jvm.internal.l.b(this.f3683a, ((b) obj).f3683a);
                    }

                    public final int hashCode() {
                        return this.f3683a.hashCode();
                    }

                    public final String toString() {
                        return "RtlMirror(div=" + this.f3683a + ')';
                    }
                }
            }

            public C0059a(double d10, EnumC1305p2 contentAlignmentHorizontal, EnumC1319q2 contentAlignmentVertical, Uri imageUrl, boolean z10, E5 scale, ArrayList arrayList, boolean z11) {
                kotlin.jvm.internal.l.f(contentAlignmentHorizontal, "contentAlignmentHorizontal");
                kotlin.jvm.internal.l.f(contentAlignmentVertical, "contentAlignmentVertical");
                kotlin.jvm.internal.l.f(imageUrl, "imageUrl");
                kotlin.jvm.internal.l.f(scale, "scale");
                this.f3673a = d10;
                this.f3674b = contentAlignmentHorizontal;
                this.f3675c = contentAlignmentVertical;
                this.f3676d = imageUrl;
                this.f3677e = z10;
                this.f3678f = scale;
                this.f3679g = arrayList;
                this.f3680h = z11;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0059a)) {
                    return false;
                }
                C0059a c0059a = (C0059a) obj;
                return Double.compare(this.f3673a, c0059a.f3673a) == 0 && this.f3674b == c0059a.f3674b && this.f3675c == c0059a.f3675c && kotlin.jvm.internal.l.b(this.f3676d, c0059a.f3676d) && this.f3677e == c0059a.f3677e && this.f3678f == c0059a.f3678f && kotlin.jvm.internal.l.b(this.f3679g, c0059a.f3679g) && this.f3680h == c0059a.f3680h;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final int hashCode() {
                long jDoubleToLongBits = Double.doubleToLongBits(this.f3673a);
                int iHashCode = (this.f3676d.hashCode() + ((this.f3675c.hashCode() + ((this.f3674b.hashCode() + (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31)) * 31)) * 31)) * 31;
                boolean z10 = this.f3677e;
                int i = z10;
                if (z10 != 0) {
                    i = 1;
                }
                int iHashCode2 = (this.f3678f.hashCode() + ((iHashCode + i) * 31)) * 31;
                ArrayList arrayList = this.f3679g;
                int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
                boolean z11 = this.f3680h;
                return iHashCode3 + (z11 ? 1 : z11 ? 1 : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Image(alpha=");
                sb.append(this.f3673a);
                sb.append(", contentAlignmentHorizontal=");
                sb.append(this.f3674b);
                sb.append(", contentAlignmentVertical=");
                sb.append(this.f3675c);
                sb.append(", imageUrl=");
                sb.append(this.f3676d);
                sb.append(", preloadRequired=");
                sb.append(this.f3677e);
                sb.append(", scale=");
                sb.append(this.f3678f);
                sb.append(", filters=");
                sb.append(this.f3679g);
                sb.append(", isVectorCompatible=");
                return C1154e9.k(sb, this.f3680h, ')');
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        /* renamed from: K6.w$a$b */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f3684a;

            /* renamed from: b, reason: collision with root package name */
            public final C5248a f3685b;

            public b(int i, C5248a c5248a) {
                this.f3684a = i;
                this.f3685b = c5248a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f3684a == bVar.f3684a && kotlin.jvm.internal.l.b(this.f3685b, bVar.f3685b);
            }

            public final int hashCode() {
                return this.f3685b.hashCode() + (this.f3684a * 31);
            }

            public final String toString() {
                return "LinearGradient(angle=" + this.f3684a + ", colormap=" + this.f3685b + ')';
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        /* renamed from: K6.w$a$c */
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final Uri f3686a;

            /* renamed from: b, reason: collision with root package name */
            public final Rect f3687b;

            public c(Uri imageUrl, Rect rect) {
                kotlin.jvm.internal.l.f(imageUrl, "imageUrl");
                this.f3686a = imageUrl;
                this.f3687b = rect;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.l.b(this.f3686a, cVar.f3686a) && kotlin.jvm.internal.l.b(this.f3687b, cVar.f3687b);
            }

            public final int hashCode() {
                return this.f3687b.hashCode() + (this.f3686a.hashCode() * 31);
            }

            public final String toString() {
                return "NinePatch(imageUrl=" + this.f3686a + ", insets=" + this.f3687b + ')';
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        /* renamed from: K6.w$a$d */
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public final AbstractC0062a f3688a;

            /* renamed from: b, reason: collision with root package name */
            public final AbstractC0062a f3689b;

            /* renamed from: c, reason: collision with root package name */
            public final List<Integer> f3690c;

            /* renamed from: d, reason: collision with root package name */
            public final b f3691d;

            /* compiled from: DivBackgroundBinder.kt */
            /* renamed from: K6.w$a$d$a, reason: collision with other inner class name */
            public static abstract class AbstractC0062a {

                /* compiled from: DivBackgroundBinder.kt */
                /* renamed from: K6.w$a$d$a$a, reason: collision with other inner class name */
                public static final class C0063a extends AbstractC0062a {

                    /* renamed from: a, reason: collision with root package name */
                    public final float f3692a;

                    public C0063a(float f10) {
                        this.f3692a = f10;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0063a) && Float.compare(this.f3692a, ((C0063a) obj).f3692a) == 0;
                    }

                    public final int hashCode() {
                        return Float.floatToIntBits(this.f3692a);
                    }

                    public final String toString() {
                        return "Fixed(valuePx=" + this.f3692a + ')';
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                /* renamed from: K6.w$a$d$a$b */
                public static final class b extends AbstractC0062a {

                    /* renamed from: a, reason: collision with root package name */
                    public final float f3693a;

                    public b(float f10) {
                        this.f3693a = f10;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof b) && Float.compare(this.f3693a, ((b) obj).f3693a) == 0;
                    }

                    public final int hashCode() {
                        return Float.floatToIntBits(this.f3693a);
                    }

                    public final String toString() {
                        return "Relative(value=" + this.f3693a + ')';
                    }
                }

                public final d.a a() {
                    if (this instanceof C0063a) {
                        return new d.a.C0480a(((C0063a) this).f3692a);
                    }
                    if (this instanceof b) {
                        return new d.a.b(((b) this).f3693a);
                    }
                    throw new b9.j();
                }
            }

            /* compiled from: DivBackgroundBinder.kt */
            /* renamed from: K6.w$a$d$b */
            public static abstract class b {

                /* compiled from: DivBackgroundBinder.kt */
                /* renamed from: K6.w$a$d$b$a, reason: collision with other inner class name */
                public static final class C0064a extends b {

                    /* renamed from: a, reason: collision with root package name */
                    public final float f3694a;

                    public C0064a(float f10) {
                        this.f3694a = f10;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0064a) && Float.compare(this.f3694a, ((C0064a) obj).f3694a) == 0;
                    }

                    public final int hashCode() {
                        return Float.floatToIntBits(this.f3694a);
                    }

                    public final String toString() {
                        return "Fixed(valuePx=" + this.f3694a + ')';
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                /* renamed from: K6.w$a$d$b$b, reason: collision with other inner class name */
                public static final class C0065b extends b {

                    /* renamed from: a, reason: collision with root package name */
                    public final S8.a f3695a;

                    public C0065b(S8.a value) {
                        kotlin.jvm.internal.l.f(value, "value");
                        this.f3695a = value;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0065b) && this.f3695a == ((C0065b) obj).f3695a;
                    }

                    public final int hashCode() {
                        return this.f3695a.hashCode();
                    }

                    public final String toString() {
                        return "Relative(value=" + this.f3695a + ')';
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                /* renamed from: K6.w$a$d$b$c */
                public /* synthetic */ class c {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f3696a;

                    static {
                        int[] iArr = new int[S8.a.values().length];
                        try {
                            iArr[S8.a.FARTHEST_CORNER.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[S8.a.NEAREST_CORNER.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[S8.a.FARTHEST_SIDE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[S8.a.NEAREST_SIDE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        f3696a = iArr;
                    }
                }
            }

            public d(AbstractC0062a abstractC0062a, AbstractC0062a abstractC0062a2, List<Integer> list, b bVar) {
                this.f3688a = abstractC0062a;
                this.f3689b = abstractC0062a2;
                this.f3690c = list;
                this.f3691d = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return kotlin.jvm.internal.l.b(this.f3688a, dVar.f3688a) && kotlin.jvm.internal.l.b(this.f3689b, dVar.f3689b) && kotlin.jvm.internal.l.b(this.f3690c, dVar.f3690c) && kotlin.jvm.internal.l.b(this.f3691d, dVar.f3691d);
            }

            public final int hashCode() {
                return this.f3691d.hashCode() + ((this.f3690c.hashCode() + ((this.f3689b.hashCode() + (this.f3688a.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "RadialGradient(centerX=" + this.f3688a + ", centerY=" + this.f3689b + ", colors=" + this.f3690c + ", radius=" + this.f3691d + ')';
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        /* renamed from: K6.w$a$e */
        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f3697a;

            public e(int i) {
                this.f3697a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f3697a == ((e) obj).f3697a;
            }

            public final int hashCode() {
                return this.f3697a;
            }

            public final String toString() {
                return H7.p(new StringBuilder("Solid(color="), this.f3697a, ')');
            }
        }
    }

    public C0762w(D9.G imageLoader) {
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        this.f3672a = imageLoader;
    }

    public static void a(List list, A7.d resolver, i7.k kVar, p9.l lVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                N2 n22 = (N2) it.next();
                kotlin.jvm.internal.l.f(resolver, "resolver");
                if (n22 != null) {
                    if (n22 instanceof N2.e) {
                        kVar.b(((N2.e) n22).f5891b.f6211a.d(resolver, lVar));
                    } else if (n22 instanceof N2.a) {
                        A5 a52 = ((N2.a) n22).f5887b;
                        kVar.b(a52.f4764a.d(resolver, lVar));
                        kVar.b(a52.f4768e.d(resolver, lVar));
                        kVar.b(a52.f4765b.d(resolver, lVar));
                        kVar.b(a52.f4766c.d(resolver, lVar));
                        kVar.b(a52.f4769f.d(resolver, lVar));
                        kVar.b(a52.f4770g.d(resolver, lVar));
                        List<F4> list2 = a52.f4767d;
                        if (list2 != null) {
                            for (F4 f42 : list2) {
                                if (f42 != null && !(f42 instanceof F4.b) && (f42 instanceof F4.a)) {
                                    kVar.b(((F4.a) f42).f5171b.f6372a.d(resolver, lVar));
                                }
                            }
                        }
                    } else if (n22 instanceof N2.b) {
                        R6 r62 = ((N2.b) n22).f5888b;
                        kVar.b(r62.f6151a.d(resolver, lVar));
                        A7.c<Integer> cVar = r62.f6153c;
                        kVar.b(cVar != null ? cVar.a(resolver, lVar) : null);
                        List<R6.a> list3 = r62.f6152b;
                        if (list3 != null) {
                            Iterator<T> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                C6.g.a(kVar, (R6.a) it2.next(), resolver, lVar);
                            }
                        }
                    } else if (n22 instanceof N2.d) {
                        C1394v8 c1394v8 = ((N2.d) n22).f5890b;
                        A7.c<Integer> cVar2 = c1394v8.f9632d;
                        kVar.b(cVar2 != null ? cVar2.a(resolver, lVar) : null);
                        C6.g.f(kVar, c1394v8.f9629a, resolver, lVar);
                        C6.g.f(kVar, c1394v8.f9630b, resolver, lVar);
                        I8 i82 = c1394v8.f9633e;
                        if (i82 != null) {
                            if (i82 instanceof I8.a) {
                                W4 w42 = ((I8.a) i82).f5476b;
                                kVar.b(w42.f7612a.d(resolver, lVar));
                                kVar.b(w42.f7613b.d(resolver, lVar));
                            } else if (i82 instanceof I8.b) {
                                kVar.b(((I8.b) i82).f5477b.f6207a.d(resolver, lVar));
                            }
                        }
                    } else if (n22 instanceof N2.c) {
                        C1137d7 c1137d7 = ((N2.c) n22).f5889b;
                        kVar.b(c1137d7.f8071a.d(resolver, lVar));
                        C1085a0 c1085a0 = c1137d7.f8072b;
                        kVar.b(c1085a0.f7881b.d(resolver, lVar));
                        kVar.b(c1085a0.f7883d.d(resolver, lVar));
                        kVar.b(c1085a0.f7882c.d(resolver, lVar));
                        kVar.b(c1085a0.f7880a.d(resolver, lVar));
                    }
                }
            }
        }
    }

    public static Drawable d(View view) {
        Object tag = view.getTag(R.id.div_additional_background_layer_tag);
        if (tag instanceof Drawable) {
            return (Drawable) tag;
        }
        return null;
    }

    public static a.d.AbstractC0062a e(AbstractC1408w8 abstractC1408w8, DisplayMetrics displayMetrics, A7.d resolver) {
        if (!(abstractC1408w8 instanceof AbstractC1408w8.a)) {
            if (abstractC1408w8 instanceof AbstractC1408w8.b) {
                return new a.d.AbstractC0062a.b((float) ((AbstractC1408w8.b) abstractC1408w8).f9725b.f5938a.a(resolver).doubleValue());
            }
            throw new b9.j();
        }
        D8 d82 = ((AbstractC1408w8.a) abstractC1408w8).f9724b;
        kotlin.jvm.internal.l.f(d82, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        return new a.d.AbstractC0062a.C0063a(C0713c.H(d82.f5116b.a(resolver).longValue(), d82.f5115a.a(resolver), displayMetrics));
    }

    public static a f(N2 n22, C0675l c0675l, DisplayMetrics displayMetrics, A7.d dVar) {
        ArrayList arrayList;
        List<F4> list;
        long j4;
        Object bVar;
        List<Integer> listB;
        a.d.b c0065b;
        long j10 = -1;
        if (n22 instanceof N2.b) {
            N2.b bVar2 = (N2.b) n22;
            long jLongValue = bVar2.f5888b.f6151a.a(dVar).longValue();
            long j11 = jLongValue >> 31;
            int i = (j11 == 0 || j11 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
            C5248a c5248aT = C6.b.t(bVar2.f5888b, dVar);
            A9.I.k(c5248aT, c0675l);
            return new a.b(i, c5248aT);
        }
        if (n22 instanceof N2.d) {
            N2.d dVar2 = (N2.d) n22;
            a.d.AbstractC0062a abstractC0062aE = e(dVar2.f5890b.f9629a, displayMetrics, dVar);
            C1394v8 c1394v8 = dVar2.f5890b;
            a.d.AbstractC0062a abstractC0062aE2 = e(c1394v8.f9630b, displayMetrics, dVar);
            A7.c<Integer> cVar = c1394v8.f9632d;
            if (cVar == null || (listB = cVar.b(dVar)) == null) {
                listB = C2099t.f18581b;
            }
            I8 i82 = c1394v8.f9633e;
            if (i82 instanceof I8.a) {
                c0065b = new a.d.b.C0064a(C0713c.j0(((I8.a) i82).f5476b, displayMetrics, dVar));
            } else {
                if (!(i82 instanceof I8.b)) {
                    throw new b9.j();
                }
                c0065b = new a.d.b.C0065b(((I8.b) i82).f5477b.f6207a.a(dVar));
            }
            return new a.d(abstractC0062aE, abstractC0062aE2, listB, c0065b);
        }
        if (!(n22 instanceof N2.a)) {
            if (n22 instanceof N2.e) {
                return new a.e(((N2.e) n22).f5891b.f6211a.a(dVar).intValue());
            }
            if (!(n22 instanceof N2.c)) {
                throw new b9.j();
            }
            N2.c cVar2 = (N2.c) n22;
            Uri uriA = cVar2.f5889b.f8071a.a(dVar);
            C1137d7 c1137d7 = cVar2.f5889b;
            long jLongValue2 = c1137d7.f8072b.f7881b.a(dVar).longValue();
            long j12 = jLongValue2 >> 31;
            int i10 = (j12 == 0 || j12 == -1) ? (int) jLongValue2 : jLongValue2 > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
            long jLongValue3 = c1137d7.f8072b.f7883d.a(dVar).longValue();
            long j13 = jLongValue3 >> 31;
            int i11 = (j13 == 0 || j13 == -1) ? (int) jLongValue3 : jLongValue3 > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
            long jLongValue4 = c1137d7.f8072b.f7882c.a(dVar).longValue();
            long j14 = jLongValue4 >> 31;
            int i12 = (j14 == 0 || j14 == -1) ? (int) jLongValue4 : jLongValue4 > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
            long jLongValue5 = c1137d7.f8072b.f7880a.a(dVar).longValue();
            long j15 = jLongValue5 >> 31;
            return new a.c(uriA, new Rect(i10, i11, i12, (j15 == 0 || j15 == -1) ? (int) jLongValue5 : jLongValue5 > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION));
        }
        N2.a aVar = (N2.a) n22;
        double dDoubleValue = aVar.f5887b.f4764a.a(dVar).doubleValue();
        A5 a52 = aVar.f5887b;
        EnumC1305p2 enumC1305p2A = a52.f4765b.a(dVar);
        EnumC1319q2 enumC1319q2A = a52.f4766c.a(dVar);
        Uri uriA2 = a52.f4768e.a(dVar);
        boolean zBooleanValue = a52.f4769f.a(dVar).booleanValue();
        E5 e5A = a52.f4770g.a(dVar);
        List<F4> list2 = a52.f4767d;
        if (list2 != null) {
            List<F4> list3 = list2;
            arrayList = new ArrayList(C2092m.T(list3, 10));
            for (F4 f42 : list3) {
                if (f42 instanceof F4.a) {
                    F4.a aVar2 = (F4.a) f42;
                    j4 = j10;
                    long jLongValue6 = aVar2.f5171b.f6372a.a(dVar).longValue();
                    long j16 = jLongValue6 >> 31;
                    bVar = new a.C0059a.AbstractC0060a.C0061a((j16 == 0 || j16 == j4) ? (int) jLongValue6 : jLongValue6 > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION, aVar2);
                } else {
                    j4 = j10;
                    if (!(f42 instanceof F4.b)) {
                        throw new b9.j();
                    }
                    bVar = new a.C0059a.AbstractC0060a.b((F4.b) f42);
                }
                arrayList.add(bVar);
                j10 = j4;
            }
        } else {
            arrayList = null;
        }
        return new a.C0059a(dDoubleValue, enumC1305p2A, enumC1319q2A, uriA2, zBooleanValue, e5A, arrayList, a52.f4764a.a(dVar).doubleValue() == 1.0d && ((list = a52.f4767d) == null || list.isEmpty()));
    }

    public static void h(View view, Drawable drawable) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.drawable.native_animation_background) : null) != null) {
            Drawable drawable2 = C5848a.getDrawable(view.getContext(), R.drawable.native_animation_background);
            if (drawable2 != null) {
                arrayList.add(drawable2);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        view.setBackground(new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])));
        if (z10) {
            Drawable background2 = view.getBackground();
            kotlin.jvm.internal.l.d(background2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            Drawable background3 = view.getBackground();
            kotlin.jvm.internal.l.d(background3, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            ((LayerDrawable) background2).setId(((LayerDrawable) background3).getNumberOfLayers() - 1, R.drawable.native_animation_background);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [c9.t] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [K6.w] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View] */
    public final void b(C0672i c0672i, Drawable drawable, View view, List list) {
        ?? arrayList;
        DisplayMetrics metrics = view.getResources().getDisplayMetrics();
        A7.d dVar = c0672i.f2147b;
        if (list != null) {
            List<N2> list2 = list;
            arrayList = new ArrayList(C2092m.T(list2, 10));
            for (N2 n22 : list2) {
                kotlin.jvm.internal.l.e(metrics, "metrics");
                arrayList.add(f(n22, c0672i.f2146a, metrics, dVar));
            }
        } else {
            arrayList = C2099t.f18581b;
        }
        Object tag = view.getTag(R.id.div_default_background_list_tag);
        List list3 = tag instanceof List ? (List) tag : null;
        Drawable drawableD = d(view);
        if (kotlin.jvm.internal.l.b(list3, arrayList) && kotlin.jvm.internal.l.b(drawableD, drawable)) {
            return;
        }
        h(view, g(c0672i, drawable, view, arrayList));
        view.setTag(R.id.div_default_background_list_tag, arrayList);
        view.setTag(R.id.div_focused_background_list_tag, null);
        view.setTag(R.id.div_additional_background_layer_tag, drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [c9.t] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [K6.w] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View] */
    public final void c(View view, C0672i c0672i, Drawable drawable, List<? extends N2> list, List<? extends N2> list2) {
        ?? arrayList;
        DisplayMetrics metrics = view.getResources().getDisplayMetrics();
        C0675l c0675l = c0672i.f2146a;
        A7.d dVar = c0672i.f2147b;
        if (list != null) {
            List<? extends N2> list3 = list;
            arrayList = new ArrayList(C2092m.T(list3, 10));
            for (N2 n22 : list3) {
                kotlin.jvm.internal.l.e(metrics, "metrics");
                arrayList.add(f(n22, c0675l, metrics, dVar));
            }
        } else {
            arrayList = C2099t.f18581b;
        }
        List<? extends N2> list4 = list2;
        ArrayList arrayList2 = new ArrayList(C2092m.T(list4, 10));
        for (N2 n23 : list4) {
            kotlin.jvm.internal.l.e(metrics, "metrics");
            arrayList2.add(f(n23, c0675l, metrics, dVar));
        }
        Object tag = view.getTag(R.id.div_default_background_list_tag);
        List list5 = tag instanceof List ? (List) tag : null;
        Object tag2 = view.getTag(R.id.div_focused_background_list_tag);
        List list6 = tag2 instanceof List ? (List) tag2 : null;
        Drawable drawableD = d(view);
        if (kotlin.jvm.internal.l.b(list5, arrayList) && kotlin.jvm.internal.l.b(list6, arrayList2) && kotlin.jvm.internal.l.b(drawableD, drawable)) {
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_focused}, g(c0672i, drawable, view, arrayList2));
        if (list != null || drawable != null) {
            stateListDrawable.addState(StateSet.WILD_CARD, g(c0672i, drawable, view, arrayList));
        }
        h(view, stateListDrawable);
        view.setTag(R.id.div_default_background_list_tag, arrayList);
        view.setTag(R.id.div_focused_background_list_tag, arrayList2);
        view.setTag(R.id.div_additional_background_layer_tag, drawable);
    }

    public final LayerDrawable g(C0672i c0672i, Drawable drawable, View target, List list) {
        d.c bVar;
        d.c.b.a aVar;
        Drawable dVar;
        Drawable drawable2;
        f.a aVar2;
        C0672i context = c0672i;
        if (drawable != null) {
            drawable.mutate();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar3 = (a) it.next();
            aVar3.getClass();
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(target, "target");
            D9.G imageLoader = this.f3672a;
            kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
            boolean z10 = aVar3 instanceof a.C0059a;
            C0675l divView = context.f2146a;
            if (z10) {
                a.C0059a c0059a = (a.C0059a) aVar3;
                j7.f fVar = new j7.f();
                fVar.setAlpha((int) (c0059a.f3673a * KotlinVersion.MAX_COMPONENT_VALUE));
                E5 e52 = c0059a.f3678f;
                kotlin.jvm.internal.l.f(e52, "<this>");
                int i = C0713c.a.f3399f[e52.ordinal()];
                f.c cVar = i != 1 ? i != 2 ? i != 3 ? f.c.NO_SCALE : f.c.STRETCH : f.c.FIT : f.c.FILL;
                kotlin.jvm.internal.l.f(cVar, "<set-?>");
                fVar.f43123a = cVar;
                boolean zD = C6.r.d(target);
                EnumC1305p2 enumC1305p2 = c0059a.f3674b;
                kotlin.jvm.internal.l.f(enumC1305p2, "<this>");
                int i10 = C0713c.a.f3395b[enumC1305p2.ordinal()];
                if (i10 == 1) {
                    aVar2 = f.a.LEFT;
                } else if (i10 == 2) {
                    aVar2 = f.a.CENTER;
                } else if (i10 == 3) {
                    aVar2 = f.a.RIGHT;
                } else if (i10 == 4) {
                    aVar2 = zD ? f.a.RIGHT : f.a.LEFT;
                } else {
                    if (i10 != 5) {
                        throw new b9.j();
                    }
                    aVar2 = zD ? f.a.LEFT : f.a.RIGHT;
                }
                kotlin.jvm.internal.l.f(aVar2, "<set-?>");
                fVar.f43124b = aVar2;
                EnumC1319q2 enumC1319q2 = c0059a.f3675c;
                kotlin.jvm.internal.l.f(enumC1319q2, "<this>");
                int i11 = C0713c.a.f3396c[enumC1319q2.ordinal()];
                f.b bVar2 = i11 != 2 ? i11 != 3 ? f.b.TOP : f.b.BOTTOM : f.b.CENTER;
                kotlin.jvm.internal.l.f(bVar2, "<set-?>");
                fVar.f43125c = bVar2;
                String string = c0059a.f3676d.toString();
                kotlin.jvm.internal.l.e(string, "imageUrl.toString()");
                divView.l(imageLoader.loadImage(string, new C0764x(target, context, c0059a, fVar, context.f2146a)), target);
                drawable2 = fVar;
            } else {
                if (aVar3 instanceof a.c) {
                    a.c cVar2 = (a.c) aVar3;
                    kotlin.jvm.internal.l.f(divView, "divView");
                    j7.c cVar3 = new j7.c();
                    String string2 = cVar2.f3686a.toString();
                    kotlin.jvm.internal.l.e(string2, "imageUrl.toString()");
                    divView.l(imageLoader.loadImage(string2, new C0766y(divView, cVar3, cVar2)), target);
                    dVar = cVar3;
                } else if (aVar3 instanceof a.e) {
                    dVar = new ColorDrawable(((a.e) aVar3).f3697a);
                } else if (aVar3 instanceof a.b) {
                    dVar = new j7.b(r0.f3684a, ((a.b) aVar3).f3685b);
                } else {
                    if (!(aVar3 instanceof a.d)) {
                        throw new b9.j();
                    }
                    a.d dVar2 = (a.d) aVar3;
                    a.d.b bVar3 = dVar2.f3691d;
                    bVar3.getClass();
                    if (bVar3 instanceof a.d.b.C0064a) {
                        bVar = new d.c.a(((a.d.b.C0064a) bVar3).f3694a);
                    } else {
                        if (!(bVar3 instanceof a.d.b.C0065b)) {
                            throw new b9.j();
                        }
                        int i12 = a.d.b.c.f3696a[((a.d.b.C0065b) bVar3).f3695a.ordinal()];
                        if (i12 == 1) {
                            aVar = d.c.b.a.FARTHEST_CORNER;
                        } else if (i12 == 2) {
                            aVar = d.c.b.a.NEAREST_CORNER;
                        } else if (i12 == 3) {
                            aVar = d.c.b.a.FARTHEST_SIDE;
                        } else {
                            if (i12 != 4) {
                                throw new b9.j();
                            }
                            aVar = d.c.b.a.NEAREST_SIDE;
                        }
                        bVar = new d.c.b(aVar);
                    }
                    dVar = new j7.d(bVar, dVar2.f3688a.a(), dVar2.f3689b.a(), C2097r.F0(dVar2.f3690c));
                }
                drawable2 = dVar;
            }
            Drawable drawableMutate = drawable2.mutate();
            if (drawableMutate != null) {
                arrayList.add(drawableMutate);
            }
            context = c0672i;
        }
        ArrayList arrayListI0 = C2097r.I0(arrayList);
        if (drawable != null) {
            arrayListI0.add(drawable);
        }
        if (arrayListI0.isEmpty()) {
            return null;
        }
        return new LayerDrawable((Drawable[]) arrayListI0.toArray(new Drawable[0]));
    }
}
