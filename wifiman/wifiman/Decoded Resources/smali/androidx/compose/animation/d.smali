.class public interface abstract Landroidx/compose/animation/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/o0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/d$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;
    .locals 2

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, LY0/n;->b:LY0/n$a;

    invoke-static {p2}, Lr/I0;->c(LY0/n$a;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->b(J)LY0/n;

    move-result-object p2

    const/4 p5, 0x3

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, v1, p2, p5, v0}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Landroidx/compose/animation/d$c;->a:Landroidx/compose/animation/d$c;

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Landroidx/compose/animation/d;->g(ILr/H;Lmh/l;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic c(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;
    .locals 2

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, LY0/n;->b:LY0/n$a;

    invoke-static {p2}, Lr/I0;->c(LY0/n$a;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->b(J)LY0/n;

    move-result-object p2

    const/4 p5, 0x3

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, v1, p2, p5, v0}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Landroidx/compose/animation/d$b;->a:Landroidx/compose/animation/d$b;

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Landroidx/compose/animation/d;->b(ILr/H;Lmh/l;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract b(ILr/H;Lmh/l;)Landroidx/compose/animation/i;
.end method

.method public abstract g(ILr/H;Lmh/l;)Landroidx/compose/animation/k;
.end method
