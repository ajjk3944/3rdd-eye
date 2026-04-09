.class public final Lwh/X;
.super Lwh/d0;
.source "SourceFile"

# interfaces
.implements Lth/d;
.implements Lwh/Y;
.implements Lwh/X0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/X$a;,
        Lwh/X$b;
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/Class;

.field private final e:LYg/m;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const-string v0, "jClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lwh/d0;-><init>()V

    iput-object p1, p0, Lwh/X;->d:Ljava/lang/Class;

    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance v0, Lwh/B;

    invoke-direct {v0, p0}, Lwh/B;-><init>(Lwh/X;)V

    invoke-static {p1, v0}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/X;->e:LYg/m;

    return-void
.end method

.method public static final synthetic U(Lwh/X;LZh/b;LFh/k;)LBh/e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwh/X;->Y(LZh/b;LFh/k;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic V(Lwh/X;)LZh/b;
    .locals 0

    invoke-direct {p0}, Lwh/X;->a0()LZh/b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic W(Lwh/X;)Lwh/X$a;
    .locals 0

    invoke-static {p0}, Lwh/X;->Z(Lwh/X;)Lwh/X$a;

    move-result-object p0

    return-object p0
.end method

.method private final X(LZh/b;LFh/k;)LBh/e;
    .locals 10

    new-instance v9, LDh/k;

    new-instance v1, LDh/p;

    invoke-virtual {p2}, LFh/k;->b()LBh/G;

    move-result-object v0

    invoke-virtual {p1}, LZh/b;->f()LZh/c;

    move-result-object v2

    invoke-direct {v1, v0, v2}, LDh/p;-><init>(LBh/G;LZh/c;)V

    invoke-virtual {p1}, LZh/b;->h()LZh/f;

    move-result-object v2

    sget-object v3, LBh/D;->FINAL:LBh/D;

    sget-object v4, LBh/f;->CLASS:LBh/f;

    invoke-virtual {p2}, LFh/k;->b()LBh/G;

    move-result-object p1

    invoke-interface {p1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->h()LBh/e;

    move-result-object p1

    invoke-interface {p1}, LBh/e;->u()Lpi/d0;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/util/Collection;

    sget-object v6, LBh/g0;->a:LBh/g0;

    invoke-virtual {p2}, LFh/k;->a()Lli/n;

    move-result-object p1

    invoke-virtual {p1}, Lli/n;->u()Loi/n;

    move-result-object v8

    const/4 v7, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LDh/k;-><init>(LBh/m;LZh/f;LBh/D;LBh/f;Ljava/util/Collection;LBh/g0;ZLoi/n;)V

    invoke-virtual {p2}, LFh/k;->a()Lli/n;

    move-result-object p1

    invoke-virtual {p1}, Lli/n;->u()Loi/n;

    move-result-object p1

    new-instance p2, Lwh/X$c;

    invoke-direct {p2, v9, p1}, Lwh/X$c;-><init>(LDh/k;Loi/n;)V

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {v9, p2, p1, v0}, LDh/k;->K0(Lii/k;Ljava/util/Set;LBh/d;)V

    return-object v9
.end method

.method private final Y(LZh/b;LFh/k;)LBh/e;
    .locals 4

    invoke-virtual {p0}, Lwh/X;->b()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isSynthetic()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lwh/X;->X(LZh/b;LFh/k;)LBh/e;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, LFh/f;->c:LFh/f$a;

    invoke-virtual {p0}, Lwh/X;->b()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LFh/f$a;->a(Ljava/lang/Class;)LFh/f;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LFh/f;->a()LTh/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LTh/a;->c()LTh/a$a;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const/4 v1, -0x1

    goto :goto_1

    :cond_2
    sget-object v1, Lwh/X$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    :goto_1
    const/16 v2, 0x29

    const-string v3, " (kind = "

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    new-instance p1, Lwh/Y0;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown class: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/X;->b()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    invoke-direct {p0, p1, p2}, Lwh/X;->X(LZh/b;LFh/k;)LBh/e;

    move-result-object p1

    return-object p1

    :pswitch_3
    new-instance p1, Lwh/Y0;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unresolved class: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/X;->b()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method private static final Z(Lwh/X;)Lwh/X$a;
    .locals 1

    new-instance v0, Lwh/X$a;

    invoke-direct {v0, p0}, Lwh/X$a;-><init>(Lwh/X;)V

    return-object v0
.end method

.method private final a0()LZh/b;
    .locals 2

    sget-object v0, Lwh/f1;->a:Lwh/f1;

    invoke-virtual {p0}, Lwh/X;->b()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/f1;->c(Ljava/lang/Class;)LZh/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public B()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/X;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/X$a;

    invoke-virtual {v0}, Lwh/X$a;->O()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public G()Ljava/util/Collection;
    .locals 3

    invoke-virtual {p0}, Lwh/X;->c0()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->h()LBh/f;

    move-result-object v1

    sget-object v2, LBh/f;->INTERFACE:LBh/f;

    if-eq v1, v2, :cond_1

    invoke-interface {v0}, LBh/e;->h()LBh/f;

    move-result-object v1

    sget-object v2, LBh/f;->OBJECT:LBh/f;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LBh/e;->m()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getConstructors(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    :goto_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public H(LZh/f;)Ljava/util/Collection;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwh/X;->d0()Lii/k;

    move-result-object v0

    sget-object v1, LIh/d;->FROM_REFLECTION:LIh/d;

    invoke-interface {v0, p1, v1}, Lii/k;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0}, Lwh/X;->e0()Lii/k;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Lii/k;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public I(I)LBh/Y;
    .locals 9

    invoke-virtual {p0}, Lwh/X;->b()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DefaultImpls"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwh/X;->b()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Llh/a;->e(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lwh/X;

    invoke-virtual {v0, p1}, Lwh/X;->I(I)LBh/Y;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lwh/X;->c0()LBh/e;

    move-result-object v0

    instance-of v1, v0, Lni/m;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Lni/m;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lni/m;->e1()LUh/c;

    move-result-object v1

    sget-object v3, LXh/a;->j:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    const-string v4, "classLocalVariable"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3, p1}, LWh/e;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;I)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, LUh/n;

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Lwh/X;->b()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0}, Lni/m;->d1()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->g()LWh/c;

    move-result-object v5

    invoke-virtual {v0}, Lni/m;->d1()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->j()LWh/g;

    move-result-object v6

    invoke-virtual {v0}, Lni/m;->g1()LWh/a;

    move-result-object v7

    sget-object v8, Lwh/X$d;->a:Lwh/X$d;

    invoke-static/range {v3 .. v8}, Lwh/j1;->h(Ljava/lang/Class;Lkotlin/reflect/jvm/internal/impl/protobuf/n;LWh/c;LWh/g;LWh/a;Lmh/p;)LBh/a;

    move-result-object p1

    move-object v2, p1

    check-cast v2, LBh/Y;

    :cond_2
    return-object v2
