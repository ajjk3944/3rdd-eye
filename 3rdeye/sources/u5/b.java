package U5;

import A9.I;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import kotlin.jvm.internal.l;

/* compiled from: TextViewExtension.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final void a(TextView textView, X5.a vectorTextViewParams) {
        Drawable drawableW;
        Drawable drawableA;
        Drawable drawableW2;
        Drawable drawableA2;
        Drawable drawableW3;
        Drawable drawableA3;
        Drawable drawableW4;
        l.f(vectorTextViewParams, "vectorTextViewParams");
        Integer num = vectorTextViewParams.f13571n;
        Drawable drawableA4 = null;
        Integer numValueOf = vectorTextViewParams.i;
        if (numValueOf == null) {
            Integer num2 = vectorTextViewParams.f13570m;
            if (num2 != null) {
                numValueOf = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num2.intValue()));
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                if (num != null) {
                    numValueOf = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num.intValue()));
                } else {
                    numValueOf = null;
                }
            }
        }
        Integer numValueOf2 = vectorTextViewParams.f13566h;
        if (numValueOf2 == null) {
            Integer num3 = vectorTextViewParams.f13569l;
            if (num3 != null) {
                numValueOf2 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num3.intValue()));
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 == null) {
                if (num != null) {
                    numValueOf2 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num.intValue()));
                } else {
                    numValueOf2 = null;
                }
            }
        }
        Integer num4 = vectorTextViewParams.f13559a;
        if (num4 != null) {
            drawableW = I.w(textView.getContext(), num4.intValue());
        } else {
            drawableW = null;
        }
        Integer num5 = vectorTextViewParams.f13568k;
        if (drawableW != null) {
            Context context = textView.getContext();
            l.e(context, "getContext(...)");
            drawableA = a.a(drawableW, context, numValueOf2, numValueOf);
            a.b(drawableA, num5);
        } else {
            drawableA = null;
        }
        Integer num6 = vectorTextViewParams.f13560b;
        if (num6 != null) {
            drawableW2 = I.w(textView.getContext(), num6.intValue());
        } else {
            drawableW2 = null;
        }
        if (drawableW2 != null) {
            Context context2 = textView.getContext();
            l.e(context2, "getContext(...)");
            drawableA2 = a.a(drawableW2, context2, numValueOf2, numValueOf);
            a.b(drawableA2, num5);
        } else {
            drawableA2 = null;
        }
        Integer num7 = vectorTextViewParams.f13561c;
        if (num7 != null) {
            drawableW3 = I.w(textView.getContext(), num7.intValue());
        } else {
            drawableW3 = null;
        }
        if (drawableW3 != null) {
            Context context3 = textView.getContext();
            l.e(context3, "getContext(...)");
            drawableA3 = a.a(drawableW3, context3, numValueOf2, numValueOf);
            a.b(drawableA3, num5);
        } else {
            drawableA3 = null;
        }
        Integer num8 = vectorTextViewParams.f13562d;
        if (num8 != null) {
            drawableW4 = I.w(textView.getContext(), num8.intValue());
        } else {
            drawableW4 = null;
        }
        if (drawableW4 != null) {
            Context context4 = textView.getContext();
            l.e(context4, "getContext(...)");
            drawableA4 = a.a(drawableW4, context4, numValueOf2, numValueOf);
            a.b(drawableA4, num5);
        }
        if (vectorTextViewParams.f13563e) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawableA2, drawableA4, drawableA, drawableA3);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA4, drawableA2, drawableA3);
        }
        Integer num9 = vectorTextViewParams.f13565g;
        if (num9 != null) {
            textView.setCompoundDrawablePadding(num9.intValue());
        } else {
            Integer num10 = vectorTextViewParams.f13567j;
            if (num10 != null) {
                textView.setCompoundDrawablePadding(textView.getContext().getResources().getDimensionPixelSize(num10.intValue()));
            }
        }
        textView.setContentDescription(vectorTextViewParams.f13564f);
    }
}
