.class final Lcom/ui/wifiman/model/ubiquiti/console/g$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/g;->i(Ljava/lang/String;Leb/g;LTd/a$a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LTd/a$a;

.field final synthetic c:Lcom/ui/wifiman/model/ubiquiti/console/g;


# direct methods
.method constructor <init>(Ljava/lang/String;LTd/a$a;Lcom/ui/wifiman/model/ubiquiti/console/g;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/g$h;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/g$h;->b:LTd/a$a;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/console/g$h;->c:Lcom/ui/wifiman/model/ubiquiti/console/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/g$c;)LTd/a;
    .locals 7

    const-string v0, "networkDataClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LTd/d;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/g$h;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/console/g$h;->b:LTd/a$a;

    new-instance v4, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    invoke-direct {v4, p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;-><init>(Leb/g$c;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/g$h;->c:Lcom/ui/wifiman/model/ubiquiti/console/g;

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/console/g;->e(Lcom/ui/wifiman/model/ubiquiti/console/g;)Lxa/o;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LTd/d;-><init>(Ljava/lang/String;LTd/a$a;LUd/a;Lxa/o;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leb/g$c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/g$h;->a(Leb/g$c;)LTd/a;

    move-result-object p1

    return-object p1
.end method
