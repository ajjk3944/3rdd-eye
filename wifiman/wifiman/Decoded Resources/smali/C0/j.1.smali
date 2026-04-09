.class public final LC0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/B;


# instance fields
.field private final a:LC0/n;

.field private final b:LC0/p;

.field private final c:LC0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LC0/n;LC0/p;LC0/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC0/j;->a:LC0/n;

    iput-object p2, p0, LC0/j;->b:LC0/p;

    iput-object p3, p0, LC0/j;->c:LC0/q;

    return-void
.end method


# virtual methods
.method public R(I)I
    .locals 1

    iget-object v0, p0, LC0/j;->a:LC0/n;

    invoke-interface {v0, p1}, LC0/n;->R(I)I

    move-result p1

    return p1
.end method

.method public S(I)I
    .locals 1

    iget-object v0, p0, LC0/j;->a:LC0/n;

    invoke-interface {v0, p1}, LC0/n;->S(I)I

    move-result p1

    return p1
.end method

.method public T(J)Landroidx/compose/ui/layout/t;
    .locals 3

    iget-object v0, p0, LC0/j;->c:LC0/q;

    sget-object v1, LC0/q;->Width:LC0/q;

    const/16 v2, 0x7fff

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LC0/j;->b:LC0/p;

    sget-object v1, LC0/p;->Max:LC0/p;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LC0/j;->a:LC0/n;

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v1

    invoke-interface {v0, v1}, LC0/n;->S(I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LC0/j;->a:LC0/n;

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v1

    invoke-interface {v0, v1}, LC0/n;->R(I)I

    move-result v0

    :goto_0
    invoke-static {p1, p2}, LY0/b;->g(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v2

    :cond_1
    new-instance p1, LC0/l;

    invoke-direct {p1, v0, v2}, LC0/l;-><init>(II)V

    return-object p1

    :cond_2
    iget-object v0, p0, LC0/j;->b:LC0/p;

    sget-object v1, LC0/p;->Max:LC0/p;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, LC0/j;->a:LC0/n;

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v1

    invoke-interface {v0, v1}, LC0/n;->s(I)I

    move-result v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, LC0/j;->a:LC0/n;

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v1

    invoke-interface {v0, v1}, LC0/n;->s0(I)I

    move-result v0

    :goto_1
    invoke-static {p1, p2}, LY0/b;->h(J)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v2

    :cond_4
    new-instance p1, LC0/l;

    invoke-direct {p1, v2, v0}, LC0/l;-><init>(II)V

    return-object p1
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC0/j;->a:LC0/n;

    invoke-interface {v0}, LC0/n;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public s(I)I
    .locals 1

    iget-object v0, p0, LC0/j;->a:LC0/n;

    invoke-interface {v0, p1}, LC0/n;->s(I)I

    move-result p1

    return p1
.end method

.method public s0(I)I
    .locals 1

    iget-object v0, p0, LC0/j;->a:LC0/n;

    invoke-interface {v0, p1}, LC0/n;->s0(I)I

    move-result p1

    return p1
.end method
