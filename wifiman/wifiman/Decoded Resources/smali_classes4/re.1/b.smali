.class public final Lre/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a;


# instance fields
.field private final a:Lgg/i;

.field private final b:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;Lje/u;)V
    .locals 2

    const-string v0, "wizard"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiConnectionService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Lje/u;->a()Lgg/i;

    move-result-object p2

    sget-object v0, Lre/b$a;->a:Lre/b$a;

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string v0, "map(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    const-string v0, "distinctUntilChanged(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lre/b;->a:Lgg/i;

    sget-object v0, Lre/b$b;->a:Lre/b$b;

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    new-instance v0, Ll9/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p2

    new-instance v0, Lre/b$c;

    invoke-direct {v0, p1}, Lre/b$c;-><init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;)V

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    new-instance v0, Lre/b$d;

    invoke-direct {v0, p1}, Lre/b$d;-><init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;)V

    invoke-virtual {p2, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lre/b;->b:Lgg/i;

    return-void
.end method


# virtual methods
.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, Lre/b;->b:Lgg/i;

    return-object v0
.end method
