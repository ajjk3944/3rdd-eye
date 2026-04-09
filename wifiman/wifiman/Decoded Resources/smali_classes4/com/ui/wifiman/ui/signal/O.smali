.class public final synthetic Lcom/ui/wifiman/ui/signal/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lcom/ui/wifiman/ui/signal/e;

.field public final synthetic c:Lof/a$c;

.field public final synthetic d:Lcom/ui/wifiman/ui/component/network/c$b;

.field public final synthetic e:Lcom/ui/wifiman/ui/signal/N;

.field public final synthetic f:Lcom/ui/wifiman/ui/signal/m;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/O;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/O;->b:Lcom/ui/wifiman/ui/signal/e;

    iput-object p3, p0, Lcom/ui/wifiman/ui/signal/O;->c:Lof/a$c;

    iput-object p4, p0, Lcom/ui/wifiman/ui/signal/O;->d:Lcom/ui/wifiman/ui/component/network/c$b;

    iput-object p5, p0, Lcom/ui/wifiman/ui/signal/O;->e:Lcom/ui/wifiman/ui/signal/N;

    iput-object p6, p0, Lcom/ui/wifiman/ui/signal/O;->f:Lcom/ui/wifiman/ui/signal/m;

    iput p7, p0, Lcom/ui/wifiman/ui/signal/O;->g:I

    iput p8, p0, Lcom/ui/wifiman/ui/signal/O;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/O;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/O;->b:Lcom/ui/wifiman/ui/signal/e;

    iget-object v2, p0, Lcom/ui/wifiman/ui/signal/O;->c:Lof/a$c;

    iget-object v3, p0, Lcom/ui/wifiman/ui/signal/O;->d:Lcom/ui/wifiman/ui/component/network/c$b;

    iget-object v4, p0, Lcom/ui/wifiman/ui/signal/O;->e:Lcom/ui/wifiman/ui/signal/N;

    iget-object v5, p0, Lcom/ui/wifiman/ui/signal/O;->f:Lcom/ui/wifiman/ui/signal/m;

    iget v6, p0, Lcom/ui/wifiman/ui/signal/O;->g:I

    iget v7, p0, Lcom/ui/wifiman/ui/signal/O;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/ui/wifiman/ui/signal/P;->a(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
