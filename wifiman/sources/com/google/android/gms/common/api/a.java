package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.InterfaceC4275d;
import com.google.android.gms.common.api.internal.InterfaceC4282k;
import java.util.Set;
import r3.C7566d;
import s3.AbstractC7888c;
import s3.AbstractC7901p;
import s3.C7889d;
import s3.InterfaceC7895j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1198a f34727a;

    /* renamed from: b, reason: collision with root package name */
    private final g f34728b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34729c;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1198a extends e {
        public f a(Context context, Looper looper, C7889d c7889d, Object obj, e.a aVar, e.b bVar) {
            return b(context, looper, c7889d, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C7889d c7889d, Object obj, InterfaceC4275d interfaceC4275d, InterfaceC4282k interfaceC4282k) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final C1199a f34730a = new C1199a(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public static final class C1199a implements d {
            /* synthetic */ C1199a(i iVar) {
            }
        }
    }

    public static abstract class e {
    }

    public interface f extends b {
        Set a();

        void b(String str);

        boolean c();

        String d();

        void disconnect();

        void e(AbstractC7888c.e eVar);

        void f(AbstractC7888c.InterfaceC2135c interfaceC2135c);

        boolean g();

        int h();

        boolean isConnected();

        C7566d[] j();

        void k(InterfaceC7895j interfaceC7895j, Set set);

        String l();

        boolean m();
    }

    public static final class g extends c {
    }

    public a(String str, AbstractC1198a abstractC1198a, g gVar) {
        AbstractC7901p.m(abstractC1198a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC7901p.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f34729c = str;
        this.f34727a = abstractC1198a;
        this.f34728b = gVar;
    }

    public final AbstractC1198a a() {
        return this.f34727a;
    }

    public final String b() {
        return this.f34729c;
    }
}
