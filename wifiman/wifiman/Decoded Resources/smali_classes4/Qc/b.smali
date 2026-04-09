.class public final LQc/b;
.super LQc/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQc/b$a;
    }
.end annotation


# static fields
.field public static final h:LQc/b$a;


# instance fields
.field private final d:LCd/j$a;

.field private final e:Lgg/y;

.field private final f:Ljava/lang/String;

.field private final g:LDc/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQc/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQc/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQc/b;->h:LQc/b$a;

    return-void
.end method

.method public constructor <init>(LQc/a$a;LCd/j$a;Lgg/y;)V
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localSpeedtestAvailabilityChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LQc/a;-><init>()V

    iput-object p2, p0, LQc/b;->d:LCd/j$a;

    iput-object p3, p0, LQc/b;->e:Lgg/y;

    const-string p2, "UbntHttpSt"

    iput-object p2, p0, LQc/b;->f:Ljava/lang/String;

    invoke-virtual {p1}, LQc/a$a;->a()LDc/k;

    move-result-object p1

    iput-object p1, p0, LQc/b;->g:LDc/k;

    return-void
.end method


# virtual methods
.method public h()LDc/k;
    .locals 1

    iget-object v0, p0, LQc/b;->g:LDc/k;

    return-object v0
.end method

.method protected i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LQc/b;->f:Ljava/lang/String;

    return-object v0
.end method

.method protected k()Lgg/y;
    .locals 1

    iget-object v0, p0, LQc/b;->e:Lgg/y;

    return-object v0
.end method

.method protected m(Linet/ipaddr/g;)Lgg/z;
    .locals 3

    const-string v0, "ip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQc/b;->d:LCd/j$a;

    const-wide/16 v1, 0x1f4

    invoke-interface {v0, p1, v1, v2}, LCd/j$a;->a(Linet/ipaddr/g;J)Lgg/z;

    move-result-object v0

    new-instance v1, LQc/b$b;

    invoke-direct {v1, p1}, LQc/b$b;-><init>(Linet/ipaddr/g;)V

    invoke-virtual {v0, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, LQc/b$c;

    invoke-direct {v1, p1}, LQc/b$c;-><init>(Linet/ipaddr/g;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
