.class public final LAh/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAh/c$a;
    }
.end annotation


# static fields
.field public static final a:LAh/c;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field private static final f:LZh/b;

.field private static final g:LZh/c;

.field private static final h:LZh/b;

.field private static final i:LZh/b;

.field private static final j:LZh/b;

.field private static final k:Ljava/util/HashMap;

.field private static final l:Ljava/util/HashMap;

.field private static final m:Ljava/util/HashMap;

.field private static final n:Ljava/util/HashMap;

.field private static final o:Ljava/util/HashMap;

.field private static final p:Ljava/util/HashMap;

.field private static final q:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, LAh/c;

    invoke-direct {v0}, LAh/c;-><init>()V

    sput-object v0, LAh/c;->a:LAh/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lzh/f$a;->e:Lzh/f$a;

    invoke-virtual {v2}, Lzh/f;->b()LZh/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lzh/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, LAh/c;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lzh/f$b;->e:Lzh/f$b;

    invoke-virtual {v2}, Lzh/f;->b()LZh/c;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lzh/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, LAh/c;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lzh/f$d;->e:Lzh/f$d;

    invoke-virtual {v2}, Lzh/f;->b()LZh/c;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lzh/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, LAh/c;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lzh/f$c;->e:Lzh/f$c;

    invoke-virtual {v2}, Lzh/f;->b()LZh/c;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lzh/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, LAh/c;->e:Ljava/lang/String;

    sget-object v1, LZh/b;->d:LZh/b$a;

    new-instance v2, LZh/c;

    const-string v4, "kotlin.jvm.functions.FunctionN"

    invoke-direct {v2, v4}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v2

    sput-object v2, LAh/c;->f:LZh/b;

    invoke-virtual {v2}, LZh/b;->a()LZh/c;

    move-result-object v2

    sput-object v2, LAh/c;->g:LZh/c;

    sget-object v2, LZh/i;->a:LZh/i;

    invoke-virtual {v2}, LZh/i;->k()LZh/b;

    move-result-object v4

    sput-object v4, LAh/c;->h:LZh/b;

    invoke-virtual {v2}, LZh/i;->j()LZh/b;

    move-result-object v2

    sput-object v2, LAh/c;->i:LZh/b;

    const-class v2, Ljava/lang/Class;

    invoke-direct {v0, v2}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object v2

    sput-object v2, LAh/c;->j:LZh/b;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, LAh/c;->k:Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, LAh/c;->l:Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, LAh/c;->m:Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, LAh/c;->n:Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, LAh/c;->o:Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, LAh/c;->p:Ljava/util/HashMap;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->W:LZh/c;

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v2

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->e0:LZh/c;

    new-instance v5, LZh/b;

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v6

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v7

    invoke-static {v4, v7}, LZh/e;->g(LZh/c;LZh/c;)LZh/c;

    move-result-object v4

    const/4 v7, 0x0

    invoke-direct {v5, v6, v4, v7}, LZh/b;-><init>(LZh/c;LZh/c;Z)V

    new-instance v8, LAh/c$a;

    const-class v4, Ljava/lang/Iterable;

    invoke-direct {v0, v4}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object v4

    invoke-direct {v8, v4, v2, v5}, LAh/c$a;-><init>(LZh/b;LZh/b;LZh/b;)V

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->V:LZh/c;

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v2

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->d0:LZh/c;

    new-instance v5, LZh/b;

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v6

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v9

    invoke-static {v4, v9}, LZh/e;->g(LZh/c;LZh/c;)LZh/c;

    move-result-object v4

    invoke-direct {v5, v6, v4, v7}, LZh/b;-><init>(LZh/c;LZh/c;Z)V

    new-instance v9, LAh/c$a;

    const-class v4, Ljava/util/Iterator;

    invoke-direct {v0, v4}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object v4

    invoke-direct {v9, v4, v2, v5}, LAh/c$a;-><init>(LZh/b;LZh/b;LZh/b;)V

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->X:LZh/c;

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v2

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->f0:LZh/c;

    new-instance v5, LZh/b;

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v6

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v10

    invoke-static {v4, v10}, LZh/e;->g(LZh/c;LZh/c;)LZh/c;

    move-result-object v4

    invoke-direct {v5, v6, v4, v7}, LZh/b;-><init>(LZh/c;LZh/c;Z)V

    new-instance v10, LAh/c$a;

    const-class v4, Ljava/util/Collection;

    invoke-direct {v0, v4}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object v4

    invoke-direct {v10, v4, v2, v5}, LAh/c$a;-><init>(LZh/b;LZh/b;LZh/b;)V

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->Y:LZh/c;

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v2

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->g0:LZh/c;

    new-instance v5, LZh/b;

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v6

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v11

    invoke-static {v4, v11}, LZh/e;->g(LZh/c;LZh/c;)LZh/c;

    move-result-object v4

    invoke-direct {v5, v6, v4, v7}, LZh/b;-><init>(LZh/c;LZh/c;Z)V

    new-instance v11, LAh/c$a;

    const-class v4, Ljava/util/List;

    invoke-direct {v0, v4}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object v4

    invoke-direct {v11, v4, v2, v5}, LAh/c$a;-><init>(LZh/b;LZh/b;LZh/b;)V

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->a0:LZh/c;

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v2

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->i0:LZh/c;

    new-instance v5, LZh/b;

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v6

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v12

    invoke-static {v4, v12}, LZh/e;->g(LZh/c;LZh/c;)LZh/c;

    move-result-object v4

    invoke-direct {v5, v6, v4, v7}, LZh/b;-><init>(LZh/c;LZh/c;Z)V

    new-instance v12, LAh/c$a;

    const-class v4, Ljava/util/Set;

    invoke-direct {v0, v4}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object v4

    invoke-direct {v12, v4, v2, v5}, LAh/c$a;-><init>(LZh/b;LZh/b;LZh/b;)V

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->Z:LZh/c;

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v2

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->h0:LZh/c;

    new-instance v5, LZh/b;

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v6

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v13

    invoke-static {v4, v13}, LZh/e;->g(LZh/c;LZh/c;)LZh/c;

    move-result-object v4

    invoke-direct {v5, v6, v4, v7}, LZh/b;-><init>(LZh/c;LZh/c;Z)V

    new-instance v13, LAh/c$a;

    const-class v4, Ljava/util/ListIterator;

    invoke-direct {v0, v4}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object v4

    invoke-direct {v13, v4, v2, v5}, LAh/c$a;-><init>(LZh/b;LZh/b;LZh/b;)V

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->b0:LZh/c;

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v4

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->j0:LZh/c;

    new-instance v6, LZh/b;

    invoke-virtual {v4}, LZh/b;->f()LZh/c;

    move-result-object v14

    invoke-virtual {v4}, LZh/b;->f()LZh/c;

    move-result-object v15

    invoke-static {v5, v15}, LZh/e;->g(LZh/c;LZh/c;)LZh/c;

    move-result-object v5

    invoke-direct {v6, v14, v5, v7}, LZh/b;-><init>(LZh/c;LZh/c;Z)V

    new-instance v14, LAh/c$a;

    const-class v5, Ljava/util/Map;

    invoke-direct {v0, v5}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object v5

    invoke-direct {v14, v5, v4, v6}, LAh/c$a;-><init>(LZh/b;LZh/b;LZh/b;)V

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v1

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->c0:LZh/c;

    invoke-virtual {v2}, LZh/c;->g()LZh/f;

    move-result-object v2

    const-string v4, "shortName(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LZh/b;->d(LZh/f;)LZh/b;

    move-result-object v1

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->k0:LZh/c;

    new-instance v4, LZh/b;

    invoke-virtual {v1}, LZh/b;->f()LZh/c;

    move-result-object v5

    invoke-virtual {v1}, LZh/b;->f()LZh/c;

    move-result-object v6

    invoke-static {v2, v6}, LZh/e;->g(LZh/c;LZh/c;)LZh/c;

    move-result-object v2

    invoke-direct {v4, v5, v2, v7}, LZh/b;-><init>(LZh/c;LZh/c;Z)V

    new-instance v15, LAh/c$a;

    const-class v2, Ljava/util/Map$Entry;

    invoke-direct {v0, v2}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object v2

    invoke-direct {v15, v2, v1, v4}, LAh/c$a;-><init>(LZh/b;LZh/b;LZh/b;)V

    filled-new-array/range {v8 .. v15}, [LAh/c$a;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, LAh/c;->q:Ljava/util/List;

    const-class v2, Ljava/lang/Object;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->b:LZh/d;

    invoke-direct {v0, v2, v4}, LAh/c;->f(Ljava/lang/Class;LZh/d;)V

    const-class v2, Ljava/lang/String;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->h:LZh/d;

    invoke-direct {v0, v2, v4}, LAh/c;->f(Ljava/lang/Class;LZh/d;)V

    const-class v2, Ljava/lang/CharSequence;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->g:LZh/d;

    invoke-direct {v0, v2, v4}, LAh/c;->f(Ljava/lang/Class;LZh/d;)V

    const-class v2, Ljava/lang/Throwable;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->u:LZh/c;

    invoke-direct {v0, v2, v4}, LAh/c;->e(Ljava/lang/Class;LZh/c;)V

    const-class v2, Ljava/lang/Cloneable;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->d:LZh/d;

    invoke-direct {v0, v2, v4}, LAh/c;->f(Ljava/lang/Class;LZh/d;)V

    const-class v2, Ljava/lang/Number;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->r:LZh/d;

    invoke-direct {v0, v2, v4}, LAh/c;->f(Ljava/lang/Class;LZh/d;)V

    const-class v2, Ljava/lang/Comparable;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->v:LZh/c;

    invoke-direct {v0, v2, v4}, LAh/c;->e(Ljava/lang/Class;LZh/c;)V

    const-class v2, Ljava/lang/Enum;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->s:LZh/d;

    invoke-direct {v0, v2, v4}, LAh/c;->f(Ljava/lang/Class;LZh/d;)V

    const-class v2, Ljava/lang/annotation/Annotation;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->G:LZh/c;

    invoke-direct {v0, v2, v4}, LAh/c;->e(Ljava/lang/Class;LZh/c;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAh/c$a;

    sget-object v2, LAh/c;->a:LAh/c;

    invoke-direct {v2, v1}, LAh/c;->d(LAh/c$a;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lgi/e;->values()[Lgi/e;

    move-result-object v0

    array-length v1, v0

    move v2, v7

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    sget-object v5, LAh/c;->a:LAh/c;

    sget-object v6, LZh/b;->d:LZh/b$a;

    invoke-virtual {v4}, Lgi/e;->getWrapperFqName()LZh/c;

    move-result-object v8

    const-string v9, "getWrapperFqName(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v8}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v8

    invoke-virtual {v4}, Lgi/e;->getPrimitiveType()Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object v4

    const-string v9, "getPrimitiveType(...)"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lkotlin/reflect/jvm/internal/impl/builtins/o;->c(Lkotlin/reflect/jvm/internal/impl/builtins/l;)LZh/c;

    move-result-object v4

    invoke-virtual {v6, v4}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v4

    invoke-direct {v5, v8, v4}, LAh/c;->a(LZh/b;LZh/b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/d;->a:Lkotlin/reflect/jvm/internal/impl/builtins/d;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/d;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZh/b;

    sget-object v2, LAh/c;->a:LAh/c;

    sget-object v4, LZh/b;->d:LZh/b$a;

    new-instance v5, LZh/c;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "kotlin.jvm.internal."

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, LZh/b;->h()LZh/f;

    move-result-object v8

    invoke-virtual {v8}, LZh/f;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "CompanionObject"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v4

    sget-object v5, LZh/h;->d:LZh/f;

    invoke-virtual {v1, v5}, LZh/b;->d(LZh/f;)LZh/b;

    move-result-object v1

    invoke-direct {v2, v4, v1}, LAh/c;->a(LZh/b;LZh/b;)V

    goto :goto_2

    :cond_2
    move v0, v7

    :goto_3
    const/16 v1, 0x17

    if-ge v0, v1, :cond_3

    sget-object v1, LAh/c;->a:LAh/c;

    sget-object v2, LZh/b;->d:LZh/b$a;

    new-instance v4, LZh/c;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "kotlin.jvm.functions.Function"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v2

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/o;->a(I)LZh/b;

    move-result-object v4

    invoke-direct {v1, v2, v4}, LAh/c;->a(LZh/b;LZh/b;)V

    new-instance v2, LZh/c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, LAh/c;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, LZh/c;-><init>(Ljava/lang/String;)V

    sget-object v4, LAh/c;->h:LZh/b;

    invoke-direct {v1, v2, v4}, LAh/c;->c(LZh/c;LZh/b;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    :goto_4
    const/16 v0, 0x16

    if-ge v7, v0, :cond_4

    sget-object v0, Lzh/f$c;->e:Lzh/f$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lzh/f;->b()LZh/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lzh/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, LAh/c;->a:LAh/c;

    new-instance v2, LZh/c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, LZh/c;-><init>(Ljava/lang/String;)V

    sget-object v0, LAh/c;->h:LZh/b;

    invoke-direct {v1, v2, v0}, LAh/c;->c(LZh/c;LZh/b;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_4
    sget-object v0, LAh/c;->a:LAh/c;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->c:LZh/d;

    invoke-virtual {v1}, LZh/d;->l()LZh/c;

    move-result-object v1

    const-string v2, "toSafe(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Ljava/lang/Void;

    invoke-direct {v0, v2}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LAh/c;->c(LZh/c;LZh/b;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(LZh/b;LZh/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LAh/c;->b(LZh/b;LZh/b;)V

    invoke-virtual {p2}, LZh/b;->a()LZh/c;

    move-result-object p2

    invoke-direct {p0, p2, p1}, LAh/c;->c(LZh/c;LZh/b;)V

    return-void
.end method

.method private final b(LZh/b;LZh/b;)V
    .locals 1

    sget-object v0, LAh/c;->k:Ljava/util/HashMap;

    invoke-virtual {p1}, LZh/b;->a()LZh/c;

    move-result-object p1

    invoke-virtual {p1}, LZh/c;->j()LZh/d;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final c(LZh/c;LZh/b;)V
    .locals 1

    sget-object v0, LAh/c;->l:Ljava/util/HashMap;

    invoke-virtual {p1}, LZh/c;->j()LZh/d;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final d(LAh/c$a;)V
    .locals 3

    invoke-virtual {p1}, LAh/c$a;->a()LZh/b;

    move-result-object v0

    invoke-virtual {p1}, LAh/c$a;->b()LZh/b;

    move-result-object v1

    invoke-virtual {p1}, LAh/c$a;->c()LZh/b;

    move-result-object p1

    invoke-direct {p0, v0, v1}, LAh/c;->a(LZh/b;LZh/b;)V

    invoke-virtual {p1}, LZh/b;->a()LZh/c;

    move-result-object v2

    invoke-direct {p0, v2, v0}, LAh/c;->c(LZh/c;LZh/b;)V

    sget-object v0, LAh/c;->o:Ljava/util/HashMap;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LAh/c;->p:Ljava/util/HashMap;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, LZh/b;->a()LZh/c;

    move-result-object v0

    invoke-virtual {p1}, LZh/b;->a()LZh/c;

    move-result-object v1

    sget-object v2, LAh/c;->m:Ljava/util/HashMap;

    invoke-virtual {p1}, LZh/b;->a()LZh/c;

    move-result-object p1

    invoke-virtual {p1}, LZh/c;->j()LZh/d;

    move-result-object p1

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LAh/c;->n:Ljava/util/HashMap;

    invoke-virtual {v0}, LZh/c;->j()LZh/d;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final e(Ljava/lang/Class;LZh/c;)V
    .locals 1

    invoke-direct {p0, p1}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object p1

    sget-object v0, LZh/b;->d:LZh/b$a;

    invoke-virtual {v0, p2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LAh/c;->a(LZh/b;LZh/b;)V

    return-void
.end method

.method private final f(Ljava/lang/Class;LZh/d;)V
    .locals 1

    invoke-virtual {p2}, LZh/d;->l()LZh/c;

    move-result-object p2

    const-string v0, "toSafe(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LAh/c;->e(Ljava/lang/Class;LZh/c;)V

    return-void
.end method

.method private final g(Ljava/lang/Class;)LZh/b;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, LZh/b;->d:LZh/b$a;

    new-instance v1, LZh/c;

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0}, LAh/c;->g(Ljava/lang/Class;)LZh/b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p1

    const-string v1, "identifier(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LZh/b;->d(LZh/f;)LZh/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final j(LZh/d;Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p1}, LZh/d;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "asString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, p2, v0, v1, v2}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    return v0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "substring(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p2, 0x30

    invoke-static {p1, p2, v0, v1, v2}, Lkotlin/text/t;->W0(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {p1}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 p2, 0x17

    if-lt p1, p2, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method


# virtual methods
.method public final h()LZh/c;
    .locals 1

    sget-object v0, LAh/c;->g:LZh/c;

    return-object v0
.end method

.method public final i()Ljava/util/List;
    .locals 1

    sget-object v0, LAh/c;->q:Ljava/util/List;

    return-object v0
.end method

.method public final k(LZh/d;)Z
    .locals 1

    sget-object v0, LAh/c;->m:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final l(LZh/d;)Z
    .locals 1

    sget-object v0, LAh/c;->n:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final m(LZh/c;)LZh/b;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAh/c;->k:Ljava/util/HashMap;

    invoke-virtual {p1}, LZh/c;->j()LZh/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZh/b;

    return-object p1
.end method

.method public final n(LZh/d;)LZh/b;
    .locals 1

    const-string v0, "kotlinFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAh/c;->b:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, LAh/c;->j(LZh/d;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LAh/c;->f:LZh/b;

    goto :goto_0

    :cond_0
    sget-object v0, LAh/c;->d:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, LAh/c;->j(LZh/d;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, LAh/c;->f:LZh/b;

    goto :goto_0

    :cond_1
    sget-object v0, LAh/c;->c:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, LAh/c;->j(LZh/d;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, LAh/c;->h:LZh/b;

    goto :goto_0

    :cond_2
    sget-object v0, LAh/c;->e:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, LAh/c;->j(LZh/d;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, LAh/c;->h:LZh/b;

    goto :goto_0

    :cond_3
    sget-object v0, LAh/c;->l:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZh/b;

    :goto_0
    return-object p1
.end method

.method public final o(LZh/d;)LZh/c;
    .locals 1

    sget-object v0, LAh/c;->m:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZh/c;

    return-object p1
.end method

.method public final p(LZh/d;)LZh/c;
    .locals 1

    sget-object v0, LAh/c;->n:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZh/c;

    return-object p1
.end method
