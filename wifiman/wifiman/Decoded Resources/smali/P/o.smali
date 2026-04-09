.class public abstract LP/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls/H;


# instance fields
.field private final a:Z

.field private final b:LP/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLT/z1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LP/o;->a:Z

    new-instance v0, LP/u;

    new-instance v1, LP/o$a;

    invoke-direct {v1, p2}, LP/o$a;-><init>(LT/z1;)V

    invoke-direct {v0, p1, v1}, LP/u;-><init>(ZLmh/a;)V

    iput-object v0, p0, LP/o;->b:LP/u;

    return-void
.end method


# virtual methods
.method public abstract e(Ly/o$b;LIi/N;)V
.end method

.method public final f(Lo0/f;FJ)V
    .locals 3

    iget-object v0, p0, LP/o;->b:LP/u;

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean p2, p0, LP/o;->a:Z

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, LP/i;->a(LY0/d;ZJ)F

    move-result p2

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, LY0/d;->d1(F)F

    move-result p2

    :goto_0
    invoke-virtual {v0, p1, p2, p3, p4}, LP/u;->b(Lo0/f;FJ)V

    return-void
.end method

.method public abstract g(Ly/o$b;)V
.end method

.method public final h(Ly/j;LIi/N;)V
    .locals 1

    iget-object v0, p0, LP/o;->b:LP/u;

    invoke-virtual {v0, p1, p2}, LP/u;->c(Ly/j;LIi/N;)V

    return-void
.end method
