package ie;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import p.t1;

/* loaded from: classes.dex */
public final class e extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11342b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f11341a = i10;
        this.f11342b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f11341a) {
            case 0:
                ((TabLayout) this.f11342b).e();
                break;
            case 1:
                t1 t1Var = (t1) this.f11342b;
                if (t1Var.V.isShowing()) {
                    t1Var.g();
                    break;
                }
                break;
            default:
                ((ViewPager) this.f11342b).e();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f11341a) {
            case 0:
                ((TabLayout) this.f11342b).e();
                break;
            case 1:
                ((t1) this.f11342b).dismiss();
                break;
            default:
                ((ViewPager) this.f11342b).e();
                break;
        }
    }
}
