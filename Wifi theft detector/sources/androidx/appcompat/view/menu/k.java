package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.d;

/* loaded from: classes.dex */
public class k extends d implements SubMenu {
    public d B;
    public f C;

    public k(Context context, d dVar, f fVar) {
        super(context);
        this.B = dVar;
        this.C = fVar;
    }

    @Override // androidx.appcompat.view.menu.d
    public d F() {
        return this.B.F();
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean I() {
        return this.B.I();
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean J() {
        return this.B.J();
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean K() {
        return this.B.K();
    }

    @Override // androidx.appcompat.view.menu.d
    public void W(d.a aVar) {
        this.B.W(aVar);
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean f(f fVar) {
        return this.B.f(fVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.C;
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean h(d dVar, MenuItem menuItem) {
        return super.h(dVar, menuItem) || this.B.h(dVar, menuItem);
    }

    public Menu j0() {
        return this.B;
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean m(f fVar) {
        return this.B.m(fVar);
    }

    @Override // androidx.appcompat.view.menu.d, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.d0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.e0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.d, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.d
    public String v() {
        f fVar = this.C;
        int itemId = fVar != null ? fVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.v() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.Z(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.c0(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.C.setIcon(i10);
        return this;
    }
}
