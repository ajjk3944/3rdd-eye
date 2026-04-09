.class final Lcom/ui/wifiman/model/ubiquiti/uisp/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/uisp/b$d;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/uisp/b;Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d$a;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d$a;->b:Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYd/b;)Ll9/a;
    .locals 3

    const-string v0, "authResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYd/b;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ll9/a;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d$a;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d$a;->b:Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LYd/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->i(Lcom/ui/wifiman/model/ubiquiti/uisp/b;Ljava/lang/String;Ljava/lang/String;)LXd/a;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$Error$TokenUnavailable;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$Error$TokenUnavailable;

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYd/b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d$a;->a(LYd/b;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
