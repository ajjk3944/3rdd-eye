package hn;

import android.content.Context;
import br.l;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.utils.q;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10852a;

    /* renamed from: b, reason: collision with root package name */
    public final a f10853b;

    /* renamed from: c, reason: collision with root package name */
    public long f10854c;

    /* renamed from: d, reason: collision with root package name */
    public long f10855d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10856e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10857f;

    public b(MainActivity mainActivity, long j, a aVar) {
        l.e(mainActivity, "context");
        this.f10852a = mainActivity;
        this.f10853b = aVar;
        this.f10854c = -1L;
        this.f10855d = -1L;
        long j7 = q.c(mainActivity).getLong("first_use_time", 0L);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(j - q.c(mainActivity).getLong("shown_rate_dialog_time", 0L));
        long days2 = timeUnit.toDays(j - j7);
        boolean z10 = false;
        boolean z11 = q.c(mainActivity).getLong("shown_rate_dialog_time", 0L) == 0;
        this.f10856e = !z11 && days >= ((long) aVar.f10846a);
        if (z11 && days2 >= aVar.f10847b) {
            z10 = true;
        }
        this.f10857f = z10;
    }
}
