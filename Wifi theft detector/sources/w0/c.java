package w0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: i, reason: collision with root package name */
    public int f24772i;

    /* renamed from: j, reason: collision with root package name */
    public int f24773j;

    /* renamed from: k, reason: collision with root package name */
    public LayoutInflater f24774k;

    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f24773j = i10;
        this.f24772i = i10;
        this.f24774k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // w0.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f24774k.inflate(this.f24773j, viewGroup, false);
    }

    @Override // w0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f24774k.inflate(this.f24772i, viewGroup, false);
    }
}
