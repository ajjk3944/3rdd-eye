.class final LMj/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/Executor;

.field final b:LMj/d;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;LMj/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMj/i$b;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LMj/i$b;->b:LMj/d;

    return-void
.end method


# virtual methods
.method public K0(LMj/f;)V
    .locals 2

    const-string v0, "callback == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, LMj/i$b;->b:LMj/d;

    new-instance v1, LMj/i$b$a;

    invoke-direct {v1, p0, p1}, LMj/i$b$a;-><init>(LMj/i$b;LMj/f;)V

    invoke-interface {v0, v1}, LMj/d;->K0(LMj/f;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, LMj/i$b;->b:LMj/d;

    invoke-interface {v0}, LMj/d;->cancel()V

    return-void
.end method

.method public clone()LMj/d;
    .locals 3

    .line 2
    new-instance v0, LMj/i$b;

    iget-object v1, p0, LMj/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, LMj/i$b;->b:LMj/d;

    invoke-interface {v2}, LMj/d;->clone()LMj/d;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LMj/i$b;-><init>(Ljava/util/concurrent/Executor;LMj/d;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LMj/i$b;->clone()LMj/d;

    move-result-object v0

    return-object v0
.end method

.method public g()LMj/w;
    .locals 1

    iget-object v0, p0, LMj/i$b;->b:LMj/d;

    invoke-interface {v0}, LMj/d;->g()LMj/w;

    move-result-object v0

    return-object v0
.end method

.method public j()Lokhttp3/Request;
    .locals 1

    iget-object v0, p0, LMj/i$b;->b:LMj/d;

    invoke-interface {v0}, LMj/d;->j()Lokhttp3/Request;

    move-result-object v0

    return-object v0
.end method

.method public v()Z
    .locals 1

    iget-object v0, p0, LMj/i$b;->b:LMj/d;

    invoke-interface {v0}, LMj/d;->v()Z

    move-result v0

    return v0
.end method
