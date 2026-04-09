package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5619a;

    /* renamed from: b, reason: collision with root package name */
    public int f5620b;

    /* renamed from: c, reason: collision with root package name */
    public int f5621c;

    /* renamed from: d, reason: collision with root package name */
    public int f5622d;

    /* renamed from: e, reason: collision with root package name */
    public int f5623e;

    /* renamed from: f, reason: collision with root package name */
    public int f5624f;

    /* renamed from: g, reason: collision with root package name */
    public int f5625g;

    /* renamed from: h, reason: collision with root package name */
    public int f5626h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f5627j;

    /* renamed from: k, reason: collision with root package name */
    public List f5628k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5629l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.f5628k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = ((g0) this.f5628k.get(i3)).itemView;
            S s5 = (S) view3.getLayoutParams();
            if (view3 != view && !s5.f5377a.isRemoved() && (layoutPosition = (s5.f5377a.getLayoutPosition() - this.f5622d) * this.f5623e) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f5622d = -1;
        } else {
            this.f5622d = ((S) view2.getLayoutParams()).f5377a.getLayoutPosition();
        }
    }

    public final View b(X x6) {
        List list = this.f5628k;
        if (list == null) {
            View viewD = x6.d(this.f5622d);
            this.f5622d += this.f5623e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((g0) this.f5628k.get(i)).itemView;
            S s5 = (S) view.getLayoutParams();
            if (!s5.f5377a.isRemoved() && this.f5622d == s5.f5377a.getLayoutPosition()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
