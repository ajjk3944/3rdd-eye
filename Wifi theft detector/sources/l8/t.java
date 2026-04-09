package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class t extends s {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public final RelativeLayout E;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        G = iVar;
        iVar.a(0, new String[]{"view_title"}, new int[]{1}, new int[]{R.layout.view_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.lv_ping_input, 2);
        sparseIntArray.put(R.id.edit_ping, 3);
        sparseIntArray.put(R.id.pbar_loading, 4);
        sparseIntArray.put(R.id.btn_ping, 5);
        sparseIntArray.put(R.id.tv_content_tip, 6);
        sparseIntArray.put(R.id.sv_ping_content, 7);
        sparseIntArray.put(R.id.lv_ping_content, 8);
    }

    public t(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 9, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.F = 0L;
        }
        ViewDataBinding.s(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.D.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.F = 2L;
        }
        this.D.z();
        F();
    }

    public t(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (Button) objArr[5], (EditText) objArr[3], (LinearLayout) objArr[8], (RelativeLayout) objArr[2], (ProgressBar) objArr[4], (ScrollView) objArr[7], (TextView) objArr[6], (u1) objArr[1]);
        this.F = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.E = relativeLayout;
        relativeLayout.setTag(null);
        G(this.D);
        H(view);
        z();
    }
}
