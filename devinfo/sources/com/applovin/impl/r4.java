package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.p0;
import com.applovin.impl.r2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class r4 extends r2 {

    /* renamed from: n, reason: collision with root package name */
    private final p0.a f5253n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f5254o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f5255p;

    public r4(p0.a aVar, boolean z3, Context context) {
        super(r2.c.RIGHT_DETAIL);
        this.f5253n = aVar;
        this.f5254o = context;
        this.f5190c = new SpannedString(aVar.a());
        this.f5255p = z3;
    }

    @Override // com.applovin.impl.r2
    public SpannedString f() {
        return new SpannedString(this.f5253n.a(this.f5254o));
    }

    @Override // com.applovin.impl.r2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.r2
    public boolean p() {
        Boolean boolB = this.f5253n.b(this.f5254o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f5255p));
        }
        return false;
    }
}
