.class public abstract Lgq3;
.super Lgp3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# direct methods
.method public static r(Ln70;)Lgq3;
    .locals 1

    .line 1
    instance-of v0, p0, Lgq3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lgq3;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lhq3;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lhq3;-><init>(Ln70;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
