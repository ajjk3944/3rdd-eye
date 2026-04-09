package S0;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import g0.C4356c;

/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f11841b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f11842c;

    /* renamed from: d, reason: collision with root package name */
    public int f11843d;

    /* renamed from: e, reason: collision with root package name */
    public b f11844e;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f11842c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            this.f11842c = cursor;
            if (cursor != null) {
                this.f11843d = cursor.getColumnIndexOrThrow("_id");
                this.f11841b = true;
                notifyDataSetChanged();
            } else {
                this.f11843d = -1;
                this.f11841b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f11841b || (cursor = this.f11842c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f11841b) {
            return null;
        }
        this.f11842c.moveToPosition(i);
        if (view == null) {
            throw null;
        }
        a(view, this.f11842c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f11844e == null) {
            b bVar = new b();
            bVar.f11845a = this;
            this.f11844e = bVar;
        }
        return this.f11844e;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f11841b || (cursor = this.f11842c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f11842c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f11841b && (cursor = this.f11842c) != null && cursor.moveToPosition(i)) {
            return this.f11842c.getLong(this.f11843d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f11841b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f11842c.moveToPosition(i)) {
            throw new IllegalStateException(C4356c.h(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            throw null;
        }
        a(view, this.f11842c);
        return view;
    }
}
