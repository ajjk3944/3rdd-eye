.class public final Lv/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lv/h;

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:Lf0/c$c;

.field private static final h:I

.field private static final i:F

.field private static final j:F

.field private static final k:F

.field private static final l:J

.field private static final m:LQ0/A;

.field private static final n:J

.field private static final o:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv/h;

    invoke-direct {v0}, Lv/h;-><init>()V

    sput-object v0, Lv/h;->a:Lv/h;

    const/16 v0, 0x70

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lv/h;->b:F

    const/16 v0, 0x118

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lv/h;->c:F

    const/16 v0, 0x30

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lv/h;->d:F

    const/4 v0, 0x3

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lv/h;->e:F

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lv/h;->f:F

    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v0

    sput-object v0, Lv/h;->g:Lf0/c$c;

    sget-object v0, LW0/j;->b:LW0/j$a;

    invoke-virtual {v0}, LW0/j$a;->f()I

    move-result v0

    sput v0, Lv/h;->h:I

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lv/h;->i:F

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lv/h;->j:F

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lv/h;->k:F

    const/16 v0, 0xe

    invoke-static {v0}, LY0/w;->g(I)J

    move-result-wide v0

    sput-wide v0, Lv/h;->l:J

    sget-object v0, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v0}, LQ0/A$a;->d()LQ0/A;

    move-result-object v0

    sput-object v0, Lv/h;->m:LQ0/A;

    const/16 v0, 0x14

    invoke-static {v0}, LY0/w;->g(I)J

    move-result-wide v0

    sput-wide v0, Lv/h;->n:J

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0}, LY0/w;->f(F)J

    move-result-wide v0

    sput-wide v0, Lv/h;->o:J

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

    sget v0, Lv/h;->c:F

    return v0
.end method

.method public final b()F
    .locals 1

    sget v0, Lv/h;->b:F

    return v0
.end method

.method public final c()F
    .locals 1

    sget v0, Lv/h;->f:F

    return v0
.end method

.method public final d()F
    .locals 1

    sget v0, Lv/h;->i:F

    return v0
.end method

.method public final e()F
    .locals 1

    sget v0, Lv/h;->k:F

    return v0
.end method

.method public final f()Lf0/c$c;
    .locals 1

    sget-object v0, Lv/h;->g:Lf0/c$c;

    return-object v0
.end method

.method public final g()F
    .locals 1

    sget v0, Lv/h;->d:F

    return v0
.end method

.method public final h()F
    .locals 1

    sget v0, Lv/h;->e:F

    return v0
.end method

.method public final i()F
    .locals 1

    sget v0, Lv/h;->j:F

    return v0
.end method

.method public final j(J)LL0/U;
    .locals 33

    move-wide/from16 v1, p1

    sget v20, Lv/h;->h:I

    sget-wide v3, Lv/h;->l:J

    sget-object v5, Lv/h;->m:LQ0/A;

    sget-wide v22, Lv/h;->n:J

    sget-wide v10, Lv/h;->o:J

    new-instance v32, LL0/U;

    move-object/from16 v0, v32

    const v30, 0xfd7f78

    const/16 v31, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v0 .. v31}, LL0/U;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v32
.end method
