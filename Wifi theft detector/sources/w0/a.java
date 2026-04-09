package w0;

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
import w0.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24761a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24762b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f24763c;

    /* renamed from: d, reason: collision with root package name */
    public Context f24764d;

    /* renamed from: e, reason: collision with root package name */
    public int f24765e;

    /* renamed from: f, reason: collision with root package name */
    public C0494a f24766f;

    /* renamed from: g, reason: collision with root package name */
    public DataSetObserver f24767g;

    /* renamed from: h, reason: collision with root package name */
    public w0.b f24768h;

    /* renamed from: w0.a$a, reason: collision with other inner class name */
    public class C0494a extends ContentObserver {
        public C0494a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.h();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f24761a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f24761a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // w0.b.a
    public Cursor c() {
        return this.f24763c;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    public void e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f24762b = true;
        } else {
            this.f24762b = false;
        }
        boolean z10 = cursor != null;
        this.f24763c = cursor;
        this.f24761a = z10;
        this.f24764d = context;
        this.f24765e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f24766f = new C0494a();
            this.f24767g = new b();
        } else {
            this.f24766f = null;
            this.f24767g = null;
        }
        if (z10) {
            C0494a c0494a = this.f24766f;
            if (c0494a != null) {
                cursor.registerContentObserver(c0494a);
            }
            DataSetObserver dataSetObserver = this.f24767g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f24761a || (cursor = this.f24763c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f24761a) {
            return null;
        }
        this.f24763c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f24764d, this.f24763c, viewGroup);
        }
        d(view, this.f24764d, this.f24763c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f24768h == null) {
            this.f24768h = new w0.b(this);
        }
        return this.f24768h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f24761a || (cursor = this.f24763c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f24763c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f24761a && (cursor = this.f24763c) != null && cursor.moveToPosition(i10)) {
            return this.f24763c.getLong(this.f24765e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f24761a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f24763c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f24764d, this.f24763c, viewGroup);
            }
            d(view, this.f24764d, this.f24763c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    public void h() {
        Cursor cursor;
        if (!this.f24762b || (cursor = this.f24763c) == null || cursor.isClosed()) {
            return;
        }
        this.f24761a = this.f24763c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f24763c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0494a c0494a = this.f24766f;
            if (c0494a != null) {
                cursor2.unregisterContentObserver(c0494a);
            }
            DataSetObserver dataSetObserver = this.f24767g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f24763c = cursor;
        if (cursor == null) {
            this.f24765e = -1;
            this.f24761a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0494a c0494a2 = this.f24766f;
        if (c0494a2 != null) {
            cursor.registerContentObserver(c0494a2);
        }
        DataSetObserver dataSetObserver2 = this.f24767g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f24765e = cursor.getColumnIndexOrThrow("_id");
        this.f24761a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
