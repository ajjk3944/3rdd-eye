package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.de;
import com.yandex.mobile.ads.impl.ee;
import com.yandex.mobile.ads.impl.gu0;
import com.yandex.mobile.ads.impl.gy1;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class ExtendedTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private gu0 f23662a;

    /* renamed from: b, reason: collision with root package name */
    private final de f23663b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(Context context) {
        this(context, null, 0, null, null, 30, null);
        l.f(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        de deVar;
        super.onLayout(z10, i, i10, i11, i12);
        if (Build.VERSION.SDK_INT < 27 && (deVar = this.f23663b) != null) {
            deVar.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) {
        gu0.a aVarA = this.f23662a.a(i, i10);
        super.onMeasure(aVarA.f27985a, aVarA.f27986b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence text, int i, int i10, int i11) {
        de deVar;
        l.f(text, "text");
        super.onTextChanged(text, i, i10, i11);
        if (Build.VERSION.SDK_INT < 27 && (deVar = this.f23663b) != null) {
            deVar.b();
        }
    }

    public final void setAutoSizeTextType(int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        de deVar = this.f23663b;
        if (deVar != null) {
            deVar.a(i);
        }
    }

    public final void setMeasureSpecProvider(gu0 measureSpecProvider) {
        l.f(measureSpecProvider, "measureSpecProvider");
        this.f23662a = measureSpecProvider;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 27) {
            super.setTextSize(i, f10);
            return;
        }
        de deVar = this.f23663b;
        if (deVar != null) {
            deVar.a(i, f10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
        l.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, null, 24, null);
        l.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(Context context, AttributeSet attributeSet, int i, gu0 measureSpecProvider) {
        this(context, attributeSet, i, measureSpecProvider, null, 16, null);
        l.f(context, "context");
        l.f(measureSpecProvider, "measureSpecProvider");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(Context context, AttributeSet attributeSet, int i, gu0 measureSpecProvider, ee appCompatAutoSizeControllerFactory) {
        super(context, attributeSet, i);
        l.f(context, "context");
        l.f(measureSpecProvider, "measureSpecProvider");
        l.f(appCompatAutoSizeControllerFactory, "appCompatAutoSizeControllerFactory");
        this.f23662a = measureSpecProvider;
        this.f23663b = ee.a(this);
    }

    public /* synthetic */ ExtendedTextView(Context context, AttributeSet attributeSet, int i, gu0 gu0Var, ee eeVar, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i, (i10 & 8) != 0 ? new gy1() : gu0Var, (i10 & 16) != 0 ? new ee() : eeVar);
    }
}
