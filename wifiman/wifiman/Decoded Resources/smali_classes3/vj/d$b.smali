.class final Lvj/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvj/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lorg/kodein/di/DI$e;

.field private final b:I

.field private final c:Lvj/d$b;

.field private final d:Z


# direct methods
.method public constructor <init>(Lorg/kodein/di/DI$e;ILvj/d$b;Z)V
    .locals 1

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvj/d$b;->a:Lorg/kodein/di/DI$e;

    iput p2, p0, Lvj/d$b;->b:I

    iput-object p3, p0, Lvj/d$b;->c:Lvj/d$b;

    iput-boolean p4, p0, Lvj/d$b;->d:Z

    return-void
.end method

.method private final b(Lorg/kodein/di/DI$e;I)Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lvj/d$b;->d:Z

    if-eqz v0, :cond_0

    new-instance v0, Lvj/d$b$a;

    invoke-direct {v0, p1}, Lvj/d$b$a;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lvj/d$b$b;

    invoke-direct {v0, p1}, Lvj/d$b$b;-><init>(Ljava/lang/Object;)V

    :goto_0
    if-eqz p2, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p2, "overridden "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Lth/m;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Lth/m;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :goto_1
    return-object p1
.end method

.method private final c(Lvj/d$b;Lorg/kodein/di/DI$e;I)Z
    .locals 1

    :cond_0
    iget-object v0, p1, Lvj/d$b;->a:Lorg/kodein/di/DI$e;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p1, Lvj/d$b;->b:I

    if-ne v0, p3, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lvj/d$b;->c:Lvj/d$b;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method private final d(Lvj/d$b;Lorg/kodein/di/DI$e;ILjava/util/List;)Ljava/util/List;
    .locals 2

    :goto_0
    iget-object v0, p1, Lvj/d$b;->c:Lvj/d$b;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lvj/d$b;->a:Lorg/kodein/di/DI$e;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p1, Lvj/d$b;->b:I

    if-ne p3, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p1, Lvj/d$b;->c:Lvj/d$b;

    iget-object v1, p1, Lvj/d$b;->a:Lorg/kodein/di/DI$e;

    iget p1, p1, Lvj/d$b;->b:I

    invoke-direct {p0, v1, p1}, Lvj/d$b;->b(Lorg/kodein/di/DI$e;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    check-cast p4, Ljava/lang/Iterable;

    invoke-static {p1, p4}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p4

    move-object p1, v0

    goto :goto_0

    :cond_1
    :goto_1
    iget-object p2, p1, Lvj/d$b;->a:Lorg/kodein/di/DI$e;

    iget p1, p1, Lvj/d$b;->b:I

    invoke-direct {p0, p2, p1}, Lvj/d$b;->b(Lorg/kodein/di/DI$e;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    check-cast p4, Ljava/lang/Iterable;

    invoke-static {p1, p4}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a(Lorg/kodein/di/DI$e;I)V
    .locals 6

    const-string/jumbo v0, "searchedKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p0, p1, p2}, Lvj/d$b;->c(Lvj/d$b;Lorg/kodein/di/DI$e;I)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p0, p1, p2, v0}, Lvj/d$b;->d(Lvj/d$b;Lorg/kodein/di/DI$e;ILjava/util/List;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    iget v0, p0, Lvj/d$b;->b:I

    invoke-direct {p0, p1, v0}, Lvj/d$b;->b(Lorg/kodein/di/DI$e;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, LZg/v;->N0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v4, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v2, Ljava/lang/String;

    const-string v5, "  "

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    const-string v3, "  \u2551"

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, -0x1

    invoke-static {v5, v1}, Lkotlin/text/t;->H(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "\u255a>"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v1, "  \u2554\u2569>"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v1, "   "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v1, v4

    goto :goto_0

    :cond_3
    const-string v0, "    \u255a"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, v3

    const-string/jumbo v0, "\u2550\u2550"

    invoke-static {v0, p1}, Lkotlin/text/t;->H(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "\u255d"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p1, Lorg/kodein/di/DI$DependencyLoopException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Dependency recursion:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/kodein/di/DI$DependencyLoopException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method
