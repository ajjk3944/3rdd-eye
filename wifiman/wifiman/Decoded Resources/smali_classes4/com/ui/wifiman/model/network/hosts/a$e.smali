.class final Lcom/ui/wifiman/model/network/hosts/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/network/hosts/a;-><init>(LRb/a;Ldd/a;LZc/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/network/hosts/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/network/hosts/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a$e;->a:Lcom/ui/wifiman/model/network/hosts/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/network/hosts/a$b$a;)LDj/a;
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a$e;->a:Lcom/ui/wifiman/model/network/hosts/a;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/network/hosts/a;->j(Lcom/ui/wifiman/model/network/hosts/a;Lcom/ui/wifiman/model/network/hosts/a$b$a;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/network/hosts/a$e$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/network/hosts/a$e;->a:Lcom/ui/wifiman/model/network/hosts/a;

    invoke-direct {v1, v2}, Lcom/ui/wifiman/model/network/hosts/a$e$a;-><init>(Lcom/ui/wifiman/model/network/hosts/a;)V

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/network/hosts/a$e;->a:Lcom/ui/wifiman/model/network/hosts/a;

    invoke-static {v1}, Lcom/ui/wifiman/model/network/hosts/a;->i(Lcom/ui/wifiman/model/network/hosts/a;)Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/network/hosts/a$e$b;

    invoke-direct {v2, p1}, Lcom/ui/wifiman/model/network/hosts/a$e$b;-><init>(Lcom/ui/wifiman/model/network/hosts/a$b$a;)V

    invoke-virtual {v1, v2}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->Q1(LDj/a;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/network/hosts/a$e$c;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/network/hosts/a$e$c;-><init>(Lcom/ui/wifiman/model/network/hosts/a$b$a;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/network/hosts/a$b$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/network/hosts/a$e;->a(Lcom/ui/wifiman/model/network/hosts/a$b$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
