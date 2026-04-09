package l8;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public abstract class q extends ViewDataBinding {
    public final u1 A;
    public final ViewPager B;

    /* renamed from: w, reason: collision with root package name */
    public final FrameLayout f23310w;

    /* renamed from: x, reason: collision with root package name */
    public final DrawerLayout f23311x;

    /* renamed from: y, reason: collision with root package name */
    public final NavigationView f23312y;

    /* renamed from: z, reason: collision with root package name */
    public final TabLayout f23313z;

    public q(Object obj, View view, int i10, FrameLayout frameLayout, DrawerLayout drawerLayout, NavigationView navigationView, TabLayout tabLayout, u1 u1Var, ViewPager viewPager) {
        super(obj, view, i10);
        this.f23310w = frameLayout;
        this.f23311x = drawerLayout;
        this.f23312y = navigationView;
        this.f23313z = tabLayout;
        this.A = u1Var;
        this.B = viewPager;
    }
}
