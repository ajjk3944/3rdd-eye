package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class dk implements ov {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26204a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<q62> f26205b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    private int f26206c;

    /* renamed from: d, reason: collision with root package name */
    private sv f26207d;

    public dk(boolean z10) {
        this.f26204a = z10;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void a(q62 q62Var) {
        q62Var.getClass();
        if (this.f26205b.contains(q62Var)) {
            return;
        }
        this.f26205b.add(q62Var);
        this.f26206c++;
    }

    public final void b(sv svVar) {
        for (int i = 0; i < this.f26206c; i++) {
            this.f26205b.get(i).getClass();
        }
    }

    public final void c(int i) {
        sv svVar = this.f26207d;
        int i10 = s82.f32899a;
        for (int i11 = 0; i11 < this.f26206c; i11++) {
            this.f26205b.get(i11).a(svVar, this.f26204a, i);
        }
    }

    public final void e() {
        sv svVar = this.f26207d;
        int i = s82.f32899a;
        for (int i10 = 0; i10 < this.f26206c; i10++) {
            this.f26205b.get(i10).a(svVar, this.f26204a);
        }
        this.f26207d = null;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public /* synthetic */ Map getResponseHeaders() {
        return B3.a(this);
    }

    public final void c(sv svVar) {
        this.f26207d = svVar;
        for (int i = 0; i < this.f26206c; i++) {
            this.f26205b.get(i).b(svVar, this.f26204a);
        }
    }
}
