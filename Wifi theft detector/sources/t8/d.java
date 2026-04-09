package t8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.g;
import androidx.fragment.app.Fragment;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.h;
import g8.s;
import l8.i1;

/* loaded from: classes3.dex */
public class d extends Fragment implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public i1 f24461a;

    public class a implements m8.a {
        public a() {
        }

        @Override // m8.a
        public void a(boolean z10) {
            h.k(d.this.getContext(), true, false);
        }
    }

    private void f() {
        this.f24461a.E.setOnClickListener(this);
        this.f24461a.D.setOnClickListener(this);
        this.f24461a.A.setOnClickListener(this);
        this.f24461a.f23269z.setOnClickListener(this);
        this.f24461a.B.setOnClickListener(this);
        this.f24461a.C.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.tv_wifi_list) {
            s.z(getContext());
        }
        switch (view.getId()) {
            case R.id.tv_ping /* 2131231671 */:
                h.h(getContext());
                break;
            case R.id.tv_router_manager /* 2131231677 */:
                h.j(getContext(), true);
                break;
            case R.id.tv_wake_on_lan /* 2131231707 */:
                h.o(getContext());
                break;
            case R.id.tv_whois /* 2131231708 */:
                h.p(getContext());
                break;
            case R.id.tv_wifi_scan /* 2131231720 */:
                s.d(getActivity(), new a());
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f24461a = (i1) g.d(layoutInflater, R.layout.fragment_tools, viewGroup, false);
        f();
        if (s.t()) {
            this.f24461a.f23268y.setVisibility(8);
        }
        return this.f24461a.x();
    }
}
