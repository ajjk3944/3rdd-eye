.class final LO/c$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO/c;->d(ZLO/g;Landroidx/compose/ui/e;JJZLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:LO/g;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:J

.field final synthetic e:J

.field final synthetic f:Z

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(ZLO/g;Landroidx/compose/ui/e;JJZII)V
    .locals 0

    iput-boolean p1, p0, LO/c$f;->a:Z

    iput-object p2, p0, LO/c$f;->b:LO/g;

    iput-object p3, p0, LO/c$f;->c:Landroidx/compose/ui/e;

    iput-wide p4, p0, LO/c$f;->d:J

    iput-wide p6, p0, LO/c$f;->e:J

    iput-boolean p8, p0, LO/c$f;->f:Z

    iput p9, p0, LO/c$f;->g:I

    iput p10, p0, LO/c$f;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 11

    iget-boolean v0, p0, LO/c$f;->a:Z

    iget-object v1, p0, LO/c$f;->b:LO/g;

    iget-object v2, p0, LO/c$f;->c:Landroidx/compose/ui/e;

    iget-wide v3, p0, LO/c$f;->d:J

    iget-wide v5, p0, LO/c$f;->e:J

    iget-boolean v7, p0, LO/c$f;->f:Z

    iget p2, p0, LO/c$f;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v9

    iget v10, p0, LO/c$f;->h:I

    move-object v8, p1

    invoke-static/range {v0 .. v10}, LO/c;->d(ZLO/g;Landroidx/compose/ui/e;JJZLT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LO/c$f;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
