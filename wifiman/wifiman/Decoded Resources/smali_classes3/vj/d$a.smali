.class final Lvj/d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvj/d;-><init>(Lvj/c;Ljava/util/List;ZZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lvj/d;

.field final synthetic c:Lmh/a;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lvj/d;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Lvj/d$a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lvj/d$a;->b:Lvj/d;

    iput-object p3, p0, Lvj/d$a;->c:Lmh/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lvj/d$a;->a:Ljava/lang/Object;

    iget-object v1, p0, Lvj/d$a;->b:Lvj/d;

    iget-object v2, p0, Lvj/d$a;->c:Lmh/a;

    invoke-virtual {v1}, Lvj/d;->e()Lmh/a;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    if-nez v0, :cond_2

    invoke-virtual {v1}, Lvj/d;->e()Lmh/a;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v1, v3}, Lvj/d;->c(Lvj/d;Lmh/a;)V

    invoke-interface {v2}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_2
    monitor-enter v0

    :try_start_0
    invoke-virtual {v1}, Lvj/d;->e()Lmh/a;

    move-result-object v4

    if-nez v4, :cond_3

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_3
    :try_start_1
    invoke-static {v1, v3}, Lvj/d;->c(Lvj/d;Lmh/a;)V

    invoke-interface {v2}, Lmh/a;->invoke()Ljava/lang/Object;

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    :goto_0
    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvj/d$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
