.class public final Li8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/q$a;,
        Li8/q$b;
    }
.end annotation


# static fields
.field public static final h:Li8/q$a;

.field public static final i:I


# instance fields
.field private final a:LP8/f;

.field private final b:Lnc/j;

.field private final c:Lnc/a;

.field private final d:Lcom/ubnt/usurvey/a$b;

.field private final e:Ljava/lang/String;

.field private final f:LHg/d;

.field private final g:Lgg/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li8/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Li8/q;->h:Li8/q$a;

    const/16 v0, 0x8

    sput v0, Li8/q;->i:I

    return-void
.end method

.method public constructor <init>(LP8/f;Lnc/j;Lnc/a;Lcom/ubnt/usurvey/a$b;Ldc/a;)V
    .locals 1

    const-string/jumbo v0, "wmwPopupController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "intentService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "intentFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "appConfigurationManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "buildConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/q;->a:LP8/f;

    iput-object p2, p0, Li8/q;->b:Lnc/j;

    iput-object p3, p0, Li8/q;->c:Lnc/a;

    iput-object p4, p0, Li8/q;->d:Lcom/ubnt/usurvey/a$b;

    invoke-virtual {p5}, Ldc/a;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Li8/q;->e:Ljava/lang/String;

    invoke-static {}, LHg/b;->k1()LHg/b;

    move-result-object p1

    invoke-virtual {p1}, LHg/d;->i1()LHg/d;

    move-result-object p1

    const-string/jumbo p2, "toSerialized(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Li8/q;->f:LHg/d;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object p1

    sget-object p2, Li8/q$c;->a:Li8/q$c;

    invoke-virtual {p1, p2}, Lgg/s;->Q(Lkg/n;)Lgg/s;

    move-result-object p1

    sget-object p2, Li8/q$d;->a:Li8/q$d;

    invoke-virtual {p1, p2}, Lgg/s;->w(Lkg/c;)Lgg/s;

    move-result-object p1

    new-instance p2, Li8/q$e;

    invoke-direct {p2, p0}, Li8/q$e;-><init>(Li8/q;)V

    invoke-virtual {p1, p2}, Lgg/s;->W(Lkg/n;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->r0()LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    const-string/jumbo p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Li8/q;->g:Lgg/s;

    return-void
.end method

.method public static synthetic c(Li8/q;Landroid/net/Uri;Landroid/content/Context;)Li8/a$a;
    .locals 0

    invoke-static {p0, p1, p2}, Li8/q;->l(Li8/q;Landroid/net/Uri;Landroid/content/Context;)Li8/a$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Li8/q;)Lcom/ubnt/usurvey/a$b;
    .locals 0

    iget-object p0, p0, Li8/q;->d:Lcom/ubnt/usurvey/a$b;

    return-object p0
.end method

.method public static final synthetic e(Li8/q;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Li8/q;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic f(Li8/q;)LHg/d;
    .locals 0

    iget-object p0, p0, Li8/q;->f:LHg/d;

    return-object p0
.end method

.method public static final synthetic g(Li8/q;)Lnc/a;
    .locals 0

    iget-object p0, p0, Li8/q;->c:Lnc/a;

    return-object p0
.end method

.method public static final synthetic h(Li8/q;)Lnc/j;
    .locals 0

    iget-object p0, p0, Li8/q;->b:Lnc/j;

    return-object p0
.end method

.method public static final synthetic i(Li8/q;Landroid/net/Uri;)Li8/a$a;
    .locals 0

    invoke-direct {p0, p1}, Li8/q;->k(Landroid/net/Uri;)Li8/a$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Li8/q;Li8/a$b;)Lgg/n;
    .locals 0

    invoke-direct {p0, p1}, Li8/q;->m(Li8/a$b;)Lgg/n;

    move-result-object p0

    return-object p0
.end method

.method private final k(Landroid/net/Uri;)Li8/a$a;
    .locals 2

    new-instance v0, Li8/a$a$a;

    new-instance v1, Li8/p;

    invoke-direct {v1, p0, p1}, Li8/p;-><init>(Li8/q;Landroid/net/Uri;)V

    invoke-direct {v0, v1}, Li8/a$a$a;-><init>(Lmh/l;)V

    return-object v0
.end method

