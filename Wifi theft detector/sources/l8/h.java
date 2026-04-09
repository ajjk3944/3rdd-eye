package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class h extends g {
    public static final ViewDataBinding.i A = null;
    public static final SparseIntArray B;

    /* renamed from: y, reason: collision with root package name */
    public final RelativeLayout f23258y;

    /* renamed from: z, reason: collision with root package name */
    public long f23259z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.cv_use_intro, 1);
        sparseIntArray.put(R.id.cv_start, 2);
    }

    public h(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 3, A, B));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.f23259z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.f23259z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.f23259z = 1L;
        }
        F();
    }

    public h(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CardView) objArr[2], (CardView) objArr[1]);
        this.f23259z = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f23258y = relativeLayout;
        relativeLayout.setTag(null);
        H(view);
        z();
    }
}
