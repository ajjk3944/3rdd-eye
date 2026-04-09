.class final LH/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/b;


# instance fields
.field private final b:LH/b;

.field private final c:LH/b;


# direct methods
.method public constructor <init>(LH/b;LH/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/a;->b:LH/b;

    iput-object p2, p0, LH/a;->c:LH/b;

    return-void
.end method


# virtual methods
.method public a(LH/f;)V
    .locals 1

    iget-object v0, p0, LH/a;->b:LH/b;

    invoke-interface {v0, p1}, LH/b;->a(LH/f;)V

    iget-object v0, p0, LH/a;->c:LH/b;

    invoke-interface {v0, p1}, LH/b;->a(LH/f;)V

    return-void
.end method

.method public b()LF/D;
    .locals 2

    iget-object v0, p0, LH/a;->c:LH/b;

    invoke-interface {v0}, LH/b;->b()LF/D;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LH/a;->b:LH/b;

    invoke-interface {v1}, LH/b;->b()LF/D;

    move-result-object v1

    invoke-virtual {v0, v1}, LF/D;->c(LF/D;)LF/D;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, LH/a;->b:LH/b;

    invoke-interface {v0}, LH/b;->b()LF/D;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LH/a;

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, LH/a;

    iget-object v2, p0, LH/a;->b:LH/b;

    iget-object v3, p1, LH/a;->b:LH/b;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, LH/a;->c:LH/b;

    iget-object v3, p1, LH/a;->c:LH/b;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    invoke-virtual {p0}, LH/a;->b()LF/D;

    move-result-object v2

    invoke-virtual {p1}, LH/a;->b()LF/D;

    move-result-object p1

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LH/a;->b:LH/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LH/a;->c:LH/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x20

    invoke-virtual {p0}, LH/a;->b()LF/D;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public q(LJ0/w;)V
    .locals 1

    iget-object v0, p0, LH/a;->b:LH/b;

    invoke-interface {v0, p1}, LH/b;->q(LJ0/w;)V

    iget-object v0, p0, LH/a;->c:LH/b;

    invoke-interface {v0, p1}, LH/b;->q(LJ0/w;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LH/a;->b:LH/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".then("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LH/a;->c:LH/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
