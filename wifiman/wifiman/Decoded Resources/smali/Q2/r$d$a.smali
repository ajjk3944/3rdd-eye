.class LQ2/r$d$a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ2/r$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ2/r$d;


# direct methods
.method constructor <init>(LQ2/r$d;)V
    .locals 0

    iput-object p1, p0, LQ2/r$d$a;->a:LQ2/r$d;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method

.method private b(Z)V
    .locals 1

    new-instance v0, LQ2/r$d$a$a;

    invoke-direct {v0, p0, p1}, LQ2/r$d$a$a;-><init>(LQ2/r$d$a;Z)V

    invoke-static {v0}, LW2/l;->u(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method a(Z)V
    .locals 2

    invoke-static {}, LW2/l;->a()V

    iget-object v0, p0, LQ2/r$d$a;->a:LQ2/r$d;

    iget-boolean v1, v0, LQ2/r$d;->a:Z

    iput-boolean p1, v0, LQ2/r$d;->a:Z

    if-eq v1, p1, :cond_0

    iget-object v0, v0, LQ2/r$d;->b:LQ2/b$a;

    invoke-interface {v0, p1}, LQ2/b$a;->a(Z)V

    :cond_0
    return-void
.end method

.method public onAvailable(Landroid/net/Network;)V
    .locals 0

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LQ2/r$d$a;->b(Z)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LQ2/r$d$a;->b(Z)V

    return-void
.end method
