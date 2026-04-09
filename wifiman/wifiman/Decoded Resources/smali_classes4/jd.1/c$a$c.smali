.class final Ljd/c$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljd/c$a;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljd/c;


# direct methods
.method constructor <init>(Ljd/c;)V
    .locals 0

    iput-object p1, p0, Ljd/c$a$c;->a:Ljd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ll9/a;

    check-cast p4, Ll9/a;

    invoke-virtual {p0, p1, p2, p3, p4}, Ljd/c$a$c;->b(Ll9/a;Ljava/lang/Boolean;Ll9/a;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Ljava/lang/Boolean;Ll9/a;Ll9/a;)Ll9/a;
    .locals 7

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "apiApIsGateway"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lce/b$a;

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    move-object v4, p3

    check-cast v4, LCc/a;

    invoke-virtual {p4}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljd/a$b;

    const/4 p4, 0x0

    if-eqz p1, :cond_0

    iget-object v0, p0, Ljd/c$a$c;->a:Ljd/c;

    invoke-static {v0, p1, p4}, Ljd/c;->e(Ljd/c;Lce/b$a;LCc/a;)Ljd/a$b;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p4

    :goto_0
    if-eqz v4, :cond_1

    invoke-interface {v4}, LCc/a;->n()Linet/ipaddr/ipv4/b;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Ljd/c$a$c;->a:Ljd/c;

    invoke-static {v2, v1}, Ljd/c;->k(Ljd/c;Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljd/a$b;->c()Linet/ipaddr/g;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p0, Ljd/c$a$c;->a:Ljd/c;

    invoke-static {v2, v1}, Ljd/c;->k(Ljd/c;Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, p4

    :goto_1
    new-instance v6, Ll9/a;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljd/a$b;->c()Linet/ipaddr/g;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, p4

    :goto_2
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_a

    :cond_4
    if-nez p1, :cond_5

    if-eqz v4, :cond_d

    :cond_5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_d

    new-instance p3, Ljd/a$b;

    sget-object v1, Ljd/a$c;->AP:Ljd/a$c;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljd/a$b;->c()Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p2, p0, Ljd/c$a$c;->a:Ljd/c;

    invoke-static {p2, p1}, Ljd/c;->k(Ljd/c;Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_7

    :cond_6
    :goto_3
    move-object v2, p1

    goto :goto_5

    :cond_7
    if-eqz v4, :cond_8

    invoke-interface {v4}, LCc/a;->n()Linet/ipaddr/ipv4/b;

    move-result-object p1

    if-eqz p1, :cond_8

    iget-object p2, p0, Ljd/c$a$c;->a:Ljd/c;

    invoke-static {p2, p1}, Ljd/c;->k(Ljd/c;Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object p1

    goto :goto_4

    :cond_8
    move-object p1, p4

    :goto_4
    if-nez p1, :cond_6

    if-eqz v4, :cond_9

    invoke-interface {v4}, LCc/a;->i()Linet/ipaddr/ipv6/b;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object p2, p0, Ljd/c$a$c;->a:Ljd/c;

    invoke-static {p2, p1}, Ljd/c;->k(Ljd/c;Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object p1

    goto :goto_3

    :cond_9
    move-object v2, p4

    :goto_5
    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljd/a$b;->a()Ljd/a$a;

    move-result-object p1

    if-nez p1, :cond_a

    goto :goto_7

    :cond_a
    :goto_6
    move-object v3, p1

    goto :goto_8

    :cond_b
    :goto_7
    sget-object p1, Ljd/a$a;->WIRED:Ljd/a$a;

    goto :goto_6

    :goto_8
    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljd/a$b;->e()Ljd/a$d;

    move-result-object p1

    move-object v5, p1

    goto :goto_9

    :cond_c
    move-object v5, p4

    :goto_9
    move-object v0, p3

    invoke-direct/range {v0 .. v5}, Ljd/a$b;-><init>(Ljd/a$c;Linet/ipaddr/g;Ljd/a$a;LCc/a;Ljd/a$d;)V

    :cond_d
    :goto_a
    invoke-direct {v6, p3}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v6
.end method
