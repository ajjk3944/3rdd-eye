package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class OverlayView extends View {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f22183b;

    public interface a {
        void a(Canvas canvas);
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22183b = new LinkedList();
    }

    @Override // android.view.View
    public final synchronized void draw(Canvas canvas) {
        super.draw(canvas);
        Iterator it = this.f22183b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(canvas);
        }
    }
}
