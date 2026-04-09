.class final Ly8/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/q;-><init>(Lje/C;Ly8/a$b;Ljd/b;LCc/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly8/q$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/q$b;

    invoke-direct {v0}, Ly8/q$b;-><init>()V

    sput-object v0, Ly8/q$b;->a:Ly8/q$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final b(Lkotlin/jvm/internal/N;Ljava/util/Set;Lje/r;)V
    .locals 2

    instance-of v0, p2, Lje/r$b$a$b;

    if-eqz v0, :cond_0

    check-cast p2, Lje/r$b$a$b;

    invoke-virtual {p2}, Lje/r$b$a$b;->b()LS8/c;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    instance-of v0, p2, Lje/r$b$a$a;

    if-eqz v0, :cond_3

    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS8/c;

    move-object v1, p2

    check-cast v1, Lje/r$b$a$a;

    invoke-virtual {v1, v0}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lje/q;->i()Lke/a;

    move-result-object v1

    instance-of v1, v1, Lke/a$a$a;

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lje/q;->h()LS8/l;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lje/q;->c()LS8/c;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    instance-of p0, p2, Lje/r$b$b;

    if-nez p0, :cond_5

    instance-of p0, p2, Lje/r$a;

    if-eqz p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    :goto_2
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/Set;
    .locals 10

    const-string/jumbo v0, "timelineItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x7530

    sub-long/2addr v0, v2

    new-instance v2, Lkotlin/jvm/internal/N;

    invoke-direct {v2}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-static {}, LS8/c;->getEntries()Lfh/a;

    move-result-object v3

    invoke-static {v3}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    iput-object v3, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v5

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LWc/c;

    invoke-virtual {v7}, LWc/c;->a()J

    move-result-wide v8

    invoke-virtual {v7}, LWc/c;->b()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lje/r;

    if-nez v4, :cond_0

    cmp-long v8, v8, v0

    if-gez v8, :cond_0

    move-object v6, v7

    goto :goto_0

    :cond_0
    if-eqz v6, :cond_1

    invoke-static {v2, v3, v6}, Ly8/q$b;->b(Lkotlin/jvm/internal/N;Ljava/util/Set;Lje/r;)V

    move-object v6, v5

    :cond_1
    invoke-static {v2, v3, v7}, Ly8/q$b;->b(Lkotlin/jvm/internal/N;Ljava/util/Set;Lje/r;)V

    invoke-static {}, LS8/c;->getEntries()Lfh/a;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v7

    sub-int/2addr v4, v7

    iget-object v7, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v7, Ljava/util/Set;

    invoke-interface {v7}, Ljava/util/Set;->size()I

    move-result v7

    if-eq v4, v7, :cond_2

    invoke-static {}, LS8/c;->getEntries()Lfh/a;

    move-result-object v4

    invoke-static {v4, v3}, LZg/v;->Y0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v4

    iput-object v4, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_2
    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    return-object v3
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ly8/q$b;->a(Ljava/util/List;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
