.class public Lzj/j;
.super Lzj/b;
.source "SourceFile"

# interfaces
.implements Lyj/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj/j$b;,
        Lzj/j$a;,
        Lzj/j$c;
    }
.end annotation


# static fields
.field private static final b:Lzj/j;


# instance fields
.field private final a:[Lyj/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzj/j;

    const/4 v1, 0x0

    new-array v1, v1, [Lyj/u;

    invoke-direct {v0, v1}, Lzj/j;-><init>([Lyj/u;)V

    sput-object v0, Lzj/j;->b:Lzj/j;

    return-void
.end method

.method public constructor <init>([Lyj/u;)V
    .locals 0

    invoke-direct {p0}, Lzj/b;-><init>()V

    iput-object p1, p0, Lzj/j;->a:[Lyj/u;

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

    invoke-static {p0, p1}, Lzj/a;->X(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private static Y(Ljava/lang/StringBuilder;Lyj/u;)V
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

.method public static Z()Lyj/l;
    .locals 1

    sget-object v0, Lzj/j;->b:Lzj/j;

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

.method public J()Ljava/util/Map;
    .locals 2

    new-instance v0, Lzj/j$c;

    iget-object v1, p0, Lzj/j;->a:[Lyj/u;

    invoke-direct {v0, v1}, Lzj/j$c;-><init>([Lyj/u;)V

    return-object v0
.end method

.method public bridge synthetic N()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->N()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic O()Lyj/f;
    .locals 1

    invoke-super {p0}, Lzj/b;->O()Lyj/f;

    move-result-object v0

    return-object v0
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

.method public V()Lyj/l;
    .locals 0

    return-object p0
.end method

.method public bridge synthetic W()Lyj/n;
    .locals 1

    invoke-super {p0}, Lzj/b;->W()Lyj/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->e()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lyj/u;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    check-cast p1, Lyj/u;

    invoke-interface {p1}, Lyj/u;->z()Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-interface {p1}, Lyj/u;->o()Lyj/q;

    move-result-object p1

    invoke-virtual {p0}, Lzj/j;->J()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, Lyj/q;->J()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Lorg/msgpack/core/e;)V
    .locals 3

    iget-object v0, p0, Lzj/j;->a:[Lyj/u;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p1, v0}, Lorg/msgpack/core/e;->J(I)Lorg/msgpack/core/e;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lzj/j;->a:[Lyj/u;

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
    .locals 5

    iget-object v0, p0, Lzj/j;->a:[Lyj/u;

    array-length v0, v0

    if-nez v0, :cond_0

    const-string v0, "{}"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzj/j;->a:[Lyj/u;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lzj/j;->X(Ljava/lang/StringBuilder;Lyj/u;)V

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lzj/j;->a:[Lyj/u;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-interface {v2}, Lyj/u;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x2

    :goto_0
    iget-object v3, p0, Lzj/j;->a:[Lyj/u;

    array-length v3, v3

    if-ge v2, v3, :cond_1

    const-string v3, ","

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lzj/j;->a:[Lyj/u;

    aget-object v3, v3, v2

    invoke-static {v0, v3}, Lzj/j;->X(Ljava/lang/StringBuilder;Lyj/u;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lzj/j;->a:[Lyj/u;

    add-int/lit8 v4, v2, 0x1

    aget-object v3, v3, v4

    invoke-interface {v3}, Lyj/u;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_1
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lzj/j;->a:[Lyj/u;

    array-length v3, v2

    if-ge v0, v3, :cond_0

    aget-object v2, v2, v0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    iget-object v3, p0, Lzj/j;->a:[Lyj/u;

    add-int/lit8 v4, v0, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    xor-int/2addr v2, v3

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public bridge synthetic j()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->j()Z

    move-result v0

    return v0
.end method

.method public k()Lyj/w;
    .locals 1

    sget-object v0, Lyj/w;->MAP:Lyj/w;

    return-object v0
.end method

.method public bridge synthetic o()Lyj/q;
    .locals 1

    invoke-virtual {p0}, Lzj/j;->V()Lyj/l;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lzj/j;->a:[Lyj/u;

    array-length v0, v0

    if-nez v0, :cond_0

    const-string v0, "{}"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzj/j;->a:[Lyj/u;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lzj/j;->Y(Ljava/lang/StringBuilder;Lyj/u;)V

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lzj/j;->a:[Lyj/u;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-static {v0, v2}, Lzj/j;->Y(Ljava/lang/StringBuilder;Lyj/u;)V

    const/4 v2, 0x2

    :goto_0
    iget-object v3, p0, Lzj/j;->a:[Lyj/u;

    array-length v3, v3

    if-ge v2, v3, :cond_1

    const-string v3, ","

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lzj/j;->a:[Lyj/u;

    aget-object v3, v3, v2

    invoke-static {v0, v3}, Lzj/j;->Y(Ljava/lang/StringBuilder;Lyj/u;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lzj/j;->a:[Lyj/u;

    add-int/lit8 v4, v2, 0x1

    aget-object v3, v3, v4

    invoke-static {v0, v3}, Lzj/j;->Y(Ljava/lang/StringBuilder;Lyj/u;)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_1
    const-string v1, "}"

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
