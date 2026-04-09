.class public final LN/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/f0;


# instance fields
.field private final b:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lz/f0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LN/p0;->b:LT/q0;

    return-void
.end method


# virtual methods
.method public a(LY0/d;LY0/t;)I
    .locals 1

    invoke-virtual {p0}, LN/p0;->e()Lz/f0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lz/f0;->a(LY0/d;LY0/t;)I

    move-result p1

    return p1
.end method

.method public b(LY0/d;)I
    .locals 1

    invoke-virtual {p0}, LN/p0;->e()Lz/f0;

    move-result-object v0

    invoke-interface {v0, p1}, Lz/f0;->b(LY0/d;)I

    move-result p1

    return p1
.end method

.method public c(LY0/d;)I
    .locals 1

    invoke-virtual {p0}, LN/p0;->e()Lz/f0;

    move-result-object v0

    invoke-interface {v0, p1}, Lz/f0;->c(LY0/d;)I

    move-result p1

    return p1
.end method

.method public d(LY0/d;LY0/t;)I
    .locals 1

    invoke-virtual {p0}, LN/p0;->e()Lz/f0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lz/f0;->d(LY0/d;LY0/t;)I

    move-result p1

    return p1
.end method

.method public final e()Lz/f0;
    .locals 1

    iget-object v0, p0, LN/p0;->b:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/f0;

    return-object v0
.end method

.method public final f(Lz/f0;)V
    .locals 1

    iget-object v0, p0, LN/p0;->b:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
