.class public final synthetic LT6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LT6/a;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:LS6/k;

.field public final synthetic e:Lm0/J0;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(LT6/a;Landroidx/compose/ui/e;Ljava/lang/Object;LS6/k;Lm0/J0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT6/c;->a:LT6/a;

    iput-object p2, p0, LT6/c;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LT6/c;->c:Ljava/lang/Object;

    iput-object p4, p0, LT6/c;->d:LS6/k;

    iput-object p5, p0, LT6/c;->e:Lm0/J0;

    iput p6, p0, LT6/c;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LT6/c;->a:LT6/a;

    iget-object v1, p0, LT6/c;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LT6/c;->c:Ljava/lang/Object;

    iget-object v3, p0, LT6/c;->d:LS6/k;

    iget-object v4, p0, LT6/c;->e:Lm0/J0;

    iget v5, p0, LT6/c;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LT6/e;->b(LT6/a;Landroidx/compose/ui/e;Ljava/lang/Object;LS6/k;Lm0/J0;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
