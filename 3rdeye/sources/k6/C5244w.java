package k6;

import H6.C0672i;
import N7.Z;
import b9.C1992A;
import java.util.ArrayList;
import z6.C5865d;

/* compiled from: DivActionTypedSubmitHandler.kt */
/* renamed from: k6.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5244w implements InterfaceC5234m {

    /* renamed from: a, reason: collision with root package name */
    public final j6.u f43424a;

    /* compiled from: DivActionTypedSubmitHandler.kt */
    /* renamed from: k6.w$a */
    public static final class a extends i7.i<C1992A> {

        /* renamed from: b, reason: collision with root package name */
        public final String f43425b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f43426c;

        public a(String id) {
            kotlin.jvm.internal.l.f(id, "id");
            this.f43425b = id;
            this.f43426c = new ArrayList();
        }

        @Override // i7.i
        public final C1992A d(C0672i context, Z data, C5865d path) {
            kotlin.jvm.internal.l.f(data, "data");
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(path, "path");
            if (kotlin.jvm.internal.l.b(data.d().getId(), this.f43425b)) {
                this.f43426c.add(new b9.q(data, context, path));
            }
            return C1992A.f18074a;
        }
    }

    public C5244w(j6.u uVar) {
        this.f43424a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    @Override // k6.InterfaceC5234m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r17, N7.AbstractC1192h2 r18, H6.C0675l r19, A7.d r20) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.C5244w.a(java.lang.String, N7.h2, H6.l, A7.d):boolean");
    }
}
