.class final Ljd/c$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljd/c;-><init>(LZc/f;LZc/a;Lje/u;LDc/e;Lbe/e;LCc/n;)V
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

    iput-object p1, p0, Ljd/c$j;->a:Ljd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    check-cast p2, LCc/j;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, Ljd/c$j;->b(LZc/e;LCc/j;Ll9/a;)Ljd/a$b;

    move-result-object p1

    return-object p1
.end method

.method public final b(LZc/e;LCc/j;Ll9/a;)Ljd/a$b;
    .locals 6

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myself"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljd/a$a;

    sget-object v1, Ljd/a$c;->MYSELF:Ljd/a$c;

    if-nez p3, :cond_0

    sget-object p3, Ljd/a$a;->WIRELESS:Ljd/a$a;

    :cond_0
    move-object v3, p3

    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object p3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    invoke-virtual {p3}, LZc/e$a;->b()Linet/ipaddr/g;

    move-result-object p3

    if-eqz p3, :cond_1

    iget-object v2, p0, Ljd/c$j;->a:Ljd/c;

    invoke-static {v2, p3}, Ljd/c;->k(Ljd/c;Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object p3

    if-eqz p3, :cond_1

    move-object v2, p3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LZc/e;->c()LZc/e$a;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LZc/e$a;->b()Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p3, p0, Ljd/c$j;->a:Ljd/c;

    invoke-static {p3, p1}, Ljd/c;->k(Ljd/c;Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object p1

    move-object v2, p1

    goto :goto_0

    :cond_2
    move-object v2, v0

    :goto_0
    new-instance v5, Ljd/a$d;

    invoke-virtual {p2}, LCc/j;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, LCc/j;->j()LDc/j;

    move-result-object p3

    if-eqz p3, :cond_3

    invoke-virtual {p3}, LDc/j;->L()LTc/a$a;

    move-result-object p3

    if-eqz p3, :cond_3

    invoke-virtual {p3}, LTc/a$a;->j()Ljava/lang/String;

    move-result-object p3

    goto :goto_1

    :cond_3
    move-object p3, v0

    :goto_1
    invoke-virtual {p2}, LCc/j;->j()LDc/j;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, LDc/j;->L()LTc/a$a;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, LTc/a$a;->p()LS8/g;

    move-result-object v4

    goto :goto_2

    :cond_4
    move-object v4, v0

    :goto_2
    invoke-direct {v5, p1, p3, v4, v0}, Ljd/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;LS8/g;Ljava/lang/Integer;)V

    new-instance p1, Ljd/a$b;

    move-object v0, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Ljd/a$b;-><init>(Ljd/a$c;Linet/ipaddr/g;Ljd/a$a;LCc/a;Ljd/a$d;)V

    return-object p1
.end method
