.class public final synthetic LS6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LS6/k;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:Lr0/d;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LS6/k;Landroidx/compose/ui/e;Lr0/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS6/n;->a:LS6/k;

    iput-object p2, p0, LS6/n;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LS6/n;->c:Lr0/d;

    iput p4, p0, LS6/n;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LS6/n;->a:LS6/k;

    iget-object v1, p0, LS6/n;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LS6/n;->c:Lr0/d;

    iget v3, p0, LS6/n;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, LS6/o;->a(LS6/k;Landroidx/compose/ui/e;Lr0/d;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
