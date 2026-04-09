.class public final LN/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/i0;

.field private static final b:Lz/N;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN/i0;

    invoke-direct {v0}, LN/i0;-><init>()V

    sput-object v0, LN/i0;->a:LN/i0;

    invoke-static {}, LN/j0;->g()F

    move-result v0

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/o;->b(FF)Lz/N;

    move-result-object v0

    sput-object v0, LN/i0;->b:Lz/N;

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

    sget-object v0, LN/i0;->b:Lz/N;

    return-object v0
.end method
