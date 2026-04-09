package H0;

import H0.b;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import s0.C7868d;
import t0.AbstractC8020c;
import t0.C8018a;

/* loaded from: classes.dex */
public abstract class g {
    public static final b.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException, IOException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C8018a c8018a = new C8018a(xmlResourceParser, 0, 2, null);
        C7868d.a aVarA = AbstractC8020c.a(c8018a, resources, theme, attributeSetAsAttributeSet);
        int iG = 0;
        while (!AbstractC8020c.d(xmlResourceParser)) {
            iG = AbstractC8020c.g(c8018a, resources, attributeSetAsAttributeSet, theme, aVarA, iG);
            xmlResourceParser.next();
        }
        return new b.a(aVarA.e(), i10);
    }

    public static final C7868d b(C7868d.b bVar, int i10, InterfaceC3540l interfaceC3540l, int i11) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(44534090, i11, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
        Resources resourcesA = e.a(interfaceC3540l, 0);
        Resources.Theme theme = context.getTheme();
        boolean zT = interfaceC3540l.T(resourcesA) | ((((i11 & 112) ^ 48) > 32 && interfaceC3540l.i(i10)) || (i11 & 48) == 32) | interfaceC3540l.T(theme) | interfaceC3540l.T(resourcesA.getConfiguration());
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = c(bVar, theme, resourcesA, i10);
            interfaceC3540l.K(objF);
        }
        C7868d c7868d = (C7868d) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c7868d;
    }

    public static final C7868d c(C7868d.b bVar, Resources.Theme theme, Resources resources, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        XmlResourceParser xml = resources.getXml(i10);
        AbstractC8020c.j(xml);
        J j10 = J.f24997a;
        return a(theme, resources, xml, typedValue.changingConfigurations).b();
    }
}
