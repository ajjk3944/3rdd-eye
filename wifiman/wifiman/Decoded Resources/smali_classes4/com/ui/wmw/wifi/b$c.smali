.class final Lcom/ui/wmw/wifi/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/wifi/b;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;LMf/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/wifi/b;

.field final synthetic b:LKf/e;


# direct methods
.method constructor <init>(Lcom/ui/wmw/wifi/b;LKf/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/wifi/b$c;->a:Lcom/ui/wmw/wifi/b;

    iput-object p2, p0, Lcom/ui/wmw/wifi/b$c;->b:LKf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/v1/b$e;)Lgg/D;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wmw/wifi/b$c;->a:Lcom/ui/wmw/wifi/b;

    invoke-static {p1}, Lcom/ui/wmw/wifi/b;->g(Lcom/ui/wmw/wifi/b;)Lcom/ui/wmw/api/v1/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wmw/api/v1/a;->l()Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/wifi/b$c$a;

    iget-object v1, p0, Lcom/ui/wmw/wifi/b$c;->a:Lcom/ui/wmw/wifi/b;

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/b$c$a;-><init>(Lcom/ui/wmw/wifi/b;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/wifi/b$c$b;

    iget-object v1, p0, Lcom/ui/wmw/wifi/b$c;->b:LKf/e;

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/b$c$b;-><init>(LKf/e;)V

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/b$e;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/wifi/b$c;->a(Lcom/ui/wmw/api/v1/b$e;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
