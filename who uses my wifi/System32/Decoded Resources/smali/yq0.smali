.class public final Lyq0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lx9;
.implements Lvi;


# instance fields
.field public final a:Li90;

.field public final b:Lba;

.field public c:Lwu0;


# direct methods
.method public constructor <init>(Li90;Lda;Lxq0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyq0;->a:Li90;

    .line 5
    .line 6
    iget-object p1, p3, Lxq0;->a:Lj4;

    .line 7
    .line 8
    invoke-interface {p1}, Lj4;->Q0()Lba;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lyq0;->b:Lba;

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Lda;->e(Lba;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lba;->a(Lx9;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static a(II)I
    .locals 2

    .line 1
    div-int v0, p0, p1

    .line 2
    .line 3
    xor-int v1, p0, p1

    .line 4
    .line 5
    if-gez v1, :cond_0

    .line 6
    .line 7
    mul-int v1, v0, p1

    .line 8
    .line 9
    if-eq v1, p0, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :cond_0
    mul-int/2addr v0, p1

    .line 14
    sub-int/2addr p0, v0

    .line 15
    return p0
.end method


# virtual methods
.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyq0;->a:Li90;

    .line 2
    .line 3
    invoke-virtual {v0}, Li90;->invalidateSelf()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method
