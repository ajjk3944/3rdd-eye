package a2;

import H0.j;
import S4.n;
import S4.p;
import S4.q;
import a4.t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.m0;
import com.apm.insight.R;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.lefan.signal.ui.noise.NoiseBean;
import com.lefan.signal.ui.noise.NoiseHistoryActivity;
import com.lefan.signal.ui.noise.NoiseZoom_Impl;
import d5.AbstractC2282j;
import e2.InterfaceC2302a;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import q5.i;

/* renamed from: a2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0271g extends G {

    /* renamed from: a, reason: collision with root package name */
    public final int f4667a;

    /* renamed from: b, reason: collision with root package name */
    public List f4668b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4669c = true;

    /* renamed from: d, reason: collision with root package name */
    public FrameLayout f4670d;

    /* renamed from: e, reason: collision with root package name */
    public F4.b f4671e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2302a f4672f;

    /* renamed from: g, reason: collision with root package name */
    public O4.b f4673g;

    /* renamed from: h, reason: collision with root package name */
    public p f4674h;
    public final H3.g i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f4675j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f4676k;

    public AbstractC0271g(int i) {
        this.f4667a = i;
        if (this instanceof q) {
            this.i = new H3.g(this);
        }
        this.f4676k = new LinkedHashSet();
        new LinkedHashSet();
    }

    public final void a(Object obj) {
        this.f4668b.add(obj);
        notifyItemInserted(this.f4668b.size());
        if (this.f4668b.size() == 1) {
            notifyDataSetChanged();
        }
    }

    public void b(final BaseViewHolder baseViewHolder, int i) {
        i.e(baseViewHolder, "viewHolder");
        if (this.f4672f != null) {
            final int i3 = 0;
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: a2.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = i3;
                    AbstractC0271g abstractC0271g = this;
                    BaseViewHolder baseViewHolder2 = baseViewHolder;
                    switch (i6) {
                        case 0:
                            i.e(baseViewHolder2, "$viewHolder");
                            int bindingAdapterPosition = baseViewHolder2.getBindingAdapterPosition();
                            if (bindingAdapterPosition == -1) {
                                return;
                            }
                            i.d(view, "v");
                            InterfaceC2302a interfaceC2302a = abstractC0271g.f4672f;
                            if (interfaceC2302a != null) {
                                interfaceC2302a.a(abstractC0271g, view, bindingAdapterPosition);
                                return;
                            }
                            return;
                        default:
                            i.e(baseViewHolder2, "$viewHolder");
                            int bindingAdapterPosition2 = baseViewHolder2.getBindingAdapterPosition();
                            if (bindingAdapterPosition2 == -1) {
                                return;
                            }
                            i.d(view, "v");
                            p pVar = abstractC0271g.f4674h;
                            if (pVar != null) {
                                NoiseHistoryActivity noiseHistoryActivity = pVar.f3549a;
                                ArrayList arrayList = noiseHistoryActivity.f19013R;
                                int i7 = NoiseHistoryActivity.f19009T;
                                NoiseBean noiseBean = (NoiseBean) AbstractC2282j.V(bindingAdapterPosition2, arrayList);
                                if (noiseBean != null && view.getId() == R.id.noise_delete) {
                                    noiseHistoryActivity.f19011P.notifyItemRemoved(bindingAdapterPosition2);
                                    n nVar = (n) noiseHistoryActivity.f19012Q.getValue();
                                    NoiseZoom_Impl noiseZoom_Impl = nVar.f3544a;
                                    noiseZoom_Impl.b();
                                    noiseZoom_Impl.c();
                                    try {
                                        L4.c cVar = nVar.f3546c;
                                        j jVarA = cVar.a();
                                        try {
                                            cVar.e(jVarA, noiseBean);
                                            jVarA.b();
                                            cVar.c(jVarA);
                                            noiseZoom_Impl.m();
                                            noiseZoom_Impl.j();
                                            arrayList.remove(noiseBean);
                                            return;
                                        } catch (Throwable th) {
                                            cVar.c(jVarA);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        noiseZoom_Impl.j();
                                        throw th2;
                                    }
                                }
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (this.f4673g != null) {
            baseViewHolder.itemView.setOnLongClickListener(new ViewOnLongClickListenerC0266b(baseViewHolder, this, 1));
        }
        if (this.f4674h != null) {
            Iterator it = this.f4676k.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                View view = baseViewHolder.itemView;
                i.d(num, "id");
                View viewFindViewById = view.findViewById(num.intValue());
                if (viewFindViewById != null) {
                    if (!viewFindViewById.isClickable()) {
                        viewFindViewById.setClickable(true);
                    }
                    final int i6 = 1;
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: a2.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i62 = i6;
                            AbstractC0271g abstractC0271g = this;
                            BaseViewHolder baseViewHolder2 = baseViewHolder;
                            switch (i62) {
                                case 0:
                                    i.e(baseViewHolder2, "$viewHolder");
                                    int bindingAdapterPosition = baseViewHolder2.getBindingAdapterPosition();
                                    if (bindingAdapterPosition == -1) {
                                        return;
                                    }
                                    i.d(view2, "v");
                                    InterfaceC2302a interfaceC2302a = abstractC0271g.f4672f;
                                    if (interfaceC2302a != null) {
                                        interfaceC2302a.a(abstractC0271g, view2, bindingAdapterPosition);
                                        return;
                                    }
                                    return;
                                default:
                                    i.e(baseViewHolder2, "$viewHolder");
                                    int bindingAdapterPosition2 = baseViewHolder2.getBindingAdapterPosition();
                                    if (bindingAdapterPosition2 == -1) {
                                        return;
                                    }
                                    i.d(view2, "v");
                                    p pVar = abstractC0271g.f4674h;
                                    if (pVar != null) {
                                        NoiseHistoryActivity noiseHistoryActivity = pVar.f3549a;
                                        ArrayList arrayList = noiseHistoryActivity.f19013R;
                                        int i7 = NoiseHistoryActivity.f19009T;
                                        NoiseBean noiseBean = (NoiseBean) AbstractC2282j.V(bindingAdapterPosition2, arrayList);
                                        if (noiseBean != null && view2.getId() == R.id.noise_delete) {
                                            noiseHistoryActivity.f19011P.notifyItemRemoved(bindingAdapterPosition2);
                                            n nVar = (n) noiseHistoryActivity.f19012Q.getValue();
                                            NoiseZoom_Impl noiseZoom_Impl = nVar.f3544a;
                                            noiseZoom_Impl.b();
                                            noiseZoom_Impl.c();
                                            try {
                                                L4.c cVar = nVar.f3546c;
                                                j jVarA = cVar.a();
                                                try {
                                                    cVar.e(jVarA, noiseBean);
                                                    jVarA.b();
                                                    cVar.c(jVarA);
                                                    noiseZoom_Impl.m();
                                                    noiseZoom_Impl.j();
                                                    arrayList.remove(noiseBean);
                                                    return;
                                                } catch (Throwable th) {
                                                    cVar.c(jVarA);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                noiseZoom_Impl.j();
                                                throw th2;
                                            }
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        }
    }

    public abstract void c(BaseViewHolder baseViewHolder, Object obj);

    public void d(BaseViewHolder baseViewHolder, Object obj, List list) {
        i.e(baseViewHolder, "holder");
        i.e(list, "payloads");
    }

    public final BaseViewHolder e(View view) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        BaseViewHolder baseViewHolder;
        BaseViewHolder baseViewHolder2;
        Type genericSuperclass;
        Class cls;
        i.e(view, "view");
        Class<?> superclass = getClass();
        BaseViewHolder baseViewHolder3 = null;
        Class cls2 = null;
        while (true) {
            if (cls2 != null || superclass == null) {
                break;
            }
            try {
                genericSuperclass = superclass.getGenericSuperclass();
            } catch (TypeNotPresentException e6) {
                e6.printStackTrace();
            } catch (GenericSignatureFormatError e7) {
                e7.printStackTrace();
            } catch (MalformedParameterizedTypeException e8) {
                e8.printStackTrace();
            }
            if (genericSuperclass instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                i.d(actualTypeArguments, "types");
                for (Type type : actualTypeArguments) {
                    if (!(type instanceof Class)) {
                        if (type instanceof ParameterizedType) {
                            Type rawType = ((ParameterizedType) type).getRawType();
                            if ((rawType instanceof Class) && BaseViewHolder.class.isAssignableFrom((Class) rawType)) {
                                cls = (Class) rawType;
                                cls2 = cls;
                                break;
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (BaseViewHolder.class.isAssignableFrom((Class) type)) {
                            cls = (Class) type;
                            cls2 = cls;
                            break;
                        }
                    }
                }
                cls2 = null;
            } else {
                cls2 = null;
            }
            superclass = superclass.getSuperclass();
        }
        if (cls2 == null) {
            baseViewHolder = new BaseViewHolder(view);
        } else {
            try {
                if (!cls2.isMemberClass() || Modifier.isStatic(cls2.getModifiers())) {
                    Constructor declaredConstructor = cls2.getDeclaredConstructor(View.class);
                    i.d(declaredConstructor, "z.getDeclaredConstructor(View::class.java)");
                    declaredConstructor.setAccessible(true);
                    Object objNewInstance = declaredConstructor.newInstance(view);
                    i.c(objNewInstance, "null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
                    baseViewHolder2 = (BaseViewHolder) objNewInstance;
                } else {
                    Constructor declaredConstructor2 = cls2.getDeclaredConstructor(getClass(), View.class);
                    i.d(declaredConstructor2, "z.getDeclaredConstructor…aClass, View::class.java)");
                    declaredConstructor2.setAccessible(true);
                    Object objNewInstance2 = declaredConstructor2.newInstance(this, view);
                    i.c(objNewInstance2, "null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
                    baseViewHolder2 = (BaseViewHolder) objNewInstance2;
                }
                baseViewHolder3 = baseViewHolder2;
            } catch (IllegalAccessException e9) {
                e9.printStackTrace();
            } catch (InstantiationException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
            baseViewHolder = baseViewHolder3;
        }
        return baseViewHolder == null ? new BaseViewHolder(view) : baseViewHolder;
    }

    public final Context f() {
        RecyclerView recyclerView = this.f4675j;
        if (recyclerView == null) {
            throw new IllegalStateException("Please get it after onAttachedToRecyclerView()");
        }
        Context context = recyclerView.getContext();
        i.d(context, "recyclerView.context");
        return context;
    }

    public int g(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.G
    public final int getItemCount() {
        if (h()) {
            return 1;
        }
        H3.g gVar = this.i;
        return this.f4668b.size() + ((gVar == null || !gVar.d()) ? 0 : 1);
    }

    @Override // androidx.recyclerview.widget.G
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.G
    public final int getItemViewType(int i) {
        if (!h()) {
            int size = this.f4668b.size();
            return i < size ? g(i) : i - size < 0 ? 268436275 : 268436002;
        }
        if (i != 0) {
            return (i == 1 || i == 2) ? 268436275 : 268436821;
        }
        return 268436821;
    }

    public final boolean h() {
        FrameLayout frameLayout = this.f4670d;
        if (frameLayout == null || frameLayout.getChildCount() == 0 || !this.f4669c) {
            return false;
        }
        return this.f4668b.isEmpty();
    }

    public boolean i(int i) {
        return i == 268436821 || i == 268435729 || i == 268436275 || i == 268436002;
    }

    @Override // androidx.recyclerview.widget.G
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        i.e(baseViewHolder, "holder");
        H3.g gVar = this.i;
        if (gVar != null) {
            gVar.a(i);
        }
        switch (baseViewHolder.getItemViewType()) {
            case 268435729:
            case 268436275:
            case 268436821:
                break;
            case 268436002:
                H3.g gVar2 = this.i;
                if (gVar2 != null) {
                    t.g(baseViewHolder, gVar2.f1798c);
                    break;
                }
                break;
            default:
                c(baseViewHolder, this.f4668b.get(i));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.G
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i, List list) {
        i.e(baseViewHolder, "holder");
        i.e(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(baseViewHolder, i);
        }
        H3.g gVar = this.i;
        if (gVar != null) {
            gVar.a(i);
        }
        switch (baseViewHolder.getItemViewType()) {
            case 268435729:
            case 268436275:
            case 268436821:
                break;
            case 268436002:
                H3.g gVar2 = this.i;
                if (gVar2 != null) {
                    t.g(baseViewHolder, gVar2.f1798c);
                    break;
                }
                break;
            default:
                d(baseViewHolder, this.f4668b.get(i), list);
                break;
        }
    }

    public BaseViewHolder l(ViewGroup viewGroup, int i) {
        i.e(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f4667a, viewGroup, false);
        i.d(viewInflate, "from(this.context).infla…layoutResId, this, false)");
        return e(viewInflate);
    }

    @Override // androidx.recyclerview.widget.G
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(BaseViewHolder baseViewHolder) {
        i.e(baseViewHolder, "holder");
        super.onViewAttachedToWindow(baseViewHolder);
        if (i(baseViewHolder.getItemViewType())) {
            ViewGroup.LayoutParams layoutParams = baseViewHolder.itemView.getLayoutParams();
            if (layoutParams instanceof m0) {
                ((m0) layoutParams).f5524f = true;
            }
        }
    }

    public final void n(int i) {
        boolean z6;
        RecyclerView recyclerView = this.f4675j;
        if (recyclerView != null) {
            View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(i, (ViewGroup) recyclerView, false);
            i.d(viewInflate, "view");
            int itemCount = getItemCount();
            if (this.f4670d == null) {
                FrameLayout frameLayout = new FrameLayout(viewInflate.getContext());
                this.f4670d = frameLayout;
                ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                frameLayout.setLayoutParams(layoutParams != null ? new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height) : new ViewGroup.LayoutParams(-1, -1));
                z6 = true;
            } else {
                ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
                if (layoutParams2 != null) {
                    FrameLayout frameLayout2 = this.f4670d;
                    if (frameLayout2 == null) {
                        i.g("mEmptyLayout");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                    layoutParams3.width = layoutParams2.width;
                    layoutParams3.height = layoutParams2.height;
                    FrameLayout frameLayout3 = this.f4670d;
                    if (frameLayout3 == null) {
                        i.g("mEmptyLayout");
                        throw null;
                    }
                    frameLayout3.setLayoutParams(layoutParams3);
                }
                z6 = false;
            }
            FrameLayout frameLayout4 = this.f4670d;
            if (frameLayout4 == null) {
                i.g("mEmptyLayout");
                throw null;
            }
            frameLayout4.removeAllViews();
            FrameLayout frameLayout5 = this.f4670d;
            if (frameLayout5 == null) {
                i.g("mEmptyLayout");
                throw null;
            }
            frameLayout5.addView(viewInflate);
            this.f4669c = true;
            if (z6 && h()) {
                if (getItemCount() > itemCount) {
                    notifyItemInserted(0);
                } else {
                    notifyDataSetChanged();
                }
            }
        }
    }

    public final void o(Collection collection) {
        List list = this.f4668b;
        if (collection != list) {
            list.clear();
            if (collection != null && !collection.isEmpty()) {
                this.f4668b.addAll(collection);
            }
        } else if (collection == null || collection.isEmpty()) {
            this.f4668b.clear();
        } else {
            ArrayList arrayList = new ArrayList(collection);
            this.f4668b.clear();
            this.f4668b.addAll(arrayList);
        }
        H3.g gVar = this.i;
        if (gVar != null && ((p) gVar.f1800e) != null) {
            gVar.e();
            gVar.f1798c = 1;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.G
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        i.e(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f4675j = recyclerView;
        Q layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f5290g = new C0270f(this, (GridLayoutManager) layoutManager, gridLayoutManager.f5290g);
        }
    }

    @Override // androidx.recyclerview.widget.G
    public final g0 onCreateViewHolder(ViewGroup viewGroup, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        i.e(viewGroup, "parent");
        switch (i) {
            case 268435729:
                i.g("mHeaderLayout");
                throw null;
            case 268436002:
                i.b(this.i);
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.brvah_quick_view_load_more, viewGroup, false);
                i.d(viewInflate, "from(this.context).infla…layoutResId, this, false)");
                BaseViewHolder baseViewHolderE = e(viewInflate);
                H3.g gVar = this.i;
                i.b(gVar);
                baseViewHolderE.itemView.setOnClickListener(new B4.g(29, gVar));
                return baseViewHolderE;
            case 268436275:
                i.g("mFooterLayout");
                throw null;
            case 268436821:
                FrameLayout frameLayout = this.f4670d;
                if (frameLayout == null) {
                    i.g("mEmptyLayout");
                    throw null;
                }
                ViewParent parent = frameLayout.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent;
                    FrameLayout frameLayout2 = this.f4670d;
                    if (frameLayout2 == null) {
                        i.g("mEmptyLayout");
                        throw null;
                    }
                    viewGroup2.removeView(frameLayout2);
                }
                FrameLayout frameLayout3 = this.f4670d;
                if (frameLayout3 != null) {
                    return e(frameLayout3);
                }
                i.g("mEmptyLayout");
                throw null;
            default:
                BaseViewHolder baseViewHolderL = l(viewGroup, i);
                b(baseViewHolderL, i);
                return baseViewHolderL;
        }
    }

    @Override // androidx.recyclerview.widget.G
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        i.e(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f4675j = null;
    }

    public final void p(List list) {
        if (list == this.f4668b) {
            return;
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.f4668b = list;
        H3.g gVar = this.i;
        if (gVar != null && ((p) gVar.f1800e) != null) {
            gVar.e();
            gVar.f1798c = 1;
        }
        notifyDataSetChanged();
    }
}
