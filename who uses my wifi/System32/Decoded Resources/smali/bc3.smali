.class public final enum Lbc3;
.super Ljava/lang/Enum;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final enum g:Lbc3;

.field public static final enum h:Lbc3;

.field public static final enum i:Lbc3;

.field public static final enum j:Lbc3;

.field public static final synthetic k:[Lbc3;


# instance fields
.field public final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lbc3;

    .line 2
    .line 3
    const-string v1, "DEFINED_BY_JAVASCRIPT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "definedByJavaScript"

    .line 7
    .line 8
    invoke-direct {v0, v2, v1, v3}, Lbc3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lbc3;->g:Lbc3;

    .line 12
    .line 13
    new-instance v1, Lbc3;

    .line 14
    .line 15
    const-string v2, "UNSPECIFIED"

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const-string v4, "unspecified"

    .line 19
    .line 20
    invoke-direct {v1, v3, v2, v4}, Lbc3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lbc3;->h:Lbc3;

    .line 24
    .line 25
    new-instance v2, Lbc3;

    .line 26
    .line 27
    const-string v3, "LOADED"

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    const-string v5, "loaded"

    .line 31
    .line 32
    invoke-direct {v2, v4, v3, v5}, Lbc3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Lbc3;

    .line 36
    .line 37
    const-string v4, "BEGIN_TO_RENDER"

    .line 38
    .line 39
    const/4 v5, 0x3

    .line 40
    const-string v6, "beginToRender"

    .line 41
    .line 42
    invoke-direct {v3, v5, v4, v6}, Lbc3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sput-object v3, Lbc3;->i:Lbc3;

    .line 46
    .line 47
    new-instance v4, Lbc3;

    .line 48
    .line 49
    const-string v5, "ONE_PIXEL"

    .line 50
    .line 51
    const/4 v6, 0x4

    .line 52
    const-string v7, "onePixel"

    .line 53
    .line 54
    invoke-direct {v4, v6, v5, v7}, Lbc3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sput-object v4, Lbc3;->j:Lbc3;

    .line 58
    .line 59
    new-instance v5, Lbc3;

    .line 60
    .line 61
    const-string v6, "VIEWABLE"

    .line 62
    .line 63
    const/4 v7, 0x5

    .line 64
    const-string v8, "viewable"

    .line 65
    .line 66
    invoke-direct {v5, v7, v6, v8}, Lbc3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance v6, Lbc3;

    .line 70
    .line 71
    const-string v7, "AUDIBLE"

    .line 72
    .line 73
    const/4 v8, 0x6

    .line 74
    const-string v9, "audible"

    .line 75
    .line 76
    invoke-direct {v6, v8, v7, v9}, Lbc3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v7, Lbc3;

    .line 80
    .line 81
    const-string v8, "OTHER"

    .line 82
    .line 83
    const/4 v9, 0x7

    .line 84
    const-string v10, "other"

    .line 85
    .line 86
    invoke-direct {v7, v9, v8, v10}, Lbc3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    filled-new-array/range {v0 .. v7}, [Lbc3;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sput-object v0, Lbc3;->k:[Lbc3;

    .line 94
    .line 95
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lbc3;->f:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static values()[Lbc3;
    .locals 1

    .line 1
    sget-object v0, Lbc3;->k:[Lbc3;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lbc3;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lbc3;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbc3;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
