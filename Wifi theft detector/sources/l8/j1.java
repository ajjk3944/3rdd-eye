package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.detector.mvp.view.widget.MoreToolsView;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class j1 extends i1 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ScrollView F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.lv_line_one, 1);
        sparseIntArray.put(R.id.tv_wifi_scan, 2);
        sparseIntArray.put(R.id.tv_router_manager, 3);
        sparseIntArray.put(R.id.tv_wifi_list, 4);
        sparseIntArray.put(R.id.lv_line_two, 5);
        sparseIntArray.put(R.id.tv_ping, 6);
        sparseIntArray.put(R.id.tv_wake_on_lan, 7);
        sparseIntArray.put(R.id.tv_whois, 8);
        sparseIntArray.put(R.id.mv_tools, 9);
    }

    public j1(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 10, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.G = 1L;
        }
        F();
    }

    public j1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (LinearLayout) objArr[1], (LinearLayout) objArr[5], (MoreToolsView) objArr[9], (TextView) objArr[6], (TextView) objArr[3], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[4], (TextView) objArr[2]);
        this.G = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.F = scrollView;
        scrollView.setTag(null);
        H(view);
        z();
    }
}
