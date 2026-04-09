package n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import o.b0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29452a;

    /* renamed from: b, reason: collision with root package name */
    public final a f29453b;

    public e(Context context, a aVar) {
        this.f29452a = context;
        this.f29453b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f29453b.d();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f29453b.e();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new b0(this.f29452a, this.f29453b.g());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f29453b.h();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f29453b.i();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f29453b.f29440c;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f29453b.j();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f29453b.f29439b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f29453b.k();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f29453b.l();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f29453b.m(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f29453b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f29453b.f29440c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f29453b.q(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z3) {
        this.f29453b.r(z3);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i4) {
        this.f29453b.n(i4);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i4) {
        this.f29453b.p(i4);
    }
}
