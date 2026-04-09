package oa;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DateTimeTextProvider.java */
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference<h> f44935a = new AtomicReference<>();

    /* compiled from: DateTimeTextProvider.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f44936a;

        static {
            AtomicReference<h> atomicReference = h.f44935a;
            l lVar = new l();
            while (!atomicReference.compareAndSet(null, lVar) && atomicReference.get() == null) {
            }
            f44936a = h.f44935a.get();
        }
    }

    public abstract String a(qa.a aVar, long j4, m mVar, Locale locale);
}
