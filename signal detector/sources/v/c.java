package V;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import o.V0;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3789a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3790b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f3791c;

    /* renamed from: d, reason: collision with root package name */
    public Context f3792d;

    /* renamed from: e, reason: collision with root package name */
    public int f3793e;

    /* renamed from: f, reason: collision with root package name */
    public a f3794f;

    /* renamed from: g, reason: collision with root package name */
    public b f3795g;

    /* renamed from: h, reason: collision with root package name */
    public d f3796h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f3791c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f3794f;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f3795g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f3791c = cursor;
            if (cursor != null) {
                a aVar2 = this.f3794f;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f3795g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f3793e = cursor.getColumnIndexOrThrow("_id");
                this.f3789a = true;
                notifyDataSetChanged();
            } else {
                this.f3793e = -1;
                this.f3789a = false;
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
        if (!this.f3789a || (cursor = this.f3791c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3789a) {
            return null;
        }
        this.f3791c.moveToPosition(i);
        if (view == null) {
            V0 v0 = (V0) this;
            view = v0.f22457k.inflate(v0.f22456j, viewGroup, false);
        }
        a(view, this.f3791c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f3796h == null) {
            d dVar = new d();
            dVar.f3797a = this;
            this.f3796h = dVar;
        }
        return this.f3796h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f3789a || (cursor = this.f3791c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f3791c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f3789a && (cursor = this.f3791c) != null && cursor.moveToPosition(i)) {
            return this.f3791c.getLong(this.f3793e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3789a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f3791c.moveToPosition(i)) {
            throw new IllegalStateException(AbstractC1135f5.l(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f3791c);
        return view;
    }
}
