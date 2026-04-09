.class final LM/a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/a;->b(LM/j;ZLW0/i;ZJLandroidx/compose/ui/e;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/j;

.field final synthetic b:Z

.field final synthetic c:LW0/i;

.field final synthetic d:Z

.field final synthetic e:J

.field final synthetic f:Landroidx/compose/ui/e;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(LM/j;ZLW0/i;ZJLandroidx/compose/ui/e;II)V
    .locals 0

    iput-object p1, p0, LM/a$c;->a:LM/j;

    iput-boolean p2, p0, LM/a$c;->b:Z

    iput-object p3, p0, LM/a$c;->c:LW0/i;

    iput-boolean p4, p0, LM/a$c;->d:Z

    iput-wide p5, p0, LM/a$c;->e:J

    iput-object p7, p0, LM/a$c;->f:Landroidx/compose/ui/e;

    iput p8, p0, LM/a$c;->g:I

    iput p9, p0, LM/a$c;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    iget-object v0, p0, LM/a$c;->a:LM/j;

    iget-boolean v1, p0, LM/a$c;->b:Z

    iget-object v2, p0, LM/a$c;->c:LW0/i;

    iget-boolean v3, p0, LM/a$c;->d:Z

    iget-wide v4, p0, LM/a$c;->e:J

    iget-object v6, p0, LM/a$c;->f:Landroidx/compose/ui/e;

    iget p2, p0, LM/a$c;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v8

    iget v9, p0, LM/a$c;->h:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, LM/a;->b(LM/j;ZLW0/i;ZJLandroidx/compose/ui/e;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LM/a$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
