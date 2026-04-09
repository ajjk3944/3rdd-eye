.class public final Lpj1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final d:Lsq0;

.field public static final e:Lsq0;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:I

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyk3;

    .line 2
    .line 3
    const/16 v1, 0x3a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyk3;-><init>(C)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lsq0;->p(Lyk3;)Lsq0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lpj1;->d:Lsq0;

    .line 13
    .line 14
    new-instance v0, Lyk3;

    .line 15
    .line 16
    const/16 v1, 0x2a

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lyk3;-><init>(C)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lsq0;->p(Lyk3;)Lsq0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lpj1;->e:Lsq0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lpj1;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lpj1;->b:I

    .line 13
    .line 14
    return-void
.end method
