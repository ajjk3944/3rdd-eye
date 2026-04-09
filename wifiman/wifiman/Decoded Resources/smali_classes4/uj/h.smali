.class public final Luj/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj/l;


# instance fields
.field private final a:Lorg/kodein/type/q;

.field private final b:Ljava/lang/Object;

.field private final c:Lorg/kodein/type/q;


# direct methods
.method public constructor <init>(Lorg/kodein/type/q;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "createdType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luj/h;->a:Lorg/kodein/type/q;

    iput-object p2, p0, Luj/h;->b:Ljava/lang/Object;

    sget-object p1, Lorg/kodein/type/q;->a:Lorg/kodein/type/q$a;

    invoke-virtual {p1}, Lorg/kodein/type/q$a;->a()Lorg/kodein/type/q;

    move-result-object p1

    iput-object p1, p0, Luj/h;->c:Lorg/kodein/type/q;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Luj/h;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ( "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Luj/h;->j()Lorg/kodein/type/q;

    move-result-object v1

    invoke-interface {v1}, Lorg/kodein/type/q;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " )"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/h;->c:Lorg/kodein/type/q;

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
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Luj/h;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ( "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Luj/h;->j()Lorg/kodein/type/q;

    move-result-object v1

    invoke-interface {v1}, Lorg/kodein/type/q;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " )"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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

    const-string v0, "instance"

    return-object v0
.end method

.method public i(Lorg/kodein/di/DI$e;Luj/b;)Lmh/l;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "di"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Luj/h$a;

    invoke-direct {p1, p0}, Luj/h$a;-><init>(Luj/h;)V

    return-object p1
.end method

.method public j()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/h;->a:Lorg/kodein/type/q;

    return-object v0
.end method

.method public final k()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Luj/h;->b:Ljava/lang/Object;

    return-object v0
.end method
