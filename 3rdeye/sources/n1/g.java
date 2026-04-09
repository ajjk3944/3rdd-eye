package n1;

import L0.C0770a;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
@Deprecated
/* loaded from: classes.dex */
public final class g extends D {

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f44224f;

    /* renamed from: g, reason: collision with root package name */
    public final D.a f44225g;

    /* renamed from: h, reason: collision with root package name */
    public final a f44226h;

    /* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
    public class a extends C0770a {
        public a() {
        }

        @Override // L0.C0770a
        public final void d(View view, M0.g gVar) {
            g gVar2 = g.this;
            gVar2.f44225g.d(view, gVar);
            RecyclerView recyclerView = gVar2.f44224f;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.h adapter = recyclerView.getAdapter();
            if (adapter instanceof androidx.preference.c) {
                ((androidx.preference.c) adapter).g(childAdapterPosition);
            }
        }

        @Override // L0.C0770a
        public final boolean g(View view, int i, Bundle bundle) {
            return g.this.f44225g.g(view, i, bundle);
        }
    }

    public g(RecyclerView recyclerView) {
        super(recyclerView);
        this.f44225g = this.f16371e;
        this.f44226h = new a();
        this.f44224f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.D
    public final C0770a j() {
        return this.f44226h;
    }
}
