.class public final LZh/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final A:LZh/b;

.field private static final A0:LZh/b;

.field private static final B:LZh/b;

.field private static final B0:LZh/b;

.field private static final C:LZh/b;

.field private static final C0:LZh/b;

.field private static final D:LZh/b;

.field private static final D0:LZh/b;

.field private static final E:LZh/b;

.field private static final E0:LZh/b;

.field private static final F:LZh/b;

.field private static final F0:LZh/b;

.field private static final G:LZh/b;

.field private static final G0:LZh/b;

.field private static final H:LZh/b;

.field private static final H0:LZh/b;

.field private static final I:LZh/b;

.field private static final I0:LZh/b;

.field private static final J:LZh/b;

.field private static final J0:LZh/b;

.field private static final K:LZh/b;

.field private static final K0:LZh/b;

.field private static final L:LZh/b;

.field private static final L0:Ljava/util/Set;

.field private static final M:LZh/b;

.field private static final N:LZh/b;

.field private static final O:LZh/b;

.field private static final P:LZh/b;

.field private static final Q:LZh/b;

.field private static final R:LZh/b;

.field private static final S:LZh/b;

.field private static final T:LZh/b;

.field private static final U:LZh/b;

.field private static final V:LZh/b;

.field private static final W:LZh/b;

.field private static final X:LZh/b;

.field private static final Y:LZh/b;

.field private static final Z:LZh/b;

.field public static final a:LZh/i;

.field private static final a0:LZh/b;

.field private static final b:LZh/c;

.field private static final b0:LZh/b;

.field private static final c:LZh/c;

.field private static final c0:LZh/b;

.field private static final d:LZh/c;

.field private static final d0:Ljava/util/Set;

.field private static final e:LZh/c;

.field private static final e0:Ljava/util/Set;

.field private static final f:LZh/c;

.field private static final f0:Ljava/util/Map;

.field private static final g:LZh/c;

.field private static final g0:Ljava/util/Map;

.field private static final h:LZh/c;

.field private static final h0:Ljava/util/Set;

.field private static final i:LZh/c;

.field private static final i0:Ljava/util/Map;

.field private static final j:LZh/c;

.field private static final j0:Ljava/util/Map;

.field private static final k:LZh/c;

.field private static final k0:Ljava/util/Set;

.field private static final l:LZh/c;

.field private static final l0:LZh/b;

.field private static final m:LZh/c;

.field private static final m0:LZh/b;

.field private static final n:LZh/c;

.field private static final n0:LZh/b;

.field private static final o:LZh/c;

.field private static final o0:LZh/b;

.field private static final p:LZh/c;

.field private static final p0:LZh/b;

.field private static final q:Ljava/util/Set;

.field private static final q0:LZh/b;

.field private static final r:Ljava/util/Set;

.field private static final r0:LZh/b;

.field private static final s:LZh/b;

.field private static final s0:LZh/b;

.field private static final t:LZh/b;

.field private static final t0:LZh/b;

.field private static final u:LZh/b;

.field private static final u0:LZh/b;

.field private static final v:LZh/b;

.field private static final v0:LZh/b;

.field private static final w:LZh/b;

.field private static final w0:LZh/b;

.field private static final x:LZh/b;

.field private static final x0:LZh/b;

.field private static final y:LZh/b;

.field private static final y0:LZh/b;

.field private static final z:LZh/b;

