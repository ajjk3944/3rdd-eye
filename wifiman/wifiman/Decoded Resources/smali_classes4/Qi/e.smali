.class final LQi/e;
.super LIi/a;
.source "SourceFile"


# instance fields
.field private final d:Lgg/c;


# direct methods
.method public constructor <init>(Ldh/i;Lgg/c;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, LIi/a;-><init>(Ldh/i;ZZ)V

    iput-object p2, p0, LQi/e;->d:Lgg/c;

    return-void
.end method


# virtual methods
.method protected O0(Ljava/lang/Throwable;Z)V
    .locals 0

    :try_start_0
    iget-object p2, p0, LQi/e;->d:Lgg/c;

    invoke-interface {p2, p1}, Lgg/c;->c(Ljava/lang/Throwable;)Z

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_0

    return-void

    :catchall_0
    move-exception p2

    invoke-static {p1, p2}, LYg/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p0}, LIi/a;->getContext()Ldh/i;

    move-result-object p2

    invoke-static {p1, p2}, LQi/d;->a(Ljava/lang/Throwable;Ldh/i;)V

    return-void
.end method

.method public bridge synthetic P0(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, LQi/e;->R0(LYg/J;)V

    return-void
.end method

.method protected R0(LYg/J;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, LQi/e;->d:Lgg/c;

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, LIi/a;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {p1, v0}, LQi/d;->a(Ljava/lang/Throwable;Ldh/i;)V

    :goto_0
    return-void
.end method
