.class public final synthetic LXd/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/ubiquiti/uisp/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXd/h;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LXd/h;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;

    check-cast p1, LYd/d;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->g(Lcom/ui/wifiman/model/ubiquiti/uisp/b;LYd/d;)Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    move-result-object p1

    return-object p1
.end method
