package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class l extends k {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E;
    public final LinearLayout B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.title_bar, 1);
        sparseIntArray.put(R.id.iv_delete_all, 2);
        sparseIntArray.put(R.id.history_rlistview, 3);
        sparseIntArray.put(R.id.ll_empty_bg, 4);
        sparseIntArray.put(R.id.title_shadow, 5);
    }

    public l(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 6, D, E));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.C = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.C = 1L;
        }
        F();
    }

    public l(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RecyclerView) objArr[3], (ImageView) objArr[2], (LinearLayout) objArr[4], (Toolbar) objArr[1], (View) objArr[5]);
        this.C = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.B = linearLayout;
        linearLayout.setTag(null);
        H(view);
        z();
    }
}
