package m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import n.z;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21879a;

    /* renamed from: b, reason: collision with root package name */
    public final a f21880b;

    public e(Context context, a aVar) {
        this.f21879a = context;
        this.f21880b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f21880b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f21880b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new z(this.f21879a, this.f21880b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f21880b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f21880b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f21880b.f21865a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f21880b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f21880b.f21866b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f21880b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f21880b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f21880b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f21880b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f21880b.f21865a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f21880b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z6) {
        this.f21880b.p(z6);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f21880b.k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f21880b.m(i);
    }
}
