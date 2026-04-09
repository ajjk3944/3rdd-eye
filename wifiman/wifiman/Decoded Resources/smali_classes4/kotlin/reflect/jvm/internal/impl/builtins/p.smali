.class public abstract Lkotlin/reflect/jvm/internal/impl/builtins/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LDh/G;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v8, LDh/G;

    new-instance v1, LDh/p;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->i()LBh/G;

    move-result-object v0

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o;->s:LZh/c;

    invoke-direct {v1, v0, v2}, LDh/p;-><init>(LBh/G;LZh/c;)V

    sget-object v2, LBh/f;->INTERFACE:LBh/f;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->v:LZh/c;

    invoke-virtual {v0}, LZh/c;->g()LZh/f;

    move-result-object v5

    sget-object v6, LBh/g0;->a:LBh/g0;

    sget-object v9, Loi/f;->e:Loi/n;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v8

    move-object v7, v9

    invoke-direct/range {v0 .. v7}, LDh/G;-><init>(LBh/m;LBh/f;ZZLZh/f;LBh/g0;Loi/n;)V

    sget-object v0, LBh/D;->ABSTRACT:LBh/D;

    invoke-virtual {v8, v0}, LDh/G;->M0(LBh/D;)V

    sget-object v0, LBh/t;->e:LBh/u;

    invoke-virtual {v8, v0}, LDh/G;->O0(LBh/u;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    sget-object v3, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    const-string v0, "T"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v8

    move-object v6, v9

    invoke-static/range {v0 .. v6}, LDh/U;->R0(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLpi/N0;LZh/f;ILoi/n;)LBh/l0;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, LDh/G;->N0(Ljava/util/List;)V

    invoke-virtual {v8}, LDh/G;->K0()V

    sput-object v8, Lkotlin/reflect/jvm/internal/impl/builtins/p;->a:LDh/G;

    return-void
.end method

.method public static final a(Lpi/S;)Lpi/d0;
    .locals 13

    const-string v0, "suspendFunType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->r(Lpi/S;)Z

    invoke-static {p0}, Lsi/d;->n(Lpi/S;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v1

    invoke-virtual {p0}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->k(Lpi/S;)Lpi/S;

    move-result-object v3

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->e(Lpi/S;)Ljava/util/List;

    move-result-object v4

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->m(Lpi/S;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpi/B0;

    invoke-interface {v6}, Lpi/B0;->getType()Lpi/S;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {v0}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object v6

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/p;->a:LDh/G;

    invoke-virtual {v0}, LDh/G;->k()Lpi/v0;

    move-result-object v7

    const-string v0, "getTypeConstructor(...)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->l(Lpi/S;)Lpi/S;

    move-result-object v0

    invoke-static {v0}, Lsi/d;->d(Lpi/S;)Lpi/B0;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/16 v11, 0x10

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Lpi/V;->k(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Lpi/d0;

    move-result-object v0

    invoke-static {v5, v0}, LZg/v;->N0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {p0}, Lsi/d;->n(Lpi/S;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->I()Lpi/d0;

    move-result-object v7

    const-string v0, "getNullableAnyType(...)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x80

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->c(Lkotlin/reflect/jvm/internal/impl/builtins/i;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/S;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;ZILjava/lang/Object;)Lpi/d0;

    move-result-object v0

    invoke-virtual {p0}, Lpi/S;->O0()Z

    move-result p0

    invoke-virtual {v0, p0}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p0

    return-object p0
.end method
