.class public final Led/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Led/a;


# instance fields
.field private final a:Lcom/ui/wifiman/model/support/a;

.field private final b:Lcom/ubnt/net/arp/NetlinkArpTable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ui/wifiman/model/support/a;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportFileDataCollector"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Led/b;->a:Lcom/ui/wifiman/model/support/a;

    new-instance p2, Lcom/ubnt/net/arp/NetlinkArpTable;

    invoke-direct {p2, p1}, Lcom/ubnt/net/arp/NetlinkArpTable;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Led/b;->b:Lcom/ubnt/net/arp/NetlinkArpTable;

    return-void
.end method

.method public static final synthetic a(Led/b;)Lcom/ubnt/net/arp/NetlinkArpTable;
    .locals 0

    iget-object p0, p0, Led/b;->b:Lcom/ubnt/net/arp/NetlinkArpTable;

    return-object p0
.end method

.method public static final synthetic c(Led/b;)Lcom/ui/wifiman/model/support/a;
    .locals 0

    iget-object p0, p0, Led/b;->a:Lcom/ui/wifiman/model/support/a;

    return-object p0
.end method


# virtual methods
.method public b()Lgg/z;
    .locals 2

    new-instance v0, Led/b$a;

    invoke-direct {v0, p0}, Led/b$a;-><init>(Led/b;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Led/b$b;

    invoke-direct {v1, p0}, Led/b$b;-><init>(Led/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object v0

    const-string v1, "observeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
