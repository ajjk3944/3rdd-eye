.class public Lvj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj/m2;
.implements Luj/b;


# instance fields
.field private final a:Lrj/m2;

.field private final b:Lorg/kodein/di/DI$e;

.field private final c:I


# direct methods
.method public constructor <init>(Lrj/m2;Lorg/kodein/di/DI$e;I)V
    .locals 1

    const-string/jumbo v0, "directDI"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvj/a;->a:Lrj/m2;

    iput-object p2, p0, Lvj/a;->b:Lorg/kodein/di/DI$e;

    iput p3, p0, Lvj/a;->c:I

    return-void
.end method


# virtual methods
.method public a()Luj/b;
    .locals 4

    new-instance v0, Lvj/a;

    invoke-virtual {p0}, Lvj/a;->g()Lrj/m2;

    move-result-object v1

    sget-object v2, Luj/f;->b:Luj/f;

    invoke-interface {v1, v2}, Lrj/o2;->h(Lorg/kodein/di/f;)Lrj/m2;

    move-result-object v1

    iget-object v2, p0, Lvj/a;->b:Lorg/kodein/di/DI$e;

    iget v3, p0, Lvj/a;->c:I

    invoke-direct {v0, v1, v2, v3}, Lvj/a;-><init>(Lrj/m2;Lorg/kodein/di/DI$e;I)V

    return-object v0
.end method

.method public b(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string/jumbo v0, "argType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvj/a;->a:Lrj/m2;

    invoke-interface {v0, p1, p2, p3, p4}, Lrj/o2;->b(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)Lmh/l;
    .locals 1

    const-string/jumbo v0, "argType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvj/a;->a:Lrj/m2;

    invoke-interface {v0, p1, p2, p3}, Lrj/o2;->c(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)Lmh/l;

    move-result-object p1

    return-object p1
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lvj/a;->a:Lrj/m2;

    invoke-interface {v0}, Lrj/o2;->d()Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method

.method public e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvj/a;->a:Lrj/m2;

    invoke-interface {v0, p1, p2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lvj/a;->a:Lrj/m2;

    invoke-interface {v0}, Lrj/o2;->f()Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method

.method public g()Lrj/m2;
    .locals 1

    iget-object v0, p0, Lvj/a;->a:Lrj/m2;

    return-object v0
.end method

.method public getContext()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lvj/a;->g()Lrj/m2;

    move-result-object v0

    invoke-interface {v0}, Lrj/o2;->d()Lorg/kodein/di/DI;

    move-result-object v0

    invoke-interface {v0}, Lorg/kodein/di/c;->I()Lorg/kodein/di/f;

    move-result-object v0

    invoke-interface {v0}, Lorg/kodein/di/f;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type C of org.kodein.di.internal.BindingDIImpl"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public h(Lorg/kodein/di/f;)Lrj/m2;
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvj/a;->a:Lrj/m2;

    invoke-interface {v0, p1}, Lrj/o2;->h(Lorg/kodein/di/f;)Lrj/m2;

    move-result-object p1

    return-object p1
.end method
