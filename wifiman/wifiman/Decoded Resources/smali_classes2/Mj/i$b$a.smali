.class LMj/i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMj/i$b;->K0(LMj/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LMj/f;

.field final synthetic b:LMj/i$b;


# direct methods
.method constructor <init>(LMj/i$b;LMj/f;)V
    .locals 0

    iput-object p1, p0, LMj/i$b$a;->b:LMj/i$b;

    iput-object p2, p0, LMj/i$b$a;->a:LMj/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(LMj/i$b$a;LMj/f;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LMj/i$b$a;->e(LMj/f;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(LMj/i$b$a;LMj/f;LMj/w;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LMj/i$b$a;->f(LMj/f;LMj/w;)V

    return-void
.end method

.method private synthetic e(LMj/f;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LMj/i$b$a;->b:LMj/i$b;

    invoke-interface {p1, v0, p2}, LMj/f;->b(LMj/d;Ljava/lang/Throwable;)V

    return-void
.end method

.method private synthetic f(LMj/f;LMj/w;)V
    .locals 2

    iget-object v0, p0, LMj/i$b$a;->b:LMj/i$b;

    iget-object v0, v0, LMj/i$b;->b:LMj/d;

    invoke-interface {v0}, LMj/d;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, LMj/i$b$a;->b:LMj/i$b;

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2, v0}, LMj/f;->b(LMj/d;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LMj/i$b$a;->b:LMj/i$b;

    invoke-interface {p1, v0, p2}, LMj/f;->a(LMj/d;LMj/w;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(LMj/d;LMj/w;)V
    .locals 2

    iget-object p1, p0, LMj/i$b$a;->b:LMj/i$b;

    iget-object p1, p1, LMj/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v0, p0, LMj/i$b$a;->a:LMj/f;

    new-instance v1, LMj/j;

    invoke-direct {v1, p0, v0, p2}, LMj/j;-><init>(LMj/i$b$a;LMj/f;LMj/w;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(LMj/d;Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, LMj/i$b$a;->b:LMj/i$b;

    iget-object p1, p1, LMj/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v0, p0, LMj/i$b$a;->a:LMj/f;

    new-instance v1, LMj/k;

    invoke-direct {v1, p0, v0, p2}, LMj/k;-><init>(LMj/i$b$a;LMj/f;Ljava/lang/Throwable;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
