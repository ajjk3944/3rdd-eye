.class final LM/a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/a;->a(LM/j;Lf0/c;Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/j;

.field final synthetic b:Lf0/c;

.field final synthetic c:Lmh/p;

.field final synthetic d:I


# direct methods
.method constructor <init>(LM/j;Lf0/c;Lmh/p;I)V
    .locals 0

    iput-object p1, p0, LM/a$a;->a:LM/j;

    iput-object p2, p0, LM/a$a;->b:Lf0/c;

    iput-object p3, p0, LM/a$a;->c:Lmh/p;

    iput p4, p0, LM/a$a;->d:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 3

    iget-object p2, p0, LM/a$a;->a:LM/j;

    iget-object v0, p0, LM/a$a;->b:Lf0/c;

    iget-object v1, p0, LM/a$a;->c:Lmh/p;

    iget v2, p0, LM/a$a;->d:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, LT/L0;->a(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, LM/a;->a(LM/j;Lf0/c;Lmh/p;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LM/a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
