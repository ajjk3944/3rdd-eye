.class final Lcom/ui/wifiman/model/wmw/h$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;->w(Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/g$b;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/h;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/g$b;Lcom/ui/wifiman/model/wmw/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$n;->a:Lcom/ui/wifiman/model/wmw/g$b;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/h$n;->b:Lcom/ui/wifiman/model/wmw/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;)LDj/a;
    .locals 3

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$n;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wmw/g$b;->a()Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$n;->b:Lcom/ui/wifiman/model/wmw/h;

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/h$n;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-static {v1, v2}, Lcom/ui/wifiman/model/wmw/h;->k(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;)Ljava/io/File;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;->c(Lcom/ui/wifiman/model/ubiquiti/firmware/a;Ljava/io/File;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$n;->a(Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;)LDj/a;

    move-result-object p1

    return-object p1
.end method
