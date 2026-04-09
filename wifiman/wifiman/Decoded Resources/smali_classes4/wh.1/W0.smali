.class public final Lwh/W0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lth/q;
.implements Lwh/Y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/W0$a;
    }
.end annotation


# static fields
.field static final synthetic d:[Lth/l;


# instance fields
.field private final a:LBh/l0;

.field private final b:Lwh/a1$a;

.field private final c:Lwh/X0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lwh/W0;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "upperBounds"

    const-string v3, "getUpperBounds()Ljava/util/List;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lwh/W0;->d:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lwh/X0;LBh/l0;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwh/W0;->a:LBh/l0;

    new-instance p2, Lwh/V0;

    invoke-direct {p2, p0}, Lwh/V0;-><init>(Lwh/W0;)V

    invoke-static {p2}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object p2

    iput-object p2, p0, Lwh/W0;->b:Lwh/a1$a;

    if-nez p1, :cond_5

    invoke-virtual {p0}, Lwh/W0;->d()LBh/l0;

    move-result-object p1

    invoke-interface {p1}, LBh/n;->b()LBh/m;

    move-result-object p1

    const-string p2, "getContainingDeclaration(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LBh/e;

    if-eqz v0, :cond_0

    check-cast p1, LBh/e;

    invoke-direct {p0, p1}, Lwh/W0;->e(LBh/e;)Lwh/X;

    move-result-object p1

    goto :goto_2

    :cond_0
    instance-of v0, p1, LBh/b;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LBh/b;

    invoke-interface {v0}, LBh/n;->b()LBh/m;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p2, v0, LBh/e;

    if-eqz p2, :cond_1

    check-cast v0, LBh/e;

    invoke-direct {p0, v0}, Lwh/W0;->e(LBh/e;)Lwh/X;

    move-result-object p2

    goto :goto_1

    :cond_1
    instance-of p2, p1, Lni/t;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Lni/t;

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_3

    invoke-direct {p0, p2}, Lwh/W0;->c(Lni/t;)Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Llh/a;->e(Ljava/lang/Class;)Lth/d;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lwh/X;

    :goto_1
    new-instance v0, Lwh/j;

    invoke-direct {v0, p2}, Lwh/j;-><init>(Lwh/d0;)V

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-interface {p1, v0, p2}, LBh/m;->t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    check-cast p1, Lwh/X0;

    goto :goto_3

    :cond_3
    new-instance p2, Lwh/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Non-class callable descriptor must be deserialized: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p2, Lwh/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown type parameter container: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    :goto_3
    iput-object p1, p0, Lwh/W0;->c:Lwh/X0;

    return-void
.end method

.method static synthetic b(Lwh/W0;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lwh/W0;->f(Lwh/W0;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lni/t;)Ljava/lang/Class;
    .locals 3

    invoke-interface {p1}, Lni/t;->Z()Lni/s;

    move-result-object v0

    instance-of v1, v0, LSh/r;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LSh/r;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LSh/r;->g()LSh/x;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    instance-of v1, v0, LFh/f;

    if-eqz v1, :cond_2

    move-object v2, v0

    check-cast v2, LFh/f;

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, LFh/f;->e()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    new-instance v0, Lwh/Y0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Container of deserialized member is not resolved: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final e(LBh/e;)Lwh/X;
    .locals 3

    invoke-static {p1}, Lwh/j1;->q(LBh/e;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Llh/a;->e(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lwh/X;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Lwh/Y0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Type parameter container is not resolved: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LBh/e;->b()LBh/m;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final f(Lwh/W0;)Ljava/util/List;
    .locals 5

    invoke-virtual {p0}, Lwh/W0;->d()LBh/l0;

    move-result-object p0

    invoke-interface {p0}, LBh/l0;->getUpperBounds()Ljava/util/List;

    move-result-object p0

    const-string v0, "getUpperBounds(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpi/S;

    new-instance v2, Lwh/U0;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v2, v1, v4, v3, v4}, Lwh/U0;-><init>(Lpi/S;Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()LBh/h;
    .locals 1

    invoke-virtual {p0}, Lwh/W0;->d()LBh/l0;

    move-result-object v0

    return-object v0
.end method

.method public d()LBh/l0;
    .locals 1

    iget-object v0, p0, Lwh/W0;->a:LBh/l0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lwh/W0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwh/W0;->c:Lwh/X0;

    check-cast p1, Lwh/W0;

    iget-object v1, p1, Lwh/W0;->c:Lwh/X0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwh/W0;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lwh/W0;->getName()Ljava/lang/String;

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

.method public getName()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lwh/W0;->d()LBh/l0;

    move-result-object v0

    invoke-interface {v0}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getUpperBounds()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lwh/W0;->b:Lwh/a1$a;

    sget-object v1, Lwh/W0;->d:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lwh/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lwh/W0;->c:Lwh/X0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lwh/W0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public p()Lth/s;
    .locals 2

    invoke-virtual {p0}, Lwh/W0;->d()LBh/l0;

    move-result-object v0

    invoke-interface {v0}, LBh/l0;->p()Lpi/N0;

    move-result-object v0

    sget-object v1, Lwh/W0$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object v0, Lth/s;->OUT:Lth/s;

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lth/s;->IN:Lth/s;

    goto :goto_0

    :cond_2
    sget-object v0, Lth/s;->INVARIANT:Lth/s;

    :goto_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/W;->a:Lkotlin/jvm/internal/W$a;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/W$a;->a(Lth/q;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
