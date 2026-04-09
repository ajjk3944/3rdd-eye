.class final Lcom/ui/wifiman/model/wmw/h$y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;->b(Lcom/ui/wifiman/model/wmw/g$b;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/h;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$y;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/g$c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$y;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/wmw/h;->t(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$c;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$y;->a(Lcom/ui/wifiman/model/wmw/g$c;)V

    return-void
.end method
