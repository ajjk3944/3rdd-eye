.class public abstract Lvj/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj/m2;


# instance fields
.field private final a:Lorg/kodein/di/e;

.field private final b:Lorg/kodein/di/f;


# direct methods
.method protected constructor <init>(Lorg/kodein/di/e;Lorg/kodein/di/f;)V
    .locals 1

    const-string/jumbo v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvj/h;->a:Lorg/kodein/di/e;

    iput-object p2, p0, Lvj/h;->b:Lorg/kodein/di/f;

    return-void
.end method


# virtual methods
.method public b(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const-string/jumbo v0, "argType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvj/h;->i()Lorg/kodein/di/e;

    move-result-object v1

    new-instance v2, Lorg/kodein/di/DI$e;

    iget-object v0, p0, Lvj/h;->b:Lorg/kodein/di/f;

    invoke-interface {v0}, Lorg/kodein/di/f;->getType()Lorg/kodein/type/q;

    move-result-object v0

    const-string/jumbo v3, "null cannot be cast to non-null type org.kodein.type.TypeToken<in kotlin.Any>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0, p1, p2, p3}, Lorg/kodein/di/DI$e;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)V

    iget-object p1, p0, Lvj/h;->b:Lorg/kodein/di/f;

    invoke-interface {p1}, Lorg/kodein/di/f;->getValue()Ljava/lang/Object;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lorg/kodein/di/e$b;->a(Lorg/kodein/di/e;Lorg/kodein/di/DI$e;Ljava/lang/Object;IILjava/lang/Object;)Lmh/l;

    move-result-object p1

    invoke-interface {p1, p4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)Lmh/l;
    .locals 7

    const-string/jumbo v0, "argType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvj/h;->i()Lorg/kodein/di/e;

    move-result-object v1

    new-instance v2, Lorg/kodein/di/DI$e;

    iget-object v0, p0, Lvj/h;->b:Lorg/kodein/di/f;

    invoke-interface {v0}, Lorg/kodein/di/f;->getType()Lorg/kodein/type/q;

    move-result-object v0

    const-string/jumbo v3, "null cannot be cast to non-null type org.kodein.type.TypeToken<in kotlin.Any>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0, p1, p2, p3}, Lorg/kodein/di/DI$e;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)V

    iget-object p1, p0, Lvj/h;->b:Lorg/kodein/di/f;

    invoke-interface {p1}, Lorg/kodein/di/f;->getValue()Ljava/lang/Object;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lorg/kodein/di/e$b;->a(Lorg/kodein/di/e;Lorg/kodein/di/DI$e;Ljava/lang/Object;IILjava/lang/Object;)Lmh/l;

    move-result-object p1

    return-object p1
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    invoke-static {p0}, Lrj/m2$a;->a(Lrj/m2;)Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method

.method public e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvj/h;->i()Lorg/kodein/di/e;

    move-result-object v1

    new-instance v2, Lorg/kodein/di/DI$e;

    iget-object v0, p0, Lvj/h;->b:Lorg/kodein/di/f;

    invoke-interface {v0}, Lorg/kodein/di/f;->getType()Lorg/kodein/type/q;

    move-result-object v0

    const-string/jumbo v3, "null cannot be cast to non-null type org.kodein.type.TypeToken<in kotlin.Any>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lorg/kodein/type/q;->a:Lorg/kodein/type/q$a;

    invoke-virtual {v3}, Lorg/kodein/type/q$a;->b()Lorg/kodein/type/q;

    move-result-object v3

    invoke-direct {v2, v0, v3, p1, p2}, Lorg/kodein/di/DI$e;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)V

    iget-object p1, p0, Lvj/h;->b:Lorg/kodein/di/f;

    invoke-interface {p1}, Lorg/kodein/di/f;->getValue()Ljava/lang/Object;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lorg/kodein/di/e$b;->c(Lorg/kodein/di/e;Lorg/kodein/di/DI$e;Ljava/lang/Object;IILjava/lang/Object;)Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f()Lorg/kodein/di/DI;
    .locals 4

    new-instance v0, Lvj/e;

    invoke-virtual {p0}, Lvj/h;->i()Lorg/kodein/di/e;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.di.internal.DIContainerImpl"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lvj/d;

    invoke-direct {v0, v1}, Lvj/e;-><init>(Lvj/d;)V

    iget-object v1, p0, Lvj/h;->b:Lorg/kodein/di/f;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lorg/kodein/di/d;->d(Lorg/kodein/di/c;Lorg/kodein/di/f;Lrj/l2;ILjava/lang/Object;)Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method

.method public g()Lrj/m2;
    .locals 0

    return-object p0
.end method

.method public h(Lorg/kodein/di/f;)Lrj/m2;
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvj/i;

    invoke-virtual {p0}, Lvj/h;->i()Lorg/kodein/di/e;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lvj/i;-><init>(Lorg/kodein/di/e;Lorg/kodein/di/f;)V

    return-object v0
.end method

.method public i()Lorg/kodein/di/e;
    .locals 1

    iget-object v0, p0, Lvj/h;->a:Lorg/kodein/di/e;

    return-object v0
.end method
