.class public final synthetic Lcom/ui/wifiman/model/teleport/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/teleport/b;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/teleport/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/e;->a:Lcom/ui/wifiman/model/teleport/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/e;->a:Lcom/ui/wifiman/model/teleport/b;

    check-cast p1, Lcom/ui/wifiman/model/teleport/n;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/teleport/b$k$b;->b(Lcom/ui/wifiman/model/teleport/b;Lcom/ui/wifiman/model/teleport/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
