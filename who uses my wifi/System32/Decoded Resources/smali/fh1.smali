.class public final Lfh1;
.super Lf74;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final i:Lkz2;

.field public final j:Lkz2;

.field public k:I

.field public l:Z

.field public m:Z

.field public n:I


# direct methods
.method public constructor <init>(Ljg1;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0, p1}, Lf74;-><init>(ILjava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Lkz2;

    .line 6
    .line 7
    sget-object v0, Lwl2;->G:[B

    .line 8
    .line 9
    invoke-direct {p1, v0}, Lkz2;-><init>([B)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lfh1;->i:Lkz2;

    .line 13
    .line 14
    new-instance p1, Lkz2;

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    invoke-direct {p1, v0}, Lkz2;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lfh1;->j:Lkz2;

    .line 21
    .line 22
    return-void
.end method
