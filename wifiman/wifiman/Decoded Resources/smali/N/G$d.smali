.class final LN/G$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G;->b(ZLmh/a;Lmh/a;JLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lmh/a;

.field final synthetic c:Lmh/a;

.field final synthetic d:J

.field final synthetic e:I


# direct methods
.method constructor <init>(ZLmh/a;Lmh/a;JI)V
    .locals 0

    iput-boolean p1, p0, LN/G$d;->a:Z

    iput-object p2, p0, LN/G$d;->b:Lmh/a;

    iput-object p3, p0, LN/G$d;->c:Lmh/a;

    iput-wide p4, p0, LN/G$d;->d:J

    iput p6, p0, LN/G$d;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 7

    iget-boolean v0, p0, LN/G$d;->a:Z

    iget-object v1, p0, LN/G$d;->b:Lmh/a;

    iget-object v2, p0, LN/G$d;->c:Lmh/a;

    iget-wide v3, p0, LN/G$d;->d:J

    iget p2, p0, LN/G$d;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v6

    move-object v5, p1

    invoke-static/range {v0 .. v6}, LN/G;->c(ZLmh/a;Lmh/a;JLT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/G$d;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
