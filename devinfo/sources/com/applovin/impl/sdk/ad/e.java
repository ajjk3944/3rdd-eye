package com.applovin.impl.sdk.ad;

import com.applovin.impl.h5;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements s.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f5444b;

    public /* synthetic */ e(b bVar, int i4) {
        this.f5443a = i4;
        this.f5444b = bVar;
    }

    @Override // s.a
    public final Object apply(Object obj) {
        switch (this.f5443a) {
            case 0:
                return this.f5444b.o((h5) obj);
            case 1:
                return this.f5444b.a((h5) obj);
            case 2:
                return this.f5444b.i((h5) obj);
            case 3:
                return this.f5444b.d((h5) obj);
            case 4:
                return this.f5444b.g((h5) obj);
            case 5:
                return this.f5444b.k((h5) obj);
            case 6:
                return this.f5444b.e((h5) obj);
            case 7:
                return this.f5444b.b((h5) obj);
            case 8:
                return this.f5444b.f((h5) obj);
            case 9:
                return this.f5444b.j((h5) obj);
            case 10:
                return this.f5444b.a((JSONArray) obj);
            case 11:
                return this.f5444b.p((h5) obj);
            default:
                return this.f5444b.c((h5) obj);
        }
    }
}
