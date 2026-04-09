package A3;

import android.content.Context;
import android.view.SubMenu;
import n.MenuC2677k;

/* loaded from: classes.dex */
public final class l extends MenuC2677k {

    /* renamed from: N, reason: collision with root package name */
    public final Class f435N;

    /* renamed from: O, reason: collision with root package name */
    public final int f436O;

    public l(Context context, Class cls, int i) {
        super(context);
        this.f435N = cls;
        this.f436O = i;
    }

    @Override // n.MenuC2677k
    public final n.m a(int i, int i3, int i6, CharSequence charSequence) {
        int size = this.f22081f.size() + 1;
        int i7 = this.f436O;
        if (size <= i7) {
            y();
            n.m mVarA = super.a(i, i3, i6, charSequence);
            x();
            return mVarA;
        }
        String simpleName = this.f435N.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i7);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(A.f.p(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // n.MenuC2677k, android.view.Menu
    public final SubMenu addSubMenu(int i, int i3, int i6, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f435N.getSimpleName().concat(" does not support submenus"));
    }
}
