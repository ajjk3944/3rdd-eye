.class final LA/p$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/p$b;->a(LB/x;J)LA/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/x;

.field final synthetic b:J

.field final synthetic c:I

.field final synthetic d:I


# direct methods
.method constructor <init>(LB/x;JII)V
    .locals 0

    iput-object p1, p0, LA/p$b$a;->a:LB/x;

    iput-wide p2, p0, LA/p$b$a;->b:J

    iput p4, p0, LA/p$b$a;->c:I

    iput p5, p0, LA/p$b$a;->d:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IILmh/l;)LC0/D;
    .locals 4

    iget-object v0, p0, LA/p$b$a;->a:LB/x;

    iget-wide v1, p0, LA/p$b$a;->b:J

    iget v3, p0, LA/p$b$a;->c:I

    add-int/2addr p1, v3

    invoke-static {v1, v2, p1}, LY0/c;->i(JI)I

    move-result p1

    iget-wide v1, p0, LA/p$b$a;->b:J

    iget v3, p0, LA/p$b$a;->d:I

    add-int/2addr p2, v3

    invoke-static {v1, v2, p2}, LY0/c;->h(JI)I

    move-result p2

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, p1, p2, v1, p3}, Landroidx/compose/ui/layout/m;->v1(IILjava/util/Map;Lmh/l;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lmh/l;

    invoke-virtual {p0, p1, p2, p3}, LA/p$b$a;->a(IILmh/l;)LC0/D;

    move-result-object p1

    return-object p1
.end method
