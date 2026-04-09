.class public final synthetic Lcom/ui/wifiman/ui/component/network/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lcom/ui/wifiman/ui/component/network/q$b;

.field public final synthetic c:Lmh/q;

.field public final synthetic d:Lmh/q;

.field public final synthetic e:Lmh/q;

.field public final synthetic f:J

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;Lmh/q;Lmh/q;Lmh/q;JII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/r;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/r;->b:Lcom/ui/wifiman/ui/component/network/q$b;

    iput-object p3, p0, Lcom/ui/wifiman/ui/component/network/r;->c:Lmh/q;

    iput-object p4, p0, Lcom/ui/wifiman/ui/component/network/r;->d:Lmh/q;

    iput-object p5, p0, Lcom/ui/wifiman/ui/component/network/r;->e:Lmh/q;

    iput-wide p6, p0, Lcom/ui/wifiman/ui/component/network/r;->f:J

    iput p8, p0, Lcom/ui/wifiman/ui/component/network/r;->g:I

    iput p9, p0, Lcom/ui/wifiman/ui/component/network/r;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/r;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/r;->b:Lcom/ui/wifiman/ui/component/network/q$b;

    iget-object v2, p0, Lcom/ui/wifiman/ui/component/network/r;->c:Lmh/q;

    iget-object v3, p0, Lcom/ui/wifiman/ui/component/network/r;->d:Lmh/q;

    iget-object v4, p0, Lcom/ui/wifiman/ui/component/network/r;->e:Lmh/q;

    iget-wide v5, p0, Lcom/ui/wifiman/ui/component/network/r;->f:J

    iget v7, p0, Lcom/ui/wifiman/ui/component/network/r;->g:I

    iget v8, p0, Lcom/ui/wifiman/ui/component/network/r;->h:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/ui/wifiman/ui/component/network/B;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;Lmh/q;Lmh/q;Lmh/q;JIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
