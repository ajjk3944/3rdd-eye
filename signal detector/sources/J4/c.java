package J4;

import A.f;
import B4.r;
import K4.p;
import K4.q;
import Y.h;
import Y4.ViewOnClickListenerC0223c;
import a2.AbstractC0271g;
import a2.ViewOnLongClickListenerC0266b;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.g0;
import com.apm.insight.R;
import com.chad.library.adapter.base.binder.QuickDataBindingItemBinder$BinderDataBindingHolder;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import d5.AbstractC2282j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import q5.i;

/* loaded from: classes.dex */
public final class c extends AbstractC0271g {

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f2142l;

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f2143m;

    public c() {
        super(0);
        new HashMap();
        this.f2142l = new HashMap();
        this.f2143m = new SparseArray();
        synchronized (c2.a.f5900a) {
            if (c2.a.f5901b == null) {
                c2.a.f5901b = Executors.newFixedThreadPool(2);
            }
        }
        i.b(c2.a.f5901b);
        new Handler(Looper.getMainLooper());
        new CopyOnWriteArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [c5.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [c5.b, java.lang.Object] */
    @Override // a2.AbstractC0271g
    public final void b(final BaseViewHolder baseViewHolder, int i) {
        i.e(baseViewHolder, "viewHolder");
        super.b(baseViewHolder, i);
        if (this.f4672f == null) {
            baseViewHolder.itemView.setOnClickListener(new r(baseViewHolder, 17, this));
        }
        if (this.f4673g == null) {
            baseViewHolder.itemView.setOnLongClickListener(new ViewOnLongClickListenerC0266b(baseViewHolder, this, 0));
        }
        int i3 = 0;
        if (this.f4674h == null) {
            a aVarQ = q(i);
            ArrayList arrayList = (ArrayList) aVarQ.f2137a.getValue();
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                View viewFindViewById = baseViewHolder.itemView.findViewById(((Number) obj).intValue());
                if (viewFindViewById != null) {
                    if (!viewFindViewById.isClickable()) {
                        viewFindViewById.setClickable(true);
                    }
                    viewFindViewById.setOnClickListener(new ViewOnClickListenerC0223c(baseViewHolder, this, aVarQ, 2));
                }
            }
        }
        final a aVarQ2 = q(i);
        ArrayList arrayList2 = (ArrayList) aVarQ2.f2138b.getValue();
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            View viewFindViewById2 = baseViewHolder.itemView.findViewById(((Number) obj2).intValue());
            if (viewFindViewById2 != null) {
                if (!viewFindViewById2.isLongClickable()) {
                    viewFindViewById2.setLongClickable(true);
                }
                viewFindViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: a2.a
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        BaseViewHolder baseViewHolder2 = baseViewHolder;
                        i.e(baseViewHolder2, "$viewHolder");
                        J4.c cVar = this;
                        i.e(cVar, "this$0");
                        i.e(aVarQ2, "$provider");
                        int bindingAdapterPosition = baseViewHolder2.getBindingAdapterPosition();
                        if (bindingAdapterPosition == -1 || AbstractC2282j.V(bindingAdapterPosition, cVar.f4668b) == null) {
                            return false;
                        }
                        i.d(view, "v");
                        return false;
                    }
                });
            }
        }
    }

    @Override // a2.AbstractC0271g
    public final void c(BaseViewHolder baseViewHolder, Object obj) throws Throwable {
        i.e(baseViewHolder, "holder");
        i.e(obj, "item");
        q(baseViewHolder.getItemViewType());
        QuickDataBindingItemBinder$BinderDataBindingHolder quickDataBindingItemBinder$BinderDataBindingHolder = (QuickDataBindingItemBinder$BinderDataBindingHolder) baseViewHolder;
        d dVar = (d) obj;
        p pVar = (p) quickDataBindingItemBinder$BinderDataBindingHolder.f6835b;
        q qVar = (q) pVar;
        S4.r rVar = h.f4206k;
        Y.i[] iVarArr = qVar.f4211d;
        Y.i iVarE = iVarArr[0];
        if (iVarE == null) {
            if (iVarE == null) {
                iVarE = rVar.e(qVar, h.f4207l);
                iVarArr[0] = iVarE;
            }
            iVarE.a();
            iVarE.f4217b = dVar;
            iVarE.f4216a.a(dVar);
        } else if (iVarE.f4217b != dVar) {
            if (iVarE != null) {
                iVarE.a();
            }
            Y.i[] iVarArr2 = qVar.f4211d;
            Y.i iVarE2 = iVarArr2[0];
            if (iVarE2 == null) {
                iVarE2 = rVar.e(qVar, h.f4207l);
                iVarArr2[0] = iVarE2;
            }
            iVarE2.a();
            iVarE2.f4217b = dVar;
            iVarE2.f4216a.a(dVar);
        }
        qVar.f2393n = dVar;
        synchronized (qVar) {
            qVar.f2396E |= 1;
        }
        qVar.a(1);
        qVar.f();
        pVar.c();
        quickDataBindingItemBinder$BinderDataBindingHolder.setText(R.id.item_title_name, dVar.f2144b);
    }

    @Override // a2.AbstractC0271g
    public final void d(BaseViewHolder baseViewHolder, Object obj, List list) {
        i.e(baseViewHolder, "holder");
        i.e(obj, "item");
        i.e(list, "payloads");
        q(baseViewHolder.getItemViewType());
    }

    @Override // a2.AbstractC0271g
    public final int g(int i) {
        Class<?> cls = this.f4668b.get(i).getClass();
        Integer num = (Integer) this.f2142l.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("findViewType: ViewType: " + cls + " Not Find!").toString());
    }

    @Override // a2.AbstractC0271g
    public final BaseViewHolder l(ViewGroup viewGroup, int i) {
        i.e(viewGroup, "parent");
        q(i).f2139c = f();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        i.d(layoutInflaterFrom, "from(parent.context)");
        int i3 = p.f2392C;
        p pVar = (p) Y.c.f4195a.b(R.layout.item_title_value, layoutInflaterFrom.inflate(R.layout.item_title_value, viewGroup, false));
        i.d(pVar, "inflate(...)");
        return new QuickDataBindingItemBinder$BinderDataBindingHolder(pVar);
    }

    @Override // a2.AbstractC0271g, androidx.recyclerview.widget.G
    /* renamed from: m */
    public final void onViewAttachedToWindow(BaseViewHolder baseViewHolder) {
        i.e(baseViewHolder, "holder");
        super.onViewAttachedToWindow(baseViewHolder);
    }

    @Override // androidx.recyclerview.widget.G
    public final boolean onFailedToRecycleView(g0 g0Var) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) g0Var;
        i.e(baseViewHolder, "holder");
        return false;
    }

    @Override // androidx.recyclerview.widget.G
    public final void onViewDetachedFromWindow(g0 g0Var) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) g0Var;
        i.e(baseViewHolder, "holder");
        super.onViewDetachedFromWindow(baseViewHolder);
    }

    public final a q(int i) {
        a aVar = (a) this.f2143m.get(i);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(f.h(i, "getItemBinder: viewType '", "' no such Binder found，please use addItemBinder() first!").toString());
    }
}
