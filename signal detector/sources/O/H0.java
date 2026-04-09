package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import k.AbstractC2594a;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22381a;

    public /* synthetic */ H0(int i) {
        this.f22381a = i;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f22381a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) H0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        AbstractC2594a.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                        break;
                    } catch (Exception e6) {
                        Log.e("DrawableDelegate", "Exception while inflating <drawable>", e6);
                        return null;
                    }
                }
                break;
            case 1:
                try {
                    break;
                } catch (Exception e7) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e7);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    M0.f fVar = new M0.f(context, 0);
                    fVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e8) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e8);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    M0.r rVar = new M0.r();
                    rVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e9) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e9);
                    return null;
                }
        }
        return null;
    }
}
