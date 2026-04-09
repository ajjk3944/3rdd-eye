.class final LN/a0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a0;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr0/d;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:J

.field final synthetic e:I

.field final synthetic f:I


# direct methods
.method constructor <init>(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;JII)V
    .locals 0

    iput-object p1, p0, LN/a0$a;->a:Lr0/d;

    iput-object p2, p0, LN/a0$a;->b:Ljava/lang/String;

    iput-object p3, p0, LN/a0$a;->c:Landroidx/compose/ui/e;

    iput-wide p4, p0, LN/a0$a;->d:J

    iput p6, p0, LN/a0$a;->e:I

    iput p7, p0, LN/a0$a;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

    iget-object v0, p0, LN/a0$a;->a:Lr0/d;

    iget-object v1, p0, LN/a0$a;->b:Ljava/lang/String;

    iget-object v2, p0, LN/a0$a;->c:Landroidx/compose/ui/e;

    iget-wide v3, p0, LN/a0$a;->d:J

    iget p2, p0, LN/a0$a;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v6

    iget v7, p0, LN/a0$a;->f:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LN/a0;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/a0$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
