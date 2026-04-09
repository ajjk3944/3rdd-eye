.class public Lzj/f;
.super Lzj/b;
.source "SourceFile"

# interfaces
.implements Lyj/h;


# static fields
.field public static final b:Lyj/h;

.field public static final c:Lyj/h;


# instance fields
.field private final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzj/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lzj/f;-><init>(Z)V

    sput-object v0, Lzj/f;->b:Lyj/h;

    new-instance v0, Lzj/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzj/f;-><init>(Z)V

    sput-object v0, Lzj/f;->c:Lyj/h;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lzj/b;-><init>()V

    iput-boolean p1, p0, Lzj/f;->a:Z

    return-void
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

.method public bridge synthetic M()Lyj/c;
    .locals 1

    invoke-virtual {p0}, Lzj/f;->R()Lyj/h;

    move-result-object v0

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

.method public R()Lyj/h;
    .locals 0

    return-object p0
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

.method public bridge synthetic e()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->e()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

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

    invoke-interface {p1}, Lyj/u;->H()Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lzj/f;->a:Z

    invoke-interface {p1}, Lyj/u;->M()Lyj/c;

    move-result-object p1

    invoke-interface {p1}, Lyj/c;->s()Z

    move-result p1

    if-ne v1, p1, :cond_3

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_0
    return v0
.end method

.method public f(Lorg/msgpack/core/e;)V
    .locals 1

    iget-boolean v0, p0, Lzj/f;->a:Z

    invoke-virtual {p1, v0}, Lorg/msgpack/core/e;->s(Z)Lorg/msgpack/core/e;

    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lzj/f;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lzj/f;->a:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    return v0

    :cond_0
    const/16 v0, 0x4d5

    return v0
.end method

.method public bridge synthetic j()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->j()Z

    move-result v0

    return v0
.end method

.method public k()Lyj/w;
    .locals 1

    sget-object v0, Lyj/w;->BOOLEAN:Lyj/w;

    return-object v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lzj/f;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lzj/f;->g()Ljava/lang/String;

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
