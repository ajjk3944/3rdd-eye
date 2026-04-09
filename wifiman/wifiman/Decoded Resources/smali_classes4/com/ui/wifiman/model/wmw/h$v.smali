.class final Lcom/ui/wifiman/model/wmw/h$v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;->y(Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/g$b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/g$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$v;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/g;)Lgg/D;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/ui/wmw/g;->a()Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$v$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$v;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/wmw/h$v$a;-><init>(Lcom/ui/wifiman/model/wmw/g$b;)V

    invoke-virtual {p1, v0}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/g;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$v;->a(Lcom/ui/wmw/g;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
