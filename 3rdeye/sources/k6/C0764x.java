package K6;

import H6.C0672i;
import H6.C0675l;
import K6.C0762w;
import N7.F4;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.view.View;
import b9.C1992A;
import c9.C2092m;
import java.util.ArrayList;
import w6.C5738b;

/* compiled from: DivBackgroundBinder.kt */
/* renamed from: K6.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764x extends j6.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f3703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0672i f3704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0762w.a.C0059a f3705c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j7.f f3706d;

    /* compiled from: DivBackgroundBinder.kt */
    /* renamed from: K6.x$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Bitmap, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ j7.f f3707g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j7.f fVar) {
            super(1);
            this.f3707g = fVar;
        }

        @Override // p9.l
        public final C1992A invoke(Bitmap bitmap) {
            Bitmap it = bitmap;
            kotlin.jvm.internal.l.f(it, "it");
            j7.f fVar = this.f3707g;
            fVar.f43126d = it;
            fVar.f43127e = null;
            fVar.f43130h = true;
            fVar.invalidateSelf();
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0764x(View view, C0672i c0672i, C0762w.a.C0059a c0059a, j7.f fVar, C0675l c0675l) {
        super(c0675l);
        this.f3703a = view;
        this.f3704b = c0672i;
        this.f3705c = c0059a;
        this.f3706d = fVar;
    }

    @Override // w6.C5739c
    public final void b(PictureDrawable pictureDrawable) {
        C0762w.a.C0059a c0059a = this.f3705c;
        if (!c0059a.f3680h) {
            c(C6.j.a(pictureDrawable, c0059a.f3676d));
            return;
        }
        Picture picture = pictureDrawable.getPicture();
        kotlin.jvm.internal.l.e(picture, "pictureDrawable.picture");
        j7.f fVar = this.f3706d;
        fVar.f43127e = picture;
        fVar.f43126d = null;
        fVar.f43130h = true;
        fVar.invalidateSelf();
    }

    @Override // w6.C5739c
    public final void c(C5738b c5738b) {
        ArrayList arrayList;
        F4 f42;
        Bitmap bitmap = c5738b.f47495a;
        kotlin.jvm.internal.l.e(bitmap, "cachedBitmap.bitmap");
        ArrayList<C0762w.a.C0059a.AbstractC0060a> arrayList2 = this.f3705c.f3679g;
        if (arrayList2 != null) {
            arrayList = new ArrayList(C2092m.T(arrayList2, 10));
            for (C0762w.a.C0059a.AbstractC0060a abstractC0060a : arrayList2) {
                abstractC0060a.getClass();
                if (abstractC0060a instanceof C0762w.a.C0059a.AbstractC0060a.C0061a) {
                    f42 = ((C0762w.a.C0059a.AbstractC0060a.C0061a) abstractC0060a).f3682b;
                } else {
                    if (!(abstractC0060a instanceof C0762w.a.C0059a.AbstractC0060a.b)) {
                        throw new b9.j();
                    }
                    f42 = ((C0762w.a.C0059a.AbstractC0060a.b) abstractC0060a).f3683a;
                }
                arrayList.add(f42);
            }
        } else {
            arrayList = null;
        }
        C0713c.b(this.f3703a, this.f3704b, bitmap, arrayList, new a(this.f3706d));
    }
}
