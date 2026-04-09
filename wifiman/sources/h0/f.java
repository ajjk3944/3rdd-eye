package H0;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.res.Resources;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class f {
    public static final String a(int i10, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1223887937, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = e.a(interfaceC3540l, 0).getString(i10);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return string;
    }

    public static final String b(int i10, Object[] objArr, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(2071230100, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = e.a(interfaceC3540l, 0).getString(i10, Arrays.copyOf(objArr, objArr.length));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return string;
    }
}
