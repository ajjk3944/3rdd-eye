.class public abstract Lr/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/m;

.field private static final b:Lr/n;

.field private static final c:Lr/o;

.field private static final d:Lr/p;

.field private static final e:Lr/m;

.field private static final f:Lr/n;

.field private static final g:Lr/o;

.field private static final h:Lr/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v0}, Lr/r;->a(F)Lr/m;

    move-result-object v1

    sput-object v1, Lr/b;->a:Lr/m;

    invoke-static {v0, v0}, Lr/r;->b(FF)Lr/n;

    move-result-object v1

    sput-object v1, Lr/b;->b:Lr/n;

    invoke-static {v0, v0, v0}, Lr/r;->c(FFF)Lr/o;

    move-result-object v1

    sput-object v1, Lr/b;->c:Lr/o;

    invoke-static {v0, v0, v0, v0}, Lr/r;->d(FFFF)Lr/p;

    move-result-object v0

    sput-object v0, Lr/b;->d:Lr/p;

    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-static {v0}, Lr/r;->a(F)Lr/m;

    move-result-object v1

    sput-object v1, Lr/b;->e:Lr/m;

    invoke-static {v0, v0}, Lr/r;->b(FF)Lr/n;

    move-result-object v1

    sput-object v1, Lr/b;->f:Lr/n;

    invoke-static {v0, v0, v0}, Lr/r;->c(FFF)Lr/o;

    move-result-object v1

    sput-object v1, Lr/b;->g:Lr/o;

    invoke-static {v0, v0, v0, v0}, Lr/r;->d(FFFF)Lr/p;

    move-result-object v0

    sput-object v0, Lr/b;->h:Lr/p;

    return-void
.end method

.method public static final a(FF)Lr/a;
    .locals 8

    new-instance v7, Lr/a;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-object p0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {p0}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public static synthetic b(FFILjava/lang/Object;)Lr/a;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const p1, 0x3c23d70a    # 0.01f

    :cond_0
    invoke-static {p0, p1}, Lr/b;->a(FF)Lr/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lr/m;
    .locals 1

    sget-object v0, Lr/b;->e:Lr/m;

    return-object v0
.end method

.method public static final synthetic d()Lr/n;
    .locals 1

    sget-object v0, Lr/b;->f:Lr/n;

    return-object v0
.end method

.method public static final synthetic e()Lr/o;
    .locals 1

    sget-object v0, Lr/b;->g:Lr/o;

    return-object v0
.end method

.method public static final synthetic f()Lr/p;
    .locals 1

    sget-object v0, Lr/b;->h:Lr/p;

    return-object v0
.end method

.method public static final synthetic g()Lr/m;
    .locals 1

    sget-object v0, Lr/b;->a:Lr/m;

    return-object v0
.end method

.method public static final synthetic h()Lr/n;
    .locals 1

    sget-object v0, Lr/b;->b:Lr/n;

    return-object v0
.end method

.method public static final synthetic i()Lr/o;
    .locals 1

    sget-object v0, Lr/b;->c:Lr/o;

    return-object v0
.end method

.method public static final synthetic j()Lr/p;
    .locals 1

    sget-object v0, Lr/b;->d:Lr/p;

    return-object v0
.end method
