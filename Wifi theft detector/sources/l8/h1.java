package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class h1 extends g1 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public final RelativeLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.webview_router, 1);
        sparseIntArray.put(R.id.rl_loading_page, 2);
        sparseIntArray.put(R.id.sv_web_fail_page, 3);
        sparseIntArray.put(R.id.ll_web_fail_page, 4);
        sparseIntArray.put(R.id.cv_router_notice, 5);
        sparseIntArray.put(R.id.tv_router_notice, 6);
    }

    public h1(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 7, E, F));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.D = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.D = 1L;
        }
        F();
    }

    public h1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CardView) objArr[5], (LinearLayout) objArr[4], (RelativeLayout) objArr[2], (ScrollView) objArr[3], (TextView) objArr[6], (WebView) objArr[1]);
        this.D = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.C = relativeLayout;
        relativeLayout.setTag(null);
        H(view);
        z();
    }
}
