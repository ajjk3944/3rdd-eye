.class public final LUd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

.field final synthetic b:LY6/h;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;LY6/h;)V
    .locals 0

    iput-object p1, p0, LUd/b;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    iput-object p2, p0, LUd/b;->b:LY6/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)Ljava/lang/Object;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUd/b;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    iget-object v1, p0, LUd/b;->b:LY6/h;

    invoke-static {v0, p1, v1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->f(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;[BLY6/h;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, LUd/b;->a([B)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
