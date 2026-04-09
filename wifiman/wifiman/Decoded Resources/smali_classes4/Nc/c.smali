.class public final LNc/c;
.super LNc/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNc/c$a;
    }
.end annotation


# static fields
.field public static final h:LNc/c$a;


# instance fields
.field private final d:LNc/a;

.field private final e:Lgg/y;

.field private final f:Ljava/lang/String;

.field private final g:LDc/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LNc/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LNc/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LNc/c;->h:LNc/c$a;

    return-void
.end method

.method public constructor <init>(LNc/b$a;LNc/a;Lgg/y;)V
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "netbios"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LNc/b;-><init>()V

    iput-object p2, p0, LNc/c;->d:LNc/a;

    iput-object p3, p0, LNc/c;->e:Lgg/y;

    const-string p2, "Netbios"

    iput-object p2, p0, LNc/c;->f:Ljava/lang/String;

    invoke-virtual {p1}, LNc/b$a;->a()LDc/k;

    move-result-object p1

    iput-object p1, p0, LNc/c;->g:LDc/k;

    return-void
.end method


# virtual methods
.method public h()LDc/k;
    .locals 1

    iget-object v0, p0, LNc/c;->g:LDc/k;

    return-object v0
.end method

.method protected i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LNc/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method protected k()Lgg/y;
    .locals 1

    iget-object v0, p0, LNc/c;->e:Lgg/y;

    return-object v0
.end method

.method protected m(Linet/ipaddr/g;)Lgg/z;
    .locals 3

    const-string v0, "ip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNc/c;->d:LNc/a;

    const-wide/16 v1, 0x1f4

    invoke-interface {v0, p1, v1, v2}, LNc/a;->a(Linet/ipaddr/g;J)Lgg/z;

    move-result-object v0

    new-instance v1, LNc/c$b;

    invoke-direct {v1, p1}, LNc/c$b;-><init>(Linet/ipaddr/g;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
