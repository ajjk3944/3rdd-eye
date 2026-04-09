.class public final synthetic Lcom/ui/wifiman/ui/component/network/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Lcom/ui/wifiman/ui/component/network/M;


# direct methods
.method public synthetic constructor <init>(Lmh/l;Lcom/ui/wifiman/ui/component/network/M;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/Z;->a:Lmh/l;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/Z;->b:Lcom/ui/wifiman/ui/component/network/M;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/Z;->a:Lmh/l;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/Z;->b:Lcom/ui/wifiman/ui/component/network/M;

    invoke-static {v0, v1}, Lcom/ui/wifiman/ui/component/network/X$d;->a(Lmh/l;Lcom/ui/wifiman/ui/component/network/M;)LYg/J;

    move-result-object v0

    return-object v0
.end method
