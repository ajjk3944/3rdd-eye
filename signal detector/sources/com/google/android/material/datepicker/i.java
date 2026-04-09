package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.U;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i extends U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f18279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f18280b;

    public i(j jVar, q qVar) {
        this.f18280b = jVar;
        this.f18279a = qVar;
    }

    @Override // androidx.recyclerview.widget.U
    public final void onScrolled(RecyclerView recyclerView, int i, int i3) {
        String dateTime;
        b bVar = this.f18279a.f18335a;
        j jVar = this.f18280b;
        int iFindFirstVisibleItemPosition = i < 0 ? ((LinearLayoutManager) jVar.f18287r0.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) jVar.f18287r0.getLayoutManager()).findLastVisibleItemPosition();
        Calendar calendarA = u.a(bVar.f18259a.f18319a);
        calendarA.add(2, iFindFirstVisibleItemPosition);
        m mVar = new m(calendarA);
        jVar.f18283n0 = mVar;
        MaterialButton materialButton = jVar.f18291w0;
        Calendar calendarA2 = u.a(bVar.f18259a.f18319a);
        calendarA2.add(2, iFindFirstVisibleItemPosition);
        calendarA2.set(5, 1);
        Calendar calendarA3 = u.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        long timeInMillis = calendarA3.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = u.f18340a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            DisplayContext unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            dateTime = instanceForSkeleton.format(new Date(timeInMillis));
        } else {
            dateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        materialButton.setText(dateTime);
        jVar.Z(bVar.f18259a.d(mVar));
    }
}
