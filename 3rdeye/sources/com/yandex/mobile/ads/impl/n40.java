package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import com.yandex.mobile.ads.impl.at;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class n40 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f30754a;

        /* renamed from: b, reason: collision with root package name */
        private final at.a f30755b;

        /* renamed from: c, reason: collision with root package name */
        private final long f30756c;

        public a(String adBreakType, at.a adBreakPositionType, long j4) {
            kotlin.jvm.internal.l.f(adBreakType, "adBreakType");
            kotlin.jvm.internal.l.f(adBreakPositionType, "adBreakPositionType");
            this.f30754a = adBreakType;
            this.f30755b = adBreakPositionType;
            this.f30756c = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f30754a, aVar.f30754a) && this.f30755b == aVar.f30755b && this.f30756c == aVar.f30756c;
        }

        public final int hashCode() {
            int iHashCode = (this.f30755b.hashCode() + (this.f30754a.hashCode() * 31)) * 31;
            long j4 = this.f30756c;
            return ((int) (j4 ^ (j4 >>> 32))) + iHashCode;
        }

        public final String toString() {
            String str = this.f30754a;
            at.a aVar = this.f30755b;
            long j4 = this.f30756c;
            StringBuilder sb = new StringBuilder("AdBreakSignature(adBreakType=");
            sb.append(str);
            sb.append(", adBreakPositionType=");
            sb.append(aVar);
            sb.append(", adBreakPositionValue=");
            return C1094a9.f(sb, j4, ")");
        }
    }

    public static ArrayList a(ArrayList adBreaks) {
        kotlin.jvm.internal.l.f(adBreaks, "adBreaks");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = adBreaks.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            zs zsVar = (zs) next;
            if (hashSet.add(new a(zsVar.e(), zsVar.b().a(), zsVar.b().b()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
