package c0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import c0.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b, reason: collision with root package name */
    protected boolean f2449b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f2450c;

    /* renamed from: d, reason: collision with root package name */
    protected Cursor f2451d;

    /* renamed from: e, reason: collision with root package name */
    protected Context f2452e;

    /* renamed from: f, reason: collision with root package name */
    protected int f2453f;

    /* renamed from: g, reason: collision with root package name */
    protected C0025a f2454g;

    /* renamed from: h, reason: collision with root package name */
    protected DataSetObserver f2455h;

    /* renamed from: i, reason: collision with root package name */
    protected c0.b f2456i;

    /* renamed from: c0.a$a, reason: collision with other inner class name */
    private class C0025a extends ContentObserver {
        C0025a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f2449b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f2449b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z2) {
        f(context, cursor, z2 ? 1 : 2);
    }

    public abstract CharSequence a(Cursor cursor);

    @Override // c0.b.a
    public Cursor b() {
        return this.f2451d;
    }

    public void c(Cursor cursor) {
        Cursor cursorJ = j(cursor);
        if (cursorJ != null) {
            cursorJ.close();
        }
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i2) {
        b bVar;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f2450c = true;
        } else {
            this.f2450c = false;
        }
        boolean z2 = cursor != null;
        this.f2451d = cursor;
        this.f2449b = z2;
        this.f2452e = context;
        this.f2453f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f2454g = new C0025a();
            bVar = new b();
        } else {
            bVar = null;
            this.f2454g = null;
        }
        this.f2455h = bVar;
        if (z2) {
            C0025a c0025a = this.f2454g;
            if (c0025a != null) {
                cursor.registerContentObserver(c0025a);
            }
            DataSetObserver dataSetObserver = this.f2455h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f2449b || (cursor = this.f2451d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f2449b) {
            return null;
        }
        this.f2451d.moveToPosition(i2);
        if (view == null) {
            view = g(this.f2452e, this.f2451d, viewGroup);
        }
        e(view, this.f2452e, this.f2451d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f2456i == null) {
            this.f2456i = new c0.b(this);
        }
        return this.f2456i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f2449b || (cursor = this.f2451d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f2451d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.f2449b && (cursor = this.f2451d) != null && cursor.moveToPosition(i2)) {
            return this.f2451d.getLong(this.f2453f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f2449b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f2451d.moveToPosition(i2)) {
            if (view == null) {
                view = h(this.f2452e, this.f2451d, viewGroup);
            }
            e(view, this.f2452e, this.f2451d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i2);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f2450c || (cursor = this.f2451d) == null || cursor.isClosed()) {
            return;
        }
        this.f2449b = this.f2451d.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f2451d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0025a c0025a = this.f2454g;
            if (c0025a != null) {
                cursor2.unregisterContentObserver(c0025a);
            }
            DataSetObserver dataSetObserver = this.f2455h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2451d = cursor;
        if (cursor != null) {
            C0025a c0025a2 = this.f2454g;
            if (c0025a2 != null) {
                cursor.registerContentObserver(c0025a2);
            }
            DataSetObserver dataSetObserver2 = this.f2455h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f2453f = cursor.getColumnIndexOrThrow("_id");
            this.f2449b = true;
            notifyDataSetChanged();
        } else {
            this.f2453f = -1;
            this.f2449b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
