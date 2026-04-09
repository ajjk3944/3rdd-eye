package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class v0 extends u0 {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public static final ViewDataBinding.i f23340z = null;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f23341x;

    /* renamed from: y, reason: collision with root package name */
    public long f23342y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.prompt_edit_text, 1);
    }

    public v0(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 2, f23340z, A));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.f23342y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.f23342y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.f23342y = 1L;
        }
        F();
    }

    public v0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (EditText) objArr[1]);
        this.f23342y = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f23341x = linearLayout;
        linearLayout.setTag(null);
        H(view);
        z();
    }
}
