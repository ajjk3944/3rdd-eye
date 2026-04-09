.class public final Lc60;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Lu50;

.field public b:Ly50;


# virtual methods
.method public final a(Lb60;Lt50;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lt50;->a()Lu50;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lc60;->a:Lu50;

    .line 6
    .line 7
    const-string v2, "state1"

    .line 8
    .line 9
    invoke-static {v1, v2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-gez v2, :cond_0

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    :cond_0
    iput-object v1, p0, Lc60;->a:Lu50;

    .line 20
    .line 21
    iget-object v1, p0, Lc60;->b:Ly50;

    .line 22
    .line 23
    invoke-interface {v1, p1, p2}, Ly50;->a(Lb60;Lt50;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lc60;->a:Lu50;

    .line 27
    .line 28
    return-void
.end method
