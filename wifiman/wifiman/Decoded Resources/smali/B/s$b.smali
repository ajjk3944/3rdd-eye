.class final LB/s$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/s;->a(LB/t;Ljava/lang/Object;ILjava/lang/Object;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/t;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:I


# direct methods
.method constructor <init>(LB/t;Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    iput-object p1, p0, LB/s$b;->a:LB/t;

    iput-object p2, p0, LB/s$b;->b:Ljava/lang/Object;

    iput p3, p0, LB/s$b;->c:I

    iput-object p4, p0, LB/s$b;->d:Ljava/lang/Object;

    iput p5, p0, LB/s$b;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 6

    iget-object v0, p0, LB/s$b;->a:LB/t;

    iget-object v1, p0, LB/s$b;->b:Ljava/lang/Object;

    iget v2, p0, LB/s$b;->c:I

    iget-object v3, p0, LB/s$b;->d:Ljava/lang/Object;

    iget p2, p0, LB/s$b;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LB/s;->b(LB/t;Ljava/lang/Object;ILjava/lang/Object;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LB/s$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
