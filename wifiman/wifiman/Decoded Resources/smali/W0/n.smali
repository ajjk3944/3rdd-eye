.class public interface abstract LW0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW0/n$a;,
        LW0/n$b;
    }
.end annotation


# static fields
.field public static final a:LW0/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LW0/n$a;->a:LW0/n$a;

    sput-object v0, LW0/n;->a:LW0/n$a;

    return-void
.end method


# virtual methods
.method public abstract b()F
.end method

.method public abstract c()J
.end method

.method public d(LW0/n;)LW0/n;
    .locals 3

    instance-of v0, p1, LW0/c;

    if-eqz v0, :cond_0

    instance-of v1, p0, LW0/c;

    if-eqz v1, :cond_0

    new-instance v0, LW0/c;

    move-object v1, p1

    check-cast v1, LW0/c;

    invoke-virtual {v1}, LW0/c;->a()Lm0/e1;

    move-result-object v1

    invoke-interface {p1}, LW0/n;->b()F

    move-result p1

    new-instance v2, LW0/n$c;

    invoke-direct {v2, p0}, LW0/n$c;-><init>(LW0/n;)V

    invoke-static {p1, v2}, LW0/m;->a(FLmh/a;)F

    move-result p1

    invoke-direct {v0, v1, p1}, LW0/c;-><init>(Lm0/e1;F)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    instance-of v1, p0, LW0/c;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    instance-of v0, p0, LW0/c;

    if-eqz v0, :cond_2

    move-object p1, p0

    goto :goto_0

    :cond_2
    new-instance v0, LW0/n$d;

    invoke-direct {v0, p0}, LW0/n$d;-><init>(LW0/n;)V

    invoke-interface {p1, v0}, LW0/n;->f(Lmh/a;)LW0/n;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public abstract e()Lm0/l0;
.end method

.method public f(Lmh/a;)LW0/n;
    .locals 1

    sget-object v0, LW0/n$b;->b:LW0/n$b;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LW0/n;

    :goto_0
    return-object p1
.end method
