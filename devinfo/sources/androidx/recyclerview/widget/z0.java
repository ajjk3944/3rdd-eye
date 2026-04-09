package androidx.recyclerview.widget;

import android.view.View;
import com.google.android.gms.internal.ads.hh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1563a;

    /* renamed from: b, reason: collision with root package name */
    public int f1564b;

    public z0(int i4, int i10) {
        this.f1563a = i4;
        this.f1564b = i10;
    }

    public void a(x1 x1Var) {
        View view = x1Var.itemView;
        this.f1563a = view.getLeft();
        this.f1564b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public z0(hh hhVar, int i4, int i10) {
        this.f1563a = i4;
        this.f1564b = i10;
    }
}
