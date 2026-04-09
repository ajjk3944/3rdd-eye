.class final Ly8/t$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/t;-><init>(LZc/c;Lad/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/t;


# direct methods
.method constructor <init>(Ly8/t;)V
    .locals 0

    iput-object p1, p0, Ly8/t$c;->a:Ly8/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 5

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ly8/t$c;->a:Ly8/t;

    invoke-static {p1}, Ly8/t;->g(Ly8/t;)Ljava/util/LinkedList;

    move-result-object p1

    iget-object v0, p0, Ly8/t$c;->a:Ly8/t;

    monitor-enter p1

    :try_start_0
    invoke-static {v0}, Ly8/t;->g(Ly8/t;)Ljava/util/LinkedList;

    move-result-object v0

    new-instance v1, LWc/c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, LWc/c;-><init>(JLjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Ly8/t$c;->a(Lhg/c;)V

    return-void
.end method
