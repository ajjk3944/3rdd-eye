.class final Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;-><init>(Leb/g$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)Lgg/r;
    .locals 2

    const-string v0, "responseBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c$a;

    invoke-direct {v1, p1, v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c$a;-><init>(Ljava/nio/ByteBuffer;Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)V

    invoke-static {v1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c;->a(Ljava/nio/ByteBuffer;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
