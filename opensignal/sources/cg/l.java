package cg;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import lf.t1;
import wt.w;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final h4.e f3760b = new h4.e("fire-global");

    /* renamed from: c, reason: collision with root package name */
    public static final h4.e f3761c = new h4.e("fire-count");

    /* renamed from: d, reason: collision with root package name */
    public static final h4.e f3762d = new h4.e("last-used-date");

    /* renamed from: a, reason: collision with root package name */
    public final uf.b f3763a;

    public l(Context context, String str) {
        this.f3763a = new uf.b(context, c7.a.p("FirebaseHeartBeat", str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            uf.b bVar = this.f3763a;
            bVar.getClass();
            for (Map.Entry entry : ((Map) w.w(pq.i.f20621a, new cq.h(bVar, null, 8))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((h4.e) entry.getKey()).f9895a, new ArrayList(hashSet)));
                    }
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f3763a.a(new ar.k() { // from class: cg.k
                    @Override // ar.k
                    public final Object a(Object obj) {
                        ((h4.b) obj).d(l.f3760b, Long.valueOf(jCurrentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        Instant instant = new Date(j).toInstant();
        ZoneOffset unused = ZoneOffset.UTC;
        LocalDateTime localDateTime = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
        DateTimeFormatter unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized h4.e c(h4.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return t1.F(((h4.e) entry.getKey()).f9895a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(h4.b bVar, String str) {
        try {
            h4.e eVarC = c(bVar, str);
            if (eVarC == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) xu.l.x(bVar, eVarC, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                bVar.c(eVarC);
            } else {
                bVar.e(eVarC, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean e(h4.e eVar, long j) {
        pq.c cVar;
        pq.i iVar;
        long jLongValue;
        uf.b bVar = this.f3763a;
        bVar.getClass();
        br.l.e(eVar, "key");
        cVar = null;
        a8.h hVar = new a8.h(bVar, eVar, cVar, 19);
        iVar = pq.i.f20621a;
        jLongValue = ((Long) w.w(iVar, hVar)).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j))) {
            return false;
        }
        uf.b bVar2 = this.f3763a;
        Long lValueOf = Long.valueOf(j);
        bVar2.getClass();
        return true;
    }
}
