.class public final LS/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/f;

.field private static final b:LE/g;

.field private static final c:LE/g;

.field private static final d:LE/g;

.field private static final e:LE/g;

.field private static final f:LE/g;

.field private static final g:LE/g;

.field private static final h:LE/g;

.field private static final i:LE/g;

.field private static final j:LE/g;

.field private static final k:Lm0/i1;

.field private static final l:LE/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LS/f;

    invoke-direct {v0}, LS/f;-><init>()V

    sput-object v0, LS/f;->a:LS/f;

    const-wide/high16 v0, 0x403c000000000000L    # 28.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v1}, LE/h;->d(F)LE/g;

    move-result-object v1

    sput-object v1, LS/f;->b:LE/g;

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const-wide/16 v2, 0x0

    double-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v1, v0, v3, v4}, LE/h;->e(FFFF)LE/g;

    move-result-object v0

    sput-object v0, LS/f;->c:LE/g;

    const-wide/high16 v0, 0x4010000000000000L    # 4.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v1}, LE/h;->d(F)LE/g;

    move-result-object v1

    sput-object v1, LS/f;->d:LE/g;

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v1, v0, v3, v4}, LE/h;->e(FFFF)LE/g;

    move-result-object v0

    sput-object v0, LS/f;->e:LE/g;

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v0

    sput-object v0, LS/f;->f:LE/g;

    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v1}, LE/h;->d(F)LE/g;

    move-result-object v1

    sput-object v1, LS/f;->g:LE/g;

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v1, v3, v4, v5}, LE/h;->e(FFFF)LE/g;

    move-result-object v1

    sput-object v1, LS/f;->h:LE/g;

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v1, v0, v3, v2}, LE/h;->e(FFFF)LE/g;

    move-result-object v0

    sput-object v0, LS/f;->i:LE/g;

    const-wide/high16 v0, 0x4028000000000000L    # 12.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v0

    sput-object v0, LS/f;->j:LE/g;

    invoke-static {}, Lm0/c1;->a()Lm0/i1;

    move-result-object v0

    sput-object v0, LS/f;->k:Lm0/i1;

    const-wide/high16 v0, 0x4020000000000000L    # 8.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v0

    sput-object v0, LS/f;->l:LE/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LE/g;
    .locals 1

    sget-object v0, LS/f;->b:LE/g;

    return-object v0
.end method

.method public final b()LE/g;
    .locals 1

    sget-object v0, LS/f;->d:LE/g;

    return-object v0
.end method

.method public final c()LE/g;
    .locals 1

    sget-object v0, LS/f;->g:LE/g;

    return-object v0
.end method

.method public final d()LE/g;
    .locals 1

    sget-object v0, LS/f;->j:LE/g;

    return-object v0
.end method

.method public final e()LE/g;
    .locals 1

    sget-object v0, LS/f;->l:LE/g;

    return-object v0
.end method
