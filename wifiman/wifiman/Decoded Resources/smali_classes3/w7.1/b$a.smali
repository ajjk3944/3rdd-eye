.class final Lw7/b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lw7/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw7/b$a;

    invoke-direct {v0}, Lw7/b$a;-><init>()V

    sput-object v0, Lw7/b$a;->a:Lw7/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lz7/j;
    .locals 5

    new-instance v0, Lz7/j;

    sget-object v1, Lw7/a;->a:Lw7/a;

    invoke-virtual {v1}, Lw7/a;->a()[B

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [B

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    const/16 v4, 0x2711

    invoke-direct {v0, v1, v4, v2, v3}, Lz7/j;-><init>([BI[BLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    nop

    :array_0
    .array-data 1
        0x1t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lw7/b$a;->a()Lz7/j;

    move-result-object v0

    return-object v0
.end method
