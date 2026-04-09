package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class r1 extends q1 {
    public static final ViewDataBinding.i B = null;
    public static final SparseIntArray C;
    public long A;

    /* renamed from: z, reason: collision with root package name */
    public final CardView f23321z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.btn_empty_folder_cleaner, 1);
        sparseIntArray.put(R.id.btn_duplicate_file, 2);
        sparseIntArray.put(R.id.btn_junk_cleaner, 3);
    }

    public r1(androidx.databinding.f fVar, View view) {
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

    public r1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Button) objArr[2], (Button) objArr[1], (Button) objArr[3]);
        this.A = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f23321z = cardView;
        cardView.setTag(null);
        H(view);
        z();
    }
}