.field private static final z0:LZh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, LZh/i;

    invoke-direct {v0}, LZh/i;-><init>()V

    sput-object v0, LZh/i;->a:LZh/i;

    new-instance v1, LZh/c;

    const-string v0, "kotlin"

    invoke-direct {v1, v0}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v1, LZh/i;->b:LZh/c;

    const-string v0, "reflect"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    invoke-virtual {v1, v0}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v5

    const-string v0, "child(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v5, LZh/i;->c:LZh/c;

    const-string v2, "collections"

    invoke-static {v2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v2

    invoke-virtual {v1, v2}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v2, LZh/i;->d:LZh/c;

    const-string v3, "ranges"

    invoke-static {v3}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v3

    invoke-virtual {v1, v3}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v3, LZh/i;->e:LZh/c;

    const-string v4, "jvm"

    invoke-static {v4}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v4

    invoke-virtual {v1, v4}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v4, LZh/i;->f:LZh/c;

    const-string v6, "internal"

    invoke-static {v6}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v7

    invoke-virtual {v4, v7}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v7, LZh/i;->g:LZh/c;

    const-string v7, "functions"

    invoke-static {v7}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v7

    invoke-virtual {v4, v7}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v4, LZh/i;->h:LZh/c;

    const-string v4, "annotation"

    invoke-static {v4}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v4

    invoke-virtual {v1, v4}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v4, LZh/i;->i:LZh/c;

    invoke-static {v6}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v6

    invoke-virtual {v1, v6}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v6, LZh/i;->j:LZh/c;

    const-string v7, "ir"

    invoke-static {v7}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v7

    invoke-virtual {v6, v7}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v7, LZh/i;->k:LZh/c;

    const-string v7, "coroutines"

    invoke-static {v7}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v7

    invoke-virtual {v1, v7}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v7, LZh/i;->l:LZh/c;

    const-string v8, "enums"

    invoke-static {v8}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v8

    invoke-virtual {v1, v8}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v8, LZh/i;->m:LZh/c;

    const-string v8, "contracts"

    invoke-static {v8}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v8

    invoke-virtual {v1, v8}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v8, LZh/i;->n:LZh/c;

    const-string v8, "concurrent"

    invoke-static {v8}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v8

    invoke-virtual {v1, v8}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v8, LZh/i;->o:LZh/c;

    const-string v8, "test"

    invoke-static {v8}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v8

    invoke-virtual {v1, v8}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v8, LZh/i;->p:LZh/c;

    filled-new-array {v1, v2, v3, v4}, [LZh/c;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LZh/i;->q:Ljava/util/Set;

    filled-new-array/range {v1 .. v7}, [LZh/c;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LZh/i;->r:Ljava/util/Set;

    const-string v0, "Nothing"

    invoke-static {v0}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v0

    sput-object v0, LZh/i;->s:LZh/b;

    const-string v0, "Unit"

    invoke-static {v0}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v0

    sput-object v0, LZh/i;->t:LZh/b;

    const-string v0, "Any"

    invoke-static {v0}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v0

    sput-object v0, LZh/i;->u:LZh/b;

    const-string v0, "Enum"

    invoke-static {v0}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v0

    sput-object v0, LZh/i;->v:LZh/b;

    const-string v0, "Annotation"

    invoke-static {v0}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v0

    sput-object v0, LZh/i;->w:LZh/b;

    const-string v0, "Array"

    invoke-static {v0}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v0

    sput-object v0, LZh/i;->x:LZh/b;

    const-string v0, "Boolean"

    invoke-static {v0}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v1

    sput-object v1, LZh/i;->y:LZh/b;

    const-string v0, "Char"

    invoke-static {v0}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->z:LZh/b;

    const-string v0, "Byte"

    invoke-static {v0}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v0

    sput-object v0, LZh/i;->A:LZh/b;

    const-string v3, "Short"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v9

    sput-object v9, LZh/i;->B:LZh/b;

    const-string v3, "Int"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v10

    sput-object v10, LZh/i;->C:LZh/b;

    const-string v3, "Long"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v11

    sput-object v11, LZh/i;->D:LZh/b;

    const-string v3, "Float"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v7

    sput-object v7, LZh/i;->E:LZh/b;

    const-string v3, "Double"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v8

    sput-object v8, LZh/i;->F:LZh/b;

    invoke-static {v0}, LZh/j;->j(LZh/b;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->G:LZh/b;

    invoke-static {v9}, LZh/j;->j(LZh/b;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->H:LZh/b;

    invoke-static {v10}, LZh/j;->j(LZh/b;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->I:LZh/b;

    invoke-static {v11}, LZh/j;->j(LZh/b;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->J:LZh/b;

    const-string v3, "CharSequence"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->K:LZh/b;

    const-string v3, "String"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->L:LZh/b;

    const-string v3, "Throwable"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->M:LZh/b;

    const-string v3, "Cloneable"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->N:LZh/b;

    const-string v3, "KProperty"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->O:LZh/b;

    const-string v3, "KMutableProperty"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->P:LZh/b;

    const-string v3, "KProperty0"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->Q:LZh/b;

    const-string v3, "KMutableProperty0"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->R:LZh/b;

    const-string v3, "KProperty1"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->S:LZh/b;

    const-string v3, "KMutableProperty1"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->T:LZh/b;

    const-string v3, "KProperty2"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->U:LZh/b;

    const-string v3, "KMutableProperty2"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->V:LZh/b;

    const-string v3, "KFunction"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->W:LZh/b;

    const-string v3, "KClass"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->X:LZh/b;

    const-string v3, "KCallable"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->Y:LZh/b;

    const-string v3, "KType"

    invoke-static {v3}, LZh/j;->i(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->Z:LZh/b;

    const-string v3, "Comparable"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->a0:LZh/b;

    const-string v3, "Number"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->b0:LZh/b;

    const-string v3, "Function"

    invoke-static {v3}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v3

    sput-object v3, LZh/i;->c0:LZh/b;

    move-object v3, v0

    move-object v4, v9

    move-object v5, v10

    move-object v6, v11

    filled-new-array/range {v1 .. v8}, [LZh/b;

    move-result-object v1

    invoke-static {v1}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, LZh/i;->d0:Ljava/util/Set;

    filled-new-array {v0, v9, v10, v11}, [LZh/b;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LZh/i;->e0:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashMap;

    const/16 v2, 0xa

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, LZg/U;->d(I)I

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Lsh/m;->d(II)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, LZh/b;

    invoke-virtual {v5}, LZh/b;->h()LZh/f;

    move-result-object v5

    invoke-static {v5}, LZh/j;->g(LZh/f;)LZh/b;

    move-result-object v5

    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sput-object v0, LZh/i;->f0:Ljava/util/Map;

    invoke-static {v0}, LZh/j;->f(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LZh/i;->g0:Ljava/util/Map;

    sget-object v0, LZh/i;->G:LZh/b;

    sget-object v1, LZh/i;->H:LZh/b;

    sget-object v3, LZh/i;->I:LZh/b;

    sget-object v5, LZh/i;->J:LZh/b;

    filled-new-array {v0, v1, v3, v5}, [LZh/b;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LZh/i;->h0:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, LZg/U;->d(I)I

    move-result v2

    invoke-static {v2, v4}, Lsh/m;->d(II)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LZh/b;

    invoke-virtual {v3}, LZh/b;->h()LZh/f;

    move-result-object v3

    invoke-static {v3}, LZh/j;->g(LZh/f;)LZh/b;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    sput-object v1, LZh/i;->i0:Ljava/util/Map;

    invoke-static {v1}, LZh/j;->f(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LZh/i;->j0:Ljava/util/Map;

    sget-object v0, LZh/i;->d0:Ljava/util/Set;

    sget-object v1, LZh/i;->h0:Ljava/util/Set;

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    sget-object v3, LZh/i;->L:LZh/b;

    invoke-static {v2, v3}, LZg/d0;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    sput-object v2, LZh/i;->k0:Ljava/util/Set;

    const-string v2, "Continuation"

    invoke-static {v2}, LZh/j;->d(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->l0:LZh/b;

    const-string v2, "Iterator"

    invoke-static {v2}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->m0:LZh/b;

    const-string v2, "Iterable"

    invoke-static {v2}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->n0:LZh/b;

    const-string v2, "Collection"

    invoke-static {v2}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->o0:LZh/b;

    const-string v2, "List"

    invoke-static {v2}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->p0:LZh/b;

    const-string v2, "ListIterator"

    invoke-static {v2}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->q0:LZh/b;

    const-string v2, "Set"

    invoke-static {v2}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->r0:LZh/b;

    const-string v2, "Map"

    invoke-static {v2}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->s0:LZh/b;

    const-string v4, "MutableIterator"

    invoke-static {v4}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v4

    sput-object v4, LZh/i;->t0:LZh/b;

    const-string v4, "CharIterator"

    invoke-static {v4}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v4

    sput-object v4, LZh/i;->u0:LZh/b;

    const-string v4, "MutableIterable"

    invoke-static {v4}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v4

    sput-object v4, LZh/i;->v0:LZh/b;

    const-string v4, "MutableCollection"

    invoke-static {v4}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v4

    sput-object v4, LZh/i;->w0:LZh/b;

    const-string v4, "MutableList"

    invoke-static {v4}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v4

    sput-object v4, LZh/i;->x0:LZh/b;

    const-string v4, "MutableListIterator"

    invoke-static {v4}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v4

    sput-object v4, LZh/i;->y0:LZh/b;

    const-string v4, "MutableSet"

    invoke-static {v4}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v4

    sput-object v4, LZh/i;->z0:LZh/b;

    const-string v4, "MutableMap"

    invoke-static {v4}, LZh/j;->c(Ljava/lang/String;)LZh/b;

    move-result-object v4

    sput-object v4, LZh/i;->A0:LZh/b;

    const-string v5, "Entry"

    invoke-static {v5}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v5

    const-string v6, "identifier(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v5}, LZh/b;->d(LZh/f;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->B0:LZh/b;

    const-string v2, "MutableEntry"

    invoke-static {v2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v2

    invoke-static {v2, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v2}, LZh/b;->d(LZh/f;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->C0:LZh/b;

    const-string v2, "Result"

    invoke-static {v2}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->D0:LZh/b;

    const-string v2, "IntRange"

    invoke-static {v2}, LZh/j;->h(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->E0:LZh/b;

    const-string v2, "LongRange"

    invoke-static {v2}, LZh/j;->h(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->F0:LZh/b;

    const-string v2, "CharRange"

    invoke-static {v2}, LZh/j;->h(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->G0:LZh/b;

    const-string v2, "AnnotationRetention"

    invoke-static {v2}, LZh/j;->a(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->H0:LZh/b;

    const-string v2, "AnnotationTarget"

    invoke-static {v2}, LZh/j;->a(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->I0:LZh/b;

    const-string v2, "DeprecationLevel"

    invoke-static {v2}, LZh/j;->b(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->J0:LZh/b;

    const-string v2, "EnumEntries"

    invoke-static {v2}, LZh/j;->e(Ljava/lang/String;)LZh/b;

    move-result-object v2

    sput-object v2, LZh/i;->K0:LZh/b;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, v3}, LZg/d0;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sget-object v1, LZh/i;->t:LZh/b;

    invoke-static {v0, v1}, LZg/d0;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sget-object v1, LZh/i;->u:LZh/b;

    invoke-static {v0, v1}, LZg/d0;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sget-object v1, LZh/i;->v:LZh/b;

    invoke-static {v0, v1}, LZg/d0;->m(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LZh/i;->L0:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LZh/b;
    .locals 1

    sget-object v0, LZh/i;->x:LZh/b;

    return-object v0
.end method

.method public final b()LZh/c;
    .locals 1

    sget-object v0, LZh/i;->i:LZh/c;

    return-object v0
.end method

.method public final c()LZh/c;
    .locals 1

    sget-object v0, LZh/i;->d:LZh/c;

    return-object v0
.end method

.method public final d()LZh/c;
    .locals 1

    sget-object v0, LZh/i;->l:LZh/c;

    return-object v0
.end method

.method public final e()LZh/c;
    .locals 1

    sget-object v0, LZh/i;->m:LZh/c;

    return-object v0
.end method

.method public final f()LZh/c;
    .locals 1

    sget-object v0, LZh/i;->b:LZh/c;

    return-object v0
.end method

.method public final g()LZh/c;
    .locals 1

    sget-object v0, LZh/i;->e:LZh/c;

    return-object v0
.end method

.method public final h()LZh/c;
    .locals 1

    sget-object v0, LZh/i;->c:LZh/c;

    return-object v0
.end method

.method public final i()LZh/b;
    .locals 1

    sget-object v0, LZh/i;->K0:LZh/b;

    return-object v0
.end method

.method public final j()LZh/b;
    .locals 1

    sget-object v0, LZh/i;->X:LZh/b;

    return-object v0
.end method

.method public final k()LZh/b;
    .locals 1

    sget-object v0, LZh/i;->W:LZh/b;

    return-object v0
.end method

.method public final l()LZh/b;
    .locals 1

    sget-object v0, LZh/i;->x0:LZh/b;

    return-object v0
.end method

.method public final m()LZh/b;
    .locals 1

    sget-object v0, LZh/i;->A0:LZh/b;

    return-object v0
.end method

.method public final n()LZh/b;
    .locals 1

    sget-object v0, LZh/i;->z0:LZh/b;

    return-object v0
.end method
