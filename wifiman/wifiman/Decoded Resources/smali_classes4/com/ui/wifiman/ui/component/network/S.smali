.class public final synthetic Lcom/ui/wifiman/ui/component/network/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/b;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lmh/a;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/b;JJLjava/lang/String;Lmh/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/S;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/S;->b:Ls9/b;

    iput-wide p3, p0, Lcom/ui/wifiman/ui/component/network/S;->c:J

    iput-wide p5, p0, Lcom/ui/wifiman/ui/component/network/S;->d:J

    iput-object p7, p0, Lcom/ui/wifiman/ui/component/network/S;->e:Ljava/lang/String;

    iput-object p8, p0, Lcom/ui/wifiman/ui/component/network/S;->f:Lmh/a;

    iput p9, p0, Lcom/ui/wifiman/ui/component/network/S;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/S;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/S;->b:Ls9/b;

    iget-wide v2, p0, Lcom/ui/wifiman/ui/component/network/S;->c:J

    iget-wide v4, p0, Lcom/ui/wifiman/ui/component/network/S;->d:J

    iget-object v6, p0, Lcom/ui/wifiman/ui/component/network/S;->e:Ljava/lang/String;

    iget-object v7, p0, Lcom/ui/wifiman/ui/component/network/S;->f:Lmh/a;

    iget v8, p0, Lcom/ui/wifiman/ui/component/network/S;->g:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/ui/wifiman/ui/component/network/X;->b(Landroidx/compose/ui/e;Ls9/b;JJLjava/lang/String;Lmh/a;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
