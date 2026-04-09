.class final Lcom/ui/wifiman/model/bluetooth/le/d$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/d;->a(Lh9/a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/le/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$k;->a:Lcom/ui/wifiman/model/bluetooth/le/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDj/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$k;->a:Lcom/ui/wifiman/model/bluetooth/le/d;

    invoke-static {p1}, Lcom/ui/wifiman/model/bluetooth/le/d;->l(Lcom/ui/wifiman/model/bluetooth/le/d;)LP7/a;

    move-result-object p1

    new-instance v0, LP7/c$c;

    invoke-direct {v0}, LP7/c$c;-><init>()V

    invoke-interface {p1, v0}, LP7/a;->b(LP7/c;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/d$k;->a(LDj/c;)V

    return-void
.end method
