package n3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements u0.c {

    /* renamed from: a, reason: collision with root package name */
    public int f29626a;

    /* renamed from: b, reason: collision with root package name */
    public int f29627b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29628c;

    public f(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f29628c = new ArrayList();
        this.f29627b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f29726h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                this.f29626a = typedArrayObtainStyledAttributes.getResourceId(index, this.f29626a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f29627b);
                this.f29627b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // u0.c
    public void a(Object obj, mk.e eVar) {
        ((u0.c) this.f29628c).a(obj, eVar);
    }

    public t7.c b() {
        t7.c cVar = new t7.c();
        cVar.f34435a = this.f29626a;
        cVar.f34436b = this.f29627b;
        cVar.f34437c = (String) this.f29628c;
        return cVar;
    }

    @Override // u0.c
    public void c(int i4, Object obj) {
        ((u0.c) this.f29628c).c(i4 + (this.f29627b == 0 ? this.f29626a : 0), obj);
    }

    @Override // u0.c
    public void d(Object obj) {
        this.f29627b++;
        ((u0.c) this.f29628c).d(obj);
    }

    @Override // u0.c
    public void f() {
        ((u0.c) this.f29628c).f();
    }

    @Override // u0.c
    public void g(int i4, int i10, int i11) {
        int i12 = this.f29627b == 0 ? this.f29626a : 0;
        ((u0.c) this.f29628c).g(i4 + i12, i10 + i12, i11);
    }

    @Override // u0.c
    public void h(int i4, int i10) {
        ((u0.c) this.f29628c).h(i4 + (this.f29627b == 0 ? this.f29626a : 0), i10);
    }

    @Override // u0.c
    public void j() {
        if (!(this.f29627b > 0)) {
            u0.r.a("OffsetApplier up called with no corresponding down");
        }
        this.f29627b--;
        ((u0.c) this.f29628c).j();
    }

    @Override // u0.c
    public void l(int i4, Object obj) {
        ((u0.c) this.f29628c).l(i4 + (this.f29627b == 0 ? this.f29626a : 0), obj);
    }

    public f() {
        this.f29628c = new f[256];
        this.f29626a = 0;
        this.f29627b = 0;
    }

    @Override // u0.c
    public /* synthetic */ void n() {
    }
}
