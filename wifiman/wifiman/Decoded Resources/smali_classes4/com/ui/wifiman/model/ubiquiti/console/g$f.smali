.class final Lcom/ui/wifiman/model/ubiquiti/console/g$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/g;->b(Ljava/lang/String;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/console/g;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/console/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/g$f;->a:Lcom/ui/wifiman/model/ubiquiti/console/g;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/g$f;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/g;)Lgg/D;
    .locals 3

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/g$f;->a:Lcom/ui/wifiman/model/ubiquiti/console/g;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/g$f;->b:Ljava/lang/String;

    sget-object v2, LTd/a$a;->WEBRTC:LTd/a$a;

    invoke-static {v0, v1, p1, v2}, Lcom/ui/wifiman/model/ubiquiti/console/g;->f(Lcom/ui/wifiman/model/ubiquiti/console/g;Ljava/lang/String;Leb/g;LTd/a$a;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leb/g;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/g$f;->a(Leb/g;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
