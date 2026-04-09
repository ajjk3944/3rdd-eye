.class public abstract Lwh/P0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lwh/K0$a;Z)Lxh/h;
    .locals 0

    invoke-static {p0, p1}, Lwh/P0;->b(Lwh/K0$a;Z)Lxh/h;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lwh/K0$a;Z)Lxh/h;
    .locals 6

    sget-object v0, Lwh/d0;->a:Lwh/d0$a;

    invoke-virtual {v0}, Lwh/d0$a;->a()Lkotlin/text/p;

    move-result-object v0

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v1

    invoke-virtual {v1}, Lwh/K0;->n0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/text/p;->m(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lxh/l;->a:Lxh/l;

    return-object p0

    :cond_0
    sget-object v0, Lwh/f1;->a:Lwh/f1;

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v1

    invoke-virtual {v1}, Lwh/K0;->k0()LBh/Y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/f1;->f(LBh/Y;)Lwh/p;

    move-result-object v0

    instance-of v1, v0, Lwh/p$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_e

    check-cast v0, Lwh/p$c;

    invoke-virtual {v0}, Lwh/p$c;->f()LXh/a$d;

    move-result-object v1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, LXh/a$d;->M0()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, LXh/a$d;->q0()LXh/a$c;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, LXh/a$d;->N0()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, LXh/a$d;->C0()LXh/a$c;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v3

    invoke-virtual {v3}, Lwh/K0;->W()Lwh/d0;

    move-result-object v3

    invoke-virtual {v0}, Lwh/p$c;->d()LWh/c;

    move-result-object v4

    invoke-virtual {v1}, LXh/a$c;->S()I

    move-result v5

    invoke-interface {v4, v5}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lwh/p$c;->d()LWh/c;

    move-result-object v0

    invoke-virtual {v1}, LXh/a$c;->P()I

    move-result v1

    invoke-interface {v0, v1}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lwh/d0;->z(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_8

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v0

    invoke-static {v0}, Lbi/k;->e(LBh/t0;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v0

    invoke-interface {v0}, LBh/C;->getVisibility()LBh/u;

    move-result-object v0

    sget-object v1, LBh/t;->d:LBh/u;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object p1

    invoke-virtual {p1}, Lwh/K0;->k0()LBh/Y;

    move-result-object p1

    invoke-interface {p1}, LBh/r0;->b()LBh/m;

    move-result-object p1

    invoke-static {p1}, Lxh/o;->s(LBh/m;)Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v0

    invoke-static {p1, v0}, Lxh/o;->m(Ljava/lang/Class;LBh/b;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lwh/K0$a;->b0()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lxh/k$a;

    invoke-static {p0}, Lwh/P0;->f(Lwh/K0$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lxh/k$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    new-instance v0, Lxh/k$b;

    invoke-direct {v0, p1}, Lxh/k$b;-><init>(Ljava/lang/reflect/Method;)V

    goto/16 :goto_4

    :cond_5
    new-instance p1, Lwh/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Underlying property of inline class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " should have a field"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0;->m0()Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {p0, p1, v0}, Lwh/P0;->c(Lwh/K0$a;ZLjava/lang/reflect/Field;)Lxh/i;

    move-result-object v0

    goto/16 :goto_4

    :cond_7
    new-instance p1, Lwh/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No accessors or field is found for property "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result p1

    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result p1

    if-nez p1, :cond_a

    invoke-virtual {p0}, Lwh/K0$a;->b0()Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Lxh/i$h$a;

    invoke-static {p0}, Lwh/P0;->f(Lwh/K0$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lxh/i$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    :goto_2
    move-object v0, p1

    goto/16 :goto_4

    :cond_9
    new-instance p1, Lxh/i$h$e;

    invoke-direct {p1, v0}, Lxh/i$h$e;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_2

    :cond_a
    invoke-static {p0}, Lwh/P0;->d(Lwh/K0$a;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Lwh/K0$a;->b0()Z

    move-result p1

    if-eqz p1, :cond_b

    new-instance p1, Lxh/i$h$b;

    invoke-direct {p1, v0}, Lxh/i$h$b;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_2

    :cond_b
    new-instance p1, Lxh/i$h$f;

    invoke-direct {p1, v0}, Lxh/i$h$f;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_2

    :cond_c
    invoke-virtual {p0}, Lwh/K0$a;->b0()Z

    move-result p1

    if-eqz p1, :cond_d

    new-instance p1, Lxh/i$h$c;

    invoke-static {p0}, Lwh/P0;->f(Lwh/K0$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lxh/i$h$c;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_2

    :cond_d
    new-instance p1, Lxh/i$h$g;

    invoke-direct {p1, v0}, Lxh/i$h$g;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_2

    :cond_e
    instance-of v1, v0, Lwh/p$a;

    if-eqz v1, :cond_f

    check-cast v0, Lwh/p$a;

    invoke-virtual {v0}, Lwh/p$a;->b()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lwh/P0;->c(Lwh/K0$a;ZLjava/lang/reflect/Field;)Lxh/i;

    move-result-object v0

    goto :goto_4

    :cond_f
    instance-of v1, v0, Lwh/p$b;

    if-eqz v1, :cond_13

    if-eqz p1, :cond_10

    check-cast v0, Lwh/p$b;

    invoke-virtual {v0}, Lwh/p$b;->b()Ljava/lang/reflect/Method;

    move-result-object p1

    goto :goto_3

    :cond_10
    check-cast v0, Lwh/p$b;

    invoke-virtual {v0}, Lwh/p$b;->c()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_12

    :goto_3
    invoke-virtual {p0}, Lwh/K0$a;->b0()Z

    move-result v0

    if-eqz v0, :cond_11

    new-instance v0, Lxh/i$h$a;

    invoke-static {p0}, Lwh/P0;->f(Lwh/K0$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lxh/i$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_4

    :cond_11
    new-instance v0, Lxh/i$h$e;

    invoke-direct {v0, p1}, Lxh/i$h$e;-><init>(Ljava/lang/reflect/Method;)V

    :goto_4
    invoke-virtual {p0}, Lwh/K0$a;->d0()LBh/X;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v1, 0x2

    invoke-static {v0, p0, p1, v1, v2}, Lxh/o;->j(Lxh/h;LBh/b;ZILjava/lang/Object;)Lxh/h;

    move-result-object p0

    return-object p0

    :cond_12
    new-instance p0, Lwh/Y0;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No source found for setter of Java method property: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lwh/p$b;->b()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_13
    instance-of v1, v0, Lwh/p$d;

    if-eqz v1, :cond_18

    if-eqz p1, :cond_14

    check-cast v0, Lwh/p$d;

    invoke-virtual {v0}, Lwh/p$d;->b()Lwh/n$e;

    move-result-object p1

    goto :goto_5

    :cond_14
    check-cast v0, Lwh/p$d;

    invoke-virtual {v0}, Lwh/p$d;->c()Lwh/n$e;

    move-result-object p1

    if-eqz p1, :cond_17

    :goto_5
    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0;->W()Lwh/d0;

    move-result-object v0

    invoke-virtual {p1}, Lwh/n$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lwh/n$e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lwh/d0;->z(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_16

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    invoke-virtual {p0}, Lwh/K0$a;->b0()Z

    move-result v0

    if-eqz v0, :cond_15

    new-instance v0, Lxh/i$h$a;

    invoke-static {p0}, Lwh/P0;->f(Lwh/K0$a;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Lxh/i$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_6

    :cond_15
    new-instance v0, Lxh/i$h$e;

    invoke-direct {v0, p1}, Lxh/i$h$e;-><init>(Ljava/lang/reflect/Method;)V

    :goto_6
    return-object v0

    :cond_16
    new-instance p1, Lwh/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No accessor found for property "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    new-instance p1, Lwh/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No setter found for property "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final c(Lwh/K0$a;ZLjava/lang/reflect/Field;)Lxh/i;
    .locals 1

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0;->k0()LBh/Y;

    move-result-object v0

    invoke-static {v0}, Lwh/P0;->g(LBh/Y;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, Lwh/P0;->d(Lwh/K0$a;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lwh/K0$a;->b0()Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Lxh/i$f$b;

    invoke-direct {p0, p2}, Lxh/i$f$b;-><init>(Ljava/lang/reflect/Field;)V

    goto/16 :goto_2

    :cond_1
    new-instance p0, Lxh/i$f$d;

    invoke-direct {p0, p2}, Lxh/i$f$d;-><init>(Ljava/lang/reflect/Field;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lwh/K0$a;->b0()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lxh/i$g$b;

    invoke-static {p0}, Lwh/P0;->e(Lwh/K0$a;)Z

    move-result p0

    invoke-direct {p1, p2, p0}, Lxh/i$g$b;-><init>(Ljava/lang/reflect/Field;Z)V

    :goto_0
    move-object p0, p1

    goto :goto_2

    :cond_3
    new-instance p1, Lxh/i$g$d;

    invoke-static {p0}, Lwh/P0;->e(Lwh/K0$a;)Z

    move-result p0

    invoke-direct {p1, p2, p0}, Lxh/i$g$d;-><init>(Ljava/lang/reflect/Field;Z)V

    goto :goto_0

    :cond_4
    if-eqz p1, :cond_5

    new-instance p0, Lxh/i$f$e;

    invoke-direct {p0, p2}, Lxh/i$f$e;-><init>(Ljava/lang/reflect/Field;)V

    goto :goto_2

    :cond_5
    new-instance p1, Lxh/i$g$e;

    invoke-static {p0}, Lwh/P0;->e(Lwh/K0$a;)Z

    move-result p0

    invoke-direct {p1, p2, p0}, Lxh/i$g$e;-><init>(Ljava/lang/reflect/Field;Z)V

    goto :goto_0

    :cond_6
    :goto_1
    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lwh/K0$a;->b0()Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lxh/i$f$a;

    invoke-static {p0}, Lwh/P0;->f(Lwh/K0$a;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {p1, p2, p0}, Lxh/i$f$a;-><init>(Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    goto :goto_0

    :cond_7
    new-instance p0, Lxh/i$f$c;

    invoke-direct {p0, p2}, Lxh/i$f$c;-><init>(Ljava/lang/reflect/Field;)V

    goto :goto_2

    :cond_8
    invoke-virtual {p0}, Lwh/K0$a;->b0()Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Lxh/i$g$a;

    invoke-static {p0}, Lwh/P0;->e(Lwh/K0$a;)Z

    move-result v0

    invoke-static {p0}, Lwh/P0;->f(Lwh/K0$a;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {p1, p2, v0, p0}, Lxh/i$g$a;-><init>(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V

    goto :goto_0

    :cond_9
    new-instance p1, Lxh/i$g$c;

    invoke-static {p0}, Lwh/P0;->e(Lwh/K0$a;)Z

    move-result p0

    invoke-direct {p1, p2, p0}, Lxh/i$g$c;-><init>(Ljava/lang/reflect/Field;Z)V

    goto :goto_0

    :goto_2
    return-object p0
.end method

.method private static final d(Lwh/K0$a;)Z
    .locals 1

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object p0

    invoke-virtual {p0}, Lwh/K0;->k0()LBh/Y;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    invoke-static {}, Lwh/j1;->j()LZh/c;

    move-result-object v0

    invoke-interface {p0, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->P(LZh/c;)Z

    move-result p0

    return p0
.end method

.method private static final e(Lwh/K0$a;)Z
    .locals 0

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object p0

    invoke-virtual {p0}, Lwh/K0;->k0()LBh/Y;

    move-result-object p0

    invoke-interface {p0}, LBh/r0;->getType()Lpi/S;

    move-result-object p0

    invoke-static {p0}, Lpi/J0;->l(Lpi/S;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final f(Lwh/K0$a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object p0

    invoke-virtual {p0}, Lwh/K0;->i0()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LBh/Y;)Z
    .locals 4

    invoke-interface {p0}, LBh/r0;->b()LBh/m;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lbi/i;->x(LBh/m;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-interface {v0}, LBh/m;->b()LBh/m;

    move-result-object v0

    invoke-static {v0}, Lbi/i;->C(LBh/m;)Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_2

    invoke-static {v0}, Lbi/i;->t(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v3

    goto :goto_2

    :cond_2
    :goto_1
    instance-of v0, p0, Lni/N;

    if-eqz v0, :cond_3

    check-cast p0, Lni/N;

    invoke-virtual {p0}, Lni/N;->f1()LUh/n;

    move-result-object p0

    invoke-static {p0}, LYh/i;->f(LUh/n;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    :goto_2
    return v2
.end method
