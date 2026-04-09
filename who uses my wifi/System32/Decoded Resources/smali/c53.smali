.class public final Lc53;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc53;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lc53;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 3

    .line 1
    new-instance v0, Ld53;

    .line 2
    .line 3
    iget-object v1, p0, Lc53;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lc53;->b:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ld53;-><init>(Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    return v0
.end method
