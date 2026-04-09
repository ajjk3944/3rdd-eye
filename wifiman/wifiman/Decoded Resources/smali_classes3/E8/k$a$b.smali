.class public final LE8/k$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/k$a;->j(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/k$a;

.field final synthetic b:LE8/k;

.field final synthetic c:Lcom/ui/wifiman/model/speedtest/Speedtest$d;


# direct methods
.method public constructor <init>(LE8/k$a;LE8/k;Lcom/ui/wifiman/model/speedtest/Speedtest$d;)V
    .locals 0

    iput-object p1, p0, LE8/k$a$b;->a:LE8/k$a;

    iput-object p2, p0, LE8/k$a$b;->b:LE8/k;

    iput-object p3, p0, LE8/k$a$b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 7

    :try_start_0
    iget-object v0, p0, LE8/k$a$b;->a:LE8/k$a;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, LE8/k$a$b;->b:LE8/k;

    iget-object v2, p0, LE8/k$a$b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v1, v2}, LE8/k;->e(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, LE8/k$a$b;->a:LE8/k$a;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v5, p0, LE8/k$a$b;->a:LE8/k$a;

    invoke-static {v5}, LE8/k$a;->f(LE8/k$a;)J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    invoke-static {v2, v3, v4}, LE8/k$a;->h(LE8/k$a;J)V

    iget-object v2, p0, LE8/k$a$b;->a:LE8/k$a;

    invoke-static {v2}, LE8/k$a;->d(LE8/k$a;)Ljava/util/LinkedList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LE8/k$a$b;->a:LE8/k$a;

    invoke-static {v1}, LE8/k$a;->d(LE8/k$a;)Ljava/util/LinkedList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    iget-object v2, p0, LE8/k$a$b;->a:LE8/k$a;

    invoke-static {v2}, LE8/k$a;->e(LE8/k$a;)I

    move-result v2

    if-le v1, v2, :cond_1

    iget-object v1, p0, LE8/k$a$b;->a:LE8/k$a;

    invoke-static {v1}, LE8/k$a;->d(LE8/k$a;)Ljava/util/LinkedList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_0
    iget-object v1, p0, LE8/k$a$b;->a:LE8/k$a;

    invoke-static {v1}, LE8/k$a;->c(LE8/k$a;)Lmh/l;

    move-result-object v1

    iget-object v2, p0, LE8/k$a$b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-interface {v1, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LE8/k$a$b;->a:LE8/k$a;

    invoke-static {v1}, LE8/k$a;->d(LE8/k$a;)Ljava/util/LinkedList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedList;->clear()V

    :cond_1
    :goto_0
    iget-object v1, p0, LE8/k$a$b;->a:LE8/k$a;

    invoke-static {v1}, LE8/k$a;->d(LE8/k$a;)Ljava/util/LinkedList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_5

    iget-object v1, p0, LE8/k$a$b;->a:LE8/k$a;

    iget-object v2, p0, LE8/k$a$b;->b:LE8/k;

    iget-object v3, p0, LE8/k$a$b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-static {v2, v3}, LE8/k;->a(LE8/k;Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lnf/g;

    move-result-object v2

    sget-object v3, LE8/k$a$a;->b:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_4

    const/4 v3, 0x2

    if-eq v2, v3, :cond_4

    const/4 v3, 0x3

    if-ne v2, v3, :cond_3

    sget-object v2, Lff/a;->UP:Lff/a;

    goto :goto_2

    :cond_3
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_4
    sget-object v2, Lff/a;->DOWN:Lff/a;

    :goto_2
    invoke-static {v1, v2}, LE8/k$a;->g(LE8/k$a;Lff/a;)Lhf/h;

    move-result-object v3

    :cond_5
    new-instance v1, Ll9/a;

    invoke-direct {v1, v3}, Ll9/a;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    invoke-interface {p1, v1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_4

    :goto_3
    monitor-exit v0

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_4
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_5
    return-void
.end method
