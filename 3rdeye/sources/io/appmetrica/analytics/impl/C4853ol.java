package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4853ol {

    /* renamed from: a, reason: collision with root package name */
    public final Vc f41392a;

    /* renamed from: b, reason: collision with root package name */
    public final Uc f41393b;

    public C4853ol(PublicLogger publicLogger, String str) {
        this(new Vc(str, publicLogger), new Uc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Yc yc, String str, String str2) {
        try {
            int size = yc.size();
            int i = this.f41392a.f40283c.f39559a;
            if (size < i || (i == yc.size() && yc.containsKey(str))) {
                this.f41393b.getClass();
                int length = yc.f40417a;
                if (str2 != null) {
                    length += str2.length();
                }
                if (yc.containsKey(str)) {
                    String str3 = (String) yc.get(str);
                    if (str3 != null) {
                        length -= str3.length();
                    }
                } else {
                    length += str.length();
                }
                if (length <= 4500) {
                    yc.put(str, str2);
                    return true;
                }
                Uc uc = this.f41393b;
                uc.f40239b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", uc.f40238a, 4500, str);
            } else {
                Vc vc = this.f41392a;
                vc.f40284d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", vc.f40285e, Integer.valueOf(vc.f40283c.f39559a), str);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(Yc yc, String str, String str2) {
        if (yc == null) {
            return false;
        }
        String strA = this.f41392a.f40281a.a(str);
        String strA2 = this.f41392a.f40282b.a(str2);
        if (!yc.containsKey(strA)) {
            if (strA2 != null) {
                return a(yc, strA, strA2);
            }
            return false;
        }
        String str3 = (String) yc.get(strA);
        if (strA2 == null || !strA2.equals(str3)) {
            return a(yc, strA, strA2);
        }
        return false;
    }

    public C4853ol(Vc vc, Uc uc) {
        this.f41392a = vc;
        this.f41393b = uc;
    }
}
