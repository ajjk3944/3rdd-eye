package D8;

import D8.n;
import T1.B;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: TotoParamsAdapter.kt */
/* loaded from: classes3.dex */
public final class p extends v<n, b> {

    /* compiled from: TotoParamsAdapter.kt */
    public final class a extends b {

        /* renamed from: l, reason: collision with root package name */
        public final E7.b f1128l;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(E7.b bVar) {
            FrameLayout frameLayout = (FrameLayout) bVar.f1475b;
            kotlin.jvm.internal.l.e(frameLayout, "getRoot(...)");
            super(frameLayout);
            this.f1128l = bVar;
        }

        @Override // D8.p.b
        public final void a(n nVar) {
            n.a aVar = nVar instanceof n.a ? (n.a) nVar : null;
            if (aVar == null) {
                return;
            }
            ((TextView) this.f1128l.f1476c).setText(aVar.f1124a);
        }
    }

    /* compiled from: TotoParamsAdapter.kt */
    public abstract class b extends RecyclerView.F {
        public b() {
            throw null;
        }

        public abstract void a(n nVar);
    }

    /* compiled from: TotoParamsAdapter.kt */
    public final class c extends b {

        /* renamed from: l, reason: collision with root package name */
        public final N2.g f1129l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(N2.g gVar) {
            LinearLayout linearLayout = (LinearLayout) gVar.f4484b;
            kotlin.jvm.internal.l.e(linearLayout, "getRoot(...)");
            super(linearLayout);
            this.f1129l = gVar;
        }

        @Override // D8.p.b
        public final void a(n nVar) {
            n.b bVar = nVar instanceof n.b ? (n.b) nVar : null;
            if (bVar == null) {
                return;
            }
            N2.g gVar = this.f1129l;
            ((TextView) gVar.f4485c).setText(bVar.f1125a);
            TextView textView = (TextView) gVar.f4486d;
            textView.setText(String.valueOf(bVar.f1126b));
            int i = ((n.b) nVar).f1127c ? -65536 : -16777216;
            ((TextView) gVar.f4485c).setTextColor(i);
            textView.setTextColor(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        n item = getItem(i);
        if (item instanceof n.a) {
            return 1;
        }
        if (item instanceof n.b) {
            return 3;
        }
        throw new IllegalStateException("Unknown TOTO list item type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        b holder = (b) f10;
        kotlin.jvm.internal.l.f(holder, "holder");
        n item = getItem(i);
        kotlin.jvm.internal.l.e(item, "getItem(...)");
        holder.a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.l.f(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i == 1) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_toto_param_key, parent, false);
            TextView textView = (TextView) B.f(R.id.tvTotoParamKey, viewInflate);
            if (textView != null) {
                return new a(new E7.b((FrameLayout) viewInflate, textView));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvTotoParamKey)));
        }
        if (i != 3) {
            throw new IllegalStateException("Unknown TOTO list item type");
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_toto_param_value, parent, false);
        int i10 = R.id.tvTotoParamName;
        TextView textView2 = (TextView) B.f(R.id.tvTotoParamName, viewInflate2);
        if (textView2 != null) {
            i10 = R.id.tvTotoParamWeight;
            TextView textView3 = (TextView) B.f(R.id.tvTotoParamWeight, viewInflate2);
            if (textView3 != null) {
                return new c(new N2.g((LinearLayout) viewInflate2, textView2, textView3));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i10)));
    }
}
