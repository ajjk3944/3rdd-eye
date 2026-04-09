.class public abstract LIi/a;
.super LIi/D0;
.source "SourceFile"

# interfaces
.implements LIi/y0;
.implements Ldh/e;
.implements LIi/N;


# instance fields
.field private final c:Ldh/i;


# direct methods
.method public constructor <init>(Ldh/i;ZZ)V
    .locals 0

    invoke-direct {p0, p3}, LIi/D0;-><init>(Z)V

    if-eqz p2, :cond_0

    sget-object p2, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p1, p2}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p2

    check-cast p2, LIi/y0;

    invoke-virtual {p0, p2}, LIi/D0;->g0(LIi/y0;)V

    :cond_0
    invoke-interface {p1, p0}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    iput-object p1, p0, LIi/a;->c:Ldh/i;

    return-void
.end method


# virtual methods
.method protected H()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LIi/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected N0(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, LIi/D0;->w(Ljava/lang/Object;)V

    return-void
.end method

.method protected O0(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method protected P0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final Q0(LIi/P;Ljava/lang/Object;Lmh/p;)V
    .locals 0

    invoke-virtual {p1, p3, p2, p0}, LIi/P;->invoke(Lmh/p;Ljava/lang/Object;Ldh/e;)V

    return-void
.end method

.method public final e0(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LIi/a;->c:Ldh/i;

    invoke-static {v0, p1}, LIi/L;->a(Ldh/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final getContext()Ldh/i;
    .locals 1

    iget-object v0, p0, LIi/a;->c:Ldh/i;

    return-object v0
.end method

.method public getCoroutineContext()Ldh/i;
    .locals 1

    iget-object v0, p0, LIi/a;->c:Ldh/i;

    return-object v0
.end method

.method public isActive()Z
    .locals 1

    invoke-super {p0}, LIi/D0;->isActive()Z

    move-result v0

    return v0
.end method

.method public o0()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LIi/a;->c:Ldh/i;

    invoke-static {v0}, LIi/H;->g(Ldh/i;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, LIi/D0;->o0()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LIi/D0;->o0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    invoke-static {p1}, LIi/D;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LIi/D0;->n0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LIi/E0;->b:LNi/C;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LIi/a;->N0(Ljava/lang/Object;)V

    return-void
.end method

.method protected final v0(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, LIi/C;

    if-eqz v0, :cond_0

    check-cast p1, LIi/C;

    iget-object v0, p1, LIi/C;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, LIi/C;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, LIi/a;->O0(Ljava/lang/Throwable;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LIi/a;->P0(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
