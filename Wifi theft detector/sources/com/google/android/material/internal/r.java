package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;

/* loaded from: classes2.dex */
public class r extends androidx.appcompat.view.menu.d {
    public r(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.d, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) a(i10, i11, i12, charSequence);
        t tVar = new t(w(), this, fVar);
        fVar.x(tVar);
        return tVar;
    }
}
