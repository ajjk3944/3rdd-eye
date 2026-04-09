package y6;

import android.content.Context;
import android.content.res.Resources;
import b9.C2001h;
import b9.p;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import m.C5306c;
import p9.InterfaceC5480a;

/* compiled from: ContextThemeWrapperWithResourceCache.kt */
/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5815a extends C5306c {

    /* renamed from: g, reason: collision with root package name */
    public final p f48187g;

    /* compiled from: ContextThemeWrapperWithResourceCache.kt */
    /* renamed from: y6.a$a, reason: collision with other inner class name */
    public static final class C0558a extends m implements InterfaceC5480a<b> {
        public C0558a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final b invoke() {
            Resources resources = C5815a.super.getResources();
            l.e(resources, "super.getResources()");
            return new b(resources);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5815a(Context baseContext, int i) {
        super(baseContext, i);
        l.f(baseContext, "baseContext");
        this.f48187g = C2001h.b(new C0558a());
    }

    @Override // m.C5306c, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return (Resources) this.f48187g.getValue();
    }
}
