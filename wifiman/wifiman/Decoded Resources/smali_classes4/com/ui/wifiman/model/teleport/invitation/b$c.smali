.class final Lcom/ui/wifiman/model/teleport/invitation/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/b;->a()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/invitation/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/invitation/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$c;->a:Lcom/ui/wifiman/model/teleport/invitation/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/net/Uri;)Lgg/D;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/b$c;->a:Lcom/ui/wifiman/model/teleport/invitation/b;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/model/teleport/invitation/b;->b(Landroid/net/Uri;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/b$c;->a(Landroid/net/Uri;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
