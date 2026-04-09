.class public final LBe/N;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBe/N$a;
    }
.end annotation


# static fields
.field public static final a:LBe/N;

.field private static final b:Lz/N;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LBe/N;

    invoke-direct {v0}, LBe/N;-><init>()V

    sput-object v0, LBe/N;->a:LBe/N;

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/o;->b(FF)Lz/N;

    move-result-object v0

    sput-object v0, LBe/N;->b:Lz/N;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lz/N;
    .locals 1

    sget-object v0, LBe/N;->b:Lz/N;

    return-object v0
.end method
