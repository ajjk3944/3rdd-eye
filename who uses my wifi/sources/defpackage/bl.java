package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class bl extends BaseAdapter implements Filterable {
    public boolean f;
    public boolean g;
    public Cursor h;
    public int i;
    public zk j;
    public al k;
    public cl l;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.h;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                zk zkVar = this.j;
                if (zkVar != null) {
                    cursor2.unregisterContentObserver(zkVar);
                }
                al alVar = this.k;
                if (alVar != null) {
                    cursor2.unregisterDataSetObserver(alVar);
                }
            }
            this.h = cursor;
            if (cursor != null) {
                zk zkVar2 = this.j;
                if (zkVar2 != null) {
                    cursor.registerContentObserver(zkVar2);
                }
                al alVar2 = this.k;
                if (alVar2 != null) {
                    cursor.registerDataSetObserver(alVar2);
                }
                this.i = cursor.getColumnIndexOrThrow("_id");
                this.f = true;
                notifyDataSetChanged();
            } else {
                this.i = -1;
                this.f = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f || (cursor = this.h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f) {
            return null;
        }
        this.h.moveToPosition(i);
        if (view == null) {
            zy0 zy0Var = (zy0) this;
            view = zy0Var.o.inflate(zy0Var.n, viewGroup, false);
        }
        a(view, this.h);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.l == null) {
            cl clVar = new cl();
            clVar.b = this;
            this.l = clVar;
        }
        return this.l;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f || (cursor = this.h) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f && (cursor = this.h) != null && cursor.moveToPosition(i)) {
            return this.h.getLong(this.i);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.h.moveToPosition(i)) {
            throw new IllegalStateException(ex0.f("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.h);
        return view;
    }
}
