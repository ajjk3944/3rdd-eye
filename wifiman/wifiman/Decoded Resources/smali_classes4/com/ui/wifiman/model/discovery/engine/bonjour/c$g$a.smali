.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$i;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$i;-><init>()V

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 11

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$a;-><init>()V

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$b;

    invoke-direct {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$b;-><init>()V

    new-instance v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$c;

    invoke-direct {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$c;-><init>()V

    new-instance v3, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$r;

    invoke-direct {v3}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$r;-><init>()V

    new-instance v4, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$m;

    invoke-direct {v4}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$m;-><init>()V

    new-instance v5, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$b;

    invoke-direct {v5}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$b;-><init>()V

    new-instance v6, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$f;

    invoke-direct {v6}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$f;-><init>()V

    new-instance v7, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$d;

    invoke-direct {v7}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$d;-><init>()V

    new-instance v8, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$k;

    invoke-direct {v8}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$k;-><init>()V

    const/16 v9, 0x9

    new-array v9, v9, [Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;

    const/4 v10, 0x0

    aput-object v0, v9, v10

    const/4 v0, 0x1

    aput-object v1, v9, v0

    const/4 v0, 0x2

    aput-object v2, v9, v0

    const/4 v0, 0x3

    aput-object v3, v9, v0

    const/4 v0, 0x4

    aput-object v4, v9, v0

    const/4 v0, 0x5

    aput-object v5, v9, v0

    const/4 v0, 0x6

    aput-object v6, v9, v0

    const/4 v0, 0x7

    aput-object v7, v9, v0

    const/16 v0, 0x8

    aput-object v8, v9, v0

    invoke-static {v9}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
