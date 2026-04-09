.class public abstract Lwh/K0;
.super Lwh/A;
.source "SourceFile"

# interfaces
.implements Lth/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/K0$a;,
        Lwh/K0$b;,
        Lwh/K0$c;,
        Lwh/K0$d;
    }
.end annotation


# static fields
.field public static final m:Lwh/K0$b;

.field private static final n:Ljava/lang/Object;


# instance fields
.field private final g:Lwh/d0;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/Object;

.field private final k:LYg/m;

.field private final l:Lwh/a1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwh/K0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwh/K0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lwh/K0;->m:Lwh/K0$b;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lwh/K0;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwh/d0;LBh/Y;)V
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-interface {p2}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v3

    const-string v0, "asString(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    sget-object v0, Lwh/f1;->a:Lwh/f1;

    invoke-virtual {v0, p2}, Lwh/f1;->f(LBh/Y;)Lwh/p;

    move-result-object v0

    invoke-virtual {v0}, Lwh/p;->a()Ljava/lang/String;

    move-result-object v4

    .line 11
    sget-object v6, Lkotlin/jvm/internal/f;->NO_RECEIVER:Ljava/lang/Object;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    .line 12
    invoke-direct/range {v1 .. v6}, Lwh/K0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;LBh/Y;Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;LBh/Y;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lwh/A;-><init>()V

    .line 2
    iput-object p1, p0, Lwh/K0;->g:Lwh/d0;

    .line 3
    iput-object p2, p0, Lwh/K0;->h:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lwh/K0;->i:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lwh/K0;->j:Ljava/lang/Object;

    .line 6
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lwh/I0;

    invoke-direct {p2, p0}, Lwh/I0;-><init>(Lwh/K0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/K0;->k:LYg/m;

    .line 7
    new-instance p1, Lwh/J0;

    invoke-direct {p1, p0}, Lwh/J0;-><init>(Lwh/K0;)V

    invoke-static {p4, p1}, Lwh/a1;->b(Ljava/lang/Object;Lmh/a;)Lwh/a1$a;

    move-result-object p1

    const-string p2, "lazySoft(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwh/K0;->l:Lwh/a1$a;

    return-void
.end method

.method public constructor <init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    .line 8
    invoke-direct/range {v1 .. v6}, Lwh/K0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;LBh/Y;Ljava/lang/Object;)V

    return-void
.end method

.method private static final d0(Lwh/K0;)LBh/Y;
    .locals 2

    invoke-virtual {p0}, Lwh/K0;->W()Lwh/d0;

    move-result-object v0

    invoke-virtual {p0}, Lwh/K0;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object p0, p0, Lwh/K0;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Lwh/d0;->A(Ljava/lang/String;Ljava/lang/String;)LBh/Y;

    move-result-object p0

    return-object p0
.end method

