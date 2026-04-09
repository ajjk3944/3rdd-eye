package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class f1 extends e1 {
    public static final ViewDataBinding.i B = null;
    public static final SparseIntArray C;
    public long A;

    /* renamed from: z, reason: collision with root package name */
    public final RelativeLayout f23247z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.history_rlistview, 1);
        sparseIntArray.put(R.id.ll_empty_bg, 2);
        sparseIntArray.put(R.id.title_shadow, 3);
    }

    public f1(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 4, B, C));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.A = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.A = 1L;
        }
        F();
    }

    public f1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RecyclerView) objArr[1], (LinearLayout) objArr[2], (View) objArr[3]);
        this.A = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f23247z = relativeLayout;
        relativeLayout.setTag(null);
        H(view);
        z();
    }
}
