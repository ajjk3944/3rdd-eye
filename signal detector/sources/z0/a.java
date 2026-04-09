package Z0;

import V0.m;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f4516b = m.h("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f4517a;

    public a(Context context) {
        this.f4517a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
