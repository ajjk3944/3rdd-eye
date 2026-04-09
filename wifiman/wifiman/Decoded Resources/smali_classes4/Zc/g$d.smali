.class final LZc/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


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

    iput-object p1, p0, LZc/g$d;->a:LZc/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZc/g$d;->a:LZc/g;

    invoke-static {v0}, LZc/g;->a(LZc/g;)Lcom/ui/wifiman/model/support/a;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/support/a$a$d;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/support/a$a$d;-><init>(LZc/e;)V

    invoke-interface {v0, v1}, Lcom/ui/wifiman/model/support/a;->b(Lcom/ui/wifiman/model/support/a$a;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NETWORK CONNECTION UPDATE: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LZc/e;

    invoke-virtual {p0, p1}, LZc/g$d;->a(LZc/e;)V

    return-void
.end method
