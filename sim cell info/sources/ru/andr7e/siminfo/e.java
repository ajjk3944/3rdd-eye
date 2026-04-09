package ru.andr7e.siminfo;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ru.andr7e.simcellinfo.R;
import ru.andr7e.siminfo.d;

/* loaded from: classes.dex */
public class e extends RecyclerView.g<c> {

    /* renamed from: c, reason: collision with root package name */
    private List<ru.andr7e.siminfo.b> f3266c;

    /* renamed from: d, reason: collision with root package name */
    private final d.c f3267d;

    class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f3268b;

        a(c cVar) {
            this.f3268b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iJ;
            if (e.this.f3267d == null || (iJ = this.f3268b.j()) == -1) {
                return;
            }
            e.this.f3267d.k((ru.andr7e.siminfo.b) e.this.f3266c.get(iJ));
        }
    }

    class b implements View.OnLongClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f3270b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f3271c;

        b(c cVar, Context context) {
            this.f3270b = cVar;
            this.f3271c = context;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) throws Resources.NotFoundException {
            int iJ = this.f3270b.j();
            boolean zA = n0.b.a(MyApplication.e().f());
            if (iJ != -1 && this.f3271c != null && zA) {
                ru.andr7e.siminfo.b bVar = (ru.andr7e.siminfo.b) e.this.f3266c.get(iJ);
                StringBuilder sb = new StringBuilder();
                f.j(bVar, sb, " ");
                sb.append("\n");
                f.i(bVar, sb, false);
                String string = sb.toString();
                if (!string.isEmpty()) {
                    String string2 = this.f3271c.getResources().getString(R.string.copied_to_clipboard);
                    i0.a.a(this.f3271c, string);
                    Toast.makeText(this.f3271c, string2 + "\n" + string, 1).show();
                }
            }
            return true;
        }
    }

    public class c extends RecyclerView.d0 {

        /* renamed from: t, reason: collision with root package name */
        public final TextView f3273t;

        /* renamed from: u, reason: collision with root package name */
        public final TextView f3274u;

        public c(View view) {
            super(view);
            this.f3273t = (TextView) view.findViewById(R.id.item_number);
            this.f3274u = (TextView) view.findViewById(R.id.content);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.d0
        public String toString() {
            return super.toString() + " '" + ((Object) this.f3274u.getText()) + "'";
        }
    }

    public e(List<ru.andr7e.siminfo.b> list, d.c cVar) {
        this.f3266c = list;
        this.f3267d = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f3266c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void i(c cVar, int i2) {
        ru.andr7e.siminfo.b bVar = this.f3266c.get(i2);
        StringBuilder sb = new StringBuilder();
        f.j(bVar, sb, "\n");
        String string = sb.toString();
        sb.setLength(0);
        f.i(bVar, sb, false);
        String string2 = sb.toString();
        cVar.f3273t.setText(string);
        cVar.f3274u.setText(string2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public c k(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_item, viewGroup, false);
        c cVar = new c(viewInflate);
        viewInflate.setOnClickListener(new a(cVar));
        viewInflate.setOnLongClickListener(new b(cVar, viewGroup.getContext()));
        return cVar;
    }

    public void w(List<ru.andr7e.siminfo.b> list) {
        this.f3266c = list;
    }
}
