.class public abstract LVf/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LVf/h;

.field private static final b:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v8, LVf/h;

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v0

    const/16 v1, 0x320

    const/16 v2, 0x5dc

    invoke-static {v1, v2, v0}, LVf/g;->a(IILr/E;)Lr/T;

    move-result-object v9

    sget-object v10, Lr/b0;->Restart:Lr/b0;

    const/4 v13, 0x4

    const/4 v14, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v9 .. v14}, Lr/j;->e(Lr/D;Lr/b0;JILjava/lang/Object;)Lr/N;

    move-result-object v1

    sget-object v0, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {v0}, Lm0/d0$a;->i()I

    move-result v2

    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->f()J

    move-result-wide v9

    const/16 v15, 0xe

    const/16 v16, 0x0

    const/high16 v11, 0x3e800000    # 0.25f

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v9 .. v16}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    invoke-virtual {v0}, Lm0/v0$a;->f()J

    move-result-wide v9

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static/range {v9 .. v16}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v4

    invoke-virtual {v0}, Lm0/v0$a;->f()J

    move-result-wide v9

    const/high16 v11, 0x3e800000    # 0.25f

    invoke-static/range {v9 .. v16}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v0

    filled-new-array {v3, v4, v0}, [Lm0/v0;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    filled-new-array {v0, v3, v5}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v0, 0x190

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v6

    const/4 v7, 0x0

    const/high16 v3, 0x41700000    # 15.0f

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LVf/h;-><init>(Lr/i;IFLjava/util/List;Ljava/util/List;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v8, LVf/j;->a:LVf/h;

    new-instance v0, LVf/i;

    invoke-direct {v0}, LVf/i;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LVf/j;->b:LT/H0;

    return-void
.end method

.method public static synthetic a()LVf/h;
    .locals 1

    invoke-static {}, LVf/j;->b()LVf/h;

    move-result-object v0

    return-object v0
.end method

.method private static final b()LVf/h;
    .locals 1

    sget-object v0, LVf/j;->a:LVf/h;

    return-object v0
.end method

.method public static final c()LVf/h;
    .locals 1

    sget-object v0, LVf/j;->a:LVf/h;

    return-object v0
.end method

.method public static final d()LT/H0;
    .locals 1

    sget-object v0, LVf/j;->b:LT/H0;

    return-object v0
.end method
