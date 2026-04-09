.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->c(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

.field final synthetic b:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m;->c(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V

    return-void
.end method

.method private static final c(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V
    .locals 0

    invoke-virtual {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->c()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m;->b(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)Lgg/f;
    .locals 4

    const-string v0, "manager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->a()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    iget-object v3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    invoke-direct {v1, v2, v3}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$a;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$b;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$b;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/l;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/l;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V

    invoke-virtual {v0, v1}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
