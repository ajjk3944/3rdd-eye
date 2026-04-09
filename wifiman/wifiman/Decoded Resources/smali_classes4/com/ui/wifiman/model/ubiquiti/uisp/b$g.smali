.class final Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/uisp/b;->c(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/uisp/b$g$b;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;->c()V

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

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;->b(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(LYg/s;)Lgg/f;
    .locals 14

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll9/a;

    invoke-virtual {v0}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, LXd/a;

    new-instance v11, LYd/e;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;->d()Linet/ipaddr/g;

    move-result-object v1

    const/4 v12, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, v12

    :goto_0
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;->a()Ljava/lang/Long;

    move-result-object v4

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;->g()Ljava/lang/Long;

    move-result-object v5

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;->f()Lpd/s;

    move-result-object v1

    sget-object v6, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v6, v1

    const/4 v6, 0x1

    const/4 v13, 0x2

    if-eq v1, v6, :cond_3

    if-eq v1, v13, :cond_2

    const/4 v6, 0x3

    if-eq v1, v6, :cond_2

    const/4 v6, 0x4

    if-ne v1, v6, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_1
    sget-object v1, LYd/e$a;->LOCAL_DEVICE:LYd/e$a;

    goto :goto_2

    :cond_3
    sget-object v1, LYd/e$a;->INTERNET:LYd/e$a;

    :goto_2
    invoke-virtual {v1}, LYd/e$a;->getApiId()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;->e()Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;->b()Ljava/lang/Long;

    move-result-object v8

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;->h()Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {p1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;->b()Ljava/lang/String;

    move-result-object p1

    move-object v10, p1

    goto :goto_3

    :cond_4
    move-object v10, v12

    :goto_3
    move-object v1, v11

    invoke-direct/range {v1 .. v10}, LYd/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UISP Controller speedtest report: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v12, v13, v12}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface {v0, v11}, LXd/a;->b(LYd/e;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/uisp/c;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/c;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g$a;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b$g$a;

    invoke-virtual {p1, v0}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    goto :goto_4

    :cond_5
    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$Error$ControllerApiUnavailable;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$Error$ControllerApiUnavailable;

    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_4
    return-object p1
.end method
