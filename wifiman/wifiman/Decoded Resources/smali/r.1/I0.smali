.class public abstract Lr/I0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ll0/i;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Ll0/i;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-direct {v0, v1, v1, v1, v1}, Ll0/i;-><init>(FFFF)V

    sput-object v0, Lr/I0;->a:Ll0/i;

    sget-object v0, Lkotlin/jvm/internal/r;->a:Lkotlin/jvm/internal/r;

    invoke-static {v0}, Lr/u0;->g(Lkotlin/jvm/internal/r;)Lr/s0;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    sget-object v0, LY0/r;->b:LY0/r$a;

    invoke-static {v0}, Lr/u0;->e(LY0/r$a;)Lr/s0;

    move-result-object v0

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v4

    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-static {v0}, Lr/u0;->d(LY0/n$a;)Lr/s0;

    move-result-object v0

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v5

    sget-object v0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v0}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v0

    const v1, 0x3c23d70a    # 0.01f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v6

    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-static {v0}, Lr/u0;->i(Ll0/i$a;)Lr/s0;

    move-result-object v0

    invoke-static {v0, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v7

    sget-object v0, Ll0/m;->b:Ll0/m$a;

    invoke-static {v0}, Lr/u0;->j(Ll0/m$a;)Lr/s0;

    move-result-object v0

    invoke-static {v0, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v8

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-static {v0}, Lr/u0;->h(Ll0/g$a;)Lr/s0;

    move-result-object v0

    invoke-static {v0, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v9

    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-static {v0}, Lr/u0;->b(LY0/h$a;)Lr/s0;

    move-result-object v0

    const v1, 0x3dcccccd    # 0.1f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v10

    sget-object v0, LY0/j;->b:LY0/j$a;

    invoke-static {v0}, Lr/u0;->c(LY0/j$a;)Lr/s0;

    move-result-object v0

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v11

    filled-new-array/range {v3 .. v11}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lr/I0;->b:Ljava/util/Map;

    return-void
.end method

.method public static final a(LY0/h$a;)F
    .locals 0

    const p0, 0x3dcccccd    # 0.1f

    invoke-static {p0}, LY0/h;->j(F)F

    move-result p0

    return p0
.end method

.method public static final b(Lkotlin/jvm/internal/r;)I
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static final c(LY0/n$a;)J
    .locals 2

    const/4 p0, 0x1

    invoke-static {p0, p0}, LY0/o;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final d(LY0/r$a;)J
    .locals 2

    const/4 p0, 0x1

    invoke-static {p0, p0}, LY0/s;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final e(Ll0/g$a;)J
    .locals 2

    const/high16 p0, 0x3f000000    # 0.5f

    invoke-static {p0, p0}, Ll0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final f(Ll0/m$a;)J
    .locals 2

    const/high16 p0, 0x3f000000    # 0.5f

    invoke-static {p0, p0}, Ll0/n;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final g(Ll0/i$a;)Ll0/i;
    .locals 0

    sget-object p0, Lr/I0;->a:Ll0/i;

    return-object p0
.end method

.method public static final h()Ljava/util/Map;
    .locals 1

    sget-object v0, Lr/I0;->b:Ljava/util/Map;

    return-object v0
.end method
