.class public final LRh/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LRh/j0;

.field private final b:Ljava/util/List;

.field private final c:Ljava/lang/String;

.field private final d:LRh/Y;


# direct methods
.method public constructor <init>(LRh/j0;Ljava/util/List;Ljava/lang/String;)V
    .locals 2

    const-string v0, "parametersInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRh/Y;->a:LRh/j0;

    iput-object p2, p0, LRh/Y;->b:Ljava/util/List;

    iput-object p3, p0, LRh/Y;->c:Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p3, :cond_3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LRh/j0;->a()LRh/j0;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    check-cast p2, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRh/j0;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LRh/j0;->a()LRh/j0;

    move-result-object v1

    goto :goto_2

    :cond_1
    move-object v1, v0

    :goto_2
    invoke-interface {p3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p2, LRh/Y;

    invoke-direct {p2, p1, p3, v0}, LRh/Y;-><init>(LRh/j0;Ljava/util/List;Ljava/lang/String;)V

    move-object v0, p2

    :cond_3
    iput-object v0, p0, LRh/Y;->d:LRh/Y;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LRh/Y;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LRh/Y;->b:Ljava/util/List;

    return-object v0
.end method

.method public final c()LRh/j0;
    .locals 1

    iget-object v0, p0, LRh/Y;->a:LRh/j0;

    return-object v0
.end method

.method public final d()LRh/Y;
    .locals 1

    iget-object v0, p0, LRh/Y;->d:LRh/Y;

    return-object v0
.end method
