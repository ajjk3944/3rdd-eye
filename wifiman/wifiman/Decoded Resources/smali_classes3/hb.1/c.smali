.class public final Lhb/c;
.super Lhb/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhb/c$a;
    }
.end annotation


# instance fields
.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Z

.field private final h:LGb/f;

.field private final i:Llb/c;

.field private final j:Ljb/a;

.field private final k:Ljb/i;

.field private final l:Ltb/V$a;

.field private m:Leb/i$a;

.field private final n:LHg/a;

.field private final o:Lgg/s;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLGb/f;Llb/c;Ljb/a;Ljb/i;Leb/g$b;)V
    .locals 1

    const-string/jumbo v0, "appVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deviceId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "storage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "meta"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cloudAccess"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cloudConfigProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p4, p8}, Lhb/a;-><init>(Ljava/lang/String;LGb/f;Leb/g$b;)V

    iput-object p1, p0, Lhb/c;->e:Ljava/lang/String;

    iput-object p2, p0, Lhb/c;->f:Ljava/lang/String;

    iput-boolean p3, p0, Lhb/c;->g:Z

    iput-object p4, p0, Lhb/c;->h:LGb/f;

    iput-object p5, p0, Lhb/c;->i:Llb/c;

    iput-object p6, p0, Lhb/c;->j:Ljb/a;

    iput-object p7, p0, Lhb/c;->k:Ljb/i;

    new-instance p1, Lhb/c$l;

    invoke-direct {p1, p0}, Lhb/c$l;-><init>(Lhb/c;)V

    iput-object p1, p0, Lhb/c;->l:Ltb/V$a;

    invoke-static {}, LHg/a;->k1()LHg/a;

    move-result-object p1

    const-string/jumbo p2, "create(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lhb/c;->n:LHg/a;

    invoke-direct {p0}, Lhb/c;->D()Lgg/s;

    move-result-object p1

    new-instance p2, Lhb/c$e;

    invoke-direct {p2, p0}, Lhb/c$e;-><init>(Lhb/c;)V

    invoke-virtual {p1, p2}, Lgg/s;->G(Lkg/f;)Lgg/s;

    move-result-object p1

    new-instance p2, Lhb/c$f;

    invoke-direct {p2, p0}, Lhb/c$f;-><init>(Lhb/c;)V

    invoke-virtual {p1, p2}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    new-instance p2, Lhb/c$g;

    invoke-direct {p2, p0}, Lhb/c$g;-><init>(Lhb/c;)V

    invoke-virtual {p1, p2}, Lgg/s;->Q(Lkg/n;)Lgg/s;

    move-result-object p1

    new-instance p2, Lhb/c$h;

    invoke-direct {p2, p0}, Lhb/c$h;-><init>(Lhb/c;)V

    invoke-virtual {p1, p2}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/s;->x0(I)LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    const-string/jumbo p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lhb/c;->o:Lgg/s;

    return-void
.end method

