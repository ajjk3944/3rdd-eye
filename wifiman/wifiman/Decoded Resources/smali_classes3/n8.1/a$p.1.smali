.class final Ln8/a$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/a;


# direct methods
.method constructor <init>(Ln8/a;)V
    .locals 0

    iput-object p1, p0, Ln8/a$p;->a:Ln8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/a;)Ljava/util/List;
    .locals 10

    const-string/jumbo v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v9, p0, Ln8/a$p;->a:Ln8/a;

    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LDc/j;->H()Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->j()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v3, Ls9/d$b;

    const v2, 0x7f1101e9

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "name"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LDc/j;->H()Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->h()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v3, Ls9/d$b;

    const v2, 0x7f11009d

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "description"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LDc/j;->H()Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v3, Ls9/d$b;

    const v2, 0x7f11009e

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "location"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LDc/j;->H()Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->g()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v3, Ls9/d$b;

    const v1, 0x7f11009c

    invoke-direct {v3, v1}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "contact"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    invoke-virtual {p0, p1}, Ln8/a$p;->a(LCc/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
