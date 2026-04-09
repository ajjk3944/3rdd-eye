.class public final LMj/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMj/o;->a(LMj/d;Ldh/e;)Ljava/lang/Object;
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

    iput-object p1, p0, LMj/o$b;->a:LIi/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LMj/d;LMj/w;)V
    .locals 3

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LMj/w;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, LMj/w;->a()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-interface {p1}, LMj/d;->j()Lokhttp3/Request;

    move-result-object p1

    const-class p2, LMj/n;

    invoke-virtual {p1, p2}, Lokhttp3/Request;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, LMj/n;

    invoke-virtual {p1}, LMj/n;->b()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1}, LMj/n;->a()Ljava/lang/reflect/Method;

    move-result-object p1

    new-instance v0, Lkotlin/KotlinNullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Response from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " was null but response body type was declared as non-null"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lkotlin/KotlinNullPointerException;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, LMj/o$b;->a:LIi/n;

    sget-object p2, LYg/u;->b:LYg/u$a;

    invoke-static {v0}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LMj/o$b;->a:LIi/n;

    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LMj/o$b;->a:LIi/n;

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

    iget-object p1, p0, LMj/o$b;->a:LIi/n;

    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-static {p2}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
