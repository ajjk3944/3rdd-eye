.class public final Luj/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj/j;
.implements Lrj/m2;
.implements Luj/x;


# instance fields
.field private final a:Luj/b;


# direct methods
.method public constructor <init>(Luj/b;)V
    .locals 1

    const-string v0, "_di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luj/k;->a:Luj/b;

    return-void
.end method


# virtual methods
.method public b(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "argType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luj/k;->a:Luj/b;

    invoke-interface {v0, p1, p2, p3, p4}, Lrj/o2;->b(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)Lmh/l;
    .locals 1

    const-string v0, "argType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luj/k;->a:Luj/b;

    invoke-interface {v0, p1, p2, p3}, Lrj/o2;->c(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)Lmh/l;

    move-result-object p1

    return-object p1
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Luj/k;->a:Luj/b;

    invoke-interface {v0}, Lrj/o2;->d()Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method

.method public e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luj/k;->a:Luj/b;

    invoke-interface {v0, p1, p2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Luj/k;->a:Luj/b;

    invoke-interface {v0}, Lrj/o2;->f()Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method

.method public g()Lrj/m2;
    .locals 1

    iget-object v0, p0, Luj/k;->a:Luj/b;

    invoke-interface {v0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v0

    return-object v0
.end method

.method public h(Lorg/kodein/di/f;)Lrj/m2;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luj/k;->a:Luj/b;

    invoke-interface {v0, p1}, Lrj/o2;->h(Lorg/kodein/di/f;)Lrj/m2;

    move-result-object p1

    return-object p1
.end method
