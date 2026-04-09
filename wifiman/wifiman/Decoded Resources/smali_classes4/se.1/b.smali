.class public final Lse/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lse/a;


# instance fields
.field private final a:Lgg/i;

.field private final b:Lgg/i;


# direct methods
.method public constructor <init>(LWd/f;Lcom/ubnt/usurvey/a$b;)V
    .locals 1

    const-string v0, "fwService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appConfigurationManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Lcom/ubnt/usurvey/a$b;->b()Lgg/i;

    move-result-object p2

    sget-object v0, Lse/b$d;->a:Lse/b$d;

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    const-string v0, "distinctUntilChanged(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lse/b;->a:Lgg/i;

    sget-object v0, LAg/c;->a:LAg/c;

    invoke-interface {p1}, LWd/f;->getClient()Lgg/i;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    sget-object p2, Lse/b$a;->a:Lse/b$a;

    invoke-virtual {p1, p2}, Lgg/i;->N1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p2, Lse/b$b;->a:Lse/b$b;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p2, Lse/b$c;->a:Lse/b$c;

    invoke-virtual {p1, p2}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "onErrorResumeNext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lse/b;->b:Lgg/i;

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lse/b;->b:Lgg/i;

    return-object v0
.end method
