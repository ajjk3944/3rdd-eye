package ig;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.t1;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.CpuStatusCard;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25969a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f25970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25971c;

    public c(int i4, int i10) {
        this.f25970b = i4;
        this.f25971c = i10;
    }

    @Override // androidx.recyclerview.widget.b1
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, t1 t1Var) {
        switch (this.f25969a) {
            case 0:
                int iN = RecyclerView.N(view);
                if (iN != -1) {
                    int i4 = this.f25971c;
                    int i10 = iN % i4;
                    int i11 = this.f25970b;
                    if (i10 == 0) {
                        rect.right = i11;
                    } else if (i10 == i4 - 1) {
                        rect.left = i11;
                    } else {
                        rect.left = i11;
                        rect.right = i11;
                    }
                    rect.top = i11;
                    rect.bottom = i11;
                    break;
                }
                break;
            default:
                nk.k.e(rect, "outRect");
                nk.k.e(view, "view");
                nk.k.e(t1Var, "state");
                int i12 = this.f25970b;
                int i13 = i12 / 2;
                rect.top = i13;
                rect.bottom = i13;
                if (this.f25971c != 1) {
                    if (RecyclerView.N(view) % 2 != 0) {
                        rect.left = i13;
                        rect.right = i12;
                        break;
                    } else {
                        rect.left = i12;
                        rect.right = i13;
                        break;
                    }
                } else {
                    rect.left = i12;
                    rect.right = i12;
                    break;
                }
        }
    }

    public c(CpuStatusCard cpuStatusCard, int i4) {
        this.f25971c = i4;
        this.f25970b = cpuStatusCard.getContext().getResources().getDimensionPixelSize(R.dimen.content_padding) / 2;
    }
}
