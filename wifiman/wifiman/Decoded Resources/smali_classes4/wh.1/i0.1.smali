.class public final Lwh/i0;
.super Lwh/A;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/internal/n;
.implements Lth/g;
.implements Lwh/l;


# static fields
.field static final synthetic m:[Lth/l;


# instance fields
.field private final g:Lwh/d0;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/Object;

.field private final j:Lwh/a1$a;

.field private final k:LYg/m;

.field private final l:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lwh/i0;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "descriptor"

    const-string v3, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lwh/i0;->m:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lwh/d0;LBh/z;)V
    .locals 9

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-interface {p2}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v3

    const-string v0, "asString(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    sget-object v0, Lwh/f1;->a:Lwh/f1;

    invoke-virtual {v0, p2}, Lwh/f1;->g(LBh/z;)Lwh/n;

    move-result-object v0

    invoke-virtual {v0}, Lwh/n;->a()Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    .line 13
    invoke-direct/range {v1 .. v8}, Lwh/i0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;LBh/z;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;LBh/z;Ljava/lang/Object;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lwh/A;-><init>()V

    .line 4
    iput-object p1, p0, Lwh/i0;->g:Lwh/d0;

    .line 5
    iput-object p3, p0, Lwh/i0;->h:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lwh/i0;->i:Ljava/lang/Object;

    .line 7
    new-instance p1, Lwh/f0;

    invoke-direct {p1, p0, p2}, Lwh/f0;-><init>(Lwh/i0;Ljava/lang/String;)V

    invoke-static {p4, p1}, Lwh/a1;->b(Ljava/lang/Object;Lmh/a;)Lwh/a1$a;

    move-result-object p1

    iput-object p1, p0, Lwh/i0;->j:Lwh/a1$a;

    .line 8
    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lwh/g0;

    invoke-direct {p2, p0}, Lwh/g0;-><init>(Lwh/i0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p2

    iput-object p2, p0, Lwh/i0;->k:LYg/m;

    .line 9
    new-instance p2, Lwh/h0;

    invoke-direct {p2, p0}, Lwh/h0;-><init>(Lwh/i0;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/i0;->l:LYg/m;

    return-void
.end method

.method synthetic constructor <init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;LBh/z;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 1
    sget-object p5, Lkotlin/jvm/internal/f;->NO_RECEIVER:Ljava/lang/Object;

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Lwh/i0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;LBh/z;Ljava/lang/Object;)V

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

    .line 10
    invoke-direct/range {v1 .. v6}, Lwh/i0;-><init>(Lwh/d0;Ljava/lang/String;Ljava/lang/String;LBh/z;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic d0(Lwh/i0;Ljava/lang/String;)LBh/z;
    .locals 0

    invoke-static {p0, p1}, Lwh/i0;->m0(Lwh/i0;Ljava/lang/String;)LBh/z;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e0(Lwh/i0;)Lxh/h;
    .locals 0

    invoke-static {p0}, Lwh/i0;->g0(Lwh/i0;)Lxh/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f0(Lwh/i0;)Lxh/h;
    .locals 0

    invoke-static {p0}, Lwh/i0;->l0(Lwh/i0;)Lxh/h;

    move-result-object p0

    return-object p0
.end method

.method private static final g0(Lwh/i0;)Lxh/h;
    .locals 11

    sget-object v0, Lwh/f1;->a:Lwh/f1;

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/f1;->g(LBh/z;)Lwh/n;

    move-result-object v0

    instance-of v1, v0, Lwh/n$d;

    const/16 v2, 0xa

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lwh/A;->a0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/internal/h;->b()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {p0}, Lwh/A;->getParameters()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {p0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lth/k;

    invoke-interface {v0}, Lth/k;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v6, Lxh/a$a;->POSITIONAL_CALL:Lxh/a$a;

    sget-object v7, Lxh/a$b;->KOTLIN:Lxh/a$b;

    new-instance p0, Lxh/a;

    const/4 v8, 0x0

    const/16 v9, 0x10

    const/4 v10, 0x0

    move-object v3, p0

    invoke-direct/range {v3 .. v10}, Lxh/a;-><init>(Ljava/lang/Class;Ljava/util/List;Lxh/a$a;Lxh/a$b;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object v1

    check-cast v0, Lwh/n$d;

    invoke-virtual {v0}, Lwh/n$d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lwh/d0;->s(Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    goto/16 :goto_1

    :cond_2
    instance-of v1, v0, Lwh/n$e;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v1

    invoke-interface {v1}, LBh/z;->b()LBh/m;

    move-result-object v2

    const-string v3, "getContainingDeclaration(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lbi/k;->d(LBh/m;)Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, v1, LBh/l;

    if-eqz v2, :cond_3

    check-cast v1, LBh/l;

    invoke-interface {v1}, LBh/l;->B()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lxh/n$b;

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v2

    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object v3

    check-cast v0, Lwh/n$e;

    invoke-virtual {v0}, Lwh/n$e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object p0

    invoke-interface {p0}, LBh/a;->i()Ljava/util/List;

    move-result-object p0

    const-string v4, "getValueParameters(...)"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3, v0, p0}, Lxh/n$b;-><init>(LBh/z;Lwh/d0;Ljava/lang/String;Ljava/util/List;)V

    return-object v1

    :cond_3
    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object v1

    check-cast v0, Lwh/n$e;

    invoke-virtual {v0}, Lwh/n$e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lwh/n$e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lwh/d0;->z(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    goto :goto_1

    :cond_4
    instance-of v1, v0, Lwh/n$c;

    const-string v3, "null cannot be cast to non-null type java.lang.reflect.Member"

    if-eqz v1, :cond_5

    check-cast v0, Lwh/n$c;

    invoke-virtual {v0}, Lwh/n$c;->b()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    instance-of v1, v0, Lwh/n$b;

    if-eqz v1, :cond_a

    check-cast v0, Lwh/n$b;

    invoke-virtual {v0}, Lwh/n$b;->d()Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v1

    invoke-direct {p0, v0, v1, v2}, Lwh/i0;->h0(Ljava/lang/reflect/Constructor;LBh/z;Z)Lxh/i;

    move-result-object v0

    goto :goto_2

    :cond_6
    instance-of v1, v0, Ljava/lang/reflect/Method;

    if-eqz v1, :cond_9

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-direct {p0, v0}, Lwh/i0;->i0(Ljava/lang/reflect/Method;)Lxh/i$h;

    move-result-object v0

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-static {}, Lwh/j1;->j()LZh/c;

    move-result-object v3

    invoke-interface {v1, v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->l(LZh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-direct {p0, v0}, Lwh/i0;->j0(Ljava/lang/reflect/Method;)Lxh/i$h;

    move-result-object v0

    goto :goto_2

    :cond_8
    invoke-direct {p0, v0}, Lwh/i0;->k0(Ljava/lang/reflect/Method;)Lxh/i$h;

    move-result-object v0

    :goto_2
    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object p0

    const/4 v1, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p0, v2, v1, v3}, Lxh/o;->j(Lxh/h;LBh/b;ZILjava/lang/Object;)Lxh/h;

    move-result-object p0

    return-object p0

    :cond_9
    new-instance v1, Lwh/Y0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not compute caller for function: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " (member = "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    instance-of v1, v0, Lwh/n$a;

    if-eqz v1, :cond_c

    check-cast v0, Lwh/n$a;

    invoke-virtual {v0}, Lwh/n$a;->d()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/internal/h;->b()Ljava/lang/Class;

    move-result-object v4

    move-object p0, v8

    check-cast p0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {p0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_b
    sget-object v6, Lxh/a$a;->POSITIONAL_CALL:Lxh/a$a;

    sget-object v7, Lxh/a$b;->JAVA:Lxh/a$b;

    new-instance p0, Lxh/a;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lxh/a;-><init>(Ljava/lang/Class;Ljava/util/List;Lxh/a$a;Lxh/a$b;Ljava/util/List;)V

    return-object p0

    :cond_c
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private final h0(Ljava/lang/reflect/Constructor;LBh/z;Z)Lxh/i;
    .locals 0

    if-nez p3, :cond_1

    invoke-static {p2}, Lgi/b;->f(LBh/b;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lwh/i0;->b0()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lxh/i$a;

    invoke-direct {p0}, Lwh/i0;->n0()Ljava/lang/Object;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lxh/i$a;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lxh/i$b;

    invoke-direct {p2, p1}, Lxh/i$b;-><init>(Ljava/lang/reflect/Constructor;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lwh/i0;->b0()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lxh/i$c;

    invoke-direct {p0}, Lwh/i0;->n0()Ljava/lang/Object;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lxh/i$c;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance p2, Lxh/i$e;

    invoke-direct {p2, p1}, Lxh/i$e;-><init>(Ljava/lang/reflect/Constructor;)V

    :goto_0
    return-object p2
.end method

.method private final i0(Ljava/lang/reflect/Method;)Lxh/i$h;
    .locals 2

    invoke-virtual {p0}, Lwh/i0;->b0()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lxh/i$h$a;

    invoke-direct {p0}, Lwh/i0;->n0()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lxh/i$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lxh/i$h$e;

    invoke-direct {v0, p1}, Lxh/i$h$e;-><init>(Ljava/lang/reflect/Method;)V

    :goto_0
    return-object v0
.end method

.method private final j0(Ljava/lang/reflect/Method;)Lxh/i$h;
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->b0()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lxh/i$h$b;

    invoke-direct {v0, p1}, Lxh/i$h$b;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lxh/i$h$f;

    invoke-direct {v0, p1}, Lxh/i$h$f;-><init>(Ljava/lang/reflect/Method;)V

    :goto_0
    return-object v0
.end method

.method private final k0(Ljava/lang/reflect/Method;)Lxh/i$h;
    .locals 2

    invoke-virtual {p0}, Lwh/i0;->b0()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lxh/i$h$c;

    invoke-direct {p0, p1}, Lwh/i0;->q0(Ljava/lang/reflect/Method;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lwh/i0;->i:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lwh/i0;->n0()Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-direct {v0, p1, v1}, Lxh/i$h$c;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Lxh/i$h$g;

    invoke-direct {v0, p1}, Lxh/i$h$g;-><init>(Ljava/lang/reflect/Method;)V

    :goto_1
    return-object v0
.end method

.method private static final l0(Lwh/i0;)Lxh/h;
    .locals 11

    sget-object v0, Lwh/f1;->a:Lwh/f1;

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/f1;->g(LBh/z;)Lwh/n;

    move-result-object v1

    instance-of v2, v1, Lwh/n$e;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v2

    invoke-interface {v2}, LBh/z;->b()LBh/m;

    move-result-object v5

    const-string v6, "getContainingDeclaration(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lbi/k;->d(LBh/m;)Z

    move-result v5

    if-eqz v5, :cond_1

    instance-of v5, v2, LBh/l;

    if-eqz v5, :cond_1

    check-cast v2, LBh/l;

    invoke-interface {v2}, LBh/l;->B()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lwh/Y0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object p0

    invoke-interface {p0}, LBh/z;->b()LBh/m;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " cannot have default arguments"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v2

    invoke-direct {p0, v2}, Lwh/i0;->p0(LBh/z;)LBh/z;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v2}, Lwh/f1;->g(LBh/z;)Lwh/n;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lwh/n$e;

    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object v1

    invoke-virtual {v0}, Lwh/n$e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lwh/n$e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0, v4}, Lwh/d0;->w(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;

    move-result-object v0

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object v0

    check-cast v1, Lwh/n$e;

    invoke-virtual {v1}, Lwh/n$e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lwh/n$e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lwh/i0;->V()Lxh/h;

    move-result-object v5

    invoke-interface {v5}, Lxh/h;->b()Ljava/lang/reflect/Member;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v5}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    xor-int/2addr v5, v4

    invoke-virtual {v0, v2, v1, v5}, Lwh/d0;->w(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;

    move-result-object v0

    goto/16 :goto_3

    :cond_3
    instance-of v0, v1, Lwh/n$d;

    const/16 v2, 0xa

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lwh/A;->a0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/internal/h;->b()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {p0}, Lwh/A;->getParameters()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {p0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lth/k;

    invoke-interface {v0}, Lth/k;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    sget-object v6, Lxh/a$a;->CALL_BY_NAME:Lxh/a$a;

    sget-object v7, Lxh/a$b;->KOTLIN:Lxh/a$b;

    new-instance p0, Lxh/a;

    const/4 v8, 0x0

    const/16 v9, 0x10

    const/4 v10, 0x0

    move-object v3, p0

    invoke-direct/range {v3 .. v10}, Lxh/a;-><init>(Ljava/lang/Class;Ljava/util/List;Lxh/a$a;Lxh/a$b;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_5
    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object v0

    check-cast v1, Lwh/n$d;

    invoke-virtual {v1}, Lwh/n$d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/d0;->u(Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    goto :goto_3

    :cond_6
    instance-of v0, v1, Lwh/n$a;

    if-eqz v0, :cond_8

    check-cast v1, Lwh/n$a;

    invoke-virtual {v1}, Lwh/n$a;->d()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/internal/h;->b()Ljava/lang/Class;

    move-result-object v4

    move-object p0, v8

    check-cast p0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {p0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    sget-object v6, Lxh/a$a;->CALL_BY_NAME:Lxh/a$a;

    sget-object v7, Lxh/a$b;->JAVA:Lxh/a$b;

    new-instance p0, Lxh/a;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lxh/a;-><init>(Ljava/lang/Class;Ljava/util/List;Lxh/a$a;Lxh/a$b;Ljava/util/List;)V

    return-object p0

    :cond_8
    move-object v0, v3

    :goto_3
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    if-eqz v1, :cond_9

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v1

    invoke-direct {p0, v0, v1, v4}, Lwh/i0;->h0(Ljava/lang/reflect/Constructor;LBh/z;Z)Lxh/i;

    move-result-object v0

    goto :goto_4

    :cond_9
    instance-of v1, v0, Ljava/lang/reflect/Method;

    if-eqz v1, :cond_b

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-static {}, Lwh/j1;->j()LZh/c;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->l(LZh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v1

    invoke-interface {v1}, LBh/z;->b()LBh/m;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LBh/e;

    invoke-interface {v1}, LBh/e;->z()Z

    move-result v1

    if-nez v1, :cond_a

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-direct {p0, v0}, Lwh/i0;->j0(Ljava/lang/reflect/Method;)Lxh/i$h;

    move-result-object v0

    goto :goto_4

    :cond_a
    check-cast v0, Ljava/lang/reflect/Method;

    invoke-direct {p0, v0}, Lwh/i0;->k0(Ljava/lang/reflect/Method;)Lxh/i$h;

    move-result-object v0

    goto :goto_4

    :cond_b
    move-object v0, v3

    :goto_4
    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object p0

    invoke-static {v0, p0, v4}, Lxh/o;->i(Lxh/h;LBh/b;Z)Lxh/h;

    move-result-object v3

    :cond_c
    return-object v3
.end method

.method private static final m0(Lwh/i0;Ljava/lang/String;)LBh/z;
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object v0

    iget-object p0, p0, Lwh/i0;->h:Ljava/lang/String;

    invoke-virtual {v0, p1, p0}, Lwh/d0;->x(Ljava/lang/String;Ljava/lang/String;)LBh/z;

    move-result-object p0

    return-object p0
.end method

.method private final n0()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwh/i0;->i:Ljava/lang/Object;

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v1

    invoke-static {v0, v1}, Lxh/o;->h(Ljava/lang/Object;LBh/b;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final p0(LBh/z;)LBh/z;
    .locals 5

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/s0;

    invoke-interface {v2}, LBh/s0;->s0()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_3

    :cond_2
    :goto_0
    invoke-interface {p1}, LBh/z;->b()LBh/m;

    move-result-object v0

    const-string v2, "getContainingDeclaration(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lbi/k;->g(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lwh/i0;->V()Lxh/h;

    move-result-object v0

    invoke-interface {v0}, Lxh/h;->b()Ljava/lang/reflect/Member;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lfi/e;->z(LBh/b;Z)Lzi/j;

    move-result-object p1

    invoke-interface {p1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LBh/b;

    invoke-interface {v2}, LBh/a;->i()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    instance-of v4, v2, Ljava/util/Collection;

    if-eqz v4, :cond_4

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBh/s0;

    invoke-interface {v4}, LBh/s0;->s0()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_6
    move-object v0, v3

    :goto_2
    instance-of p1, v0, LBh/z;

    if-eqz p1, :cond_7

    move-object v3, v0

    check-cast v3, LBh/z;

    :cond_7
    :goto_3
    return-object v3
.end method

.method private final q0(Ljava/lang/reflect/Method;)Z
    .locals 2

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v0

    invoke-interface {v0}, LBh/a;->d0()LBh/b0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LBh/r0;->getType()Lpi/S;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lbi/k;->c(Lpi/S;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    const-string v0, "getParameterTypes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZg/n;->a0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result p1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method


# virtual methods
.method public F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwh/l$a;->g(Lwh/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public K(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Lwh/l$a;->f(Lwh/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public V()Lxh/h;
    .locals 1

    iget-object v0, p0, Lwh/i0;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxh/h;

    return-object v0
.end method

.method public W()Lwh/d0;
    .locals 1

    iget-object v0, p0, Lwh/i0;->g:Lwh/d0;

    return-object v0
.end method

.method public X()Lxh/h;
    .locals 1

    iget-object v0, p0, Lwh/i0;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxh/h;

    return-object v0
.end method

.method public bridge synthetic Y()LBh/b;
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v0

    return-object v0
.end method

.method public b0()Z
    .locals 2

    iget-object v0, p0, Lwh/i0;->i:Ljava/lang/Object;

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

    invoke-static {p1}, Lwh/j1;->c(Ljava/lang/Object;)Lwh/i0;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object v1

    invoke-virtual {p1}, Lwh/i0;->W()Lwh/d0;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lwh/i0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lwh/i0;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lwh/i0;->h:Ljava/lang/String;

    iget-object v2, p1, Lwh/i0;->h:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lwh/i0;->i:Ljava/lang/Object;

    iget-object p1, p1, Lwh/i0;->i:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public getArity()I
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->V()Lxh/h;

    move-result-object v0

    invoke-static {v0}, Lxh/j;->a(Lxh/h;)I

    move-result v0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v0

    invoke-interface {v0}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lwh/i0;->W()Lwh/d0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lwh/i0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lwh/i0;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lwh/l$a;->a(Lwh/l;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lwh/l$a;->b(Lwh/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    invoke-static {p0, p1, p2}, Lwh/l$a;->c(Lwh/l;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isExternal()Z
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v0

    invoke-interface {v0}, LBh/C;->isExternal()Z

    move-result v0

    return v0
.end method

.method public isInfix()Z
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v0

    invoke-interface {v0}, LBh/z;->isInfix()Z

    move-result v0

    return v0
.end method

.method public isInline()Z
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v0

    invoke-interface {v0}, LBh/z;->isInline()Z

    move-result v0

    return v0
.end method

.method public isOperator()Z
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v0

    invoke-interface {v0}, LBh/z;->isOperator()Z

    move-result v0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v0

    invoke-interface {v0}, LBh/z;->isSuspend()Z

    move-result v0

    return v0
.end method

.method public o0()LBh/z;
    .locals 3

    iget-object v0, p0, Lwh/i0;->j:Lwh/a1$a;

    sget-object v1, Lwh/i0;->m:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lwh/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LBh/z;

    return-object v0
.end method

.method public s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwh/l$a;->d(Lwh/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lwh/e1;->a:Lwh/e1;

    invoke-virtual {p0}, Lwh/i0;->o0()LBh/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/e1;->f(LBh/z;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lwh/l$a;->e(Lwh/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
