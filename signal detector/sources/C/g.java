package C;

import Y2.C0210l;
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
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f890a;

    /* renamed from: b, reason: collision with root package name */
    public final int f891b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f892c;

    public /* synthetic */ g(int i, int i3, C0210l c0210l) {
        this.f890a = i;
        this.f891b = i3;
        this.f892c = c0210l;
    }

    public g(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f892c = new ArrayList();
        this.f891b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f1019h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f890a = typedArrayObtainStyledAttributes.getResourceId(index, this.f890a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f891b);
                this.f891b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public g(int i, int i3, byte[] bArr) {
        this.f892c = bArr;
        this.f890a = i;
        this.f891b = i3;
    }
}