.method private static final e0(Lwh/K0;)Ljava/lang/reflect/Field;
    .locals 10

    sget-object v0, Lwh/f1;->a:Lwh/f1;

    invoke-virtual {p0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/f1;->f(LBh/Y;)Lwh/p;

    move-result-object v0

    instance-of v1, v0, Lwh/p$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast v0, Lwh/p$c;

    invoke-virtual {v0}, Lwh/p$c;->b()LBh/Y;

    move-result-object v1

    sget-object v3, LYh/i;->a:LYh/i;

    invoke-virtual {v0}, Lwh/p$c;->e()LUh/n;

    move-result-object v4

    invoke-virtual {v0}, Lwh/p$c;->d()LWh/c;

    move-result-object v5

    invoke-virtual {v0}, Lwh/p$c;->g()LWh/g;

    move-result-object v6

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, LYh/i;->d(LYh/i;LUh/n;LWh/c;LWh/g;ZILjava/lang/Object;)LYh/d$a;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-static {v1}, LJh/o;->e(LBh/Y;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Lwh/p$c;->e()LUh/n;

    move-result-object v0

    invoke-static {v0}, LYh/i;->f(LUh/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, LBh/r0;->b()LBh/m;

    move-result-object v0

    instance-of v1, v0, LBh/e;

    if-eqz v1, :cond_1

    check-cast v0, LBh/e;

    invoke-static {v0}, Lwh/j1;->q(LBh/e;)Ljava/lang/Class;

    move-result-object p0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lwh/K0;->W()Lwh/d0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/internal/h;->b()Ljava/lang/Class;

    move-result-object p0

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lwh/K0;->W()Lwh/d0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/internal/h;->b()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object p0

    :goto_1
    if-eqz p0, :cond_6

    :try_start_0
    invoke-virtual {v3}, LYh/d$a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_3
    instance-of p0, v0, Lwh/p$a;

    if-eqz p0, :cond_4

    check-cast v0, Lwh/p$a;

    invoke-virtual {v0}, Lwh/p$a;->b()Ljava/lang/reflect/Field;

    move-result-object v2

    goto :goto_2

    :cond_4
    instance-of p0, v0, Lwh/p$b;

    if-eqz p0, :cond_5

    goto :goto_2

    :cond_5
    instance-of p0, v0, Lwh/p$d;

    if-eqz p0, :cond_7

    :catch_0
    :cond_6
    :goto_2
    return-object v2

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method static synthetic f0(Lwh/K0;)Ljava/lang/reflect/Field;
    .locals 0

    invoke-static {p0}, Lwh/K0;->e0(Lwh/K0;)Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g0(Lwh/K0;)LBh/Y;
    .locals 0

    invoke-static {p0}, Lwh/K0;->d0(Lwh/K0;)LBh/Y;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public V()Lxh/h;
    .locals 1

    invoke-virtual {p0}, Lwh/K0;->l0()Lwh/K0$c;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0$c;->V()Lxh/h;

    move-result-object v0

    return-object v0
.end method

.method public W()Lwh/d0;
    .locals 1

    iget-object v0, p0, Lwh/K0;->g:Lwh/d0;

    return-object v0
.end method

.method public X()Lxh/h;
    .locals 1

    invoke-virtual {p0}, Lwh/K0;->l0()Lwh/K0$c;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0$a;->X()Lxh/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic Y()LBh/b;
    .locals 1

    invoke-virtual {p0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v0

    return-object v0
.end method

.method public b0()Z
    .locals 2

    iget-object v0, p0, Lwh/K0;->j:Ljava/lang/Object;

    sget-object v1, Lkotlin/jvm/internal/f;->NO_RECEIVER:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    invoke-static {p1}, Lwh/j1;->d(Ljava/lang/Object;)Lwh/K0;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lwh/K0;->W()Lwh/d0;

    move-result-object v1

    invoke-virtual {p1}, Lwh/K0;->W()Lwh/d0;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lwh/K0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lwh/K0;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lwh/K0;->i:Ljava/lang/String;

    iget-object v2, p1, Lwh/K0;->i:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lwh/K0;->j:Ljava/lang/Object;

    iget-object p1, p1, Lwh/K0;->j:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/K0;->h:Ljava/lang/String;

    return-object v0
.end method

.method protected final h0()Ljava/lang/reflect/Member;
    .locals 4

    invoke-virtual {p0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v0

    invoke-interface {v0}, LBh/u0;->N()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lwh/f1;->a:Lwh/f1;

    invoke-virtual {p0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v2

    invoke-virtual {v0, v2}, Lwh/f1;->f(LBh/Y;)Lwh/p;

    move-result-object v0

    instance-of v2, v0, Lwh/p$c;

    if-eqz v2, :cond_3

    check-cast v0, Lwh/p$c;

    invoke-virtual {v0}, Lwh/p$c;->f()LXh/a$d;

    move-result-object v2

    invoke-virtual {v2}, LXh/a$d;->G0()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lwh/p$c;->f()LXh/a$d;

    move-result-object v2

    invoke-virtual {v2}, LXh/a$d;->d0()LXh/a$c;

    move-result-object v2

    invoke-virtual {v2}, LXh/a$c;->d0()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, LXh/a$c;->T()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lwh/p$c;->d()LWh/c;

    move-result-object v1

    invoke-virtual {v2}, LXh/a$c;->S()I

    move-result v3

    invoke-interface {v1, v3}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lwh/p$c;->d()LWh/c;

    move-result-object v0

    invoke-virtual {v2}, LXh/a$c;->P()I

    move-result v2

    invoke-interface {v0, v2}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lwh/K0;->W()Lwh/d0;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lwh/d0;->z(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_0
    return-object v1

    :cond_3
    invoke-virtual {p0}, Lwh/K0;->m0()Ljava/lang/reflect/Field;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lwh/K0;->W()Lwh/d0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lwh/K0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lwh/K0;->i:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i0()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwh/K0;->j:Ljava/lang/Object;

    invoke-virtual {p0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v1

    invoke-static {v0, v1}, Lxh/o;->h(Ljava/lang/Object;LBh/b;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public isSuspend()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected final j0(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    :try_start_0
    sget-object v0, Lwh/K0;->n:Ljava/lang/Object;

    if-eq p2, v0, :cond_0

    if-ne p3, v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v1

    invoke-interface {v1}, LBh/a;->k0()LBh/b0;

    move-result-object v1

    if-eqz v1, :cond_10

    :cond_1
    invoke-virtual {p0}, Lwh/K0;->b0()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lwh/K0;->i0()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :cond_2
    move-object v1, p2

    :goto_0
    const/4 v2, 0x0

    if-eq v1, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, v2

    :goto_1
    invoke-virtual {p0}, Lwh/K0;->b0()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move-object p2, p3

    :goto_2
    if-eq p2, v0, :cond_5

    goto :goto_3

    :cond_5
    move-object p2, v2

    :goto_3
    instance-of p3, p1, Ljava/lang/reflect/AccessibleObject;

    if-eqz p3, :cond_6

    move-object p3, p1

    check-cast p3, Ljava/lang/reflect/AccessibleObject;

    goto :goto_4

    :cond_6
    move-object p3, v2

    :goto_4
    if-eqz p3, :cond_7

    invoke-static {p0}, Lvh/a;->a(Lth/c;)Z

    move-result v0

    invoke-virtual {p3, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_7
    if-nez p1, :cond_8

    goto/16 :goto_5

    :cond_8
    instance-of p3, p1, Ljava/lang/reflect/Field;

    if-eqz p3, :cond_9

    check-cast p1, Ljava/lang/reflect/Field;

    invoke-virtual {p1, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto/16 :goto_5

    :cond_9
    instance-of p3, p1, Ljava/lang/reflect/Method;

    if-eqz p3, :cond_f

    move-object p3, p1

    check-cast p3, Ljava/lang/reflect/Method;

    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p3

    array-length p3, p3
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p3, :cond_e

    const-string v0, "get(...)"

    const/4 v3, 0x1

    if-eq p3, v3, :cond_c

    const/4 v4, 0x2

    if-ne p3, v4, :cond_b

    :try_start_1
    move-object p3, p1

    check-cast p3, Ljava/lang/reflect/Method;

    if-nez p2, :cond_a

    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    aget-object p1, p1, v3

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwh/j1;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    :cond_a
    filled-new-array {v1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p3, v2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_5

    :cond_b
    new-instance p2, Ljava/lang/AssertionError;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "delegate method "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " should take 0, 1, or 2 parameters"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :cond_c
    move-object p2, p1

    check-cast p2, Ljava/lang/reflect/Method;

    if-nez v1, :cond_d

    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    const/4 p3, 0x0

    aget-object p1, p1, p3

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwh/j1;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    :cond_d
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, v2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_5

    :cond_e
    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_5
    return-object v2

    :cond_f
    new-instance p2, Ljava/lang/AssertionError;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "delegate field/method "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " neither field nor method"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :cond_10
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p3, 0x27

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "\' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_6
    new-instance p2, Lkotlin/reflect/full/IllegalPropertyDelegateAccessException;

    invoke-direct {p2, p1}, Lkotlin/reflect/full/IllegalPropertyDelegateAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw p2
.end method

.method public k0()LBh/Y;
    .locals 2

    iget-object v0, p0, Lwh/K0;->l:Lwh/a1$a;

    invoke-virtual {v0}, Lwh/a1$a;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LBh/Y;

    return-object v0
.end method

.method public abstract l0()Lwh/K0$c;
.end method

.method public final m0()Ljava/lang/reflect/Field;
    .locals 1

    iget-object v0, p0, Lwh/K0;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public final n0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/K0;->i:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lwh/e1;->a:Lwh/e1;

    invoke-virtual {p0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/e1;->k(LBh/Y;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
