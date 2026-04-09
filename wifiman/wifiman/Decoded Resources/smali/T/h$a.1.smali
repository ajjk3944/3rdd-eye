.class final LT/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lmh/l;

.field private final b:Ldh/e;


# direct methods
.method public constructor <init>(Lmh/l;Ldh/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/h$a;->a:Lmh/l;

    iput-object p2, p0, LT/h$a;->b:Ldh/e;

    return-void
.end method


# virtual methods
.method public final a()Ldh/e;
    .locals 1

    iget-object v0, p0, LT/h$a;->b:Ldh/e;

    return-object v0
.end method

.method public final b(J)V
    .locals 2

    iget-object v0, p0, LT/h$a;->b:Ldh/e;

    :try_start_0
    sget-object v1, LYg/u;->b:LYg/u$a;

    iget-object v1, p0, LT/h$a;->a:Lmh/l;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v1, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object p2, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
