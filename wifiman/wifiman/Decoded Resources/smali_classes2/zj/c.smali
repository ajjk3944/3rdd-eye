.class public Lzj/c;
.super Lzj/b;
.source "SourceFile"

# interfaces
.implements Lyj/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj/c$a;
    }
.end annotation


# static fields
.field private static final b:Lzj/c;


# instance fields
.field private final a:[Lyj/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzj/c;

    const/4 v1, 0x0

    new-array v1, v1, [Lyj/u;

    invoke-direct {v0, v1}, Lzj/c;-><init>([Lyj/u;)V

    sput-object v0, Lzj/c;->b:Lzj/c;

    return-void
.end method

.method public constructor <init>([Lyj/u;)V
    .locals 0

    invoke-direct {p0}, Lzj/b;-><init>()V

    iput-object p1, p0, Lzj/c;->a:[Lyj/u;

    return-void
.end method

.method private static X(Ljava/lang/StringBuilder;Lyj/u;)V
    .locals 1

    invoke-interface {p1}, Lyj/u;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lyj/u;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method

.method public static Y()Lyj/f;
    .locals 1

    sget-object v0, Lzj/c;->b:Lzj/c;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic C()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->C()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic G()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->G()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic H()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->H()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic I()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->I()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic N()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->N()Z

    move-result v0

    return v0
.end method

.method public O()Lyj/f;
    .locals 0

    return-object p0
.end method

.method public bridge synthetic Q()Lyj/g;
    .locals 1

    invoke-super {p0}, Lzj/b;->Q()Lyj/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic R()Lyj/h;
    .locals 1

    invoke-super {p0}, Lzj/b;->R()Lyj/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic S()Lyj/i;
    .locals 1

    invoke-super {p0}, Lzj/b;->S()Lyj/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic T()Lyj/j;
    .locals 1

    invoke-super {p0}, Lzj/b;->T()Lyj/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic U()Lyj/k;
    .locals 1

    invoke-super {p0}, Lzj/b;->U()Lyj/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic V()Lyj/l;
    .locals 1

    invoke-super {p0}, Lzj/b;->V()Lyj/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic W()Lyj/n;
    .locals 1

    invoke-super {p0}, Lzj/b;->W()Lyj/n;

    move-result-object v0

    return-object v0
.end method

.method public Z(I)Lyj/u;
    .locals 1

    iget-object v0, p0, Lzj/c;->a:[Lyj/u;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public bridge synthetic e()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->e()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lyj/u;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lyj/u;

    instance-of v1, p1, Lzj/c;

    if-eqz v1, :cond_2

    check-cast p1, Lzj/c;

    iget-object v0, p0, Lzj/c;->a:[Lyj/u;

    iget-object p1, p1, Lzj/c;->a:[Lyj/u;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    invoke-interface {p1}, Lyj/u;->G()Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-interface {p1}, Lyj/u;->i()Lyj/a;

    move-result-object p1

    invoke-virtual {p0}, Lzj/c;->size()I

    move-result v1

    invoke-interface {p1}, Lyj/a;->size()I

    move-result v3

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    invoke-interface {p1}, Lyj/a;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v1, v2

    :goto_0
    iget-object v3, p0, Lzj/c;->a:[Lyj/u;

    array-length v3, v3

    if-ge v1, v3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, p0, Lzj/c;->a:[Lyj/u;

    aget-object v3, v3, v1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lyj/u;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v2

    :cond_7
    return v0
.end method

.method public f(Lorg/msgpack/core/e;)V
    .locals 3

    iget-object v0, p0, Lzj/c;->a:[Lyj/u;

    array-length v0, v0

    invoke-virtual {p1, v0}, Lorg/msgpack/core/e;->h(I)Lorg/msgpack/core/e;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lzj/c;->a:[Lyj/u;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-interface {v1, p1}, Lyj/u;->f(Lorg/msgpack/core/e;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lzj/c;->a:[Lyj/u;

    array-length v0, v0

    if-nez v0, :cond_0

    const-string v0, "[]"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzj/c;->a:[Lyj/u;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v1}, Lyj/u;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    :goto_0
    iget-object v2, p0, Lzj/c;->a:[Lyj/u;

    array-length v2, v2

    if-ge v1, v2, :cond_1

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lzj/c;->a:[Lyj/u;

    aget-object v2, v2, v1

    invoke-interface {v2}, Lyj/u;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lzj/c;->a:[Lyj/u;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public bridge synthetic i()Lyj/a;
    .locals 1

    invoke-virtual {p0}, Lzj/c;->O()Lyj/f;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lzj/c$a;

    iget-object v1, p0, Lzj/c;->a:[Lyj/u;

    invoke-direct {v0, v1}, Lzj/c$a;-><init>([Lyj/u;)V

    return-object v0
.end method

.method public bridge synthetic j()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->j()Z

    move-result v0

    return v0
.end method

.method public k()Lyj/w;
    .locals 1

    sget-object v0, Lyj/w;->ARRAY:Lyj/w;

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lzj/c;->a:[Lyj/u;

    array-length v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lzj/c;->a:[Lyj/u;

    array-length v0, v0

    if-nez v0, :cond_0

    const-string v0, "[]"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzj/c;->a:[Lyj/u;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lzj/c;->X(Ljava/lang/StringBuilder;Lyj/u;)V

    const/4 v1, 0x1

    :goto_0
    iget-object v2, p0, Lzj/c;->a:[Lyj/u;

    array-length v2, v2

    if-ge v1, v2, :cond_1

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lzj/c;->a:[Lyj/u;

    aget-object v2, v2, v1

    invoke-static {v0, v2}, Lzj/c;->X(Ljava/lang/StringBuilder;Lyj/u;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->v()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic y()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->y()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic z()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->z()Z

    move-result v0

    return v0
.end method
