.class final LUc/i$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUc/i;-><init>(Landroid/net/wifi/WifiManager;Lcom/ui/wifiman/model/vendor/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LUc/i;


# direct methods
.method constructor <init>(LUc/i;)V
    .locals 0

    iput-object p1, p0, LUc/i$o;->a:LUc/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LUc/i$c;)LDj/a;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUc/i$o;->a:LUc/i;

    const-wide/16 v1, 0x2710

    invoke-static {v0, p1, v1, v2}, LUc/i;->f(LUc/i;LUc/i$c;J)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LUc/i$c;

    invoke-virtual {p0, p1}, LUc/i$o;->a(LUc/i$c;)LDj/a;

    move-result-object p1

    return-object p1
.end method
