package rj;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: rj.k2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7719k2 extends C7712j2 {

    /* renamed from: c, reason: collision with root package name */
    private final org.kodein.di.h f60611c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7719k2(uj.e binding, String str, org.kodein.di.h tree) {
        super(binding, str);
        AbstractC6492s.i(binding, "binding");
        AbstractC6492s.i(tree, "tree");
        this.f60611c = tree;
    }

    public final org.kodein.di.h c() {
        return this.f60611c;
    }
}
