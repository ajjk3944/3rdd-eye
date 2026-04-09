package jd;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import p.b2;
import p.b3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27500b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f27499a = i4;
        this.f27500b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f27499a) {
            case 0:
                ((TabLayout) this.f27500b).g();
                break;
            case 1:
                b3 b3Var = (b3) this.f27500b;
                b3Var.f27924a = true;
                b3Var.notifyDataSetChanged();
                break;
            case 2:
                ((ViewPager) this.f27500b).e();
                break;
            default:
                b2 b2Var = (b2) this.f27500b;
                if (b2Var.f30654z.isShowing()) {
                    b2Var.show();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f27499a) {
            case 0:
                ((TabLayout) this.f27500b).g();
                break;
            case 1:
                b3 b3Var = (b3) this.f27500b;
                b3Var.f27924a = false;
                b3Var.notifyDataSetInvalidated();
                break;
            case 2:
                ((ViewPager) this.f27500b).e();
                break;
            default:
                ((b2) this.f27500b).dismiss();
                break;
        }
    }
}
