.class public final synthetic Lta/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ls9/b;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:Lm0/v0;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lta/b;->a:Ls9/b;

    iput-object p2, p0, Lta/b;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, Lta/b;->c:Lm0/v0;

    iput-object p4, p0, Lta/b;->d:Ljava/lang/String;

    iput p5, p0, Lta/b;->e:I

    iput p6, p0, Lta/b;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lta/b;->a:Ls9/b;

    iget-object v1, p0, Lta/b;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, Lta/b;->c:Lm0/v0;

    iget-object v3, p0, Lta/b;->d:Ljava/lang/String;

    iget v4, p0, Lta/b;->e:I

    iget v5, p0, Lta/b;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lta/c;->b(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
