.class final Lcom/ui/wifiman/model/teleport/l$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l$i;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$i$a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LWc/b;LWc/b;)LWc/b;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/teleport/l$i$a;->c(LWc/b;LWc/b;)LWc/b;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LWc/b;LWc/b;)LWc/b;
    .locals 1

    const-string v0, "previous"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LWc/b$a;

    if-eqz v0, :cond_0

    instance-of v0, p1, LWc/b$a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$i$a;->b(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;)LDj/a;
    .locals 2

    const-string v0, "connAvailable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/l$i$a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;

    invoke-interface {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;->c()Lgg/z;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/teleport/l$i$a$a;->a:Lcom/ui/wifiman/model/teleport/l$i$a$a;

    invoke-virtual {p1, v0}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "repeatWhen(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lfe/h;->e(Lgg/i;Lmh/l;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/teleport/l$i$a$b;->a:Lcom/ui/wifiman/model/teleport/l$i$a$b;

    invoke-virtual {p1, v0}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/teleport/m;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/m;-><init>()V

    invoke-virtual {p1, v0}, Lgg/i;->r1(Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, LWc/b$a$a;

    new-instance v0, Lcom/ui/wifiman/model/teleport/l$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/l$b;-><init>()V

    invoke-direct {p1, v0}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method
