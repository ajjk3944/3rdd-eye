.class public abstract LB/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9c4

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LB/g;->a:F

    const/16 v0, 0x5dc

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LB/g;->b:F

    const/16 v0, 0x32

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LB/g;->c:F

    return-void
.end method

.method public static final synthetic a()F
    .locals 1

    sget v0, LB/g;->b:F

    return v0
.end method

.method public static final synthetic b()F
    .locals 1

    sget v0, LB/g;->c:F

    return v0
.end method

.method public static final synthetic c()F
    .locals 1

    sget v0, LB/g;->a:F

    return v0
.end method

.method public static final d(LB/h;IIILY0/d;Ldh/e;)Ljava/lang/Object;
    .locals 8

    new-instance v7, LB/g$a;

    const/4 v6, 0x0

    move-object v0, v7

    move v1, p1

    move-object v2, p4

    move-object v3, p0

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v6}, LB/g$a;-><init>(ILY0/d;LB/h;IILdh/e;)V

    invoke-interface {p0, v7, p5}, LB/h;->d(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final e(LB/h;I)Z
    .locals 2

    invoke-interface {p0}, LB/h;->g()I

    move-result v0

    invoke-interface {p0}, LB/h;->c()I

    move-result p0

    const/4 v1, 0x0

    if-gt p1, p0, :cond_0

    if-gt v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method
