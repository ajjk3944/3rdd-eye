package x3;

import android.view.SubMenu;
import n.MenuC2677k;

/* renamed from: x3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3001f extends MenuC2677k {
    @Override // n.MenuC2677k, android.view.Menu
    public final SubMenu addSubMenu(int i, int i3, int i6, CharSequence charSequence) {
        n.m mVarA = a(i, i3, i6, charSequence);
        r rVar = new r(this.f22076a, this, mVarA);
        mVarA.f22092C = rVar;
        rVar.setHeaderTitle(mVarA.f22110e);
        return rVar;
    }
}
