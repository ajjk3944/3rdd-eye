package defpackage;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cl extends Filter {
    public final /* synthetic */ int a = 0;
    public Filterable b;

    public /* synthetic */ cl() {
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        switch (this.a) {
            case 0:
                return ((zy0) ((bl) this.b)).c((Cursor) obj);
            default:
                return super.convertResultToString(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r7) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L6b;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "charSequence"
            defpackage.i30.m(r7, r0)
            java.lang.String r7 = r7.toString()
            android.widget.Filterable r0 = r6.b
            jr0 r0 = (defpackage.jr0) r0
            int r1 = r7.length()
            r2 = 1
            if (r1 != 0) goto L1b
            r1 = r2
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 != r2) goto L21
            java.util.ArrayList r7 = r0.i
            goto L59
        L21:
            if (r1 != 0) goto L65
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = r0.i
            java.util.Iterator r3 = r3.iterator()
            java.lang.String r4 = "iterator(...)"
            defpackage.i30.l(r3, r4)
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r3.next()
            java.lang.String r5 = "next(...)"
            defpackage.i30.l(r4, r5)
            hr0 r4 = (defpackage.hr0) r4
            java.lang.String r5 = r4.a
            boolean r5 = defpackage.sy0.y(r5, r7, r2)
            if (r5 != 0) goto L54
            java.lang.String r5 = r4.b
            boolean r5 = defpackage.sy0.y(r5, r7, r2)
            if (r5 == 0) goto L33
        L54:
            r1.add(r4)
            goto L33
        L58:
            r7 = r1
        L59:
            r0.j = r7
            android.widget.Filter$FilterResults r7 = new android.widget.Filter$FilterResults
            r7.<init>()
            java.util.ArrayList r0 = r0.j
            r7.values = r0
            return r7
        L65:
            rg r7 = new rg
            r7.<init>()
            throw r7
        L6b:
            android.widget.Filterable r0 = r6.b
            bl r0 = (defpackage.bl) r0
            zy0 r0 = (defpackage.zy0) r0
            androidx.appcompat.widget.SearchView r1 = r0.p
            if (r7 != 0) goto L78
            java.lang.String r7 = ""
            goto L7c
        L78:
            java.lang.String r7 = r7.toString()
        L7c:
            int r2 = r1.getVisibility()
            r3 = 0
            if (r2 != 0) goto L96
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L8a
            goto L96
        L8a:
            android.app.SearchableInfo r1 = r0.q     // Catch: java.lang.RuntimeException -> L96
            android.database.Cursor r7 = r0.j(r1, r7)     // Catch: java.lang.RuntimeException -> L96
            if (r7 == 0) goto L96
            r7.getCount()     // Catch: java.lang.RuntimeException -> L96
            goto L97
        L96:
            r7 = r3
        L97:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r7 == 0) goto La7
            int r1 = r7.getCount()
            r0.count = r1
            r0.values = r7
            goto Lac
        La7:
            r7 = 0
            r0.count = r7
            r0.values = r3
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        switch (this.a) {
            case 0:
                bl blVar = (bl) this.b;
                Cursor cursor = blVar.h;
                Object obj = filterResults.values;
                if (obj != null && obj != cursor) {
                    ((zy0) blVar).b((Cursor) obj);
                    break;
                }
                break;
            default:
                i30.m(charSequence, "charSequence");
                i30.m(filterResults, "filterResults");
                jr0 jr0Var = (jr0) this.b;
                Object obj2 = filterResults.values;
                i30.k(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.phuongpn.whousemywifi.networkscanner.model.RouterModel>");
                jr0Var.j = (ArrayList) obj2;
                jr0Var.f.b();
                break;
        }
    }

    public cl(jr0 jr0Var) {
        this.b = jr0Var;
    }
}
