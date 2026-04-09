package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class d1 extends c1 {
    public static final ViewDataBinding.i B = null;
    public static final SparseIntArray C;
    public long A;

    /* renamed from: z, reason: collision with root package name */
    public final ScrollView f23235z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.lv_line_one, 1);
        sparseIntArray.put(R.id.lv_line_two, 2);
        sparseIntArray.put(R.id.fl_ad_container, 3);
    }

    public d1(androidx.databinding.f fVar, View view) {
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

    public d1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (FrameLayout) objArr[3], (LinearLayout) objArr[1], (LinearLayout) objArr[2]);
        this.A = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f23235z = scrollView;
        scrollView.setTag(null);
        H(view);
        z();
    }
}
