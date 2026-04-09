package oa;

import java.util.Locale;
import java.util.Map;
import oa.l;

/* compiled from: DateTimeFormatterBuilder.java */
/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l.b f44926b;

    public c(l.b bVar) {
        this.f44926b = bVar;
    }

    @Override // oa.h
    public final String a(qa.a aVar, long j4, m mVar, Locale locale) {
        Map<Long, String> map = this.f44926b.f44940a.get(mVar);
        if (map != null) {
            return map.get(Long.valueOf(j4));
        }
        return null;
    }
}
