.class public interface abstract Ly0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY0/d;


# direct methods
.method public static synthetic s1(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p1, Ly0/p;->Main:Ly0/p;

    :cond_0
    invoke-interface {p0, p1, p2}, Ly0/b;->A1(Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: awaitPointerEvent"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract A1(Ly0/p;Ldh/e;)Ljava/lang/Object;
.end method

.method public abstract O0(JLmh/p;Ldh/e;)Ljava/lang/Object;
.end method

.method public abstract T1(JLmh/p;Ldh/e;)Ljava/lang/Object;
.end method

.method public abstract Z()Ly0/n;
.end method

.method public abstract getViewConfiguration()Landroidx/compose/ui/platform/w1;
.end method

.method public abstract h()J
.end method

.method public abstract n1()J
.end method
