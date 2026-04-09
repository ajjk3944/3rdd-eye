package ua;

import java.io.Serializable;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ua.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8153a extends Serializable {

    /* renamed from: ua.a$a, reason: collision with other inner class name */
    public static final class C2195a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final String f62821a;

        private /* synthetic */ C2195a(String str) {
            this.f62821a = str;
        }

        public static final /* synthetic */ C2195a a(String str) {
            return new C2195a(str);
        }

        public static String c(String value) {
            AbstractC6492s.i(value, "value");
            return value;
        }

        public static boolean d(String str, Object obj) {
            return (obj instanceof C2195a) && AbstractC6492s.d(str, ((C2195a) obj).l());
        }

        public static final boolean g(String str, String str2) {
            return AbstractC6492s.d(str, str2);
        }

        public static int h(String str) {
            return str.hashCode();
        }

        public static String j(String str) {
            return "ID(value=" + str + ")";
        }

        public boolean equals(Object obj) {
            return d(this.f62821a, obj);
        }

        public int hashCode() {
            return h(this.f62821a);
        }

        public final /* synthetic */ String l() {
            return this.f62821a;
        }

        public String toString() {
            return j(this.f62821a);
        }
    }

    /* renamed from: ua.a$b */
    public interface b extends Serializable {
    }

    /* renamed from: ua.a$c */
    public static final class c implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final String f62822a;

        private /* synthetic */ c(String str) {
            this.f62822a = str;
        }

        public static final /* synthetic */ c a(String str) {
            return new c(str);
        }

        public static String c(String value) {
            AbstractC6492s.i(value, "value");
            return value;
        }

        public static boolean d(String str, Object obj) {
            return (obj instanceof c) && AbstractC6492s.d(str, ((c) obj).j());
        }

        public static int g(String str) {
            return str.hashCode();
        }

        public static String h(String str) {
            return "NetworkModel(value=" + str + ")";
        }

        public boolean equals(Object obj) {
            return d(this.f62822a, obj);
        }

        public int hashCode() {
            return g(this.f62822a);
        }

        public final /* synthetic */ String j() {
            return this.f62822a;
        }

        public String toString() {
            return h(this.f62822a);
        }
    }

    /* renamed from: ua.a$d */
    public static final class d implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final String f62823a;

        private /* synthetic */ d(String str) {
            this.f62823a = str;
        }

        public static final /* synthetic */ d a(String str) {
            return new d(str);
        }

        public static String c(String value) {
            AbstractC6492s.i(value, "value");
            return value;
        }

        public static boolean d(String str, Object obj) {
            return (obj instanceof d) && AbstractC6492s.d(str, ((d) obj).j());
        }

        public static int g(String str) {
            return str.hashCode();
        }

        public static String h(String str) {
            return "SystemID(value=" + str + ")";
        }

        public boolean equals(Object obj) {
            return d(this.f62823a, obj);
        }

        public int hashCode() {
            return g(this.f62823a);
        }

        public final /* synthetic */ String j() {
            return this.f62823a;
        }

        public String toString() {
            return h(this.f62823a);
        }
    }

    String I();

    Set Q0();

    /* renamed from: getId-2jxHnRY */
    String mo3getId2jxHnRY();

    String getName();

    ua.b h0();

    Fa.b j0();

    Ea.c p0();

    Ca.a z();
}
