package E8;

import F8.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: LogsAdapter.kt */
/* loaded from: classes3.dex */
public final class b extends RecyclerView.h<a> {

    /* renamed from: j, reason: collision with root package name */
    public final List<G8.a> f1481j;

    /* renamed from: k, reason: collision with root package name */
    public final d.b f1482k;

    /* compiled from: LogsAdapter.kt */
    public static final class a extends RecyclerView.F {

        /* renamed from: l, reason: collision with root package name */
        public final TextView f1483l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, d.b clickListener, List mList) {
            super(view);
            l.f(clickListener, "clickListener");
            l.f(mList, "mList");
            View viewFindViewById = view.findViewById(R.id.tvTitle);
            l.e(viewFindViewById, "findViewById(...)");
            this.f1483l = (TextView) viewFindViewById;
            view.setOnClickListener(new E8.a(clickListener, mList, this, 0));
        }
    }

    public b(List mList, d.b bVar) {
        l.f(mList, "mList");
        this.f1481j = mList;
        this.f1482k = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f1481j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        a holder = (a) f10;
        l.f(holder, "holder");
        G8.a item = this.f1481j.get(i);
        l.f(item, "item");
        holder.f1483l.setText(item.f1938a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup parent, int i) {
        l.f(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_log_layout, parent, false);
        l.c(viewInflate);
        return new a(viewInflate, this.f1482k, this.f1481j);
    }
}
