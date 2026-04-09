.class final LN/m0$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/m0;->c(JLmh/a;ZLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lmh/a;

.field final synthetic c:Z

.field final synthetic d:I


# direct methods
.method constructor <init>(JLmh/a;ZI)V
    .locals 0

    iput-wide p1, p0, LN/m0$g;->a:J

    iput-object p3, p0, LN/m0$g;->b:Lmh/a;

    iput-boolean p4, p0, LN/m0$g;->c:Z

    iput p5, p0, LN/m0$g;->d:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 6

    iget-wide v0, p0, LN/m0$g;->a:J

    iget-object v2, p0, LN/m0$g;->b:Lmh/a;

    iget-boolean v3, p0, LN/m0$g;->c:Z

    iget p2, p0, LN/m0$g;->d:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LN/m0;->e(JLmh/a;ZLT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/m0$g;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
