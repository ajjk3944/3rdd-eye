package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class r extends q {
    public static final ViewDataBinding.i E;
    public static final SparseIntArray F;
    public final LinearLayout C;
    public long D;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(7);
        E = iVar;
        iVar.a(1, new String[]{"view_title"}, new int[]{2}, new int[]{R.layout.view_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.tab_main, 3);
        sparseIntArray.put(R.id.vp_main, 4);
        sparseIntArray.put(R.id.fl_container, 5);
        sparseIntArray.put(R.id.main_navigationview, 6);
    }

    public r(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 7, E, F));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.D = 0L;
        }
        ViewDataBinding.s(this.A);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.A.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.D = 2L;
        }
        this.A.z();
        F();
    }

    public r(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (FrameLayout) objArr[5], (DrawerLayout) objArr[0], (NavigationView) objArr[6], (TabLayout) objArr[3], (u1) objArr[2], (ViewPager) objArr[4]);
        this.D = -1L;
        this.f23311x.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.C = linearLayout;
        linearLayout.setTag(null);
        G(this.A);
        H(view);
        z();
    }
}
