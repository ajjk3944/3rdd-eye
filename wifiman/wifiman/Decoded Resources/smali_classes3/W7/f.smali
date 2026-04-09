.class public abstract LW7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW7/f$a;
    }
.end annotation


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LW7/f$c;

    invoke-direct {v0, p0}, LW7/f$c;-><init>(LW7/f;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LW7/f;->a:LYg/m;

    new-instance v0, LW7/f$b;

    invoke-direct {v0, p0}, LW7/f$b;-><init>(LW7/f;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LW7/f;->b:LYg/m;

    return-void
.end method


# virtual methods
.method public a(LW7/f;)I
    .locals 1

    const-string/jumbo v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LW7/f;->b()I

    move-result v0

    invoke-virtual {p1}, LW7/f;->b()I

    move-result p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->k(II)I

    move-result p1

    return p1
.end method

.method public abstract b()I
.end method

.method public abstract c()I
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LW7/f;

    invoke-virtual {p0, p1}, LW7/f;->a(LW7/f;)I

    move-result p1

    return p1
.end method

.method public abstract d()I
.end method

.method public final g()F
    .locals 1

    iget-object v0, p0, LW7/f;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public abstract h()LW7/f$a;
.end method

.method public abstract hashCode()I
.end method
