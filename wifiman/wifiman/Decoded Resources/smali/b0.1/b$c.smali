.class final Lb0/b$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb0/b;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LT/l;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb0/b;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lb0/b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput-object p1, p0, Lb0/b$c;->a:Lb0/b;

    iput-object p2, p0, Lb0/b$c;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb0/b$c;->c:Ljava/lang/Object;

    iput-object p4, p0, Lb0/b$c;->d:Ljava/lang/Object;

    iput p5, p0, Lb0/b$c;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 6

    iget-object v0, p0, Lb0/b$c;->a:Lb0/b;

    iget-object v1, p0, Lb0/b$c;->b:Ljava/lang/Object;

    iget-object v2, p0, Lb0/b$c;->c:Ljava/lang/Object;

    iget-object v3, p0, Lb0/b$c;->d:Ljava/lang/Object;

    iget p2, p0, Lb0/b$c;->e:I

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    or-int/lit8 v5, p2, 0x1

    move-object v4, p1

    invoke-virtual/range {v0 .. v5}, Lb0/b;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LT/l;I)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lb0/b$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
