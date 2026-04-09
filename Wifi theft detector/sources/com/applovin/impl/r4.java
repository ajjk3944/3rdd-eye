package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.p0;
import com.applovin.impl.r2;

/* loaded from: classes.dex */
public class r4 extends r2 {

    /* renamed from: n, reason: collision with root package name */
    private final p0.a f7495n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f7496o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f7497p;

    public r4(p0.a aVar, boolean z10, Context context) {
        super(r2.c.RIGHT_DETAIL);
        this.f7495n = aVar;
        this.f7496o = context;
        this.f7423c = new SpannedString(aVar.a());
        this.f7497p = z10;
    }

    @Override // com.applovin.impl.r2
    public SpannedString f() {
        return new SpannedString(this.f7495n.a(this.f7496o));
    }

    @Override // com.applovin.impl.r2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.r2
    public boolean p() {
        Boolean boolB = this.f7495n.b(this.f7496o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f7497p));
        }
        return false;
    }
}
