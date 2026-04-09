.class public final Ls7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls7/c$a;,
        Ls7/c$b;
    }
.end annotation


# static fields
.field public static final c:Ls7/c$b;

.field private static final d:Ls7/e;


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Ls7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls7/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls7/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ls7/c;->c:Ls7/c$b;

    new-instance v0, Ls7/e;

    invoke-direct {v0}, Ls7/e;-><init>()V

    sput-object v0, Ls7/c;->d:Ls7/e;

    return-void
.end method

.method private constructor <init>(Ljava/util/Set;Ls7/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls7/c;->a:Ljava/util/Set;

    .line 3
    iput-object p2, p0, Ls7/c;->b:Ls7/d;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Set;Ls7/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ls7/c;->d:Ls7/e;

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Ls7/c;-><init>(Ljava/util/Set;Ls7/d;)V

    return-void
.end method

.method private final c(Ls7/f$a;Ls7/f;)Z
    .locals 1

    instance-of v0, p2, Ls7/f$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ls7/f$a;->a()[B

    move-result-object p1

    check-cast p2, Ls7/f$a;

    invoke-virtual {p2}, Ls7/f$a;->a()[B

    move-result-object p2

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final d(Ls7/f;Ls7/f;)Z
    .locals 1

    instance-of v0, p1, Ls7/f$a;

    if-eqz v0, :cond_0

    check-cast p1, Ls7/f$a;

    invoke-direct {p0, p1, p2}, Ls7/c;->c(Ls7/f$a;Ls7/f;)Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls7/c;->b:Ls7/d;

    invoke-interface {v0, p0}, Ls7/d;->a(Ls7/c;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Ls7/c;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final e(Ls7/c;)Z
    .locals 4

    const-string/jumbo v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls7/c;->a:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls7/f;

    iget-object v2, p1, Ls7/c;->a:Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls7/f;

    invoke-direct {p0, v1, v3}, Ls7/c;->d(Ls7/f;Ls7/f;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final f(Ls7/c;)V
    .locals 1

    const-string/jumbo v0, "identification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls7/c;->a:Ljava/util/Set;

    iget-object p1, p1, Ls7/c;->a:Ljava/util/Set;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Ls7/c;->a:Ljava/util/Set;

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    sget-object v7, Ls7/c$c;->a:Ls7/c$c;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const-string v2, " || "

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "identification: { "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " }"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
