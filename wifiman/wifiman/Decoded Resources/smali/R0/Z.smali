.class public final LR0/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LR0/T;

.field private final b:LR0/L;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LR0/T;LR0/L;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/Z;->a:LR0/T;

    iput-object p2, p0, LR0/Z;->b:LR0/L;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LR0/Z;->a:LR0/T;

    invoke-virtual {v0, p0}, LR0/T;->g(LR0/Z;)V

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, LR0/Z;->a:LR0/T;

    invoke-virtual {v0}, LR0/T;->a()LR0/Z;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final c(Ll0/i;)Z
    .locals 2

    invoke-virtual {p0}, LR0/Z;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LR0/Z;->b:LR0/L;

    invoke-interface {v1, p1}, LR0/L;->h(Ll0/i;)V

    :cond_0
    return v0
.end method

.method public final d(LR0/Q;LR0/Q;)Z
    .locals 2

    invoke-virtual {p0}, LR0/Z;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LR0/Z;->b:LR0/L;

    invoke-interface {v1, p1, p2}, LR0/L;->f(LR0/Q;LR0/Q;)V

    :cond_0
    return v0
.end method

.method public final e(LR0/Q;LR0/H;LL0/M;Lmh/l;Ll0/i;Ll0/i;)Z
    .locals 8

    invoke-virtual {p0}, LR0/Z;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LR0/Z;->b:LR0/L;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, LR0/L;->e(LR0/Q;LR0/H;LL0/M;Lmh/l;Ll0/i;Ll0/i;)V

    :cond_0
    return v0
.end method
