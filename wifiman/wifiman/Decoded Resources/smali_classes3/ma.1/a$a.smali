.class public final Lma/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lr9/a$b;

.field private final b:Lr9/a$b;

.field private final c:Lr9/a$a;

.field private final d:Lr9/a$a;

.field private final e:Lr9/a$a;

.field private final f:Lr9/a$a;

.field private final g:Lr9/a$a;

.field private final h:Lr9/a$a;

.field private final i:Lr9/a$a;

.field private final j:Lr9/a$a;

.field private final k:Lr9/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lr9/a$b;Lr9/a$b;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;)V
    .locals 1

    const-string/jumbo v0, "neutral"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "neutralAlpha"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "blue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "navy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "aqua"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "green"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "lime"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "yellow"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "orange"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "red"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "purple"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lma/a$a;->a:Lr9/a$b;

    iput-object p2, p0, Lma/a$a;->b:Lr9/a$b;

    iput-object p3, p0, Lma/a$a;->c:Lr9/a$a;

    iput-object p4, p0, Lma/a$a;->d:Lr9/a$a;

    iput-object p5, p0, Lma/a$a;->e:Lr9/a$a;

    iput-object p6, p0, Lma/a$a;->f:Lr9/a$a;

    iput-object p7, p0, Lma/a$a;->g:Lr9/a$a;

    iput-object p8, p0, Lma/a$a;->h:Lr9/a$a;

    iput-object p9, p0, Lma/a$a;->i:Lr9/a$a;

    iput-object p10, p0, Lma/a$a;->j:Lr9/a$a;

    iput-object p11, p0, Lma/a$a;->k:Lr9/a$a;

    return-void
.end method


# virtual methods
.method public final a()Lr9/a$a;
    .locals 1

    iget-object v0, p0, Lma/a$a;->e:Lr9/a$a;

    return-object v0
.end method

.method public final b()Lr9/a$a;
    .locals 1

    iget-object v0, p0, Lma/a$a;->c:Lr9/a$a;

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lma/a$a;->j:Lr9/a$a;

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Lr9/a$a;
    .locals 1

    iget-object v0, p0, Lma/a$a;->f:Lr9/a$a;

    return-object v0
.end method

.method public final e()Lr9/a$a;
    .locals 1

    iget-object v0, p0, Lma/a$a;->g:Lr9/a$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lma/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lma/a$a;

    iget-object v1, p0, Lma/a$a;->a:Lr9/a$b;

    iget-object v3, p1, Lma/a$a;->a:Lr9/a$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lma/a$a;->b:Lr9/a$b;

    iget-object v3, p1, Lma/a$a;->b:Lr9/a$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lma/a$a;->c:Lr9/a$a;

    iget-object v3, p1, Lma/a$a;->c:Lr9/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lma/a$a;->d:Lr9/a$a;

    iget-object v3, p1, Lma/a$a;->d:Lr9/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lma/a$a;->e:Lr9/a$a;

    iget-object v3, p1, Lma/a$a;->e:Lr9/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lma/a$a;->f:Lr9/a$a;

    iget-object v3, p1, Lma/a$a;->f:Lr9/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lma/a$a;->g:Lr9/a$a;

    iget-object v3, p1, Lma/a$a;->g:Lr9/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lma/a$a;->h:Lr9/a$a;

    iget-object v3, p1, Lma/a$a;->h:Lr9/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lma/a$a;->i:Lr9/a$a;

    iget-object v3, p1, Lma/a$a;->i:Lr9/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lma/a$a;->j:Lr9/a$a;

    iget-object v3, p1, Lma/a$a;->j:Lr9/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lma/a$a;->k:Lr9/a$a;

    iget-object p1, p1, Lma/a$a;->k:Lr9/a$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final f()Lr9/a$a;
    .locals 1

    iget-object v0, p0, Lma/a$a;->d:Lr9/a$a;

    return-object v0
.end method

.method public final g()Lr9/a$b;
    .locals 1

    iget-object v0, p0, Lma/a$a;->a:Lr9/a$b;

    return-object v0
.end method

.method public final h()Lr9/a$a;
    .locals 1

    iget-object v0, p0, Lma/a$a;->i:Lr9/a$a;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lma/a$a;->a:Lr9/a$b;

    invoke-virtual {v0}, Lr9/a$b;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lma/a$a;->b:Lr9/a$b;

    invoke-virtual {v1}, Lr9/a$b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lma/a$a;->c:Lr9/a$a;

    invoke-virtual {v1}, Lr9/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lma/a$a;->d:Lr9/a$a;

    invoke-virtual {v1}, Lr9/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lma/a$a;->e:Lr9/a$a;

    invoke-virtual {v1}, Lr9/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lma/a$a;->f:Lr9/a$a;

    invoke-virtual {v1}, Lr9/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lma/a$a;->g:Lr9/a$a;

    invoke-virtual {v1}, Lr9/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lma/a$a;->h:Lr9/a$a;

    invoke-virtual {v1}, Lr9/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lma/a$a;->i:Lr9/a$a;

    invoke-virtual {v1}, Lr9/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lma/a$a;->j:Lr9/a$a;

    invoke-virtual {v1}, Lr9/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lma/a$a;->k:Lr9/a$a;

    invoke-virtual {v1}, Lr9/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()J
    .locals 2

    iget-object v0, p0, Lma/a$a;->f:Lr9/a$a;

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final j()J
    .locals 2

    iget-object v0, p0, Lma/a$a;->c:Lr9/a$a;

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final k()Lr9/a$a;
    .locals 1

    iget-object v0, p0, Lma/a$a;->k:Lr9/a$a;

    return-object v0
.end method

.method public final l()Lr9/a$a;
    .locals 1

    iget-object v0, p0, Lma/a$a;->j:Lr9/a$a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lma/a$a;->a:Lr9/a$b;

    iget-object v1, p0, Lma/a$a;->b:Lr9/a$b;

    iget-object v2, p0, Lma/a$a;->c:Lr9/a$a;

    iget-object v3, p0, Lma/a$a;->d:Lr9/a$a;

    iget-object v4, p0, Lma/a$a;->e:Lr9/a$a;

    iget-object v5, p0, Lma/a$a;->f:Lr9/a$a;

    iget-object v6, p0, Lma/a$a;->g:Lr9/a$a;

    iget-object v7, p0, Lma/a$a;->h:Lr9/a$a;

    iget-object v8, p0, Lma/a$a;->i:Lr9/a$a;

    iget-object v9, p0, Lma/a$a;->j:Lr9/a$a;

    iget-object v10, p0, Lma/a$a;->k:Lr9/a$a;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Base(neutral="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", neutralAlpha="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", blue="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navy="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aqua="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", green="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lime="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", yellow="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", orange="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", red="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", purple="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
