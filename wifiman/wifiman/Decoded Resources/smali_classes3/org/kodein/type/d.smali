.class public final Lorg/kodein/type/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/type/i;


# instance fields
.field private final b:Lorg/kodein/type/i;

.field private final c:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lorg/kodein/type/i;Ljava/lang/Class;)V
    .locals 1

    const-string/jumbo v0, "typeToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "raw"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    iput-object p2, p0, Lorg/kodein/type/d;->c:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    invoke-interface {v0}, Lorg/kodein/type/q;->a()Z

    move-result v0

    return v0
.end method

.method public b()[Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    invoke-interface {v0}, Lorg/kodein/type/q;->b()[Lorg/kodein/type/q;

    move-result-object v0

    return-object v0
.end method

.method public c()Lorg/kodein/type/q;
    .locals 2

    new-instance v0, Lorg/kodein/type/f;

    iget-object v1, p0, Lorg/kodein/type/d;->c:Ljava/lang/Class;

    invoke-direct {v0, v1}, Lorg/kodein/type/f;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public d(Lorg/kodein/type/q;)Z
    .locals 1

    const-string/jumbo v0, "typeToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    invoke-interface {v0, p1}, Lorg/kodein/type/q;->d(Lorg/kodein/type/q;)Z

    move-result p1

    return p1
.end method

.method public e()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    invoke-interface {v0}, Lorg/kodein/type/i;->e()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    invoke-interface {v0}, Lorg/kodein/type/q;->f()Z

    move-result v0

    return v0
.end method

.method public g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    invoke-interface {v0}, Lorg/kodein/type/q;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    invoke-interface {v0}, Lorg/kodein/type/q;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    invoke-interface {v0}, Lorg/kodein/type/q;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/d;->b:Lorg/kodein/type/i;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
