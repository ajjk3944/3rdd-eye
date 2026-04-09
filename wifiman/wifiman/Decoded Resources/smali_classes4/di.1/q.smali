.class public final Ldi/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpi/v0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/q$a;
    }
.end annotation


# static fields
.field public static final f:Ldi/q$a;


# instance fields
.field private final a:J

.field private final b:LBh/G;

.field private final c:Ljava/util/Set;

.field private final d:Lpi/d0;

.field private final e:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldi/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldi/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldi/q;->f:Ldi/q$a;

    return-void
.end method

.method private constructor <init>(JLBh/G;Ljava/util/Set;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {v0}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lpi/V;->f(Lpi/r0;Ldi/q;Z)Lpi/d0;

    move-result-object v0

    iput-object v0, p0, Ldi/q;->d:Lpi/d0;

    .line 4
    new-instance v0, Ldi/o;

    invoke-direct {v0, p0}, Ldi/o;-><init>(Ldi/q;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Ldi/q;->e:LYg/m;

    .line 5
    iput-wide p1, p0, Ldi/q;->a:J

    .line 6
    iput-object p3, p0, Ldi/q;->b:LBh/G;

    .line 7
    iput-object p4, p0, Ldi/q;->c:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(JLBh/G;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Ldi/q;-><init>(JLBh/G;Ljava/util/Set;)V

    return-void
.end method

.method public static final synthetic f(Ldi/q;)LBh/G;
    .locals 0

    iget-object p0, p0, Ldi/q;->b:LBh/G;

    return-object p0
.end method

.method public static final synthetic g(Ldi/q;)J
    .locals 2

    iget-wide v0, p0, Ldi/q;->a:J

    return-wide v0
.end method

.method static synthetic h(Ldi/q;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Ldi/q;->m(Ldi/q;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Lpi/S;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Ldi/q;->o(Lpi/S;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private final k()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ldi/q;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final l()Z
    .locals 4

    iget-object v0, p0, Ldi/q;->b:LBh/G;

    invoke-static {v0}, Ldi/v;->a(LBh/G;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpi/S;

    iget-object v3, p0, Ldi/q;->c:Ljava/util/Set;

    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    :cond_2
    :goto_0
    return v2
.end method

.method private static final m(Ldi/q;)Ljava/util/List;
    .locals 4

    invoke-virtual {p0}, Ldi/q;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->x()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    const-string v1, "getDefaultType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpi/D0;

    sget-object v2, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    iget-object v3, p0, Ldi/q;->d:Lpi/d0;

    invoke-direct {v1, v2, v3}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpi/F0;->f(Lpi/d0;Ljava/util/List;Lpi/r0;ILjava/lang/Object;)Lpi/d0;

    move-result-object v0

    filled-new-array {v0}, [Lpi/d0;

    move-result-object v0

    invoke-static {v0}, LZg/v;->r([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Ldi/q;->l()Z

    move-result v1

    if-nez v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {p0}, Ldi/q;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->L()Lpi/d0;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method private final n()Ljava/lang/String;
    .locals 11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldi/q;->c:Ljava/util/Set;

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    sget-object v8, Ldi/p;->a:Ldi/p;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const-string v3, ","

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v10}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final o(Lpi/S;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 1

    invoke-direct {p0}, Ldi/q;->k()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/v0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public c()LBh/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ldi/q;->c:Ljava/util/Set;

    return-object v0
.end method

.method public q()Lkotlin/reflect/jvm/internal/impl/builtins/i;
    .locals 1

    iget-object v0, p0, Ldi/q;->b:LBh/G;

    invoke-interface {v0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IntegerLiteralType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ldi/q;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
