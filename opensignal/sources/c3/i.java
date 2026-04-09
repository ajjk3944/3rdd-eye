package c3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f3202a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3203b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3204c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3205d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3206e;

    public i(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f3202a = Float.NaN;
        this.f3203b = Float.NaN;
        this.f3204c = Float.NaN;
        this.f3205d = Float.NaN;
        this.f3206e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.Variant);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == s.Variant_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f3206e);
                this.f3206e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new p().c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == s.Variant_region_heightLessThan) {
                this.f3205d = typedArrayObtainStyledAttributes.getDimension(index, this.f3205d);
            } else if (index == s.Variant_region_heightMoreThan) {
                this.f3203b = typedArrayObtainStyledAttributes.getDimension(index, this.f3203b);
            } else if (index == s.Variant_region_widthLessThan) {
                this.f3204c = typedArrayObtainStyledAttributes.getDimension(index, this.f3204c);
            } else if (index == s.Variant_region_widthMoreThan) {
                this.f3202a = typedArrayObtainStyledAttributes.getDimension(index, this.f3202a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
