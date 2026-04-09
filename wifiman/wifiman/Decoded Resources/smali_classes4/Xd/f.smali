.class public final synthetic LXd/f;
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

    iput-object p1, p0, LXd/f;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LXd/f;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;

    check-cast p1, Ll9/a;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->e(Lcom/ui/wifiman/model/ubiquiti/uisp/b;Ll9/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
