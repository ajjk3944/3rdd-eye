package l8;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.v;
import com.google.android.gms.internal.measurement.e5;
import h7.h0;
import java.util.LinkedHashMap;
import java.util.List;
import mq.b0;
import mq.w;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14911a;

    /* renamed from: b, reason: collision with root package name */
    public c f14912b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14913c;

    /* renamed from: d, reason: collision with root package name */
    public n8.a f14914d;

    /* renamed from: e, reason: collision with root package name */
    public List f14915e;

    /* renamed from: f, reason: collision with root package name */
    public final fh.f f14916f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f14917g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14918h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14919i;
    public final h0 j;
    public androidx.lifecycle.o k;

    /* renamed from: l, reason: collision with root package name */
    public m8.i f14920l;

    /* renamed from: m, reason: collision with root package name */
    public m8.g f14921m;

    public i(Context context) {
        this.f14911a = context;
        this.f14912b = q8.f.f20732a;
        this.f14913c = null;
        this.f14914d = null;
        this.f14915e = w.f16945a;
        this.f14916f = null;
        this.f14917g = null;
        this.f14918h = true;
        this.f14919i = true;
        this.j = null;
        this.k = null;
        this.f14920l = null;
        this.f14921m = null;
    }

    public final j a() {
        wt.q qVar;
        Object obj;
        Object obj2 = this.f14913c;
        if (obj2 == null) {
            obj2 = l.f14946b;
        }
        Object obj3 = obj2;
        n8.a aVar = this.f14914d;
        c cVar = this.f14912b;
        Bitmap.Config config = cVar.f14903g;
        m8.d dVar = cVar.f14902f;
        List list = this.f14915e;
        p8.a aVar2 = cVar.f14901e;
        fh.f fVar = this.f14916f;
        ou.s sVarF = fVar != null ? fVar.f() : null;
        if (sVarF == null) {
            sVarF = q8.i.f20738c;
        } else {
            Bitmap.Config[] configArr = q8.i.f20736a;
        }
        ou.s sVar = sVarF;
        LinkedHashMap linkedHashMap = this.f14917g;
        r rVar = linkedHashMap != null ? new r(e5.S(linkedHashMap)) : null;
        if (rVar == null) {
            rVar = r.f14970b;
        }
        r rVar2 = rVar;
        c cVar2 = this.f14912b;
        boolean z10 = cVar2.f14904h;
        cVar2.getClass();
        c cVar3 = this.f14912b;
        b bVar = cVar3.f14905i;
        b bVar2 = cVar3.j;
        b bVar3 = cVar3.k;
        wt.q qVar2 = cVar3.f14897a;
        wt.q qVar3 = cVar3.f14898b;
        wt.q qVar4 = cVar3.f14899c;
        wt.q qVar5 = cVar3.f14900d;
        androidx.lifecycle.o oVarH = this.k;
        Context context = this.f14911a;
        if (oVarH == null) {
            n8.a aVar3 = this.f14914d;
            qVar = qVar5;
            Object context2 = aVar3 instanceof n8.a ? aVar3.getView().getContext() : context;
            while (true) {
                if (context2 instanceof v) {
                    oVarH = ((v) context2).h();
                    break;
                }
                if (!(context2 instanceof ContextWrapper)) {
                    oVarH = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (oVarH == null) {
                oVarH = h.f14909g;
            }
        } else {
            qVar = qVar5;
        }
        androidx.lifecycle.o oVar = oVarH;
        m8.i cVar4 = this.f14920l;
        if (cVar4 == null) {
            n8.a aVar4 = this.f14914d;
            if (aVar4 instanceof n8.a) {
                View view = aVar4.getView();
                if (view instanceof ImageView) {
                    ImageView.ScaleType scaleType = ((ImageView) view).getScaleType();
                    obj = obj3;
                    if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                        m8.h hVar = m8.h.f16324c;
                        cVar4 = new m8.e();
                    }
                } else {
                    obj = obj3;
                }
                cVar4 = new m8.f(view);
            } else {
                obj = obj3;
                cVar4 = new m8.c(context);
            }
        } else {
            obj = obj3;
        }
        m8.i iVar = cVar4;
        m8.g gVar = this.f14921m;
        if (gVar == null) {
            n8.a aVar5 = this.f14914d;
            if (!(aVar5 instanceof n8.a)) {
                aVar5 = null;
            }
            View view2 = aVar5 != null ? aVar5.getView() : null;
            if (view2 instanceof ImageView) {
                Bitmap.Config[] configArr2 = q8.i.f20736a;
                ImageView.ScaleType scaleType2 = ((ImageView) view2).getScaleType();
                int i10 = scaleType2 == null ? -1 : q8.h.f20734a[scaleType2.ordinal()];
                gVar = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? m8.g.FIT : m8.g.FILL;
            } else {
                gVar = m8.g.FIT;
            }
        }
        m8.g gVar2 = gVar;
        h0 h0Var = this.j;
        o oVar2 = h0Var != null ? new o(e5.S((LinkedHashMap) h0Var.f10078a)) : null;
        if (oVar2 == null) {
            oVar2 = o.f14961d;
        }
        return new j(context, obj, aVar, config, dVar, list, aVar2, sVar, rVar2, this.f14918h, z10, false, this.f14919i, bVar, bVar2, bVar3, qVar2, qVar3, qVar4, qVar, oVar, iVar, gVar2, oVar2, new d(), this.f14912b);
    }

    public i(j jVar, Context context) {
        this.f14911a = context;
        this.f14912b = jVar.f14945z;
        this.f14913c = jVar.f14923b;
        this.f14914d = jVar.f14924c;
        this.f14915e = jVar.f14927f;
        this.f14916f = jVar.f14929h.c();
        this.f14917g = b0.Y(jVar.f14930i.f14971a);
        this.f14918h = jVar.j;
        this.f14919i = jVar.f14932m;
        o oVar = jVar.f14943x;
        h0 h0Var = new h0();
        h0Var.f10078a = b0.Y(oVar.f14962a);
        this.j = h0Var;
        if (jVar.f14922a == context) {
            this.k = jVar.f14940u;
            this.f14920l = jVar.f14941v;
            this.f14921m = jVar.f14942w;
        } else {
            this.k = null;
            this.f14920l = null;
            this.f14921m = null;
        }
    }
}
