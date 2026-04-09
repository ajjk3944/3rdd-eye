package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.p;
import kotlinx.serialization.internal.j1;
import kotlinx.serialization.internal.o;
import kotlinx.serialization.internal.x1;
import l9.l;

/* loaded from: classes4.dex */
public abstract class SerializersCacheKt {

    /* renamed from: a, reason: collision with root package name */
    public static final x1 f22736a = o.a(new l() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE$1
        @Override // l9.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(r9.c it) {
            p.e(it, "it");
            return f.d(it);
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public static final x1 f22737b = o.a(new l() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1
        @Override // l9.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(r9.c it) {
            b bVarS;
            p.e(it, "it");
            b bVarD = f.d(it);
            if (bVarD == null || (bVarS = x9.a.s(bVarD)) == null) {
                return null;
            }
            return bVarS;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f22738c = o.b(new l9.p() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1
        @Override // l9.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(r9.c clazz, List types) {
            p.e(clazz, "clazz");
            p.e(types, "types");
            List listE = f.e(aa.d.a(), types, true);
            p.b(listE);
            return f.a(clazz, types, listE);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f22739d = o.b(new l9.p() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1
        @Override // l9.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(r9.c clazz, List types) {
            b bVarS;
            p.e(clazz, "clazz");
            p.e(types, "types");
            List listE = f.e(aa.d.a(), types, true);
            p.b(listE);
            b bVarA = f.a(clazz, types, listE);
            if (bVarA == null || (bVarS = x9.a.s(bVarA)) == null) {
                return null;
            }
            return bVarS;
        }
    });

    public static final b a(r9.c clazz, boolean z10) {
        p.e(clazz, "clazz");
        if (z10) {
            return f22737b.a(clazz);
        }
        b bVarA = f22736a.a(clazz);
        if (bVarA != null) {
            return bVarA;
        }
        return null;
    }

    public static final Object b(r9.c clazz, List types, boolean z10) {
        p.e(clazz, "clazz");
        p.e(types, "types");
        return !z10 ? f22738c.a(clazz, types) : f22739d.a(clazz, types);
    }
}
