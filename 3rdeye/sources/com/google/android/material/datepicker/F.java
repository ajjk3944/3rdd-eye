package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.j;
import java.util.Calendar;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes2.dex */
public final class F implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f22772c;

    public F(G g10, int i) {
        this.f22772c = g10;
        this.f22771b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j<?> jVar = this.f22772c.f22773j;
        v vVarA = v.a(this.f22771b, jVar.f22814g.f22876c);
        C4009a c4009a = jVar.f22812e;
        v vVar = c4009a.f22777b;
        Calendar calendar = vVar.f22875b;
        Calendar calendar2 = vVarA.f22875b;
        if (calendar2.compareTo(calendar) < 0) {
            vVarA = vVar;
        } else {
            v vVar2 = c4009a.f22778c;
            if (calendar2.compareTo(vVar2.f22875b) > 0) {
                vVarA = vVar2;
            }
        }
        jVar.d(vVarA);
        jVar.e(j.d.DAY);
    }
}
