.class public final synthetic LF9/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Lmh/a;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ljava/lang/String;JZLmh/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF9/o0;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LF9/o0;->b:Ljava/lang/String;

    iput-wide p3, p0, LF9/o0;->c:J

    iput-boolean p5, p0, LF9/o0;->d:Z

    iput-object p6, p0, LF9/o0;->e:Lmh/a;

    iput p7, p0, LF9/o0;->f:I

    iput p8, p0, LF9/o0;->g:I

    iput p9, p0, LF9/o0;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, LF9/o0;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LF9/o0;->b:Ljava/lang/String;

    iget-wide v2, p0, LF9/o0;->c:J

    iget-boolean v4, p0, LF9/o0;->d:Z

    iget-object v5, p0, LF9/o0;->e:Lmh/a;

    iget v6, p0, LF9/o0;->f:I

    iget v7, p0, LF9/o0;->g:I

    iget v8, p0, LF9/o0;->h:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, LF9/r0;->c(Landroidx/compose/ui/e;Ljava/lang/String;JZLmh/a;IIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
