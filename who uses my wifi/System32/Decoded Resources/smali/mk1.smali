.class public final Lmk1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljg1;


# instance fields
.field public final a:Ljg1;

.field public final b:Ljk1;

.field public final c:Lkz2;

.field public d:I

.field public e:I

.field public f:[B

.field public g:Lkk1;

.field public h:Lph4;

.field public i:Z


# direct methods
.method public constructor <init>(Ljg1;Ljk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmk1;->a:Ljg1;

    .line 5
    .line 6
    iput-object p2, p0, Lmk1;->b:Ljk1;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lmk1;->d:I

    .line 10
    .line 11
    iput p1, p0, Lmk1;->e:I

    .line 12
    .line 13
    sget-object p1, Lv23;->b:[B

    .line 14
    .line 15
    iput-object p1, p0, Lmk1;->f:[B

    .line 16
    .line 17
    new-instance p1, Lkz2;

    .line 18
    .line 19
    invoke-direct {p1}, Lkz2;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lmk1;->c:Lkz2;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Lkz2;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmk1;->g:Lkk1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lmk1;->a:Ljg1;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3}, Ljg1;->a(Lkz2;II)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p2}, Lmk1;->e(I)V

    .line 12
    .line 13
    .line 14
    iget-object p3, p0, Lmk1;->f:[B

    .line 15
    .line 16
    iget v0, p0, Lmk1;->e:I

    .line 17
    .line 18
    invoke-virtual {p1, p3, v0, p2}, Lkz2;->H([BII)V

    .line 19
    .line 20
    .line 21
    iget p1, p0, Lmk1;->e:I

    .line 22
    .line 23
    add-int/2addr p1, p2

    .line 24
    iput p1, p0, Lmk1;->e:I

    .line 25
    .line 26
    return-void
.end method

.method public final b(Lua4;IZ)I
    .locals 2

    .line 1
    iget-object v0, p0, Lmk1;->g:Lkk1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lmk1;->a:Ljg1;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3}, Ljg1;->b(Lua4;IZ)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p0, p2}, Lmk1;->e(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lmk1;->f:[B

    .line 16
    .line 17
    iget v1, p0, Lmk1;->e:I

    .line 18
    .line 19
    invoke-interface {p1, v0, v1, p2}, Lua4;->d([BII)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 p2, -0x1

    .line 24
    if-ne p1, p2, :cond_2

    .line 25
    .line 26
    if-eqz p3, :cond_1

    .line 27
    .line 28
    return p2

    .line 29
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_2
    iget p2, p0, Lmk1;->e:I

    .line 36
    .line 37
    add-int/2addr p2, p1

    .line 38
    iput p2, p0, Lmk1;->e:I

    .line 39
    .line 40
    return p1
.end method

.method public final c(JIIILig1;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lmk1;->g:Lkk1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lmk1;->a:Ljg1;

    .line 6
    .line 7
    move-wide v2, p1

    .line 8
    move v4, p3

    .line 9
    move v5, p4

    .line 10
    move v6, p5

    .line 11
    move-object v7, p6

    .line 12
    invoke-interface/range {v1 .. v7}, Ljg1;->c(JIIILig1;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    move-wide v2, p1

    .line 17
    move v4, p3

    .line 18
    move v5, p4

    .line 19
    move v6, p5

    .line 20
    move-object v7, p6

    .line 21
    const/4 p1, 0x0

    .line 22
    if-nez v7, :cond_1

    .line 23
    .line 24
    const/4 p2, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move p2, p1

    .line 27
    :goto_0
    const-string p3, "DRM on subtitles is not supported"

    .line 28
    .line 29
    invoke-static {p3, p2}, Lzt0;->M(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    iget p2, p0, Lmk1;->e:I

    .line 33
    .line 34
    sub-int/2addr p2, v6

    .line 35
    sub-int/2addr p2, v5

    .line 36
    :try_start_0
    iget-object p3, p0, Lmk1;->g:Lkk1;

    .line 37
    .line 38
    iget-object p4, p0, Lmk1;->f:[B

    .line 39
    .line 40
    new-instance p5, Llk1;

    .line 41
    .line 42
    invoke-direct {p5, p0, v2, v3, v4}, Llk1;-><init>(Lmk1;JI)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p3, p4, p2, v5, p5}, Lkk1;->g([BIILlk1;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catch_0
    move-exception v0

    .line 50
    move-object p3, v0

    .line 51
    iget-boolean p4, p0, Lmk1;->i:Z

    .line 52
    .line 53
    if-eqz p4, :cond_3

    .line 54
    .line 55
    const-string p4, "Parsing subtitles failed, ignoring sample."

    .line 56
    .line 57
    invoke-static {p4, p3}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    add-int/2addr p2, v5

    .line 61
    iput p2, p0, Lmk1;->d:I

    .line 62
    .line 63
    iget p3, p0, Lmk1;->e:I

    .line 64
    .line 65
    if-ne p2, p3, :cond_2

    .line 66
    .line 67
    iput p1, p0, Lmk1;->d:I

    .line 68
    .line 69
    iput p1, p0, Lmk1;->e:I

    .line 70
    .line 71
    :cond_2
    return-void

    .line 72
    :cond_3
    throw p3
.end method

.method public final d(Lph4;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lph4;->m:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lpp1;->g(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x3

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-static {v1}, Lzt0;->D(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lmk1;->h:Lph4;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lph4;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p0, Lmk1;->b:Ljk1;

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    iput-object p1, p0, Lmk1;->h:Lph4;

    .line 30
    .line 31
    invoke-interface {v2, p1}, Ljk1;->f(Lph4;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {v2, p1}, Ljk1;->k(Lph4;)Lkk1;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v1, 0x0

    .line 43
    :goto_1
    iput-object v1, p0, Lmk1;->g:Lkk1;

    .line 44
    .line 45
    :cond_2
    iget-object v1, p0, Lmk1;->g:Lkk1;

    .line 46
    .line 47
    iget-object v3, p0, Lmk1;->a:Ljg1;

    .line 48
    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    invoke-interface {v3, p1}, Ljg1;->d(Lph4;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    new-instance v1, Lgg4;

    .line 56
    .line 57
    invoke-direct {v1, p1}, Lgg4;-><init>(Lph4;)V

    .line 58
    .line 59
    .line 60
    const-string v4, "application/x-media3-cues"

    .line 61
    .line 62
    invoke-virtual {v1, v4}, Lgg4;->e(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, v1, Lgg4;->i:Ljava/lang/String;

    .line 66
    .line 67
    const-wide v4, 0x7fffffffffffffffL

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    iput-wide v4, v1, Lgg4;->q:J

    .line 73
    .line 74
    invoke-interface {v2, p1}, Ljk1;->i(Lph4;)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iput p1, v1, Lgg4;->J:I

    .line 79
    .line 80
    new-instance p1, Lph4;

    .line 81
    .line 82
    invoke-direct {p1, v1}, Lph4;-><init>(Lgg4;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v3, p1}, Ljg1;->d(Lph4;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final e(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lmk1;->f:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget v1, p0, Lmk1;->e:I

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    if-lt v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget v0, p0, Lmk1;->d:I

    .line 11
    .line 12
    sub-int/2addr v1, v0

    .line 13
    add-int v0, v1, v1

    .line 14
    .line 15
    add-int/2addr p1, v1

    .line 16
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object v0, p0, Lmk1;->f:[B

    .line 21
    .line 22
    array-length v2, v0

    .line 23
    if-gt p1, v2, :cond_1

    .line 24
    .line 25
    move-object p1, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-array p1, p1, [B

    .line 28
    .line 29
    :goto_0
    iget v2, p0, Lmk1;->d:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {v0, v2, p1, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    iput v3, p0, Lmk1;->d:I

    .line 36
    .line 37
    iput v1, p0, Lmk1;->e:I

    .line 38
    .line 39
    iput-object p1, p0, Lmk1;->f:[B

    .line 40
    .line 41
    return-void
.end method
