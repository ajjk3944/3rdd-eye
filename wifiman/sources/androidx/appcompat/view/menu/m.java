package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;

/* loaded from: classes.dex */
public class m extends e implements SubMenu {

    /* renamed from: B, reason: collision with root package name */
    private e f26941B;

    /* renamed from: C, reason: collision with root package name */
    private g f26942C;

    public m(Context context, e eVar, g gVar) {
        super(context);
        this.f26941B = eVar;
        this.f26942C = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e D() {
        return this.f26941B.D();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean G() {
        return this.f26941B.G();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean H() {
        return this.f26941B.H();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.f26941B.I();
    }

    @Override // androidx.appcompat.view.menu.e
    public void S(e.a aVar) {
        this.f26941B.S(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f26941B.f(gVar);
    }

    public Menu f0() {
        return this.f26941B;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f26942C;
    }

    @Override // androidx.appcompat.view.menu.e
    boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f26941B.h(eVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean k(g gVar) {
        return this.f26941B.k(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f26941B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.W(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Z(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f26942C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f26941B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.e
    public String t() {
        g gVar = this.f26942C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.V(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.Y(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f26942C.setIcon(i10);
        return this;
    }
}
