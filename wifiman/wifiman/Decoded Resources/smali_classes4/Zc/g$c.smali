.class final LZc/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZc/g;-><init>(Landroid/net/ConnectivityManager;Ltc/a;Lcom/ui/wifiman/model/support/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LZc/g;


# direct methods
.method constructor <init>(LZc/g;)V
    .locals 0

    iput-object p1, p0, LZc/g$c;->a:LZc/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LZc/e;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LZc/g$c;->a:LZc/g;

    invoke-virtual {p1}, LZc/g;->e()Landroid/net/ConnectivityManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    invoke-static {p1, v0}, LZc/g;->b(LZc/g;Landroid/net/Network;)LZc/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LZc/g$c;->a(Ljava/lang/Object;)LZc/e;

    move-result-object p1

    return-object p1
.end method
