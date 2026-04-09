.class public final LT/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/S0;


# instance fields
.field private final a:Lmh/p;

.field private final b:LIi/N;

.field private c:LIi/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ldh/i;Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LT/c0;->a:Lmh/p;

    invoke-static {p1}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object p1

    iput-object p1, p0, LT/c0;->b:LIi/N;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    iget-object v0, p0, LT/c0;->c:LIi/y0;

    if-eqz v0, :cond_0

    new-instance v1, LT/e0;

    invoke-direct {v1}, LT/e0;-><init>()V

    invoke-interface {v0, v1}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LT/c0;->c:LIi/y0;

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, LT/c0;->c:LIi/y0;

    if-eqz v0, :cond_0

    new-instance v1, LT/e0;

    invoke-direct {v1}, LT/e0;-><init>()V

    invoke-interface {v0, v1}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LT/c0;->c:LIi/y0;

    return-void
.end method

.method public d()V
    .locals 10

    iget-object v0, p0, LT/c0;->c:LIi/y0;

    if-eqz v0, :cond_0

    const-string v1, "Old job was still running!"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, LIi/A0;->e(LIi/y0;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_0
    iget-object v4, p0, LT/c0;->b:LIi/N;

    iget-object v7, p0, LT/c0;->a:Lmh/p;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object v0

    iput-object v0, p0, LT/c0;->c:LIi/y0;

    return-void
.end method