.end method

.method public J(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lwh/X;->b()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LGh/f;->g(Ljava/lang/Class;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/V;->m(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Lwh/X;->b()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LGh/f;->k(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lwh/X;->b()Ljava/lang/Class;

    move-result-object v0

    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public M(LZh/f;)Ljava/util/Collection;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwh/X;->d0()Lii/k;

    move-result-object v0

    sget-object v1, LIh/d;->FROM_REFLECTION:LIh/d;

    invoke-interface {v0, p1, v1}, Lii/k;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0}, Lwh/X;->e0()Lii/k;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Lii/k;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public bridge synthetic a()LBh/h;
    .locals 1

    invoke-virtual {p0}, Lwh/X;->c0()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lwh/X;->d:Ljava/lang/Class;

    return-object v0
.end method

.method public final b0()LYg/m;
    .locals 1

    iget-object v0, p0, Lwh/X;->e:LYg/m;

    return-object v0
.end method

.method public c0()LBh/e;
    .locals 1

    iget-object v0, p0, Lwh/X;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/X$a;

    invoke-virtual {v0}, Lwh/X$a;->L()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public final d0()Lii/k;
    .locals 1

    invoke-virtual {p0}, Lwh/X;->c0()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->r()Lii/k;

    move-result-object v0

    return-object v0
.end method

.method public final e0()Lii/k;
    .locals 2

    invoke-virtual {p0}, Lwh/X;->c0()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->Q()Lii/k;

    move-result-object v0

    const-string v1, "getStaticScope(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lwh/X;

    if-eqz v0, :cond_0

    invoke-static {p0}, Llh/a;->c(Lth/d;)Ljava/lang/Class;

    move-result-object v0

    check-cast p1, Lth/d;

    invoke-static {p1}, Llh/a;->c(Lth/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Llh/a;->c(Lth/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/X;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/X$a;

    invoke-virtual {v0}, Lwh/X$a;->P()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwh/X;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/X$a;

    invoke-virtual {v0}, Lwh/X$a;->Q()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public o()Z
    .locals 1

    invoke-virtual {p0}, Lwh/X;->c0()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->o()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lwh/X;->a0()LZh/b;

    move-result-object v1

    invoke-virtual {v1}, LZh/b;->f()LZh/c;

    move-result-object v2

    invoke-virtual {v2}, LZh/c;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v2, ""

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, LZh/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1}, LZh/b;->g()LZh/c;

    move-result-object v1

    invoke-virtual {v1}, LZh/c;->b()Ljava/lang/String;

    move-result-object v3

    const-string v1, "asString(...)"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/16 v4, 0x2e

    const/16 v5, 0x24

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/text/t;->K(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/X;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/X$a;

    invoke-virtual {v0}, Lwh/X$a;->R()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
