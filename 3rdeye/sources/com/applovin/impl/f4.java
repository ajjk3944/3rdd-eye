package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.AbstractC2130l0;
import com.applovin.impl.j2;

/* loaded from: classes.dex */
public class f4 extends j2 {

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC2130l0.a f19348n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f19349o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f19350p;

    public f4(AbstractC2130l0.a aVar, boolean z10, Context context) {
        super(j2.c.RIGHT_DETAIL);
        this.f19348n = aVar;
        this.f19349o = context;
        this.f19557c = new SpannedString(aVar.a());
        this.f19350p = z10;
    }

    @Override // com.applovin.impl.j2
    public SpannedString f() {
        return new SpannedString(this.f19348n.a(this.f19349o));
    }

    @Override // com.applovin.impl.j2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.j2
    public boolean p() {
        Boolean boolB = this.f19348n.b(this.f19349o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f19350p));
        }
        return false;
    }
}
