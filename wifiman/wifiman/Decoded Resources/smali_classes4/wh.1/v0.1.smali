.class public final Lwh/v0;
.super Lwh/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/v0$a;
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

    iput-object p1, p0, Lwh/v0;->d:Ljava/lang/Class;

    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance v0, Lwh/p0;

    invoke-direct {v0, p0}, Lwh/p0;-><init>(Lwh/v0;)V

    invoke-static {p1, v0}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lwh/v0;->e:LYg/m;

    return-void
.end method

.method static synthetic U(Lwh/v0;)Lwh/v0$a;
    .locals 0

    invoke-static {p0}, Lwh/v0;->V(Lwh/v0;)Lwh/v0$a;

    move-result-object p0

    return-object p0
.end method

.method private static final V(Lwh/v0;)Lwh/v0$a;
    .locals 1

    new-instance v0, Lwh/v0$a;

    invoke-direct {v0, p0}, Lwh/v0$a;-><init>(Lwh/v0;)V

    return-object v0
.end method

.method private final W()Lii/k;
    .locals 1

    iget-object v0, p0, Lwh/v0;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/v0$a;

    invoke-virtual {v0}, Lwh/v0$a;->l()Lii/k;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public G()Ljava/util/Collection;
    .locals 1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public H(LZh/f;)Ljava/util/Collection;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lwh/v0;->W()Lii/k;

    move-result-object v0

    sget-object v1, LIh/d;->FROM_REFLECTION:LIh/d;

    invoke-interface {v0, p1, v1}, Lii/k;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public I(I)LBh/Y;
    .locals 9

    iget-object v0, p0, Lwh/v0;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/v0$a;

    invoke-virtual {v0}, Lwh/v0$a;->j()LYg/y;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYg/y;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, LYh/f;

    invoke-virtual {v0}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LUh/l;

    invoke-virtual {v0}, LYg/y;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LYh/e;

    sget-object v0, LXh/a;->n:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    const-string v3, "packageLocalVariable"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0, p1}, LWh/e;->b(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;I)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, LUh/n;

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Lwh/v0;->b()Ljava/lang/Class;

    move-result-object v3

    new-instance v6, LWh/g;

    invoke-virtual {v2}, LUh/l;->f1()LUh/t;

    move-result-object p1

    const-string v0, "getTypeTable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, p1}, LWh/g;-><init>(LUh/t;)V

    sget-object v8, Lwh/v0$b;->a:Lwh/v0$b;

    invoke-static/range {v3 .. v8}, Lwh/j1;->h(Ljava/lang/Class;Lkotlin/reflect/jvm/internal/impl/protobuf/n;LWh/c;LWh/g;LWh/a;Lmh/p;)LBh/a;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LBh/Y;

    :cond_0
    return-object v1
.end method

.method protected L()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lwh/v0;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/v0$a;

    invoke-virtual {v0}, Lwh/v0$a;->k()Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lwh/v0;->b()Ljava/lang/Class;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public M(LZh/f;)Ljava/util/Collection;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lwh/v0;->W()Lii/k;

    move-result-object v0

    sget-object v1, LIh/d;->FROM_REFLECTION:LIh/d;

    invoke-interface {v0, p1, v1}, Lii/k;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lwh/v0;->d:Ljava/lang/Class;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lwh/v0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwh/v0;->b()Ljava/lang/Class;

    move-result-object v0

    check-cast p1, Lwh/v0;

    invoke-virtual {p1}, Lwh/v0;->b()Ljava/lang/Class;

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

    invoke-virtual {p0}, Lwh/v0;->b()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/v0;->b()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object v1

    invoke-virtual {v1}, LZh/b;->a()LZh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
