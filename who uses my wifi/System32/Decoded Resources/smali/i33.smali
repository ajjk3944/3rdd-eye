.class public final Li33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final a:Lpq3;

.field public final b:Ll83;

.field public final c:I


# direct methods
.method public constructor <init>(Lpq3;Ll83;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li33;->a:Lpq3;

    .line 5
    .line 6
    iput-object p2, p0, Li33;->b:Ll83;

    .line 7
    .line 8
    iput p3, p0, Li33;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 2

    .line 1
    new-instance v0, Lxs1;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Li33;->a:Lpq3;

    .line 9
    .line 10
    check-cast v1, Lld2;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    return v0
.end method
