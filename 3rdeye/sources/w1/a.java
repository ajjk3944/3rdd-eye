package W1;

import B7.d;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.m;
import androidx.work.n;

/* compiled from: SystemJobInfoConverter.java */
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f13319c = m.g("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f13320a;

    /* renamed from: b, reason: collision with root package name */
    public final d f13321b;

    /* compiled from: SystemJobInfoConverter.java */
    /* renamed from: W1.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0190a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13322a;

        static {
            int[] iArr = new int[n.values().length];
            f13322a = iArr;
            try {
                iArr[n.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13322a[n.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13322a[n.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13322a[n.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13322a[n.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(Context context, d dVar) {
        this.f13321b = dVar;
        this.f13320a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
