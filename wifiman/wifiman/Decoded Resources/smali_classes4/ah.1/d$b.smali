.class public final Lah/d$b;
.super Lah/d$d;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lah/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Lah/d;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lah/d$d;-><init>(Lah/d;)V

    return-void
.end method


# virtual methods
.method public k()Lah/d$c;
    .locals 3

    invoke-virtual {p0}, Lah/d$d;->d()V

    invoke-virtual {p0}, Lah/d$d;->e()I

    move-result v0

    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v1

    invoke-static {v1}, Lah/d;->j(Lah/d;)I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Lah/d$d;->e()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Lah/d$d;->i(I)V

    invoke-virtual {p0, v0}, Lah/d$d;->j(I)V

    new-instance v0, Lah/d$c;

    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v1

    invoke-virtual {p0}, Lah/d$d;->f()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lah/d$c;-><init>(Lah/d;I)V

    invoke-virtual {p0}, Lah/d$d;->h()V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final n(Ljava/lang/StringBuilder;)V
    .locals 3

    const-string v0, "sb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lah/d$d;->e()I

    move-result v0

    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v1

    invoke-static {v1}, Lah/d;->j(Lah/d;)I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p0}, Lah/d$d;->e()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Lah/d$d;->i(I)V

    invoke-virtual {p0, v0}, Lah/d$d;->j(I)V

    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v0

    invoke-static {v0}, Lah/d;->h(Lah/d;)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lah/d$d;->f()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v1

    const-string v2, "(this Map)"

    if-ne v0, v1, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_0
    const/16 v0, 0x3d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v0

    invoke-static {v0}, Lah/d;->r(Lah/d;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lah/d$d;->f()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {p0}, Lah/d$d;->h()V

    return-void

    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lah/d$b;->k()Lah/d$c;

    move-result-object v0

    return-object v0
.end method

.method public final p()I
    .locals 4

    invoke-virtual {p0}, Lah/d$d;->e()I

    move-result v0

    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v1

    invoke-static {v1}, Lah/d;->j(Lah/d;)I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p0}, Lah/d$d;->e()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Lah/d$d;->i(I)V

    invoke-virtual {p0, v0}, Lah/d$d;->j(I)V

    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v0

    invoke-static {v0}, Lah/d;->h(Lah/d;)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lah/d$d;->f()I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v2

    invoke-static {v2}, Lah/d;->r(Lah/d;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lah/d$d;->f()I

    move-result v3

    aget-object v2, v2, v3

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    xor-int/2addr v0, v1

    invoke-virtual {p0}, Lah/d$d;->h()V

    return v0

    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
