.class final LB/D$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/D;->a(Ljava/lang/Object;ILB/E;Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:I

.field final synthetic c:LB/E;

.field final synthetic d:Lmh/p;

.field final synthetic e:I


# direct methods
.method constructor <init>(Ljava/lang/Object;ILB/E;Lmh/p;I)V
    .locals 0

    iput-object p1, p0, LB/D$b;->a:Ljava/lang/Object;

    iput p2, p0, LB/D$b;->b:I

    iput-object p3, p0, LB/D$b;->c:LB/E;

    iput-object p4, p0, LB/D$b;->d:Lmh/p;

    iput p5, p0, LB/D$b;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 6

    iget-object v0, p0, LB/D$b;->a:Ljava/lang/Object;

    iget v1, p0, LB/D$b;->b:I

    iget-object v2, p0, LB/D$b;->c:LB/E;

    iget-object v3, p0, LB/D$b;->d:Lmh/p;

    iget p2, p0, LB/D$b;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LB/D;->a(Ljava/lang/Object;ILB/E;Lmh/p;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LB/D$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
