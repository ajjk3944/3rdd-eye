package od;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import h7.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f19290a;

    /* renamed from: b, reason: collision with root package name */
    public final List f19291b;

    public b() {
        Paint paint = new Paint();
        this.f19290a = paint;
        this.f19291b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // h7.w0
    public final void e(Canvas canvas, RecyclerView recyclerView) throws Resources.NotFoundException {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(ed.d.m3_carousel_debug_keyline_width);
        Paint paint = this.f19290a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f19291b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = k3.c.f14012a;
            float f10 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f10)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f10)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f10)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f10))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).E0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5563q.m(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5563q.i(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f5563q.j(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5563q.k(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
