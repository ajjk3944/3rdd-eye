package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bc0 extends ko0 {
    public final /* synthetic */ c a;
    public final /* synthetic */ cc0 b;

    public bc0(cc0 cc0Var, c cVar) {
        this.b = cc0Var;
        this.a = cVar;
    }

    @Override // defpackage.ko0
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iL0;
        vc vcVar = this.a.i;
        cc0 cc0Var = this.b;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) cc0Var.g0.getLayoutManager();
            View viewN0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            iL0 = viewN0 == null ? -1 : ho0.H(viewN0);
        } else {
            iL0 = ((LinearLayoutManager) cc0Var.g0.getLayoutManager()).L0();
        }
        Calendar calendarA = g41.a(vcVar.f.f);
        calendarA.add(2, iL0);
        we0 we0Var = new we0(calendarA);
        cc0Var.c0 = we0Var;
        MaterialButton materialButton = cc0Var.l0;
        Calendar calendarA2 = g41.a(vcVar.f.f);
        calendarA2.add(2, iL0);
        calendarA2.set(5, 1);
        Calendar calendarA3 = g41.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        long timeInMillis = calendarA3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = g41.a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        cc0Var.P(vcVar.f.d(we0Var));
    }
}
