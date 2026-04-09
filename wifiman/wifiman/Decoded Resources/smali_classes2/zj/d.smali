.class public Lzj/d;
.super Lzj/b;
.source "SourceFile"

# interfaces
.implements Lyj/k;


# static fields
.field private static final b:Ljava/math/BigInteger;

.field private static final c:Ljava/math/BigInteger;

.field private static final d:Ljava/math/BigInteger;

.field private static final e:Ljava/math/BigInteger;

.field private static final f:Ljava/math/BigInteger;

.field private static final g:Ljava/math/BigInteger;

.field private static final h:Ljava/math/BigInteger;

.field private static final i:Ljava/math/BigInteger;


# instance fields
.field private final a:Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, -0x80

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lzj/d;->b:Ljava/math/BigInteger;

    const-wide/16 v0, 0x7f

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lzj/d;->c:Ljava/math/BigInteger;

    const-wide/16 v0, -0x8000

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lzj/d;->d:Ljava/math/BigInteger;

    const-wide/16 v0, 0x7fff

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lzj/d;->e:Ljava/math/BigInteger;

    const-wide/32 v0, -0x80000000

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lzj/d;->f:Ljava/math/BigInteger;

    const-wide/32 v0, 0x7fffffff

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lzj/d;->g:Ljava/math/BigInteger;

    const-wide/high16 v0, -0x8000000000000000L

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lzj/d;->h:Ljava/math/BigInteger;

    const-wide v0, 0x7fffffffffffffffL

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lzj/d;->i:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;)V
    .locals 0

    invoke-direct {p0}, Lzj/b;-><init>()V

    iput-object p1, p0, Lzj/d;->a:Ljava/math/BigInteger;

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

.method public U()Lyj/k;
    .locals 0

    return-object p0
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

    invoke-interface {p1}, Lyj/u;->y()Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-interface {p1}, Lyj/u;->x()Lyj/p;

    move-result-object p1

    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    invoke-interface {p1}, Lyj/r;->q()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Lorg/msgpack/core/e;)V
    .locals 1

    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    invoke-virtual {p1, v0}, Lorg/msgpack/core/e;->j(Ljava/math/BigInteger;)Lorg/msgpack/core/e;

    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    sget-object v0, Lzj/d;->f:Ljava/math/BigInteger;

    iget-object v1, p0, Lzj/d;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    sget-object v1, Lzj/d;->g:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_0
    sget-object v0, Lzj/d;->h:Ljava/math/BigInteger;

    iget-object v1, p0, Lzj/d;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gtz v0, :cond_1

    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    sget-object v1, Lzj/d;->i:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gtz v0, :cond_1

    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    :cond_1
    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

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

    sget-object v0, Lyj/w;->INTEGER:Lyj/w;

    return-object v0
.end method

.method public q()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    return-object v0
.end method

.method public toLong()J
    .locals 2

    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lzj/d;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Z
    .locals 1

    invoke-super {p0}, Lzj/b;->v()Z

    move-result v0

    return v0
.end method

.method public w()Z
    .locals 2

    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    sget-object v1, Lzj/d;->h:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lzj/d;->a:Ljava/math/BigInteger;

    sget-object v1, Lzj/d;->i:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic x()Lyj/p;
    .locals 1

    invoke-virtual {p0}, Lzj/d;->U()Lyj/k;

    move-result-object v0

    return-object v0
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
