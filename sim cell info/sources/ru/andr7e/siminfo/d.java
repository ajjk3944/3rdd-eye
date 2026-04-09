package ru.andr7e.siminfo;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.andr7e.simcellinfo.R;

/* loaded from: classes.dex */
public class d extends Fragment {
    private int Z = 1;

    /* renamed from: a0, reason: collision with root package name */
    e f3262a0;

    /* renamed from: b0, reason: collision with root package name */
    private c f3263b0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyApplication.e().a();
            d.this.q1();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (ru.andr7e.siminfo.b bVar : MyApplication.e().c()) {
                if (i2 > 0) {
                    sb.append("\n");
                }
                sb.append("\n");
                f.j(bVar, sb, " ");
                sb.append("\n");
                f.i(bVar, sb, false);
                i2++;
            }
            String string = sb.toString();
            Context contextP = d.this.p();
            if (string.isEmpty() || contextP == null) {
                return;
            }
            String string2 = contextP.getResources().getString(R.string.copied_to_clipboard);
            i0.a.a(contextP, string);
            Toast.makeText(contextP, string2 + "\n" + string, 1).show();
        }
    }

    public interface c {
        void k(ru.andr7e.siminfo.b bVar);
    }

    private void o1(View view) {
        ((Button) view.findViewById(R.id.clearButton)).setOnClickListener(new a());
        Button button = (Button) view.findViewById(R.id.copyButton);
        button.setVisibility(i0.b.d(n0.b.d(MyApplication.e().f())));
        button.setOnClickListener(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void X(Context context) {
        super.X(context);
        if (context instanceof c) {
            this.f3263b0 = (c) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnListFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void a0(Bundle bundle) {
        super.a0(bundle);
        if (n() != null) {
            this.Z = n().getInt("column-count");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_item_list, viewGroup, false);
        if (viewInflate instanceof RecyclerView) {
            p1(viewInflate);
        } else {
            p1(viewInflate.findViewById(R.id.list));
        }
        o1(viewInflate);
        return viewInflate;
    }

    void p1(View view) {
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            int i2 = this.Z;
            if (i2 <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, i2));
            }
            e eVar = new e(MyApplication.e().c(), this.f3263b0);
            this.f3262a0 = eVar;
            recyclerView.setAdapter(eVar);
        }
    }

    public void q1() {
        this.f3262a0.w(MyApplication.e().c());
        this.f3262a0.g();
    }
}
