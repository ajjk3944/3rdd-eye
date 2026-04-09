package com.mbridge.msdk.config.component.common.express.operator.parts;

import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.express.e;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private d f13193a;

    /* renamed from: b, reason: collision with root package name */
    private e f13194b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.express.node.d f13195c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f13196d;

    public b(d dVar, e eVar, com.mbridge.msdk.config.component.common.express.node.d dVar2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f13195c = dVar2;
        this.f13193a = dVar;
        this.f13194b = eVar;
        this.f13196d = aVar;
    }

    public void a(Object obj) {
        this.f13196d.a("this", obj);
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return this.f13195c.a(this.f13193a, this.f13194b, this.f13196d);
    }
}
