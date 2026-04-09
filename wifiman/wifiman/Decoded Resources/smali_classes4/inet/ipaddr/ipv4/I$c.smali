.class Linet/ipaddr/ipv4/I$c;
.super Linet/ipaddr/j$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv4/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field static final j:Linet/ipaddr/j$c;

.field static final k:Linet/ipaddr/j$c;

.field static final l:Linet/ipaddr/j$c;

.field static final m:Linet/ipaddr/j$c;

.field static final n:Linet/ipaddr/j$c;

.field static final o:Linet/ipaddr/j$c;

.field static final p:Linet/ipaddr/j$c;

.field static final q:Linet/ipaddr/j$c;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Linet/ipaddr/j$g;

    sget-object v1, Linet/ipaddr/j$g$a;->ALL:Linet/ipaddr/j$g$a;

    invoke-direct {v0, v1}, Linet/ipaddr/j$g;-><init>(Linet/ipaddr/j$g$a;)V

    new-instance v2, Linet/ipaddr/j$g;

    new-instance v3, Lbg/d$i$b;

    sget-object v4, Linet/ipaddr/a;->f:Ljava/lang/String;

    sget-object v5, Linet/ipaddr/a;->g:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lbg/d$i$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v2, v1, v3}, Linet/ipaddr/j$g;-><init>(Linet/ipaddr/j$g$a;Lbg/d$i$b;)V

    new-instance v1, Linet/ipaddr/j$g;

    sget-object v3, Linet/ipaddr/j$g$a;->NETWORK_ONLY:Linet/ipaddr/j$g$a;

    new-instance v4, Lbg/d$i$b;

    sget-object v5, Linet/ipaddr/a;->c:Ljava/lang/String;

    invoke-direct {v4, v5}, Lbg/d$i$b;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v3, v4}, Linet/ipaddr/j$g;-><init>(Linet/ipaddr/j$g$a;Lbg/d$i$b;)V

    new-instance v3, Linet/ipaddr/ipv4/I$d$a;

    invoke-direct {v3}, Linet/ipaddr/ipv4/I$d$a;-><init>()V

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Linet/ipaddr/j$c$a;->k(Z)Linet/ipaddr/j$c$a;

    move-result-object v3

    invoke-virtual {v3, v1}, Linet/ipaddr/j$c$a;->r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v1

    sput-object v1, Linet/ipaddr/ipv4/I$c;->j:Linet/ipaddr/j$c;

    new-instance v1, Linet/ipaddr/ipv4/I$d$a;

    invoke-direct {v1}, Linet/ipaddr/ipv4/I$d$a;-><init>()V

    invoke-virtual {v1, v0}, Linet/ipaddr/j$c$a;->r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v1

    sput-object v1, Linet/ipaddr/ipv4/I$c;->k:Linet/ipaddr/j$c;

    new-instance v1, Linet/ipaddr/ipv4/I$d$a;

    invoke-direct {v1}, Linet/ipaddr/ipv4/I$d$a;-><init>()V

    invoke-virtual {v1, v2}, Linet/ipaddr/j$c$a;->r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v1

    sput-object v1, Linet/ipaddr/ipv4/I$c;->l:Linet/ipaddr/j$c;

    new-instance v1, Linet/ipaddr/ipv4/I$d$a;

    invoke-direct {v1}, Linet/ipaddr/ipv4/I$d$a;-><init>()V

    sget-object v2, Linet/ipaddr/ipv4/b$b;->OCTAL:Linet/ipaddr/ipv4/b$b;

    invoke-virtual {v2}, Linet/ipaddr/ipv4/b$b;->getRadix()I

    move-result v3

    invoke-virtual {v1, v3}, Linet/ipaddr/j$c$a;->l(I)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v2}, Linet/ipaddr/ipv4/b$b;->getSegmentStrPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Linet/ipaddr/j$c$a;->n(Ljava/lang/String;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v1

    sput-object v1, Linet/ipaddr/ipv4/I$c;->m:Linet/ipaddr/j$c;

    new-instance v1, Linet/ipaddr/ipv4/I$d$a;

    invoke-direct {v1}, Linet/ipaddr/ipv4/I$d$a;-><init>()V

    sget-object v2, Linet/ipaddr/ipv4/b$b;->HEX:Linet/ipaddr/ipv4/b$b;

    invoke-virtual {v2}, Linet/ipaddr/ipv4/b$b;->getRadix()I

    move-result v3

    invoke-virtual {v1, v3}, Linet/ipaddr/j$c$a;->l(I)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v2}, Linet/ipaddr/ipv4/b$b;->getSegmentStrPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Linet/ipaddr/j$c$a;->n(Ljava/lang/String;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v1

    sput-object v1, Linet/ipaddr/ipv4/I$c;->n:Linet/ipaddr/j$c;

    new-instance v1, Linet/ipaddr/ipv4/I$d$a;

    invoke-direct {v1}, Linet/ipaddr/ipv4/I$d$a;-><init>()V

    invoke-virtual {v1}, Linet/ipaddr/ipv4/I$d$a;->v()Linet/ipaddr/ipv4/I$d;

    move-result-object v1

    sput-object v1, Linet/ipaddr/ipv4/I$c;->o:Linet/ipaddr/j$c;

    new-instance v1, Linet/ipaddr/ipv4/I$d$a;

    invoke-direct {v1}, Linet/ipaddr/ipv4/I$d$a;-><init>()V

    invoke-virtual {v1, v0}, Linet/ipaddr/j$c$a;->r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Linet/ipaddr/j$c$a;->m(Z)Linet/ipaddr/j$c$a;

    move-result-object v0

    const-string v1, ".in-addr.arpa"

    invoke-virtual {v0, v1}, Linet/ipaddr/j$c$a;->j(Ljava/lang/String;)Linet/ipaddr/j$c$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv4/I$c;->p:Linet/ipaddr/j$c;

    new-instance v0, Linet/ipaddr/j$c$a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Linet/ipaddr/j$c$a;-><init>(I)V

    const/16 v1, 0x2e

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/j$c$a;->o(Ljava/lang/Character;)Linet/ipaddr/j$c$a;

    move-result-object v0

    const-string v1, "0b"

    invoke-virtual {v0, v1}, Linet/ipaddr/j$c$a;->n(Ljava/lang/String;)Linet/ipaddr/j$c$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv4/I$c;->q:Linet/ipaddr/j$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Linet/ipaddr/j$b;-><init>()V

    return-void
.end method
