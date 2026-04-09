.class public final synthetic LFe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:J

.field public final synthetic c:Lmh/q;

.field public final synthetic d:Z

.field public final synthetic e:F

.field public final synthetic f:Lmh/q;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFe/f;->a:Landroidx/compose/ui/e;

    iput-wide p2, p0, LFe/f;->b:J

    iput-object p4, p0, LFe/f;->c:Lmh/q;

    iput-boolean p5, p0, LFe/f;->d:Z

    iput p6, p0, LFe/f;->e:F

    iput-object p7, p0, LFe/f;->f:Lmh/q;

    iput p8, p0, LFe/f;->g:I

    iput p9, p0, LFe/f;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, LFe/f;->a:Landroidx/compose/ui/e;

    iget-wide v1, p0, LFe/f;->b:J

    iget-object v3, p0, LFe/f;->c:Lmh/q;

    iget-boolean v4, p0, LFe/f;->d:Z

    iget v5, p0, LFe/f;->e:F

    iget-object v6, p0, LFe/f;->f:Lmh/q;

    iget v7, p0, LFe/f;->g:I

    iget v8, p0, LFe/f;->h:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, LFe/g;->a(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
