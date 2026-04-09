package com.unity3d.services.core.extensions;

import c9.c;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.b;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001aA\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\u001e\b\u0004\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH\u0086Hø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\";\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fj\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"R", "Lkotlin/Function0;", "block", "Lkotlin/Result;", "runSuspendCatching", "(Ll9/a;)Ljava/lang/Object;", "runReturnSuspendCatching", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "key", "Lkotlin/Function1;", "Lc9/c;", "action", "memoize", "(Ljava/lang/Object;Ll9/l;Lc9/c;)Ljava/lang/Object;", "Ljava/util/LinkedHashMap;", "Lkotlinx/coroutines/o0;", "Lkotlin/collections/LinkedHashMap;", "deferreds", "Ljava/util/LinkedHashMap;", "getDeferreds", "()Ljava/util/LinkedHashMap;", "Lkotlinx/coroutines/sync/a;", "mutex", "Lkotlinx/coroutines/sync/a;", "getMutex", "()Lkotlinx/coroutines/sync/a;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExtensions.kt\ncom/unity3d/services/core/extensions/CoroutineExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n14#1,6:48\n1#2:54\n*S KotlinDebug\n*F\n+ 1 CoroutineExtensions.kt\ncom/unity3d/services/core/extensions/CoroutineExtensionsKt\n*L\n24#1:48,6\n*E\n"})
/* loaded from: classes3.dex */
public final class CoroutineExtensionsKt {

    @NotNull
    private static final LinkedHashMap<Object, o0> deferreds = new LinkedHashMap<Object, o0>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof o0) {
                return containsValue((o0) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, o0>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, o0>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<o0> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof o0)) {
                return remove(obj, (o0) obj2);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(@NotNull Map.Entry<Object, o0> eldest) {
            p.e(eldest, "eldest");
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<o0> values() {
            return getValues();
        }

        public /* bridge */ boolean containsValue(o0 o0Var) {
            return super.containsValue((Object) o0Var);
        }

        public /* bridge */ boolean remove(Object obj, o0 o0Var) {
            return super.remove(obj, (Object) o0Var);
        }
    };

    @NotNull
    private static final a mutex = b.b(false, 1, null);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", i = {0, 0}, l = {53, 45}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nCoroutineExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExtensions.kt\ncom/unity3d/services/core/extensions/CoroutineExtensionsKt$memoize$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,47:1\n107#2,8:48\n116#2:63\n115#2,2:64\n361#3,7:56\n*S KotlinDebug\n*F\n+ 1 CoroutineExtensions.kt\ncom/unity3d/services/core/extensions/CoroutineExtensionsKt$memoize$2\n*L\n40#1:48,8\n40#1:63\n40#1:64,2\n41#1:56,7\n*E\n"})
    /* renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements l9.p {
        final /* synthetic */ l $action;
        final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj, l lVar, c cVar) {
            super(2, cVar);
            this.$key = obj;
            this.$action = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$action, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            j0 j0Var;
            a mutex;
            l lVar;
            Object obj2;
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    j0Var = (j0) this.L$0;
                    mutex = CoroutineExtensionsKt.getMutex();
                    Object obj3 = this.$key;
                    lVar = this.$action;
                    this.L$0 = j0Var;
                    this.L$1 = mutex;
                    this.L$2 = obj3;
                    this.L$3 = lVar;
                    this.label = 1;
                    if (mutex.a(null, this) != objF) {
                        obj2 = obj3;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return obj;
                }
                lVar = (l) this.L$3;
                obj2 = this.L$2;
                mutex = (a) this.L$1;
                j0Var = (j0) this.L$0;
                kotlin.c.b(obj);
                LinkedHashMap<Object, o0> deferreds = CoroutineExtensionsKt.getDeferreds();
                o0 o0VarB = deferreds.get(obj2);
                if (o0VarB == null) {
                    o0VarB = k.b(j0Var, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                    deferreds.put(obj2, o0VarB);
                }
                o0 o0Var = o0VarB;
                mutex.b(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                Object objQ = o0Var.q(this);
                return objQ == objF ? objF : objQ;
            } catch (Throwable th) {
                mutex.b(null);
                throw th;
            }
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            j0 j0Var = (j0) this.L$0;
            a mutex = CoroutineExtensionsKt.getMutex();
            Object obj2 = this.$key;
            l lVar = this.$action;
            n.c(0);
            mutex.a(null, this);
            n.c(1);
            try {
                LinkedHashMap<Object, o0> deferreds = CoroutineExtensionsKt.getDeferreds();
                o0 o0VarB = deferreds.get(obj2);
                if (o0VarB == null) {
                    o0VarB = k.b(j0Var, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                    deferreds.put(obj2, o0VarB);
                }
                o0 o0Var = o0VarB;
                mutex.b(null);
                n.c(0);
                Object objQ = o0Var.q(this);
                n.c(1);
                return objQ;
            } catch (Throwable th) {
                mutex.b(null);
                throw th;
            }
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
            return ((AnonymousClass2) create(j0Var, cVar)).invokeSuspend(s.f25199a);
        }
    }

    @NotNull
    public static final LinkedHashMap<Object, o0> getDeferreds() {
        return deferreds;
    }

    @NotNull
    public static final a getMutex() {
        return mutex;
    }

    @Nullable
    public static final <T> Object memoize(@NotNull Object obj, @NotNull l lVar, @NotNull c cVar) {
        return k0.e(new AnonymousClass2(obj, lVar, null), cVar);
    }

    private static final <T> Object memoize$$forInline(Object obj, l lVar, c cVar) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(obj, lVar, null);
        n.c(0);
        Object objE = k0.e(anonymousClass2, cVar);
        n.c(1);
        return objE;
    }

    @NotNull
    public static final <R> Object runReturnSuspendCatching(@NotNull l9.a block) {
        Object objB;
        p.e(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(block.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        if (Result.h(objB)) {
            return Result.b(objB);
        }
        Throwable thE = Result.e(objB);
        return thE != null ? Result.b(kotlin.c.a(thE)) : objB;
    }

    @NotNull
    public static final <R> Object runSuspendCatching(@NotNull l9.a block) {
        p.e(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.b(block.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.b(kotlin.c.a(th));
        }
    }
}
