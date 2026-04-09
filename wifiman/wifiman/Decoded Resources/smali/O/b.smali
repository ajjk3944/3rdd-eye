.class public final LO/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO/b;

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO/b;

    invoke-direct {v0}, LO/b;-><init>()V

    sput-object v0, LO/b;->a:LO/b;

    const/16 v0, 0x50

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LO/b;->b:F

    const/16 v0, 0x38

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LO/b;->c:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    sget v0, LO/b;->b:F

    return v0
.end method

.method public final b()F
    .locals 1

    sget v0, LO/b;->c:F

    return v0
.end method
