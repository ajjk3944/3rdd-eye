.class public final Lw7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lw7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw7/d;

    invoke-direct {v0}, Lw7/d;-><init>()V

    sput-object v0, Lw7/d;->a:Lw7/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lu7/a;
    .locals 14

    new-instance v11, Lz7/g;

    new-instance v0, Lz7/j;

    sget-object v1, Lw7/a;->a:Lw7/a;

    invoke-virtual {v1}, Lw7/a;->a()[B

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [B

    fill-array-data v2, :array_0

    const/16 v3, 0x162e

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lz7/j;-><init>([BI[BLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v5, LB7/a;

    invoke-direct {v5}, LB7/a;-><init>()V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v7, Lz7/y;

    const/4 v0, 0x1

    invoke-direct {v7, v4, v0, v4}, Lz7/y;-><init>(Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v8, Lw7/d$a;->a:Lw7/d$a;

    const/16 v9, 0xc0

    const/4 v10, 0x0

    const-string/jumbo v1, "Mikrotik"

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v0, v11

    move-object v3, v5

    move-object v4, v6

    move-object v5, v7

    move-object v6, v8

    move v7, v12

    move-object v8, v13

    invoke-direct/range {v0 .. v10}, Lz7/g;-><init>(Ljava/lang/String;Ljava/util/List;LA7/d;Ljava/lang/Integer;Lz7/x;Lmh/l;ZLp7/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method
