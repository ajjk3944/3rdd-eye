.class public final LS/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/h;

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

    new-instance v0, LS/h;

    invoke-direct {v0}, LS/h;-><init>()V

    sput-object v0, LS/h;->a:LS/h;

    sget-object v0, LS/b;->Surface:LS/b;

    sput-object v0, LS/h;->b:LS/b;

    sget-object v0, LS/c;->a:LS/c;

    invoke-virtual {v0}, LS/c;->a()F

    move-result v0

    sput v0, LS/h;->c:F

    const-wide/high16 v0, 0x4063000000000000L    # 152.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LS/h;->d:F

    sget-object v0, LS/e;->CornerNone:LS/e;

    sput-object v0, LS/h;->e:LS/e;

    sget-object v0, LS/b;->SurfaceTint:LS/b;

    sput-object v0, LS/h;->f:LS/b;

    sget-object v0, LS/b;->OnSurface:LS/b;

    sput-object v0, LS/h;->g:LS/b;

    sget-object v1, LS/k;->HeadlineMedium:LS/k;

    sput-object v1, LS/h;->h:LS/k;

    sput-object v0, LS/h;->i:LS/b;

    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    sput v1, LS/h;->j:F

    sget-object v1, LS/b;->OnSurfaceVariant:LS/b;

    sput-object v1, LS/h;->k:LS/b;

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LS/h;->l:F

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

    sget v0, LS/h;->d:F

    return v0
.end method
