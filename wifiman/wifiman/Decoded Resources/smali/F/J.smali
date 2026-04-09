.class public final LF/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/b;


# instance fields
.field private final b:Lmh/a;

.field private final c:LT/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/J;->b:Lmh/a;

    const/4 p1, -0x1

    invoke-static {p1}, LT/f1;->a(I)LT/n0;

    move-result-object p1

    iput-object p1, p0, LF/J;->c:LT/n0;

    return-void
.end method

.method private final e(I)V
    .locals 1

    iget-object v0, p0, LF/J;->c:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method


# virtual methods
.method public a(LH/f;)V
    .locals 5

    invoke-virtual {p1}, LH/f;->c()LH/f$a;

    move-result-object v0

    invoke-interface {v0}, LH/f$a;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LH/f;->c()LH/f$a;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, LH/f$a;->c(I)J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->j(J)I

    move-result v0

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LH/f;->c()LH/f$a;

    move-result-object v0

    invoke-interface {v0, v2}, LH/f$a;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->j(J)I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, LH/f;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LH/f;->c()LH/f$a;

    move-result-object p1

    invoke-interface {p1, v2}, LH/f$a;->c(I)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result p1

    invoke-virtual {p0}, LF/J;->c()I

    move-result v0

    if-eq v0, p1, :cond_1

    iget-object v0, p0, LF/J;->b:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    invoke-direct {p0, p1}, LF/J;->e(I)V

    :cond_1
    return-void

    :cond_2
    :goto_0
    const/4 p1, -0x1

    invoke-direct {p0, p1}, LF/J;->e(I)V

    return-void
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, LF/J;->c:LT/n0;

    invoke-interface {v0}, LT/W;->e()I

    move-result v0

    return v0
.end method

.method public final d()V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, v0}, LF/J;->e(I)V

    return-void
.end method
