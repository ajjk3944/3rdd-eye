.class public final synthetic Lcom/ui/wifiman/ui/component/network/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lmh/l;

.field public final synthetic c:Lmh/l;


# direct methods
.method public synthetic constructor <init>(ILmh/l;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/ui/wifiman/ui/component/network/w;->a:I

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/w;->b:Lmh/l;

    iput-object p3, p0, Lcom/ui/wifiman/ui/component/network/w;->c:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/ui/wifiman/ui/component/network/w;->a:I

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/w;->b:Lmh/l;

    iget-object v2, p0, Lcom/ui/wifiman/ui/component/network/w;->c:Lmh/l;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lcom/ui/wifiman/ui/component/network/B;->e(ILmh/l;Lmh/l;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
