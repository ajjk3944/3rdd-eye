.class public abstract LQ/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;

.field private static final b:LT/H0;

.field private static final c:LQ/p;

.field private static final d:LQ/p;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    sget-object v0, LQ/o$b;->a:LQ/o$b;

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LQ/o;->a:LT/H0;

    sget-object v0, LQ/o$a;->a:LQ/o$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LT/w;->d(LT/n1;Lmh/a;ILjava/lang/Object;)LT/H0;

    move-result-object v0

    sput-object v0, LQ/o;->b:LT/H0;

    new-instance v0, LQ/p;

    sget-object v7, LY0/h;->b:LY0/h$a;

    invoke-virtual {v7}, LY0/h$a;->c()F

    move-result v3

    sget-object v8, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v8}, Lm0/v0$a;->e()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v2, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LQ/p;-><init>(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQ/o;->c:LQ/p;

    new-instance v0, LQ/p;

    invoke-virtual {v7}, LY0/h$a;->c()F

    move-result v11

    invoke-virtual {v8}, Lm0/v0$a;->e()J

    move-result-wide v12

    const/4 v14, 0x0

    const/4 v10, 0x0

    move-object v9, v0

    invoke-direct/range {v9 .. v14}, LQ/p;-><init>(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQ/o;->d:LQ/p;

    return-void
.end method

.method public static final a()LT/H0;
    .locals 1

    sget-object v0, LQ/o;->b:LT/H0;

    return-object v0
.end method

.method public static final b(ZFJ)Ls/I;
    .locals 7

    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-virtual {v0}, LY0/h$a;->c()F

    move-result v0

    invoke-static {p1, v0}, LY0/h;->n(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->e()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    sget-object p0, LQ/o;->c:LQ/p;

    return-object p0

    :cond_0
    sget-object p0, LQ/o;->d:LQ/p;

    goto :goto_0

    :cond_1
    new-instance v6, LQ/p;

    const/4 v5, 0x0

    move-object v0, v6

    move v1, p0

    move v2, p1

    move-wide v3, p2

    invoke-direct/range {v0 .. v5}, LQ/p;-><init>(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p0, v6

    :goto_0
    return-object p0
.end method

.method public static synthetic c(ZFJILjava/lang/Object;)Ls/I;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p0, 0x1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, LY0/h;->b:LY0/h$a;

    invoke-virtual {p1}, LY0/h$a;->c()F

    move-result p1

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p2}, Lm0/v0$a;->e()J

    move-result-wide p2

    :cond_2
    invoke-static {p0, p1, p2, p3}, LQ/o;->b(ZFJ)Ls/I;

    move-result-object p0

    return-object p0
.end method
