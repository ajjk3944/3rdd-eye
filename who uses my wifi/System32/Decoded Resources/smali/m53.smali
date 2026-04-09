.class public final Lm53;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Lm73;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    iput-boolean p1, p0, Lm53;->a:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 3

    .line 1
    new-instance v0, Lc33;

    .line 2
    .line 3
    iget-boolean v1, p0, Lm53;->a:Z

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v2, v1}, Lc33;-><init>(IZ)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    return v0
.end method
