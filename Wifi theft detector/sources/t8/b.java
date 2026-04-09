package t8;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.f;
import java.util.ArrayList;
import l8.e1;

/* loaded from: classes3.dex */
public class b extends u8.a<e1> implements View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    public s8.b f24433c;

    @Override // u8.a
    public int f() {
        return R.layout.fragment_history;
    }

    @Override // u8.a
    public void g(Bundle bundle) {
        j();
    }

    public void j() {
        BaseActivity baseActivity = this.f24549b;
        if (baseActivity == null) {
            return;
        }
        ArrayList arrayListA = f.a(baseActivity);
        if (arrayListA == null || arrayListA.size() == 0) {
            ((e1) this.f24548a).f23243x.setVisibility(0);
            ((e1) this.f24548a).f23242w.setVisibility(8);
            return;
        }
        ((e1) this.f24548a).f23243x.setVisibility(8);
        ((e1) this.f24548a).f23242w.setVisibility(0);
        this.f24433c = new s8.b(this.f24549b, arrayListA);
        ((e1) this.f24548a).f23242w.setLayoutManager(new LinearLayoutManager(this.f24549b));
        ((e1) this.f24548a).f23242w.setAdapter(this.f24433c);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
        if (z10) {
            j();
        }
    }

    @Override // u8.a
    public void h() {
    }

    @Override // u8.a
    public void i() {
    }
}
