package z9;

import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.json.internal.g0;
import kotlinx.serialization.json.internal.j0;
import kotlinx.serialization.json.internal.l0;
import kotlinx.serialization.json.internal.w;
import kotlinx.serialization.json.internal.x;

/* loaded from: classes4.dex */
public abstract class a implements kotlinx.serialization.h {

    /* renamed from: d, reason: collision with root package name */
    public static final C0511a f25415d = new C0511a(null);

    /* renamed from: a, reason: collision with root package name */
    public final d f25416a;

    /* renamed from: b, reason: collision with root package name */
    public final aa.c f25417b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.json.internal.q f25418c;

    /* renamed from: z9.a$a, reason: collision with other inner class name */
    public static final class C0511a extends a {
        public /* synthetic */ C0511a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public C0511a() {
            super(new d(false, false, false, false, false, false, null, false, false, null, false, false, 4095, null), aa.d.a(), null);
        }
    }

    public /* synthetic */ a(d dVar, aa.c cVar, kotlin.jvm.internal.i iVar) {
        this(dVar, cVar);
    }

    @Override // kotlinx.serialization.d
    public aa.c a() {
        return this.f25417b;
    }

    @Override // kotlinx.serialization.h
    public final Object b(kotlinx.serialization.a deserializer, String string) {
        kotlin.jvm.internal.p.e(deserializer, "deserializer");
        kotlin.jvm.internal.p.e(string, "string");
        j0 j0Var = new j0(string);
        Object objG = new g0(this, WriteMode.OBJ, j0Var, deserializer.getDescriptor(), null).G(deserializer);
        j0Var.w();
        return objG;
    }

    @Override // kotlinx.serialization.h
    public final String c(kotlinx.serialization.e serializer, Object obj) {
        kotlin.jvm.internal.p.e(serializer, "serializer");
        x xVar = new x();
        try {
            w.a(this, xVar, serializer, obj);
            return xVar.toString();
        } finally {
            xVar.g();
        }
    }

    public final Object d(kotlinx.serialization.a deserializer, kotlinx.serialization.json.b element) {
        kotlin.jvm.internal.p.e(deserializer, "deserializer");
        kotlin.jvm.internal.p.e(element, "element");
        return l0.a(this, element, deserializer);
    }

    public final d e() {
        return this.f25416a;
    }

    public final kotlinx.serialization.json.internal.q f() {
        return this.f25418c;
    }

    public a(d dVar, aa.c cVar) {
        this.f25416a = dVar;
        this.f25417b = cVar;
        this.f25418c = new kotlinx.serialization.json.internal.q();
    }
}
