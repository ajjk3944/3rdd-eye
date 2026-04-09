.class public final LLg/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLg/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLg/j$a$a;
    }
.end annotation


# instance fields
.field private final a:LLg/l;

.field private final b:Ljava/util/Timer;

.field private final c:Ljava/util/Timer;


# direct methods
.method public constructor <init>(LLg/l;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLg/j$a;->a:LLg/l;

    new-instance v0, LLg/j$a$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JmDNS("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ").Timer"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, LLg/j$a$a;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, LLg/j$a;->b:Ljava/util/Timer;

    new-instance v0, LLg/j$a$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LLg/l;->G0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ").State.Timer"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LLg/j$a$a;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, LLg/j$a;->c:Ljava/util/Timer;

    return-void
.end method


# virtual methods
.method public C()V
    .locals 2

    new-instance v0, LOg/d;

    iget-object v1, p0, LLg/j$a;->a:LLg/l;

    invoke-direct {v0, v1}, LOg/d;-><init>(LLg/l;)V

    iget-object v1, p0, LLg/j$a;->c:Ljava/util/Timer;

    invoke-virtual {v0, v1}, LOg/d;->u(Ljava/util/Timer;)V

    return-void
.end method

.method public J()V
    .locals 2

    new-instance v0, LOg/a;

    iget-object v1, p0, LLg/j$a;->a:LLg/l;

    invoke-direct {v0, v1}, LOg/a;-><init>(LLg/l;)V

    iget-object v1, p0, LLg/j$a;->c:Ljava/util/Timer;

    invoke-virtual {v0, v1}, LOg/a;->u(Ljava/util/Timer;)V

    return-void
.end method

.method public P(LLg/c;Ljava/net/InetAddress;I)V
    .locals 2

    new-instance v0, LMg/c;

    iget-object v1, p0, LLg/j$a;->a:LLg/l;

    invoke-direct {v0, v1, p1, p2, p3}, LMg/c;-><init>(LLg/l;LLg/c;Ljava/net/InetAddress;I)V

    iget-object p1, p0, LLg/j$a;->b:Ljava/util/Timer;

    invoke-virtual {v0, p1}, LMg/c;->g(Ljava/util/Timer;)V

    return-void
.end method

.method public S()V
    .locals 1

    iget-object v0, p0, LLg/j$a;->c:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    return-void
.end method

.method public T()V
    .locals 2

    new-instance v0, LOg/e;

    iget-object v1, p0, LLg/j$a;->a:LLg/l;

    invoke-direct {v0, v1}, LOg/e;-><init>(LLg/l;)V

    iget-object v1, p0, LLg/j$a;->c:Ljava/util/Timer;

    invoke-virtual {v0, v1}, LOg/e;->u(Ljava/util/Timer;)V

    return-void
.end method

.method public Y()V
    .locals 2

    new-instance v0, LNg/d;

    iget-object v1, p0, LLg/j$a;->a:LLg/l;

    invoke-direct {v0, v1}, LNg/d;-><init>(LLg/l;)V

    iget-object v1, p0, LLg/j$a;->b:Ljava/util/Timer;

    invoke-virtual {v0, v1}, LNg/a;->j(Ljava/util/Timer;)V

    return-void
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, LLg/j$a;->b:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    return-void
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, LLg/j$a;->c:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 2

    new-instance v0, LNg/c;

    iget-object v1, p0, LLg/j$a;->a:LLg/l;

    invoke-direct {v0, v1, p1}, LNg/c;-><init>(LLg/l;Ljava/lang/String;)V

    iget-object p1, p0, LLg/j$a;->b:Ljava/util/Timer;

    invoke-virtual {v0, p1}, LNg/a;->j(Ljava/util/Timer;)V

    return-void
.end method

.method public p(LLg/q;)V
    .locals 2

    new-instance v0, LNg/b;

    iget-object v1, p0, LLg/j$a;->a:LLg/l;

    invoke-direct {v0, v1, p1}, LNg/b;-><init>(LLg/l;LLg/q;)V

    iget-object p1, p0, LLg/j$a;->b:Ljava/util/Timer;

    invoke-virtual {v0, p1}, LNg/a;->j(Ljava/util/Timer;)V

    return-void
.end method

.method public s()V
    .locals 1

    iget-object v0, p0, LLg/j$a;->b:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    return-void
.end method

.method public v()V
    .locals 2

    new-instance v0, LOg/b;

    iget-object v1, p0, LLg/j$a;->a:LLg/l;

    invoke-direct {v0, v1}, LOg/b;-><init>(LLg/l;)V

    iget-object v1, p0, LLg/j$a;->c:Ljava/util/Timer;

    invoke-virtual {v0, v1}, LOg/b;->u(Ljava/util/Timer;)V

    return-void
.end method

.method public y()V
    .locals 2

    new-instance v0, LMg/b;

    iget-object v1, p0, LLg/j$a;->a:LLg/l;

    invoke-direct {v0, v1}, LMg/b;-><init>(LLg/l;)V

    iget-object v1, p0, LLg/j$a;->b:Ljava/util/Timer;

    invoke-virtual {v0, v1}, LMg/b;->g(Ljava/util/Timer;)V

    return-void
.end method
