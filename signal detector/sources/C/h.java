package C;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f893a;

    /* renamed from: b, reason: collision with root package name */
    public final float f894b;

    /* renamed from: c, reason: collision with root package name */
    public final float f895c;

    /* renamed from: d, reason: collision with root package name */
    public final float f896d;

    /* renamed from: e, reason: collision with root package name */
    public final int f897e;

    public h(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f893a = Float.NaN;
        this.f894b = Float.NaN;
        this.f895c = Float.NaN;
        this.f896d = Float.NaN;
        this.f897e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f1020j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f897e);
                this.f897e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f896d = typedArrayObtainStyledAttributes.getDimension(index, this.f896d);
            } else if (index == 2) {
                this.f894b = typedArrayObtainStyledAttributes.getDimension(index, this.f894b);
            } else if (index == 3) {
                this.f895c = typedArrayObtainStyledAttributes.getDimension(index, this.f895c);
            } else if (index == 4) {
                this.f893a = typedArrayObtainStyledAttributes.getDimension(index, this.f893a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
