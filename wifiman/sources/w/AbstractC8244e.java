package w;

import T.AbstractC3561w;
import T.H0;
import T.InterfaceC3559v;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import r.AbstractC7535j;
import r.C7548x;
import r.InterfaceC7533i;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8244e {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f63856a = AbstractC3561w.e(a.f63858a);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC8243d f63857b = new b();

    /* renamed from: w.e$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f63858a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8243d invoke(InterfaceC3559v interfaceC3559v) {
            return !((Context) interfaceC3559v.m(AndroidCompositionLocals_androidKt.g())).getPackageManager().hasSystemFeature("android.software.leanback") ? InterfaceC8243d.f63852a.b() : AbstractC8244e.b();
        }
    }

    /* renamed from: w.e$b */
    public static final class b implements InterfaceC8243d {

        /* renamed from: c, reason: collision with root package name */
        private final float f63860c;

        /* renamed from: b, reason: collision with root package name */
        private final float f63859b = 0.3f;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC7533i f63861d = AbstractC7535j.l(125, 0, new C7548x(0.25f, 0.1f, 0.25f, 1.0f), 2, null);

        b() {
        }

        @Override // w.InterfaceC8243d
        public float a(float f10, float f11, float f12) {
            float fAbs = Math.abs((f11 + f10) - f10);
            boolean z10 = fAbs <= f12;
            float f13 = (this.f63859b * f12) - (this.f63860c * fAbs);
            float f14 = f12 - f13;
            if (z10 && f14 < fAbs) {
                f13 = f12 - fAbs;
            }
            return f10 - f13;
        }

        @Override // w.InterfaceC8243d
        public InterfaceC7533i b() {
            return this.f63861d;
        }
    }

    public static final H0 a() {
        return f63856a;
    }

    public static final InterfaceC8243d b() {
        return f63857b;
    }
}
