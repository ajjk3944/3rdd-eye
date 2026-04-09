.class public final LDc/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCc/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDc/j$a;
    }
.end annotation


# static fields
.field public static final k:LDc/j$a;


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:Lh9/a;

.field private final c:Ljava/util/EnumMap;

.field private final d:La8/b;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/math/BigInteger;

.field private final g:LYg/m;

.field private final h:La8/b;

.field private final i:LYg/m;

.field private final j:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LDc/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDc/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LDc/j;->k:LDc/j$a;

    return-void
.end method

.method public constructor <init>(Linet/ipaddr/g;Lh9/a;Ljava/util/EnumMap;)V
    .locals 1

    const-string v0, "ipAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDc/j;->a:Linet/ipaddr/g;

    iput-object p2, p0, LDc/j;->b:Lh9/a;

    iput-object p3, p0, LDc/j;->c:Ljava/util/EnumMap;

    invoke-virtual {p0}, LDc/j;->l()Lh9/a;

    move-result-object p2

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    sget-object v0, La8/b;->c:La8/b$a;

    invoke-virtual {v0, p2}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p3

    :goto_0
    iput-object p2, p0, LDc/j;->d:La8/b;

    invoke-virtual {p1}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "toString(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LDc/j;->e:Ljava/lang/String;

    invoke-virtual {p1}, Linet/ipaddr/a;->getValue()Ljava/math/BigInteger;

    move-result-object p1

    const-string p2, "getValue(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDc/j;->f:Ljava/math/BigInteger;

    new-instance p1, LDc/f;

    invoke-direct {p1, p0}, LDc/f;-><init>(LDc/j;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LDc/j;->g:LYg/m;

    invoke-virtual {p0}, LDc/j;->l()Lh9/a;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object p2, La8/b;->c:La8/b$a;

    invoke-virtual {p2, p1}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object p3

    :cond_1
    iput-object p3, p0, LDc/j;->h:La8/b;

    new-instance p1, LDc/g;

    invoke-direct {p1, p0}, LDc/g;-><init>(LDc/j;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LDc/j;->i:LYg/m;

    new-instance p1, LDc/h;

    invoke-direct {p1, p0}, LDc/h;-><init>(LDc/j;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LDc/j;->j:LYg/m;

    return-void
.end method

.method private static final O(LDc/j;)Ljava/util/Set;
    .locals 2

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, LDc/j;->l()Lh9/a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LDc/j;->l()Lh9/a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object p0, p0, LDc/j;->c:Ljava/util/EnumMap;

    invoke-virtual {p0}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    move-result-object p0

    const-string v1, "<get-values>(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p0

    new-instance v1, LDc/i;

    invoke-direct {v1}, LDc/i;-><init>()V

    invoke-static {p0, v1}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p0

    invoke-interface {p0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh9/a;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private static final P(LEc/t$b;)Lh9/a;
    .locals 2

    instance-of v0, p0, LEc/t$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, LEc/t$a;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, LEc/t$a;->g()Lh9/a;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method private static final Q(LDc/j;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LDc/j;->L()LTc/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LTc/a$a;->l()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    :cond_0
    invoke-virtual {p0}, LDc/j;->I()LSc/b$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LSc/b$a;->j()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_7

    invoke-virtual {p0}, LDc/j;->E()LLc/a$a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LLc/a$a;->k()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_7

    invoke-virtual {p0}, LDc/j;->F()LMc/a$a;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LMc/a$a;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v1

    :goto_2
    if-nez v0, :cond_7

    invoke-virtual {p0}, LDc/j;->M()LUc/e$a;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LUc/e$a;->h()LUc/a;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0}, LUc/a;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_4
    move-object v0, v1

    :goto_3
    if-nez v0, :cond_7

    invoke-virtual {p0}, LDc/j;->K()LRc/a$a;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LRc/a$a;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_5
    move-object v0, v1

    :goto_4
    if-nez v0, :cond_7

    invoke-virtual {p0}, LDc/j;->o()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_6

    const-string v0, ".localdomain"

    invoke-static {p0, v0}, Lkotlin/text/t;->H0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_6
    move-object v0, v1

    :cond_7
    :goto_5
    return-object v0
.end method

.method private static final R(LDc/j;)Ljava/util/TreeSet;
    .locals 3

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    invoke-virtual {p0}, LDc/j;->I()LSc/b$a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LSc/b$a;->q()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LDc/j;->z()LFc/a$b;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LFc/a$b;->j()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public static synthetic a(LDc/j;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LDc/j;->Q(LDc/j;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(LDc/j;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, LDc/j;->O(LDc/j;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(LDc/j;)Ljava/util/TreeSet;
    .locals 0

    invoke-static {p0}, LDc/j;->R(LDc/j;)Ljava/util/TreeSet;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(LEc/t$b;)Lh9/a;
    .locals 0

    invoke-static {p0}, LDc/j;->P(LEc/t$b;)Lh9/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A()LGc/a$a;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->ARP:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LGc/a$a;

    if-eqz v1, :cond_0

    check-cast v0, LGc/a$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final B()Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->BONJOUR:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final C()LIc/a$a;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->GATEWAY:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIc/a$a;

    if-eqz v1, :cond_0

    check-cast v0, LIc/a$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final D()LJc/a$b;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->HOSTNAME:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LJc/a$b;

    if-eqz v1, :cond_0

    check-cast v0, LJc/a$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final E()LLc/a$a;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->MIKROTIK:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LLc/a$a;

    if-eqz v1, :cond_0

    check-cast v0, LLc/a$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final F()LMc/a$a;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->MYSELF:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LMc/a$a;

    if-eqz v1, :cond_0

    check-cast v0, LMc/a$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final G()LNc/b$b;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->NETBIOS:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LNc/b$b;

    if-eqz v1, :cond_0

    check-cast v0, LNc/b$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final H()Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->SNMP:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final I()LSc/b$a;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->UBNT:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LSc/b$a;

    if-eqz v1, :cond_0

    check-cast v0, LSc/b$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final J()LQc/a$b;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->UBNT_HTTP_SPEEDTEST:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LQc/a$b;

    if-eqz v1, :cond_0

    check-cast v0, LQc/a$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final K()LRc/a$a;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->UBNT_TCP_SPEEDTEST:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LRc/a$a;

    if-eqz v1, :cond_0

    check-cast v0, LRc/a$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final L()LTc/a$a;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->UNIFI:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LTc/a$a;

    if-eqz v1, :cond_0

    check-cast v0, LTc/a$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final M()LUc/e$a;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->UPNP:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LUc/e$a;

    if-eqz v1, :cond_0

    check-cast v0, LUc/e$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final N()LS8/g;
    .locals 1

    invoke-virtual {p0}, LDc/j;->L()LTc/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LTc/a$a;->p()LS8/g;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, LDc/j;->K()LRc/a$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LRc/a$a;->l()LS8/g;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LDc/j;->F()LMc/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LMc/a$a;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    :cond_0
    invoke-virtual {p0}, LDc/j;->L()LTc/a$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LTc/a$a;->n()Lxa/a$d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lua/a;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_1
    invoke-virtual {p0}, LDc/j;->I()LSc/b$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LSc/b$a;->p()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_7

    invoke-virtual {p0}, LDc/j;->L()LTc/a$a;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LTc/a$a;->k()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_7

    invoke-virtual {p0}, LDc/j;->E()LLc/a$a;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LLc/a$a;->l()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object v0, v1

    :goto_2
    if-nez v0, :cond_7

    invoke-virtual {p0}, LDc/j;->M()LUc/e$a;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LUc/e$a;->h()LUc/a;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, LUc/a;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_5
    move-object v0, v1

    :goto_3
    if-nez v0, :cond_7

    invoke-virtual {p0}, LDc/j;->K()LRc/a$a;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, LRc/a$a;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_6
    move-object v0, v1

    :cond_7
    :goto_4
    return-object v0
.end method

.method public c()Lcom/ui/wifiman/model/vendor/d;
    .locals 2

    invoke-virtual {p0}, LDc/j;->F()LMc/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LMc/a$a;->k()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    if-nez v0, :cond_8

    :cond_0
    invoke-virtual {p0}, LDc/j;->I()LSc/b$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LSc/b$a;->t()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    goto/16 :goto_5

    :cond_1
    invoke-virtual {p0}, LDc/j;->L()LTc/a$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LTc/a$a;->o()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_8

    invoke-virtual {p0}, LDc/j;->E()LLc/a$a;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LLc/a$a;->o()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_8

    invoke-virtual {p0}, LDc/j;->B()Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->j()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object v0, v1

    :goto_2
    if-nez v0, :cond_8

    invoke-virtual {p0}, LDc/j;->M()LUc/e$a;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LUc/e$a;->h()LUc/a;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, LUc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    goto :goto_3

    :cond_5
    move-object v0, v1

    :goto_3
    if-nez v0, :cond_8

    invoke-virtual {p0}, LDc/j;->A()LGc/a$a;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, LGc/a$a;->h()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    goto :goto_4

    :cond_6
    move-object v0, v1

    :goto_4
    if-nez v0, :cond_8

    invoke-virtual {p0}, LDc/j;->z()LFc/a$b;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LFc/a$b;->k()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    goto :goto_5

    :cond_7
    move-object v0, v1

    :cond_8
    :goto_5
    return-object v0
.end method

.method public d()LCc/b;
    .locals 2

    invoke-virtual {p0}, LDc/j;->F()LMc/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LMc/a$a;->g()LCc/b;

    move-result-object v0

    if-nez v0, :cond_a

    :cond_0
    invoke-virtual {p0}, LDc/j;->L()LTc/a$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LTc/a$a;->h()LCc/b;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_a

    invoke-virtual {p0}, LDc/j;->I()LSc/b$a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LSc/b$a;->k()LCc/b;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_a

    invoke-virtual {p0}, LDc/j;->E()LLc/a$a;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LLc/a$a;->h()LCc/b;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v1

    :goto_2
    if-nez v0, :cond_a

    invoke-virtual {p0}, LDc/j;->K()LRc/a$a;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LRc/a$a;->g()LCc/b;

    move-result-object v0

    goto :goto_3

    :cond_4
    move-object v0, v1

    :goto_3
    if-nez v0, :cond_a

    invoke-virtual {p0}, LDc/j;->B()Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->h()LCc/b;

    move-result-object v0

    goto :goto_4

    :cond_5
    move-object v0, v1

    :goto_4
    if-nez v0, :cond_a

    invoke-virtual {p0}, LDc/j;->M()LUc/e$a;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, LUc/e$a;->g()LCc/b;

    move-result-object v0

    goto :goto_5

    :cond_6
    move-object v0, v1

    :goto_5
    if-nez v0, :cond_a

    invoke-virtual {p0}, LDc/j;->C()LIc/a$a;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LIc/a$a;->g()LCc/b$g$b;

    move-result-object v0

    goto :goto_6

    :cond_7
    move-object v0, v1

    :goto_6
    if-eqz v0, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {p0}, LDc/j;->z()LFc/a$b;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, LFc/a$b;->i()LCc/b;

    move-result-object v0

    goto :goto_7

    :cond_9
    move-object v0, v1

    :cond_a
    :goto_7
    return-object v0
.end method

.method public e()Ljava/lang/Long;
    .locals 2

    invoke-virtual {p0}, LDc/j;->F()LMc/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LMc/a$a;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LDc/j;->I()LSc/b$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LSc/b$a;->s()Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p0}, LDc/j;->E()LLc/a$a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LLc/a$a;->n()Ljava/lang/Long;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :cond_3
    :goto_1
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LDc/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, LDc/j;->a:Linet/ipaddr/g;

    check-cast p1, LDc/j;

    iget-object v1, p1, LDc/j;->a:Linet/ipaddr/g;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LDc/j;->l()Lh9/a;

    move-result-object v0

    invoke-virtual {p1}, LDc/j;->l()Lh9/a;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LDc/j;->d()LCc/b;

    move-result-object v0

    invoke-virtual {p1}, LDc/j;->d()LCc/b;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    iget-object p1, p1, LDc/j;->c:Ljava/util/EnumMap;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()Lxa/a$d;
    .locals 1

    invoke-virtual {p0}, LDc/j;->L()LTc/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LTc/a$a;->n()Lxa/a$d;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, LDc/j;->I()LSc/b$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LSc/b$a;->r()Lxa/a$d;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public getId()La8/b;
    .locals 1

    iget-object v0, p0, LDc/j;->d:La8/b;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LDc/j;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LDc/j;->I()LSc/b$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LSc/b$a;->m()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_0
    invoke-virtual {p0}, LDc/j;->E()LLc/a$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LLc/a$a;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p0}, LDc/j;->F()LMc/a$a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LMc/a$a;->l()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :cond_3
    :goto_1
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    invoke-virtual {p0}, LDc/j;->l()Lh9/a;

    move-result-object v0

    iget-object v1, p0, LDc/j;->a:Linet/ipaddr/g;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "m"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ":ip"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Linet/ipaddr/ipv6/b;
    .locals 4

    iget-object v0, p0, LDc/j;->a:Linet/ipaddr/g;

    instance-of v1, v0, Linet/ipaddr/ipv6/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Linet/ipaddr/ipv6/b;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_3

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    invoke-virtual {v0}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LEc/t$b;

    invoke-virtual {v3}, LEc/t$b;->e()Linet/ipaddr/ipv6/b;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    check-cast v1, LEc/t$b;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LEc/t$b;->e()Linet/ipaddr/ipv6/b;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, v0

    :cond_4
    :goto_2
    return-object v2
.end method

.method public k()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LDc/j;->g:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public l()Lh9/a;
    .locals 1

    iget-object v0, p0, LDc/j;->b:Lh9/a;

    return-object v0
.end method

.method public n()Linet/ipaddr/ipv4/b;
    .locals 4

    iget-object v0, p0, LDc/j;->a:Linet/ipaddr/g;

    instance-of v1, v0, Linet/ipaddr/ipv4/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Linet/ipaddr/ipv4/b;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_3

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    invoke-virtual {v0}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LEc/t$b;

    invoke-virtual {v3}, LEc/t$b;->d()Linet/ipaddr/ipv4/b;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    check-cast v1, LEc/t$b;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LEc/t$b;->d()Linet/ipaddr/ipv4/b;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, v0

    :cond_4
    :goto_2
    return-object v2
.end method

.method public o()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LDc/j;->D()LJc/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LJc/a$b;->g()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, LDc/j;->L()LTc/a$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LTc/a$a;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public q()Ljava/util/Set;
    .locals 5

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v1, p0, LDc/j;->a:Linet/ipaddr/g;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LDc/j;->I()LSc/b$a;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LSc/b$a;->o()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Linet/ipaddr/g;

    invoke-virtual {v3}, Linet/ipaddr/g;->g1()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, LDc/j;->a:Linet/ipaddr/g;

    invoke-virtual {p0}, LDc/j;->l()Lh9/a;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DiscoveredDevice["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()La8/b;
    .locals 1

    iget-object v0, p0, LDc/j;->h:La8/b;

    return-object v0
.end method

.method public final v()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, LDc/j;->I()LSc/b$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LSc/b$a;->n()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LDc/j;->E()LLc/a$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LLc/a$a;->j()Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final w()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LDc/j;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public final x()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, LDc/j;->f:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LDc/j;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final z()LFc/a$b;
    .locals 2

    iget-object v0, p0, LDc/j;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->AP:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LFc/a$b;

    if-eqz v1, :cond_0

    check-cast v0, LFc/a$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
