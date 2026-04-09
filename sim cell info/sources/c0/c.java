package c0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: j, reason: collision with root package name */
    private int f2460j;

    /* renamed from: k, reason: collision with root package name */
    private int f2461k;

    /* renamed from: l, reason: collision with root package name */
    private LayoutInflater f2462l;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z2) {
        super(context, cursor, z2);
        this.f2461k = i2;
        this.f2460j = i2;
        this.f2462l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // c0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2462l.inflate(this.f2461k, viewGroup, false);
    }

    @Override // c0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2462l.inflate(this.f2460j, viewGroup, false);
    }
}
