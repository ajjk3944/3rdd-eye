.class final Lcom/ui/wifiman/model/bluetooth/classic/a$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/classic/a$f;->a(Lcom/ui/wifiman/model/vendor/d$a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/vendor/d$a;

.field final synthetic b:Lcom/ui/wifiman/model/bluetooth/classic/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/vendor/d$a;Lcom/ui/wifiman/model/bluetooth/classic/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a;->a:Lcom/ui/wifiman/model/vendor/d$a;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a;->b:Lcom/ui/wifiman/model/bluetooth/classic/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LDj/a;
    .locals 3

    const-string v0, "classicProxies"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a;->a:Lcom/ui/wifiman/model/vendor/d$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a;->b:Lcom/ui/wifiman/model/bluetooth/classic/a;

    new-instance v2, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$b;

    invoke-direct {v2, p1, v0, v1}, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$b;-><init>(Ljava/util/List;Lcom/ui/wifiman/model/vendor/d$a;Lcom/ui/wifiman/model/bluetooth/classic/a;)V

    invoke-static {v2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$a;->a:Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$a;

    invoke-virtual {p1, v0}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a;->a(Ljava/util/List;)LDj/a;

    move-result-object p1

    return-object p1
.end method
