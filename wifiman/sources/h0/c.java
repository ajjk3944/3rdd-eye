package H0;

import H0.b;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import m0.J0;
import org.xmlpull.v1.XmlPullParserException;
import r0.AbstractC7554d;
import r0.C7551a;
import s0.C7868d;
import s0.q;
import t0.AbstractC8020c;

/* loaded from: classes.dex */
public abstract class c {
    private static final J0 a(CharSequence charSequence, Resources resources, int i10) {
        try {
            return a.a(J0.f52813a, resources, i10);
        } catch (Exception e10) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e10);
        }
    }

    private static final C7868d b(Resources.Theme theme, Resources resources, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(21855625, i12, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:91)");
        }
        b bVar = (b) interfaceC3540l.t(AndroidCompositionLocals_androidKt.h());
        b.C0305b c0305b = new b.C0305b(theme, i10);
        b.a aVarB = bVar.b(c0305b);
        if (aVarB == null) {
            XmlResourceParser xml = resources.getXml(i10);
            if (!AbstractC6492s.d(AbstractC8020c.j(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            aVarB = g.a(theme, resources, xml, i11);
            bVar.d(c0305b, aVarB);
        }
        C7868d c7868dB = aVarB.b();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c7868dB;
    }

    public static final AbstractC7554d c(int i10, InterfaceC3540l interfaceC3540l, int i11) {
        AbstractC7554d c7551a;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(473971343, i11, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:57)");
        }
        Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
        interfaceC3540l.t(AndroidCompositionLocals_androidKt.f());
        Resources resources = context.getResources();
        TypedValue typedValueB = ((d) interfaceC3540l.t(AndroidCompositionLocals_androidKt.i())).b(resources, i10);
        CharSequence charSequence = typedValueB.string;
        boolean z10 = true;
        if (charSequence == null || !t.b0(charSequence, ".xml", false, 2, null)) {
            interfaceC3540l.U(-802884675);
            Object theme = context.getTheme();
            boolean zT = interfaceC3540l.T(charSequence);
            if ((((i11 & 14) ^ 6) <= 4 || !interfaceC3540l.i(i10)) && (i11 & 6) != 4) {
                z10 = false;
            }
            boolean zT2 = zT | z10 | interfaceC3540l.T(theme);
            Object objF = interfaceC3540l.f();
            if (zT2 || objF == InterfaceC3540l.f21100a.a()) {
                objF = a(charSequence, resources, i10);
                interfaceC3540l.K(objF);
            }
            c7551a = new C7551a((J0) objF, 0L, 0L, 6, null);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(-803040357);
            c7551a = q.g(b(context.getTheme(), resources, i10, typedValueB.changingConfigurations, interfaceC3540l, (i11 << 6) & 896), interfaceC3540l, 0);
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c7551a;
    }
}
