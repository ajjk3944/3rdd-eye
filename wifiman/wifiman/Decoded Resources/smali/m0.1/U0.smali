.class public interface abstract Lm0/U0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/U0$a;,
        Lm0/U0$b;
    }
.end annotation


# static fields
.field public static final a:Lm0/U0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm0/U0$a;->a:Lm0/U0$a;

    sput-object v0, Lm0/U0;->a:Lm0/U0$a;

    return-void
.end method

.method public static synthetic d(Lm0/U0;Lm0/U0;JILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p2}, Ll0/g$a;->c()J

    move-result-wide p2

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lm0/U0;->m(Lm0/U0;J)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic g(Lm0/U0;Ll0/i;Lm0/U0$b;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lm0/U0$b;->CounterClockwise:Lm0/U0$b;

    :cond_0
    invoke-interface {p0, p1, p2}, Lm0/U0;->i(Ll0/i;Lm0/U0$b;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: addRect"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic t(Lm0/U0;Ll0/k;Lm0/U0$b;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lm0/U0$b;->CounterClockwise:Lm0/U0$b;

    :cond_0
    invoke-interface {p0, p1, p2}, Lm0/U0;->p(Ll0/k;Lm0/U0$b;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: addRoundRect"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract b(FFFF)V
.end method

.method public abstract c()Z
.end method

.method public abstract close()V
.end method

.method public abstract e(FF)V
.end method

.method public abstract f(FFFFFF)V
.end method

.method public abstract getBounds()Ll0/i;
.end method

.method public abstract h(I)V
.end method

.method public abstract i(Ll0/i;Lm0/U0$b;)V
.end method

.method public abstract isEmpty()Z
.end method

.method public abstract j(FFFF)V
.end method

.method public abstract k(Lm0/U0;Lm0/U0;I)Z
.end method

.method public abstract l()I
.end method

.method public abstract m(Lm0/U0;J)V
.end method

.method public abstract n(FF)V
.end method

.method public abstract o(FFFFFF)V
.end method

.method public abstract p(Ll0/k;Lm0/U0$b;)V
.end method

.method public abstract q()V
.end method

.method public abstract r(J)V
.end method

.method public abstract s(FF)V
.end method

.method public abstract u(FF)V
.end method
