.class public final synthetic LTe/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;JZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTe/c;->a:Landroidx/compose/ui/e;

    iput-wide p2, p0, LTe/c;->b:J

    iput-boolean p4, p0, LTe/c;->c:Z

    iput p5, p0, LTe/c;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LTe/c;->a:Landroidx/compose/ui/e;

    iget-wide v1, p0, LTe/c;->b:J

    iget-boolean v3, p0, LTe/c;->c:Z

    iget v4, p0, LTe/c;->d:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LTe/e;->a(Landroidx/compose/ui/e;JZILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
