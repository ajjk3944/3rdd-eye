.class public final Lo7/e$b;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/e;->a()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/j;


# direct methods
.method constructor <init>(Lgg/j;)V
    .locals 0

    iput-object p1, p0, Lo7/e$b;->a:Lgg/j;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 2

    const-string/jumbo v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo7/e$b$a;

    invoke-direct {v0, p1}, Lo7/e$b$a;-><init>(Landroid/net/Network;)V

    invoke-static {v0}, Lv7/d;->b(Lmh/a;)V

    iget-object v0, p0, Lo7/e$b;->a:Lgg/j;

    new-instance v1, Lo7/a$a;

    invoke-direct {v1, p1}, Lo7/a$a;-><init>(Landroid/net/Network;)V

    invoke-interface {v0, v1}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1

    const-string/jumbo v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "networkCapabilities"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V

    new-instance v0, Lo7/e$b$b;

    invoke-direct {v0, p1, p2}, Lo7/e$b$b;-><init>(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V

    invoke-static {v0}, Lv7/d;->b(Lmh/a;)V

    return-void
.end method

.method public onUnavailable()V
    .locals 2

    sget-object v0, Lo7/e$b$c;->a:Lo7/e$b$c;

    invoke-static {v0}, Lv7/d;->b(Lmh/a;)V

    iget-object v0, p0, Lo7/e$b;->a:Lgg/j;

    sget-object v1, Lo7/a$b;->a:Lo7/a$b;

    invoke-interface {v0, v1}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method
