package l8;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public class v1 extends u1 {

    /* renamed from: y, reason: collision with root package name */
    public static final ViewDataBinding.i f23343y = null;

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f23344z = null;

    /* renamed from: x, reason: collision with root package name */
    public long f23345x;

    public v1(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 1, f23343y, f23344z));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.f23345x = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.f23345x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.f23345x = 1L;
        }
        F();
    }

    public v1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Toolbar) objArr[0]);
        this.f23345x = -1L;
        this.f23339w.setTag(null);
        H(view);
        z();
    }
}
