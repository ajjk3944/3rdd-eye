.class final LO1/k$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/k;-><init>(LIi/N;Lmh/l;Lmh/p;Lmh/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:LO1/k;

.field final synthetic c:Lmh/p;


# direct methods
.method constructor <init>(Lmh/l;LO1/k;Lmh/p;)V
    .locals 0

    iput-object p1, p0, LO1/k$a;->a:Lmh/l;

    iput-object p2, p0, LO1/k$a;->b:LO1/k;

    iput-object p3, p0, LO1/k$a;->c:Lmh/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, LO1/k$a;->a:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LO1/k$a;->b:LO1/k;

    invoke-static {v0}, LO1/k;->b(LO1/k;)LKi/g;

    move-result-object v0

    invoke-interface {v0, p1}, LKi/w;->f(Ljava/lang/Throwable;)Z

    :cond_0
    iget-object v0, p0, LO1/k$a;->b:LO1/k;

    invoke-static {v0}, LO1/k;->b(LO1/k;)LKi/g;

    move-result-object v0

    invoke-interface {v0}, LKi/v;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LKi/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v1, p0, LO1/k$a;->c:Lmh/p;

    invoke-interface {v1, v0, p1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_0
    if-nez v0, :cond_0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LO1/k$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
