package u9;

import android.view.GestureDetector;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public int f35212a = 0;

    /* renamed from: b, reason: collision with root package name */
    public q9.b f35213b;

    /* renamed from: c, reason: collision with root package name */
    public final GestureDetector f35214c;

    /* renamed from: d, reason: collision with root package name */
    public final m9.b f35215d;

    public b(m9.b bVar) {
        this.f35215d = bVar;
        this.f35214c = new GestureDetector(bVar.getContext(), this);
    }
}
