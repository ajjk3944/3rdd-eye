.class public final synthetic Lxc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/ui/wifiman/model/bluetooth/classic/a;


# direct methods
.method public synthetic constructor <init>(ILcom/ui/wifiman/model/bluetooth/classic/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lxc/b;->a:I

    iput-object p2, p0, Lxc/b;->b:Lcom/ui/wifiman/model/bluetooth/classic/a;

    return-void
.end method


# virtual methods
.method public final a(Lgg/j;)V
    .locals 2

    iget v0, p0, Lxc/b;->a:I

    iget-object v1, p0, Lxc/b;->b:Lcom/ui/wifiman/model/bluetooth/classic/a;

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/model/bluetooth/classic/a;->b(ILcom/ui/wifiman/model/bluetooth/classic/a;Lgg/j;)V

    return-void
.end method
