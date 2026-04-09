.class public final synthetic Lcom/ui/wifiman/ui/teleport/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/teleport/d;

.field public final synthetic b:Lof/a$c;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/teleport/d;Lof/a$c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/k;->a:Lcom/ui/wifiman/ui/teleport/d;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/k;->b:Lof/a$c;

    iput p3, p0, Lcom/ui/wifiman/ui/teleport/k;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/k;->a:Lcom/ui/wifiman/ui/teleport/d;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/k;->b:Lof/a$c;

    iget v2, p0, Lcom/ui/wifiman/ui/teleport/k;->c:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/ui/wifiman/ui/teleport/o;->f(Lcom/ui/wifiman/ui/teleport/d;Lof/a$c;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
