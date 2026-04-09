package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import h.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f666a;

    /* renamed from: b, reason: collision with root package name */
    public final int f667b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f24793t);
        this.f667b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f666a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
