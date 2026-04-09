package y2;

import B0.g;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;
import java.util.List;

/* compiled from: HistoryAdapter.java */
/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5800b extends RecyclerView.h<a> {

    /* renamed from: j, reason: collision with root package name */
    public final Context f48014j;

    /* renamed from: k, reason: collision with root package name */
    public final List<Model> f48015k;

    /* compiled from: HistoryAdapter.java */
    /* renamed from: y2.b$a */
    public static class a extends RecyclerView.F {

        /* renamed from: l, reason: collision with root package name */
        public final TextView f48016l;

        /* renamed from: m, reason: collision with root package name */
        public final TextView f48017m;

        public a(View view) {
            super(view);
            this.f48016l = (TextView) view.findViewById(R.id.date);
            this.f48017m = (TextView) view.findViewById(R.id.attempt);
        }
    }

    public C5800b(Context context, List<Model> list) {
        this.f48014j = context;
        this.f48015k = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f48015k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        a aVar = (a) f10;
        Model model = this.f48015k.get(i);
        boolean zEquals = model.getPack().equals("wrong");
        Context context = this.f48014j;
        if (zEquals) {
            TextView textView = aVar.f48017m;
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = g.f359a;
            textView.setTextColor(g.b.a(resources, R.color.declineColor, null));
            aVar.f48016l.setText(model.getName());
            aVar.f48017m.setText(R.string.wrong_attempt);
            return;
        }
        TextView textView2 = aVar.f48017m;
        Resources resources2 = context.getResources();
        ThreadLocal<TypedValue> threadLocal2 = g.f359a;
        textView2.setTextColor(g.b.a(resources2, R.color.acceptColor, null));
        aVar.f48016l.setText(model.getName());
        aVar.f48017m.setText(R.string.unlock_attempt);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.f48014j).inflate(R.layout.history_item, viewGroup, false));
    }
}
