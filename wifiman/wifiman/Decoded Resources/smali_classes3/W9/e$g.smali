.class final LW9/e$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW9/e;->r0(Lgg/b;Lmh/p;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;


# direct methods
.method constructor <init>(Lmh/p;)V
    .locals 0

    iput-object p1, p0, LW9/e$g;->a:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    if-eqz v0, :cond_0

    iget-object v0, p0, LW9/e$g;->a:Lmh/p;

    new-instance v1, Ls9/d$b;

    sget v2, LP9/b;->v:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-interface {v0, p1, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgg/f;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lretrofit2/HttpException;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lretrofit2/HttpException;

    invoke-virtual {v0}, Lretrofit2/HttpException;->a()I

    move-result v0

    const/16 v1, 0x1ad

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LW9/e$g;->a:Lmh/p;

    new-instance v1, Ls9/d$b;

    sget v2, LP9/b;->x:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-interface {v0, p1, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgg/b;

    goto :goto_0

    :cond_1
    iget-object v0, p0, LW9/e$g;->a:Lmh/p;

    new-instance v1, Ls9/d$b;

    sget v2, LP9/b;->f:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-interface {v0, p1, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgg/b;

    goto :goto_0

    :cond_2
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_3

    iget-object v0, p0, LW9/e$g;->a:Lmh/p;

    new-instance v1, Ls9/d$b;

    sget v2, LP9/b;->n:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-interface {v0, p1, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgg/f;

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LW9/e$g;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
