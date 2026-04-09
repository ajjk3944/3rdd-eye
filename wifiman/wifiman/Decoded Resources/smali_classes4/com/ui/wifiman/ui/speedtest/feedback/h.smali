.class public final synthetic Lcom/ui/wifiman/ui/speedtest/feedback/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:Ls9/d;

.field public final synthetic d:Lmh/l;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZLs9/d;Lmh/l;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/speedtest/feedback/h;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, Lcom/ui/wifiman/ui/speedtest/feedback/h;->b:Z

    iput-object p3, p0, Lcom/ui/wifiman/ui/speedtest/feedback/h;->c:Ls9/d;

    iput-object p4, p0, Lcom/ui/wifiman/ui/speedtest/feedback/h;->d:Lmh/l;

    iput p5, p0, Lcom/ui/wifiman/ui/speedtest/feedback/h;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/ui/wifiman/ui/speedtest/feedback/h;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, Lcom/ui/wifiman/ui/speedtest/feedback/h;->b:Z

    iget-object v2, p0, Lcom/ui/wifiman/ui/speedtest/feedback/h;->c:Ls9/d;

    iget-object v3, p0, Lcom/ui/wifiman/ui/speedtest/feedback/h;->d:Lmh/l;

    iget v4, p0, Lcom/ui/wifiman/ui/speedtest/feedback/h;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/ui/wifiman/ui/speedtest/feedback/i;->b(Landroidx/compose/ui/e;ZLs9/d;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
