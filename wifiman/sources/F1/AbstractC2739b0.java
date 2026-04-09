package F1;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: F1.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2739b0 {

    /* renamed from: F1.b0$a */
    /* synthetic */ class a extends C6490p implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5705a = new a();

        a() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final InterfaceC8780j a(View view) {
        return AbstractC8783m.n(view.getParent(), a.f5705a);
    }
}
