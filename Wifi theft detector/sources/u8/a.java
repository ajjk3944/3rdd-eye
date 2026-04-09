package u8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import androidx.fragment.app.Fragment;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;

/* loaded from: classes3.dex */
public abstract class a<T extends ViewDataBinding> extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public ViewDataBinding f24548a;

    /* renamed from: b, reason: collision with root package name */
    public BaseActivity f24549b;

    public abstract int f();

    public abstract void g(Bundle bundle);

    public abstract void h();

    public abstract void i();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f24549b == null) {
            this.f24549b = (BaseActivity) getActivity();
        }
        if (this.f24548a == null) {
            this.f24548a = g.d(layoutInflater, f(), viewGroup, false);
            h();
            g(bundle);
            i();
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f24548a.x().getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f24548a.x());
        }
        return this.f24548a.x();
    }
}
