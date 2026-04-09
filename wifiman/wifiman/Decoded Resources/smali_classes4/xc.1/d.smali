.class public final synthetic Lxc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/N;

.field public final synthetic b:Lcom/ui/wifiman/model/bluetooth/classic/a;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/N;Lcom/ui/wifiman/model/bluetooth/classic/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxc/d;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Lxc/d;->b:Lcom/ui/wifiman/model/bluetooth/classic/a;

    iput p3, p0, Lxc/d;->c:I

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    iget-object v0, p0, Lxc/d;->a:Lkotlin/jvm/internal/N;

    iget-object v1, p0, Lxc/d;->b:Lcom/ui/wifiman/model/bluetooth/classic/a;

    iget v2, p0, Lxc/d;->c:I

    invoke-static {v0, v1, v2}, Lcom/ui/wifiman/model/bluetooth/classic/a;->e(Lkotlin/jvm/internal/N;Lcom/ui/wifiman/model/bluetooth/classic/a;I)V

    return-void
.end method
