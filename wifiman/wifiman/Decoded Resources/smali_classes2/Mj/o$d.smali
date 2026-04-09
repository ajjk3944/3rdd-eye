.class public final LMj/o$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMj/o;->b(LMj/d;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/n;


# direct methods
.method constructor <init>(LIi/n;)V
    .locals 0

    iput-object p1, p0, LMj/o$d;->a:LIi/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LMj/d;LMj/w;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LMj/w;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LMj/o$d;->a:LIi/n;

    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-virtual {p2}, LMj/w;->a()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LMj/o$d;->a:LIi/n;

    sget-object v0, LYg/u;->b:LYg/u$a;

    new-instance v0, Lretrofit2/HttpException;

    invoke-direct {v0, p2}, Lretrofit2/HttpException;-><init>(LMj/w;)V

    invoke-static {v0}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public b(LMj/d;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "t"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LMj/o$d;->a:LIi/n;

    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-static {p2}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
