package n3;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import com.apm.insight.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2688a extends M {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f22323a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22324b;

    public C2688a() {
        Paint paint = new Paint();
        this.f22323a = paint;
        this.f22324b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.M
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, d0 d0Var) throws Resources.NotFoundException {
        Canvas canvas2;
        super.onDrawOver(canvas, recyclerView, d0Var);
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f22323a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f22324b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).getClass();
            paint.setColor(J.a.b(0.0f, -65281, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).e()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f18213b.g(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f18213b.c(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f18213b.d(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f18213b.e(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
