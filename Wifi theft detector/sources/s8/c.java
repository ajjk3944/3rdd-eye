package s8;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.x;
import java.util.List;

/* loaded from: classes3.dex */
public class c extends x {

    /* renamed from: h, reason: collision with root package name */
    public List f24334h;

    /* renamed from: i, reason: collision with root package name */
    public List f24335i;

    public c(FragmentManager fragmentManager, List list, List list2) {
        super(fragmentManager);
        this.f24334h = list;
        this.f24335i = list2;
    }

    @Override // androidx.fragment.app.x
    public Fragment a(int i10) {
        List list = this.f24334h;
        if (list == null) {
            return null;
        }
        return (Fragment) list.get(i10);
    }

    public Fragment b(int i10) {
        return (Fragment) this.f24334h.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List list = this.f24334h;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        List list = this.f24335i;
        if (list == null) {
            return null;
        }
        return (CharSequence) list.get(i10);
    }
}
