.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->a()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;->c(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V

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

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;->b(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)LDj/a;
    .locals 2

    const-string v0, "manager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->a()Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$b;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$b;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V

    invoke-virtual {v0, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/i;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/i;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V

    invoke-virtual {v0, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
