package q0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.apm.insight.R;
import java.lang.ref.WeakReference;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2789b extends q5.j implements p5.l {

    /* renamed from: c, reason: collision with root package name */
    public static final C2789b f22947c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2789b f22948d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2789b f22949e;

    /* renamed from: f, reason: collision with root package name */
    public static final C2789b f22950f;

    /* renamed from: g, reason: collision with root package name */
    public static final C2789b f22951g;

    /* renamed from: h, reason: collision with root package name */
    public static final C2789b f22952h;
    public static final C2789b i;

    /* renamed from: j, reason: collision with root package name */
    public static final C2789b f22953j;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22954b;

    static {
        int i3 = 1;
        f22947c = new C2789b(i3, 0);
        f22948d = new C2789b(i3, 1);
        f22949e = new C2789b(i3, 2);
        f22950f = new C2789b(i3, 3);
        f22951g = new C2789b(i3, 4);
        f22952h = new C2789b(i3, 5);
        i = new C2789b(i3, 6);
        f22953j = new C2789b(i3, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2789b(int i3, int i6) {
        super(i3);
        this.f22954b = i6;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        switch (this.f22954b) {
            case 0:
                Context context = (Context) obj;
                q5.i.e(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                q5.i.e(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                v vVar = (v) obj;
                q5.i.e(vVar, "destination");
                x xVar = vVar.f23037b;
                if (xVar == null || xVar.f23049l != vVar.f23043h) {
                    return null;
                }
                return xVar;
            case 3:
                v vVar2 = (v) obj;
                q5.i.e(vVar2, "destination");
                x xVar2 = vVar2.f23037b;
                if (xVar2 == null || xVar2.f23049l != vVar2.f23043h) {
                    return null;
                }
                return xVar2;
            case 4:
                v vVar3 = (v) obj;
                q5.i.e(vVar3, "it");
                return vVar3.f23037b;
            case 5:
                v vVar4 = (v) obj;
                q5.i.e(vVar4, "it");
                if (!(vVar4 instanceof x)) {
                    return null;
                }
                x xVar3 = (x) vVar4;
                return xVar3.h(xVar3.f23049l, true);
            case 6:
                View view = (View) obj;
                q5.i.e(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                q5.i.e(view2, "it");
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (z) ((WeakReference) tag).get();
                }
                if (tag instanceof z) {
                    return (z) tag;
                }
                return null;
        }
    }
}
