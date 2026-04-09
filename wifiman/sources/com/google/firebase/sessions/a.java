package com.google.firebase.sessions;

import com.google.firebase.l;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1221a f38927a = C1221a.f38928a;

    /* renamed from: com.google.firebase.sessions.a$a, reason: collision with other inner class name */
    public static final class C1221a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C1221a f38928a = new C1221a();

        private C1221a() {
        }

        public final a a() {
            Object objJ = l.a(com.google.firebase.c.f38628a).j(a.class);
            AbstractC6492s.h(objJ, "Firebase.app[SessionDatastore::class.java]");
            return (a) objJ;
        }
    }

    String a();

    void b(String str);
}
