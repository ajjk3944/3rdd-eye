package androidx.fragment.app;

import N7.C1154e9;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import f1.C4330a;
import g1.C4368b;
import g1.C4369c;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C1767u implements LayoutInflater.Factory2 {

    /* renamed from: b, reason: collision with root package name */
    public final x f15955b;

    public LayoutInflaterFactory2C1767u(x xVar) {
        this.f15955b = xVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        F f10;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        x xVar = this.f15955b;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, xVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4330a.f37810a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = ComponentCallbacksC1759l.class.isAssignableFrom(C1765s.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    ComponentCallbacksC1759l componentCallbacksC1759lA = resourceId != -1 ? xVar.A(resourceId) : null;
                    if (componentCallbacksC1759lA == null && string != null) {
                        componentCallbacksC1759lA = xVar.B(string);
                    }
                    if (componentCallbacksC1759lA == null && id != -1) {
                        componentCallbacksC1759lA = xVar.A(id);
                    }
                    if (componentCallbacksC1759lA == null) {
                        C1765s c1765sD = xVar.D();
                        context.getClassLoader();
                        componentCallbacksC1759lA = c1765sD.a(attributeValue);
                        componentCallbacksC1759lA.mFromLayout = true;
                        componentCallbacksC1759lA.mFragmentId = resourceId != 0 ? resourceId : id;
                        componentCallbacksC1759lA.mContainerId = id;
                        componentCallbacksC1759lA.mTag = string;
                        componentCallbacksC1759lA.mInLayout = true;
                        componentCallbacksC1759lA.mFragmentManager = xVar;
                        AbstractC1766t<?> abstractC1766t = xVar.f15995u;
                        componentCallbacksC1759lA.mHost = abstractC1766t;
                        componentCallbacksC1759lA.onInflate((Context) abstractC1766t.f15952c, attributeSet, componentCallbacksC1759lA.mSavedFragmentState);
                        f10 = xVar.a(componentCallbacksC1759lA);
                        if (x.G(2)) {
                            Log.v("FragmentManager", "Fragment " + componentCallbacksC1759lA + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (componentCallbacksC1759lA.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        componentCallbacksC1759lA.mInLayout = true;
                        componentCallbacksC1759lA.mFragmentManager = xVar;
                        AbstractC1766t<?> abstractC1766t2 = xVar.f15995u;
                        componentCallbacksC1759lA.mHost = abstractC1766t2;
                        componentCallbacksC1759lA.onInflate((Context) abstractC1766t2.f15952c, attributeSet, componentCallbacksC1759lA.mSavedFragmentState);
                        f10 = xVar.f(componentCallbacksC1759lA);
                        if (x.G(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + componentCallbacksC1759lA + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C4368b.C0457b c0457b = C4368b.f37937a;
                    C4368b.b(new C4369c(componentCallbacksC1759lA, viewGroup));
                    C4368b.a(componentCallbacksC1759lA).getClass();
                    C4368b.a aVar = C4368b.a.DETECT_FRAGMENT_TAG_USAGE;
                    componentCallbacksC1759lA.mContainer = viewGroup;
                    f10.k();
                    f10.j();
                    View view2 = componentCallbacksC1759lA.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(C1154e9.i("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (componentCallbacksC1759lA.mView.getTag() == null) {
                        componentCallbacksC1759lA.mView.setTag(string);
                    }
                    componentCallbacksC1759lA.mView.addOnAttachStateChangeListener(new a(f10));
                    return componentCallbacksC1759lA.mView;
                }
            }
        }
        return null;
    }

    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* renamed from: androidx.fragment.app.u$a */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F f15956b;

        public a(F f10) {
            this.f15956b = f10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            F f10 = this.f15956b;
            f10.k();
            S.f((ViewGroup) f10.f15771c.mView.getParent(), LayoutInflaterFactory2C1767u.this.f15955b).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
