.class final LT/N0$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/N0;-><init>(Ldh/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/N0;


# direct methods
.method constructor <init>(LT/N0;)V
    .locals 0

    iput-object p1, p0, LT/N0$e;->a:LT/N0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, LT/N0$e;->a:LT/N0;

    invoke-static {v0}, LT/N0;->G(LT/N0;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LT/N0$e;->a:LT/N0;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, LT/N0;->t(LT/N0;)LIi/n;

    move-result-object v2

    invoke-static {v1}, LT/N0;->J(LT/N0;)LLi/z;

    move-result-object v3

    invoke-interface {v3}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT/N0$d;

    sget-object v4, LT/N0$d;->ShuttingDown:LT/N0$d;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v3, :cond_1

    monitor-exit v0

    if-eqz v2, :cond_0

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    :try_start_1
    const-string v2, "Recomposer shutdown; frame clock awaiter will never resume"

    invoke-static {v1}, LT/N0;->w(LT/N0;)Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v2, v1}, LIi/n0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v1

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT/N0$e;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
