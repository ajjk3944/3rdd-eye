.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->b(Ljava/lang/String;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d;->c(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V

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

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d;->b(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)LDj/a;
    .locals 4

    const-string v0, "manager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->a()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    iget-object v3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d;->b:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$a;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$b;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$b;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V

    invoke-virtual {v0, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/f;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/f;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V

    invoke-virtual {v0, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
