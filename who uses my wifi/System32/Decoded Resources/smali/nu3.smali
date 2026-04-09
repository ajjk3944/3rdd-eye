.class public Lnu3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:[J

.field public final b:[J

.field public final c:[J


# direct methods
.method public constructor <init>()V
    .locals 3

    sget-object v0, Lou1;->r:Lnu3;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v1, v0, Lnu3;->a:[J

    const/16 v2, 0xa

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    iput-object v1, p0, Lnu3;->a:[J

    iget-object v1, v0, Lnu3;->b:[J

    .line 3
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    iput-object v1, p0, Lnu3;->b:[J

    iget-object v0, v0, Lnu3;->c:[J

    .line 4
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Lnu3;->c:[J

    return-void
.end method

.method public constructor <init>([J[J[J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnu3;->a:[J

    iput-object p2, p0, Lnu3;->b:[J

    iput-object p3, p0, Lnu3;->c:[J

    return-void
.end method


# virtual methods
.method public a([J[J)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0xa

    .line 3
    .line 4
    invoke-static {p2, v0, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final b(Lnu3;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnu3;->a:[J

    .line 2
    .line 3
    iget-object v1, p1, Lnu3;->a:[J

    .line 4
    .line 5
    invoke-static {v0, v1, p2}, Li30;->c0([J[JI)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lnu3;->b:[J

    .line 9
    .line 10
    iget-object v1, p1, Lnu3;->b:[J

    .line 11
    .line 12
    invoke-static {v0, v1, p2}, Li30;->c0([J[JI)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lnu3;->c:[J

    .line 16
    .line 17
    iget-object p1, p1, Lnu3;->c:[J

    .line 18
    .line 19
    invoke-static {v0, p1, p2}, Li30;->c0([J[JI)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
