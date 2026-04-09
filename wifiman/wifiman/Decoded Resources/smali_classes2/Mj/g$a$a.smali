.class LMj/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/CompletableFuture;

.field final synthetic b:LMj/g$a;


# direct methods
.method public constructor <init>(LMj/g$a;Ljava/util/concurrent/CompletableFuture;)V
    .locals 0

    iput-object p1, p0, LMj/g$a$a;->b:LMj/g$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LMj/g$a$a;->a:Ljava/util/concurrent/CompletableFuture;

    return-void
.end method


# virtual methods
.method public a(LMj/d;LMj/w;)V
    .locals 1

    invoke-virtual {p2}, LMj/w;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LMj/g$a$a;->a:Ljava/util/concurrent/CompletableFuture;

    invoke-virtual {p2}, LMj/w;->a()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, LMj/g$a$a;->a:Ljava/util/concurrent/CompletableFuture;

    new-instance v0, Lretrofit2/HttpException;

    invoke-direct {v0, p2}, Lretrofit2/HttpException;-><init>(LMj/w;)V

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method public b(LMj/d;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, LMj/g$a$a;->a:Ljava/util/concurrent/CompletableFuture;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void
.end method
