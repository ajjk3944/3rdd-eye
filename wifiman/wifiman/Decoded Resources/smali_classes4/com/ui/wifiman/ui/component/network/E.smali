.class public final synthetic Lcom/ui/wifiman/ui/component/network/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/component/network/q$c;

.field public final synthetic b:Lmh/s;

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/E;->a:Lcom/ui/wifiman/ui/component/network/q$c;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/E;->b:Lmh/s;

    iput p3, p0, Lcom/ui/wifiman/ui/component/network/E;->c:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/E;->a:Lcom/ui/wifiman/ui/component/network/q$c;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/E;->b:Lmh/s;

    iget v2, p0, Lcom/ui/wifiman/ui/component/network/E;->c:F

    check-cast p1, LA/y;

    invoke-static {v0, v1, v2, p1}, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->b(Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;FLA/y;)LYg/J;

    move-result-object p1

    return-object p1
.end method
