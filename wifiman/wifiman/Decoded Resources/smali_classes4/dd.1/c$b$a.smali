.class final Ldd/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldd/c$b;->a(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ldd/c;

.field final synthetic c:I

.field final synthetic d:Ljava/util/LinkedList;

.field final synthetic e:Ljava/util/LinkedList;

.field final synthetic f:I


# direct methods
.method constructor <init>(Ljava/lang/String;Ldd/c;ILjava/util/LinkedList;Ljava/util/LinkedList;I)V
    .locals 0

    iput-object p1, p0, Ldd/c$b$a;->a:Ljava/lang/String;

    iput-object p2, p0, Ldd/c$b$a;->b:Ldd/c;

    iput p3, p0, Ldd/c$b$a;->c:I

    iput-object p4, p0, Ldd/c$b$a;->d:Ljava/util/LinkedList;

    iput-object p5, p0, Ldd/c$b$a;->e:Ljava/util/LinkedList;

    iput p6, p0, Ldd/c$b$a;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 11

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Landroid/net/Network;

    const/4 p1, 0x0

    const/4 v0, 0x0

    if-eqz v8, :cond_1

    new-instance v1, Linet/ipaddr/e;

    iget-object v2, p0, Ldd/c$b$a;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Linet/ipaddr/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Linet/ipaddr/e;->p()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Ldd/c$b$a;->b:Ldd/c;

    invoke-static {p1}, Ldd/c;->c(Ldd/c;)Lcd/a;

    move-result-object v0

    new-instance p1, Lcd/a$b$a;

    invoke-direct {p1, v1}, Lcd/a$b$a;-><init>(Linet/ipaddr/e;)V

    iget v1, p0, Ldd/c$b$a;->c:I

    int-to-long v4, v1

    const/16 v9, 0x14

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v10}, Lcd/a$a;->a(Lcd/a;Lcd/a$b;Ljava/lang/Integer;IJJLandroid/net/Network;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    sget-object v0, Ldd/c$b$a$a;->a:Ldd/c$b$a$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v1, Lcd/a$c$a$d;

    iget-object v2, p0, Ldd/c$b$a;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' is not a valid hostname"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcd/a$c$a$d;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcd/a$d;

    invoke-direct {v2, p1, v0, v0, v1}, Lcd/a$d;-><init>(Linet/ipaddr/g;IILcd/a$c;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance v1, Lcd/a$c$a$a;

    const-string v2, "network unavailable"

    invoke-direct {v1, v2}, Lcd/a$c$a$a;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcd/a$d;

    invoke-direct {v2, p1, v0, v0, v1}, Lcd/a$d;-><init>(Linet/ipaddr/g;IILcd/a$c;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    new-instance v0, Ldd/c$b$a$b;

    iget v1, p0, Ldd/c$b$a;->c:I

    invoke-direct {v0, v1}, Ldd/c$b$a$b;-><init>(I)V

    invoke-virtual {p1, v0}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object p1

    :goto_0
    new-instance v6, Ldd/c$b$a$c;

    iget-object v1, p0, Ldd/c$b$a;->d:Ljava/util/LinkedList;

    iget-object v2, p0, Ldd/c$b$a;->b:Ldd/c;

    iget-object v3, p0, Ldd/c$b$a;->a:Ljava/lang/String;

    iget-object v4, p0, Ldd/c$b$a;->e:Ljava/util/LinkedList;

    iget v5, p0, Ldd/c$b$a;->f:I

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ldd/c$b$a$c;-><init>(Ljava/util/LinkedList;Ldd/c;Ljava/lang/String;Ljava/util/LinkedList;I)V

    invoke-virtual {p1, v6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v8, Ldd/i;

    iget-object v1, p0, Ldd/c$b$a;->a:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ldd/i;-><init>(Ljava/lang/String;Linet/ipaddr/g;Ljava/lang/Boolean;Lb8/b;Lb8/b;Lb8/d;Ljava/util/List;)V

    invoke-virtual {p1, v8}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Ldd/c$b$a;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
