package L3;

import U4.p;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.G;
import androidx.viewpager2.widget.ViewPager2;
import com.apm.insight.R;
import com.google.android.material.tabs.TabLayout;
import com.lefan.signal.ui.phone.PhoneFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final TabLayout f2604a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f2605b;

    /* renamed from: c, reason: collision with root package name */
    public final p f2606c;

    /* renamed from: d, reason: collision with root package name */
    public G f2607d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2608e;

    public m(TabLayout tabLayout, ViewPager2 viewPager2, p pVar) {
        this.f2604a = tabLayout;
        this.f2605b = viewPager2;
        this.f2606c = pVar;
    }

    public final void a() {
        if (this.f2608e) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager2 = this.f2605b;
        G adapter = viewPager2.getAdapter();
        this.f2607d = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f2608e = true;
        TabLayout tabLayout = this.f2604a;
        ((ArrayList) viewPager2.f5647c.f3378b).add(new k(tabLayout));
        l lVar = new l(viewPager2);
        ArrayList arrayList = tabLayout.f18475c0;
        if (!arrayList.contains(lVar)) {
            arrayList.add(lVar);
        }
        this.f2607d.registerAdapterDataObserver(new j(0, this));
        b();
        tabLayout.h(viewPager2.getCurrentItem(), 0.0f, true, true, true);
    }

    public final void b() {
        int iMin;
        String str;
        String str2;
        TabLayout tabLayout = this.f2604a;
        ArrayList arrayList = tabLayout.f18473b;
        tabLayout.f();
        G g2 = this.f2607d;
        if (g2 == null) {
            return;
        }
        int itemCount = g2.getItemCount();
        int i = 0;
        while (true) {
            g gVar = null;
            if (i >= itemCount) {
                if (itemCount <= 0 || (iMin = Math.min(this.f2605b.getCurrentItem(), tabLayout.getTabCount() - 1)) == tabLayout.getSelectedTabPosition()) {
                    return;
                }
                if (iMin >= 0 && iMin < tabLayout.getTabCount()) {
                    gVar = (g) arrayList.get(iMin);
                }
                tabLayout.g(gVar, true);
                return;
            }
            g gVarE = tabLayout.e();
            p pVar = this.f2606c;
            int i3 = pVar.f3759a;
            PhoneFragment phoneFragment = pVar.f3760b;
            switch (i3) {
                case 0:
                    String strR = phoneFragment.r(R.string.sim);
                    q5.i.d(strR, "getString(...)");
                    Integer numValueOf = Integer.valueOf(i + 1);
                    if (R2.a.f3390d) {
                        Locale locale = F4.e.f1457a;
                        str = String.format(F4.e.b(), strR, Arrays.copyOf(new Object[]{numValueOf}, 1));
                    } else {
                        str = String.format(Locale.ENGLISH, strR, Arrays.copyOf(new Object[]{numValueOf}, 1));
                    }
                    if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(str)) {
                        gVarE.f2584e.setContentDescription(str);
                    }
                    gVarE.f2580a = str;
                    i iVar = gVarE.f2584e;
                    if (iVar != null) {
                        iVar.d();
                        break;
                    }
                    break;
                default:
                    String strR2 = phoneFragment.r(R.string.sim);
                    q5.i.d(strR2, "getString(...)");
                    Integer numValueOf2 = Integer.valueOf(i + 1);
                    if (R2.a.f3390d) {
                        Locale locale2 = F4.e.f1457a;
                        str2 = String.format(F4.e.b(), strR2, Arrays.copyOf(new Object[]{numValueOf2}, 1));
                    } else {
                        str2 = String.format(Locale.ENGLISH, strR2, Arrays.copyOf(new Object[]{numValueOf2}, 1));
                    }
                    if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(str2)) {
                        gVarE.f2584e.setContentDescription(str2);
                    }
                    gVarE.f2580a = str2;
                    i iVar2 = gVarE.f2584e;
                    if (iVar2 != null) {
                        iVar2.d();
                        break;
                    }
                    break;
            }
            int size = arrayList.size();
            if (gVarE.f2583d != tabLayout) {
                throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
            }
            gVarE.f2581b = size;
            arrayList.add(size, gVarE);
            int size2 = arrayList.size();
            int i6 = -1;
            for (int i7 = size + 1; i7 < size2; i7++) {
                if (((g) arrayList.get(i7)).f2581b == tabLayout.f18471a) {
                    i6 = i7;
                }
                ((g) arrayList.get(i7)).f2581b = i7;
            }
            tabLayout.f18471a = i6;
            i iVar3 = gVarE.f2584e;
            iVar3.setSelected(false);
            iVar3.setActivated(false);
            f fVar = tabLayout.f18476d;
            int i8 = gVarE.f2581b;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (tabLayout.f18464Q == 1 && tabLayout.f18461N == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            fVar.addView(iVar3, i8, layoutParams);
            i++;
        }
    }
}
