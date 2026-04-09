.class final Lcom/ui/wifiman/model/wmw/j$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/j;->v(Lcom/ui/wmw/g;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/g;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/j;


# direct methods
.method constructor <init>(Lcom/ui/wmw/g;Lcom/ui/wifiman/model/wmw/j;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$j;->a:Lcom/ui/wmw/g;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/j$j;->b:Lcom/ui/wifiman/model/wmw/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/b;)Lgg/f;
    .locals 4

    const-string v0, "adoption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/b$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j$j;->a:Lcom/ui/wmw/g;

    invoke-interface {v0}, Lcom/ui/wmw/g;->c()LOf/a$a;

    move-result-object v0

    check-cast p1, Lcom/ui/wifiman/model/wmw/b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/b$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LOf/a$a;->d(Ljava/lang/String;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$j;->b:Lcom/ui/wifiman/model/wmw/j;

    invoke-static {v1}, Lcom/ui/wifiman/model/wmw/j;->o(Lcom/ui/wifiman/model/wmw/j;)Lcom/ui/wifiman/model/wmw/b$d;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/b$a;->a()Lh9/a;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/b$a;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/ui/wifiman/model/wmw/b$a$a;

    invoke-direct {v3, p1, v2}, Lcom/ui/wifiman/model/wmw/b$a$a;-><init>(Ljava/lang/String;Lh9/a;)V

    invoke-interface {v1, v3}, Lcom/ui/wifiman/model/wmw/b$d;->b(Lcom/ui/wifiman/model/wmw/b;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/b$b;

    if-eqz p1, :cond_1

    new-instance p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$NoDeviceAdopted;

    const-string v0, "There is no adoption currently set so device can\'t be bonded"

    invoke-direct {p1, v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$NoDeviceAdopted;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$j;->a(Lcom/ui/wifiman/model/wmw/b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
