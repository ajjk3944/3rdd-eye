.class public final Lon;
.super Lft0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final i:Lon;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lon;

    .line 2
    .line 3
    sget v2, Lo01;->c:I

    .line 4
    .line 5
    sget v3, Lo01;->d:I

    .line 6
    .line 7
    sget-wide v4, Lo01;->e:J

    .line 8
    .line 9
    sget-object v6, Lo01;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Llk;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lpk;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, Lpk;-><init>(IIJLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lft0;->h:Lpk;

    .line 20
    .line 21
    sput-object v0, Lon;->i:Lon;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object v0
.end method
