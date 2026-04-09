.class public final Lod/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lod/f$a;,
        Lod/f$b;
    }
.end annotation


# instance fields
.field private final a:LW7/d;

.field private b:Ljava/lang/String;

.field private c:Lod/f$a;

.field private d:Lod/f$b;


# direct methods
.method public constructor <init>(LW7/d;Ljava/lang/String;Lod/f$a;)V
    .locals 1

    const-string v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod/f;->a:LW7/d;

    iput-object p2, p0, Lod/f;->b:Ljava/lang/String;

    iput-object p3, p0, Lod/f;->c:Lod/f$a;

    new-instance p1, Lod/f$b;

    invoke-direct {p1}, Lod/f$b;-><init>()V

    iput-object p1, p0, Lod/f;->d:Lod/f$b;

    return-void
.end method


# virtual methods
.method public c()LW7/d;
    .locals 1

    iget-object v0, p0, Lod/f;->a:LW7/d;

    return-object v0
.end method

.method public bridge synthetic e()Lk7/a$a;
    .locals 1

    invoke-virtual {p0}, Lod/f;->g()Lod/f$a;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lod/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lod/f;

    iget-object v1, p0, Lod/f;->a:LW7/d;

    iget-object v3, p1, Lod/f;->a:LW7/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lod/f;->b:Ljava/lang/String;

    iget-object v3, p1, Lod/f;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lod/f;->c:Lod/f$a;

    iget-object p1, p1, Lod/f;->c:Lod/f$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public g()Lod/f$a;
    .locals 1

    iget-object v0, p0, Lod/f;->c:Lod/f$a;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lod/f;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lod/f;->c()LW7/d;

    move-result-object v1

    invoke-virtual {v1}, LW7/d;->a()I

    move-result v1

    invoke-virtual {p0}, Lod/f;->c()LW7/d;

    move-result-object v2

    invoke-virtual {v2}, LW7/d;->b()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lod/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lod/f;->a:LW7/d;

    invoke-virtual {v0}, LW7/d;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lod/f;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lod/f;->c:Lod/f$a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lod/f$a;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public i(Lod/f$a;)V
    .locals 0

    iput-object p1, p0, Lod/f;->c:Lod/f$a;

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lod/f;->b:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lod/f;->a:LW7/d;

    iget-object v1, p0, Lod/f;->b:Ljava/lang/String;

    iget-object v2, p0, Lod/f;->c:Lod/f$a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DetectedObject(coordinates="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", img="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
