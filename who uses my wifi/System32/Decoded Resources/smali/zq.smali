.class public final Lzq;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:I

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lzq;->a:I

    iput p2, p0, Lzq;->c:I

    iput p3, p0, Lzq;->b:I

    return-void
.end method

.method public synthetic constructor <init>(IIIZ)V
    .locals 0

    .line 2
    iput p1, p0, Lzq;->a:I

    iput p2, p0, Lzq;->b:I

    iput p3, p0, Lzq;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lxe4;)Lzq;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lxe4;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lzq;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-direct {p0, v0, v1, v1}, Lzq;-><init>(III)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-boolean v0, p0, Lxe4;->n:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance p0, Lzq;

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-direct {p0, v0, v1, v1}, Lzq;-><init>(III)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    iget-boolean v0, p0, Lxe4;->m:Z

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    new-instance p0, Lzq;

    .line 29
    .line 30
    invoke-direct {p0, v1, v1, v1}, Lzq;-><init>(III)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    iget v0, p0, Lxe4;->k:I

    .line 35
    .line 36
    iget p0, p0, Lxe4;->h:I

    .line 37
    .line 38
    new-instance v1, Lzq;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {v1, v2, v0, p0}, Lzq;-><init>(III)V

    .line 42
    .line 43
    .line 44
    return-object v1
.end method


# virtual methods
.method public b()Z
    .locals 2

    .line 1
    iget v0, p0, Lzq;->a:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method
