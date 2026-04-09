package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class b90 extends androidx.recyclerview.widget.v<da0, ha0> {

    /* renamed from: a, reason: collision with root package name */
    private final ia0 f25138a;

    /* renamed from: b, reason: collision with root package name */
    private final w80 f25139b;

    /* renamed from: c, reason: collision with root package name */
    private final A9.E f25140c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashMap f25141d;

    /* renamed from: e, reason: collision with root package name */
    private a f25142e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25143f;

    public final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            kotlin.jvm.internal.l.f(view, "view");
            Map map = b90.this.f25141d;
            b90 b90Var = b90.this;
            for (Map.Entry entry : map.entrySet()) {
                b90.access$bindHolder(b90Var, (ha0) entry.getKey(), ((Number) entry.getValue()).intValue());
            }
            b90.this.c();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View v10) {
            kotlin.jvm.internal.l.f(v10, "v");
            b90.access$unregisterTrackers(b90.this);
            Set setKeySet = b90.this.f25141d.keySet();
            b90 b90Var = b90.this;
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                b90.access$unbindHolder(b90Var, (ha0) it.next());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b90(ia0 feedViewModel, w80 feedAdItemVisibilityTracker) {
        super(new ea0());
        kotlin.jvm.internal.l.f(feedViewModel, "feedViewModel");
        kotlin.jvm.internal.l.f(feedAdItemVisibilityTracker, "feedAdItemVisibilityTracker");
        this.f25138a = feedViewModel;
        this.f25139b = feedAdItemVisibilityTracker;
        I9.c cVar = A9.U.f211a;
        this.f25140c = A9.F.a(F9.q.f1782a.plus(C0575f.a()));
        this.f25141d = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b90 this$0, int i) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.f25138a.a(i);
    }

    public static final void access$bindHolder(b90 b90Var, ha0 ha0Var, int i) {
        da0 da0Var = b90Var.getCurrentList().get(i);
        if ((ha0Var instanceof x90) && (da0Var instanceof i90)) {
            ((x90) ha0Var).a((i90) da0Var);
        }
    }

    public static final void access$unbindHolder(b90 b90Var, ha0 ha0Var) {
        b90Var.getClass();
        x90 x90Var = ha0Var instanceof x90 ? (x90) ha0Var : null;
        if (x90Var != null) {
            x90Var.a();
        }
    }

    public static final void access$unregisterTrackers(b90 b90Var) {
        b90Var.f25139b.a();
        A9.F.b(b90Var.f25140c, null);
        b90Var.f25143f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (this.f25143f) {
            return;
        }
        this.f25143f = true;
        this.f25139b.a(new R1(this, 2));
        C0575f.e(this.f25140c, null, null, new c90(this, null), 3);
    }

    public abstract lt a();

    public abstract de2 b();

    @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i) {
        return kotlin.jvm.internal.l.b(getCurrentList().get(i), ca0.f25580a) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.l.f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        a aVar = this.f25142e;
        if (aVar == null) {
            aVar = new a();
        }
        this.f25142e = aVar;
        recyclerView.removeOnAttachStateChangeListener(aVar);
        recyclerView.addOnAttachStateChangeListener(aVar);
        if (this.f25138a.d().get() < 0) {
            this.f25138a.f();
        }
        c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.l.f(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        a aVar = this.f25142e;
        if (aVar != null) {
            recyclerView.removeOnAttachStateChangeListener(aVar);
        }
        this.f25139b.a();
        A9.F.b(this.f25140c, null);
        this.f25143f = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(ha0 holder, int i) {
        kotlin.jvm.internal.l.f(holder, "holder");
        this.f25141d.put(holder, Integer.valueOf(i));
        da0 da0Var = getCurrentList().get(i);
        if ((holder instanceof x90) && (da0Var instanceof i90)) {
            ((x90) holder).a((i90) da0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public ha0 onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.l.f(parent, "parent");
        Context context = parent.getContext();
        if (i != 0) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.monetization_ads_feed_progressbar, parent, false);
            kotlin.jvm.internal.l.c(viewInflate);
            return new aa0(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.monetization_ads_feed_item, parent, false);
        kotlin.jvm.internal.l.d(viewInflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate2;
        C4072a3 c4072a3A = this.f25138a.a();
        lt ltVarA = a();
        de2 de2VarB = b();
        return new x90(c4072a3A, viewGroup, ltVarA, de2VarB, new k90(c4072a3A, viewGroup, ltVarA, de2VarB));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(ha0 holder) {
        kotlin.jvm.internal.l.f(holder, "holder");
        super.onViewAttachedToWindow((b90) holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (holder instanceof x90) {
            View itemView = holder.itemView;
            kotlin.jvm.internal.l.e(itemView, "itemView");
            this.f25139b.a(itemView, bindingAdapterPosition);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(ha0 holder) {
        kotlin.jvm.internal.l.f(holder, "holder");
        super.onViewDetachedFromWindow((b90) holder);
        w80 w80Var = this.f25139b;
        View itemView = holder.itemView;
        kotlin.jvm.internal.l.e(itemView, "itemView");
        w80Var.a(itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(ha0 holder) {
        kotlin.jvm.internal.l.f(holder, "holder");
        super.onViewRecycled((b90) holder);
        this.f25141d.remove(holder);
        x90 x90Var = holder instanceof x90 ? (x90) holder : null;
        if (x90Var != null) {
            x90Var.a();
        }
    }

    public /* synthetic */ b90(ia0 ia0Var, w80 w80Var, int i, kotlin.jvm.internal.g gVar) {
        this(ia0Var, (i & 2) != 0 ? new w80() : w80Var);
    }
}
