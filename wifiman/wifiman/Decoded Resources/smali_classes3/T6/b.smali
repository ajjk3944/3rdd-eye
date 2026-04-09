.class public final synthetic LT6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LT6/a;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:LS6/k;

.field public final synthetic d:Ljava/lang/Throwable;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(LT6/a;Landroidx/compose/ui/e;LS6/k;Ljava/lang/Throwable;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT6/b;->a:LT6/a;

    iput-object p2, p0, LT6/b;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LT6/b;->c:LS6/k;

    iput-object p4, p0, LT6/b;->d:Ljava/lang/Throwable;

    iput p5, p0, LT6/b;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LT6/b;->a:LT6/a;

    iget-object v1, p0, LT6/b;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LT6/b;->c:LS6/k;

    iget-object v3, p0, LT6/b;->d:Ljava/lang/Throwable;

    iget v4, p0, LT6/b;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LT6/e;->a(LT6/a;Landroidx/compose/ui/e;LS6/k;Ljava/lang/Throwable;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