.method private static final l(Li8/q;Landroid/net/Uri;Landroid/content/Context;)Li8/a$a;
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Li8/q;->c:Lnc/a;

    invoke-interface {p2, p1}, Lnc/a;->f(Landroid/net/Uri;)Lmh/l;

    move-result-object v5

    iget-object p0, p0, Li8/q;->b:Lnc/j;

    invoke-interface {p0, v5}, Lnc/j;->a(Lmh/l;)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Li8/a$a$h;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Li8/a$a$h;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    new-instance p0, Li8/a$a$g;

    new-instance p1, Lhc/a;

    new-instance p2, Lec/a$a;

    const v0, 0x7f110325

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {p2, v0, v2}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, p2, v1, v0, v2}, Lhc/a;-><init>(Lec/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, p1}, Li8/a$a$g;-><init>(Lhc/a;)V

    :goto_0
    return-object p0
.end method

.method private final m(Li8/a$b;)Lgg/n;
    .locals 2

    instance-of v0, p1, Li8/a$b$c;

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    if-eqz v0, :cond_0

    new-instance v0, Li8/q$o;

    invoke-direct {v0, p1}, Li8/q$o;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Li8/a$b$i;

    if-eqz v0, :cond_1

    new-instance v0, Li8/q$w;

    invoke-direct {v0, p1}, Li8/q$w;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, Li8/a$b$l;

    if-eqz v0, :cond_2

    new-instance p1, Li8/q$H;

    invoke-direct {p1}, Li8/q$H;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2
    instance-of v0, p1, Li8/j;

    if-eqz v0, :cond_3

    new-instance p1, Li8/q$S;

    invoke-direct {p1}, Li8/q$S;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    instance-of v0, p1, Li8/i;

    if-eqz v0, :cond_4

    new-instance p1, Li8/q$d0;

    invoke-direct {p1}, Li8/q$d0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_4
    instance-of v0, p1, Li8/a$b$A;

    if-eqz v0, :cond_5

    new-instance v0, Li8/q$n0;

    invoke-direct {v0, p1}, Li8/q$n0;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_5
    instance-of v0, p1, Li8/a$b$g;

    if-eqz v0, :cond_6

    new-instance v0, Li8/q$x0;

    invoke-direct {v0, p1}, Li8/q$x0;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    instance-of v0, p1, Li8/a$b$h;

    if-eqz v0, :cond_7

    new-instance v0, Li8/q$B0;

    invoke-direct {v0, p1}, Li8/q$B0;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_7
    instance-of v0, p1, Li8/a$b$j$b;

    if-eqz v0, :cond_8

    new-instance p1, Li8/q$C0;

    invoke-direct {p1}, Li8/q$C0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_8
    instance-of v0, p1, Li8/a$b$j$a;

    if-eqz v0, :cond_9

    new-instance p1, Li8/q$f;

    invoke-direct {p1}, Li8/q$f;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_9
    instance-of v0, p1, Li8/a$b$v$b;

    if-eqz v0, :cond_a

    new-instance p1, Li8/q$g;

    invoke-direct {p1}, Li8/q$g;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_a
    instance-of v0, p1, Li8/a$b$v$a;

    if-eqz v0, :cond_b

    new-instance p1, Li8/q$h;

    invoke-direct {p1}, Li8/q$h;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_b
    instance-of v0, p1, Li8/a$b$J$a;

    if-eqz v0, :cond_c

    new-instance v0, Li8/q$i;

    invoke-direct {v0, p1}, Li8/q$i;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_c
    instance-of v0, p1, Li8/a$b$J$b;

    if-eqz v0, :cond_d

    new-instance p1, Li8/q$j;

    invoke-direct {p1}, Li8/q$j;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_d
    instance-of v0, p1, Li8/a$b$K;

    if-eqz v0, :cond_e

    new-instance v0, Li8/q$k;

    invoke-direct {v0, p1}, Li8/q$k;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_e
    instance-of v0, p1, Li8/a$b$I;

    if-eqz v0, :cond_f

    new-instance v0, Li8/q$l;

    invoke-direct {v0, p1}, Li8/q$l;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_f
    instance-of v0, p1, Li8/a$b$L$a;

    if-eqz v0, :cond_10

    iget-object p1, p0, Li8/q;->a:LP8/f;

    invoke-interface {p1}, LP8/f;->c()Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->d0()Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "toMaybe(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_10
    instance-of v0, p1, Li8/a$b$C;

    if-eqz v0, :cond_11

    new-instance v0, Li8/q$m;

    invoke-direct {v0, p0, p1}, Li8/q$m;-><init>(Li8/q;Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_11
    instance-of v0, p1, Li8/a$b$x;

    if-eqz v0, :cond_12

    new-instance v0, Li8/q$n;

    invoke-direct {v0, p0, p1}, Li8/q$n;-><init>(Li8/q;Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_12
    instance-of v0, p1, Li8/a$b$n;

    if-eqz v0, :cond_13

    new-instance p1, Li8/q$p;

    invoke-direct {p1}, Li8/q$p;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_13
    instance-of v0, p1, Li8/a$b$e$a;

    if-eqz v0, :cond_14

    new-instance v0, Li8/q$q;

    invoke-direct {v0, p1}, Li8/q$q;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_14
    instance-of v0, p1, Li8/o;

    if-eqz v0, :cond_15

    new-instance p1, Li8/q$r;

    invoke-direct {p1, p0}, Li8/q$r;-><init>(Li8/q;)V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_15
    instance-of v0, p1, Li8/h;

    if-eqz v0, :cond_16

    new-instance v0, Li8/q$s;

    invoke-direct {v0, p1}, Li8/q$s;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_16
    instance-of v0, p1, Li8/g;

    if-eqz v0, :cond_17

    new-instance v0, Li8/q$t;

    invoke-direct {v0, p1}, Li8/q$t;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_17
    instance-of v0, p1, Li8/a$b$k$b;

    if-eqz v0, :cond_18

    new-instance v0, Li8/q$u;

    invoke-direct {v0, p1}, Li8/q$u;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_18
    instance-of v0, p1, Li8/a$b$k$c;

    if-eqz v0, :cond_19

    new-instance v0, Li8/q$v;

    invoke-direct {v0, p1}, Li8/q$v;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_19
    instance-of v0, p1, Li8/a$b$k$a;

    if-eqz v0, :cond_1a

    new-instance v0, Li8/q$x;

    invoke-direct {v0, p1}, Li8/q$x;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1a
    instance-of v0, p1, Li8/a$b$p$a;

    if-eqz v0, :cond_1b

    new-instance p1, Li8/q$y;

    invoke-direct {p1}, Li8/q$y;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1b
    instance-of v0, p1, Li8/a$b$p$b;

    if-eqz v0, :cond_1c

    new-instance v0, Li8/q$z;

    invoke-direct {v0, p1}, Li8/q$z;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1c
    instance-of v0, p1, Li8/a$b$z;

    if-eqz v0, :cond_1d

    new-instance p1, Li8/q$A;

    invoke-direct {p1}, Li8/q$A;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1d
    instance-of v0, p1, Li8/a$b$B$c$c;

    if-eqz v0, :cond_1e

    new-instance p1, Li8/q$B;

    invoke-direct {p1}, Li8/q$B;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1e
    instance-of v0, p1, Li8/a$b$B$a;

    if-eqz v0, :cond_1f

    new-instance p1, Li8/q$C;

    invoke-direct {p1}, Li8/q$C;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1f
    instance-of v0, p1, Li8/a$b$B$c$a;

    if-eqz v0, :cond_20

    new-instance v0, Li8/q$D;

    invoke-direct {v0, p1}, Li8/q$D;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_20
    instance-of v0, p1, Li8/a$b$B$c$d;

    if-eqz v0, :cond_21

    new-instance v0, Li8/q$E;

    invoke-direct {v0, p1}, Li8/q$E;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_21
    instance-of v0, p1, Li8/a$b$B$c$b;

    if-eqz v0, :cond_22

    new-instance v0, Li8/q$F;

    invoke-direct {v0, p1}, Li8/q$F;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_22
    instance-of v0, p1, Li8/a$b$B$b$a;

    if-eqz v0, :cond_23

    new-instance v0, Li8/q$G;

    invoke-direct {v0, p1}, Li8/q$G;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_23
    instance-of v0, p1, Li8/a$b$B$b$b;

    if-eqz v0, :cond_24

    new-instance v0, Li8/q$I;

    invoke-direct {v0, p1}, Li8/q$I;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_24
    instance-of v0, p1, Li8/a$b$B$b$c;

    if-eqz v0, :cond_25

    new-instance v0, Li8/q$J;

    invoke-direct {v0, p1}, Li8/q$J;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_25
    instance-of v0, p1, Li8/a$b$B$b$d;

    if-eqz v0, :cond_26

    new-instance p1, Li8/q$K;

    invoke-direct {p1}, Li8/q$K;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_26
    instance-of v0, p1, Li8/a$b$E$d;

    if-eqz v0, :cond_27

    new-instance v0, Li8/q$L;

    invoke-direct {v0, p1}, Li8/q$L;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_27
    instance-of v0, p1, Li8/a$b$E$c;

    if-eqz v0, :cond_28

    new-instance p1, Li8/q$M;

    invoke-direct {p1}, Li8/q$M;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_28
    instance-of v0, p1, Li8/a$b$E$e;

    if-eqz v0, :cond_29

    new-instance v0, Li8/q$N;

    invoke-direct {v0, p1}, Li8/q$N;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_29
    instance-of v0, p1, Li8/a$b$E$a;

    if-eqz v0, :cond_2a

    new-instance v0, Li8/q$O;

    invoke-direct {v0, p1}, Li8/q$O;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2a
    instance-of v0, p1, Li8/a$b$E$b;

    if-eqz v0, :cond_2b

    new-instance v0, Li8/q$P;

    invoke-direct {v0, p1}, Li8/q$P;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2b
    instance-of v0, p1, Li8/a$b$w;

    if-eqz v0, :cond_2c

    new-instance p1, Li8/q$Q;

    invoke-direct {p1}, Li8/q$Q;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2c
    instance-of v0, p1, Li8/c;

    if-eqz v0, :cond_2d

    new-instance p1, Li8/q$R;

    invoke-direct {p1}, Li8/q$R;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2d
    instance-of v0, p1, Li8/f;

    if-eqz v0, :cond_2e

    new-instance p1, Li8/q$T;

    invoke-direct {p1}, Li8/q$T;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2e
    instance-of v0, p1, Li8/b;

    if-eqz v0, :cond_2f

    new-instance p1, Li8/q$U;

    invoke-direct {p1}, Li8/q$U;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2f
    instance-of v0, p1, Li8/d;

    if-eqz v0, :cond_30

    new-instance p1, Li8/q$V;

    invoke-direct {p1}, Li8/q$V;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_30
    instance-of v0, p1, Li8/e;

    if-eqz v0, :cond_31

    new-instance p1, Li8/q$W;

    invoke-direct {p1}, Li8/q$W;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_31
    instance-of v0, p1, Li8/a$b$f$a;

    if-eqz v0, :cond_32

    new-instance p1, Li8/q$X;

    invoke-direct {p1}, Li8/q$X;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_32
    instance-of v0, p1, Li8/a$b$b;

    if-eqz v0, :cond_33

    new-instance p1, Li8/q$Y;

    invoke-direct {p1}, Li8/q$Y;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_33
    instance-of v0, p1, Li8/a$b$q;

    if-eqz v0, :cond_34

    new-instance p1, Li8/q$Z;

    invoke-direct {p1, p0}, Li8/q$Z;-><init>(Li8/q;)V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_34
    instance-of v0, p1, Li8/a$b$F;

    if-eqz v0, :cond_35

    new-instance p1, Li8/q$a0;

    invoke-direct {p1, p0}, Li8/q$a0;-><init>(Li8/q;)V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_35
    instance-of v0, p1, Li8/a$b$a;

    if-eqz v0, :cond_36

    new-instance p1, Li8/q$b0;

    invoke-direct {p1}, Li8/q$b0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_36
    instance-of v0, p1, Li8/a$b$G;

    if-eqz v0, :cond_37

    new-instance p1, Li8/q$c0;

    invoke-direct {p1, p0}, Li8/q$c0;-><init>(Li8/q;)V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_37
    instance-of v0, p1, Li8/a$b$H;

    if-eqz v0, :cond_38

    new-instance p1, Li8/q$e0;

    invoke-direct {p1, p0}, Li8/q$e0;-><init>(Li8/q;)V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_38
    instance-of v0, p1, Li8/a$b$y;

    if-eqz v0, :cond_39

    new-instance v0, Li8/q$f0;

    invoke-direct {v0, p0, p1}, Li8/q$f0;-><init>(Li8/q;Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_39
    instance-of v0, p1, Li8/a$b$t;

    if-eqz v0, :cond_3a

    new-instance v0, Li8/q$g0;

    invoke-direct {v0, p1, p0}, Li8/q$g0;-><init>(Li8/a$b;Li8/q;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3a
    instance-of v0, p1, Li8/a$b$u;

    if-eqz v0, :cond_3b

    new-instance p1, Li8/q$h0;

    invoke-direct {p1}, Li8/q$h0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3b
    instance-of v0, p1, Li8/a$b$s;

    if-eqz v0, :cond_3c

    new-instance p1, Li8/q$i0;

    invoke-direct {p1}, Li8/q$i0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3c
    instance-of v0, p1, Li8/a$b$r;

    if-eqz v0, :cond_3d

    new-instance p1, Li8/q$j0;

    invoke-direct {p1}, Li8/q$j0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3d
    instance-of v0, p1, Li8/a$b$D$d;

    if-eqz v0, :cond_3e

    new-instance v0, Li8/q$k0;

    invoke-direct {v0, p0, p1}, Li8/q$k0;-><init>(Li8/q;Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3e
    instance-of v0, p1, Li8/a$b$D$c;

    if-eqz v0, :cond_3f

    new-instance v0, Li8/q$l0;

    invoke-direct {v0, p0, p1}, Li8/q$l0;-><init>(Li8/q;Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3f
    instance-of v0, p1, Li8/a$b$D$f;

    if-eqz v0, :cond_40

    new-instance v0, Li8/q$m0;

    invoke-direct {v0, p1}, Li8/q$m0;-><init>(Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_40
    instance-of v0, p1, Li8/a$b$D$e;

    if-eqz v0, :cond_41

    new-instance p1, Li8/q$o0;

    invoke-direct {p1}, Li8/q$o0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_41
    instance-of v0, p1, Li8/a$b$D$b;

    if-eqz v0, :cond_42

    new-instance p1, Li8/q$p0;

    invoke-direct {p1}, Li8/q$p0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_42
    instance-of v0, p1, Li8/a$b$D$g;

    if-eqz v0, :cond_43

    new-instance p1, Li8/q$q0;

    invoke-direct {p1}, Li8/q$q0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_43
    instance-of v0, p1, Li8/a$b$D$a;

    if-eqz v0, :cond_44

    new-instance p1, Li8/q$r0;

    invoke-direct {p1, p0}, Li8/q$r0;-><init>(Li8/q;)V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_44
    instance-of v0, p1, Li8/a$b$m;

    if-eqz v0, :cond_45

    new-instance v0, Li8/q$s0;

    invoke-direct {v0, p0, p1}, Li8/q$s0;-><init>(Li8/q;Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_45
    instance-of v0, p1, Li8/a$b$o;

    if-eqz v0, :cond_46

    new-instance v0, Li8/q$t0;

    invoke-direct {v0, p0, p1}, Li8/q$t0;-><init>(Li8/q;Li8/a$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_46
    instance-of v0, p1, Li8/a$b$d$a;

    if-eqz v0, :cond_47

    new-instance p1, Li8/q$u0;

    invoke-direct {p1}, Li8/q$u0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_47
    instance-of v0, p1, Li8/a$b$d$b;

    if-eqz v0, :cond_48

    new-instance p1, Li8/q$v0;

    invoke-direct {p1, p0}, Li8/q$v0;-><init>(Li8/q;)V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_48
    instance-of v0, p1, Li8/l;

    if-eqz v0, :cond_49

    new-instance p1, Li8/q$w0;

    invoke-direct {p1}, Li8/q$w0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_49
    instance-of v0, p1, Li8/m;

    if-eqz v0, :cond_4a

    new-instance p1, Li8/q$y0;

    invoke-direct {p1}, Li8/q$y0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_4a
    instance-of v0, p1, Li8/k;

    if-eqz v0, :cond_4b

    new-instance p1, Li8/q$z0;

    invoke-direct {p1}, Li8/q$z0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_4b
    instance-of p1, p1, Li8/n;

    if-eqz p1, :cond_4c

    new-instance p1, Li8/q$A0;

    invoke-direct {p1}, Li8/q$A0;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_4c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public varargs a([Li8/a$b;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li8/q$O0;

    invoke-direct {v0, p1, p0}, Li8/q$O0;-><init>([Li8/a$b;Li8/q;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Lgg/s;
    .locals 1

    iget-object v0, p0, Li8/q;->g:Lgg/s;

    return-object v0
.end method
