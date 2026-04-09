package n3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f29629a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29630b;

    /* renamed from: c, reason: collision with root package name */
    public final float f29631c;

    /* renamed from: d, reason: collision with root package name */
    public final float f29632d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29633e;

    public g(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f29629a = Float.NaN;
        this.f29630b = Float.NaN;
        this.f29631c = Float.NaN;
        this.f29632d = Float.NaN;
        this.f29633e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f29633e);
                this.f29633e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f29632d = typedArrayObtainStyledAttributes.getDimension(index, this.f29632d);
            } else if (index == 2) {
                this.f29630b = typedArrayObtainStyledAttributes.getDimension(index, this.f29630b);
            } else if (index == 3) {
                this.f29631c = typedArrayObtainStyledAttributes.getDimension(index, this.f29631c);
            } else if (index == 4) {
                this.f29629a = typedArrayObtainStyledAttributes.getDimension(index, this.f29629a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
