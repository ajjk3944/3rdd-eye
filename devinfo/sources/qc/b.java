package qc;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.t1;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.liuzh.deviceinfo.R;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f32234a;

    /* renamed from: b, reason: collision with root package name */
    public final List f32235b;

    public b() {
        Paint paint = new Paint();
        this.f32234a = paint;
        this.f32235b = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, t1 t1Var) throws Resources.NotFoundException {
        Canvas canvas2;
        super.onDrawOver(canvas, recyclerView, t1Var);
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f32234a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f32235b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = v3.a.f35791a;
            float f10 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f10)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f10)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f10)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f10))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).e()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f20410b.e(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f20410b.a(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f20410b.b(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f20410b.c(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
