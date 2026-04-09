.class public final synthetic LHe/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lof/a$c;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lof/a$c;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHe/j;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LHe/j;->b:Lof/a$c;

    iput p3, p0, LHe/j;->c:I

    iput p4, p0, LHe/j;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LHe/j;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LHe/j;->b:Lof/a$c;

    iget v2, p0, LHe/j;->c:I

    iget v3, p0, LHe/j;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, LHe/k;->a(Landroidx/compose/ui/e;Lof/a$c;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
