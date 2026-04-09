.class public Linet/ipaddr/ipv4/I$d$a;
.super Linet/ipaddr/j$c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv4/I$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xa

    const/16 v1, 0x2e

    .line 1
    invoke-direct {p0, v0, v1}, Linet/ipaddr/ipv4/I$d$a;-><init>(IC)V

    return-void
.end method

.method protected constructor <init>(IC)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Linet/ipaddr/j$c$a;-><init>(IC)V

    return-void
.end method


# virtual methods
.method public bridge synthetic u()Linet/ipaddr/j$c;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/I$d$a;->v()Linet/ipaddr/ipv4/I$d;

    move-result-object v0

    return-object v0
.end method

.method public v()Linet/ipaddr/ipv4/I$d;
    .locals 13

    new-instance v12, Linet/ipaddr/ipv4/I$d;

    iget v1, p0, Lbg/d$i$a;->c:I

    iget-boolean v2, p0, Lbg/d$i$a;->b:Z

    iget-object v3, p0, Linet/ipaddr/j$c$a;->l:Linet/ipaddr/j$g$a;

    iget-object v4, p0, Lbg/d$i$a;->a:Lbg/d$i$b;

    iget-object v5, p0, Lbg/d$i$a;->d:Ljava/lang/String;

    iget-object v6, p0, Lbg/d$i$a;->e:Ljava/lang/Character;

    iget-object v7, p0, Lbg/d$i$a;->f:Ljava/lang/String;

    iget-object v8, p0, Linet/ipaddr/j$c$a;->k:Ljava/lang/String;

    iget-boolean v9, p0, Lbg/d$i$a;->g:Z

    iget-boolean v10, p0, Lbg/d$i$a;->h:Z

    iget-boolean v11, p0, Lbg/d$i$a;->i:Z

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Linet/ipaddr/ipv4/I$d;-><init>(IZLinet/ipaddr/j$g$a;Lbg/d$i$b;Ljava/lang/String;Ljava/lang/Character;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-object v12
.end method
