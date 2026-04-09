.class public final Lcom/ui/wifiman/model/speedtest/internet/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/speedtest/internet/c$a;,
        Lcom/ui/wifiman/model/speedtest/internet/c$b;
    }
.end annotation


# static fields
.field public static final q:Lcom/ui/wifiman/model/speedtest/internet/c$a;


# instance fields
.field private final a:Ltd/d;

.field private final b:LYb/b;

.field private final c:LZc/f;

.field private final d:Lgg/i;

.field private final e:LFg/a;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/i;

.field private final l:Lgg/i;

.field private final m:Lgg/i;

.field private final n:Lgg/i;

.field private final o:Lgg/i;

.field private final p:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/internet/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/c;->q:Lcom/ui/wifiman/model/speedtest/internet/c$a;

    return-void
.end method

.method public constructor <init>(Ltd/d;LYb/b;Lpc/a;LZc/f;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;)V
    .locals 3

    const-string v0, "uiSpeedApiFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "speedTestServerDb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkConnectionManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uispController"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->a:Ltd/d;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->b:LYb/b;

    iput-object p4, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->c:LZc/f;

    invoke-interface {p4}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    sget-object p4, Lcom/ui/wifiman/model/speedtest/internet/c$l;->a:Lcom/ui/wifiman/model/speedtest/internet/c$l;

    invoke-virtual {p1, p4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-interface {p3}, Lpc/a;->b()Lgg/i;

    move-result-object p3

    sget-object p4, Lcom/ui/wifiman/model/speedtest/internet/c$m;->a:Lcom/ui/wifiman/model/speedtest/internet/c$m;

    invoke-static {p1, p3, p4}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string p3, "distinctUntilChanged(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->d:Lgg/i;

    sget-object p3, LYg/J;->a:LYg/J;

    invoke-static {p3}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p3

    const-string p4, "createDefault(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->e:LFg/a;

    invoke-virtual {p3}, Lgg/i;->e1()Lgg/i;

    move-result-object p3

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p4

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p3, p4, v0, v1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p3

    invoke-virtual {p3, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    const-string p4, "refCount(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->f:Lgg/i;

    invoke-interface {p5}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;->d()Lgg/i;

    move-result-object p5

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$j;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/internet/c$j;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V

    invoke-virtual {p5, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p5

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$k;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/internet/c$k;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V

    invoke-virtual {p5, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p5

    new-instance v0, LWc/b$b;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, LWc/b$b;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p5, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p5

    invoke-virtual {p5}, Lgg/i;->W()Lgg/i;

    move-result-object p5

    invoke-virtual {p5, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p5

    invoke-virtual {p5}, Ljg/a;->i2()Lgg/i;

    move-result-object p5

    invoke-static {p5, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->g:Lgg/i;

    invoke-static {p2}, LYb/c;->b(LYb/b;)Lgg/i;

    move-result-object p2

    sget-object v0, Lcom/ui/wifiman/model/speedtest/internet/c$o;->a:Lcom/ui/wifiman/model/speedtest/internet/c$o;

    invoke-static {p2, p5, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->h:Lgg/i;

    sget-object p2, LAg/c;->a:LAg/c;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/internet/c;->d()Lgg/i;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p2

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$n;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/internet/c$n;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V

    invoke-virtual {p2, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    new-instance v0, LWc/b$b;

    invoke-direct {v0, v2, v1, v2}, LWc/b$b;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->i:Lgg/i;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$p;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/internet/c$p;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V

    invoke-virtual {p3, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->j:Lgg/i;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$c;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/internet/c$c;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V

    invoke-static {p1, p3, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    new-instance v0, LWc/b$b;

    invoke-direct {v0, v2, v1, v2}, LWc/b$b;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->k:Lgg/i;

    sget-object v0, Lcom/ui/wifiman/model/speedtest/internet/c$i;->a:Lcom/ui/wifiman/model/speedtest/internet/c$i;

    invoke-static {p1, p5, p2, v0}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->l:Lgg/i;

    new-instance p1, Lcom/ui/wifiman/model/speedtest/internet/c$r;

    invoke-direct {p1, p0}, Lcom/ui/wifiman/model/speedtest/internet/c$r;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V

    invoke-virtual {p3, p1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p3, "map(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->m:Lgg/i;

    sget-object p1, Lcom/ui/wifiman/model/speedtest/internet/c$t;->a:Lcom/ui/wifiman/model/speedtest/internet/c$t;

    invoke-virtual {p2, p1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->n:Lgg/i;

    sget-object p1, Lcom/ui/wifiman/model/speedtest/internet/c$s;->a:Lcom/ui/wifiman/model/speedtest/internet/c$s;

    invoke-virtual {p5, p1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->o:Lgg/i;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/internet/c;->d()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/speedtest/internet/c$q;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/speedtest/internet/c$q;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->p:Lgg/i;

    return-void
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/speedtest/internet/c;LIa/e;LW7/c;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/internet/c;->q(LIa/e;LW7/c;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/speedtest/internet/c;LW7/c;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c;->r(LW7/c;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/speedtest/internet/c;)Lgg/z;
    .locals 0

    invoke-direct {p0}, Lcom/ui/wifiman/model/speedtest/internet/c;->s()Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/speedtest/internet/c;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->d:Lgg/i;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/speedtest/internet/c;)LZc/f;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->c:LZc/f;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/speedtest/internet/c;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->m:Lgg/i;

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/wifiman/model/speedtest/internet/c;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->o:Lgg/i;

    return-object p0
.end method

.method public static final synthetic l(Lcom/ui/wifiman/model/speedtest/internet/c;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->n:Lgg/i;

    return-object p0
.end method

.method public static final synthetic m(Lcom/ui/wifiman/model/speedtest/internet/c;)Ltd/d;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->a:Ltd/d;

    return-object p0
.end method

.method public static final synthetic n(Lcom/ui/wifiman/model/speedtest/internet/c;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c;->t(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lcom/ui/wifiman/model/speedtest/internet/c;Lgg/i;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c;->u(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final p(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;)LYb/a;
    .locals 16

    move-object/from16 v0, p1

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$a;

    if-eqz v1, :cond_0

    sget-object v15, LYb/a$b;->AUTO:LYb/a$b;

    invoke-virtual {v15}, LYb/a$b;->getDbId()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    new-instance v0, LYb/a;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v15}, LYb/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JLYb/a$b;)V

    goto/16 :goto_3

    :cond_0
    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;

    if-eqz v1, :cond_1

    sget-object v15, LYb/a$b;->ISP:LYb/a$b;

    invoke-virtual {v15}, LYb/a$b;->getDbId()Ljava/lang/String;

    move-result-object v3

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->d()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->h()Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    new-instance v0, LYb/a;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v15}, LYb/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JLYb/a$b;)V

    goto/16 :goto_3

    :cond_1
    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;

    if-eqz v1, :cond_5

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->d()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->j()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->m()LW7/c;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LW7/c;->b()LW7/c$a;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LW7/c$a;->a()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    move-object v7, v1

    goto :goto_0

    :cond_2
    move-object v7, v2

    :goto_0
    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->m()LW7/c;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LW7/c;->b()LW7/c$a;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LW7/c$a;->b()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    move-object v8, v1

    goto :goto_1

    :cond_3
    move-object v8, v2

    :goto_1
    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->n()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->o()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v11, v0

    goto :goto_2

    :cond_4
    move-object v11, v2

    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    sget-object v15, LYb/a$b;->MANUAL:LYb/a$b;

    new-instance v0, LYb/a;

    move-object v2, v0

    invoke-direct/range {v2 .. v15}, LYb/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JLYb/a$b;)V

    :goto_3
    return-object v0

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final q(LIa/e;LW7/c;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;
    .locals 20

    move-object/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, LIa/e;->b()LIa/c;

    move-result-object v1

    invoke-virtual {v1}, LIa/c;->d()Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, LIa/e;->b()LIa/c;

    move-result-object v1

    invoke-virtual {v1}, LIa/c;->e()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, LW7/c;

    new-instance v3, LW7/c$a;

    invoke-virtual/range {p1 .. p1}, LIa/e;->b()LIa/c;

    move-result-object v4

    invoke-virtual {v4}, LIa/c;->d()Ljava/lang/Double;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, LIa/e;->b()LIa/c;

    move-result-object v6

    invoke-virtual {v6}, LIa/c;->e()Ljava/lang/Double;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, LW7/c$a;-><init>(DD)V

    const/4 v4, 0x2

    invoke-direct {v1, v3, v2, v4, v2}, LW7/c;-><init>(LW7/c$a;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object v10, v2

    :goto_0
    invoke-virtual/range {p1 .. p1}, LIa/e;->b()LIa/c;

    move-result-object v1

    invoke-virtual {v1}, LIa/c;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, LIa/e;->b()LIa/c;

    move-result-object v1

    invoke-virtual {v1}, LIa/c;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, LIa/e;->b()LIa/c;

    move-result-object v1

    invoke-virtual {v1}, LIa/c;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, LIa/e;->b()LIa/c;

    move-result-object v1

    invoke-virtual {v1}, LIa/c;->f()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, LIa/e;->b()LIa/c;

    move-result-object v1

    invoke-virtual {v1}, LIa/c;->g()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, LIa/e;->b()LIa/c;

    move-result-object v1

    invoke-virtual {v1}, LIa/c;->h()Ljava/lang/Long;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, LIa/e;->b()LIa/c;

    move-result-object v1

    invoke-virtual {v1}, LIa/c;->i()Ljava/lang/String;

    move-result-object v6

    if-eqz v10, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v10, v0}, LW7/c;->a(LW7/c;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v14, v0

    goto :goto_1

    :cond_1
    move-object v14, v2

    :goto_1
    invoke-virtual/range {p1 .. p1}, LIa/e;->a()LLa/e;

    move-result-object v0

    invoke-virtual {v0}, LLa/e;->b()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_2
    move-object v15, v2

    invoke-virtual/range {p1 .. p1}, LIa/e;->a()LLa/e;

    move-result-object v0

    invoke-virtual {v0}, LLa/e;->d()Ljava/lang/String;

    move-result-object v17

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    const/16 v18, 0x400

    const/16 v19, 0x0

    const/16 v16, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v19}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final r(LW7/c;)Lgg/i;
    .locals 2

    invoke-direct {p0}, Lcom/ui/wifiman/model/speedtest/internet/c;->s()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/c$d;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$d;-><init>(LW7/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/speedtest/internet/c$e;->a:Lcom/ui/wifiman/model/speedtest/internet/c$e;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/speedtest/internet/c$f;->a:Lcom/ui/wifiman/model/speedtest/internet/c$f;

    invoke-virtual {p1, v0}, Lgg/i;->g1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final s()Lgg/z;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$g;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/internet/c$g;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ui/wifiman/model/speedtest/internet/c$h;->a:Lcom/ui/wifiman/model/speedtest/internet/c$h;

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string v1, "flatMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final t(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;
    .locals 7

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;->c()Ljava/lang/String;

    move-result-object v3

    new-instance p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object p1
.end method

.method private final u(Lgg/i;)Lgg/i;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$u;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/internet/c$u;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "switchMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;)Lgg/b;
    .locals 1

    const-string v0, "server"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->b:LYb/b;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c;->p(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;)LYb/a;

    move-result-object p1

    invoke-static {v0, p1}, LYb/c;->c(LYb/b;LYb/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->l:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->p:Lgg/i;

    return-object v0
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/c;->h:Lgg/i;

    return-object v0
.end method
