package T0;

import L0.C3181k;
import L0.C3187q;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;
import l0.AbstractC6538n;
import m0.AbstractC6713l0;
import m0.AbstractC6715m0;
import m0.InterfaceC6717n0;
import m0.e1;
import m0.g1;
import m0.j1;
import o0.AbstractC7040g;

/* loaded from: classes.dex */
public abstract class b {
    public static final void a(C3181k c3181k, InterfaceC6717n0 interfaceC6717n0, AbstractC6713l0 abstractC6713l0, float f10, g1 g1Var, W0.k kVar, AbstractC7040g abstractC7040g, int i10) {
        interfaceC6717n0.j();
        if (c3181k.w().size() <= 1 || (abstractC6713l0 instanceof j1)) {
            b(c3181k, interfaceC6717n0, abstractC6713l0, f10, g1Var, kVar, abstractC7040g, i10);
        } else if (abstractC6713l0 instanceof e1) {
            List listW = c3181k.w();
            int size = listW.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                C3187q c3187q = (C3187q) listW.get(i11);
                height += c3187q.e().getHeight();
                fMax = Math.max(fMax, c3187q.e().getWidth());
            }
            Shader shaderB = ((e1) abstractC6713l0).b(AbstractC6538n.a(fMax, height));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            List listW2 = c3181k.w();
            int size2 = listW2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                C3187q c3187q2 = (C3187q) listW2.get(i12);
                c3187q2.e().y(interfaceC6717n0, AbstractC6715m0.a(shaderB), f10, g1Var, kVar, abstractC7040g, i10);
                interfaceC6717n0.c(0.0f, c3187q2.e().getHeight());
                matrix.setTranslate(0.0f, -c3187q2.e().getHeight());
                shaderB.setLocalMatrix(matrix);
            }
        }
        interfaceC6717n0.r();
    }

    private static final void b(C3181k c3181k, InterfaceC6717n0 interfaceC6717n0, AbstractC6713l0 abstractC6713l0, float f10, g1 g1Var, W0.k kVar, AbstractC7040g abstractC7040g, int i10) {
        List listW = c3181k.w();
        int size = listW.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3187q c3187q = (C3187q) listW.get(i11);
            c3187q.e().y(interfaceC6717n0, abstractC6713l0, f10, g1Var, kVar, abstractC7040g, i10);
            interfaceC6717n0.c(0.0f, c3187q.e().getHeight());
        }
    }
}
