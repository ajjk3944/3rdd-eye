.class public final LS/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/g;

.field private static final b:LS/b;

.field private static final c:LS/e;

.field private static final d:LS/b;

.field private static final e:F

.field private static final f:F

.field private static final g:LS/e;

.field private static final h:F

.field private static final i:F

.field private static final j:LS/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS/g;

    invoke-direct {v0}, LS/g;-><init>()V

    sput-object v0, LS/g;->a:LS/g;

    sget-object v0, LS/b;->SurfaceContainerLow:LS/b;

    sput-object v0, LS/g;->b:LS/b;

    sget-object v0, LS/e;->CornerExtraLargeTop:LS/e;

    sput-object v0, LS/g;->c:LS/e;

    sget-object v0, LS/b;->OnSurfaceVariant:LS/b;

    sput-object v0, LS/g;->d:LS/b;

    const-wide/high16 v0, 0x4010000000000000L    # 4.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LS/g;->e:F

    const-wide/high16 v0, 0x4040000000000000L    # 32.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LS/g;->f:F

    sget-object v0, LS/e;->CornerNone:LS/e;

    sput-object v0, LS/g;->g:LS/e;

    sget-object v0, LS/c;->a:LS/c;

    invoke-virtual {v0}, LS/c;->b()F

    move-result v1

    sput v1, LS/g;->h:F

    invoke-virtual {v0}, LS/c;->b()F

    move-result v0

    sput v0, LS/g;->i:F

    sget-object v0, LS/b;->Secondary:LS/b;

    sput-object v0, LS/g;->j:LS/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LS/e;
    .locals 1

    sget-object v0, LS/g;->c:LS/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LS/g;->h:F

    return v0
.end method
