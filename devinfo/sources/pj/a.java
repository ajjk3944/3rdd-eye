package pj;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.measurement.j4;
import com.liuzh.deviceinfo.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import nj.d;
import nk.k;
import wi.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends d implements ql.d {

    /* renamed from: m, reason: collision with root package name */
    public final Context f32020m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, jj.d dVar) {
        super(context, dVar);
        k.e(context, "context");
        k.e(dVar, "operator");
        this.f32020m = context;
    }

    @Override // ql.d
    public final String a(int i4, View view) {
        k.e(view, "view");
        if (i4 < 0 || i4 >= this.f29954i.size()) {
            return "";
        }
        long j = ((aj.b) this.f29954i.get(i4)).f407b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.DAYS.toMillis(1L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.US);
        String str = simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis));
        String str2 = simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis - millis));
        String str3 = simpleDateFormat.format(Long.valueOf(j));
        boolean zEquals = TextUtils.equals(str3, str);
        Context context = this.f32020m;
        if (zEquals) {
            String string = context.getString(R.string.fa_today);
            k.d(string, "getString(...)");
            return string;
        }
        if (TextUtils.equals(str3, str2)) {
            String string2 = context.getString(R.string.fa_yesterday);
            k.d(string2, "getString(...)");
            return string2;
        }
        Context context2 = pk.a.f32022a;
        k.b(context2);
        if (k.a(j4.q(context2).getLanguage(), new Locale("zh").getLanguage()) && TextUtils.equals(simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis - (2 * millis))), str3)) {
            String string3 = context.getString(R.string.fa_day_before_yesterday);
            k.d(string3, "getString(...)");
            return string3;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return calendar.get(1) == calendar2.get(1) ? c.h(j, true, false) : c.h(j, true, true);
    }
}
