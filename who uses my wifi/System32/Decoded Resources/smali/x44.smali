.class public final Lx44;
.super Ly44;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final i:I

.field public final j:I


# direct methods
.method public constructor <init>([BII)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ly44;-><init>([B)V

    .line 2
    .line 3
    .line 4
    add-int v0, p2, p3

    .line 5
    .line 6
    array-length p1, p1

    .line 7
    invoke-static {p2, v0, p1}, La54;->a(III)I

    .line 8
    .line 9
    .line 10
    iput p2, p0, Lx44;->i:I

    .line 11
    .line 12
    iput p3, p0, Lx44;->j:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(I)B
    .locals 1

    .line 1
    iget v0, p0, Lx44;->j:I

    .line 2
    .line 3
    invoke-static {p1, v0}, La54;->q(II)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lx44;->i:I

    .line 7
    .line 8
    add-int/2addr v0, p1

    .line 9
    iget-object p1, p0, Ly44;->h:[B

    .line 10
    .line 11
    aget-byte p1, p1, v0

    .line 12
    .line 13
    return p1
.end method

.method public final c(I)B
    .locals 2

    .line 1
    iget-object v0, p0, Ly44;->h:[B

    .line 2
    .line 3
    iget v1, p0, Lx44;->i:I

    .line 4
    .line 5
    add-int/2addr v1, p1

    .line 6
    aget-byte p1, v0, v1

    .line 7
    .line 8
    return p1
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lx44;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public final f(III[B)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly44;->h:[B

    .line 2
    .line 3
    iget v1, p0, Lx44;->i:I

    .line 4
    .line 5
    add-int/2addr v1, p1

    .line 6
    invoke-static {v0, v1, p4, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final r()I
    .locals 1

    .line 1
    iget v0, p0, Lx44;->i:I

    .line 2
    .line 3
    return v0
.end method
