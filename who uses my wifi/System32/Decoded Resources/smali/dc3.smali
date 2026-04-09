.class public final enum Ldc3;
.super Ljava/lang/Enum;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final enum g:Ldc3;

.field public static final enum h:Ldc3;

.field public static final enum i:Ldc3;

.field public static final synthetic j:[Ldc3;


# instance fields
.field public final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ldc3;

    .line 2
    .line 3
    const-string v1, "NATIVE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "native"

    .line 7
    .line 8
    invoke-direct {v0, v2, v1, v3}, Ldc3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Ldc3;->g:Ldc3;

    .line 12
    .line 13
    new-instance v1, Ldc3;

    .line 14
    .line 15
    const-string v2, "JAVASCRIPT"

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const-string v4, "javascript"

    .line 19
    .line 20
    invoke-direct {v1, v3, v2, v4}, Ldc3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Ldc3;->h:Ldc3;

    .line 24
    .line 25
    new-instance v2, Ldc3;

    .line 26
    .line 27
    const-string v3, "NONE"

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    const-string v5, "none"

    .line 31
    .line 32
    invoke-direct {v2, v4, v3, v5}, Ldc3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Ldc3;->i:Ldc3;

    .line 36
    .line 37
    filled-new-array {v0, v1, v2}, [Ldc3;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Ldc3;->j:[Ldc3;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Ldc3;->f:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static values()[Ldc3;
    .locals 1

    .line 1
    sget-object v0, Ldc3;->j:[Ldc3;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ldc3;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldc3;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldc3;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
