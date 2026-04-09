.class public final synthetic Lcom/ui/wifiman/ui/teleport/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LL0/d;

.field public final synthetic b:Lcom/ui/wifiman/ui/teleport/B;


# direct methods
.method public synthetic constructor <init>(LL0/d;Lcom/ui/wifiman/ui/teleport/B;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/H;->a:LL0/d;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/H;->b:Lcom/ui/wifiman/ui/teleport/B;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/H;->a:LL0/d;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/H;->b:Lcom/ui/wifiman/ui/teleport/B;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/ui/teleport/J;->a(LL0/d;Lcom/ui/wifiman/ui/teleport/B;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
