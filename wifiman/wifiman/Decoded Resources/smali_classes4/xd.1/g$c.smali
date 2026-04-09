.class final Lxd/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/g;->e(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxd/g;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/result/b;


# direct methods
.method constructor <init>(Lxd/g;Lcom/ui/wifiman/model/speedtest/result/b;)V
    .locals 0

    iput-object p1, p0, Lxd/g$c;->a:Lxd/g;

    iput-object p2, p0, Lxd/g$c;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lgg/D;
    .locals 2

    const-string v0, "available"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lxd/g$c;->a:Lxd/g;

    iget-object v0, p0, Lxd/g$c;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-static {p1, v0}, Lxd/g;->b(Lxd/g;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/z;

    move-result-object p1

    new-instance v0, Lxd/g$c$a;

    iget-object v1, p0, Lxd/g$c;->a:Lxd/g;

    invoke-direct {v0, v1}, Lxd/g$c$a;-><init>(Lxd/g;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "UISP Controller speedtest report skipped because of unavailable api"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p1, Lxd/g$a$b;->a:Lxd/g$a$b;

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lxd/g$c;->a(Ljava/lang/Boolean;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
