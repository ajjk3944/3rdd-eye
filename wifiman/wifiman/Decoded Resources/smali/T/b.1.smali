.class public abstract LT/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LYg/m;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LT/b$a;->a:LT/b$a;

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, LT/b;->a:LYg/m;

    :try_start_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v0, -0x1

    :goto_0
    sput-wide v0, LT/b;->b:J

    return-void
.end method

.method public static final a(F)LT/m0;
    .locals 1

    new-instance v0, LT/u0;

    invoke-direct {v0, p0}, LT/u0;-><init>(F)V

    return-object v0
.end method

.method public static final b(I)LT/n0;
    .locals 1

    new-instance v0, LT/v0;

    invoke-direct {v0, p0}, LT/v0;-><init>(I)V

    return-object v0
.end method

.method public static final c(J)LT/o0;
    .locals 1

    new-instance v0, LT/w0;

    invoke-direct {v0, p0, p1}, LT/w0;-><init>(J)V

    return-object v0
.end method

.method public static final d(Ljava/lang/Object;LT/n1;)Ld0/g;
    .locals 1

    new-instance v0, LT/x0;

    invoke-direct {v0, p0, p1}, LT/x0;-><init>(Ljava/lang/Object;LT/n1;)V

    return-object v0
.end method

.method public static final e()J
    .locals 2

    sget-wide v0, LT/b;->b:J

    return-wide v0
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "ComposeInternal"

    invoke-static {v0, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method
