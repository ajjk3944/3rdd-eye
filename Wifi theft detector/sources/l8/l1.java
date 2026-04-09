package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class l1 extends k1 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public final LinearLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.edit_whois, 1);
        sparseIntArray.put(R.id.pbar_loading, 2);
        sparseIntArray.put(R.id.btn_whois, 3);
        sparseIntArray.put(R.id.tv_content_tip, 4);
        sparseIntArray.put(R.id.sv_content, 5);
        sparseIntArray.put(R.id.tv_content, 6);
    }

    public l1(androidx.databinding.f fVar, View view) {
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

    public l1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Button) objArr[3], (AutoCompleteTextView) objArr[1], (ProgressBar) objArr[2], (ScrollView) objArr[5], (TextView) objArr[6], (TextView) objArr[4]);
        this.D = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.C = linearLayout;
        linearLayout.setTag(null);
        H(view);
        z();
    }
}
