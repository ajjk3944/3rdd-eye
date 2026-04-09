.class public final Li8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxe/f;


# instance fields
.field private final a:Li8/s$d;

.field private final b:Lcom/ubnt/usurvey/ui/teleport/deeplink/a;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:LLi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Li8/a;Li8/s$d;Lcom/ubnt/usurvey/ui/teleport/deeplink/a;LN8/a;)V
    .locals 1

    const-string/jumbo v0, "viewRouter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deepLinkProcessor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deepLinkConsoleConnectProcessor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wizardManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Li8/r;->a:Li8/s$d;

    iput-object p3, p0, Li8/r;->b:Lcom/ubnt/usurvey/ui/teleport/deeplink/a;

    invoke-interface {p4}, LN8/a;->getState()Lgg/i;

    move-result-object p2

    sget-object p3, Li8/r$d;->a:Li8/r$d;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    sget-object p3, Li8/r$e;->a:Li8/r$e;

    invoke-virtual {p2, p3}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string/jumbo p3, "flatMapMaybe(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Li8/r;->c:Lgg/i;

    invoke-interface {p4}, LN8/a;->getState()Lgg/i;

    move-result-object p3

    sget-object p4, Li8/r$a;->a:Li8/r$a;

    invoke-virtual {p3, p4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    new-instance p4, Li8/r$b;

    invoke-direct {p4, p0}, Li8/r$b;-><init>(Li8/r;)V

    invoke-virtual {p3, p4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p3

    const-string/jumbo p4, "switchMap(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Li8/r;->d:Lgg/i;

    invoke-interface {p1}, Li8/a;->b()Lgg/s;

    move-result-object p1

    sget-object p4, Li8/r$c;->a:Li8/r$c;

    invoke-virtual {p1, p4}, Lgg/s;->W(Lkg/n;)Lgg/s;

    move-result-object p1

    sget-object p4, Lgg/a;->BUFFER:Lgg/a;

    invoke-virtual {p1, p4}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object p1

    const-string/jumbo p4, "toFlowable(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Li8/r;->e:Lgg/i;

    invoke-static {p2, p1, p3}, Lgg/i;->R0(LDj/a;LDj/a;LDj/a;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "merge(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LPi/e;->a(LDj/a;)LLi/g;

    move-result-object p1

    iput-object p1, p0, Li8/r;->f:LLi/g;

    return-void
.end method

.method public static final synthetic b(Li8/r;)Lcom/ubnt/usurvey/ui/teleport/deeplink/a;
    .locals 0

    iget-object p0, p0, Li8/r;->b:Lcom/ubnt/usurvey/ui/teleport/deeplink/a;

    return-object p0
.end method

.method public static final synthetic c(Li8/r;)Li8/s$d;
    .locals 0

    iget-object p0, p0, Li8/r;->a:Li8/s$d;

    return-object p0
.end method


# virtual methods
.method public a()LLi/g;
    .locals 1

    iget-object v0, p0, Li8/r;->f:LLi/g;

    return-object v0
.end method
