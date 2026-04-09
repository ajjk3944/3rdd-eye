package ru.andr7e.siminfo;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ru.andr7e.simcellinfo.R;
import ru.andr7e.siminfo.d;

/* loaded from: classes.dex */
public class g extends RecyclerView.g<c> {

    /* renamed from: c, reason: collision with root package name */
    private List<ru.andr7e.siminfo.b> f3276c;

    /* renamed from: d, reason: collision with root package name */
    private final d.c f3277d;

    class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f3278b;

        a(c cVar) {
            this.f3278b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iJ;
            if (g.this.f3277d == null || (iJ = this.f3278b.j()) == -1) {
                return;
            }
            g.this.f3277d.k((ru.andr7e.siminfo.b) g.this.f3276c.get(iJ));
        }
    }

    class b implements View.OnLongClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f3280b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f3281c;

        b(c cVar, Context context) {
            this.f3280b = cVar;
            this.f3281c = context;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) throws Resources.NotFoundException {
            int iJ = this.f3280b.j();
            boolean zA = n0.b.a(MyApplication.e().f());
            if (iJ != -1 && this.f3281c != null && zA) {
                ru.andr7e.siminfo.b bVar = (ru.andr7e.siminfo.b) g.this.f3276c.get(iJ);
                StringBuilder sb = new StringBuilder();
                f.C(bVar, sb);
                String string = sb.toString();
                if (!string.isEmpty()) {
                    String string2 = this.f3281c.getResources().getString(R.string.copied_to_clipboard);
                    i0.a.a(this.f3281c, string);
                    Toast.makeText(this.f3281c, string2 + "\n" + string, 1).show();
                }
            }
            return true;
        }
    }

    public class c extends RecyclerView.d0 {

        /* renamed from: t, reason: collision with root package name */
        public final TextView f3283t;

        /* renamed from: u, reason: collision with root package name */
        public final TextView f3284u;

        /* renamed from: v, reason: collision with root package name */
        public final ImageView f3285v;

        /* renamed from: w, reason: collision with root package name */
        public final ImageView f3286w;

        public c(View view) {
            super(view);
            this.f3283t = (TextView) view.findViewById(R.id.item_number);
            this.f3284u = (TextView) view.findViewById(R.id.content);
            this.f3285v = (ImageView) view.findViewById(R.id.connectImageView);
            this.f3286w = (ImageView) view.findViewById(R.id.connectSecondaryImageView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.d0
        public String toString() {
            return super.toString() + " '" + ((Object) this.f3284u.getText()) + "'";
        }
    }

    public g(List<ru.andr7e.siminfo.b> list, d.c cVar) {
        this.f3276c = list;
        this.f3277d = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f3276c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void i(c cVar, int i2) {
        ru.andr7e.siminfo.b bVar = this.f3276c.get(i2);
        StringBuilder sb = new StringBuilder();
        f.D(bVar, sb, true);
        String string = sb.toString();
        sb.setLength(0);
        f.B(bVar, sb);
        String string2 = sb.toString();
        cVar.f3283t.setText(string);
        cVar.f3284u.setText(string2);
        boolean z2 = bVar.f3245i;
        boolean z3 = bVar.f3246j;
        cVar.f3285v.setVisibility(i0.b.d(z2));
        cVar.f3286w.setVisibility(i0.b.d(z3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public c k(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_neighbor_item, viewGroup, false);
        c cVar = new c(viewInflate);
        viewInflate.setOnClickListener(new a(cVar));
        viewInflate.setOnLongClickListener(new b(cVar, viewGroup.getContext()));
        return cVar;
    }

    public void w(List<ru.andr7e.siminfo.b> list) {
        this.f3276c = list;
    }
}
