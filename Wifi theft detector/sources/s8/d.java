package s8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import java.util.ArrayList;
import l8.w1;

/* loaded from: classes3.dex */
public class d extends RecyclerView.Adapter {

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f24336i;

    /* renamed from: j, reason: collision with root package name */
    public a f24337j;

    public interface a {
        void a(View view, int i10);
    }

    public class b extends RecyclerView.c0 implements View.OnClickListener {

        /* renamed from: c, reason: collision with root package name */
        public w1 f24338c;

        public b(w1 w1Var) {
            super(w1Var.x());
            this.f24338c = w1Var;
            w1Var.f23353x.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (d.this.f24337j != null) {
                d.this.f24337j.a(view, getAdapterPosition());
            }
        }
    }

    public d(ArrayList arrayList, a aVar) {
        this.f24336i = arrayList;
        this.f24337j = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.f24338c.f23355z.setText("Mac: " + ((k8.c) this.f24336i.get(i10)).b());
        bVar.f24338c.f23354y.setText("Host: " + ((k8.c) this.f24336i.get(i10)).a());
        bVar.f24338c.A.setText("Port: " + ((k8.c) this.f24336i.get(i10)).c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b((w1) g.d(LayoutInflater.from(viewGroup.getContext()), R.layout.view_wol_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f24336i.size();
    }
}
