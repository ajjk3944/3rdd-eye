package com.ubnt.teleport;

import gg.AbstractC5912b;
import gg.i;
import gg.z;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public interface TeleportTunnel {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ubnt/teleport/TeleportTunnel$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "teleport_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Error extends RuntimeException {
    }

    public interface a {
    }

    public interface b {
    }

    public interface c {
        z d(a aVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f39292a;

        private /* synthetic */ d(String str) {
            this.f39292a = str;
        }

        public static final /* synthetic */ d a(String str) {
            return new d(str);
        }

        public static String b(String value) {
            AbstractC6492s.i(value, "value");
            return value;
        }

        public static boolean c(String str, Object obj) {
            return (obj instanceof d) && AbstractC6492s.d(str, ((d) obj).g());
        }

        public static final boolean d(String str, String str2) {
            return AbstractC6492s.d(str, str2);
        }

        public static int e(String str) {
            return str.hashCode();
        }

        public static String f(String str) {
            return "ID(value=" + str + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f39292a, obj);
        }

        public final /* synthetic */ String g() {
            return this.f39292a;
        }

        public int hashCode() {
            return e(this.f39292a);
        }

        public String toString() {
            return f(this.f39292a);
        }
    }

    AbstractC5912b b(b bVar);

    AbstractC5912b close();

    i getState();
}
