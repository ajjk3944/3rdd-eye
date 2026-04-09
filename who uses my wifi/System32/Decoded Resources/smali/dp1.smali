.class public final Ldp1;
.super Lu94;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lcp1;


# virtual methods
.method public final a(Llx;Ljava/nio/ByteBuffer;JLzo1;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Llx;->s()J

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lu94;->g:Llx;

    .line 11
    .line 12
    invoke-virtual {p1}, Llx;->s()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iput-wide v0, p0, Lu94;->i:J

    .line 17
    .line 18
    invoke-virtual {p1}, Llx;->s()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    add-long/2addr v0, p3

    .line 23
    iget-object p2, p1, Llx;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p2, Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    long-to-int p3, v0

    .line 28
    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Llx;->s()J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    iput-wide p1, p0, Lu94;->j:J

    .line 36
    .line 37
    iput-object p5, p0, Lu94;->f:Lap1;

    .line 38
    .line 39
    return-void
.end method
