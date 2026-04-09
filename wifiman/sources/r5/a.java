package R5;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6538n;
import m0.AbstractC6682S;
import m0.AbstractC6713l0;
import m0.S0;
import r6.AbstractC7575a;
import u6.InterfaceC8137b;

/* loaded from: classes3.dex */
public final class a extends AbstractC7575a {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6713l0 f19583b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f19584c;

    public a(AbstractC6713l0 brush) {
        AbstractC6492s.i(brush, "brush");
        this.f19583b = brush;
        this.f19584c = new Matrix();
    }

    @Override // r6.AbstractC7575a
    public Shader c(InterfaceC8137b context, float f10, float f11, float f12, float f13) {
        AbstractC6492s.i(context, "context");
        S0 s0A = AbstractC6682S.a();
        this.f19583b.a(AbstractC6538n.a(Math.abs(f10 - f12), Math.abs(f11 - f13)), s0A, 1.0f);
        Shader shaderZ = s0A.z();
        if (shaderZ == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f19584c.postTranslate(f10, f11);
        shaderZ.setLocalMatrix(this.f19584c);
        this.f19584c.reset();
        return shaderZ;
    }
}
