.class final Lcom/ui/wifiman/model/teleport/l$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l;-><init>(LFd/D;LI7/a;LKd/d;LKd/b;LZc/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/l;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$p;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)LDj/a;
    .locals 2

    const-string v0, "startedIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l$p;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/l;->a(Lcom/ui/wifiman/model/teleport/l;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/l$p$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/l$p$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Lgg/i;->B(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$p;->a(Ljava/util/Set;)LDj/a;

    move-result-object p1

    return-object p1
.end method
