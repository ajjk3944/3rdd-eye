.class public final LS/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/j;

.field private static final b:LS/b;

.field private static final c:F

.field private static final d:F

.field private static final e:LS/e;

.field private static final f:LS/b;

.field private static final g:LS/k;

.field private static final h:LS/b;

.field private static final i:F

.field private static final j:LS/b;

.field private static final k:F

.field private static final l:LS/b;

.field private static final m:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS/j;

    invoke-direct {v0}, LS/j;-><init>()V

    sput-object v0, LS/j;->a:LS/j;

    sget-object v0, LS/b;->Surface:LS/b;

    sput-object v0, LS/j;->b:LS/b;

    sget-object v0, LS/c;->a:LS/c;

    invoke-virtual {v0}, LS/c;->a()F

    move-result v1

    sput v1, LS/j;->c:F

    const-wide/high16 v1, 0x4050000000000000L    # 64.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sput v1, LS/j;->d:F

    sget-object v1, LS/e;->CornerNone:LS/e;

    sput-object v1, LS/j;->e:LS/e;

    sget-object v1, LS/b;->OnSurface:LS/b;

    sput-object v1, LS/j;->f:LS/b;

    sget-object v2, LS/k;->TitleLarge:LS/k;

    sput-object v2, LS/j;->g:LS/k;

    sput-object v1, LS/j;->h:LS/b;

    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    sput v2, LS/j;->i:F

    sget-object v2, LS/b;->SurfaceContainer:LS/b;

    sput-object v2, LS/j;->j:LS/b;

    invoke-virtual {v0}, LS/c;->c()F

    move-result v0

    sput v0, LS/j;->k:F

    sget-object v0, LS/b;->OnSurfaceVariant:LS/b;

    sput-object v0, LS/j;->l:LS/b;

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v0

    sput v0, LS/j;->m:F

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

    sget v0, LS/j;->d:F

    return v0
.end method
