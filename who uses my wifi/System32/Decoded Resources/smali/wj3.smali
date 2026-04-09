.class public final Lwj3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Luj3;


# instance fields
.field public final a:Lgk3;

.field public final b:J


# direct methods
.method public constructor <init>(Lgk3;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwj3;->a:Lgk3;

    .line 5
    .line 6
    iput-wide p2, p0, Lwj3;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljh3;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {}, Ljh3;->E()Ljh3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lp54;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    iget-object p1, p0, Lwj3;->a:Lgk3;

    .line 17
    .line 18
    const/16 v0, 0x4eec

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lgk3;->b(I)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public final b(Ljh3;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lwj3;->a:Lgk3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    invoke-static {}, Ljh3;->E()Ljh3;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {p1, v2}, Lp54;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {p1}, Ljh3;->B()Ldv1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ldv1;->B()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    sub-long/2addr v2, v4

    .line 30
    iget-wide v4, p0, Lwj3;->b:J

    .line 31
    .line 32
    cmp-long p1, v2, v4

    .line 33
    .line 34
    if-gtz p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x0

    .line 38
    :goto_0
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/16 p1, 0x4eeb

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lgk3;->b(I)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return v1

    .line 46
    :cond_3
    :goto_1
    const/16 p1, 0x4eea

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lgk3;->b(I)V

    .line 49
    .line 50
    .line 51
    return v1
.end method
