.class public final LQi/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field private final a:LIi/y0;


# direct methods
.method public constructor <init>(LIi/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQi/c;->a:LIi/y0;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 3

    iget-object v0, p0, LQi/c;->a:LIi/y0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method
