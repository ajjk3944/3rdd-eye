package com.google.firebase.sessions;

import com.google.firebase.l;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import mh.InterfaceC6824a;
import o5.I;
import o5.y;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final b f38931f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final I f38932a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f38933b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38934c;

    /* renamed from: d, reason: collision with root package name */
    private int f38935d;

    /* renamed from: e, reason: collision with root package name */
    private y f38936e;

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38937a = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            Object objJ = l.a(com.google.firebase.c.f38628a).j(c.class);
            AbstractC6492s.h(objJ, "Firebase.app[SessionGenerator::class.java]");
            return (c) objJ;
        }

        private b() {
        }
    }

    public c(I timeProvider, InterfaceC6824a uuidGenerator) {
        AbstractC6492s.i(timeProvider, "timeProvider");
        AbstractC6492s.i(uuidGenerator, "uuidGenerator");
        this.f38932a = timeProvider;
        this.f38933b = uuidGenerator;
        this.f38934c = b();
        this.f38935d = -1;
    }

    private final String b() {
        String string = ((UUID) this.f38933b.invoke()).toString();
        AbstractC6492s.h(string, "uuidGenerator().toString()");
        String lowerCase = t.L(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final y a() {
        int i10 = this.f38935d + 1;
        this.f38935d = i10;
        this.f38936e = new y(i10 == 0 ? this.f38934c : b(), this.f38934c, this.f38935d, this.f38932a.a());
        return c();
    }

    public final y c() {
        y yVar = this.f38936e;
        if (yVar != null) {
            return yVar;
        }
        AbstractC6492s.v("currentSession");
        return null;
    }

    public /* synthetic */ c(I i10, InterfaceC6824a interfaceC6824a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? a.f38937a : interfaceC6824a);
    }
}
