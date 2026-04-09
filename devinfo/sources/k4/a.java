package k4;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.gms.internal.measurement.a4;
import jd.e;
import je.u;
import p.b3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27924a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27925b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f27926c;

    /* renamed from: d, reason: collision with root package name */
    public Context f27927d;

    /* renamed from: e, reason: collision with root package name */
    public int f27928e;

    /* renamed from: f, reason: collision with root package name */
    public a4 f27929f;
    public e g;

    /* renamed from: h, reason: collision with root package name */
    public b f27930h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f27926c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a4 a4Var = this.f27929f;
                if (a4Var != null) {
                    cursor2.unregisterContentObserver(a4Var);
                }
                e eVar = this.g;
                if (eVar != null) {
                    cursor2.unregisterDataSetObserver(eVar);
                }
            }
            this.f27926c = cursor;
            if (cursor != null) {
                a4 a4Var2 = this.f27929f;
                if (a4Var2 != null) {
                    cursor.registerContentObserver(a4Var2);
                }
                e eVar2 = this.g;
                if (eVar2 != null) {
                    cursor.registerDataSetObserver(eVar2);
                }
                this.f27928e = cursor.getColumnIndexOrThrow("_id");
                this.f27924a = true;
                notifyDataSetChanged();
            } else {
                this.f27928e = -1;
                this.f27924a = false;
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
        if (!this.f27924a || (cursor = this.f27926c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f27924a) {
            return null;
        }
        this.f27926c.moveToPosition(i4);
        if (view == null) {
            b3 b3Var = (b3) this;
            view = b3Var.f30657k.inflate(b3Var.j, viewGroup, false);
        }
        a(view, this.f27926c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f27930h == null) {
            b bVar = new b();
            bVar.f27931a = this;
            this.f27930h = bVar;
        }
        return this.f27930h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        Cursor cursor;
        if (!this.f27924a || (cursor = this.f27926c) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f27926c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        Cursor cursor;
        if (this.f27924a && (cursor = this.f27926c) != null && cursor.moveToPosition(i4)) {
            return this.f27926c.getLong(this.f27928e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f27924a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f27926c.moveToPosition(i4)) {
            throw new IllegalStateException(u.r(i4, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f27926c);
        return view;
    }
}
