.class public final synthetic Lyc/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/bluetooth/le/f;

.field public final synthetic b:Lcom/ui/wifiman/model/bluetooth/le/f$c;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/f;Lcom/ui/wifiman/model/bluetooth/le/f$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyc/k;->a:Lcom/ui/wifiman/model/bluetooth/le/f;

    iput-object p2, p0, Lyc/k;->b:Lcom/ui/wifiman/model/bluetooth/le/f$c;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, Lyc/k;->a:Lcom/ui/wifiman/model/bluetooth/le/f;

    iget-object v1, p0, Lyc/k;->b:Lcom/ui/wifiman/model/bluetooth/le/f$c;

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/bluetooth/le/f;->b(Lcom/ui/wifiman/model/bluetooth/le/f;Lcom/ui/wifiman/model/bluetooth/le/f$c;)V

    return-void
.end method
