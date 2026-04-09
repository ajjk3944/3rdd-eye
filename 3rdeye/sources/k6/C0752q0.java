package K6;

import C6.i;
import H6.C0672i;
import H6.C0675l;
import N7.C1447z5;
import N7.C4;
import N7.F4;
import N7.T2;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.view.animation.Interpolator;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.List;
import w6.C5738b;
import w6.EnumC5737a;

/* compiled from: DivImageBinder.kt */
/* renamed from: K6.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752q0 extends H6.B {

    /* renamed from: c, reason: collision with root package name */
    public final D9.G f3595c;

    /* renamed from: d, reason: collision with root package name */
    public final H6.x f3596d;

    /* renamed from: e, reason: collision with root package name */
    public final Q6.d f3597e;

    /* compiled from: DivImageBinder.kt */
    /* renamed from: K6.q0$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Bitmap, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ O6.n f3598g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(O6.n nVar) {
            super(1);
            this.f3598g = nVar;
        }

        @Override // p9.l
        public final C1992A invoke(Bitmap bitmap) {
            Bitmap it = bitmap;
            kotlin.jvm.internal.l.f(it, "it");
            this.f3598g.setImageBitmap(it);
            return C1992A.f18074a;
        }
    }

    /* compiled from: DivImageBinder.kt */
    /* renamed from: K6.q0$b */
    public static final class b extends j6.o {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O6.n f3599a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0752q0 f3600b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C0672i f3601c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C1447z5 f3602d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ A7.d f3603e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Uri f3604f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(O6.n nVar, C0752q0 c0752q0, C0672i c0672i, C1447z5 c1447z5, A7.d dVar, Uri uri, C0675l c0675l) {
            super(c0675l);
            this.f3599a = nVar;
            this.f3600b = c0752q0;
            this.f3601c = c0672i;
            this.f3602d = c1447z5;
            this.f3603e = dVar;
            this.f3604f = uri;
        }

        @Override // w6.C5739c
        public final void a() {
            this.f3599a.setImageUrl$div_release(null);
        }

        @Override // w6.C5739c
        public final void b(PictureDrawable pictureDrawable) {
            List<F4> list;
            C0752q0 c0752q0 = this.f3600b;
            c0752q0.getClass();
            C1447z5 c1447z5 = this.f3602d;
            if (c1447z5.f10049P != null || ((list = c1447z5.f10082t) != null && !list.isEmpty())) {
                c(C6.j.a(pictureDrawable, this.f3604f));
                return;
            }
            O6.n nVar = this.f3599a;
            nVar.setImageDrawable(pictureDrawable);
            C0752q0.m(c0752q0, nVar, c1447z5, this.f3603e, null);
            nVar.setTag(R.id.image_loaded_flag, Boolean.TRUE);
            nVar.invalidate();
        }

        @Override // w6.C5739c
        public final void c(C5738b c5738b) {
            Bitmap bitmap = c5738b.f47495a;
            O6.n nVar = this.f3599a;
            nVar.setCurrentBitmapWithoutFilters$div_release(bitmap);
            C1447z5 c1447z5 = this.f3602d;
            C0672i c0672i = this.f3601c;
            C0752q0 c0752q0 = this.f3600b;
            c0752q0.getClass();
            C0752q0.n(nVar, c0672i, c1447z5.f10082t);
            EnumC5737a enumC5737a = c5738b.f47497c;
            A7.d dVar = this.f3603e;
            C0752q0.m(c0752q0, nVar, c1447z5, dVar, enumC5737a);
            nVar.setTag(R.id.image_loaded_flag, Boolean.TRUE);
            A7.b<Integer> bVar = c1447z5.f10049P;
            C0752q0.q(nVar, bVar != null ? bVar.a(dVar) : null, c1447z5.f10050Q.a(dVar));
            nVar.invalidate();
        }
    }

    /* compiled from: DivImageBinder.kt */
    /* renamed from: K6.q0$c */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Drawable, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ O6.n f3605g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(O6.n nVar) {
            super(1);
            this.f3605g = nVar;
        }

        @Override // p9.l
        public final C1992A invoke(Drawable drawable) {
            Drawable drawable2 = drawable;
            O6.n nVar = this.f3605g;
            if (!nVar.m() && !kotlin.jvm.internal.l.b(nVar.getTag(R.id.image_loaded_flag), Boolean.FALSE)) {
                nVar.setPlaceholder(drawable2);
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: DivImageBinder.kt */
    /* renamed from: K6.q0$d */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<C6.i, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ O6.n f3606g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ C0752q0 f3607h;
        public final /* synthetic */ C0672i i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ C1447z5 f3608j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ A7.d f3609k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(O6.n nVar, C0752q0 c0752q0, C0672i c0672i, C1447z5 c1447z5, A7.d dVar) {
            super(1);
            this.f3606g = nVar;
            this.f3607h = c0752q0;
            this.i = c0672i;
            this.f3608j = c1447z5;
            this.f3609k = dVar;
        }

        @Override // p9.l
        public final C1992A invoke(C6.i iVar) {
            C6.i it = iVar;
            kotlin.jvm.internal.l.f(it, "it");
            O6.n nVar = this.f3606g;
            if (!nVar.m()) {
                if (it instanceof i.a) {
                    nVar.setCurrentBitmapWithoutFilters$div_release(((i.a) it).f948a);
                    C1447z5 c1447z5 = this.f3608j;
                    C0672i c0672i = this.i;
                    this.f3607h.getClass();
                    C0752q0.n(nVar, c0672i, c1447z5.f10082t);
                    nVar.setTag(R.id.image_loaded_flag, Boolean.FALSE);
                    A7.b<Integer> bVar = c1447z5.f10049P;
                    A7.d dVar = this.f3609k;
                    C0752q0.q(nVar, bVar != null ? bVar.a(dVar) : null, c1447z5.f10050Q.a(dVar));
                } else if (it instanceof i.b) {
                    nVar.setTag(R.id.image_loaded_flag, Boolean.FALSE);
                    nVar.setImageDrawable(((i.b) it).f949a);
                }
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0752q0(D d10, D9.G imageLoader, H6.x xVar, Q6.d dVar) {
        super(d10);
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        this.f3595c = imageLoader;
        this.f3596d = xVar;
        this.f3597e = dVar;
    }

    public static final void m(C0752q0 c0752q0, O6.n nVar, C1447z5 c1447z5, A7.d dVar, EnumC5737a enumC5737a) {
        c0752q0.getClass();
        nVar.animate().cancel();
        float fDoubleValue = (float) c1447z5.f10070g.a(dVar).doubleValue();
        C4 c42 = c1447z5.i;
        if (c42 == null || enumC5737a == EnumC5737a.MEMORY) {
            nVar.setAlpha(fDoubleValue);
            return;
        }
        long jLongValue = c42.f5019b.a(dVar).longValue();
        Interpolator interpolatorB = C6.e.b(c42.f5020c.a(dVar));
        nVar.setAlpha((float) c42.f5018a.a(dVar).doubleValue());
        nVar.animate().alpha(fDoubleValue).setDuration(jLongValue).setInterpolator(interpolatorB).setStartDelay(c42.f5021d.a(dVar).longValue());
    }

    public static void n(O6.n nVar, C0672i c0672i, List list) {
        Bitmap currentBitmapWithoutFilters$div_release = nVar.getCurrentBitmapWithoutFilters$div_release();
        if (currentBitmapWithoutFilters$div_release == null) {
            nVar.setImageBitmap(null);
        } else {
            C0713c.b(nVar, c0672i, currentBitmapWithoutFilters$div_release, list, new a(nVar));
        }
    }

    public static void q(X6.o oVar, Integer num, T2 t22) {
        if ((oVar.m() || kotlin.jvm.internal.l.b(oVar.getTag(R.id.image_loaded_flag), Boolean.FALSE)) && num != null) {
            oVar.setColorFilter(num.intValue(), C0713c.e0(t22));
        } else {
            oVar.setColorFilter((ColorFilter) null);
        }
    }

    public static boolean r(A7.d dVar, O6.n nVar, C1447z5 c1447z5) {
        return !nVar.m() && c1447z5.f10086x.a(dVar).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018d  */
    @Override // H6.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r19, H6.C0672i r20, N7.S2 r21, N7.S2 r22) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.C0752q0.d(android.view.View, H6.i, N7.S2, N7.S2):void");
    }

    public final boolean o(O6.n nVar, C0672i c0672i, C1447z5 c1447z5, Q6.c cVar) {
        A7.b<Uri> bVar = c1447z5.f10035B;
        A7.d dVar = c0672i.f2147b;
        Uri uriA = bVar.a(dVar);
        if (kotlin.jvm.internal.l.b(uriA, nVar.getImageUrl$div_release())) {
            return false;
        }
        boolean zR = r(dVar, nVar, c1447z5);
        nVar.setTag(R.id.image_loaded_flag, null);
        nVar.setColorFilter((ColorFilter) null);
        w6.e loadReference$div_release = nVar.getLoadReference$div_release();
        if (loadReference$div_release != null) {
            loadReference$div_release.cancel();
        }
        p(nVar, c0672i, c1447z5, zR, cVar);
        nVar.setImageUrl$div_release(uriA);
        w6.e eVarLoadImage = this.f3595c.loadImage(uriA.toString(), new b(nVar, this, c0672i, c1447z5, dVar, uriA, c0672i.f2146a));
        c0672i.f2146a.l(eVarLoadImage, nVar);
        nVar.setLoadReference$div_release(eVarLoadImage);
        return true;
    }

    public final void p(O6.n nVar, C0672i c0672i, C1447z5 c1447z5, boolean z10, Q6.c cVar) {
        A7.d dVar = c0672i.f2147b;
        A7.b<String> bVar = c1447z5.f10044K;
        this.f3596d.a(nVar, cVar, bVar != null ? bVar.a(dVar) : null, c1447z5.f10040G.a(dVar).intValue(), z10, new c(nVar), new d(nVar, this, c0672i, c1447z5, dVar));
    }
}
