.class final Lrd/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/d;-><init>(LZc/f;Lje/u;Lld/b;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lrd/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrd/d$c;

    invoke-direct {v0}, Lrd/d$c;-><init>()V

    sput-object v0, Lrd/d$c;->a:Lrd/d$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;Lje/r;)Lrd/d$b;
    .locals 4

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZc/e;->f()LZc/e$b;

    move-result-object v0

    sget-object v1, LZc/e$b;->CONNECTED:LZc/e$b;

    if-ne v0, v1, :cond_3

    new-instance v0, Lrd/d$b$a;

    invoke-virtual {p1}, LZc/e;->g()Lb8/c;

    move-result-object v1

    instance-of v2, p2, Lje/r$b$a;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast p2, Lje/r$b$a;

    goto :goto_0

    :cond_0
    move-object p2, v3

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lje/r$b$a;->i()Lke/c;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lke/c;->b()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v3

    :goto_1
    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LZc/e$a;->b()Linet/ipaddr/g;

    move-result-object v3

    :cond_2
    invoke-direct {v0, v1, p2, v3}, Lrd/d$b$a;-><init>(Lb8/c;Ljava/lang/String;Linet/ipaddr/g;)V

    goto :goto_2

    :cond_3
    sget-object v0, Lrd/d$b$b;->a:Lrd/d$b$b;

    :goto_2
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    check-cast p2, Lje/r;

    invoke-virtual {p0, p1, p2}, Lrd/d$c;->a(LZc/e;Lje/r;)Lrd/d$b;

    move-result-object p1

    return-object p1
.end method
