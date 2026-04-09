.class final LE8/i$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/i$e;->a(Linet/ipaddr/g;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Linet/ipaddr/g;


# direct methods
.method constructor <init>(Linet/ipaddr/g;)V
    .locals 0

    iput-object p1, p0, LE8/i$e$a;->a:Linet/ipaddr/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La8/a;Ljava/util/Map;)Ll9/a;
    .locals 1

    const-string/jumbo v0, "devices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "discoveryResults"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/i$e$a;->a:Linet/ipaddr/g;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LDc/j;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, LDc/j;->u()La8/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCc/a$b;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p2}, LDc/n;->a(LDc/j;)LCc/a;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    new-instance p2, Ll9/a;

    invoke-direct {p2, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La8/a;

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, LE8/i$e$a;->a(La8/a;Ljava/util/Map;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
