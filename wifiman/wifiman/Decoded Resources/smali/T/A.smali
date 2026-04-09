.class public final LT/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/S0;


# instance fields
.field private final a:LIi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LIi/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/A;->a:LIi/N;

    return-void
.end method


# virtual methods
.method public final a()LIi/N;
    .locals 1

    iget-object v0, p0, LT/A;->a:LIi/N;

    return-object v0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, LT/A;->a:LIi/N;

    new-instance v1, LT/e0;

    invoke-direct {v1}, LT/e0;-><init>()V

    invoke-static {v0, v1}, LIi/O;->d(LIi/N;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, LT/A;->a:LIi/N;

    new-instance v1, LT/e0;

    invoke-direct {v1}, LT/e0;-><init>()V

    invoke-static {v0, v1}, LIi/O;->d(LIi/N;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method
