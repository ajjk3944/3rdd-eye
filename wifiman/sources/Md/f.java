package Md;

import Od.a;
import Yg.J;
import android.content.Context;
import com.ui.sso.api.UiAccountApi;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import fd.InterfaceC5808b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import rj.InterfaceC7733m2;
import uj.j;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f13105a = new DI.g("model.cloud", false, null, new InterfaceC6835l() { // from class: Md.a
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return f.f((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class A extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class B extends org.kodein.type.o<InterfaceC5808b> {
    }

    /* renamed from: Md.f$a, reason: case insensitive filesystem */
    static final class C3303a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C3303a f13106a = new C3303a();

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/C4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Md.f$a$a, reason: collision with other inner class name */
        public static final class C0518a extends org.kodein.type.o<b.a> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/D4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Md.f$a$b */
        public static final class b extends org.kodein.type.o<com.ui.wifiman.model.ubiquiti.cloud.sso.a> {
        }

        C3303a() {
        }

        public final com.ui.wifiman.model.ubiquiti.cloud.sso.a a(uj.b factory, UUID accountId) {
            AbstractC6492s.i(factory, "$this$factory");
            AbstractC6492s.i(accountId, "accountId");
            b.a aVarA = b.a.a(accountId);
            InterfaceC7733m2 interfaceC7733m2G = factory.g();
            org.kodein.type.i iVarE = org.kodein.type.s.e(new C0518a().getSuperType());
            AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            org.kodein.type.d dVar = new org.kodein.type.d(iVarE, b.a.class);
            org.kodein.type.i iVarE2 = org.kodein.type.s.e(new b().getSuperType());
            AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            return (com.ui.wifiman.model.ubiquiti.cloud.sso.a) interfaceC7733m2G.b(dVar, new org.kodein.type.d(iVarE2, com.ui.wifiman.model.ubiquiti.cloud.sso.a.class), null, aVarA);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((uj.b) obj, ((b.a) obj2).g());
        }
    }

    /* renamed from: Md.f$b, reason: case insensitive filesystem */
    static final class C3304b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C3304b f13107a = new C3304b();

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/C4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Md.f$b$a */
        public static final class a extends org.kodein.type.o<b.a> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/D4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Md.f$b$b, reason: collision with other inner class name */
        public static final class C0519b extends org.kodein.type.o<com.ui.wifiman.model.ubiquiti.cloud.sso.a> {
        }

        C3304b() {
        }

        public final com.ui.wifiman.model.ubiquiti.cloud.sso.a a(uj.b factory, UUID accountId) {
            AbstractC6492s.i(factory, "$this$factory");
            AbstractC6492s.i(accountId, "accountId");
            b.a aVarA = b.a.a(accountId);
            InterfaceC7733m2 interfaceC7733m2G = factory.g();
            org.kodein.type.i iVarE = org.kodein.type.s.e(new a().getSuperType());
            AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            org.kodein.type.d dVar = new org.kodein.type.d(iVarE, b.a.class);
            org.kodein.type.i iVarE2 = org.kodein.type.s.e(new C0519b().getSuperType());
            AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            return (com.ui.wifiman.model.ubiquiti.cloud.sso.a) interfaceC7733m2G.b(dVar, new org.kodein.type.d(iVarE2, com.ui.wifiman.model.ubiquiti.cloud.sso.a.class), null, aVarA);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((uj.b) obj, ((b.a) obj2).g());
        }
    }

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f13108a = new c();

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends org.kodein.type.o<Nd.c> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends org.kodein.type.o<fe.u> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Md.f$c$c, reason: collision with other inner class name */
        public static final class C0520c extends org.kodein.type.o<T7.d> {
        }

        c() {
        }

        public final com.ui.wifiman.model.ubiquiti.cloud.sso.a a(uj.b multiton, UUID accountId) {
            AbstractC6492s.i(multiton, "$this$multiton");
            AbstractC6492s.i(accountId, "accountId");
            InterfaceC7733m2 interfaceC7733m2G = multiton.g();
            org.kodein.type.i iVarE = org.kodein.type.s.e(new a().getSuperType());
            AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            Nd.c cVar = (Nd.c) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Nd.c.class), null);
            InterfaceC7733m2 interfaceC7733m2G2 = multiton.g();
            org.kodein.type.i iVarE2 = org.kodein.type.s.e(new b().getSuperType());
            AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            fe.u uVar = (fe.u) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, fe.u.class), null);
            InterfaceC7733m2 interfaceC7733m2G3 = multiton.g();
            org.kodein.type.i iVarE3 = org.kodein.type.s.e(new C0520c().getSuperType());
            AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            return new com.ui.wifiman.model.ubiquiti.cloud.sso.a(accountId, cVar, uVar, (T7.d) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, T7.d.class), null), null);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((uj.b) obj, ((b.a) obj2).g());
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<Nd.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<com.ui.wifiman.model.ubiquiti.cloud.sso.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Md.f$f, reason: collision with other inner class name */
    public static final class C0521f extends org.kodein.type.o<Nd.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<com.ui.wifiman.model.ubiquiti.cloud.sso.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<UiSSOAccountManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends org.kodein.type.o<Qd.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends org.kodein.type.o<a.InterfaceC0616a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/c", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends org.kodein.type.o<b.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/d", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends org.kodein.type.o<com.ui.wifiman.model.ubiquiti.cloud.sso.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/c", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends org.kodein.type.o<b.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/d", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends org.kodein.type.o<com.ui.wifiman.model.ubiquiti.cloud.sso.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/j", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<b.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/k", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class p extends org.kodein.type.o<com.ui.wifiman.model.ubiquiti.cloud.sso.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q extends org.kodein.type.o<Nd.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r extends org.kodein.type.o<com.ui.wifiman.model.ubiquiti.cloud.sso.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class s extends org.kodein.type.o<com.ui.wifiman.model.ubiquiti.console.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class t extends org.kodein.type.o<Od.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class u extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class v extends org.kodein.type.o<Lb.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class w extends org.kodein.type.o<Nd.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class x extends org.kodein.type.o<lc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class y extends org.kodein.type.o<Nb.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class z extends org.kodein.type.o<xa.o> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, Nd.c.class), null, null);
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: Md.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.g((j) obj);
            }
        };
        uj.q qVarC = Module.c();
        org.kodein.type.q qVarB = Module.b();
        boolean zE = Module.e();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new q().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new uj.u(qVarC, qVarB, zE, new org.kodein.type.d(iVarE2, Nd.f.class), null, true, interfaceC6835l));
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD2 = Module.d(new org.kodein.type.d(iVarE3, com.ui.wifiman.model.ubiquiti.cloud.sso.c.class), null, null);
        C3303a c3303a = C3303a.f13106a;
        org.kodein.type.q qVarB2 = Module.b();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar = new org.kodein.type.d(iVarE4, b.a.class);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD2.a(new uj.g(qVarB2, dVar, new org.kodein.type.d(iVarE5, com.ui.wifiman.model.ubiquiti.cloud.sso.a.class), c3303a));
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new C0521f().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD3 = Module.d(new org.kodein.type.d(iVarE6, Nd.a.class), null, null);
        C3304b c3304b = C3304b.f13107a;
        org.kodein.type.q qVarB3 = Module.b();
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar2 = new org.kodein.type.d(iVarE7, b.a.class);
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD3.a(new uj.g(qVarB3, dVar2, new org.kodein.type.d(iVarE8, com.ui.wifiman.model.ubiquiti.cloud.sso.a.class), c3304b));
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD4 = Module.d(new org.kodein.type.d(iVarE9, com.ui.wifiman.model.ubiquiti.cloud.sso.a.class), null, null);
        c cVar = c.f13108a;
        uj.q qVarC2 = Module.c();
        org.kodein.type.q qVarB4 = Module.b();
        boolean zE2 = Module.e();
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar3 = new org.kodein.type.d(iVarE10, b.a.class);
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new p().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD4.a(new uj.i(qVarC2, qVarB4, zE2, dVar3, new org.kodein.type.d(iVarE11, com.ui.wifiman.model.ubiquiti.cloud.sso.a.class), null, true, cVar));
        org.kodein.type.i iVarE12 = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD5 = Module.d(new org.kodein.type.d(iVarE12, UiSSOAccountManager.class), null, null);
        InterfaceC6835l interfaceC6835l2 = new InterfaceC6835l() { // from class: Md.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.h((j) obj);
            }
        };
        uj.q qVarC3 = Module.c();
        org.kodein.type.q qVarB5 = Module.b();
        boolean zE3 = Module.e();
        org.kodein.type.i iVarE13 = org.kodein.type.s.e(new r().getSuperType());
        AbstractC6492s.g(iVarE13, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD5.a(new uj.u(qVarC3, qVarB5, zE3, new org.kodein.type.d(iVarE13, com.ui.wifiman.model.ubiquiti.cloud.sso.d.class), null, true, interfaceC6835l2));
        org.kodein.type.i iVarE14 = org.kodein.type.s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE14, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD6 = Module.d(new org.kodein.type.d(iVarE14, Qd.e.class), null, null);
        InterfaceC6835l interfaceC6835l3 = new InterfaceC6835l() { // from class: Md.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.i((j) obj);
            }
        };
        uj.q qVarC4 = Module.c();
        org.kodein.type.q qVarB6 = Module.b();
        boolean zE4 = Module.e();
        org.kodein.type.i iVarE15 = org.kodein.type.s.e(new s().getSuperType());
        AbstractC6492s.g(iVarE15, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD6.a(new uj.u(qVarC4, qVarB6, zE4, new org.kodein.type.d(iVarE15, com.ui.wifiman.model.ubiquiti.console.a.class), null, true, interfaceC6835l3));
        org.kodein.type.i iVarE16 = org.kodein.type.s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE16, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD7 = Module.d(new org.kodein.type.d(iVarE16, a.InterfaceC0616a.class), null, null);
        InterfaceC6835l interfaceC6835l4 = new InterfaceC6835l() { // from class: Md.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.j((j) obj);
            }
        };
        uj.q qVarC5 = Module.c();
        org.kodein.type.q qVarB7 = Module.b();
        boolean zE5 = Module.e();
        org.kodein.type.i iVarE17 = org.kodein.type.s.e(new t().getSuperType());
        AbstractC6492s.g(iVarE17, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD7.a(new uj.u(qVarC5, qVarB7, zE5, new org.kodein.type.d(iVarE17, Od.c.class), null, true, interfaceC6835l4));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Nd.f g(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        UiAccountApi.b.a aVar = UiAccountApi.b.f41671a;
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new u().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Nd.f(aVar.a((Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.ubiquiti.cloud.sso.d h(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        DI diD = singleton.d();
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new v().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Lb.b bVar = (Lb.b) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Lb.b.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new w().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Nd.c cVar = (Nd.c) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, Nd.c.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new x().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.ubiquiti.cloud.sso.d(diD, bVar, cVar, (lc.e) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, lc.e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.ubiquiti.console.a i(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new y().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Nb.e eVar = (Nb.e) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Nb.e.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new z().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.ubiquiti.console.a(eVar, (xa.o) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, xa.o.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Od.c j(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new A().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Zc.f fVar = (Zc.f) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Zc.f.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new B().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Od.c(fVar, (InterfaceC5808b) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC5808b.class), null));
    }

    public static final DI.g k() {
        return f13105a;
    }
}
