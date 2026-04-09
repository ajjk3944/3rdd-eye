package G0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import l0.C6533i;

/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    private final c f6754a;

    public a(c cVar) {
        this.f6754a = cVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f6754a.d(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f6754a.e(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f6754a.f();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C6533i c6533iC = this.f6754a.c();
        if (rect != null) {
            rect.set((int) c6533iC.k(), (int) c6533iC.n(), (int) c6533iC.l(), (int) c6533iC.e());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f6754a.g(actionMode, menu);
    }
}
