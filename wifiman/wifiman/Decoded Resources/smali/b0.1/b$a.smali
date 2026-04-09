.class final Lb0/b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb0/b;->b(Ljava/lang/Object;LT/l;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb0/b;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lb0/b;Ljava/lang/Object;I)V
    .locals 0

    iput-object p1, p0, Lb0/b$a;->a:Lb0/b;

    iput-object p2, p0, Lb0/b$a;->b:Ljava/lang/Object;

    iput p3, p0, Lb0/b$a;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 2

    iget-object p2, p0, Lb0/b$a;->a:Lb0/b;

    iget-object v0, p0, Lb0/b$a;->b:Ljava/lang/Object;

    iget v1, p0, Lb0/b$a;->c:I

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v1

    or-int/lit8 v1, v1, 0x1

    invoke-virtual {p2, v0, p1, v1}, Lb0/b;->b(Ljava/lang/Object;LT/l;I)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lb0/b$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
