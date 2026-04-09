.class Linet/ipaddr/ipv6/Q$f;
.super Linet/ipaddr/j$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv6/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# static fields
.field static final l:Linet/ipaddr/ipv6/Q$g;

.field static final m:Linet/ipaddr/ipv6/Q$g;

.field static final n:Linet/ipaddr/ipv6/Q$g;

.field static final o:Linet/ipaddr/ipv6/Q$g;

.field static final p:Linet/ipaddr/ipv6/Q$g;

.field static final q:Linet/ipaddr/ipv6/Q$g;

.field static final r:Linet/ipaddr/ipv6/Q$g;

.field static final s:Linet/ipaddr/ipv6/Q$g;

.field static final t:Linet/ipaddr/ipv6/Q$g;

.field static final u:Linet/ipaddr/ipv6/Q$g;

.field static final v:Linet/ipaddr/ipv6/Q$g;

.field static final w:Linet/ipaddr/ipv6/Q$g;

.field static final x:Linet/ipaddr/j$c;

.field static final y:Linet/ipaddr/j$c;


# instance fields
.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Linet/ipaddr/ipv6/Q$c;

    sget-object v1, Linet/ipaddr/ipv6/Q$c$a;->ZEROS_OR_HOST:Linet/ipaddr/ipv6/Q$c$a;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Linet/ipaddr/ipv6/Q$c;-><init>(ZLinet/ipaddr/ipv6/Q$c$a;)V

    new-instance v3, Linet/ipaddr/ipv6/Q$c;

    sget-object v4, Linet/ipaddr/ipv6/Q$c$a;->MIXED_PREFERRED:Linet/ipaddr/ipv6/Q$c$a;

    invoke-direct {v3, v2, v4}, Linet/ipaddr/ipv6/Q$c;-><init>(ZLinet/ipaddr/ipv6/Q$c$a;)V

    new-instance v4, Linet/ipaddr/ipv6/Q$c;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v1}, Linet/ipaddr/ipv6/Q$c;-><init>(ZLinet/ipaddr/ipv6/Q$c$a;)V

    new-instance v1, Linet/ipaddr/ipv6/Q$c;

    sget-object v6, Linet/ipaddr/ipv6/Q$c$a;->HOST_PREFERRED:Linet/ipaddr/ipv6/Q$c$a;

    invoke-direct {v1, v2, v6}, Linet/ipaddr/ipv6/Q$c;-><init>(ZLinet/ipaddr/ipv6/Q$c$a;)V

    new-instance v6, Linet/ipaddr/ipv6/Q$c;

    sget-object v7, Linet/ipaddr/ipv6/Q$c$a;->ZEROS:Linet/ipaddr/ipv6/Q$c$a;

    invoke-direct {v6, v2, v7}, Linet/ipaddr/ipv6/Q$c;-><init>(ZLinet/ipaddr/ipv6/Q$c$a;)V

    new-instance v8, Linet/ipaddr/ipv6/Q$c;

    invoke-direct {v8, v5, v7}, Linet/ipaddr/ipv6/Q$c;-><init>(ZLinet/ipaddr/ipv6/Q$c$a;)V

    new-instance v5, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v5}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    invoke-virtual {v5, v2}, Linet/ipaddr/ipv6/Q$g$a;->y(Z)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v5

    invoke-virtual {v5, v3}, Linet/ipaddr/ipv6/Q$g$a;->w(Linet/ipaddr/ipv6/Q$c;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v3

    sput-object v3, Linet/ipaddr/ipv6/Q$f;->l:Linet/ipaddr/ipv6/Q$g;

    new-instance v3, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v3}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    invoke-virtual {v3, v2}, Linet/ipaddr/ipv6/Q$g$a;->x(Z)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    new-instance v5, Linet/ipaddr/j$g;

    sget-object v7, Linet/ipaddr/j$g$a;->NETWORK_ONLY:Linet/ipaddr/j$g$a;

    new-instance v9, Lbg/d$i$b;

    sget-object v10, Linet/ipaddr/a;->c:Ljava/lang/String;

    invoke-direct {v9, v10}, Lbg/d$i$b;-><init>(Ljava/lang/String;)V

    invoke-direct {v5, v7, v9}, Linet/ipaddr/j$g;-><init>(Linet/ipaddr/j$g$a;Lbg/d$i$b;)V

    invoke-virtual {v3, v5}, Linet/ipaddr/ipv6/Q$g$a;->D(Linet/ipaddr/j$g;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v3

    sput-object v3, Linet/ipaddr/ipv6/Q$f;->m:Linet/ipaddr/ipv6/Q$g;

    new-instance v3, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v3}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    invoke-virtual {v3, v4}, Linet/ipaddr/ipv6/Q$g$a;->w(Linet/ipaddr/ipv6/Q$c;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v3

    sput-object v3, Linet/ipaddr/ipv6/Q$f;->o:Linet/ipaddr/ipv6/Q$g;

    new-instance v3, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v3}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    const/16 v4, 0x2d

    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    invoke-virtual {v3, v4}, Linet/ipaddr/ipv6/Q$g$a;->B(Ljava/lang/Character;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    const/16 v4, 0x73

    invoke-virtual {v3, v4}, Linet/ipaddr/ipv6/Q$g$a;->E(C)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    const-string v4, ".ipv6-literal.net"

    invoke-virtual {v3, v4}, Linet/ipaddr/ipv6/Q$g$a;->v(Ljava/lang/String;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    new-instance v4, Linet/ipaddr/j$g;

    new-instance v5, Lbg/d$i$b;

    sget-object v9, Linet/ipaddr/ipv6/b;->s:Ljava/lang/String;

    sget-object v10, Linet/ipaddr/a;->e:Ljava/lang/String;

    const/4 v11, 0x0

    invoke-direct {v5, v9, v10, v11}, Lbg/d$i$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v4, v7, v5}, Linet/ipaddr/j$g;-><init>(Linet/ipaddr/j$g$a;Lbg/d$i$b;)V

    invoke-virtual {v3, v4}, Linet/ipaddr/ipv6/Q$g$a;->D(Linet/ipaddr/j$g;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v3

    sput-object v3, Linet/ipaddr/ipv6/Q$f;->p:Linet/ipaddr/ipv6/Q$g;

    new-instance v3, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v3}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    invoke-virtual {v3, v0}, Linet/ipaddr/ipv6/Q$g$a;->w(Linet/ipaddr/ipv6/Q$c;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv6/Q$f;->q:Linet/ipaddr/ipv6/Q$g;

    new-instance v0, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v0}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv6/Q$f;->n:Linet/ipaddr/ipv6/Q$g;

    new-instance v0, Linet/ipaddr/j$g;

    sget-object v3, Linet/ipaddr/j$g$a;->ALL:Linet/ipaddr/j$g$a;

    invoke-direct {v0, v3}, Linet/ipaddr/j$g;-><init>(Linet/ipaddr/j$g$a;)V

    new-instance v4, Linet/ipaddr/j$g;

    new-instance v5, Lbg/d$i$b;

    sget-object v7, Linet/ipaddr/a;->f:Ljava/lang/String;

    sget-object v9, Linet/ipaddr/a;->g:Ljava/lang/String;

    invoke-direct {v5, v7, v9}, Lbg/d$i$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v4, v3, v5}, Linet/ipaddr/j$g;-><init>(Linet/ipaddr/j$g$a;Lbg/d$i$b;)V

    new-instance v3, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v3}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    invoke-virtual {v3, v0}, Linet/ipaddr/ipv6/Q$g$a;->D(Linet/ipaddr/j$g;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    invoke-virtual {v3, v8}, Linet/ipaddr/ipv6/Q$g$a;->w(Linet/ipaddr/ipv6/Q$c;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v3

    sput-object v3, Linet/ipaddr/ipv6/Q$f;->s:Linet/ipaddr/ipv6/Q$g;

    new-instance v3, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v3}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    invoke-virtual {v3, v0}, Linet/ipaddr/ipv6/Q$g$a;->D(Linet/ipaddr/j$g;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v3

    sput-object v3, Linet/ipaddr/ipv6/Q$f;->r:Linet/ipaddr/ipv6/Q$g;

    new-instance v3, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v3}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    invoke-virtual {v3, v4}, Linet/ipaddr/ipv6/Q$g$a;->D(Linet/ipaddr/j$g;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v3

    sput-object v3, Linet/ipaddr/ipv6/Q$f;->t:Linet/ipaddr/ipv6/Q$g;

    new-instance v3, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v3}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    invoke-virtual {v3, v0}, Linet/ipaddr/ipv6/Q$g$a;->D(Linet/ipaddr/j$g;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v0

    invoke-virtual {v0, v6}, Linet/ipaddr/ipv6/Q$g$a;->w(Linet/ipaddr/ipv6/Q$c;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv6/Q$f;->u:Linet/ipaddr/ipv6/Q$g;

    new-instance v0, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v0}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/Q$g$a;->w(Linet/ipaddr/ipv6/Q$c;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv6/Q$f;->v:Linet/ipaddr/ipv6/Q$g;

    new-instance v0, Linet/ipaddr/ipv6/Q$g$a;

    invoke-direct {v0}, Linet/ipaddr/ipv6/Q$g$a;-><init>()V

    invoke-virtual {v0, v2}, Linet/ipaddr/ipv6/Q$g$a;->z(Z)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v0

    const-string v1, ".ip6.arpa"

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/Q$g$a;->v(Ljava/lang/String;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Linet/ipaddr/ipv6/Q$g$a;->C(Z)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Linet/ipaddr/ipv6/Q$g$a;->x(Z)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/Q$g$a;->B(Ljava/lang/Character;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv6/Q$f;->w:Linet/ipaddr/ipv6/Q$g;

    new-instance v0, Linet/ipaddr/j$c$a;

    const/16 v1, 0x55

    invoke-direct {v0, v1}, Linet/ipaddr/j$c$a;-><init>(I)V

    invoke-virtual {v0, v2}, Linet/ipaddr/j$c$a;->k(Z)Linet/ipaddr/j$c$a;

    move-result-object v0

    new-instance v1, Lbg/d$i$b;

    sget-object v3, Linet/ipaddr/a;->d:Ljava/lang/String;

    invoke-direct {v1, v3}, Lbg/d$i$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Linet/ipaddr/j$c$a;->s(Lbg/d$i$b;)Linet/ipaddr/j$c$a;

    move-result-object v0

    const/16 v1, 0xa7

    invoke-virtual {v0, v1}, Linet/ipaddr/j$c$a;->t(C)Linet/ipaddr/j$c$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv6/Q$f;->x:Linet/ipaddr/j$c;

    new-instance v0, Linet/ipaddr/j$c$a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Linet/ipaddr/j$c$a;-><init>(I)V

    const/16 v1, 0x3a

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/j$c$a;->o(Ljava/lang/Character;)Linet/ipaddr/j$c$a;

    move-result-object v0

    const-string v1, "0b"

    invoke-virtual {v0, v1}, Linet/ipaddr/j$c$a;->n(Ljava/lang/String;)Linet/ipaddr/j$c$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Linet/ipaddr/j$c$a;->k(Z)Linet/ipaddr/j$c$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv6/Q$f;->y:Linet/ipaddr/j$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Linet/ipaddr/j$b;-><init>()V

    return-void
.end method
