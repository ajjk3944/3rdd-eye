.class public final synthetic LC9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LC9/i;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Lmh/a;

.field public final synthetic f:Lmh/q;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LC9/i;JJLmh/a;Lmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/j;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LC9/j;->b:LC9/i;

    iput-wide p3, p0, LC9/j;->c:J

    iput-wide p5, p0, LC9/j;->d:J

    iput-object p7, p0, LC9/j;->e:Lmh/a;

    iput-object p8, p0, LC9/j;->f:Lmh/q;

    iput p9, p0, LC9/j;->g:I

    iput p10, p0, LC9/j;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, LC9/j;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LC9/j;->b:LC9/i;

    iget-wide v2, p0, LC9/j;->c:J

    iget-wide v4, p0, LC9/j;->d:J

    iget-object v6, p0, LC9/j;->e:Lmh/a;

    iget-object v7, p0, LC9/j;->f:Lmh/q;

    iget v8, p0, LC9/j;->g:I

    iget v9, p0, LC9/j;->h:I

    move-object v10, p1

    check-cast v10, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, LC9/s;->g(Landroidx/compose/ui/e;LC9/i;JJLmh/a;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
