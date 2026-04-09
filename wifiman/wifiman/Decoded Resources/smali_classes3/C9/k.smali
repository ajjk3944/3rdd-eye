.class public final synthetic LC9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Lmh/q;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;JZLmh/a;Lmh/q;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/k;->a:Landroidx/compose/ui/e;

    iput-wide p2, p0, LC9/k;->b:J

    iput-boolean p4, p0, LC9/k;->c:Z

    iput-object p5, p0, LC9/k;->d:Lmh/a;

    iput-object p6, p0, LC9/k;->e:Lmh/q;

    iput p7, p0, LC9/k;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LC9/k;->a:Landroidx/compose/ui/e;

    iget-wide v1, p0, LC9/k;->b:J

    iget-boolean v3, p0, LC9/k;->c:Z

    iget-object v4, p0, LC9/k;->d:Lmh/a;

    iget-object v5, p0, LC9/k;->e:Lmh/q;

    iget v6, p0, LC9/k;->f:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LC9/s;->d(Landroidx/compose/ui/e;JZLmh/a;Lmh/q;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
