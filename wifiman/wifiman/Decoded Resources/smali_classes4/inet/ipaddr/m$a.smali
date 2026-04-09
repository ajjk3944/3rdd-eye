.class Linet/ipaddr/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Linet/ipaddr/m;->V0(Linet/ipaddr/g;Linet/ipaddr/g;Lbg/a;Linet/ipaddr/j$e;Linet/ipaddr/j$e;Linet/ipaddr/m$e;IILinet/ipaddr/j$e;)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;

.field final synthetic b:[Z

.field final synthetic c:I


# direct methods
.method constructor <init>(Ljava/util/Iterator;[ZI)V
    .locals 0

    iput-object p1, p0, Linet/ipaddr/m$a;->a:Ljava/util/Iterator;

    iput-object p2, p0, Linet/ipaddr/m$a;->b:[Z

    iput p3, p0, Linet/ipaddr/m$a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Linet/ipaddr/k;
    .locals 4

    iget-object v0, p0, Linet/ipaddr/m$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/k;

    iget-object v1, p0, Linet/ipaddr/m$a;->a:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Linet/ipaddr/m$a;->b:[Z

    iget v2, p0, Linet/ipaddr/m$a;->c:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    aput-boolean v3, v1, v2

    :cond_0
    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/m$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/m$a;->a()Linet/ipaddr/k;

    move-result-object v0

    return-object v0
.end method
