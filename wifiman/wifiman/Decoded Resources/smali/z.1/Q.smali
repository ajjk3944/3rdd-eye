.class final Lz/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/f0;


# instance fields
.field private final b:Lz/N;


# direct methods
.method public constructor <init>(Lz/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/Q;->b:Lz/N;

    return-void
.end method


# virtual methods
.method public a(LY0/d;LY0/t;)I
    .locals 1

    iget-object v0, p0, Lz/Q;->b:Lz/N;

    invoke-interface {v0, p2}, Lz/N;->b(LY0/t;)F

    move-result p2

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result p1

    return p1
.end method

.method public b(LY0/d;)I
    .locals 1

    iget-object v0, p0, Lz/Q;->b:Lz/N;

    invoke-interface {v0}, Lz/N;->c()F

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->x1(F)I

    move-result p1

    return p1
.end method

.method public c(LY0/d;)I
    .locals 1

    iget-object v0, p0, Lz/Q;->b:Lz/N;

    invoke-interface {v0}, Lz/N;->d()F

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->x1(F)I

    move-result p1

    return p1
.end method

.method public d(LY0/d;LY0/t;)I
    .locals 1

    iget-object v0, p0, Lz/Q;->b:Lz/N;

    invoke-interface {v0, p2}, Lz/N;->a(LY0/t;)F

    move-result p2

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lz/Q;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lz/Q;

    iget-object p1, p1, Lz/Q;->b:Lz/N;

    iget-object v0, p0, Lz/Q;->b:Lz/N;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lz/Q;->b:Lz/N;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    sget-object v0, LY0/t;->Ltr:LY0/t;

    iget-object v1, p0, Lz/Q;->b:Lz/N;

    invoke-interface {v1, v0}, Lz/N;->a(LY0/t;)F

    move-result v1

    iget-object v2, p0, Lz/Q;->b:Lz/N;

    invoke-interface {v2}, Lz/N;->d()F

    move-result v2

    iget-object v3, p0, Lz/Q;->b:Lz/N;

    invoke-interface {v3, v0}, Lz/N;->b(LY0/t;)F

    move-result v0

    iget-object v3, p0, Lz/Q;->b:Lz/N;

    invoke-interface {v3}, Lz/N;->c()F

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "PaddingValues("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
