.class final Lxd/g$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/g$c;->a(Ljava/lang/Boolean;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxd/g;


# direct methods
.method constructor <init>(Lxd/g;)V
    .locals 0

    iput-object p1, p0, Lxd/g$c$a;->a:Lxd/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lxd/g$c$a;->c()V

    return-void
.end method

.method private static final c()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "UISP Controller speedtest reported"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    invoke-virtual {p0, p1}, Lxd/g$c$a;->b(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;)Lgg/D;
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxd/g$c$a;->a:Lxd/g;

    invoke-static {v0}, Lxd/g;->c(Lxd/g;)Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;->c(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;)Lgg/b;

    move-result-object p1

    new-instance v0, Lxd/h;

    invoke-direct {v0}, Lxd/h;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    sget-object v0, Lxd/g$a$a$b;->a:Lxd/g$a$a$b;

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
