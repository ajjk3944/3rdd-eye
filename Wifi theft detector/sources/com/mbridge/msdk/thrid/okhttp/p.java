package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class p extends z {

    /* renamed from: c, reason: collision with root package name */
    private static final u f18022c = u.a("application/x-www-form-urlencoded");

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f18023a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f18024b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f18025a;

        /* renamed from: b, reason: collision with root package name */
        private final List<String> f18026b;

        /* renamed from: c, reason: collision with root package name */
        private final Charset f18027c;

        public a() {
            this(null);
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f18025a.add(s.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f18027c));
            this.f18026b.add(s.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f18027c));
            return this;
        }

        public a(Charset charset) {
            this.f18025a = new ArrayList();
            this.f18026b = new ArrayList();
            this.f18027c = charset;
        }

        public p a() {
            return new p(this.f18025a, this.f18026b);
        }
    }

    public p(List<String> list, List<String> list2) {
        this.f18023a = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        this.f18024b = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public long a() {
        return a((com.mbridge.msdk.thrid.okio.d) null, true);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public u b() {
        return f18022c;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
        a(dVar, false);
    }

    private long a(@Nullable com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        com.mbridge.msdk.thrid.okio.c cVarA;
        if (z10) {
            cVarA = new com.mbridge.msdk.thrid.okio.c();
        } else {
            cVarA = dVar.a();
        }
        int size = this.f18023a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                cVarA.writeByte(38);
            }
            cVarA.a(this.f18023a.get(i10));
            cVarA.writeByte(61);
            cVarA.a(this.f18024b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = cVarA.size();
        cVarA.k();
        return size2;
    }
}
