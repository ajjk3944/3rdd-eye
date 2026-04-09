package t8;

import android.R;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.databinding.g;
import androidx.fragment.app.Fragment;
import com.wifihacker.detector.common.util.SystemUtil;
import g8.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l8.k1;

/* loaded from: classes3.dex */
public class e extends Fragment implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public k1 f24463a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f24464b;

    public class a extends j8.b {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r22) {
            super.onPostExecute(r22);
            e.this.f24463a.f23280y.setVisibility(8);
        }

        @Override // android.os.AsyncTask
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(String... strArr) {
            super.onProgressUpdate(strArr);
            for (String str : strArr) {
                e.this.f24463a.A.append(str);
            }
        }
    }

    private void h(String str) {
        new a().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
    }

    private void l() {
        this.f24463a.f23278w.setOnClickListener(this);
    }

    public final void g(String str) {
        if (this.f24464b.contains(str)) {
            return;
        }
        this.f24464b.add(str);
        k(this.f24464b);
        ((ArrayAdapter) this.f24463a.f23279x.getAdapter()).add(str);
    }

    public final ArrayList i() {
        String strF = o.c().f(getContext(), "whois_query", null);
        return !TextUtils.isEmpty(strF) ? new ArrayList(Arrays.asList(strF.split("##"))) : new ArrayList();
    }

    public final void j() {
        this.f24464b = i();
        this.f24463a.f23279x.setAdapter(new ArrayAdapter(getContext(), R.layout.simple_list_item_1, this.f24464b));
    }

    public final void k(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb.append((String) list.get(i10));
            if (i10 < list.size() - 1) {
                sb.append("##");
            }
        }
        o.c().q(getContext(), "whois_query", sb.toString());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f24463a.B.setVisibility(8);
        this.f24463a.f23281z.setVisibility(0);
        this.f24463a.A.setText("");
        SystemUtil.b(getActivity(), this.f24463a.f23279x, false);
        String string = this.f24463a.f23279x.getText().toString();
        if (TextUtils.isEmpty(string)) {
            this.f24463a.f23279x.setError(getString(com.wifihacker.whousemywifi.wifirouter.wifisecurity.R.string.whois_null_tip));
            return;
        }
        this.f24463a.f23280y.setVisibility(0);
        g(string);
        h(string);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f24463a = (k1) g.d(layoutInflater, com.wifihacker.whousemywifi.wifirouter.wifisecurity.R.layout.fragment_whois, viewGroup, false);
        l();
        j();
        return this.f24463a.x();
    }
}
