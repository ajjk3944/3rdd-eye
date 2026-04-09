.class public final Lfg0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:Lgg0;

.field public l:Ljava/util/BitSet;


# virtual methods
.method public final k(Lcm;)V
    .locals 7

    .line 1
    new-instance v0, Lgg0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lfg0;->k:Lgg0;

    .line 7
    .line 8
    new-instance v0, Ljava/util/BitSet;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lfg0;->l:Ljava/util/BitSet;

    .line 14
    .line 15
    iget-object v0, p1, Lcm;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    move v2, v1

    .line 25
    :goto_0
    if-ge v2, v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lcm;->i()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    move v4, v1

    .line 32
    :goto_1
    const/16 v5, 0x8

    .line 33
    .line 34
    if-ge v4, v5, :cond_1

    .line 35
    .line 36
    rsub-int/lit8 v5, v4, 0x7

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    shl-int v5, v6, v5

    .line 40
    .line 41
    and-int/2addr v5, v3

    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    iget-object v5, p0, Lfg0;->l:Ljava/util/BitSet;

    .line 45
    .line 46
    mul-int/lit8 v6, v2, 0x8

    .line 47
    .line 48
    add-int/2addr v6, v4

    .line 49
    invoke-virtual {v5, v6}, Ljava/util/BitSet;->set(I)V

    .line 50
    .line 51
    .line 52
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lfg0;->k:Lgg0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lfg0;->l:Ljava/util/BitSet;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/BitSet;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_1

    .line 19
    .line 20
    iget-object v3, p0, Lfg0;->l:Ljava/util/BitSet;

    .line 21
    .line 22
    invoke-virtual {v3, v2}, Ljava/util/BitSet;->get(I)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    const-string v3, " "

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    sget-object v3, Lk31;->a:Lbs0;

    .line 34
    .line 35
    invoke-virtual {v3, v2}, Lue0;->e(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    int-to-short v2, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 5

    .line 1
    iget-object p2, p0, Lfg0;->k:Lgg0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, Lfg0;->l:Ljava/util/BitSet;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/util/BitSet;->length()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 p3, 0x0

    .line 14
    move v0, p3

    .line 15
    move v1, v0

    .line 16
    :goto_0
    if-ge v0, p2, :cond_3

    .line 17
    .line 18
    iget-object v2, p0, Lfg0;->l:Ljava/util/BitSet;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x7

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    rem-int/lit8 v2, v0, 0x8

    .line 28
    .line 29
    rsub-int/lit8 v2, v2, 0x7

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    shl-int v2, v4, v2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v2, p3

    .line 36
    :goto_1
    or-int/2addr v1, v2

    .line 37
    rem-int/lit8 v2, v0, 0x8

    .line 38
    .line 39
    if-eq v2, v3, :cond_1

    .line 40
    .line 41
    add-int/lit8 v2, p2, -0x1

    .line 42
    .line 43
    if-ne v0, v2, :cond_2

    .line 44
    .line 45
    :cond_1
    invoke-virtual {p1, v1}, Lt3;->q(I)V

    .line 46
    .line 47
    .line 48
    move v1, p3

    .line 49
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    return-void
.end method
