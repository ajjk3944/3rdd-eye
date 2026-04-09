.class final Lcom/ui/wifiman/model/network/hosts/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/network/hosts/a$e;->a(Lcom/ui/wifiman/model/network/hosts/a$b$a;)LDj/a;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a$e$a;->a:Lcom/ui/wifiman/model/network/hosts/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LDj/a;
    .locals 3

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a$e$a;->a:Lcom/ui/wifiman/model/network/hosts/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/network/hosts/a;->h(Lcom/ui/wifiman/model/network/hosts/a;)Ldd/a;

    move-result-object v0

    const/16 v1, 0xbb8

    const/16 v2, 0x3e8

    invoke-interface {v0, p1, v1, v2}, Ldd/a;->a(Ljava/lang/String;II)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/network/hosts/a$e$a;->a(Ljava/lang/String;)LDj/a;

    move-result-object p1

    return-object p1
.end method
