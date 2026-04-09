package V0;

import T.InterfaceC3551q0;
import T.o1;
import T.t1;
import T.z1;
import T0.h;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6537m;
import m0.e1;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    private final e1 f22960a;

    /* renamed from: b, reason: collision with root package name */
    private final float f22961b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f22962c = t1.d(C6537m.c(C6537m.f52356b.a()), null, 2, null);

    /* renamed from: d, reason: collision with root package name */
    private final z1 f22963d = o1.e(new a());

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shader invoke() {
            if (b.this.b() == 9205357640488583168L || C6537m.k(b.this.b())) {
                return null;
            }
            return b.this.a().b(b.this.b());
        }
    }

    public b(e1 e1Var, float f10) {
        this.f22960a = e1Var;
        this.f22961b = f10;
    }

    public final e1 a() {
        return this.f22960a;
    }

    public final long b() {
        return ((C6537m) this.f22962c.getValue()).m();
    }

    public final void c(long j10) {
        this.f22962c.setValue(C6537m.c(j10));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        h.a(textPaint, this.f22961b);
        textPaint.setShader((Shader) this.f22963d.getValue());
    }
}
