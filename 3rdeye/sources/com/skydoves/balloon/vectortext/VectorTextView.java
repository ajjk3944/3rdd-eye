package com.skydoves.balloon.vectortext;

import S5.s;
import U5.b;
import X5.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.l;

/* compiled from: VectorTextView.kt */
/* loaded from: classes2.dex */
public final class VectorTextView extends AppCompatTextView {
    public a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f11992a);
            l.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            setDrawableTextViewParams(new a(A2.l.F(typedArrayObtainStyledAttributes.getResourceId(5, RecyclerView.UNDEFINED_DURATION)), A2.l.F(typedArrayObtainStyledAttributes.getResourceId(1, RecyclerView.UNDEFINED_DURATION)), A2.l.F(typedArrayObtainStyledAttributes.getResourceId(0, RecyclerView.UNDEFINED_DURATION)), A2.l.F(typedArrayObtainStyledAttributes.getResourceId(7, RecyclerView.UNDEFINED_DURATION)), null, null, null, null, A2.l.F(typedArrayObtainStyledAttributes.getResourceId(3, RecyclerView.UNDEFINED_DURATION)), A2.l.F(typedArrayObtainStyledAttributes.getColor(6, RecyclerView.UNDEFINED_DURATION)), A2.l.F(typedArrayObtainStyledAttributes.getResourceId(8, RecyclerView.UNDEFINED_DURATION)), A2.l.F(typedArrayObtainStyledAttributes.getResourceId(2, RecyclerView.UNDEFINED_DURATION)), A2.l.F(typedArrayObtainStyledAttributes.getResourceId(4, RecyclerView.UNDEFINED_DURATION)), 8176));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final a getDrawableTextViewParams() {
        return this.i;
    }

    public final void setDrawableTextViewParams(a aVar) {
        if (aVar != null) {
            b.a(this, aVar);
        } else {
            aVar = null;
        }
        this.i = aVar;
    }
}
