package sh;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a1 extends androidx.recyclerview.widget.b1 {
    @Override // androidx.recyclerview.widget.b1
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, t1 t1Var) throws Resources.NotFoundException {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.content_padding_half);
        rect.left = dimensionPixelSize;
        rect.top = dimensionPixelSize;
        rect.right = dimensionPixelSize;
        rect.bottom = dimensionPixelSize;
    }
}
