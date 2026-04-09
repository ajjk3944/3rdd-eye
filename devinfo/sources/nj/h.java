package nj;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.l0;
import b5.u0;
import b5.z;
import com.liuzh.deviceinfo.R;
import com.liuzho.lib.ui.CardRecyclerView;
import e4.c2;
import ej.i;
import ej.m;
import java.util.ArrayList;
import java.util.List;
import nk.k;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h extends b {

    /* renamed from: b, reason: collision with root package name */
    public final i f29959b;

    /* renamed from: c, reason: collision with root package name */
    public final m f29960c;

    /* renamed from: d, reason: collision with root package name */
    public final jj.i f29961d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29962e;

    /* renamed from: f, reason: collision with root package name */
    public final e f29963f;
    public final gj.a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, i iVar, m mVar, jj.i iVar2, int i4, e eVar) {
        super(context);
        k.e(context, "context");
        k.e(mVar, "viewModel");
        k.e(iVar2, "operator");
        this.f29959b = iVar;
        this.f29960c = mVar;
        this.f29961d = iVar2;
        this.f29962e = i4;
        this.f29963f = eVar;
        gj.a aVarA = gj.a.a(this);
        this.g = aVarA;
        ProgressBar progressBar = aVarA.g;
        z2.k kVarZ = jm.a.z();
        k.d(kVarZ, "themeHandler(...)");
        dj.b.j(progressBar, kVarZ);
        CardRecyclerView cardRecyclerView = aVarA.f24748h;
        z2.k kVarZ2 = jm.a.z();
        k.d(kVarZ2, "themeHandler(...)");
        dj.b.l(cardRecyclerView, kVarZ2);
        ((p6.i) jm.a.f27720a.f1137e).A(cardRecyclerView);
        cardRecyclerView.setAdapter(eVar);
        int i10 = 8;
        aVarA.f24749i.setVisibility(8);
        aVarA.f24745d.setOnClickListener(new ah.g(this, context, i10));
        final int i11 = 0;
        mVar.g.e(iVar, new bh.i(new mk.c(this) { // from class: nj.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f29956b;

            {
                this.f29956b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        this.f29956b.g();
                        break;
                    case 1:
                        this.f29956b.g();
                        break;
                    case 2:
                        yj.i iVar3 = (yj.i) obj;
                        h hVar = this.f29956b;
                        u0 u0VarO = hVar.f29959b.o();
                        k.d(u0VarO, "getChildFragmentManager(...)");
                        String str = "StrgAnaDeletingDialog_" + hVar.f29962e;
                        k.e(str, "tag");
                        if (iVar3 == null) {
                            z zVarD = u0VarO.D(str);
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.e();
                            }
                        } else {
                            hj.a aVar2 = (hj.a) u0VarO.D(str);
                            if (aVar2 == null) {
                                aVar2 = new hj.a();
                                aVar2.f0(false);
                                aVar2.h0(u0VarO, str);
                            }
                            if (aVar2.f25154p0 != null) {
                                aVar2.j0(iVar3);
                            } else {
                                aVar2.f25155q0 = iVar3;
                            }
                        }
                        return u.f37649a;
                    default:
                        List list = (List) obj;
                        h hVar2 = this.f29956b;
                        e eVar2 = hVar2.f29963f;
                        k.b(list);
                        eVar2.getClass();
                        eVar2.f29954i = list;
                        eVar2.notifyDataSetChanged();
                        gj.a aVar3 = hVar2.g;
                        ConstraintLayout constraintLayout = aVar3.f24747f;
                        k.d(constraintLayout, "listDataArea");
                        constraintLayout.setVisibility(0);
                        ProgressBar progressBar2 = aVar3.g;
                        k.d(progressBar2, "progress");
                        progressBar2.setVisibility(8);
                        ImageView imageView = aVar3.f24746e;
                        k.d(imageView, "emptyFile");
                        imageView.setVisibility(list.isEmpty() ? 0 : 8);
                        CardRecyclerView cardRecyclerView2 = aVar3.f24748h;
                        k.d(cardRecyclerView2, "recyclerview");
                        cardRecyclerView2.setVisibility(list.isEmpty() ? 8 : 0);
                        break;
                }
                return u.f37649a;
            }
        }, i10));
        final int i12 = 1;
        iVar2.f27718m.e(iVar, new bh.i(new mk.c(this) { // from class: nj.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f29956b;

            {
                this.f29956b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        this.f29956b.g();
                        break;
                    case 1:
                        this.f29956b.g();
                        break;
                    case 2:
                        yj.i iVar3 = (yj.i) obj;
                        h hVar = this.f29956b;
                        u0 u0VarO = hVar.f29959b.o();
                        k.d(u0VarO, "getChildFragmentManager(...)");
                        String str = "StrgAnaDeletingDialog_" + hVar.f29962e;
                        k.e(str, "tag");
                        if (iVar3 == null) {
                            z zVarD = u0VarO.D(str);
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.e();
                            }
                        } else {
                            hj.a aVar2 = (hj.a) u0VarO.D(str);
                            if (aVar2 == null) {
                                aVar2 = new hj.a();
                                aVar2.f0(false);
                                aVar2.h0(u0VarO, str);
                            }
                            if (aVar2.f25154p0 != null) {
                                aVar2.j0(iVar3);
                            } else {
                                aVar2.f25155q0 = iVar3;
                            }
                        }
                        return u.f37649a;
                    default:
                        List list = (List) obj;
                        h hVar2 = this.f29956b;
                        e eVar2 = hVar2.f29963f;
                        k.b(list);
                        eVar2.getClass();
                        eVar2.f29954i = list;
                        eVar2.notifyDataSetChanged();
                        gj.a aVar3 = hVar2.g;
                        ConstraintLayout constraintLayout = aVar3.f24747f;
                        k.d(constraintLayout, "listDataArea");
                        constraintLayout.setVisibility(0);
                        ProgressBar progressBar2 = aVar3.g;
                        k.d(progressBar2, "progress");
                        progressBar2.setVisibility(8);
                        ImageView imageView = aVar3.f24746e;
                        k.d(imageView, "emptyFile");
                        imageView.setVisibility(list.isEmpty() ? 0 : 8);
                        CardRecyclerView cardRecyclerView2 = aVar3.f24748h;
                        k.d(cardRecyclerView2, "recyclerview");
                        cardRecyclerView2.setVisibility(list.isEmpty() ? 8 : 0);
                        break;
                }
                return u.f37649a;
            }
        }, i10));
        iVar2.f27693d.e(iVar, new bh.i(new g(context, 0), i10));
        int i13 = 8;
        iVar2.f27716k.e(iVar, new bh.i(new b7.b(20, this, context), i13));
        final int i14 = 2;
        iVar2.f27691b.e(iVar, new bh.i(new mk.c(this) { // from class: nj.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f29956b;

            {
                this.f29956b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        this.f29956b.g();
                        break;
                    case 1:
                        this.f29956b.g();
                        break;
                    case 2:
                        yj.i iVar3 = (yj.i) obj;
                        h hVar = this.f29956b;
                        u0 u0VarO = hVar.f29959b.o();
                        k.d(u0VarO, "getChildFragmentManager(...)");
                        String str = "StrgAnaDeletingDialog_" + hVar.f29962e;
                        k.e(str, "tag");
                        if (iVar3 == null) {
                            z zVarD = u0VarO.D(str);
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.e();
                            }
                        } else {
                            hj.a aVar2 = (hj.a) u0VarO.D(str);
                            if (aVar2 == null) {
                                aVar2 = new hj.a();
                                aVar2.f0(false);
                                aVar2.h0(u0VarO, str);
                            }
                            if (aVar2.f25154p0 != null) {
                                aVar2.j0(iVar3);
                            } else {
                                aVar2.f25155q0 = iVar3;
                            }
                        }
                        return u.f37649a;
                    default:
                        List list = (List) obj;
                        h hVar2 = this.f29956b;
                        e eVar2 = hVar2.f29963f;
                        k.b(list);
                        eVar2.getClass();
                        eVar2.f29954i = list;
                        eVar2.notifyDataSetChanged();
                        gj.a aVar3 = hVar2.g;
                        ConstraintLayout constraintLayout = aVar3.f24747f;
                        k.d(constraintLayout, "listDataArea");
                        constraintLayout.setVisibility(0);
                        ProgressBar progressBar2 = aVar3.g;
                        k.d(progressBar2, "progress");
                        progressBar2.setVisibility(8);
                        ImageView imageView = aVar3.f24746e;
                        k.d(imageView, "emptyFile");
                        imageView.setVisibility(list.isEmpty() ? 0 : 8);
                        CardRecyclerView cardRecyclerView2 = aVar3.f24748h;
                        k.d(cardRecyclerView2, "recyclerview");
                        cardRecyclerView2.setVisibility(list.isEmpty() ? 8 : 0);
                        break;
                }
                return u.f37649a;
            }
        }, i13));
        l0 l0Var = iVar2.f27715i;
        final int i15 = 3;
        l0Var.e(iVar, new bh.i(new mk.c(this) { // from class: nj.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f29956b;

            {
                this.f29956b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        this.f29956b.g();
                        break;
                    case 1:
                        this.f29956b.g();
                        break;
                    case 2:
                        yj.i iVar3 = (yj.i) obj;
                        h hVar = this.f29956b;
                        u0 u0VarO = hVar.f29959b.o();
                        k.d(u0VarO, "getChildFragmentManager(...)");
                        String str = "StrgAnaDeletingDialog_" + hVar.f29962e;
                        k.e(str, "tag");
                        if (iVar3 == null) {
                            z zVarD = u0VarO.D(str);
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.e();
                            }
                        } else {
                            hj.a aVar2 = (hj.a) u0VarO.D(str);
                            if (aVar2 == null) {
                                aVar2 = new hj.a();
                                aVar2.f0(false);
                                aVar2.h0(u0VarO, str);
                            }
                            if (aVar2.f25154p0 != null) {
                                aVar2.j0(iVar3);
                            } else {
                                aVar2.f25155q0 = iVar3;
                            }
                        }
                        return u.f37649a;
                    default:
                        List list = (List) obj;
                        h hVar2 = this.f29956b;
                        e eVar2 = hVar2.f29963f;
                        k.b(list);
                        eVar2.getClass();
                        eVar2.f29954i = list;
                        eVar2.notifyDataSetChanged();
                        gj.a aVar3 = hVar2.g;
                        ConstraintLayout constraintLayout = aVar3.f24747f;
                        k.d(constraintLayout, "listDataArea");
                        constraintLayout.setVisibility(0);
                        ProgressBar progressBar2 = aVar3.g;
                        k.d(progressBar2, "progress");
                        progressBar2.setVisibility(8);
                        ImageView imageView = aVar3.f24746e;
                        k.d(imageView, "emptyFile");
                        imageView.setVisibility(list.isEmpty() ? 0 : 8);
                        CardRecyclerView cardRecyclerView2 = aVar3.f24748h;
                        k.d(cardRecyclerView2, "recyclerview");
                        cardRecyclerView2.setVisibility(list.isEmpty() ? 8 : 0);
                        break;
                }
                return u.f37649a;
            }
        }, 8));
    }

    @Override // nj.b
    public final void a(c2 c2Var) {
        k.e(c2Var, "insets");
        v3.b bVarG = c2Var.f22315a.g(647);
        k.d(bVarG, "getInsets(...)");
        int i4 = bVarG.f35796d;
        gj.a aVar = this.g;
        LinearLayout linearLayout = aVar.f24743b;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = a4.a.b(54.0f) + i4;
        linearLayout.setLayoutParams(layoutParams);
        Context context = getContext();
        k.d(context, "getContext(...)");
        b.f(cm.g.n(R.attr.analyzer_content_padding, context), aVar.f24742a, bVarG);
        b.f(0, aVar.g, bVarG);
        b.f(0, aVar.f24746e, bVarG);
        b.f(0, aVar.f24748h, bVarG);
        LinearLayout linearLayout2 = aVar.f24743b;
        linearLayout2.setPadding(bVarG.f35793a, linearLayout2.getPaddingTop(), bVarG.f35795c, i4);
    }

    public final void g() {
        ArrayList arrayList;
        Object obj;
        kj.f fVar = (kj.f) this.f29960c.g.d();
        if (fVar == null || (arrayList = fVar.f28363c) == null) {
            return;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((kj.h) obj).f28371d == this.f29962e) {
                break;
            }
        }
        kj.h hVar = (kj.h) obj;
        if (hVar == null) {
            return;
        }
        gj.a aVar = this.g;
        aVar.f24750k.setText(hVar.f28370c);
        aVar.f24751l.setText(hVar.f28368a);
        aVar.j.setText(hVar.f28369b.getSize());
        ((ec.z) jm.a.f27720a.f1138f).getClass();
    }

    public final e getAdapter() {
        return this.f29963f;
    }

    public final int getAnaType() {
        return this.f29962e;
    }

    public final gj.a getBinding() {
        return this.g;
    }

    @Override // nj.b
    public final int getLayoutId() {
        return R.layout.fa_floating_list_view;
    }

    public final jj.i getOperator() {
        return this.f29961d;
    }

    public final m getViewModel() {
        return this.f29960c;
    }
}
