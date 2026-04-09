.class public final LNi/u;
.super LIi/J;
.source "SourceFile"

# interfaces
.implements LIi/X;


# instance fields
.field private final synthetic c:LIi/X;

.field private final d:LIi/J;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(LIi/J;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, LIi/J;-><init>()V

    instance-of v0, p1, LIi/X;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LIi/X;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, LIi/U;->a()LIi/X;

    move-result-object v0

    :cond_1
    iput-object v0, p0, LNi/u;->c:LIi/X;

    iput-object p1, p0, LNi/u;->d:LIi/J;

    iput-object p2, p0, LNi/u;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public J(JLIi/n;)V
    .locals 1

    iget-object v0, p0, LNi/u;->c:LIi/X;

    invoke-interface {v0, p1, p2, p3}, LIi/X;->J(JLIi/n;)V

    return-void
.end method

.method public Y(Ldh/i;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, LNi/u;->d:LIi/J;

    invoke-virtual {v0, p1, p2}, LIi/J;->Y(Ldh/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public b0(Ldh/i;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, LNi/u;->d:LIi/J;

    invoke-virtual {v0, p1, p2}, LIi/J;->b0(Ldh/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public m0(Ldh/i;)Z
    .locals 1

    iget-object v0, p0, LNi/u;->d:LIi/J;

    invoke-virtual {v0, p1}, LIi/J;->m0(Ldh/i;)Z

    move-result p1

    return p1
.end method

.method public p(JLjava/lang/Runnable;Ldh/i;)LIi/e0;
    .locals 1

    iget-object v0, p0, LNi/u;->c:LIi/X;

    invoke-interface {v0, p1, p2, p3, p4}, LIi/X;->p(JLjava/lang/Runnable;Ldh/i;)LIi/e0;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LNi/u;->e:Ljava/lang/String;

    return-object v0
.end method
