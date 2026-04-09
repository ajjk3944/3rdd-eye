package zd;

import android.content.Context;
import android.view.SubMenu;
import o.m;
import o.o;

/* loaded from: classes.dex */
public final class f extends m {
    public final int A;

    /* renamed from: z, reason: collision with root package name */
    public final Class f27325z;

    public f(Context context, Class cls, int i10) {
        super(context);
        this.f27325z = cls;
        this.A = i10;
    }

    @Override // o.m
    public final o a(int i10, int i11, int i12, CharSequence charSequence) {
        int size = this.f18618f.size() + 1;
        int i13 = this.A;
        if (size <= i13) {
            w();
            o oVarA = super.a(i10, i11, i12, charSequence);
            v();
            return oVarA;
        }
        String simpleName = this.f27325z.getSimpleName();
        StringBuilder sb2 = new StringBuilder("Maximum number of items supported by ");
        sb2.append(simpleName);
        sb2.append(" is ");
        sb2.append(i13);
        sb2.append(". Limit can be checked with ");
        throw new IllegalArgumentException(w.g.j(sb2, simpleName, "#getMaxItemCount()"));
    }

    @Override // o.m, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f27325z.getSimpleName().concat(" does not support submenus"));
    }
}