.method public static final synthetic A(Lhb/c;Ltb/N$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lhb/c;->F(Ltb/N$c;)V

    return-void
.end method

.method public static final synthetic B(Lhb/c;Leb/i$a;)V
    .locals 0

    iput-object p1, p0, Lhb/c;->m:Leb/i$a;

    return-void
.end method

.method private final C()Lgg/i;
    .locals 2

    iget-object v0, p0, Lhb/c;->o:Lgg/s;

    sget-object v1, Lgg/a;->LATEST:Lgg/a;

    invoke-virtual {v0, v1}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "toFlowable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final D()Lgg/s;
    .locals 3

    iget-object v0, p0, Lhb/c;->k:Ljb/i;

    invoke-interface {v0}, Ljb/i;->e()Lgg/z;

    move-result-object v0

    iget-object v1, p0, Lhb/c;->j:Ljb/a;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljb/a;->b(Z)Lgg/z;

    move-result-object v1

    new-instance v2, Lhb/c$c;

    invoke-direct {v2, p0}, Lhb/c$c;-><init>(Lhb/c;)V

    invoke-static {v0, v1, v2}, Lgg/z;->e0(Lgg/D;Lgg/D;Lkg/b;)Lgg/z;

    move-result-object v0

    sget-object v1, Lhb/c$d;->a:Lhb/c$d;

    invoke-virtual {v0, v1}, Lgg/z;->v(Lkg/n;)Lgg/s;

    move-result-object v0

    const-string/jumbo v1, "flatMapObservable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lhb/c;->G(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method private final E(Ltb/N$c;)Lhb/b;
    .locals 1

    sget-object v0, Lhb/c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object v0, Lhb/b$a;->a:Lhb/b$a;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lhb/b$e;->a:Lhb/b$e;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lhb/b$b;->a:Lhb/b$b;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lhb/b$c;->a:Lhb/b$c;

    :goto_0
    :pswitch_4
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final F(Ltb/N$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lhb/c;->E(Ltb/N$c;)Lhb/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Leb/c;->m(Leb/g$a;)V

    :cond_0
    return-void
.end method

.method private final G(Lgg/s;)Lgg/s;
    .locals 1

    new-instance v0, Lhb/c$k;

    invoke-direct {v0, p0}, Lhb/c$k;-><init>(Lhb/c;)V

    invoke-virtual {p1, v0}, Lgg/s;->A0(Lkg/n;)Lgg/s;

    move-result-object p1

    const-string/jumbo v0, "retryWhen(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static final synthetic q(Lhb/c;)Lgg/z;
    .locals 0

    invoke-virtual {p0}, Leb/c;->j()Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(Lhb/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lhb/c;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic s(Lhb/c;)Ljb/a;
    .locals 0

    iget-object p0, p0, Lhb/c;->j:Ljb/a;

    return-object p0
.end method

.method public static final synthetic t(Lhb/c;)LHg/a;
    .locals 0

    iget-object p0, p0, Lhb/c;->n:LHg/a;

    return-object p0
.end method

.method public static final synthetic u(Lhb/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lhb/c;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic v(Lhb/c;)Z
    .locals 0

    iget-boolean p0, p0, Lhb/c;->g:Z

    return p0
.end method

.method public static final synthetic w(Lhb/c;)Llb/c;
    .locals 0

    iget-object p0, p0, Lhb/c;->i:Llb/c;

    return-object p0
.end method

.method public static final synthetic x(Lhb/c;)LGb/f;
    .locals 0

    iget-object p0, p0, Lhb/c;->h:LGb/f;

    return-object p0
.end method

.method public static final synthetic y(Lhb/c;)Ltb/V$a;
    .locals 0

    iget-object p0, p0, Lhb/c;->l:Ltb/V$a;

    return-object p0
.end method

.method public static final synthetic z(Lhb/c;Leb/g$a;)V
    .locals 0

    invoke-virtual {p0, p1}, Leb/c;->m(Leb/g$a;)V

    return-void
.end method


# virtual methods
.method public a(Lmb/j;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lhb/c;->C()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lhb/c$i;

    invoke-direct {v1, p0, p1}, Lhb/c$i;-><init>(Lhb/c;Lmb/j;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, Lhb/c$j;->a:Lhb/c$j;

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Lgg/z;
    .locals 2

    iget-object v0, p0, Lhb/c;->n:LHg/a;

    invoke-virtual {v0}, Lgg/s;->P()Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "firstOrError(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c([Ljava/security/cert/Certificate;)V
    .locals 1

    const-string/jumbo v0, "certificates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public connect()Lgg/i;
    .locals 2

    invoke-direct {p0}, Lhb/c;->C()Lgg/i;

    move-result-object v0

    new-instance v1, Lhb/c$b;

    invoke-direct {v1, p0}, Lhb/c$b;-><init>(Lhb/c;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "map(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
