package c3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3199a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3200b;

    /* renamed from: c, reason: collision with root package name */
    public int f3201c;

    public h(ArrayList arrayList) {
        this.f3199a = arrayList;
        this.f3200b = arrayList.size();
    }

    public io.sentry.android.core.internal.threaddump.a a() {
        int i10 = this.f3201c;
        if (i10 < 0 || i10 >= this.f3200b) {
            return null;
        }
        this.f3201c = i10 + 1;
        return (io.sentry.android.core.internal.threaddump.a) this.f3199a.get(i10);
    }

    public h(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f3199a = new ArrayList();
        this.f3201c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.State);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == s.State_android_id) {
                this.f3200b = typedArrayObtainStyledAttributes.getResourceId(index, this.f3200b);
            } else if (index == s.State_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f3201c);
                this.f3201c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new p().c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
