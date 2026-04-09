.class public final Lcom/ui/wifiman/ui/teleport/consoles/u$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/consoles/u;->t(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lmh/l;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$e;->a:Lmh/l;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$e;->b:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$e;->a:Lmh/l;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$e;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/teleport/consoles/u$e;->a(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
