package h4;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24869a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Object f24870b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24871c;

    public /* synthetic */ e(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f24869a) {
            case 0:
                g gVar = (g) this.f24871c;
                Drawable background = ((ViewGroup) this.f24870b).getBackground();
                int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
                if (gVar.f24878e != color) {
                    gVar.f24878e = color;
                    for (int size = gVar.f24875b.size() - 1; size >= 0; size--) {
                        ((c) gVar.f24875b.get(size)).b(color);
                    }
                    break;
                }
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.f24869a) {
            case 1:
                canvas.drawPath((Path) this.f24870b, (Paint) this.f24871c);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f24869a) {
            case 1:
                Path path = (Path) this.f24870b;
                int action = motionEvent.getAction();
                if (action == 0) {
                    path.moveTo(motionEvent.getX(), motionEvent.getY());
                } else if (action == 2) {
                    path.lineTo(motionEvent.getX(), motionEvent.getY());
                }
                invalidate();
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.f24871c = gVar;
        this.f24870b = viewGroup;
    }
}
