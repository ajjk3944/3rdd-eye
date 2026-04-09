.class public final Lw44;
.super Lyq2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public g:I

.field public final h:I

.field public final synthetic i:La54;


# direct methods
.method public constructor <init>(La54;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lyq2;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lw44;->i:La54;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lw44;->g:I

    .line 9
    .line 10
    invoke-virtual {p1}, La54;->d()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lw44;->h:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()B
    .locals 2

    .line 1
    iget v0, p0, Lw44;->g:I

    .line 2
    .line 3
    iget v1, p0, Lw44;->h:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x1

    .line 8
    .line 9
    iput v1, p0, Lw44;->g:I

    .line 10
    .line 11
    iget-object v1, p0, Lw44;->i:La54;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, La54;->c(I)B

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0

    .line 18
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lw44;->g:I

    .line 2
    .line 3
    iget v1, p0, Lw44;->h:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method
