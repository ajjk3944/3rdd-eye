package Q6;

import K6.C0713c;
import Z6.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import c9.C2092m;
import c9.C2097r;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: VariableMonitorView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class q extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final Context f11369b;

    /* renamed from: c, reason: collision with root package name */
    public final l f11370c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f11371d;

    /* compiled from: VariableMonitorView.kt */
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements p9.l<List<? extends b9.l<? extends String, ? extends Z6.d>>, C1992A> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p9.l
        public final C1992A invoke(List<? extends b9.l<? extends String, ? extends Z6.d>> list) {
            String str;
            List<? extends b9.l<? extends String, ? extends Z6.d>> p02 = list;
            kotlin.jvm.internal.l.f(p02, "p0");
            q qVar = (q) this.receiver;
            qVar.getClass();
            List<? extends b9.l<? extends String, ? extends Z6.d>> list2 = p02;
            ArrayList arrayList = new ArrayList(C2092m.T(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                b9.l lVar = (b9.l) it.next();
                String str2 = (String) lVar.f18083b;
                Z6.d dVar = (Z6.d) lVar.f18084c;
                String strA = dVar.a();
                if (dVar instanceof d.a) {
                    str = "array";
                } else if (dVar instanceof d.b) {
                    str = "boolean";
                } else if (dVar instanceof d.c) {
                    str = "color";
                } else if (dVar instanceof d.C0207d) {
                    str = "dict";
                } else if (dVar instanceof d.e) {
                    str = "number";
                } else if (dVar instanceof d.f) {
                    str = "integer";
                } else if (dVar instanceof d.g) {
                    str = "string";
                } else {
                    if (!(dVar instanceof d.h)) {
                        throw new b9.j();
                    }
                    str = ImagesContract.URL;
                }
                arrayList.add(new n(strA, str2, str, dVar.b().toString()));
            }
            qVar.f11370c.submitList(arrayList, new C8.a(qVar, 3));
            return C1992A.f18074a;
        }
    }

    /* compiled from: VariableMonitorView.kt */
    public /* synthetic */ class b extends kotlin.jvm.internal.k implements p9.q<String, String, String, C1992A> {
        @Override // p9.q
        public final C1992A invoke(String str, String str2, String str3) {
            String p02 = str;
            String p12 = str2;
            String p22 = str3;
            kotlin.jvm.internal.l.f(p02, "p0");
            kotlin.jvm.internal.l.f(p12, "p1");
            kotlin.jvm.internal.l.f(p22, "p2");
            p pVar = (p) this.receiver;
            pVar.getClass();
            Z6.d dVar = (Z6.d) pVar.f11366b.get(new b9.l(p12, p02));
            if (!String.valueOf(dVar != null ? dVar.b() : null).equals(p22) && dVar != null) {
                try {
                    dVar.d(p22);
                } catch (Exception unused) {
                    pVar.f11365a.invoke(new Z6.f(2, Oo.h("Unable to set '", p22, "' value to variable '", p02, "'."), null));
                }
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(Context context, p pVar) {
        super(context);
        this.f11369b = context;
        this.f11370c = new l(new b(3, pVar, p.class, "mutateVariable", "mutateVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0));
        LinearLayout linearLayout = new LinearLayout(context);
        List listW = C2092m.W(200, 60, 100);
        List<String> listW2 = C2092m.W(AppMeasurementSdk.ConditionalUserProperty.NAME, "type", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ArrayList arrayList = new ArrayList(C2092m.T(listW2, 10));
        for (String str : listW2) {
            TextView textView = new TextView(context);
            DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            int iC = C0713c.C(8, displayMetrics);
            textView.setPadding(iC, iC, iC, iC);
            textView.setTextColor(-1);
            textView.setText(str);
            textView.setTypeface(textView.getTypeface(), 1);
            arrayList.add(textView);
        }
        Iterator it = C2097r.M0(listW, arrayList).iterator();
        while (it.hasNext()) {
            b9.l lVar = (b9.l) it.next();
            TextView textView2 = (TextView) lVar.f18083b;
            Integer numValueOf = Integer.valueOf(((Number) lVar.f18084c).intValue());
            DisplayMetrics displayMetrics2 = linearLayout.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics2, "resources.displayMetrics");
            linearLayout.addView(textView2, new LinearLayout.LayoutParams(C0713c.C(numValueOf, displayMetrics2), -2));
        }
        this.f11371d = linearLayout;
        setOrientation(1);
        pVar.f11367c = new a(1, this, q.class, "updateTable", "updateTable(Ljava/util/List;)V", 0);
        pVar.a();
        addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        RecyclerView recyclerView = new RecyclerView(this.f11369b);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(this.f11370c);
        recyclerView.setBackgroundColor(Color.argb(50, 0, 0, 0));
        addView(recyclerView, new LinearLayout.LayoutParams(-1, -2));
    }
}
