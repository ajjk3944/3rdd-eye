.class public final LF3/E;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:LF3/E;


# instance fields
.field private final a:LF3/C;

.field private final b:LF3/H;

.field private final c:LF3/F;


# direct methods
.method public constructor <init>(Landroid/content/Context;LF3/D;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LF3/F;

    invoke-direct {v0, p1}, LF3/F;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LF3/E;->c:LF3/F;

    new-instance v1, LF3/H;

    invoke-direct {v1, p1}, LF3/H;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, LF3/E;->b:LF3/H;

    new-instance p1, LF3/C;

    invoke-direct {p1, p2, v0}, LF3/C;-><init>(LF3/D;LF3/F;)V

    iput-object p1, p0, LF3/E;->a:LF3/C;

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)LF3/E;
    .locals 3

    const-class v0, LF3/E;

    monitor-enter v0

    :try_start_0
    sget-object v1, LF3/E;->d:LF3/E;

    if-nez v1, :cond_0

    new-instance v1, LF3/E;

    sget-object v2, LF3/I;->a:LF3/D;

    invoke-direct {v1, p0, v2}, LF3/E;-><init>(Landroid/content/Context;LF3/D;)V

    sput-object v1, LF3/E;->d:LF3/E;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, LF3/E;->d:LF3/E;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
