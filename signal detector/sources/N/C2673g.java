package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import h.C2344b;
import h.DialogInterfaceC2347e;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2673g implements w, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f22054a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f22055b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC2677k f22056c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f22057d;

    /* renamed from: e, reason: collision with root package name */
    public v f22058e;

    /* renamed from: f, reason: collision with root package name */
    public C2672f f22059f;

    public C2673g(ContextWrapper contextWrapper) {
        this.f22054a = contextWrapper;
        this.f22055b = LayoutInflater.from(contextWrapper);
    }

    @Override // n.w
    public final void b(boolean z6) {
        C2672f c2672f = this.f22059f;
        if (c2672f != null) {
            c2672f.notifyDataSetChanged();
        }
    }

    @Override // n.w
    public final void c(MenuC2677k menuC2677k, boolean z6) {
        v vVar = this.f22058e;
        if (vVar != null) {
            vVar.c(menuC2677k, z6);
        }
    }

    @Override // n.w
    public final void d(Context context, MenuC2677k menuC2677k) {
        if (this.f22054a != null) {
            this.f22054a = context;
            if (this.f22055b == null) {
                this.f22055b = LayoutInflater.from(context);
            }
        }
        this.f22056c = menuC2677k;
        C2672f c2672f = this.f22059f;
        if (c2672f != null) {
            c2672f.notifyDataSetChanged();
        }
    }

    @Override // n.w
    public final boolean e(SubMenuC2666C subMenuC2666C) {
        boolean zHasVisibleItems = subMenuC2666C.hasVisibleItems();
        Context context = subMenuC2666C.f22076a;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC2678l dialogInterfaceOnKeyListenerC2678l = new DialogInterfaceOnKeyListenerC2678l();
        dialogInterfaceOnKeyListenerC2678l.f22089a = subMenuC2666C;
        L2.w wVar = new L2.w(context);
        C2344b c2344b = (C2344b) wVar.f2570c;
        C2673g c2673g = new C2673g(c2344b.f20308a);
        dialogInterfaceOnKeyListenerC2678l.f22091c = c2673g;
        c2673g.f22058e = dialogInterfaceOnKeyListenerC2678l;
        subMenuC2666C.b(c2673g, context);
        C2673g c2673g2 = dialogInterfaceOnKeyListenerC2678l.f22091c;
        if (c2673g2.f22059f == null) {
            c2673g2.f22059f = new C2672f(c2673g2);
        }
        c2344b.f20314g = c2673g2.f22059f;
        c2344b.f20315h = dialogInterfaceOnKeyListenerC2678l;
        View view = subMenuC2666C.f22066C;
        if (view != null) {
            c2344b.f20312e = view;
        } else {
            c2344b.f20310c = subMenuC2666C.f22088n;
            c2344b.f20311d = subMenuC2666C.f22087m;
        }
        c2344b.f20313f = dialogInterfaceOnKeyListenerC2678l;
        DialogInterfaceC2347e dialogInterfaceC2347eI = wVar.i();
        dialogInterfaceOnKeyListenerC2678l.f22090b = dialogInterfaceC2347eI;
        dialogInterfaceC2347eI.setOnDismissListener(dialogInterfaceOnKeyListenerC2678l);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC2678l.f22090b.getWindow().getAttributes();
        attributes.type = BackupConstant.SCENE_CLOSED_WITHOUT_SHOW;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC2678l.f22090b.show();
        v vVar = this.f22058e;
        if (vVar == null) {
            return true;
        }
        vVar.g(subMenuC2666C);
        return true;
    }

    @Override // n.w
    public final boolean f() {
        return false;
    }

    @Override // n.w
    public final int getId() {
        return 0;
    }

    @Override // n.w
    public final void h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f22057d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // n.w
    public final boolean j(m mVar) {
        return false;
    }

    @Override // n.w
    public final Parcelable k() {
        if (this.f22057d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f22057d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // n.w
    public final void l(v vVar) {
        throw null;
    }

    @Override // n.w
    public final boolean m(m mVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        this.f22056c.q(this.f22059f.getItem(i), this, 0);
    }
}
