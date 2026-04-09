package n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import o.b0;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17082a;

    /* renamed from: b, reason: collision with root package name */
    public final a f17083b;

    public e(Context context, a aVar) {
        this.f17082a = context;
        this.f17083b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f17083b.b();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f17083b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new b0(this.f17082a, this.f17083b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f17083b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f17083b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f17083b.f17072g;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f17083b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f17083b.f17071d;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f17083b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f17083b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f17083b.l(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f17083b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f17083b.f17072g = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f17083b.q(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f17083b.r(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f17083b.m(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f17083b.p(i10);
    }
}
