.class public final Luj/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj/l;


# instance fields
.field private final a:Lorg/kodein/type/q;

.field private final b:Lorg/kodein/type/q;

.field private final c:Lmh/l;


# direct methods
.method public constructor <init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V
    .locals 1

    const-string v0, "contextType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luj/n;->a:Lorg/kodein/type/q;

    iput-object p2, p0, Luj/n;->b:Lorg/kodein/type/q;

    iput-object p3, p0, Luj/n;->c:Lmh/l;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Luj/l$a;->c(Luj/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/n;->a:Lorg/kodein/type/q;

    return-object v0
.end method

.method public c()Luj/q;
    .locals 1

    invoke-static {p0}, Luj/l$a;->e(Luj/l;)Luj/q;

    move-result-object v0

    return-object v0
.end method

.method public d()Lorg/kodein/type/q;
    .locals 1

    invoke-static {p0}, Luj/l$a;->b(Luj/l;)Lorg/kodein/type/q;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Luj/l$a;->a(Luj/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Luj/l$a;->d(Luj/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 1

    invoke-static {p0}, Luj/l$a;->f(Luj/l;)Z

    move-result v0

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "provider"

    return-object v0
.end method

.method public i(Lorg/kodein/di/DI$e;Luj/b;)Lmh/l;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "di"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Luj/n$a;

    invoke-direct {p1, p0, p2}, Luj/n$a;-><init>(Luj/n;Luj/b;)V

    return-object p1
.end method

.method public j()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/n;->b:Lorg/kodein/type/q;

    return-object v0
.end method

.method public final k()Lmh/l;
    .locals 1

    iget-object v0, p0, Luj/n;->c:Lmh/l;

    return-object v0
.end method
