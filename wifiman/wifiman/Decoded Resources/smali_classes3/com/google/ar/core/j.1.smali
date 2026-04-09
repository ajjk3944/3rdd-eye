.class final enum Lcom/google/ar/core/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lcom/google/ar/core/j;

.field public static final enum b:Lcom/google/ar/core/j;

.field public static final enum c:Lcom/google/ar/core/j;

.field public static final enum d:Lcom/google/ar/core/j;

.field public static final enum e:Lcom/google/ar/core/j;

.field public static final enum f:Lcom/google/ar/core/j;

.field public static final enum g:Lcom/google/ar/core/j;

.field public static final enum h:Lcom/google/ar/core/j;

.field public static final enum i:Lcom/google/ar/core/j;

.field public static final enum j:Lcom/google/ar/core/j;

.field private static final synthetic m:[Lcom/google/ar/core/j;


# instance fields
.field final k:I

.field private final l:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/google/ar/core/j;

    const v1, 0x41520100

    const-class v2, Lcom/google/ar/core/Trackable;

    const-string v3, "BASE_TRACKABLE"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/j;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/j;->a:Lcom/google/ar/core/j;

    new-instance v1, Lcom/google/ar/core/j;

    const/4 v2, -0x1

    const/4 v3, 0x0

    const-string/jumbo v4, "UNKNOWN_TO_JAVA"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2, v3}, Lcom/google/ar/core/j;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v1, Lcom/google/ar/core/j;->b:Lcom/google/ar/core/j;

    new-instance v2, Lcom/google/ar/core/j;

    const v3, 0x41520101

    const-class v4, Lcom/google/ar/core/Plane;

    const-string/jumbo v5, "PLANE"

    const/4 v6, 0x2

    invoke-direct {v2, v5, v6, v3, v4}, Lcom/google/ar/core/j;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v2, Lcom/google/ar/core/j;->c:Lcom/google/ar/core/j;

    new-instance v3, Lcom/google/ar/core/j;

    const v4, 0x41520102

    const-class v5, Lcom/google/ar/core/Point;

    const-string/jumbo v6, "POINT"

    const/4 v7, 0x3

    invoke-direct {v3, v6, v7, v4, v5}, Lcom/google/ar/core/j;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v3, Lcom/google/ar/core/j;->d:Lcom/google/ar/core/j;

    new-instance v4, Lcom/google/ar/core/j;

    const v5, 0x41520104

    const-class v6, Lcom/google/ar/core/AugmentedImage;

    const-string v7, "AUGMENTED_IMAGE"

    const/4 v8, 0x4

    invoke-direct {v4, v7, v8, v5, v6}, Lcom/google/ar/core/j;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v4, Lcom/google/ar/core/j;->e:Lcom/google/ar/core/j;

    new-instance v5, Lcom/google/ar/core/j;

    const v6, 0x41520105

    const-class v7, Lcom/google/ar/core/AugmentedFace;

    const-string/jumbo v8, "FACE"

    const/4 v9, 0x5

    invoke-direct {v5, v8, v9, v6, v7}, Lcom/google/ar/core/j;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v5, Lcom/google/ar/core/j;->f:Lcom/google/ar/core/j;

    new-instance v6, Lcom/google/ar/core/j;

    const v7, 0x41520103

    const-class v8, Lcom/google/ar/core/StreetscapeGeometry;

    const-string/jumbo v9, "STREETSCAPE_GEOMETRY"

    const/4 v10, 0x6

    invoke-direct {v6, v9, v10, v7, v8}, Lcom/google/ar/core/j;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v6, Lcom/google/ar/core/j;->g:Lcom/google/ar/core/j;

    new-instance v7, Lcom/google/ar/core/j;

    const v8, 0x41520109

    const-class v9, Lcom/google/ar/core/Earth;

    const-string/jumbo v10, "EARTH"

    const/4 v11, 0x7

    invoke-direct {v7, v10, v11, v8, v9}, Lcom/google/ar/core/j;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v7, Lcom/google/ar/core/j;->h:Lcom/google/ar/core/j;

    new-instance v8, Lcom/google/ar/core/j;

    const v9, 0x41520111

    const-class v10, Lcom/google/ar/core/DepthPoint;

    const-string v11, "DEPTH_POINT"

    const/16 v12, 0x8

    invoke-direct {v8, v11, v12, v9, v10}, Lcom/google/ar/core/j;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v8, Lcom/google/ar/core/j;->i:Lcom/google/ar/core/j;

    new-instance v9, Lcom/google/ar/core/j;

    const v10, 0x41520112

    const-class v11, Lcom/google/ar/core/InstantPlacementPoint;

    const-string/jumbo v12, "INSTANT_PLACEMENT_POINT"

    const/16 v13, 0x9

    invoke-direct {v9, v12, v13, v10, v11}, Lcom/google/ar/core/j;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v9, Lcom/google/ar/core/j;->j:Lcom/google/ar/core/j;

    filled-new-array/range {v0 .. v9}, [Lcom/google/ar/core/j;

    move-result-object v0

    sput-object v0, Lcom/google/ar/core/j;->m:[Lcom/google/ar/core/j;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/ar/core/j;->k:I

    iput-object p4, p0, Lcom/google/ar/core/j;->l:Ljava/lang/Class;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lcom/google/ar/core/j;
    .locals 5

    invoke-static {}, Lcom/google/ar/core/j;->values()[Lcom/google/ar/core/j;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    iget-object v4, v3, Lcom/google/ar/core/j;->l:Ljava/lang/Class;

    if-eqz v4, :cond_1

    invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    return-object v3

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    sget-object p0, Lcom/google/ar/core/j;->b:Lcom/google/ar/core/j;

    return-object p0
.end method

.method public static values()[Lcom/google/ar/core/j;
    .locals 1

    sget-object v0, Lcom/google/ar/core/j;->m:[Lcom/google/ar/core/j;

    invoke-virtual {v0}, [Lcom/google/ar/core/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/ar/core/j;

    return-object v0
.end method
