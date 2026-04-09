.class public final synthetic Lcom/ui/wifiman/ui/component/network/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/component/network/q$c;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/component/network/q$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/F;->a:Lcom/ui/wifiman/ui/component/network/q$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/F;->a:Lcom/ui/wifiman/ui/component/network/q$c;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->c(Lcom/ui/wifiman/ui/component/network/q$c;I)LYg/s;

    move-result-object p1

    return-object p1
.end method
