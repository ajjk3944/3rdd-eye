package N;

import N.M0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class N0 {
    public static final String a(int i10, InterfaceC3540l interfaceC3540l, int i11) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-726638443, i11, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        interfaceC3540l.t(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g())).getResources();
        M0.a aVar = M0.f13846a;
        String string = M0.i(i10, aVar.e()) ? resources.getString(f0.i.f46645h) : M0.i(i10, aVar.a()) ? resources.getString(f0.i.f46638a) : M0.i(i10, aVar.b()) ? resources.getString(f0.i.f46639b) : M0.i(i10, aVar.c()) ? resources.getString(f0.i.f46640c) : M0.i(i10, aVar.d()) ? resources.getString(f0.i.f46642e) : M0.i(i10, aVar.g()) ? resources.getString(f0.i.f46648k) : M0.i(i10, aVar.f()) ? resources.getString(f0.i.f46647j) : "";
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return string;
    }
}
