package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import g.AbstractC2327a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f4757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4758b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2327a.f20133u);
        this.f4758b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f4757a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
