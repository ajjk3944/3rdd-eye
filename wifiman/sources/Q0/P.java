package Q0;

import a1.AbstractC3750a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class P {

    /* renamed from: a, reason: collision with root package name */
    public static final P f19005a = new P();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal f19006b = new ThreadLocal();

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y0.d f19007a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Y0.d dVar) {
            super(1);
            this.f19007a = dVar;
        }

        public final CharSequence a(y yVar) {
            return '\'' + yVar.a() + "' " + yVar.b(this.f19007a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            return a(null);
        }
    }

    private P() {
    }

    private final String b(z zVar, Context context) {
        return AbstractC3750a.e(zVar.a(), null, null, null, 0, null, new a(Y0.a.a(context)), 31, null);
    }

    public final Typeface a(Typeface typeface, z zVar, Context context) {
        if (typeface == null) {
            return null;
        }
        if (zVar.a().isEmpty()) {
            return typeface;
        }
        Paint paint = (Paint) f19006b.get();
        if (paint == null) {
            paint = new Paint();
            f19006b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(zVar, context));
        return paint.getTypeface();
    }
}
