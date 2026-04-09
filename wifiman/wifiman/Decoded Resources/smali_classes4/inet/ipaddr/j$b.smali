.class public abstract Linet/ipaddr/j$b;
.super Lbg/d$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "b"
.end annotation


# static fields
.field public static final d:Linet/ipaddr/j$c;

.field public static final e:Linet/ipaddr/j$c;

.field public static final f:Linet/ipaddr/j$c;

.field public static final g:Linet/ipaddr/j$c;

.field public static final h:Linet/ipaddr/j$c;

.field public static final i:Linet/ipaddr/j$c;


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Linet/ipaddr/j$g;

    sget-object v1, Linet/ipaddr/j$g$a;->ALL:Linet/ipaddr/j$g$a;

    invoke-direct {v0, v1}, Linet/ipaddr/j$g;-><init>(Linet/ipaddr/j$g$a;)V

    new-instance v1, Linet/ipaddr/j$c$a;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Linet/ipaddr/j$c$a;-><init>(I)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Linet/ipaddr/j$c$a;->o(Ljava/lang/Character;)Linet/ipaddr/j$c$a;

    move-result-object v1

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Linet/ipaddr/j$c$a;->k(Z)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Linet/ipaddr/j$c$a;->r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v1

    sput-object v1, Linet/ipaddr/j$b;->d:Linet/ipaddr/j$c;

    new-instance v1, Linet/ipaddr/j$c$a;

    invoke-direct {v1, v2}, Linet/ipaddr/j$c$a;-><init>(I)V

    invoke-virtual {v1, v3}, Linet/ipaddr/j$c$a;->o(Ljava/lang/Character;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1, v4}, Linet/ipaddr/j$c$a;->k(Z)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Linet/ipaddr/j$c$a;->r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;

    move-result-object v1

    const-string v2, "0x"

    invoke-virtual {v1, v2}, Linet/ipaddr/j$c$a;->i(Ljava/lang/String;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v1

    sput-object v1, Linet/ipaddr/j$b;->e:Linet/ipaddr/j$c;

    new-instance v1, Linet/ipaddr/j$c$a;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Linet/ipaddr/j$c$a;-><init>(I)V

    invoke-virtual {v1, v3}, Linet/ipaddr/j$c$a;->o(Ljava/lang/Character;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1, v4}, Linet/ipaddr/j$c$a;->k(Z)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Linet/ipaddr/j$c$a;->r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v1

    sput-object v1, Linet/ipaddr/j$b;->f:Linet/ipaddr/j$c;

    new-instance v1, Linet/ipaddr/j$c$a;

    invoke-direct {v1, v2}, Linet/ipaddr/j$c$a;-><init>(I)V

    invoke-virtual {v1, v3}, Linet/ipaddr/j$c$a;->o(Ljava/lang/Character;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1, v4}, Linet/ipaddr/j$c$a;->k(Z)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Linet/ipaddr/j$c$a;->r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Linet/ipaddr/j$c$a;->i(Ljava/lang/String;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v1

    sput-object v1, Linet/ipaddr/j$b;->g:Linet/ipaddr/j$c;

    new-instance v1, Linet/ipaddr/j$c$a;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Linet/ipaddr/j$c$a;-><init>(I)V

    invoke-virtual {v1, v3}, Linet/ipaddr/j$c$a;->o(Ljava/lang/Character;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1, v4}, Linet/ipaddr/j$c$a;->k(Z)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Linet/ipaddr/j$c$a;->r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v0

    sput-object v0, Linet/ipaddr/j$b;->h:Linet/ipaddr/j$c;

    new-instance v0, Linet/ipaddr/j$c$a;

    const/16 v1, 0xa

    const/16 v2, 0x20

    invoke-direct {v0, v1, v2}, Linet/ipaddr/j$c$a;-><init>(IC)V

    invoke-virtual {v0}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v0

    sput-object v0, Linet/ipaddr/j$b;->i:Linet/ipaddr/j$c;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lbg/d$h;-><init>()V

    return-void
.end method
