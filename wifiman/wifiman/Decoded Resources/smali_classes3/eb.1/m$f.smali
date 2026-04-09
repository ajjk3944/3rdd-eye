.class public final Leb/m$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/m;-><init>(Leb/o;Ljava/lang/String;ZJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Leb/m;


# direct methods
.method constructor <init>(Leb/m;)V
    .locals 0

    iput-object p1, p0, Leb/m$f;->a:Leb/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leb/m$f;->a:Leb/m;

    invoke-static {v0}, Leb/m;->b(Leb/m;)LHg/a;

    move-result-object v0

    invoke-virtual {v0}, LHg/a;->n1()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Leb/m$f;->a:Leb/m;

    invoke-static {v0}, Leb/m;->b(Leb/m;)LHg/a;

    move-result-object v0

    invoke-virtual {v0}, LHg/a;->o1()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Leb/m$f;->a:Leb/m;

    invoke-static {v0}, Leb/m;->b(Leb/m;)LHg/a;

    move-result-object v0

    invoke-virtual {v0}, LHg/a;->m1()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Leb/m$b;->OPEN:Leb/m$b;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Leb/m$f;->a:Leb/m;

    invoke-static {v0}, Leb/m;->b(Leb/m;)LHg/a;

    move-result-object v0

    invoke-virtual {v0, p1}, LHg/a;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Leb/m$f;->a:Leb/m;

    invoke-static {v0}, Leb/m;->b(Leb/m;)LHg/a;

    move-result-object v0

    new-instance v1, Lcom/ui/unifi/core/base/net/client/SocketOpenException;

    invoke-direct {v1, p1}, Lcom/ui/unifi/core/base/net/client/SocketOpenException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, LHg/a;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Leb/m$f;->a:Leb/m;

    invoke-static {p1}, Leb/m;->a(Leb/m;)LFg/e;

    move-result-object p1

    invoke-virtual {p1}, LFg/e;->a()V

    return-void
.end method

.method public b(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leb/m$f;->a:Leb/m;

    invoke-static {v0}, Leb/m;->a(Leb/m;)LFg/e;

    move-result-object v0

    invoke-virtual {v0, p1}, LFg/e;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Leb/m$f;->a:Leb/m;

    invoke-static {v0}, Leb/m;->b(Leb/m;)LHg/a;

    move-result-object v0

    sget-object v1, Leb/m$b;->OPEN:Leb/m$b;

    invoke-virtual {v0, v1}, LHg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Leb/m$f;->a:Leb/m;

    invoke-static {v0}, Leb/m;->b(Leb/m;)LHg/a;

    move-result-object v0

    sget-object v1, Leb/m$b;->CLOSED:Leb/m$b;

    invoke-virtual {v0, v1}, LHg/a;->h(Ljava/lang/Object;)V

    iget-object v0, p0, Leb/m$f;->a:Leb/m;

    invoke-static {v0}, Leb/m;->b(Leb/m;)LHg/a;

    move-result-object v0

    invoke-virtual {v0}, LHg/a;->a()V

    iget-object v0, p0, Leb/m$f;->a:Leb/m;

    invoke-static {v0}, Leb/m;->a(Leb/m;)LFg/e;

    move-result-object v0

    invoke-virtual {v0}, LFg/e;->a()V

    return-void
.end method
