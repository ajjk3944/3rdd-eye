package cj;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: cj.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4269a {

    /* renamed from: cj.a$a, reason: collision with other inner class name */
    public static final class C1191a extends AbstractC4269a {

        /* renamed from: a, reason: collision with root package name */
        private final Vi.b f34032a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1191a(Vi.b serializer) {
            super(null);
            AbstractC6492s.i(serializer, "serializer");
            this.f34032a = serializer;
        }

        @Override // cj.AbstractC4269a
        public Vi.b a(List typeArgumentsSerializers) {
            AbstractC6492s.i(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f34032a;
        }

        public final Vi.b b() {
            return this.f34032a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1191a) && AbstractC6492s.d(((C1191a) obj).f34032a, this.f34032a);
        }

        public int hashCode() {
            return this.f34032a.hashCode();
        }
    }

    /* renamed from: cj.a$b */
    public static final class b extends AbstractC4269a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6835l f34033a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6835l provider) {
            super(null);
            AbstractC6492s.i(provider, "provider");
            this.f34033a = provider;
        }

        @Override // cj.AbstractC4269a
        public Vi.b a(List typeArgumentsSerializers) {
            AbstractC6492s.i(typeArgumentsSerializers, "typeArgumentsSerializers");
            return (Vi.b) this.f34033a.invoke(typeArgumentsSerializers);
        }

        public final InterfaceC6835l b() {
            return this.f34033a;
        }
    }

    public /* synthetic */ AbstractC4269a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Vi.b a(List list);

    private AbstractC4269a() {
    }
}
