.class public final Lj0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY0/d;


# instance fields
.field private a:Lj0/b;

.field private b:Lj0/h;

.field private c:Lo0/c;

.field private d:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lj0/i;->a:Lj0/i;

    iput-object v0, p0, Lj0/d;->a:Lj0/b;

    return-void
.end method


# virtual methods
.method public final b()Lj0/h;
    .locals 1

    iget-object v0, p0, Lj0/d;->b:Lj0/h;

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lj0/d;->a:Lj0/b;

    invoke-interface {v0}, Lj0/b;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Lj0/d;->a:Lj0/b;

    invoke-interface {v0}, Lj0/b;->getDensity()LY0/d;

    move-result-object v0

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    return v0
.end method

.method public final getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, Lj0/d;->a:Lj0/b;

    invoke-interface {v0}, Lj0/b;->getLayoutDirection()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method public final p(Lmh/l;)Lj0/h;
    .locals 1

    new-instance v0, Lj0/h;

    invoke-direct {v0, p1}, Lj0/h;-><init>(Lmh/l;)V

    iput-object v0, p0, Lj0/d;->b:Lj0/h;

    return-object v0
.end method

.method public final q(Lj0/b;)V
    .locals 0

    iput-object p1, p0, Lj0/d;->a:Lj0/b;

    return-void
.end method

.method public final r(Lo0/c;)V
    .locals 0

    iput-object p1, p0, Lj0/d;->c:Lo0/c;

    return-void
.end method

.method public final s(Lj0/h;)V
    .locals 0

    iput-object p1, p0, Lj0/d;->b:Lj0/h;

    return-void
.end method

.method public final v(Lmh/a;)V
    .locals 0

    iput-object p1, p0, Lj0/d;->d:Lmh/a;

    return-void
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, Lj0/d;->a:Lj0/b;

    invoke-interface {v0}, Lj0/b;->getDensity()LY0/d;

    move-result-object v0

    invoke-interface {v0}, LY0/l;->y()F

    move-result v0

    return v0
.end method
