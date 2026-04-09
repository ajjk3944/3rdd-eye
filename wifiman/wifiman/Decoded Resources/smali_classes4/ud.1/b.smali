.class public final Lud/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud/a;


# instance fields
.field private final a:Lje/u;


# direct methods
.method public constructor <init>(Lje/u;)V
    .locals 1

    const-string v0, "wifiConnectionService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud/b;->a:Lje/u;

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 3

    iget-object v0, p0, Lud/b;->a:Lje/u;

    invoke-interface {v0}, Lje/u;->a()Lgg/i;

    move-result-object v0

    sget-object v1, Lud/b$a;->a:Lud/b$a;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v1, LW7/b;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, LW7/b;-><init>(LW7/a;LW7/a;)V

    sget-object v2, Lud/b$b;->a:Lud/b$b;

    invoke-virtual {v0, v1, v2}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    const-string v1, "distinctUntilChanged(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
