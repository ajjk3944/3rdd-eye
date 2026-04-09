.class public final LS/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/i;

.field private static final b:LS/b;

.field private static final c:F

.field private static final d:F

.field private static final e:LS/e;

.field private static final f:LS/b;

.field private static final g:LS/b;

.field private static final h:LS/k;

.field private static final i:LS/b;

.field private static final j:F

.field private static final k:LS/b;

.field private static final l:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS/i;

    invoke-direct {v0}, LS/i;-><init>()V

    sput-object v0, LS/i;->a:LS/i;

    sget-object v0, LS/b;->Surface:LS/b;

    sput-object v0, LS/i;->b:LS/b;

    sget-object v0, LS/c;->a:LS/c;

    invoke-virtual {v0}, LS/c;->a()F

    move-result v0

    sput v0, LS/i;->c:F

    const-wide/high16 v0, 0x405c000000000000L    # 112.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LS/i;->d:F

    sget-object v0, LS/e;->CornerNone:LS/e;

    sput-object v0, LS/i;->e:LS/e;

    sget-object v0, LS/b;->SurfaceTint:LS/b;

    sput-object v0, LS/i;->f:LS/b;

    sget-object v0, LS/b;->OnSurface:LS/b;

    sput-object v0, LS/i;->g:LS/b;

    sget-object v1, LS/k;->HeadlineSmall:LS/k;

    sput-object v1, LS/i;->h:LS/k;

    sput-object v0, LS/i;->i:LS/b;

    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    sput v1, LS/i;->j:F

    sget-object v1, LS/b;->OnSurfaceVariant:LS/b;

    sput-object v1, LS/i;->k:LS/b;

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LS/i;->l:F

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

    sget v0, LS/i;->d:F

    return v0
.end method
