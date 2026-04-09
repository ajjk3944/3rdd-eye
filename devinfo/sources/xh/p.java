package xh;

import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.tests.TestesActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class p extends hg.d {
    public wh.a Z;

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        wd.b bVarR = ((TestesActivity) U()).r();
        if (bVarR != null) {
            bVarR.y();
        }
        if (c0()) {
            return;
        }
        com.liuzh.deviceinfo.utilities.d.d(U());
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.Z == null) {
            wh.a aVar = new wh.a(layoutInflater.getContext());
            Paint paint = new Paint(1);
            aVar.f36738a = paint;
            aVar.f36739b = new SparseArray();
            Paint paint2 = new Paint(1);
            aVar.f36740c = paint2;
            aVar.f36741d = new SparseArray();
            aVar.f36742e = 0;
            aVar.f36743f = aVar.getResources().getString(R.string.max) + ": 0";
            aVar.g = aVar.getResources().getString(R.string.current) + ": 0";
            PointF pointF = new PointF();
            aVar.f36745i = pointF;
            aVar.setBackgroundColor(-16777216);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-1);
            paint.setStrokeWidth(com.liuzh.deviceinfo.utilities.d.p(50.0f, aVar.getResources().getDisplayMetrics()));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint2.setTextSize(40.0f);
            paint2.setColor(-1);
            Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
            aVar.f36744h = fontMetrics.bottom - fontMetrics.top;
            float fP = com.liuzh.deviceinfo.utilities.d.p(42.0f, aVar.getResources().getDisplayMetrics());
            pointF.x = fP;
            pointF.y = fP;
            this.Z = aVar;
        }
        return this.Z;
    }

    @Override // hg.d
    public final void g0(boolean z3) {
        if (c0()) {
            return;
        }
        com.liuzh.deviceinfo.utilities.d.d(U());
    }
}
