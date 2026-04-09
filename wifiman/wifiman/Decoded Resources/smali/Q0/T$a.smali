.class final LQ0/T$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ0/T;->c(LQ0/S;Lmh/l;)LT/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ0/T;

.field final synthetic b:LQ0/S;


# direct methods
.method constructor <init>(LQ0/T;LQ0/S;)V
    .locals 0

    iput-object p1, p0, LQ0/T$a;->a:LQ0/T;

    iput-object p2, p0, LQ0/T$a;->b:LQ0/S;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LQ0/U;)V
    .locals 4

    iget-object v0, p0, LQ0/T$a;->a:LQ0/T;

    invoke-virtual {v0}, LQ0/T;->b()LT0/r;

    move-result-object v0

    iget-object v1, p0, LQ0/T$a;->a:LQ0/T;

    iget-object v2, p0, LQ0/T$a;->b:LQ0/S;

    monitor-enter v0

    :try_start_0
    invoke-interface {p1}, LQ0/U;->h()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v1}, LQ0/T;->a(LQ0/T;)LP0/b;

    move-result-object v1

    invoke-virtual {v1, v2, p1}, LP0/b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-static {v1}, LQ0/T;->a(LQ0/T;)LP0/b;

    move-result-object p1

    invoke-virtual {p1, v2}, LP0/b;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQ0/U;

    invoke-virtual {p0, p1}, LQ0/T$a;->a(LQ0/U;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
